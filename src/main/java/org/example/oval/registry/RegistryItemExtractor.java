package org.example.oval.registry;

import org.example.oval.OvalEntityMapping;
import org.example.oval.item.ItemExtractResult;
import org.example.oval.item.OvalItemExtractor;
import org.example.oval.OvalSimpleBaseTypeConverter;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.RegistryObject;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;

import java.util.List;

public class RegistryItemExtractor implements OvalItemExtractor {

    private RegistryObject registryObject;
    private OvalEntityMapping ovalEntityMapping;
    private OvalSimpleBaseTypeConverter baseTypeConverter;

    public RegistryItemExtractor(ObjectType inputObject, OvalEntityMapping ovalEntityMapping) throws Exception {
        if (inputObject == null)
            throw new Exception("input registry object is not null.");
        if (!inputObject.getClass().equals(RegistryObject.class))
            throw new Exception("input registry object is not registry_object.");
        registryObject = (RegistryObject) inputObject;
        baseTypeConverter = new OvalSimpleBaseTypeConverter(ovalEntityMapping);
        this.ovalEntityMapping = ovalEntityMapping;
    }

    @Override
    public ItemExtractResult extract() throws Exception {
        List<Object> hives = baseTypeConverter.convert(registryObject.getHive());
        List<Object> keys = baseTypeConverter.convert(registryObject.getHive());
        List<Object> names = baseTypeConverter.convert(registryObject.getHive());
        return null;
    }
}
