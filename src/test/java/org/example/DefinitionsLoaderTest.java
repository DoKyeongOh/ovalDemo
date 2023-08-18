package org.example;

import org.junit.Test;
import org.mitre.oval.xmlschema.oval_definitions_5.OvalDefinitions;
import org.mitre.oval.xmlschema.oval_definitions_5.TestType;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class DefinitionsLoaderTest {
    @Test
    public void testLoadDefinitionsFile() throws JAXBException, IOException {
        File ovalDefFile = new File("src/main/resources/unix.test.vulnerability.xml");
        OvalDefinitionsLoader ovalDefinitionsLoader = new OvalDefinitionsLoader();
        OvalDefinitions ovalDefinitions = ovalDefinitionsLoader.load(ovalDefFile);
        System.out.println(ovalDefinitions);
    }
}