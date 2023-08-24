package org.example.oval.test;

import org.mitre.oval.xmlschema.oval_definitions_5.StateType;

import java.util.Map;

public interface OvalStateExtractable {
    StateType extractState(Map<String, StateType> stateTypeMap);
}
