package org.example.oval.registry;

import org.junit.Test;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RegistryDataReaderTest {
    @Test
    public void test() throws IOException {
        String hkey = "HKEY_LOCAL_MACHINE";
        String key = "SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion";

        Set<String> nameSet = new HashSet<>();
        nameSet.add("BuildLab");

        RegistryDataReader registryDataReader = new RegistryDataReader();
        List<RegistryData> registryDataList = registryDataReader.read(hkey, key, nameSet);

        assert !registryDataList.isEmpty();
        assert registryDataList.get(0) != null;
    }
    @Test
    public void testEmpty() throws IOException {
        String hkey = "HKEY_LOCAL_MACHINE";
        String key = "SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion";

        RegistryDataReader registryDataReader = new RegistryDataReader();
        List<RegistryData> registryDataList = registryDataReader.read(hkey, key, new HashSet<>());

        assert registryDataList.isEmpty();
    }
}