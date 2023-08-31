package org.example.oval.item;

import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5.TestType;
import org.mitre.oval.xmlschema.oval_definitions_5.VariableType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;

import java.util.List;
import java.util.Map;

public interface OvalItemExtractor {
    List<ItemType> extract() throws Exception;
}
