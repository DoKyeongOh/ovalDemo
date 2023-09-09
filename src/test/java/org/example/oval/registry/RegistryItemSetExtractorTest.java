package org.example.oval.registry;

import org.example.oval.OvalEntityMappingContext;
import org.example.oval.item.ItemExtractResult;
import org.junit.Test;
import org.mitre.oval.xmlschema.oval_definitions_5.Set;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemAnySimpleType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.EntityItemRegistryHiveType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.EntityItemRegistryTypeType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.RegistryItem;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class RegistryItemSetExtractorTest {

    @Test
    public void test() {
        {
            String hive = "dumy-hive";
            String key = "dumy-key";
            String name = "dumy-name";
            String type = "reg_sz";
            String expandedValue = null;
            getResult(hive, key, name, type, new ArrayList<>(), expandedValue);
        }
    }

    private ItemExtractResult getResult(String hive, String key, String name, String type, List<EntityItemAnySimpleType> values, String expandedValue) {
        OvalEntityMappingContext mappingContext = new OvalEntityMappingContext();
        Set set = new Set();
        set.getObjectReference().add("obj-1");

        RegistryItemSetExtractor itemSetExtractor = new RegistryItemSetExtractor(set, new OvalEntityMappingContext());
        ItemExtractResult itemExtractResult = itemSetExtractor
                .extractFromObject((inputObject, ovalEntityMappingContext) -> {
            FakeRegistryItem registryItem = new FakeRegistryItem();
            registryItem.setId(new BigInteger("1"));
            registryItem.setHive(hive);
            registryItem.setKey(key);
            registryItem.setName(name);
            registryItem.setType(type);
            registryItem.setExpandedValue(expandedValue);
            registryItem.setValues(values);
            ItemExtractResult result = new ItemExtractResult();
            result.getExtractedItems().add(registryItem);
            return result;
        });
        return itemExtractResult;
    }

    private class FakeRegistryItem extends RegistryItem {
        public String getHiveValue() {
            return (String) this.hive.getValue();
        }
        public String getKeyValue() {
            return (String) this.key.getValue().getValue();
        }
        public String getNameValue() {
            return (String) this.name.getValue().getValue();
        }
        public void setHive(String hive) {
            EntityItemRegistryHiveType entityItemRegistryHiveType = new EntityItemRegistryHiveType();
            entityItemRegistryHiveType.setDatatype("string");
            entityItemRegistryHiveType.setValue(hive);
            this.hive = entityItemRegistryHiveType;
        }
        public void setKey(String key) {
            EntityItemStringType entityItemStringType = new EntityItemStringType();
            entityItemStringType.setDatatype("string");
            entityItemStringType.setValue(key);
            JAXBElement<EntityItemStringType> entityKeyElement = new JAXBElement<EntityItemStringType>(
                    QName.valueOf("key"),
                    EntityItemStringType.class,
                    entityItemStringType
            );
            this.key = entityKeyElement;
        }
        public void setName(String name) {
            EntityItemStringType entityItemStringType = new EntityItemStringType();
            entityItemStringType.setDatatype("string");
            entityItemStringType.setValue(name);
            JAXBElement<EntityItemStringType> entityNameElement = new JAXBElement<EntityItemStringType>(
                    QName.valueOf("name"),
                    EntityItemStringType.class,
                    entityItemStringType
            );
            this.name = entityNameElement;
        }
        public void setType(String type) {
            EntityItemRegistryTypeType entityItemRegistryTypeType = new EntityItemRegistryTypeType();
            entityItemRegistryTypeType.setDatatype("string");
            entityItemRegistryTypeType.setValue(type);
            this.type = entityItemRegistryTypeType;
        }
        public void setExpandedValue(String expandedValue) {
            EntityItemAnySimpleType entityItemAnySimpleType = new EntityItemAnySimpleType();
            entityItemAnySimpleType.setDatatype("string");
            entityItemAnySimpleType.setValue(expandedValue);
            this.expandedValue = entityItemAnySimpleType;
        }
        public void setValues (List<EntityItemAnySimpleType> values) {
            this.value = values;
        }
    }
}