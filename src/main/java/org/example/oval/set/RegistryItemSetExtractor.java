package org.example.oval.set;

import org.example.oval.OvalEntityMapping;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5.Set;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.RegistryObject;

public class RegistryItemSetExtractor implements OvalItemSetExtractor {

    private Set registryItemSet;

    public RegistryItemSetExtractor(ObjectType objectType) {
        RegistryObject registryObject = (RegistryObject) objectType;
        registryItemSet = registryObject.getSet();
    };

    @Override
    public void extract(OvalEntityMapping ovalEntityMapping) {

    }
}
