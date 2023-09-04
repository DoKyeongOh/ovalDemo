package org.example.oval.item;

import org.example.oval.OvalEntityMapping;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;

import java.util.List;

public interface OvalItemExtractor {
    ItemExtractResult extract() throws Exception;
}
