package org.example.oval.registry;

import org.example.oval.OvalEntityMappingContext;
import org.example.oval.item.ItemExtractResult;
import org.example.oval.test.OvalTestExecutor;
import org.example.oval.test.OvalTestResultType;
import org.mitre.oval.xmlschema.oval_definitions_5.*;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.RegistryTest;

public class RegistryTestExecutor implements OvalTestExecutor {
    private RegistryTest registryTest;
    public RegistryTestExecutor(TestType testType) {
        this.registryTest = (RegistryTest) testType;
    }

    @Override
    public OvalTestResultType execute(OvalEntityMappingContext ovalEntityMappingContext) {
        return OvalTestResultType.UNKNOWN;
    }
}
