package org.example.oval.test.impl;

import org.example.oval.test.OvalTestResultType;
import org.mitre.oval.xmlschema.oval_definitions_5.*;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.RpminfoTest;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;

import java.util.List;
import java.util.Map;

public class RpmInfoTestExecutor implements OvalTestExecutor {
    private RpminfoTest rpminfoTest;
    public RpmInfoTestExecutor(TestType testType) {
        rpminfoTest = (RpminfoTest) testType;
    }

    @Override
    public OvalTestResultType execute(Map<String, StateType> stateTypeMap, List<ItemType> itemTypes) {
        return OvalTestResultType.UNKNOWN;
    }
}
