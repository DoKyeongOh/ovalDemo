package org.example.oval.test;

import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;

import java.util.Map;

public interface OvalObjectExtractable {
    ObjectType extractObject(Map<String, ObjectType> objectTypeMap);
}
