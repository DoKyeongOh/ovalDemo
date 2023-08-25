package org.example.oval.test.impl;

import org.example.oval.test.OvalTestResultType;
import org.junit.Test;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectRefType;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5.StateRefType;
import org.mitre.oval.xmlschema.oval_definitions_5.StateType;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.EntityStateFamilyType;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.FamilyObject;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.FamilyState;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.FamilyTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileState;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FamilyTestExecutorTest {

    @Test
    public void testFamilyTest() throws Exception {
        StateRefType stateRefType = new StateRefType();
        stateRefType.setStateRef("state-1");
        ObjectRefType objectRefType = new ObjectRefType();
        objectRefType.setObjectRef("object-1");
        FakeFamilyTest familyTest = new FakeFamilyTest();
        familyTest.setId("family_test_1");
        familyTest.setState(new ArrayList<>());
        familyTest.getState().add(stateRefType);
        familyTest.setObject(objectRefType);

        EntityStateFamilyType entityStateFamilyType = new EntityStateFamilyType();
        entityStateFamilyType.setValue("WINDOWS");
        FamilyState familyState = new FamilyState();
        familyState.setFamily(entityStateFamilyType);

        Map<String, StateType> stateTypeMap = new HashMap<>();
        stateTypeMap.put("state-1", familyState);
        Map<String, ObjectType> objectTypeMap = new HashMap<>();
        objectTypeMap.put("object-1", new FamilyObject());

        FamilyTestExecutor executor = new FamilyTestExecutor(familyTest);
        executor.init(stateTypeMap, objectTypeMap);
        OvalTestResultType execute = executor.execute();
        assert execute.equals(OvalTestResultType.TRUE);
    }
    @Test
    public void testInputStateNull() throws Exception {
        StateRefType stateRefType = new StateRefType();
        stateRefType.setStateRef("state-1");
        ObjectRefType objectRefType = new ObjectRefType();
        objectRefType.setObjectRef("object-1");
        FakeFamilyTest familyTest = new FakeFamilyTest();
        familyTest.setId("family_test_1");
        familyTest.setState(new ArrayList<>());
        familyTest.getState().add(stateRefType);
        familyTest.setObject(objectRefType);

        Map<String, StateType> stateTypeMap = new HashMap<>();
        Map<String, ObjectType> objectTypeMap = new HashMap<>();
        objectTypeMap.put("object-1", new FamilyObject());

        try {
            FamilyTestExecutor executor = new FamilyTestExecutor(familyTest);
            executor.init(stateTypeMap, objectTypeMap);
            OvalTestResultType execute = executor.execute();
            assert false;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            assert true;
        }
    }

    @Test
    public void testFamilyNull() throws Exception {
        StateRefType stateRefType = new StateRefType();
        stateRefType.setStateRef("state-1");
        ObjectRefType objectRefType = new ObjectRefType();
        objectRefType.setObjectRef("object-1");
        FakeFamilyTest familyTest = new FakeFamilyTest();
        familyTest.setId("family_test_1");
        familyTest.setState(new ArrayList<>());
        familyTest.getState().add(stateRefType);
        familyTest.setObject(objectRefType);

        EntityStateFamilyType entityStateFamilyType = new EntityStateFamilyType();
        FamilyState familyState = new FamilyState();
        familyState.setFamily(entityStateFamilyType);

        Map<String, StateType> stateTypeMap = new HashMap<>();
        stateTypeMap.put("state-1", familyState);
        Map<String, ObjectType> objectTypeMap = new HashMap<>();
        objectTypeMap.put("object-1", new FamilyObject());

        try {
            FamilyTestExecutor executor = new FamilyTestExecutor(familyTest);
            executor.init(stateTypeMap, objectTypeMap);
            OvalTestResultType execute = executor.execute();
            assert false;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            assert true;
        }
    }
    @Test
    public void testOtherStateType() throws Exception {
        StateRefType stateRefType = new StateRefType();
        stateRefType.setStateRef("state-1");
        ObjectRefType objectRefType = new ObjectRefType();
        objectRefType.setObjectRef("object-1");
        FakeFamilyTest familyTest = new FakeFamilyTest();
        familyTest.setId("family_test_1");
        familyTest.setState(new ArrayList<>());
        familyTest.getState().add(stateRefType);
        familyTest.setObject(objectRefType);

        EntityStateFamilyType entityStateFamilyType = new EntityStateFamilyType();
        entityStateFamilyType.setValue("WINDOWS");
        FileState fileState = new FileState();

        Map<String, StateType> stateTypeMap = new HashMap<>();
        stateTypeMap.put("state-1", fileState);
        Map<String, ObjectType> objectTypeMap = new HashMap<>();
        objectTypeMap.put("object-1", new FamilyObject());

        try {
            FamilyTestExecutor executor = new FamilyTestExecutor(familyTest);
            executor.init(stateTypeMap, objectTypeMap);
            OvalTestResultType execute = executor.execute();
            assert false;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            assert true;
        }
    }

    private static class FakeFamilyTest extends FamilyTest {
        public void setState(List<StateRefType> states) {
            this.state = states;
        }
    }

}

