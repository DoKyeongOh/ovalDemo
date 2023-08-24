package org.example.oval.test.impl;

import org.example.oval.test.OvalTestExecutor;
import org.example.oval.test.OvalTestResultType;
import org.mitre.oval.xmlschema.oval_common_5.CheckEnumeration;
import org.mitre.oval.xmlschema.oval_common_5.ExistenceEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5.StateRefType;
import org.mitre.oval.xmlschema.oval_definitions_5.StateType;
import org.mitre.oval.xmlschema.oval_definitions_5.TestType;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.EntityStateFamilyType;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.FamilyObject;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.FamilyState;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.FamilyTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FamilyTestExecutor extends OvalTestExecutor {

    private List<FamilyState> stateTypeList;
    private FamilyObject objectType;
    public FamilyTestExecutor(TestType testType) {
        super(testType);
    }

    @Override
    public void init(Map<String, StateType> stateTypeMap, Map<String, ObjectType> objectTypeMap) {
        FamilyTest familyTest = (FamilyTest) testType;
        stateTypeList = new ArrayList<>();
        for (StateRefType stateRefType : ((FamilyTest) testType).getState())
            stateTypeList.add((FamilyState) stateTypeMap.get(stateRefType.getStateRef()));
        objectType = (FamilyObject) objectTypeMap.get(familyTest.getObject().getObjectRef());
    }

    @Override
    public OvalTestResultType execute() {
        System.getProperty("os.name");
        ExistenceEnumeration checkExistence = testType.getCheckExistence();
        switch (checkExistence) {
            case ALL_EXIST:
                break;
            case ANY_EXIST:
                break;
            case AT_LEAST_ONE_EXISTS:
                break;
            case NONE_EXIST:
                break;
            case ONLY_ONE_EXISTS:
                break;
        }
        CheckEnumeration check = testType.getCheck();
        String osName = System.getProperty("os.name");
        for (FamilyState familyState : stateTypeList) {
            EntityStateFamilyType family = familyState.getFamily();
        }
        return OvalTestResultType.UNKNOWN;
    }
}
