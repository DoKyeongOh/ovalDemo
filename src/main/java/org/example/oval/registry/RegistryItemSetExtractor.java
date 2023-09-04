package org.example.oval.registry;

import org.example.oval.OvalEntityMapping;
import org.example.oval.OvalItemSetExtractor;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5.Set;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.RegistryObject;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;

import java.util.List;

public class RegistryItemSetExtractor implements OvalItemSetExtractor {

    private Set registryItemSet;

    public RegistryItemSetExtractor(ObjectType objectType) {
        RegistryObject registryObject = (RegistryObject) objectType;
        registryItemSet = registryObject.getSet();
    };

    @Override
    public List<ItemType> extract() {
        return null;
    }
}
