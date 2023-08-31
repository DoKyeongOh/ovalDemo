package org.example.oval.test.impl;

import org.example.oval.OvalEntityMapping;
import org.example.oval.test.OvalTestExecutor;
import org.example.oval.test.OvalTestResultType;
import org.mitre.oval.xmlschema.oval_definitions_5.*;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.FileTest;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;

import java.util.List;

public class UnixFileTestExecutor implements OvalTestExecutor {
    private FileTest fileTest;
    public UnixFileTestExecutor(TestType testType) {
        this.fileTest = (FileTest) testType;
    }


    @Override
    public OvalTestResultType execute(OvalEntityMapping ovalEntityMapping, List<ItemType> itemTypes) {
        return OvalTestResultType.UNKNOWN;
    }
}
