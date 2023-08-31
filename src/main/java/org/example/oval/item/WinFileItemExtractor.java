package org.example.oval.item;

import org.mitre.oval.xmlschema.oval_definitions_5.*;
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
import java.util.Map;
import java.util.regex.Pattern;

public class WinFileItemExtractor implements OvalItemExtractor {
    private FileTest fileTest;
    private FileObject fileObject;
    private Map<String, ObjectType> objectTypeMap;
    private Map<String, VariableType> variableTypeMap;

    public WinFileItemExtractor(TestType testType, Map<String, ObjectType> objectTypeMap,
                                Map<String, VariableType> variableTypeMap) {
        fileTest = (FileTest) testType;
        fileObject = (FileObject) objectTypeMap.get(fileTest.getObject().getObjectRef());

        this.objectTypeMap = objectTypeMap;
        this.variableTypeMap = variableTypeMap;
    }

    @Override
    public List<ItemType> extract() throws Exception {
        ObjectType inputObject = objectTypeMap.get(fileTest.getObject().getObjectRef());
        if (inputObject == null)
            throw new Exception("input file object is not null. test id : " + fileTest.getId());
        if (!inputObject.getClass().equals(FileObject.class))
            throw new Exception("input file object is notc file_object. test id : " + fileTest.getId());

        FileObject objectType = (FileObject) objectTypeMap.get(fileTest.getObject().getObjectRef());
        boolean setExist = objectType.getSet() != null;
        boolean filepathExist = objectType.getFilepath() != null;
        boolean pathExist = objectType.getFilename() != null || objectType.getPath() != null;
        if (setExist && (filepathExist || pathExist))
            throw new Exception("set type and other type cannot be used at the same time");

        if (!setExist && !filepathExist && !pathExist)
            throw new Exception("file data in file_object is not exist");

        if (filepathExist && pathExist)
            throw new Exception("filepath and (path + filepath) cannot be used at the same time");

        List<ItemType> fileItems = null;
        if (setExist)
            fileItems = findFilesBySet(objectType.getSet());
        else if (filepathExist)
            fileItems = findFilesByFilepath(objectType.getFilepath());
        else if (pathExist)
            fileItems = findFilesByPath(objectType.getPath(), objectType.getFilename());
        return fileItems;
    }

    private List<ItemType> findFilesByPath(EntityObjectStringType path, JAXBElement<EntityObjectStringType> filename)
            throws IOException {
        List<File> dirs = new ArrayList<>();
        String inputPath = (String) path.getValue();
        if (path.getVarRef() != null) {

        }
        switch (path.getOperation()) {
            case EQUALS:
                File dir = new File(inputPath);
                if (dir.exists() && dir.isDirectory())
                    dirs.add(dir);
                break;
            case CASE_INSENSITIVE_EQUALS:
                Files.find(Paths.get("c:\\"), Integer.MAX_VALUE, (dirPath, attributes) -> {
                    String absolutePath = dirPath.toAbsolutePath().toString();
                    return absolutePath.equalsIgnoreCase(inputPath);
                }).forEach(file -> dirs.add(file.toFile()));
                break;
            case PATTERN_MATCH:
                Pattern pattern = Pattern.compile(inputPath);
                Files.find(Paths.get("c:\\"), Integer.MAX_VALUE, (dirPath, attributes) -> {
                    return pattern.matcher(dirPath.toAbsolutePath().toString()).find();
                }).forEach(file -> dirs.add(file.toFile()));
                break;
            default:
                break;
        }
        List<ItemType> files = new ArrayList<>();
        for (File dir : dirs) {
            for (File file : dir.listFiles()) {
                if (file.isDirectory())
                    continue;
                String inputFilename = (String) filename.getValue().getValue();
                switch (filename.getValue().getOperation()) {
                    case EQUALS:
                        if (filename.getValue().getValue().equals(file.getName()))
                            files.add(toFileItem(file));
                        break;
                    case CASE_INSENSITIVE_EQUALS:
                        if (inputFilename.equalsIgnoreCase(file.getName()))
                            files.add(toFileItem(file));
                        break;
                    case PATTERN_MATCH:
                        Pattern pattern = Pattern.compile(inputFilename);
                        if (pattern.matcher(file.getName()).find())
                            files.add(toFileItem(file));
                        break;
                }
            }
        }
        return files;
    }

    private List<ItemType> findFilesByFilepath(EntityObjectStringType filepath) {
        List<ItemType> files = new ArrayList<>();
        return files;
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
}
