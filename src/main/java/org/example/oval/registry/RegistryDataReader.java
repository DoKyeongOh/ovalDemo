package org.example.oval.registry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class RegistryDataReader {
    public List<RegistryData> read(String hkey, String key) throws IOException {
        String registryPath = hkey + "\\" + key;
        List<RegistryData> registryDatasList = new ArrayList<>();
        Process process = Runtime.getRuntime().exec("reg query \"" + registryPath);
        try (BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
            while (true) {
                String line = br.readLine();
                if (line == null)
                    break;
                if (line.isEmpty() || line.equals(registryPath) || line.startsWith(registryPath))
                    continue;
                String[] items = line.trim().split("\\s+");
                String value = items.length < 3 ? null : items[2];
                registryDatasList.add(new RegistryData(hkey, key, items[0], items[1], value));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return registryDatasList;
    }
}
