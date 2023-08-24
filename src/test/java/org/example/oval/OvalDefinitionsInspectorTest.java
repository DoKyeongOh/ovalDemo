package org.example.oval;

import org.junit.Test;
import org.mitre.oval.xmlschema.oval_definitions_5.OvalDefinitions;

import java.io.File;

public class OvalDefinitionsInspectorTest {

    @Test
    public void test() throws Exception {
        File ovalDefFile = new File("src/main/resources/unix.test.vulnerability.xml");
        OvalDefinitionsLoader ovalDefinitionsLoader = new OvalDefinitionsLoader();
        OvalDefinitions ovalDefinitions = ovalDefinitionsLoader.load(ovalDefFile);
        OvalDefinitionsInspector inspector = new OvalDefinitionsInspector();
        OvalInspectResult inspect = inspector.inspect(ovalDefinitions);
    }

}