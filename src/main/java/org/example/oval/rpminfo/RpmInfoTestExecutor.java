package org.example.oval.rpminfo;

import org.example.oval.OvalEntityMappingContext;
import org.example.oval.item.ItemExtractResult;
import org.example.oval.test.OvalTestExecutor;
import org.example.oval.test.OvalTestResultType;
import org.mitre.oval.xmlschema.oval_definitions_5.*;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.RpminfoTest;

public class RpmInfoTestExecutor implements OvalTestExecutor {
    private RpminfoTest rpminfoTest;
    public RpmInfoTestExecutor(TestType testType) {
        rpminfoTest = (RpminfoTest) testType;
    }

    @Override
    public OvalTestResultType execute(OvalEntityMappingContext ovalEntityMappingContext) {
        return OvalTestResultType.UNKNOWN;
    }
}
