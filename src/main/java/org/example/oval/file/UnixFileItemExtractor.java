package org.example.oval.file;

import org.example.oval.OvalEntityMappingContext;
import org.example.oval.item.ItemExtractResult;
import org.example.oval.item.ItemExtractResult.ItemExtractResultType;
import org.example.oval.item.OvalItemExtractor;
import org.example.oval.OvalSimpleValueExtractor;
import org.mitre.oval.xmlschema.oval_common_5.OperationEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5.Set;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.FileObject;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.*;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.FileItem;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
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

    public UnixFileItemExtractor() {

    }

    @Override
    public ItemExtractResult extract(ObjectType inputObject, OvalEntityMappingContext entityMappingContext) {
        if (inputObject == null)
            return new ItemExtractResult(ItemExtractResultType.ERROR);
        if (!inputObject.getClass().equals(FileObject.class))
            return new ItemExtractResult(ItemExtractResultType.ERROR);
        FileObject fileObject = (FileObject) inputObject;

        int requiredCount = 0;
        requiredCount += fileObject.getSet() != null ? 1 : 0;
        requiredCount += fileObject.getFilepath() != null ? 1 : 0;
        requiredCount += fileObject.getFilename() != null || fileObject.getPath() != null ? 1 : 0;
        if (requiredCount > 1)
            return new ItemExtractResult(ItemExtractResultType.ERROR);
        OvalSimpleValueExtractor valueExtractor = new OvalSimpleValueExtractor(entityMappingContext);
        try {
            if (fileObject.getSet() != null) {
                return findFilesBySet(fileObject.getSet(), entityMappingContext);
            } else if (fileObject.getFilepath() != null) {
                List<String> filePaths = valueExtractor.extract(fileObject.getFilepath()).stream()
                        .map(item -> item.toString()).collect(Collectors.toList());
                return findFilesByFilepath(filePaths, fileObject.getFilepath().getOperation());
            } else {
                List<String> paths = valueExtractor.extract(fileObject.getPath()).stream()
                        .map(item -> item.toString()).collect(Collectors.toList());
                List<String> filenames = valueExtractor.extract(fileObject.getFilename().getValue()).stream()
                        .map(item -> item.toString()).collect(Collectors.toList());
                OperationEnumeration pathEnum = fileObject.getPath().getOperation();
                OperationEnumeration filenameEnum = fileObject.getFilename().getValue().getOperation();
                return findFilesByPath(paths, pathEnum, filenames, filenameEnum);
            }
        } catch (Exception e) {
            return new ItemExtractResult(ItemExtractResultType.ERROR);
        }
    }

    private ItemExtractResult findFilesByPath(List<String> paths, OperationEnumeration pathEnum, List<String> filenames,
                                           OperationEnumeration filepathEnum) throws Exception {
        List<File> dirs = new ArrayList<>();
        switch (pathEnum) {
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
        List<ItemType> fileItems = new ArrayList<>();
        for (File dir : dirs) {
            for (File file : dir.listFiles()) {
                if (file.isDirectory())
                    continue;
                switch (filepathEnum) {
                    case EQUALS:
                        if (filenames.contains(file.getName()))
                            fileItems.add(toFileItem(file));
                        break;
                    case CASE_INSENSITIVE_EQUALS:
                        for (String filename : filenames)
                            if (filename.equalsIgnoreCase(file.getName()))
                                fileItems.add(toFileItem(file));
                        break;
                    case PATTERN_MATCH:
                        for (String filename : filenames) {
                            if (Pattern.compile(filename).matcher(file.getName()).find())
                                fileItems.add(toFileItem(file));
                        }
                        break;
                }
            }
        }
        return new ItemExtractResult(fileItems);
    }

    private ItemExtractResult findFilesByFilepath(List<String> filePaths, OperationEnumeration enumeration)
            throws Exception {
        List<File> files = new ArrayList<>();
        switch (enumeration) {
            case EQUALS:
                for (String filepath : filePaths) {
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
                    for (String p : filePaths)
                        if (absolutePath.equalsIgnoreCase(p))
                            files.add(file);
                });
                break;
            case PATTERN_MATCH:
                List<Pattern> patterns = new ArrayList<>();
                for (String p : filePaths)
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
        return new ItemExtractResult(fileItems);
    }

    private ItemExtractResult findFilesBySet(Set set, OvalEntityMappingContext entityMappingContext) {
        UnixFileItemSetExtractor extractor = new UnixFileItemSetExtractor(set, entityMappingContext);
        return extractor.extract();
    }

    private static FileItem toFileItem(File file) throws IOException {
            Path path = file.toPath();
            Runtime runtime = Runtime.getRuntime();
            Process process = null;
            BufferedReader br = null;

            process = runtime.exec("stat -c \"%g\" " + file.getAbsolutePath());
            br = new BufferedReader(new InputStreamReader(process.getInputStream()));
            FileItem.GroupId groupId = new FileItem.GroupId();
            groupId.setValue(br.readLine());

            process = runtime.exec("stat -c \"%u\" " + file.getAbsolutePath());
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
            fileItem.setId(new BigInteger("" + file.hashCode()));
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
