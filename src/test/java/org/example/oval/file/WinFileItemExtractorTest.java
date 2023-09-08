package org.example.oval.file;

import org.example.oval.OvalEntityMappingContext;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mitre.oval.xmlschema.oval_common_5.OperationEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectStringType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileObject;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.FileItem;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

public class WinFileItemExtractorTest {


    private static final String basePath = "target\\temp\\fileExtractorTest";
    private static final String basePath2 = "target\\temp\\fileExtractorTest2";
    private static final int testItemCount = 3;
    @Before
    public void before() throws Exception {
        File basePathFile1 = new File(basePath);
        if (!basePathFile1.exists())
            basePathFile1.mkdirs();

        new File(basePathFile1, "dumyDir1").mkdir();
        if (!basePathFile1.exists())
            throw new Exception();

        for (int i = 0; i< testItemCount; i++) {
            File dumyFile = new File(basePathFile1, "dumy"+i);
            if (!dumyFile.exists())
                dumyFile.createNewFile();
        }

        File basePathFile2 = new File(basePath2);
        if (!basePathFile2.exists())
            basePathFile2.mkdirs();

        new File(basePathFile2, "dumyDir2").mkdir();
        if (!basePathFile2.exists())
            throw new Exception();

        for (int i = 0; i< testItemCount; i++) {
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
        for (int i = 0; i< testItemCount; i++) {
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
            assert fileItem.getFilepath().getValue().equals(basePathFile.getAbsolutePath() + File.separator + filename);
        }
    }
    @Test
    public void testPathCaseInsensitiveEquals() throws Exception {
        for (int i = 0; i< testItemCount; i++) {
            File basePathFile = new File(basePath);
            String filename = "dumy" + i;
            List<FileItem> fileItems = getItemByPathAndFilename(
                    basePathFile.getAbsolutePath().toUpperCase(),
                    OperationEnumeration.CASE_INSENSITIVE_EQUALS,
                    filename,
                    OperationEnumeration.EQUALS);
            FileItem fileItem = fileItems.get(0);
            assert fileItems.size() == 1;
            String filepath = (String) fileItems.get(0).getFilepath().getValue();
            assert filepath.equalsIgnoreCase(basePathFile.getAbsolutePath() + File.separator + filename);
        }
    }
    @Test
    public void testPathPatternMatch() throws Exception {
        for (int i = 0; i< testItemCount; i++) {
            String filename = "dumy" + i;
            List<FileItem> fileItems = getItemByPathAndFilename(
                    basePath + "*",
                    OperationEnumeration.PATTERN_MATCH,
                    filename,
                    OperationEnumeration.EQUALS);

            assert fileItems.size() == 2;

            Map<String, FileItem> result = new HashMap<>();
            for (FileItem fileItem : fileItems) {
                String filepath = (String) fileItem.getFilepath().getValue();
                result.put(filepath.replace("\\.\\", File.separator), fileItem);
            }

            File basePathFile = new File(basePath);
            File basePathFile2 = new File(basePath2);
            assert result.containsKey(basePathFile.getAbsolutePath() + File.separator + filename);
            assert result.containsKey(basePathFile2.getAbsolutePath() + File.separator + filename);
        }
    }
    @Test
    public void testFilenameCaseInsensitiveEquals() throws Exception {
        for (int i = 0; i< testItemCount; i++) {
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
                    .equalsIgnoreCase(basePathFile.getAbsolutePath() + File.separator + filename);
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
        assert fileItems.size() == testItemCount;
        for (int i = 0; i< testItemCount; i++) {
            FileItem fileitem = fileItems.get(i);
            String path = (String) fileitem.getPath().getValue();
            String filename = (String) fileitem.getFilename().getValue().getValue();
            String filepath = (String) fileitem.getFilepath().getValue();
            assert path.equals(basePathFile.getAbsolutePath());
            assert filename.equals("dumy" + i);
            assert filepath.equals(basePathFile.getAbsolutePath() + File.separator + "dumy" + i);
        }
    }
    @Test
    public void testFilepathEquals() throws Exception {
        for (int i = 0; i< testItemCount; i++) {
            String filename = "dumy" + i;
            List<FileItem> fileItems = getItemByFilepath(
                    basePath + File.separator + filename,
                    OperationEnumeration.EQUALS);
            File basePathFile = new File(basePath);
            FileItem fileItem = fileItems.get(0);
            assert fileItems.size() == 1;
            assert fileItem.getPath().getValue().equals(basePathFile.getAbsolutePath());
            assert fileItem.getFilename().getValue().getValue().equals(filename);
            assert fileItem.getFilepath().getValue().equals(basePathFile.getAbsolutePath() + File.separator + filename);
        }
    }
    @Test
    public void testFilepathCaseInsensitiveEquals() throws Exception {
        for (int i = 0; i< testItemCount; i++) {
            String filename = basePath + File.separator + "dumy" + i;
            File basePathFile = new File(filename.toUpperCase());
            List<FileItem> fileItems = getItemByFilepath(
                    basePathFile.getAbsolutePath().toUpperCase(),
                    OperationEnumeration.CASE_INSENSITIVE_EQUALS);
            FileItem fileItem = fileItems.get(0);
            assert fileItems.size() == 1;

            String filepath = (String) fileItem.getFilepath().getValue();
            assert filepath.equalsIgnoreCase(basePathFile.getAbsolutePath());
            assert !filepath.equals(basePathFile.getAbsolutePath());
        }
    }
    @Test
    public void testFilepathPatternMatch() throws Exception {
        String filePathPattern = basePath + File.separator + "dumy*";
        List<FileItem> fileItems = getItemByFilepath(
                filePathPattern,
                OperationEnumeration.PATTERN_MATCH);
        assert fileItems.size() == testItemCount;

        Set<String> filepathSet = new HashSet<>();
        for (FileItem fileItem : fileItems) {
            String filepath = (String) fileItem.getFilepath().getValue();
            filepathSet.add(filepath);
        }

        assert filepathSet.contains(new File(basePath).getAbsolutePath() + File.separator + "dumy0");
        assert filepathSet.contains(new File(basePath).getAbsolutePath() + File.separator + "dumy1");
        assert filepathSet.contains(new File(basePath).getAbsolutePath() + File.separator + "dumy2");
    }

    private List<FileItem> getItemByPathAndFilename(String path, OperationEnumeration pathOperation, String filename,
                                                                                                                OperationEnumeration filenameOperation) throws Exception {
        if (pathOperation == null)
            pathOperation = OperationEnumeration.EQUALS;
        if (filenameOperation == null)
            filenameOperation = OperationEnumeration.EQUALS;

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

        OvalEntityMappingContext ovalEntityMappingContext = new OvalEntityMappingContext();
        ovalEntityMappingContext.putObjectType("fileObject-1", fileObject);

        WinFileItemExtractor winFileItemExtractor = new WinFileItemExtractor();
        return winFileItemExtractor.extract(fileObject, ovalEntityMappingContext).getExtractedItems().stream()
                .map(item -> (FileItem) item).collect(Collectors.toList());
    }
    private List<FileItem> getItemByFilepath(String filepath, OperationEnumeration filepathOperation) throws Exception {
        if (filepathOperation == null)
            filepathOperation = OperationEnumeration.EQUALS;
        FileObject fileObject = new FileObject();
        EntityObjectStringType filepathEntity = new EntityObjectStringType();
        filepathEntity.setValue(filepath);
        filepathEntity.setOperation(filepathOperation);
        fileObject.setFilepath(filepathEntity);

        OvalEntityMappingContext ovalEntityMappingContext = new OvalEntityMappingContext();
        ovalEntityMappingContext.putObjectType("fileObject-1", fileObject);

        WinFileItemExtractor winFileItemExtractor = new WinFileItemExtractor();
        return winFileItemExtractor.extract(fileObject, ovalEntityMappingContext).getExtractedItems().stream()
                .map(item -> (FileItem) item).collect(Collectors.toList());
    }

}