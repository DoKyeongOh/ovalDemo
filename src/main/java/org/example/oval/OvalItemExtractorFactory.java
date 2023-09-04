package org.example.oval;

import org.example.oval.family.FamilyItemExtractor;
import org.example.oval.file.UnixFileItemExtractor;
import org.example.oval.file.WinFileItemExtractor;
import org.example.oval.item.OvalItemExtractor;
import org.example.oval.registry.RegistryItemExtractor;
import org.example.oval.rpminfo.RpmInfoItemExtractor;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5.TestType;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.FamilyTest;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.RpminfoTest;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.FileTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.RegistryTest;

public class OvalItemExtractorFactory {
    public static OvalItemExtractor getExtractor(TestType testType, OvalEntityMapping ovalEntityMapping) throws Exception {
        Class<? extends TestType> testTypeClass = testType.getClass();
        if (testTypeClass.equals(org.mitre.oval.xmlschema.oval_definitions_5_unix.FileTest.class)) {
            FileTest fileTest = (FileTest) testType;
            String objectRef = fileTest.getObject().getObjectRef();
            ObjectType objectType = ovalEntityMapping.getObjectType(objectRef);
            return new UnixFileItemExtractor(objectType, ovalEntityMapping);
        }
        if (testTypeClass.equals(org.mitre.oval.xmlschema.oval_definitions_5_windows.FileTest.class)) {
            org.mitre.oval.xmlschema.oval_definitions_5_windows.FileTest fileTest =
                    (org.mitre.oval.xmlschema.oval_definitions_5_windows.FileTest) testType;
            String objectRef = fileTest.getObject().getObjectRef();
            ObjectType objectType = ovalEntityMapping.getObjectType(objectRef);
            return new WinFileItemExtractor(objectType, ovalEntityMapping);
        }
        if (testTypeClass.equals(org.mitre.oval.xmlschema.oval_definitions_5_linux.RpminfoTest.class)) {
            RpminfoTest rpminfoTest = (RpminfoTest) testType;
            String objectRef = rpminfoTest.getObject().getObjectRef();
            ObjectType objectType = ovalEntityMapping.getObjectType(objectRef);
            return new RpmInfoItemExtractor(objectType, ovalEntityMapping);
        }
        if (testTypeClass.equals(org.mitre.oval.xmlschema.oval_definitions_5_independent.FamilyTest.class)) {
            FamilyTest familyTest = (FamilyTest) testType;
            String objectRef = familyTest.getObject().getObjectRef();
            ObjectType objectType = ovalEntityMapping.getObjectType(objectRef);
            return new FamilyItemExtractor(objectType);
        }
        if (testTypeClass.equals(org.mitre.oval.xmlschema.oval_definitions_5_windows.RegistryTest.class)) {
            RegistryTest registryTest = (RegistryTest) testType;
            String objectRef = registryTest.getObject().getObjectRef();
            ObjectType objectType = ovalEntityMapping.getObjectType(objectRef);
            return new RegistryItemExtractor(objectType, ovalEntityMapping);
        }
        return null;
    }
}
