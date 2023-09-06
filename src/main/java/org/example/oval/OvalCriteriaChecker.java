package org.example.oval;

import org.example.oval.test.OvalTestResultType;
import org.mitre.oval.xmlschema.oval_definitions_5.CriteriaType;
import org.mitre.oval.xmlschema.oval_definitions_5.CriterionType;
import org.mitre.oval.xmlschema.oval_definitions_5.DefinitionType;
import org.mitre.oval.xmlschema.oval_definitions_5.ExtendDefinitionType;

import java.util.Map;

public class OvalCriteriaChecker {
    private int trueCount = 0;
    private boolean falseExist = false;
    private boolean unknownExist = false;
    private boolean errorExist = false;
    private Map<String, OvalTestResultType> testResultMap;
    private Map<String, DefinitionType> definitionMap;
    private Map<String, OvalCriteriaResultType> definitionResultMap;

    public void init(Map<String, OvalTestResultType> testResultMap, Map<String, DefinitionType> definitionMap,
                               Map<String, OvalCriteriaResultType> definitionResultMap) {
        trueCount = 0;
        falseExist = false;
        unknownExist = false;
        errorExist = false;
        this.testResultMap = testResultMap;
        this.definitionMap = definitionMap;
        this.definitionResultMap = definitionResultMap;
    }

    public OvalCriteriaResultType check(CriteriaType criteria) {
        for (Object object : criteria.getCriteriaOrCriterionOrExtendDefinition()) {
            if (object instanceof CriteriaType) {
                OvalCriteriaChecker criteriaChecker = new OvalCriteriaChecker();
                criteriaChecker.init(testResultMap, definitionMap, definitionResultMap);
                applyStepResult(criteriaChecker.check((CriteriaType) object));
                continue;
            }

            if (object instanceof CriterionType) {
                String testId = ((CriterionType) object).getTestRef();
                OvalTestResultType resultType = testResultMap.get(testId);
                applyStepResult(toCriteriaType(resultType));
                continue;
            }

            if (object instanceof ExtendDefinitionType) {
                String definitionId = ((ExtendDefinitionType) object).getDefinitionRef();
                if (definitionMap == null || (definitionMap != null && definitionMap.get(definitionId) == null)) {
                    System.out.println("[Error] extend definition is not exist - " + definitionId);
                    applyStepResult(OvalCriteriaResultType.ERROR);
                    continue;
                }
                DefinitionType definitionType = definitionMap.get(definitionId);
                OvalCriteriaResultType criteriaResultType = definitionResultMap.get(definitionId);
                if (criteriaResultType == null) {
                    OvalCriteriaChecker criteriaChecker = new OvalCriteriaChecker();
                    criteriaChecker.init(testResultMap, definitionMap, definitionResultMap);
                    criteriaResultType = criteriaChecker.check(definitionType.getCriteria());
                    definitionResultMap.put(definitionId, criteriaResultType);
                }
                applyStepResult(criteriaResultType);
                continue;
            }

            System.out.println("[Error] unexpected type of criteria - " + object.getClass());
            applyStepResult(OvalCriteriaResultType.ERROR);
        }
        OvalCriteriaResultType criteriaResultType = null;
        switch (criteria.getOperator()) {
            case AND:
                criteriaResultType = !falseExist ? OvalCriteriaResultType.TRUE : OvalCriteriaResultType.FALSE;
                break;
            case OR:
                criteriaResultType = trueCount >= 1 ? OvalCriteriaResultType.TRUE : OvalCriteriaResultType.FALSE;
                break;
            case ONE:
                criteriaResultType = trueCount == 1 ? OvalCriteriaResultType.TRUE : OvalCriteriaResultType.FALSE;
                break;
            case XOR:
                criteriaResultType = trueCount % 2 == 1 ? OvalCriteriaResultType.TRUE : OvalCriteriaResultType.FALSE;
                break;
        }
        criteriaResultType = unknownExist ? OvalCriteriaResultType.UNKNOWN : criteriaResultType;
        criteriaResultType = errorExist ? OvalCriteriaResultType.ERROR : criteriaResultType;
        return criteriaResultType;
    }

    private void applyStepResult(OvalCriteriaResultType stepResult) {
        switch (stepResult) {
            case TRUE:
                trueCount++;
                break;
            case FALSE:
                falseExist = true;
                break;
            case UNKNOWN:
                unknownExist = true;
                break;
            case ERROR:
                errorExist = true;
                break;
        }
    }

    private static OvalCriteriaResultType toCriteriaType(OvalTestResultType ovalTestResultType) {
        if (ovalTestResultType == null) {
            System.out.println("[Error] cannot convert ovalTestResultType to ovalCriteriaResultType, null");
            return OvalCriteriaResultType.ERROR;
        }
        OvalCriteriaResultType type = null;
        switch (ovalTestResultType) {
            case TRUE:
                type = OvalCriteriaResultType.TRUE;
                break;
            case FALSE:
                type = OvalCriteriaResultType.FALSE;
                break;
            case UNKNOWN:
                type = OvalCriteriaResultType.UNKNOWN;
                break;
            case ERROR:
                type = OvalCriteriaResultType.ERROR;
                break;
            default:
                System.out.println("[Error] unexpected ovalTestResultType - " + ovalTestResultType);
                type = OvalCriteriaResultType.ERROR;
        }
        return type;
    }

}
