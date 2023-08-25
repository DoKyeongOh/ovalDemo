package org.example.oval;

import org.example.oval.test.OvalTestExecutor;
import org.example.oval.test.OvalTestExecutorFactory;
import org.example.oval.test.OvalTestResultType;
import org.mitre.oval.xmlschema.oval_definitions_5.*;

import javax.xml.bind.JAXBElement;
import java.util.Set;
import java.util.*;

public class OvalDefinitionsInspector {
    private Map<String, DefinitionType> definitionMap;
    private Map<String, OvalTestResultType> testResultMap;
    private Map<String, OvalCriteriaResultType> definitionResultMap;

    private void init() {
        definitionMap = new HashMap<>();
        testResultMap = new HashMap<>();
        definitionResultMap = new HashMap<>();
    }

    public OvalInspectResult inspect(OvalDefinitions ovalDefinitions) throws Exception {
        init();
        DefinitionsType definitions = ovalDefinitions.getDefinitions();
        List<DefinitionType> definitionTypes = definitions.getDefinition();
        Set<String> testIds = new HashSet<>();
        for (DefinitionType definitionType : definitionTypes) {
            definitionMap.put(definitionType.getId(), definitionType);
            CriteriaType criteriaType = definitionType.getCriteria();
            testIds.addAll(extractTestIds(criteriaType));
        }

        TestsType testsType = ovalDefinitions.getTests();
        Map<String, TestType> testTypeMap = new HashMap<>();
        for (JAXBElement<? extends TestType> testType : testsType.getTest())
            testTypeMap.put(testType.getValue().getId(), testType.getValue());

        StatesType statesType = ovalDefinitions.getStates();
        Map<String, StateType> stateTypeMap = new HashMap<>();
        for (JAXBElement<? extends StateType> stateType : statesType.getState())
            stateTypeMap.put(stateType.getValue().getId(), stateType.getValue());

        ObjectsType objectsType = ovalDefinitions.getObjects();
        Map<String, ObjectType> objectTypeMap = new HashMap<>();
        for (JAXBElement<? extends ObjectType> objectType : objectsType.getObject())
            objectTypeMap.put(objectType.getValue().getId(), objectType.getValue());

        for (String testId : testIds) {
            TestType testType = testTypeMap.get(testId);
            if (testType == null)
                throw new Exception("testType is not exist");
            try {
                OvalTestExecutor executor = OvalTestExecutorFactory.getInstance(testType);
                executor.init(stateTypeMap, objectTypeMap);
                testResultMap.put(testType.getId(), executor.execute());
            } catch (Exception e) {
                testResultMap.put(testType.getId(), OvalTestResultType.ERROR);
                System.out.println(e.getMessage());
            }
        }

        OvalInspectResult result = new OvalInspectResult();
        for (DefinitionType definitionType : definitionTypes) {
            if (definitionResultMap.get(definitionType.getId()) != null)
                continue;
            try {
                OvalCriteriaChecker criteriaChecker = new OvalCriteriaChecker();
                criteriaChecker.init(testResultMap, definitionMap, definitionResultMap);
                definitionResultMap.put(definitionType.getId(), criteriaChecker.check(definitionType.getCriteria()));
            } catch (Exception e) {
                definitionResultMap.put(definitionType.getId(), OvalCriteriaResultType.ERROR);
            }
        }
        return result;
    }

    private Set<String> extractTestIds(CriteriaType criteriaType) {
        Set<String> testIds = new HashSet<>();
        for (Object object : criteriaType.getCriteriaOrCriterionOrExtendDefinition()) {
            if (object instanceof CriteriaType)
                testIds.addAll(extractTestIds((CriteriaType) object));
            if (object instanceof CriterionType == false)
                continue;
            String testRefId = ((CriterionType) object).getTestRef();
            testIds.add(testRefId);
        }
        return testIds;
    }
}
