package org.example.oval;

import org.junit.Test;
import org.mitre.oval.xmlschema.oval_definitions_5.*;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;

public class DefinitionsLoaderTest {
    @Test
    public void testLoadDefinitionsFile() throws JAXBException, IOException {
        File ovalDefFile = new File("src/main/resources/microsoft.windows11.vulnerability.xml");
        OvalDefinitionsLoader ovalDefinitionsLoader = new OvalDefinitionsLoader();
        OvalDefinitions ovalDefinitions = ovalDefinitionsLoader.load(ovalDefFile);
        System.out.println(ovalDefinitions);
    }

    @Test
    public void test() throws JAXBException, IOException {
        File ovalDefFile = new File("src/main/resources/all.windows.vulnerability.xml");
        OvalDefinitionsLoader ovalDefinitionsLoader = new OvalDefinitionsLoader();
        OvalDefinitions ovalDefinitions = ovalDefinitionsLoader.load(ovalDefFile);
        OvalEntityMapping ovalEntityMapping = new OvalEntityMapping();
        ovalEntityMapping.init(ovalDefinitions);
        java.util.Set<Class> classSet = new HashSet<>();
        VariablesType variablesType = ovalDefinitions.getVariables();
        if (variablesType == null) {
            System.out.println("there is no variable");
            return;
        }
        List<JAXBElement<? extends VariableType>> variableList = variablesType.getVariable();
        for (JAXBElement<? extends VariableType> jaxbElement : variableList) {
            VariableType variableType = jaxbElement.getValue();
            if (variableType instanceof LocalVariable == false)
                continue;

            LocalVariable localVariable = (LocalVariable) variableType;
            if (localVariable.getObjectComponent() == null)
                continue;

            ObjectComponentType objectComponent = localVariable.getObjectComponent();
            String objectRef = objectComponent.getObjectRef();
            ObjectType objectType = ovalEntityMapping.getObjectType(objectRef);
            classSet.add(objectType.getClass());
        }
        classSet.forEach(System.out::println);
    }

    @Test
    public void testCommand() throws IOException {
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec("cmd /c cd ../ && cd");

        String line = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}