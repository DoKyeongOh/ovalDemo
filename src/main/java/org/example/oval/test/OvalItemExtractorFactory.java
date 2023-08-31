package org.example.oval.test;

import org.example.oval.item.OvalItemExtractor;
import org.example.oval.item.RpmInfoItemExtractor;
import org.example.oval.item.UnixFileItemExtractor;
import org.example.oval.item.WinFileItemExtractor;
import org.example.oval.item.FamilyItemExtractor;
import org.example.oval.item.RegistryItemExtractor;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5.TestType;
import org.mitre.oval.xmlschema.oval_definitions_5.VariableType;

import java.util.Map;

public class OvalItemExtractorFactory {
    public static OvalItemExtractor getInstance(TestType testType, Map<String, ObjectType> objectTypeMap,
                                                Map<String, VariableType> variableTypeMap) {
        Class<? extends TestType> testTypeClass = testType.getClass();
        if (testTypeClass.equals(org.mitre.oval.xmlschema.oval_definitions_5_unix.FileTest.class))
            return new UnixFileItemExtractor(testType, objectTypeMap, variableTypeMap);
        else if (testTypeClass.equals(org.mitre.oval.xmlschema.oval_definitions_5_windows.FileTest.class))
            return new WinFileItemExtractor(testType, objectTypeMap, variableTypeMap);
        else if (testTypeClass.equals(org.mitre.oval.xmlschema.oval_definitions_5_linux.RpminfoTest.class))
            return new RpmInfoItemExtractor();
        else if (testTypeClass.equals(org.mitre.oval.xmlschema.oval_definitions_5_independent.FamilyTest.class))
            return new FamilyItemExtractor();
        else if (testTypeClass.equals(org.mitre.oval.xmlschema.oval_definitions_5_windows.RegistryTest.class))
            return new RegistryItemExtractor();
        else
            return null;
    }
}
