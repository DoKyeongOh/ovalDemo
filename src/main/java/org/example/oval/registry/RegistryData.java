package org.example.oval.registry;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RegistryData {
    private String hkey;
    private String key;
    private String name;
    private String type;
    private String value;

    public RegistryData(String hkey, String key, String name, String type, String value) {
        this.hkey = hkey;
        this.key = key;
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public List<String> getValues() {
        List<String> values = new ArrayList<>();
        switch (type) {
            case "reg_multi_sz":
                Arrays.stream(value.split("\\\\")).forEach(values::add);
                break;
            case "reg_resource_list":
                break;
            case "reg_full_resource_descriptor":
                break;
            case "reg_resource_requirements_list":
                break;
            default:
                values.add(value);
        }
        return values;
    }

    public String getHkey() {
        return hkey;
    }

    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }
}
