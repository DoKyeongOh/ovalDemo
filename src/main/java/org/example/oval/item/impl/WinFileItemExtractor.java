package org.example.oval.item.impl;

import org.example.oval.OvalEntityMapping;
import org.example.oval.OvalSimpleBaseTypeConverter;
import org.example.oval.item.OvalItemExtractor;
import org.example.oval.variable.OvalVariableExtractorFactory;
import org.mitre.oval.xmlschema.oval_definitions_5.*;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileBehaviors;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileTest;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemIntType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.StatusEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.EntityItemWindowsViewType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.FileItem;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class WinFileItemExtractor implements OvalItemExtractor {
    private static final String basePath = "C:\\Users\\82105\\IdeaProjects\\ovalDemo";
    private FileObject fileObject;
    private OvalEntityMapping ovalEntityMapping;
    private OvalSimpleBaseTypeConverter baseTypeConverter;

    public WinFileItemExtractor(TestType testType, OvalEntityMapping ovalEntityMapping) throws Exception { // todo: behavior 필요
        FileTest fileTest = (FileTest) testType;
        String objectRef = fileTest.getObject().getObjectRef();
        ObjectType inputObject = ovalEntityMapping.getObjectType(objectRef);
        if (inputObject == null)
            throw new Exception("input file object is not null. object id : " + fileObject.getId());
        if (!inputObject.getClass().equals(FileObject.class))
            throw new Exception("input file object is notc file_object. object id : " + fileObject.getId());
        fileObject = (FileObject) ovalEntityMapping.getObjectType(objectRef);
        baseTypeConverter = new OvalSimpleBaseTypeConverter(ovalEntityMapping);
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
                Files.find(Paths.get(basePath), Integer.MAX_VALUE, (dirPath, attributes) -> {
                    if (!attributes.isDirectory())
                        return false;
                    String absolutePath = dirPath.toAbsolutePath().toString();
                    for (String p : paths)
                        if (absolutePath.equalsIgnoreCase(p))
                            return true;
                    return false;
                }).forEach(file -> dirs.add(file.toFile()));
                break;
            case PATTERN_MATCH:
                List<Pattern> patterns = new ArrayList<>();
                for (String p : paths) {
                    Pattern pattern = Pattern.compile(p.replace("\\", "\\\\"));
                    patterns.add(pattern);
                }
                Files.find(Paths.get(basePath), Integer.MAX_VALUE, (dirPath, attributes) -> {
                    if (!attributes.isDirectory())
                        return false;
                    for (Pattern pattern : patterns)
                        if (pattern.matcher(dirPath.toAbsolutePath().toString()).find())
                            return true;
                    return false;
                }).forEach(file -> dirs.add(file.toFile()));
                break;
            default:
                break;
        }
        List<ItemType> fileItems = new ArrayList<>();
        for (File dir : dirs) {
            for (File file : dir.listFiles()) {
                if (file.isDirectory())
                    continue;
                String inputFilename = (String) filenameEntity.getValue().getValue();
                switch (filenameEntity.getValue().getOperation()) {
                    case EQUALS:
                        if (filenameEntity.getValue().getValue().equals(file.getName()))
                            fileItems.add(toFileItem(file));
                        break;
                    case CASE_INSENSITIVE_EQUALS:
                        if (inputFilename.equalsIgnoreCase(file.getName()))
                            fileItems.add(toFileItem(file));
                        break;
                    case PATTERN_MATCH:
                        Pattern pattern = Pattern.compile(inputFilename);
                        if (pattern.matcher(file.getName()).find())
                            fileItems.add(toFileItem(file));
                        break;
                }
            }
        }
        return fileItems;
    }

    private List<ItemType> findFilesByFilepath(EntityObjectStringType filepathEntity) throws Exception {
        List<String> paths = baseTypeConverter.convert(filepathEntity).stream()
                .map(item -> item.toString()).collect(Collectors.toList());
        List<ItemType> fileItems = new ArrayList<>();
        switch (filepathEntity.getOperation()) {
            case EQUALS:
                for (String filepath : paths) {
                    File file = new File(filepath);
                    if (file.exists() && file.isFile())
                        fileItems.add(toFileItem(file));
                }
                break;
            case CASE_INSENSITIVE_EQUALS:
                Files.find(Paths.get(basePath), Integer.MAX_VALUE, (filepath, attributes) -> {
                    if (!attributes.isDirectory())
                        return false;
                    String absolutePath = filepath.toAbsolutePath().toString();
                    for (String p : paths) {
                        if (absolutePath.equalsIgnoreCase(p))
                            return true;
                    }
                    return false;
                });
                break;
            case PATTERN_MATCH:
                List<Pattern> patterns = new ArrayList<>();
                for (String p : paths) {
                    Pattern pattern = Pattern.compile(p.replace("\\", "\\\\"));
                    patterns.add(pattern);
                }
                Files.find(Paths.get(basePath), Integer.MAX_VALUE, (filepath, attributes) -> {
                    if (attributes.isDirectory())
                        return false;
                    for (Pattern pattern : patterns) {
                        if (pattern.matcher(filepath.toAbsolutePath().toString()).find())
                            return true;
                    }
                    return false;
                });
                break;
            default:
                break;
        }
        return fileItems;
    }

    private List<ItemType> findFilesBySet(Set set) {
        List<ItemType> files = new ArrayList<>();
        return files;
    }

    private static FileItem toFileItem(File file) throws IOException {
        Path path = file.toPath();
        BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);

        EntityItemIntType createTimeItem = new EntityItemIntType();
        createTimeItem.setStatus(StatusEnumeration.EXISTS);
        createTimeItem.setValue("" + attributes.creationTime().toMillis() * 100 + 116615024815702500L);

        EntityItemIntType accessTimeItem = new EntityItemIntType();
        accessTimeItem.setStatus(StatusEnumeration.EXISTS);
        accessTimeItem.setValue("" + attributes.lastAccessTime().toMillis() * 100 + 116615024815702500L);

        EntityItemIntType modifyTimeItem = new EntityItemIntType();
        modifyTimeItem.setStatus(StatusEnumeration.EXISTS);
        modifyTimeItem.setValue("" + attributes.lastModifiedTime().toMillis() * 100 + 116615024815702500L);

        EntityItemStringType FilepathItem = new EntityItemStringType();
        FilepathItem.setValue(file.getAbsolutePath());
        FilepathItem.setStatus(StatusEnumeration.EXISTS);

        EntityItemStringType dirPathItem = new EntityItemStringType();
        dirPathItem.setValue(file.getParentFile().getAbsolutePath());
        dirPathItem.setStatus(StatusEnumeration.EXISTS);

        EntityItemStringType filename = new EntityItemStringType();
        filename.setValue(file.getName());
        JAXBElement<EntityItemStringType> filenameElement = new JAXBElement<>(
                new QName("filename"),
                EntityItemStringType.class,
                filename
        );

        EntityItemStringType ownerItem = new EntityItemStringType();
        ownerItem.setValue(Files.getOwner(file.toPath()).getName());

        EntityItemIntType sizeItem = new EntityItemIntType();
        sizeItem.setValue("" + Files.size(file.toPath()));

        EntityItemWindowsViewType entityItemWindowsViewType = new EntityItemWindowsViewType();
        entityItemWindowsViewType.setValue(System.getProperty("os.arch"));

        FileItem fileItem = new FileItem();
        fileItem.setId(new BigInteger("31"));
        fileItem.setCTime(createTimeItem);
        fileItem.setATime(accessTimeItem);
        fileItem.setMTime(modifyTimeItem);
        fileItem.setFilepath(FilepathItem);
        fileItem.setPath(dirPathItem);
        fileItem.setFilename(filenameElement);
        fileItem.setSize(sizeItem);
        fileItem.setOwner(ownerItem);
        fileItem.setWindowsView(entityItemWindowsViewType);
        return fileItem;
    }

    private static List<Object> getBaseTypeValue(EntitySimpleBaseType baseType, OvalEntityMapping mapping)
            throws Exception {
        Object value = baseType.getValue();
        String varRef = baseType.getVarRef();
        if (value != null && varRef != null)
            throw new Exception("EntitySimpleBaseType cannot have value and var_ref at the same time.");
        if (value != null) {
            List<Object> variables = new ArrayList<>();
            variables.add(value);
            return variables;
        }
        VariableType variableType = mapping.getVariableType(varRef);
        if (variableType == null)
            return new ArrayList<>();
        Object variable = OvalVariableExtractorFactory.getExtractor(mapping, variableType).extract();
        if (variable instanceof List)
            return (List<Object>) variable;
        List<Object> variables = new ArrayList<>();
        variables.add(variable);
        return variables;
    }
}
