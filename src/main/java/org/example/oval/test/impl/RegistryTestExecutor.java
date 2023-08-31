package org.example.oval.test.impl;

import org.example.oval.OvalEntityMapping;
import org.example.oval.test.OvalTestExecutor;
import org.example.oval.test.OvalTestResultType;
import org.mitre.oval.xmlschema.oval_definitions_5.*;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.RegistryTest;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;

import java.util.List;

public class RegistryTestExecutor implements OvalTestExecutor {
    private RegistryTest registryTest;
    public RegistryTestExecutor(TestType testType) {
        this.registryTest = (RegistryTest) testType;
    }

    @Override
    public OvalTestResultType execute(OvalEntityMapping ovalEntityMapping, List<ItemType> itemTypes) {
        return OvalTestResultType.UNKNOWN;
    }
}
