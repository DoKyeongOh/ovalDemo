package org.example.oval.rpminfo;

import org.example.oval.OvalEntityMapping;
import org.example.oval.OvalItemExtractor;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.RpminfoObject;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;

import java.util.List;

public class RpmInfoItemExtractor implements OvalItemExtractor {

    private RpminfoObject rpminfoObject;
    private OvalEntityMapping ovalEntityMapping;

    public RpmInfoItemExtractor(ObjectType inputObject, OvalEntityMapping ovalEntityMapping) throws Exception {
        if (inputObject == null)
            throw new Exception("input rpminfo object is not null.");
        if (!inputObject.getClass().equals(RpminfoObject.class))
            throw new Exception("input rpminfo object is notc rpminfo_object.");
        rpminfoObject = (RpminfoObject) inputObject;
        this.ovalEntityMapping = ovalEntityMapping;
    }

    @Override
    public List<ItemType> extract() {
        return null;
    }
}
