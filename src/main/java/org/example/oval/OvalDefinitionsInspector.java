package org.example.oval;

import org.example.oval.test.OvalItemExtractorFactory;
import org.example.oval.test.impl.OvalTestExecutor;
import org.example.oval.test.OvalTestExecutorFactory;
import org.example.oval.test.OvalTestResultType;
import org.example.oval.item.OvalItemExtractor;
import org.mitre.oval.xmlschema.oval_definitions_5.*;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;

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

        VariablesType variablesType = ovalDefinitions.getVariables();
        Map<String, VariableType> variableTypeMap = new HashMap<>();
        for (JAXBElement<? extends VariableType> variableType : variablesType.getVariable())
            variableTypeMap.put(variableType.getValue().getId(), variableType.getValue());

        for (String testId : testIds) {
            TestType testType = testTypeMap.get(testId);
            if (testType == null)
                throw new Exception("testType is not exist");
            try {
                // system char 정보를 얻어오는 부분, variable을 참조해서 넘겨주는 부분이 선행되어야 한다.
                // 시스템에 대한 정보를 얻어오는 부분 == charactoristic

                // test의 리스트가 있고, item 정보들에 대한 정보가 있음
                // 해당 item 정보가 다음 테스트에 인자로 들어가서 참조할 수 있도록

                // local variable 안에 object_ref 를 사용하는 곳이 있을 때
                // item을 만들기 위한 test에서 참조되는 대상 item(var 형태)을 만드는 test를 참조하는지
                OvalItemExtractor extractor =
                        OvalItemExtractorFactory.getInstance(testType, objectTypeMap, variableTypeMap);
                List<ItemType> itemTypes = extractor.extract();

                // test executor 가 수행할 테스트와 오브젝트를 이미 갖고있어야함
                OvalTestExecutor executor = OvalTestExecutorFactory.getInstance(testType);
                testResultMap.put(testType.getId(), executor.execute(stateTypeMap, itemTypes));
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
