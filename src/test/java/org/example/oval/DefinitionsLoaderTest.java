package org.example.oval;

import org.junit.Test;
import org.mitre.oval.xmlschema.oval_definitions_5.OvalDefinitions;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.IOException;

public class DefinitionsLoaderTest {
    @Test
    public void testLoadDefinitionsFile() throws JAXBException, IOException {
        File ovalDefFile = new File("src/main/resources/microsoft.windows11.vulnerability.xml");
        OvalDefinitionsLoader ovalDefinitionsLoader = new OvalDefinitionsLoader();
        OvalDefinitions ovalDefinitions = ovalDefinitionsLoader.load(ovalDefFile);
        System.out.println(ovalDefinitions);
    }
}