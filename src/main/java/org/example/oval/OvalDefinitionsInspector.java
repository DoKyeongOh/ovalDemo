package org.example.oval;

import org.example.oval.item.ItemExtractResult;
import org.example.oval.item.OvalItemExtractor;
import org.example.oval.item.OvalItemExtractorFactory;
import org.example.oval.test.OvalTestExecutor;
import org.example.oval.test.OvalTestExecutorFactory;
import org.example.oval.test.OvalTestResultType;
import org.mitre.oval.xmlschema.oval_definitions_5.*;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.OvalSystemCharacteristics;

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
        for (DefinitionType definitionType : definitionTypes)
            definitionMap.put(definitionType.getId(), definitionType);

        TestsType testsType = ovalDefinitions.getTests();
        Map<String, TestType> testTypeMap = new HashMap<>();
        for (JAXBElement<? extends TestType> testType : testsType.getTest())
            testTypeMap.put(testType.getValue().getId(), testType.getValue());

        // system char 정보를 얻어오는 부분, variable을 참조해서 넘겨주는 부분이 선행되어야 한다.
        // 시스템에 대한 정보를 얻어오는 부분 == characteristic
        OvalSystemCharacteristics ovalSystemCharacteristics = new OvalSystemCharacteristics();

        OvalEntityMappingContext mappingContext = new OvalEntityMappingContext();
        mappingContext.init(ovalDefinitions);

        for (ObjectType objectType : mappingContext.getAllObjectTypes()) {
            String objectId = objectType.getId();
            ItemExtractResult itemResult = mappingContext.getItemResult(objectId);
            if (itemResult != null)
                continue;

            OvalItemExtractor extractor = OvalItemExtractorFactory.getExtractor(objectType.getClass());
            itemResult = extractor.extract(objectType, mappingContext);
            mappingContext.putItemResult(objectId, itemResult);
        }

        for (TestType testType : testTypeMap.values()) {
            try {
                OvalTestExecutor executor = OvalTestExecutorFactory.getInstance(testType);
                testResultMap.put(testType.getId(), executor.execute(mappingContext));
            } catch (Exception e) {
                testResultMap.put(testType.getId(), OvalTestResultType.ERROR);
            }
        }

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
        OvalInspectResult result = new OvalInspectResult(definitionResultMap);
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
