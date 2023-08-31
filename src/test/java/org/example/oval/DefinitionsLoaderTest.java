package org.example.oval;

import org.junit.Test;
import org.mitre.oval.xmlschema.oval_common_5.ClassEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5.*;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.*;
import java.util.Set;
import java.util.stream.Collectors;

public class DefinitionsLoaderTest {
    @Test
    public void testLoadDefinitionsFile() throws JAXBException, IOException {
        File ovalDefFile = new File("src/main/resources/microsoft.windows11.vulnerability.xml");
        OvalDefinitionsLoader ovalDefinitionsLoader = new OvalDefinitionsLoader();
        OvalDefinitions ovalDefinitions = ovalDefinitionsLoader.load(ovalDefFile);
        System.out.println(ovalDefinitions);
    }
    @Test
    public void testPrintExtendDefClass() throws JAXBException, IOException {
        File ovalDefFile = new File("src/main/resources/all.unix.vulnerability.xml");
        OvalDefinitionsLoader ovalDefinitionsLoader = new OvalDefinitionsLoader();
        OvalDefinitions ovalDefinitions = ovalDefinitionsLoader.load(ovalDefFile);

        Set<String> extendDefinitionIds = new HashSet<>();
        Map<String, DefinitionType> definitionTypeMap = new HashMap<>();
        List<DefinitionType> definitionTypeList = ovalDefinitions.getDefinitions().getDefinition();
        for (DefinitionType definitionType : definitionTypeList) {
            definitionTypeMap.put(definitionType.getId(), definitionType);
            extendDefinitionIds.addAll(getExtendDefinitionIds(definitionType.getCriteria()));
        }
        extendDefinitionIds.forEach(item -> System.out.println(definitionTypeMap.get(item).getClazz()));
    }
    @Test
    public void testPrintDefClassUsingReferencedObject() throws JAXBException, IOException {
        File ovalDefFile = new File("src/main/resources/all.windows.vulnerability.xml");
        OvalDefinitionsLoader ovalDefinitionsLoader = new OvalDefinitionsLoader();
        OvalDefinitions ovalDefinitions = ovalDefinitionsLoader.load(ovalDefFile);

        Set<String> extendDefinitionIds = new HashSet<>();
        Map<String, DefinitionType> definitionTypeMap = new HashMap<>();
        List<DefinitionType> definitionTypeList = ovalDefinitions.getDefinitions().getDefinition();
        for (DefinitionType definitionType : definitionTypeList) {
            definitionTypeMap.put(definitionType.getId(), definitionType);
            extendDefinitionIds.addAll(getExtendDefinitionIds(definitionType.getCriteria()));
        }
        extendDefinitionIds.forEach(item -> System.out.println(definitionTypeMap.get(item).getClazz()));
    }

    @Test
    public void testPrintInventoryExtend() throws JAXBException, IOException {
        File ovalDefFile = new File("src/main/resources/all.windows.vulnerability.xml");
        OvalDefinitionsLoader ovalDefinitionsLoader = new OvalDefinitionsLoader();
        OvalDefinitions ovalDefinitions = ovalDefinitionsLoader.load(ovalDefFile);
        List<DefinitionType> definitionList = ovalDefinitions.getDefinitions().getDefinition();

        definitionList.stream()
                .filter(def -> def.getClazz() == ClassEnumeration.INVENTORY)
                .filter(def -> !getExtendDefinitionIds(def.getCriteria()).isEmpty())
                .forEach(def -> System.out.println(def.getId()));
    }

    private Set<String> getExtendDefinitionIds(CriteriaType criteriaType) {
        Set<String> extendDefinitions = new HashSet<>();
        for (Object object : criteriaType.getCriteriaOrCriterionOrExtendDefinition()) {
            if (object instanceof CriteriaType)
                extendDefinitions.addAll(getExtendDefinitionIds((CriteriaType) object));
            if (object instanceof ExtendDefinitionType == false)
                continue;
            ExtendDefinitionType extendDefinitionType = (ExtendDefinitionType) object;
            extendDefinitions.add(extendDefinitionType.getDefinitionRef());
        }
        return extendDefinitions;
    }
    private Set<String> getTestIds(CriteriaType criteriaType) {
        Set<String> testIds = new HashSet<>();
        for (Object object : criteriaType.getCriteriaOrCriterionOrExtendDefinition()) {
            if (object instanceof CriteriaType)
                testIds.addAll(getTestIds((CriteriaType) object));
            if (object instanceof CriterionType == false)
                continue;
            String testRefId = ((CriterionType) object).getTestRef();
            testIds.add(testRefId);
        }
        return testIds;
    }
    @Test
    public void test() throws IOException {
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec("cmd /c cd ../ && cd");

        String line = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}