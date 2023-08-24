package org.example.oval.test.impl;

import org.example.oval.test.OvalTestExecutor;
import org.example.oval.test.OvalTestResultType;
import org.mitre.oval.xmlschema.oval_definitions_5.*;

import java.util.Map;

public class UnixFileTestExecutor extends OvalTestExecutor {
    public UnixFileTestExecutor(TestType testType) {
        super(testType);
    }

    @Override
    public void init(Map<String, StateType> stateTypeMap, Map<String, ObjectType> objectTypeMap) {

    }


    @Override
    public OvalTestResultType execute() {
        return OvalTestResultType.UNKNOWN;
    }
}
