package org.example.oval;

import org.example.oval.test.OvalTestResultType;
import org.junit.Test;
import org.mitre.oval.xmlschema.oval_common_5.OperatorEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5.CriteriaType;
import org.mitre.oval.xmlschema.oval_definitions_5.CriterionType;
import org.mitre.oval.xmlschema.oval_definitions_5.DefinitionType;
import org.mitre.oval.xmlschema.oval_definitions_5.ExtendDefinitionType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OvalCriteriaCheckerTest {

    @Test
    public void testCriterionAND() {
        List<Object> mockCriteriaList = new ArrayList<>();
        for (int i=1 ; i<=3 ; i++) {
            CriterionType criterionType = new CriterionType();
            criterionType.setTestRef("criterion-" + i);
            mockCriteriaList.add(criterionType);
        }
        FakeCriteriaType criteriaType = new FakeCriteriaType();
        criteriaType.setCriteriaOrCriterionOrExtendDefinition(mockCriteriaList);
        criteriaType.setOperator(OperatorEnumeration.AND);
        { // all true
            Map<String, OvalTestResultType> testResultMap = new HashMap<>();
            testResultMap.put("criterion-1", OvalTestResultType.TRUE);
            testResultMap.put("criterion-2", OvalTestResultType.TRUE);
            testResultMap.put("criterion-3", OvalTestResultType.TRUE);
            OvalCriteriaChecker criteriaChecker = new OvalCriteriaChecker();
            criteriaChecker.init(testResultMap, null, null);
            OvalCriteriaResultType criteriaResultType = criteriaChecker.check(criteriaType);
            assert criteriaResultType.equals(OvalCriteriaResultType.TRUE);
        }
        { // one false
            Map<String, OvalTestResultType> testResultMap = new HashMap<>();
            testResultMap.put("criterion-1", OvalTestResultType.TRUE);
            testResultMap.put("criterion-2", OvalTestResultType.TRUE);
            testResultMap.put("criterion-3", OvalTestResultType.FALSE);
            OvalCriteriaChecker criteriaChecker = new OvalCriteriaChecker();
            criteriaChecker.init(testResultMap, null, null);
            OvalCriteriaResultType criteriaResultType = criteriaChecker.check(criteriaType);
            assert criteriaResultType.equals(OvalCriteriaResultType.FALSE);
        }
        { // one unknown
            Map<String, OvalTestResultType> testResultMap = new HashMap<>();
            testResultMap.put("criterion-1", OvalTestResultType.TRUE);
            testResultMap.put("criterion-2", OvalTestResultType.FALSE);
            testResultMap.put("criterion-3", OvalTestResultType.UNKNOWN);
            OvalCriteriaChecker criteriaChecker = new OvalCriteriaChecker();
            criteriaChecker.init(testResultMap, null, null);
            OvalCriteriaResultType criteriaResultType = criteriaChecker.check(criteriaType);
            assert criteriaResultType.equals(OvalCriteriaResultType.UNKNOWN);
        }
        { // one error
            Map<String, OvalTestResultType> testResultMap = new HashMap<>();
            testResultMap.put("criterion-1", OvalTestResultType.TRUE);
            testResultMap.put("criterion-2", OvalTestResultType.FALSE);
            testResultMap.put("criterion-3", OvalTestResultType.ERROR);
            OvalCriteriaChecker criteriaChecker = new OvalCriteriaChecker();
            criteriaChecker.init(testResultMap, null, null);
            OvalCriteriaResultType criteriaResultType = criteriaChecker.check(criteriaType);
            assert criteriaResultType.equals(OvalCriteriaResultType.ERROR);
        }
    }

    @Test
    public void testCriterionOR() {
        List<Object> mockCriteriaList = new ArrayList<>();
        for (int i=1 ; i<=3 ; i++) {
            CriterionType criterionType = new CriterionType();
            criterionType.setTestRef("criterion-" + i);
            mockCriteriaList.add(criterionType);
        }
        FakeCriteriaType criteriaType = new FakeCriteriaType();
        criteriaType.setCriteriaOrCriterionOrExtendDefinition(mockCriteriaList);
        criteriaType.setOperator(OperatorEnumeration.OR);
        { // all true
            Map<String, OvalTestResultType> testResultMap = new HashMap<>();
            testResultMap.put("criterion-1", OvalTestResultType.TRUE);
            testResultMap.put("criterion-2", OvalTestResultType.TRUE);
            testResultMap.put("criterion-3", OvalTestResultType.TRUE);
            OvalCriteriaChecker criteriaChecker = new OvalCriteriaChecker();
            criteriaChecker.init(testResultMap, null, null);
            OvalCriteriaResultType criteriaResultType = criteriaChecker.check(criteriaType);
            assert criteriaResultType.equals(OvalCriteriaResultType.TRUE);
        }
        { // one false
            Map<String, OvalTestResultType> testResultMap = new HashMap<>();
            testResultMap.put("criterion-1", OvalTestResultType.TRUE);
            testResultMap.put("criterion-2", OvalTestResultType.TRUE);
            testResultMap.put("criterion-3", OvalTestResultType.FALSE);
            OvalCriteriaChecker criteriaChecker = new OvalCriteriaChecker();
            criteriaChecker.init(testResultMap, null, null);
            OvalCriteriaResultType criteriaResultType = criteriaChecker.check(criteriaType);
            assert criteriaResultType.equals(OvalCriteriaResultType.TRUE);
        }
        { // all false
            Map<String, OvalTestResultType> testResultMap = new HashMap<>();
            testResultMap.put("criterion-1", OvalTestResultType.FALSE);
            testResultMap.put("criterion-2", OvalTestResultType.FALSE);
            testResultMap.put("criterion-3", OvalTestResultType.FALSE);
            OvalCriteriaChecker criteriaChecker = new OvalCriteriaChecker();
            criteriaChecker.init(testResultMap, null, null);
            OvalCriteriaResultType criteriaResultType = criteriaChecker.check(criteriaType);
            assert criteriaResultType.equals(OvalCriteriaResultType.FALSE);
        }
        { // one unknown
            Map<String, OvalTestResultType> testResultMap = new HashMap<>();
            testResultMap.put("criterion-1", OvalTestResultType.TRUE);
            testResultMap.put("criterion-2", OvalTestResultType.FALSE);
            testResultMap.put("criterion-3", OvalTestResultType.UNKNOWN);
            OvalCriteriaChecker criteriaChecker = new OvalCriteriaChecker();
            criteriaChecker.init(testResultMap, null, null);
            OvalCriteriaResultType criteriaResultType = criteriaChecker.check(criteriaType);
            assert criteriaResultType.equals(OvalCriteriaResultType.UNKNOWN);
        }
        { // one error
            Map<String, OvalTestResultType> testResultMap = new HashMap<>();
            testResultMap.put("criterion-1", OvalTestResultType.TRUE);
            testResultMap.put("criterion-2", OvalTestResultType.FALSE);
            testResultMap.put("criterion-3", OvalTestResultType.ERROR);
            OvalCriteriaChecker criteriaChecker = new OvalCriteriaChecker();
            criteriaChecker.init(testResultMap, null, null);
            OvalCriteriaResultType criteriaResultType = criteriaChecker.check(criteriaType);
            assert criteriaResultType.equals(OvalCriteriaResultType.ERROR);
        }
    }

    @Test
    public void testCriterionONE() {
        List<Object> mockCriteriaList = new ArrayList<>();
        for (int i=1 ; i<=3 ; i++) {
            CriterionType criterionType = new CriterionType();
            criterionType.setTestRef("criterion-" + i);
            mockCriteriaList.add(criterionType);
        }
        FakeCriteriaType criteriaType = new FakeCriteriaType();
        criteriaType.setCriteriaOrCriterionOrExtendDefinition(mockCriteriaList);
        criteriaType.setOperator(OperatorEnumeration.ONE);
        { // one true
            Map<String, OvalTestResultType> testResultMap = new HashMap<>();
            testResultMap.put("criterion-1", OvalTestResultType.TRUE);
            testResultMap.put("criterion-2", OvalTestResultType.FALSE);
            testResultMap.put("criterion-3", OvalTestResultType.FALSE);
            OvalCriteriaChecker criteriaChecker = new OvalCriteriaChecker();
            criteriaChecker.init(testResultMap, null, null);
            OvalCriteriaResultType criteriaResultType = criteriaChecker.check(criteriaType);
            assert criteriaResultType.equals(OvalCriteriaResultType.TRUE);
        }
        { // two true
            Map<String, OvalTestResultType> testResultMap = new HashMap<>();
            testResultMap.put("criterion-1", OvalTestResultType.TRUE);
            testResultMap.put("criterion-2", OvalTestResultType.TRUE);
            testResultMap.put("criterion-3", OvalTestResultType.FALSE);
            OvalCriteriaChecker criteriaChecker = new OvalCriteriaChecker();
            criteriaChecker.init(testResultMap, null, null);
            OvalCriteriaResultType criteriaResultType = criteriaChecker.check(criteriaType);
            assert criteriaResultType.equals(OvalCriteriaResultType.FALSE);
        }
        { // one unknown
            Map<String, OvalTestResultType> testResultMap = new HashMap<>();
            testResultMap.put("criterion-1", OvalTestResultType.TRUE);
            testResultMap.put("criterion-2", OvalTestResultType.FALSE);
            testResultMap.put("criterion-3", OvalTestResultType.UNKNOWN);
            OvalCriteriaChecker criteriaChecker = new OvalCriteriaChecker();
            criteriaChecker.init(testResultMap, null, null);
            OvalCriteriaResultType criteriaResultType = criteriaChecker.check(criteriaType);
            assert criteriaResultType.equals(OvalCriteriaResultType.UNKNOWN);
        }
        { // one error
            Map<String, OvalTestResultType> testResultMap = new HashMap<>();
            testResultMap.put("criterion-1", OvalTestResultType.TRUE);
            testResultMap.put("criterion-2", OvalTestResultType.FALSE);
            testResultMap.put("criterion-3", OvalTestResultType.ERROR);
            OvalCriteriaChecker criteriaChecker = new OvalCriteriaChecker();
            criteriaChecker.init(testResultMap, null, null);
            OvalCriteriaResultType criteriaResultType = criteriaChecker.check(criteriaType);
            assert criteriaResultType.equals(OvalCriteriaResultType.ERROR);
        }
    }

    @Test
    public void testCriterionXOR() {
        List<Object> mockCriteriaList = new ArrayList<>();
        for (int i=1 ; i<=3 ; i++) {
            CriterionType criterionType = new CriterionType();
            criterionType.setTestRef("criterion-" + i);
            mockCriteriaList.add(criterionType);
        }
        FakeCriteriaType criteriaType = new FakeCriteriaType();
        criteriaType.setCriteriaOrCriterionOrExtendDefinition(mockCriteriaList);
        criteriaType.setOperator(OperatorEnumeration.XOR);
        { // three true
            Map<String, OvalTestResultType> testResultMap = new HashMap<>();
            testResultMap.put("criterion-1", OvalTestResultType.TRUE);
            testResultMap.put("criterion-2", OvalTestResultType.TRUE);
            testResultMap.put("criterion-3", OvalTestResultType.TRUE);
            OvalCriteriaChecker criteriaChecker = new OvalCriteriaChecker();
            criteriaChecker.init(testResultMap, null, null);
            OvalCriteriaResultType criteriaResultType = criteriaChecker.check(criteriaType);
            assert criteriaResultType.equals(OvalCriteriaResultType.TRUE);
        }
        { // two true
            Map<String, OvalTestResultType> testResultMap = new HashMap<>();
            testResultMap.put("criterion-1", OvalTestResultType.TRUE);
            testResultMap.put("criterion-2", OvalTestResultType.TRUE);
            testResultMap.put("criterion-3", OvalTestResultType.FALSE);
            OvalCriteriaChecker criteriaChecker = new OvalCriteriaChecker();
            criteriaChecker.init(testResultMap, null, null);
            OvalCriteriaResultType criteriaResultType = criteriaChecker.check(criteriaType);
            assert criteriaResultType.equals(OvalCriteriaResultType.FALSE);
        }
        { // one true
            Map<String, OvalTestResultType> testResultMap = new HashMap<>();
            testResultMap.put("criterion-1", OvalTestResultType.TRUE);
            testResultMap.put("criterion-2", OvalTestResultType.FALSE);
            testResultMap.put("criterion-3", OvalTestResultType.FALSE);
            OvalCriteriaChecker criteriaChecker = new OvalCriteriaChecker();
            criteriaChecker.init(testResultMap, null, null);
            OvalCriteriaResultType criteriaResultType = criteriaChecker.check(criteriaType);
            assert criteriaResultType.equals(OvalCriteriaResultType.TRUE);
        }
        { // all false
            Map<String, OvalTestResultType> testResultMap = new HashMap<>();
            testResultMap.put("criterion-1", OvalTestResultType.FALSE);
            testResultMap.put("criterion-2", OvalTestResultType.FALSE);
            testResultMap.put("criterion-3", OvalTestResultType.FALSE);
            OvalCriteriaChecker criteriaChecker = new OvalCriteriaChecker();
            criteriaChecker.init(testResultMap, null, null);
            OvalCriteriaResultType criteriaResultType = criteriaChecker.check(criteriaType);
            assert criteriaResultType.equals(OvalCriteriaResultType.FALSE);
        }
        { // one unknown
            Map<String, OvalTestResultType> testResultMap = new HashMap<>();
            testResultMap.put("criterion-1", OvalTestResultType.TRUE);
            testResultMap.put("criterion-2", OvalTestResultType.TRUE);
            testResultMap.put("criterion-3", OvalTestResultType.UNKNOWN);
            OvalCriteriaChecker criteriaChecker = new OvalCriteriaChecker();
            criteriaChecker.init(testResultMap, null, null);
            OvalCriteriaResultType criteriaResultType = criteriaChecker.check(criteriaType);
            assert criteriaResultType.equals(OvalCriteriaResultType.UNKNOWN);
        }
        { // one error
            Map<String, OvalTestResultType> testResultMap = new HashMap<>();
            testResultMap.put("criterion-1", OvalTestResultType.TRUE);
            testResultMap.put("criterion-2", OvalTestResultType.TRUE);
            testResultMap.put("criterion-3", OvalTestResultType.ERROR);
            OvalCriteriaChecker criteriaChecker = new OvalCriteriaChecker();
            criteriaChecker.init(testResultMap, null, null);
            OvalCriteriaResultType criteriaResultType = criteriaChecker.check(criteriaType);
            assert criteriaResultType.equals(OvalCriteriaResultType.ERROR);
        }
    }

    @Test
    public void testCriteria() {
        List<Object> mockCriteriaList = new ArrayList<>();
        List<Object> criterions1 = new ArrayList<>();
        for (int i=1 ; i<=3 ; i++) {
            CriterionType criterionType = new CriterionType();
            criterionType.setTestRef("criterion-" + i);
            criterions1.add(criterionType);
        }
        FakeCriteriaType innerCriteria1 = new FakeCriteriaType();
        innerCriteria1.setCriteriaOrCriterionOrExtendDefinition(criterions1);
        mockCriteriaList.add(innerCriteria1);

        List<Object> criterions2 = new ArrayList<>();
        for (int i=4 ; i<=6 ; i++) {
            CriterionType criterionType = new CriterionType();
            criterionType.setTestRef("criterion-" + i);
            criterions2.add(criterionType);
        }
        FakeCriteriaType innerCriteria2 = new FakeCriteriaType();
        innerCriteria2.setCriteriaOrCriterionOrExtendDefinition(criterions2);
        mockCriteriaList.add(innerCriteria2);

        FakeCriteriaType criteriaType = new FakeCriteriaType();
        criteriaType.setCriteriaOrCriterionOrExtendDefinition(mockCriteriaList);
        criteriaType.setOperator(OperatorEnumeration.AND);
        { // true, false
            Map<String, OvalTestResultType> testResultMap = new HashMap<>();
            testResultMap.put("criterion-1", OvalTestResultType.TRUE);
            testResultMap.put("criterion-2", OvalTestResultType.TRUE);
            testResultMap.put("criterion-3", OvalTestResultType.TRUE);
            testResultMap.put("criterion-4", OvalTestResultType.FALSE);
            testResultMap.put("criterion-5", OvalTestResultType.FALSE);
            testResultMap.put("criterion-6", OvalTestResultType.FALSE);
            OvalCriteriaChecker criteriaChecker = new OvalCriteriaChecker();
            criteriaChecker.init(testResultMap, null, null);
            OvalCriteriaResultType criteriaResultType = criteriaChecker.check(criteriaType);
            assert criteriaResultType.equals(OvalCriteriaResultType.FALSE);
        }
        { // true, true
            Map<String, OvalTestResultType> testResultMap = new HashMap<>();
            testResultMap.put("criterion-1", OvalTestResultType.TRUE);
            testResultMap.put("criterion-2", OvalTestResultType.TRUE);
            testResultMap.put("criterion-3", OvalTestResultType.TRUE);
            testResultMap.put("criterion-4", OvalTestResultType.TRUE);
            testResultMap.put("criterion-5", OvalTestResultType.TRUE);
            testResultMap.put("criterion-6", OvalTestResultType.TRUE);
            OvalCriteriaChecker criteriaChecker = new OvalCriteriaChecker();
            criteriaChecker.init(testResultMap, null, null);
            OvalCriteriaResultType criteriaResultType = criteriaChecker.check(criteriaType);
            assert criteriaResultType.equals(OvalCriteriaResultType.TRUE);
        }
    }

    @Test
    public void testExtendDefinition() {
        Map<String, DefinitionType> definitionMap = new HashMap<>();
        definitionMap.put("def-1", makeMockExtendDefinitionType("1"));
        definitionMap.put("def-2", makeMockExtendDefinitionType("2"));

        List<Object> mockCriteriaList = new ArrayList<>();
        ExtendDefinitionType extendDefinitionType1 = new ExtendDefinitionType();
        extendDefinitionType1.setDefinitionRef("def-1");
        mockCriteriaList.add(extendDefinitionType1);

        ExtendDefinitionType extendDefinitionType2 = new ExtendDefinitionType();
        extendDefinitionType2.setDefinitionRef("def-2");
        mockCriteriaList.add(extendDefinitionType2);

        FakeCriteriaType criteriaType = new FakeCriteriaType();
        criteriaType.setCriteriaOrCriterionOrExtendDefinition(mockCriteriaList);
        criteriaType.setOperator(OperatorEnumeration.AND);

        { // true, true
            Map<String, OvalTestResultType> testResultMap = new HashMap<>();
            testResultMap.put("extend-criterion1-1", OvalTestResultType.TRUE);
            testResultMap.put("extend-criterion1-2", OvalTestResultType.TRUE);
            testResultMap.put("extend-criterion1-3", OvalTestResultType.TRUE);
            testResultMap.put("extend-criterion2-1", OvalTestResultType.TRUE);
            testResultMap.put("extend-criterion2-2", OvalTestResultType.TRUE);
            testResultMap.put("extend-criterion2-3", OvalTestResultType.TRUE);
            OvalCriteriaChecker criteriaChecker = new OvalCriteriaChecker();
            criteriaChecker.init(testResultMap, definitionMap, new HashMap<>());
            OvalCriteriaResultType criteriaResultType = criteriaChecker.check(criteriaType);
            assert criteriaResultType.equals(OvalCriteriaResultType.TRUE);
        }
        { // true, false
            Map<String, OvalTestResultType> testResultMap = new HashMap<>();
            testResultMap.put("extend-criterion1-1", OvalTestResultType.TRUE);
            testResultMap.put("extend-criterion1-2", OvalTestResultType.TRUE);
            testResultMap.put("extend-criterion1-3", OvalTestResultType.TRUE);
            testResultMap.put("extend-criterion2-1", OvalTestResultType.TRUE);
            testResultMap.put("extend-criterion2-2", OvalTestResultType.TRUE);
            testResultMap.put("extend-criterion2-3", OvalTestResultType.FALSE);
            OvalCriteriaChecker criteriaChecker = new OvalCriteriaChecker();
            criteriaChecker.init(testResultMap, definitionMap, new HashMap<>());
            OvalCriteriaResultType criteriaResultType = criteriaChecker.check(criteriaType);
            assert criteriaResultType.equals(OvalCriteriaResultType.FALSE);
        }
        { // unknown, false == unknown
            Map<String, OvalCriteriaResultType> definitionResultMap = new HashMap<>();
            Map<String, OvalTestResultType> testResultMap = new HashMap<>();
            testResultMap.put("extend-criterion1-1", OvalTestResultType.TRUE);
            testResultMap.put("extend-criterion1-2", OvalTestResultType.TRUE);
            testResultMap.put("extend-criterion1-3", OvalTestResultType.UNKNOWN);
            testResultMap.put("extend-criterion2-1", OvalTestResultType.FALSE);
            testResultMap.put("extend-criterion2-2", OvalTestResultType.FALSE);
            testResultMap.put("extend-criterion2-3", OvalTestResultType.FALSE);
            OvalCriteriaChecker criteriaChecker = new OvalCriteriaChecker();
            criteriaChecker.init(testResultMap, definitionMap, definitionResultMap);
            OvalCriteriaResultType criteriaResultType = criteriaChecker.check(criteriaType);
            assert criteriaResultType.equals(OvalCriteriaResultType.UNKNOWN);
            assert definitionResultMap.get("def-1").equals(OvalCriteriaResultType.UNKNOWN);
            assert definitionResultMap.get("def-2").equals(OvalCriteriaResultType.FALSE);
        }
        { // error, false == error
            Map<String, OvalCriteriaResultType> definitionResultMap = new HashMap<>();
            Map<String, OvalTestResultType> testResultMap = new HashMap<>();
            testResultMap.put("extend-criterion1-1", OvalTestResultType.TRUE);
            testResultMap.put("extend-criterion1-2", OvalTestResultType.TRUE);
            testResultMap.put("extend-criterion1-3", OvalTestResultType.ERROR);
            testResultMap.put("extend-criterion2-1", OvalTestResultType.TRUE);
            testResultMap.put("extend-criterion2-2", OvalTestResultType.FALSE);
            testResultMap.put("extend-criterion2-3", OvalTestResultType.UNKNOWN);
            OvalCriteriaChecker criteriaChecker = new OvalCriteriaChecker();
            criteriaChecker.init(testResultMap, definitionMap, definitionResultMap);
            OvalCriteriaResultType criteriaResultType = criteriaChecker.check(criteriaType);
            assert criteriaResultType.equals(OvalCriteriaResultType.ERROR);
            assert definitionResultMap.get("def-1").equals(OvalCriteriaResultType.ERROR);
            assert definitionResultMap.get("def-2").equals(OvalCriteriaResultType.UNKNOWN);
        }
    }

    @Test
    public void testTestResultNullError() {
        List<Object> mockCriteriaList = new ArrayList<>();
        for (int i=1 ; i<=3 ; i++) {
            CriterionType criterionType = new CriterionType();
            criterionType.setTestRef("criterion-" + i);
            mockCriteriaList.add(criterionType);
        }
        FakeCriteriaType criteriaType = new FakeCriteriaType();
        criteriaType.setCriteriaOrCriterionOrExtendDefinition(mockCriteriaList);
        criteriaType.setOperator(OperatorEnumeration.AND);
        {
            Map<String, OvalTestResultType> testResultMap = new HashMap<>();
            testResultMap.put("criterion-1", OvalTestResultType.TRUE);
            testResultMap.put("criterion-2", OvalTestResultType.TRUE);
            OvalCriteriaChecker criteriaChecker = new OvalCriteriaChecker();
            criteriaChecker.init(testResultMap, null, null);
            OvalCriteriaResultType criteriaResultType = criteriaChecker.check(criteriaType);
            assert criteriaResultType.equals(OvalCriteriaResultType.ERROR);
        }
    }

    @Test
    public void testCriteriaItemError() {
        List<Object> mockCriteriaList = new ArrayList<>();
        mockCriteriaList.add(new ArrayList<>());
        for (int i=1 ; i<=3 ; i++) {
            CriterionType criterionType = new CriterionType();
            criterionType.setTestRef("criterion-" + i);
            mockCriteriaList.add(criterionType);
        }
        FakeCriteriaType criteriaType = new FakeCriteriaType();
        criteriaType.setCriteriaOrCriterionOrExtendDefinition(mockCriteriaList);
        criteriaType.setOperator(OperatorEnumeration.AND);
        {
            Map<String, OvalTestResultType> testResultMap = new HashMap<>();
            testResultMap.put("criterion-1", OvalTestResultType.TRUE);
            testResultMap.put("criterion-2", OvalTestResultType.TRUE);
            testResultMap.put("criterion-3", OvalTestResultType.TRUE);
            OvalCriteriaChecker criteriaChecker = new OvalCriteriaChecker();
            criteriaChecker.init(testResultMap, null, null);
            OvalCriteriaResultType criteriaResultType = criteriaChecker.check(criteriaType);
            assert criteriaResultType.equals(OvalCriteriaResultType.ERROR);
        }
    }

    private DefinitionType makeMockExtendDefinitionType(String id) {
        List<Object> mockCriteriaList = new ArrayList<>();
        for (int i=1 ; i<=3 ; i++) {
            CriterionType criterionType = new CriterionType();
            criterionType.setTestRef("extend-criterion" + id + "-" + i);
            mockCriteriaList.add(criterionType);
        }
        FakeCriteriaType criteriaType = new FakeCriteriaType();
        criteriaType.setCriteriaOrCriterionOrExtendDefinition(mockCriteriaList);
        DefinitionType definitionType = new DefinitionType();
        definitionType.setId("def-" + id);
        definitionType.setCriteria(criteriaType);
        return definitionType;
    }

    private class FakeCriteriaType extends CriteriaType {
        public void setCriteriaOrCriterionOrExtendDefinition(List<Object> objects) {
            this.criteriaOrCriterionOrExtendDefinition = objects;
        }
    }

}