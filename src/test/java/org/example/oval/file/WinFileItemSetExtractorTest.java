package org.example.oval.file;

import org.example.oval.OvalEntityMapping;
import org.junit.Before;
import org.junit.Test;
import org.mitre.oval.xmlschema.oval_definitions_5.*;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.FamilyState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.EntityStateAdstypeType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileState;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.FileItem;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WinFileItemSetExtractorTest {

    private File baseDir = new File("target/temp/fileExtractorTest");
    File targetFile = new File(baseDir, "dumy0");

    @Before
    public void before() throws IOException {
        if (!baseDir.exists())
            baseDir.mkdirs();
        if (!targetFile.exists())
            targetFile.createNewFile();
    }

    @Test
    public void test() throws Exception {
        {
            List<ItemType> itemTypes = createCaseByFilepath(targetFile.getAbsolutePath(),
                    FilterActionEnumeration.INCLUDE);
            assert itemTypes.size() == 1;

            FileItem fileItem = (FileItem) itemTypes.get(0);
            assert fileItem.getFilepath().getValue().equals(targetFile.getAbsolutePath());
        }
        {
            List<ItemType> itemTypes = createCaseByFilepath(targetFile.getAbsolutePath(),
                    FilterActionEnumeration.EXCLUDE);
            assert itemTypes.size() == 0;
        }
        {
            List<ItemType> itemTypes = createCaseByFilepath("dumy string not file path",
                    FilterActionEnumeration.INCLUDE);
            assert itemTypes.size() == 0;
        }
        {
            List<ItemType> itemTypes = createCaseByFilepath("dumy string not file path",
                    FilterActionEnumeration.EXCLUDE);
            assert itemTypes.size() == 1;

            FileItem fileItem = (FileItem) itemTypes.get(0);
            assert fileItem.getFilepath().getValue().equals(targetFile.getAbsolutePath());
        }
    }

    @Test
    public void testStateNull() {
        FakeSet set = new FakeSet();
        set.setObjectReference(new ArrayList<>());
        set.setFilter(new ArrayList<>());
        OvalEntityMapping ovalEntityMapping = new OvalEntityMapping();

        FileObject fileObject = new FileObject();
        fileObject.setId("object-ref-1");
        fileObject.setFilepath(new EntityObjectStringType());
        fileObject.getFilepath().setValue("target/temp/fileExtractorTest/dumy0");
        ovalEntityMapping.addObjectType(fileObject.getId(), fileObject);
        set.getObjectReference().add(fileObject.getId());
        ovalEntityMapping.addStateType("state-ref-1", null);
        set.getFilter().add(null);

        try {
            WinFileItemSetExtractor winFileItemSetExtractor = new WinFileItemSetExtractor(set, ovalEntityMapping);
            winFileItemSetExtractor.extract();
            assert false;
        } catch (Exception e) {
            assert true;
        }
    }
    @Test
    public void testStateValueNull() {
        FakeSet set = new FakeSet();
        set.setObjectReference(new ArrayList<>());
        set.setFilter(new ArrayList<>());
        OvalEntityMapping ovalEntityMapping = new OvalEntityMapping();

        for (int i=0 ; i<2 ; i++) {
            FileObject fileObject = new FileObject();
            fileObject.setId("object-ref-"+i);
            fileObject.setFilepath(new EntityObjectStringType());
            fileObject.getFilepath().setValue("target/temp/fileExtractorTest/dumy0");
            ovalEntityMapping.addObjectType(fileObject.getId(), fileObject);
            set.getObjectReference().add(fileObject.getId());
        }

        FamilyState familyState = new FamilyState();
        ovalEntityMapping.addStateType("state-ref-1", familyState);
        Filter filter = new Filter();
        filter.setAction(FilterActionEnumeration.INCLUDE);
        filter.setValue(familyState.getId());
        set.getFilter().add(filter);

        try {
            WinFileItemSetExtractor winFileItemSetExtractor = new WinFileItemSetExtractor(set, ovalEntityMapping);
            winFileItemSetExtractor.extract();
            assert false;
        } catch (Exception e) {
            assert true;
        }
    }

    private List<ItemType> createCaseByFilepath(String filepath, FilterActionEnumeration actionEnumeration)
            throws Exception {
        FakeSet set = new FakeSet();
        set.setObjectReference(new ArrayList<>());
        set.setFilter(new ArrayList<>());
        OvalEntityMapping ovalEntityMapping = new OvalEntityMapping();

        for (int i=0 ; i<2 ; i++) {
            FileObject fileObject = new FileObject();
            fileObject.setId("object-ref-"+i);
            fileObject.setFilepath(new EntityObjectStringType());
            fileObject.getFilepath().setValue("target/temp/fileExtractorTest/dumy0");
            ovalEntityMapping.addObjectType(fileObject.getId(), fileObject);
            set.getObjectReference().add(fileObject.getId());
        }

        EntityStateStringType itemFilepath = new EntityStateAdstypeType();
        itemFilepath.setDatatype("string");
        itemFilepath.setValue(filepath);
        FileState fileState = new FileState();
        fileState.setId("state-ref-1");
        fileState.getRest().add(new JAXBElement<>(
                QName.valueOf("filepath"),
                EntityStateStringType.class,
                itemFilepath));
        ovalEntityMapping.addStateType("state-ref-1", fileState);

        Filter filter = new Filter();
        filter.setAction(actionEnumeration);
        filter.setValue(fileState.getId());

        set.getFilter().add(filter);

        WinFileItemSetExtractor winFileItemSetExtractor = new WinFileItemSetExtractor(set, ovalEntityMapping);
        return winFileItemSetExtractor.extract();
    }

    private class FakeSet extends Set {
        public void setObjectReference(List<String> objectReferences) {
            this.objectReference = objectReferences;
        }
        public void setFilter(List<Filter> filters) {
            this.filter = filters;
        }
    }

}