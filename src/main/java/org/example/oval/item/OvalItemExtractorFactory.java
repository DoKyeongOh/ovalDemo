package org.example.oval.item;

import org.example.oval.OvalEntityMapping;
import org.example.oval.item.impl.RpmInfoItemExtractor;
import org.example.oval.item.impl.UnixFileItemExtractor;
import org.example.oval.item.impl.WinFileItemExtractor;
import org.example.oval.item.impl.FamilyItemExtractor;
import org.example.oval.item.impl.RegistryItemExtractor;
import org.mitre.oval.xmlschema.oval_definitions_5.TestType;

public class OvalItemExtractorFactory {
    public static OvalItemExtractor getExtractor(TestType testType, OvalEntityMapping ovalEntityMapping) throws Exception {
        Class<? extends TestType> testTypeClass = testType.getClass();
        if (testTypeClass.equals(org.mitre.oval.xmlschema.oval_definitions_5_unix.FileTest.class))
            return new UnixFileItemExtractor(testType, ovalEntityMapping);
        else if (testTypeClass.equals(org.mitre.oval.xmlschema.oval_definitions_5_windows.FileTest.class))
            return new WinFileItemExtractor(testType, ovalEntityMapping);
        else if (testTypeClass.equals(org.mitre.oval.xmlschema.oval_definitions_5_linux.RpminfoTest.class))
            return new RpmInfoItemExtractor(testType, ovalEntityMapping);
        else if (testTypeClass.equals(org.mitre.oval.xmlschema.oval_definitions_5_independent.FamilyTest.class))
            return new FamilyItemExtractor();
        else if (testTypeClass.equals(org.mitre.oval.xmlschema.oval_definitions_5_windows.RegistryTest.class))
            return new RegistryItemExtractor(testType, ovalEntityMapping);
        else
            return null;
    }
}
