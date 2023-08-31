package org.example.oval.item.impl;

import org.example.oval.OvalEntityMapping;
import org.example.oval.item.OvalItemExtractor;
import org.mitre.oval.xmlschema.oval_definitions_5.TestType;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.FileTest;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;

import java.util.List;

public class UnixFileItemExtractor implements OvalItemExtractor {
    private String objectId;
    private OvalEntityMapping ovalEntityMapping;
    public UnixFileItemExtractor(TestType testType, OvalEntityMapping ovalEntityMapping) {
        FileTest fileTest = (FileTest) testType;
        objectId = fileTest.getObject().getObjectRef();
        this.ovalEntityMapping = ovalEntityMapping;
    }

    @Override
    public List<ItemType> extract() {
        return null;
    }
}
