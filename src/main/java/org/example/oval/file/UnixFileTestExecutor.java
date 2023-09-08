package org.example.oval.file;

import org.example.oval.OvalEntityMappingContext;
import org.example.oval.item.ItemExtractResult;
import org.example.oval.test.OvalTestExecutor;
import org.example.oval.test.OvalTestResultType;
import org.mitre.oval.xmlschema.oval_definitions_5.*;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.FileTest;

public class UnixFileTestExecutor implements OvalTestExecutor {
    private FileTest fileTest;
    public UnixFileTestExecutor(TestType testType) {
        this.fileTest = (FileTest) testType;
    }


    @Override
    public OvalTestResultType execute(OvalEntityMappingContext ovalEntityMappingContext) {
        return OvalTestResultType.UNKNOWN;
    }
}
