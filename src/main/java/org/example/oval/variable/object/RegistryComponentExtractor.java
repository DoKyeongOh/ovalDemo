package org.example.oval.variable.object;

import org.example.oval.OvalEntityMappingContext;
import org.example.oval.item.ItemExtractResult;
import org.example.oval.registry.RegistryDataReader;
import org.example.oval.registry.RegistryItemExtractor;
import org.example.oval.variable.OvalVariableExtractor;
import org.example.oval.variable.VariableExtractResult;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectComponentType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.RegistryObject;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemAnySimpleType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemSimpleBaseType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.RegistryItem;

import java.util.ArrayList;
import java.util.List;

public class RegistryComponentExtractor implements OvalVariableExtractor {
    private RegistryObject registryObject;
    private OvalEntityMappingContext mappingContext;
    private ObjectComponentType objectComponentType;

    public RegistryComponentExtractor(OvalEntityMappingContext mappingContext, ObjectComponentType objectComponentType) {
        this.mappingContext = mappingContext;
        this.objectComponentType = objectComponentType;
        this.registryObject = (RegistryObject) mappingContext.getObjectType(objectComponentType.getObjectRef());
    }
    @Override
    public VariableExtractResult extract() {
        if (registryObject == null)
            return new VariableExtractResult(VariableExtractResult.VariableExtractResultType.ERROR);

        ItemExtractResult itemExtractResult = mappingContext.getItemResult(registryObject.getId());
        if (itemExtractResult == null) {
            RegistryItemExtractor itemExtractor = new RegistryItemExtractor(new RegistryDataReader());
            itemExtractResult = itemExtractor.extract(registryObject, mappingContext);
            mappingContext.putItemResult(registryObject.getId(), itemExtractResult);
        }

        List<Object> results = new ArrayList<>();
        String itemField = objectComponentType.getItemField();
        String recordField = objectComponentType.getRecordField();
        for (ItemType itemType : itemExtractResult.getExtractedItems()) {
            RegistryItem registryItem = (RegistryItem) itemType;
            EntityItemSimpleBaseType simpleBaseType = null;
            switch (itemField) {
                case "hive":
                    simpleBaseType = registryItem.getHive();
                    break;
                case "key":
                    simpleBaseType = registryItem.getKey().getValue();
                    break;
                case "name":
                    simpleBaseType = registryItem.getName().getValue();
                    break;
                case "last_write_time":
                    simpleBaseType = registryItem.getLastWriteTime();
                    break;
                case "type":
                    simpleBaseType = registryItem.getType();
                    break;
                case "expanded_value":
                    simpleBaseType = registryItem.getExpandedValue();
                    break;
                case "windows_view":
                    simpleBaseType = registryItem.getWindowsView();
                    break;
                case "value":
                    if (registryItem.getValue() != null)
                        simpleBaseType = registryItem.getValue().get(0);
                    break;
            }
            if (simpleBaseType == null)
                continue;

            if (recordField != null && !simpleBaseType.getDatatype().equalsIgnoreCase(recordField))
                continue;

            results.add(simpleBaseType.getValue());
        }
        return new VariableExtractResult(results);
    }
}
