package org.example.oval.item.impl;

import org.example.oval.OvalEntityMapping;
import org.junit.Test;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectRefType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileTest;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import java.io.File;
import java.net.URI;
import java.util.List;

public class WinFileItemExtractorTest {

    @Test
    public void test() throws Exception {
        FileTest fileTest = new FileTest();
        fileTest.setId("fileTest-1");

        ObjectRefType objectRefType = new ObjectRefType();
        objectRefType.setObjectRef("fileObject-1");
        fileTest.setObject(objectRefType);

        FileObject fileObject = new FileObject();
        EntityObjectStringType path = new EntityObjectStringType();
        path.setValue("C:\\Users\\82105\\IdeaProjects\\ovalDemo\\target");
        fileObject.setPath(path);
        EntityObjectStringType filename = new EntityObjectStringType();
        filename.setValue("hello.txt");
        JAXBElement<EntityObjectStringType> filenameElement = new JAXBElement<>(
                QName.valueOf("filename"),
                EntityObjectStringType.class,
                filename);
        fileObject.setFilename(filenameElement);

        OvalEntityMapping ovalEntityMapping = new OvalEntityMapping();
        ovalEntityMapping.addObjectType("fileObject-1", fileObject);

        WinFileItemExtractor winFileItemExtractor = new WinFileItemExtractor(fileTest, ovalEntityMapping);
        List<ItemType> items = winFileItemExtractor.extract();
    }

    @Test
    public void testExist() {
        File file = new File(".");
        System.out.println(file.getAbsolutePath());
        file = new File(file.getAbsolutePath().toLowerCase());
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
    }

}