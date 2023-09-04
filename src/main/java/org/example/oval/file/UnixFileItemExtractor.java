package org.example.oval.file;

import org.example.oval.OvalEntityMapping;
import org.example.oval.OvalItemExtractor;
import org.example.oval.OvalSimpleBaseTypeConverter;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5.Set;
import org.mitre.oval.xmlschema.oval_definitions_5.TestType;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.FileObject;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.FileTest;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.*;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.FileItem;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class UnixFileItemExtractor implements OvalItemExtractor {
    private static final String basePath = new File("").getAbsolutePath();
    private FileObject fileObject;
    private OvalEntityMapping ovalEntityMapping;
    private OvalSimpleBaseTypeConverter baseTypeConverter;

    public UnixFileItemExtractor(ObjectType inputObject, OvalEntityMapping ovalEntityMapping) throws Exception {
        if (inputObject == null)
            throw new Exception("input file object is not null. object id : " + fileObject.getId());
        if (!inputObject.getClass().equals(FileObject.class))
            throw new Exception("input file object is notc file_object. object id : " + fileObject.getId());
        baseTypeConverter = new OvalSimpleBaseTypeConverter(ovalEntityMapping);
        fileObject = (FileObject) inputObject;
        this.ovalEntityMapping = ovalEntityMapping;

    }

    @Override
    public List<ItemType> extract() throws Exception {
        boolean setExist = fileObject.getSet() != null;
        boolean filepathExist = fileObject.getFilepath() != null;
        boolean pathExist = fileObject.getFilename() != null || fileObject.getPath() != null;
        if (setExist && (filepathExist || pathExist))
            throw new Exception("fileObject has set and path. object id : " + fileObject.getId());
        if (!setExist && !filepathExist && !pathExist)
            throw new Exception("fileObject has set and path. object id : " + fileObject.getId());
        if (filepathExist && pathExist)
            throw new Exception("fileObject has filepath and path. object id. object id : " + fileObject.getId());
        if (setExist)
            return findFilesBySet(fileObject.getSet());
        else if (filepathExist)
            return findFilesByFilepath(fileObject.getFilepath());
        else
            return findFilesByPath(fileObject.getPath(), fileObject.getFilename());
    }

    private List<ItemType> findFilesByPath(EntityObjectStringType pathEntity,
                                           JAXBElement<EntityObjectStringType> filenameEntity) throws Exception {
        List<File> dirs = new ArrayList<>();
        List<String> paths = baseTypeConverter.convert(pathEntity).stream()
                .map(item -> item.toString()).collect(Collectors.toList());
        switch (pathEntity.getOperation()) {
            case EQUALS:
                paths.forEach(dirPath -> {
                    File dir = new File(dirPath);
                    if (dir.exists() && dir.isDirectory())
                        dirs.add(dir);
                });
                break;
            case CASE_INSENSITIVE_EQUALS:
                FileFinder.findDown(new File(basePath), file -> {
                    if (!file.isDirectory())
                        return;
                    String absolutePath = file.getAbsolutePath();
                    for (String p : paths)
                        if (absolutePath.equalsIgnoreCase(p))
                            dirs.add(file);
                });
                break;
            case PATTERN_MATCH:
                List<Pattern> patterns = new ArrayList<>();
                for (String p : paths)
                    patterns.add(Pattern.compile(p));
                FileFinder.findDown(new File(basePath), file -> {
                    if (!file.isDirectory())
                        return;
                    for (Pattern pattern : patterns)
                        if (pattern.matcher(file.getAbsolutePath()).find())
                            dirs.add(file);
                });
                break;
            default:
                break;
        }

        java.util.Set<String> filenames = baseTypeConverter.convert(filenameEntity.getValue()).stream()
                .map(item -> item.toString()).collect(Collectors.toSet());
        List<ItemType> fileItems = new ArrayList<>();
        for (File dir : dirs) {
            for (File file : dir.listFiles()) {
                if (file.isDirectory())
                    continue;
                switch (filenameEntity.getValue().getOperation()) {
                    case EQUALS:
                        if (filenames.contains(file.getName()))
                            fileItems.add(toFileItem(file));
                        break;
                    case CASE_INSENSITIVE_EQUALS:
                        for (String filename : filenames) {
                            if (filename.equalsIgnoreCase(file.getName()))
                                fileItems.add(toFileItem(file));
                        }
                        break;
                    case PATTERN_MATCH:
                        for (String pattern : filenames) {
                            if (Pattern.compile(pattern).matcher(file.getName()).find())
                                fileItems.add(toFileItem(file));
                        }
                        break;
                }
            }
        }
        return fileItems;
    }

    private List<ItemType> findFilesByFilepath(EntityObjectStringType filepathEntity) throws Exception {
        List<String> paths = baseTypeConverter.convert(filepathEntity).stream()
                .map(item -> item.toString()).collect(Collectors.toList());
        List<File> files = new ArrayList<>();
        switch (filepathEntity.getOperation()) {
            case EQUALS:
                for (String filepath : paths) {
                    File file = new File(filepath);
                    if (file.exists() && file.isFile())
                        files.add(file);
                }
                break;
            case CASE_INSENSITIVE_EQUALS:
                FileFinder.findDown(new File(basePath), file -> {
                    if (file.isDirectory())
                        return;
                    String absolutePath = file.getAbsolutePath();
                    for (String p : paths)
                        if (absolutePath.equalsIgnoreCase(p))
                            files.add(file);
                });
                break;
            case PATTERN_MATCH:
                List<Pattern> patterns = new ArrayList<>();
                for (String p : paths)
                    patterns.add(Pattern.compile(p));
                FileFinder.findDown(new File(basePath), file -> {
                    if (file.isDirectory())
                        return;
                    for (Pattern pattern : patterns)
                        if (pattern.matcher(file.getAbsolutePath()).find())
                            files.add(file);
                });
                break;
            default:
                break;
        }
        List<ItemType> fileItems = new ArrayList<>();
        for (File file : files)
            fileItems.add(toFileItem(file));
        return fileItems;
    }

    private List<ItemType> findFilesBySet(Set set) {
        return new UnixFileItemSetExtractor(set, ovalEntityMapping).extract();
    }

    private static FileItem toFileItem(File file) throws IOException {
            Path path = file.toPath();
            Runtime runtime = Runtime.getRuntime();
            Process process = null;
            BufferedReader br = null;

            process = runtime.exec("stat -f \"%g\" " + file.getAbsolutePath());
            br = new BufferedReader(new InputStreamReader(process.getInputStream()));
            FileItem.GroupId groupId = new FileItem.GroupId();
            groupId.setValue(br.readLine());

            process = runtime.exec("stat -f \"%u\" " + file.getAbsolutePath());
            br = new BufferedReader(new InputStreamReader(process.getInputStream()));
            FileItem.UserId userId = new FileItem.UserId();
            userId.setValue(br.readLine());

            EntityItemStringType dirPathItem = new EntityItemStringType();
            dirPathItem.setValue(file.getParentFile().getAbsolutePath());
            dirPathItem.setStatus(StatusEnumeration.EXISTS);

            EntityItemStringType FilepathItem = new EntityItemStringType();
            FilepathItem.setValue(file.getAbsolutePath());
            FilepathItem.setStatus(StatusEnumeration.EXISTS);

            EntityItemStringType filename = new EntityItemStringType();
            filename.setValue(file.getName());
            JAXBElement<EntityItemStringType> filenameElement = new JAXBElement<>(
                    new QName("filename"),
                    EntityItemStringType.class,
                    filename
            );

            BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);

            FileItem.CTime cTime = new FileItem.CTime();
            cTime.setStatus(StatusEnumeration.EXISTS);
            cTime.setValue("" + attributes.lastAccessTime().to(TimeUnit.SECONDS));

            FileItem.ATime aTime = new FileItem.ATime();
            aTime.setStatus(StatusEnumeration.EXISTS);
            aTime.setValue("" + attributes.creationTime().to(TimeUnit.SECONDS));

            FileItem.MTime mTime = new FileItem.MTime();
            mTime.setStatus(StatusEnumeration.EXISTS);
            mTime.setValue("" + attributes.lastModifiedTime().to(TimeUnit.SECONDS));

            EntityItemIntType entitySize = new EntityItemIntType();
            entitySize.setStatus(StatusEnumeration.EXISTS);
            entitySize.setValue(Files.size(file.toPath()));

            process = runtime.exec("ls -al " + file.getAbsolutePath());
            br = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String right = br.readLine().split(" ")[0];
            boolean uread = right.charAt(1) != '-';
            boolean uwrite = right.charAt(2) != '-';
            boolean uexec = right.charAt(3) != '-';
            boolean gread = right.charAt(4) != '-';
            boolean gwrite = right.charAt(5) != '-';
            boolean gexec = right.charAt(6) != '-';
            boolean oread = right.charAt(7) != '-';
            boolean owrite = right.charAt(8) != '-';
            boolean oexec = right.charAt(9) != '-';

            EntityItemBoolType suid = new EntityItemBoolType();
            suid.setStatus(StatusEnumeration.EXISTS);
            suid.setValue(uexec && !gexec && !oexec);

            EntityItemBoolType sgid = new EntityItemBoolType();
            sgid.setStatus(StatusEnumeration.EXISTS);
            sgid.setValue(!uexec && gexec && !oexec);

            EntityItemBoolType entityUread = new EntityItemBoolType();
            suid.setStatus(StatusEnumeration.EXISTS);
            suid.setValue(uread);
            EntityItemBoolType entityUwrite = new EntityItemBoolType();
            suid.setStatus(StatusEnumeration.EXISTS);
            suid.setValue(uwrite);
            EntityItemBoolType entityUexec = new EntityItemBoolType();
            suid.setStatus(StatusEnumeration.EXISTS);
            suid.setValue(uexec);

            EntityItemBoolType entityGread = new EntityItemBoolType();
            suid.setStatus(StatusEnumeration.EXISTS);
            suid.setValue(gread);
            EntityItemBoolType entityGwrite = new EntityItemBoolType();
            suid.setStatus(StatusEnumeration.EXISTS);
            suid.setValue(gwrite);
            EntityItemBoolType entityGexec = new EntityItemBoolType();
            suid.setStatus(StatusEnumeration.EXISTS);
            suid.setValue(gexec);

            EntityItemBoolType entityOread = new EntityItemBoolType();
            suid.setStatus(StatusEnumeration.EXISTS);
            suid.setValue(oread);
            EntityItemBoolType entityOwrite = new EntityItemBoolType();
            suid.setStatus(StatusEnumeration.EXISTS);
            suid.setValue(owrite);
            EntityItemBoolType entityOexec = new EntityItemBoolType();
            suid.setStatus(StatusEnumeration.EXISTS);
            suid.setValue(oexec);

            EntityItemBoolType entityHasAcl = new EntityItemBoolType();
            entityHasAcl.setStatus(StatusEnumeration.EXISTS);
            entityHasAcl.setValue(right.contains("+"));

            FileItem fileItem = new FileItem();
            fileItem.setFilepath(FilepathItem);
            fileItem.setPath(dirPathItem);
            fileItem.setFilename(filenameElement);
            fileItem.setGroupId(groupId);
            fileItem.setUserId(userId);
            fileItem.setCTime(cTime);
            fileItem.setATime(aTime);
            fileItem.setMTime(mTime);
            fileItem.setSize(entitySize);
            fileItem.setSuid(suid);
            fileItem.setSgid(sgid);
            fileItem.setUread(entityUread);
            fileItem.setUwrite(entityUwrite);
            fileItem.setUexec(entityUexec);
            fileItem.setGread(entityGread);
            fileItem.setGwrite(entityGwrite);
            fileItem.setGexec(entityGexec);
            fileItem.setOread(entityOread);
            fileItem.setOwrite(entityOwrite);
            fileItem.setOexec(entityOexec);
            fileItem.setHasExtendedAcl(entityHasAcl);
            return fileItem;
    }

}
