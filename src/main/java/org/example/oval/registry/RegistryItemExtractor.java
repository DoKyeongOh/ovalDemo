package org.example.oval.registry;

import org.example.oval.OvalEntityMapping;
import org.example.oval.item.ItemExtractResult;
import org.example.oval.item.OvalItemExtractor;
import org.example.oval.OvalSimpleValueExtractor;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.RegistryObject;

import java.util.List;

public class RegistryItemExtractor implements OvalItemExtractor {

    private RegistryObject registryObject;
    private OvalEntityMapping ovalEntityMapping;
    private OvalSimpleValueExtractor simpleValueExtractor;

    public RegistryItemExtractor(ObjectType inputObject, OvalEntityMapping ovalEntityMapping) throws Exception {
        if (inputObject == null)
            throw new Exception("input registry object is not null.");
        if (!inputObject.getClass().equals(RegistryObject.class))
            throw new Exception("input registry object is not registry_object.");
        registryObject = (RegistryObject) inputObject;
        simpleValueExtractor = new OvalSimpleValueExtractor(ovalEntityMapping);
        this.ovalEntityMapping = ovalEntityMapping;
    }

    @Override
    public ItemExtractResult extract() throws Exception {
        List<Object> hives = simpleValueExtractor.extract(registryObject.getHive());
        List<Object> keys = simpleValueExtractor.extract(registryObject.getHive());
        List<Object> names = simpleValueExtractor.extract(registryObject.getHive());
        return null;
    }

    @Override
    public ItemExtractResult extractFromCache() {
        ItemExtractResult itemResult = ovalEntityMapping.getItemResult(registryObject.getId());
        return itemResult;
    }
}
