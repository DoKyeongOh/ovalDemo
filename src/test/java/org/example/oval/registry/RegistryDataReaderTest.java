package org.example.oval.registry;

import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class RegistryDataReaderTest {
    @Test
    public void test() throws IOException {
        String hkey = "HKEY_LOCAL_MACHINE";
        String key = "SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion";
        RegistryDataReader registryDataReader = new RegistryDataReader();
        List<RegistryData> registryDataList = registryDataReader.read(hkey, key);

        assert !registryDataList.isEmpty();
        assert registryDataList.get(0) != null;

    }
}