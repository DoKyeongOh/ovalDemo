package org.example.oval.item;

import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5.TestType;
import org.mitre.oval.xmlschema.oval_definitions_5.VariableType;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.FileTest;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;

import java.util.List;
import java.util.Map;

public class UnixFileItemExtractor implements OvalItemExtractor{
    FileTest unixFileTest;
    public UnixFileItemExtractor(TestType testType, Map<String, ObjectType> objectTypeMap,
                                 Map<String, VariableType> variableTypeMap) {
        unixFileTest = (FileTest) testType;
    }

    @Override
    public List<ItemType> extract() {
        return null;
    }
}
