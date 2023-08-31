package org.example.oval.item.impl;

import org.example.oval.OvalEntityMapping;
import org.example.oval.OvalSimpleBaseTypeConverter;
import org.example.oval.item.OvalItemExtractor;
import org.mitre.oval.xmlschema.oval_definitions_5.TestType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.RegistryObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.RegistryTest;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;

import java.util.List;

public class RegistryItemExtractor implements OvalItemExtractor {

    private RegistryObject registryObject;
    private OvalEntityMapping ovalEntityMapping;
    private OvalSimpleBaseTypeConverter baseTypeConverter;

    public RegistryItemExtractor(TestType testType, OvalEntityMapping ovalEntityMapping) {
        RegistryTest registryTest = (RegistryTest) testType;
        String objectRef = registryTest.getObject().getObjectRef();
        registryObject = (RegistryObject) ovalEntityMapping.getObjectType(objectRef);
        baseTypeConverter = new OvalSimpleBaseTypeConverter(ovalEntityMapping);
        this.ovalEntityMapping = ovalEntityMapping;
    }

    @Override
    public List<ItemType> extract() throws Exception {
        List<Object> hives = baseTypeConverter.convert(registryObject.getHive());
        List<Object> keys = baseTypeConverter.convert(registryObject.getHive());
        List<Object> names = baseTypeConverter.convert(registryObject.getHive());
        return null;
    }
}
