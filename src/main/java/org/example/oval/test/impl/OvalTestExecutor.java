package org.example.oval.test.impl;

import org.example.oval.test.OvalTestResultType;
import org.mitre.oval.xmlschema.oval_definitions_5.*;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;

import java.util.List;
import java.util.Map;

public interface OvalTestExecutor {
    public OvalTestResultType execute(Map<String, StateType> stateTypeMap, List<ItemType> itemTypes) throws Exception;
}
