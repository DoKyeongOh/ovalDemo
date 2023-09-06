package org.example.oval.family;

import org.example.oval.OvalEntityMapping;
import org.example.oval.family.FamilyTestExecutor;
import org.example.oval.item.ItemExtractResult;
import org.example.oval.test.OvalTestResultType;
import org.junit.Test;
import org.mitre.oval.xmlschema.oval_common_5.ExistenceEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5.StateRefType;
import org.mitre.oval.xmlschema.oval_definitions_5.StateType;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.EntityStateFamilyType;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.FamilyState;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.FamilyTest;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.StatusEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_independent.EntityItemFamilyType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_independent.FamilyItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.FileItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FamilyTestExecutorTest {

    @Test
    public void testFamilyTest() throws Exception {
        // prepare family test
        StateRefType stateRefType = new StateRefType();
        stateRefType.setStateRef("state-1");
        FakeFamilyTest familyTest = new FakeFamilyTest();
        familyTest.setId("family_test_1");
        familyTest.setState(new ArrayList<>());
        familyTest.getState().add(stateRefType);

        // prepare state map
        EntityStateFamilyType entityStateFamilyType = new EntityStateFamilyType();
        FamilyState familyState = new FamilyState();
        familyState.setFamily(entityStateFamilyType);
        Map<String, StateType> stateTypeMap = new HashMap<>();
        stateTypeMap.put("state-1", familyState);

        FakeOvalEntityMapping ovalEntityMapping = new FakeOvalEntityMapping();
        ovalEntityMapping.setStateTypeMap(stateTypeMap);

        // prepare family object
        ItemExtractResult itemExtractResult = new ItemExtractResult();
        FamilyItem familyItem = new FamilyItem();
        EntityItemFamilyType entityItemFamilyType = new EntityItemFamilyType();
        entityItemFamilyType.setStatus(StatusEnumeration.EXISTS);
        familyItem.setFamily(entityItemFamilyType);
        itemExtractResult.getExtractedItems().add(familyItem);

        FamilyTestExecutor executor = new FamilyTestExecutor(familyTest);
        {
            entityStateFamilyType.setValue("WINDOWS");
            entityItemFamilyType.setValue("windows");
            OvalTestResultType execute = executor.execute(ovalEntityMapping, itemExtractResult);
            assert execute.equals(OvalTestResultType.TRUE);
        }
        {
            entityStateFamilyType.setValue("WINDOWS");
            entityItemFamilyType.setValue("unix");
            OvalTestResultType execute = executor.execute(ovalEntityMapping, itemExtractResult);
            assert execute.equals(OvalTestResultType.FALSE);
        }
        {
            entityStateFamilyType.setValue("UNIX");
            entityItemFamilyType.setValue("linux");
            OvalTestResultType execute = executor.execute(ovalEntityMapping, itemExtractResult);
            assert execute.equals(OvalTestResultType.TRUE);
        }
        {
            entityStateFamilyType.setValue("UNIX");
            entityItemFamilyType.setValue("windows");
            OvalTestResultType execute = executor.execute(ovalEntityMapping, itemExtractResult);
            assert execute.equals(OvalTestResultType.FALSE);
        }
        {
            familyTest.setCheckExistence(ExistenceEnumeration.NONE_EXIST);
            entityStateFamilyType.setValue("WINDOWS");
            entityItemFamilyType.setValue("windows");
            OvalTestResultType execute = executor.execute(ovalEntityMapping, itemExtractResult);
            assert execute.equals(OvalTestResultType.FALSE);
        }
    }

    @Test
    public void testAbnormalCase() throws Exception {
        { // items empty or null
            FakeFamilyTest familyTest = new FakeFamilyTest();
            FamilyTestExecutor familyTestExecutor = new FamilyTestExecutor(familyTest);
            OvalTestResultType result = null;
            result = familyTestExecutor.execute(null, new ItemExtractResult());
            assert result.equals(OvalTestResultType.ERROR);
            result = familyTestExecutor.execute(null, null);
            assert result.equals(OvalTestResultType.ERROR);
        }
        { // item null
            FakeFamilyTest familyTest = new FakeFamilyTest();
            FamilyTestExecutor familyTestExecutor = new FamilyTestExecutor(familyTest);
            ItemExtractResult itemExtractResult = new ItemExtractResult();
            itemExtractResult.getExtractedItems().add(null);
            assert familyTestExecutor.execute(null, itemExtractResult)
                    .equals(OvalTestResultType.ERROR);
        }
        { // not familyItem
            FakeFamilyTest familyTest = new FakeFamilyTest();
            FamilyTestExecutor familyTestExecutor = new FamilyTestExecutor(familyTest);
            ItemExtractResult itemExtractResult = new ItemExtractResult();
            itemExtractResult.getExtractedItems().add(new FileItem());
            assert familyTestExecutor.execute(null, itemExtractResult)
                    .equals(OvalTestResultType.ERROR);
        }
        { // empty familyItem
            FakeFamilyTest familyTest = new FakeFamilyTest();
            FamilyTestExecutor familyTestExecutor = new FamilyTestExecutor(familyTest);
            FamilyItem familyItem = new FamilyItem();
            ItemExtractResult itemExtractResult = new ItemExtractResult();
            itemExtractResult.getExtractedItems().add(familyItem);
            assert familyTestExecutor.execute(null, itemExtractResult).equals(OvalTestResultType.ERROR);
        }
        { // real family value is null
            FakeFamilyTest familyTest = new FakeFamilyTest();
            FamilyTestExecutor familyTestExecutor = new FamilyTestExecutor(familyTest);
            EntityItemFamilyType entityItemFamilyType = new EntityItemFamilyType();
            FamilyItem familyItem = new FamilyItem();
            familyItem.setFamily(entityItemFamilyType);
            ItemExtractResult itemExtractResult = new ItemExtractResult();
            itemExtractResult.getExtractedItems().add(familyItem);
            assert familyTestExecutor.execute(null, itemExtractResult)
                    .equals(OvalTestResultType.ERROR);
        }
        { // normal but state is empty
            FakeFamilyTest familyTest = new FakeFamilyTest();
            FamilyTestExecutor familyTestExecutor = new FamilyTestExecutor(familyTest);
            EntityItemFamilyType entityItemFamilyType = new EntityItemFamilyType();
            entityItemFamilyType.setValue("unix");
            FamilyItem familyItem = new FamilyItem();
            familyItem.setFamily(entityItemFamilyType);
            ItemExtractResult itemExtractResult = new ItemExtractResult();
            itemExtractResult.getExtractedItems().add(familyItem);
            assert familyTestExecutor.execute(null, itemExtractResult).equals(OvalTestResultType.TRUE);
        }
        { // state map is empty
            List<StateRefType> stateRefTypes = new ArrayList<>();
            stateRefTypes.add(null);
            FakeFamilyTest familyTest = new FakeFamilyTest();
            familyTest.setState(stateRefTypes);
            EntityItemFamilyType entityItemFamilyType = new EntityItemFamilyType();
            entityItemFamilyType.setValue("unix");
            FamilyItem familyItem = new FamilyItem();
            familyItem.setFamily(entityItemFamilyType);
            ItemExtractResult itemExtractResult = new ItemExtractResult();
            itemExtractResult.getExtractedItems().add(familyItem);
            try {
                FamilyTestExecutor familyTestExecutor = new FamilyTestExecutor(familyTest);
                familyTestExecutor.execute(null, itemExtractResult);
                assert false;
            } catch (Exception e) {
                assert true;
            }
        }
        { // StateRefType is null
            StateRefType stateRefType = new StateRefType();
            List<StateRefType> stateRefTypes = new ArrayList<>();
            stateRefTypes.add(stateRefType);
            FakeFamilyTest familyTest = new FakeFamilyTest();
            familyTest.setState(stateRefTypes);
            EntityItemFamilyType entityItemFamilyType = new EntityItemFamilyType();
            entityItemFamilyType.setValue("unix");
            FamilyItem familyItem = new FamilyItem();
            familyItem.setFamily(entityItemFamilyType);
            ItemExtractResult itemExtractResult = new ItemExtractResult();
            itemExtractResult.getExtractedItems().add(familyItem);
            try {
                FamilyTestExecutor familyTestExecutor = new FamilyTestExecutor(familyTest);
                familyTestExecutor.execute(null, itemExtractResult);
                assert false;
            } catch (Exception e) {
                assert true;
            }
        }
        { // family(EntityStateFamilyType) is null
            StateRefType stateRefType = new StateRefType();
            stateRefType.setStateRef("state-1");
            List<StateRefType> stateRefTypes = new ArrayList<>();
            stateRefTypes.add(stateRefType);
            FakeFamilyTest familyTest = new FakeFamilyTest();
            familyTest.setState(stateRefTypes);
            EntityItemFamilyType entityItemFamilyType = new EntityItemFamilyType();
            entityItemFamilyType.setValue("unix");
            FamilyItem familyItem = new FamilyItem();
            familyItem.setFamily(entityItemFamilyType);
            ItemExtractResult itemExtractResult = new ItemExtractResult();
            itemExtractResult.getExtractedItems().add(familyItem);
            try {
                Map<String, StateType> stateTypeMap = new HashMap<>();
                stateTypeMap.put("state-1", new FamilyState());
                FakeOvalEntityMapping ovalEntityMapping = new FakeOvalEntityMapping();
                ovalEntityMapping.setStateTypeMap(stateTypeMap);
                FamilyTestExecutor familyTestExecutor = new FamilyTestExecutor(familyTest);
                familyTestExecutor.execute(ovalEntityMapping, itemExtractResult);
                assert false;
            } catch (Exception e) {
                assert true;
            }
        }
        { // real family value is null
            StateRefType stateRefType = new StateRefType();
            stateRefType.setStateRef("state-1");
            List<StateRefType> stateRefTypes = new ArrayList<>();
            stateRefTypes.add(stateRefType);
            FakeFamilyTest familyTest = new FakeFamilyTest();
            familyTest.setState(stateRefTypes);
            EntityItemFamilyType entityItemFamilyType = new EntityItemFamilyType();
            entityItemFamilyType.setValue("unix");
            FamilyItem familyItem = new FamilyItem();
            familyItem.setFamily(entityItemFamilyType);
            ItemExtractResult itemExtractResult = new ItemExtractResult();
            itemExtractResult.getExtractedItems().add(familyItem);
            try {
                FamilyState familyState = new FamilyState();
                familyState.setFamily(new EntityStateFamilyType());
                Map<String, StateType> stateTypeMap = new HashMap<>();
                stateTypeMap.put("state-1", familyState);
                FakeOvalEntityMapping ovalEntityMapping = new FakeOvalEntityMapping();
                ovalEntityMapping.setStateTypeMap(stateTypeMap);
                FamilyTestExecutor familyTestExecutor = new FamilyTestExecutor(familyTest);
                familyTestExecutor.execute(ovalEntityMapping, itemExtractResult);
                assert false;
            } catch (Exception e) {
                assert true;
            }
        }
    }

    private static class FakeFamilyTest extends FamilyTest {
        public void setState(List<StateRefType> states) {
            this.state = states;
        }
    }

    private static class FakeOvalEntityMapping extends OvalEntityMapping {
        public void setStateTypeMap(Map<String, StateType> stateTypeMap) {
            for (String stateTypeId : stateTypeMap.keySet()) {
                addStateType(stateTypeId, stateTypeMap.get(stateTypeId));
            }
        }
    }

}

