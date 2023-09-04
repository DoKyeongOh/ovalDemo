package org.example.oval.item;

import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;

import java.util.List;

public interface OvalItemSetExtractor {
    List<ItemType> extract() throws Exception;
}
