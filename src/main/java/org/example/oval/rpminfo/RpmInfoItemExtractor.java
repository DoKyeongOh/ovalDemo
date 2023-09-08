package org.example.oval.rpminfo;

import org.example.oval.OvalEntityMappingContext;
import org.example.oval.item.ItemExtractResult;
import org.example.oval.item.OvalItemExtractor;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.RpminfoObject;

public class RpmInfoItemExtractor implements OvalItemExtractor {

    public RpmInfoItemExtractor() {

    }

    @Override
    public ItemExtractResult extract(ObjectType inputObject, OvalEntityMappingContext ovalEntityMappingContext) {
        if (inputObject == null)
            return new ItemExtractResult(ItemExtractResult.ItemExtractResultType.ERROR);
        if (!inputObject.getClass().equals(RpminfoObject.class))
            return new ItemExtractResult(ItemExtractResult.ItemExtractResultType.ERROR);
        RpminfoObject rpminfoObject = (RpminfoObject) inputObject;
        return null;
    }

}
