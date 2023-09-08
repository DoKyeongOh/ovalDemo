package org.example.oval.item;

import org.example.oval.OvalEntityMappingContext;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;

public interface OvalItemExtractor {
    ItemExtractResult extract(ObjectType inputObject, OvalEntityMappingContext ovalEntityMappingContext);
}
