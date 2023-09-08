package org.example.oval.registry;

import org.example.oval.OvalEntityMappingContext;
import org.example.oval.item.ItemExtractResult;
import org.junit.Test;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectStringType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.EntityObjectRegistryHiveType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.RegistryObject;

;import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RegistryItemExtractorTest {

    @Test
    public void test() throws Exception {
        ItemExtractResult testExtractResult = getTestExtractResult("reg_sz", "testValue1");
        System.out.println(testExtractResult);
    }

    private ItemExtractResult getTestExtractResult(String type, String value) throws Exception {
        String objId = "reg-obj-1";
        String hive = "dumy_hive";
        String key = "dumy_key";
        String name = "dumy_name";

        FakeRegistryObject registryObject = new FakeRegistryObject();
        registryObject.setId(objId);
        registryObject.setHive(hive);
        registryObject.setKey(key);
        registryObject.setName(name);

        OvalEntityMappingContext ovalContext = new OvalEntityMappingContext();
        ovalContext.putObjectType(registryObject.getId(), registryObject);

        RegistryDataReader fakeReader = new RegistryDataReader() {
            @Override
            public List<RegistryData> read(String hkeyValue, String keyValue) throws IOException {
                List<RegistryData> registryDataList = new ArrayList<>();
                registryDataList.add(new RegistryData(hive, key, name, type, value));
                return registryDataList;
            }
        };
    }

    private class FakeRegistryObject extends RegistryObject {
        @Override
        public void setHive(EntityObjectRegistryHiveType value) {
            super.setHive(value);
        }
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
            EntityObjectRegistryHiveType entityObjectStringType = new EntityObjectRegistryHiveType();
            entityObjectStringType.setDatatype("string");
            entityObjectStringType.setValue(hive);
            this.hive = entityObjectStringType;
        }
        public void setKey(String key) {
            EntityObjectStringType entityObjectStringType = new EntityObjectStringType();
            entityObjectStringType.setDatatype("string");
            entityObjectStringType.setValue(key);
            JAXBElement<EntityObjectStringType> entityKeyElement = new JAXBElement<EntityObjectStringType>(
                    QName.valueOf("key"),
                    EntityObjectStringType.class,
                    entityObjectStringType
            );
            this.key = entityKeyElement;
        }
        public void setName(String name) {
            EntityObjectStringType entityObjectStringType = new EntityObjectStringType();
            entityObjectStringType.setDatatype("string");
            entityObjectStringType.setValue(name);
            JAXBElement<EntityObjectStringType> entityNameElement = new JAXBElement<EntityObjectStringType>(
                    QName.valueOf("name"),
                    EntityObjectStringType.class,
                    entityObjectStringType
            );
            this.name = entityNameElement;
        }
    }

}