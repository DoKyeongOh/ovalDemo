package org.example.oval;

import org.example.oval.item.ItemExtractResult;
import org.example.oval.item.OvalItemExtractor;
import org.example.oval.test.OvalTestExecutor;
import org.example.oval.test.OvalTestExecutorFactory;
import org.example.oval.test.OvalTestResultType;
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

        OvalEntityMapping ovalEntityMapping = new OvalEntityMapping();
        ovalEntityMapping.init(ovalDefinitions);

        for (String testId : testIds) {
            TestType testType = testTypeMap.get(testId);
            if (testType == null)
                throw new Exception("testType is not exist");
            try {
                // system char 정보를 얻어오는 부분, variable을 참조해서 넘겨주는 부분이 선행되어야 한다.
                // 시스템에 대한 정보를 얻어오는 부분 == charactoristic

                OvalItemExtractor extractor = OvalItemExtractorFactory.getExtractor(testType, ovalEntityMapping);
                ItemExtractResult itemExtractResult = extractor.extract();

                OvalTestExecutor executor = OvalTestExecutorFactory.getInstance(testType);
                testResultMap.put(testType.getId(), executor.execute(ovalEntityMapping,
                        itemExtractResult.getExtractedItems()));
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
