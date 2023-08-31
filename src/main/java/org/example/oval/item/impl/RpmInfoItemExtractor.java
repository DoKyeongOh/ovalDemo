package org.example.oval.item.impl;

import org.example.oval.OvalEntityMapping;
import org.example.oval.item.OvalItemExtractor;
import org.mitre.oval.xmlschema.oval_definitions_5.TestType;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.RpminfoTest;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;

import java.util.List;

public class RpmInfoItemExtractor implements OvalItemExtractor {

    private String objectId;
    private OvalEntityMapping ovalEntityMapping;

    public RpmInfoItemExtractor(TestType testType, OvalEntityMapping ovalEntityMapping) {
        RpminfoTest rpminfoTest = (RpminfoTest) testType;
        objectId = rpminfoTest.getObject().getObjectRef();
        this.ovalEntityMapping = ovalEntityMapping;
    }

    @Override
    public List<ItemType> extract() {
        return null;
    }
}
