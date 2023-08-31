package org.example.oval.test;

import org.example.oval.test.impl.*;
import org.mitre.oval.xmlschema.oval_definitions_5.TestType;

public class OvalTestExecutorFactory {

    public static OvalTestExecutor getInstance(TestType testType) {
        Class<? extends TestType> testTypeClass = testType.getClass();
        if (testTypeClass.equals(org.mitre.oval.xmlschema.oval_definitions_5_unix.FileTest.class))
            return new UnixFileTestExecutor(testType);
        else if (testTypeClass.equals(org.mitre.oval.xmlschema.oval_definitions_5_windows.FileTest.class))
            return new WinFileTestExecutor(testType);
        else if (testTypeClass.equals(org.mitre.oval.xmlschema.oval_definitions_5_linux.RpminfoTest.class))
            return new RpmInfoTestExecutor(testType);
        else if (testTypeClass.equals(org.mitre.oval.xmlschema.oval_definitions_5_independent.FamilyTest.class))
            return new FamilyTestExecutor(testType);
        else if (testTypeClass.equals(org.mitre.oval.xmlschema.oval_definitions_5_windows.RegistryTest.class))
            return new RegistryTestExecutor(testType);
        else
            return null;
    }

}
