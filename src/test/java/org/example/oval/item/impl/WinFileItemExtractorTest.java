package org.example.oval.item.impl;

import org.example.oval.OvalEntityMapping;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mitre.oval.xmlschema.oval_common_5.OperationEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectRefType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileTest;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.FileItem;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

public class WinFileItemExtractorTest {

    private static final String basePath = "target\\fileExtractorTest";
    private static final String basePath2 = "target\\fileExtractorTest2";
    private static final int fileCount = 3;
    @Before
    public void before() throws Exception {
        File basePathFile1 = new File(basePath);
        if (!basePathFile1.exists())
            basePathFile1.mkdirs();

        if (!basePathFile1.exists())
            throw new Exception();

        for (int i=0 ; i<fileCount ; i++) {
            File dumyFile = new File(basePathFile1, "dumy"+i);
            if (!dumyFile.exists())
                dumyFile.createNewFile();
        }

        File basePathFile2 = new File(basePath2);
        if (!basePathFile2.exists())
            basePathFile2.mkdirs();

        if (!basePathFile2.exists())
            throw new Exception();

        for (int i=0 ; i<fileCount ; i++) {
            File dumyFile = new File(basePathFile2, "dumy"+i);
            if (!dumyFile.exists())
                dumyFile.createNewFile();
        }
    }

    @After
    public void after() {
        File basePathFile = new File(basePath);
        if (basePathFile.exists() && basePathFile.isDirectory())
            basePathFile.delete();
        File basePathFile2 = new File(basePath2);
        if (basePathFile2.exists() && basePathFile2.isDirectory())
            basePathFile2.delete();
    }
    @Test
    public void testPathEquals() throws Exception {
        for (int i=0 ; i<fileCount ; i++) {
            String filename = "dumy" + i;
            List<FileItem> fileItems = getItemByPathAndFilename(
                    basePath,
                    OperationEnumeration.EQUALS,
                    filename,
                    OperationEnumeration.EQUALS);
            File basePathFile = new File(basePath);
            FileItem fileItem = fileItems.get(0);
            assert fileItems.size() == 1;
            assert fileItem.getPath().getValue().equals(basePathFile.getAbsolutePath());
            assert fileItem.getFilename().getValue().getValue().equals(filename);
            assert fileItem.getFilepath().getValue().equals(basePathFile.getAbsolutePath() + "\\" + filename);
        }
    }
    @Test
    public void testPathCaseInsensitiveEquals() throws Exception {
        for (int i=0 ; i<fileCount ; i++) {
            File basePathFile = new File(basePath);
            String filename = "dumy" + i;
            List<FileItem> fileItems = getItemByPathAndFilename(
                    basePathFile.getAbsolutePath().toUpperCase(),
                    OperationEnumeration.CASE_INSENSITIVE_EQUALS,
                    filename,
                    OperationEnumeration.EQUALS);
            FileItem fileItem = fileItems.get(0);
            assert fileItems.size() == 1;
            assert fileItem.getPath().getValue().equals(basePathFile.getAbsolutePath());
            assert fileItem.getFilename().getValue().getValue().equals(filename);
            assert fileItem.getFilepath().getValue().equals(basePathFile.getAbsolutePath() + "\\" + filename);
        }
    }
    @Test
    public void testPathPatternMatch() throws Exception {
        for (int i=0 ; i<fileCount ; i++) {
            String filename = "dumy" + i;
            List<FileItem> fileItems = getItemByPathAndFilename(
                    basePath + "*",
                    OperationEnumeration.PATTERN_MATCH,
                    filename,
                    OperationEnumeration.EQUALS);
            assert fileItems.size() == 2;

            File basePathFile = new File(basePath);
            FileItem fileItem = fileItems.get(0);
            assert fileItem.getPath().getValue().equals(basePathFile.getAbsolutePath());
            assert fileItem.getFilename().getValue().getValue().equals(filename);
            assert fileItem.getFilepath().getValue().equals(basePathFile.getAbsolutePath() + "\\" + filename);

            File basePathFile2 = new File(basePath2);
            FileItem fileItem2 = fileItems.get(1);
            assert fileItem2.getPath().getValue().equals(basePathFile2.getAbsolutePath());
            assert fileItem2.getFilename().getValue().getValue().equals(filename);
            assert fileItem2.getFilepath().getValue().equals(basePathFile2.getAbsolutePath() + "\\" + filename);
        }
    }
    @Test
    public void testFilenameCaseInsensitiveEquals() throws Exception {
        for (int i=0 ; i<fileCount ; i++) {
            File basePathFile = new File(basePath);
            String filename = "Dumy" + i;
            List<FileItem> fileItems = getItemByPathAndFilename(
                    basePathFile.getAbsolutePath(),
                    OperationEnumeration.EQUALS,
                    filename,
                    OperationEnumeration.CASE_INSENSITIVE_EQUALS);
            FileItem fileItem = fileItems.get(0);
            assert fileItems.size() == 1;
            assert fileItem.getPath().getValue().equals(basePathFile.getAbsolutePath());
            assert ((String) fileItem.getFilename().getValue().getValue()).equalsIgnoreCase(filename);
            assert ((String) fileItem.getFilepath().getValue())
                    .equalsIgnoreCase(basePathFile.getAbsolutePath() + "\\" + filename);
        }
    }
    @Test
    public void testFilenamePatternMatch() throws Exception {
        String pattern = "dumy*";
        List<FileItem> fileItems = getItemByPathAndFilename(
                basePath,
                OperationEnumeration.EQUALS,
                pattern,
                OperationEnumeration.PATTERN_MATCH);
        File basePathFile = new File(basePath);
        assert fileItems.size() == fileCount;
        for (int i=0 ; i<fileCount ; i++) {
            FileItem fileitem = fileItems.get(i);
            String path = (String) fileitem.getPath().getValue();
            String filename = (String) fileitem.getFilename().getValue().getValue();
            String filepath = (String) fileitem.getFilepath().getValue();
            assert path.equals(basePathFile.getAbsolutePath());
            assert filename.equals("dumy" + i);
            assert filepath.equals(basePathFile.getAbsolutePath() + "\\dumy" + i);
        }
    }

    private List<FileItem> getItemByPathAndFilename(String path, OperationEnumeration pathOperation, String filename,
                                     OperationEnumeration filenameOperation) throws Exception {
        if (pathOperation == null)
            pathOperation = OperationEnumeration.EQUALS;
        if (filenameOperation == null)
            filenameOperation = OperationEnumeration.EQUALS;
        FileTest fileTest = new FileTest();
        fileTest.setId("fileTest-1");
        ObjectRefType objectRefType = new ObjectRefType();
        objectRefType.setObjectRef("fileObject-1");
        fileTest.setObject(objectRefType);

        FileObject fileObject = new FileObject();
        EntityObjectStringType pathEntity = new EntityObjectStringType();
        pathEntity.setValue(path);
        pathEntity.setOperation(pathOperation);
        fileObject.setPath(pathEntity);
        EntityObjectStringType filenameEntity = new EntityObjectStringType();
        filenameEntity.setValue(filename);
        filenameEntity.setOperation(filenameOperation);
        JAXBElement<EntityObjectStringType> filenameElement = new JAXBElement<>(
                QName.valueOf("filename"),
                EntityObjectStringType.class,
                filenameEntity);
        fileObject.setFilename(filenameElement);

        OvalEntityMapping ovalEntityMapping = new OvalEntityMapping();
        ovalEntityMapping.addObjectType("fileObject-1", fileObject);

        WinFileItemExtractor winFileItemExtractor = new WinFileItemExtractor(fileTest, ovalEntityMapping);
        return winFileItemExtractor.extract().stream()
                .map(item -> (FileItem) item).collect(Collectors.toList());
    }


    @Test
    public void testExist() {
        File file = new File("C:\\Users\\82105\\IdeaProjects\\ovalDemo\\target\\hello.txt");
        System.out.println(file.getParent());
    }

}