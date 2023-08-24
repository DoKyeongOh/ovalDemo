package org.example.oval.test;

import org.mitre.oval.xmlschema.oval_definitions_5.*;

import java.util.Map;

public abstract class OvalTestExecutor {
    protected TestType testType;
    public OvalTestExecutor(TestType testType) {
        this.testType = testType;
    }
    public abstract void init(Map<String, StateType> stateTypeMap, Map<String, ObjectType> objectTypeMap);
    public abstract OvalTestResultType execute();
}
