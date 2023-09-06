package org.example.oval.file;

import org.example.oval.OvalEntityMapping;
import org.example.oval.OvalSimpleValueExtractor;
import org.example.oval.item.ItemExtractResult;
import org.example.oval.item.ItemExtractResult.ItemExtractResultType;
import org.example.oval.item.ItemSetExtractResult;
import org.example.oval.item.OvalItemExtractor;
import org.mitre.oval.xmlschema.oval_definitions_5.*;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileObject;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.*;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.EntityItemWindowsViewType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.FileItem;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class WinFileItemExtractor implements OvalItemExtractor {
    private static final String basePath = new File("").getAbsolutePath();
    private FileObject fileObject;
    private OvalEntityMapping ovalEntityMapping;
    private OvalSimpleValueExtractor simpleValueExtractor;

    public WinFileItemExtractor(ObjectType inputObject, OvalEntityMapping ovalEntityMapping) throws Exception {
        if (inputObject == null)
            throw new Exception("input file object is not null. object id : " + fileObject.getId());
        if (!inputObject.getClass().equals(FileObject.class))
            throw new Exception("input file object is not file_object. object id : " + fileObject.getId());
        fileObject = (FileObject) inputObject;
        simpleValueExtractor = new OvalSimpleValueExtractor(ovalEntityMapping);
        this.ovalEntityMapping = ovalEntityMapping;
    }

    @Override
    public ItemExtractResult extract() throws Exception {
        int requiredCount = 0;
        requiredCount += fileObject.getSet() != null ? 1 : 0;
        requiredCount += fileObject.getFilepath() != null ? 1 : 0;
        requiredCount += fileObject.getFilename() != null || fileObject.getPath() != null ? 1 : 0;
        if (requiredCount > 1)
            return new ItemExtractResult(ItemExtractResultType.ERROR);
        try {
            List<ItemType> itemTypes = null;
            if (fileObject.getSet() != null)
                itemTypes = findFilesBySet(fileObject.getSet());
            else if (fileObject.getFilepath() != null)
                itemTypes = findFilesByFilepath(fileObject.getFilepath());
            else
                itemTypes = findFilesByPath(fileObject.getPath(), fileObject.getFilename());
            ItemExtractResult result = new ItemExtractResult(itemTypes);
            if (itemTypes.isEmpty())
                result.setResultType(ItemExtractResultType.DOES_NOT_EXIST);
            ovalEntityMapping.addItemResult(fileObject.getId(), result);
            return result;
        } catch (Exception e) {
            return new ItemExtractResult(ItemExtractResultType.ERROR);
        }
    }

    @Override
    public ItemExtractResult extractFromCache() {
        ItemExtractResult itemResult = ovalEntityMapping.getItemResult(fileObject.getId());
        return itemResult;
    }

    private List<ItemType> findFilesByPath(EntityObjectStringType pathEntity,
                                           JAXBElement<EntityObjectStringType> filenameEntity) throws Exception {
        List<File> dirs = new ArrayList<>();
        List<String> paths = simpleValueExtractor.extract(pathEntity).stream()
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
                for (String p : paths) {
                    Pattern pattern = Pattern.compile(p.replace("\\", "\\\\"));
                    patterns.add(pattern);
                }
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
        java.util.Set<String> filenames = simpleValueExtractor.extract(filenameEntity.getValue()).stream()
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
                        for (String filename : filenames)
                            if (filename.equalsIgnoreCase(file.getName()))
                                fileItems.add(toFileItem(file));
                        break;
                    case PATTERN_MATCH:
                        for (String filename : filenames) {
                            String pattern = filename.replace("\\", "\\\\");
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
        List<String> paths = simpleValueExtractor.extract(filepathEntity).stream()
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
                for (String p : paths) {
                    Pattern pattern = Pattern.compile(p.replace("\\", "\\\\"));
                    patterns.add(pattern);
                }
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
        ItemSetExtractResult itemSetExtractResult = new WinFileItemSetExtractor(set, ovalEntityMapping).extract();
        return itemSetExtractResult.getExtractedItems();
    }

    private static FileItem toFileItem(File file) throws IOException {
        Path path = file.toPath();
        BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);

        EntityItemIntType itemCreateTime = new EntityItemIntType();
        itemCreateTime.setStatus(StatusEnumeration.EXISTS);
        itemCreateTime.setValue("" + attributes.creationTime().toMillis() * 100 + 116615024815702500L);

        EntityItemIntType itemAccessTime = new EntityItemIntType();
        itemAccessTime.setStatus(StatusEnumeration.EXISTS);
        itemAccessTime.setValue("" + attributes.lastAccessTime().toMillis() * 100 + 116615024815702500L);

        EntityItemIntType itemModifyTime = new EntityItemIntType();
        itemModifyTime.setStatus(StatusEnumeration.EXISTS);
        itemModifyTime.setValue("" + attributes.lastModifiedTime().toMillis() * 100 + 116615024815702500L);

        EntityItemStringType itemFilepath = new EntityItemStringType();
        itemFilepath.setValue(file.getAbsolutePath());
        itemFilepath.setStatus(StatusEnumeration.EXISTS);

        EntityItemStringType itemDirPath = new EntityItemStringType();
        itemDirPath.setValue(file.getParentFile().getAbsolutePath());
        itemDirPath.setStatus(StatusEnumeration.EXISTS);

        EntityItemStringType filename = new EntityItemStringType();
        filename.setValue(file.getName());
        JAXBElement<EntityItemStringType> filenameElement = new JAXBElement<>(
                new QName("filename"),
                EntityItemStringType.class,
                filename
        );

        EntityItemStringType itemOwner = new EntityItemStringType();
        itemOwner.setValue(Files.getOwner(file.toPath()).getName());

        EntityItemIntType itemSize = new EntityItemIntType();
        itemSize.setDatatype("int");
        itemSize.setValue("" + Files.size(file.toPath()));

        EntityItemWindowsViewType itemWindowsView = new EntityItemWindowsViewType();
        itemWindowsView.setValue(System.getProperty("os.arch"));
        itemWindowsView.setDatatype("string");

        FileItem fileItem = new FileItem();
        fileItem.setId(new BigInteger("31"));
        fileItem.setCTime(itemCreateTime);
        fileItem.setATime(itemAccessTime);
        fileItem.setMTime(itemModifyTime);
        fileItem.setFilepath(itemFilepath);
        fileItem.setPath(itemDirPath);
        fileItem.setFilename(filenameElement);
        fileItem.setSize(itemSize);
        fileItem.setOwner(itemOwner);
        fileItem.setWindowsView(itemWindowsView);
        return fileItem;
    }

}
