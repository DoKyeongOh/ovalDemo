package org.example.oval.registry;

import org.example.oval.OvalEntityMappingContext;
import org.example.oval.OvalSimpleValueExtractor;
import org.example.oval.item.ItemExtractResult;
import org.example.oval.item.OvalItemExtractor;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.RegistryObject;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.*;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.EntityItemRegistryHiveType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.EntityItemRegistryTypeType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.EntityItemWindowsViewType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.RegistryItem;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RegistryItemExtractor implements OvalItemExtractor {
    private RegistryDataReader registryDataReader;

    public RegistryItemExtractor(RegistryDataReader registryDataReader) {
        this.registryDataReader = registryDataReader;
    }

    @Override
    public ItemExtractResult extract(ObjectType inputObject, OvalEntityMappingContext entityMappingContext) {
        if (inputObject == null)
            return new ItemExtractResult(ItemExtractResult.ItemExtractResultType.ERROR);
        if (inputObject instanceof RegistryObject == false)
            return new ItemExtractResult(ItemExtractResult.ItemExtractResultType.ERROR);

        List<ItemType> itemTypes = new ArrayList<>();
        Set<String> requiredNames = new HashSet<>();
        Set<String> requiredKeys = new HashSet<>();

        RegistryObject registryObject = (RegistryObject) inputObject;
        OvalSimpleValueExtractor valueExtractor = new OvalSimpleValueExtractor(entityMappingContext);

        try {
            List<Object> hkeys = valueExtractor.extract(registryObject.getHive());
            List<Object> keys = valueExtractor.extract(registryObject.getKey().getValue());
            List<Object> names = valueExtractor.extract(registryObject.getName().getValue());

            for (Object nameItem : names)
                requiredNames.add((String) nameItem);

            for (Object key : keys)
                requiredKeys.add((String) key);

            for (Object hkey : hkeys)
                for (String key : requiredKeys)
                    registryDataReader.read((String) hkey, key, requiredNames).stream()
                            .filter(data -> requiredNames.contains(data.getName()) && data.getValue() != null)
                            .forEach(data -> itemTypes.add(createRegistryItem(data)));
        } catch (Exception e) {
            return new ItemExtractResult(ItemExtractResult.ItemExtractResultType.ERROR);
        }

        if (itemTypes.isEmpty())
            return new ItemExtractResult(ItemExtractResult.ItemExtractResultType.DOES_NOT_EXIST);
        return new ItemExtractResult(itemTypes);
    }

    public RegistryItem createRegistryItem(RegistryData registryData) {
        EntityItemRegistryHiveType entityHive = new EntityItemRegistryHiveType();
        entityHive.setStatus(StatusEnumeration.EXISTS);
        entityHive.setDatatype("string");
        entityHive.setValue(registryData.getHkey());

        EntityItemStringType entityKey = new EntityItemStringType();
        entityKey.setStatus(StatusEnumeration.EXISTS);
        entityKey.setDatatype("string");
        entityKey.setValue(registryData.getKey());
        JAXBElement<EntityItemStringType> entityKeyElement = new JAXBElement<>(
                QName.valueOf("key"),
                EntityItemStringType.class,
                entityKey);

        EntityItemStringType entityName = new EntityItemStringType();
        entityName.setStatus(StatusEnumeration.EXISTS);
        entityName.setDatatype("string");
        entityName.setValue(registryData.getName());
        JAXBElement<EntityItemStringType> entityNameElement = new JAXBElement<>(
                QName.valueOf("name"),
                EntityItemStringType.class,
                entityName);

        EntityItemRegistryTypeType entityRegType = new EntityItemRegistryTypeType();
        entityRegType.setStatus(StatusEnumeration.EXISTS);
        entityRegType.setValue(registryData.getType());
        entityRegType.setDatatype("string");

        List<EntityItemAnySimpleType> entityValues = new ArrayList<>();
        List<String> values = registryData.getValues();
        values.forEach(value -> {
            EntityItemAnySimpleType entityValue = new EntityItemAnySimpleType();
            entityValue.setStatus(StatusEnumeration.EXISTS);
            entityValue.setValue(value);
            switch (registryData.getType()) {
                case "reg_binary":
                    entityValue.setDatatype("binary");
                    break;
                case "reg_dword":
                case "reg_dword_little_endian":
                case "reg_dword_big_endian":
                case "reg_qword":
                case "reg_qword_little_endian":
                    entityValue.setDatatype("int");
                    break;
                case "reg_multi_sz":
                    if (values.isEmpty())
                        entityValue.setStatus(StatusEnumeration.DOES_NOT_EXIST);
                case "reg_expand_sz":
                case "reg_sz":
                case "reg_link":
                    entityValue.setDatatype("string");
                    break;
                case "reg_none":
                case "reg_resource_list":
                case "reg_full_resource_descriptor":
                case "reg_resource_requirements_list":
                default:
            }
            entityValues.add(entityValue);
        });

        EntityItemIntType entityLastWriteTime = new EntityItemIntType();
        entityLastWriteTime.setStatus(StatusEnumeration.DOES_NOT_EXIST);
        entityLastWriteTime.setDatatype("int");
        entityLastWriteTime.setValue(0);

        EntityItemWindowsViewType entityWindowsView = new EntityItemWindowsViewType();
        entityWindowsView.setStatus(StatusEnumeration.EXISTS);
        entityWindowsView.setDatatype("string");
        entityWindowsView.setValue("64-bit"); // system charactoristic에 있음

        RegistryItem registryItem = new RegistryItem();
        registryItem.setHive(entityHive);
        registryItem.setKey(entityKeyElement);
        registryItem.setName(entityNameElement);
        registryItem.setType(entityRegType);
        registryItem.getValue().addAll(entityValues);
        registryItem.setLastWriteTime(entityLastWriteTime);
        registryItem.setWindowsView(entityWindowsView);
        return registryItem;
    }
}
