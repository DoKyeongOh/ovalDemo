package org.example.oval.registry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class RegistryDataReader {
    public List<RegistryData> read(String hkey, String path, Set<String> nameSet) throws IOException {
        String registryPath = hkey + "\\" + path;
        String nameOption = nameSet.isEmpty() ? "/ve " : "";
        List<RegistryData> registryDatasList = new ArrayList<>();
        Process process = Runtime.getRuntime().exec("reg query \"" + registryPath + nameOption);
        try (BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
            while (true) {
                String line = br.readLine();
                if (line == null)
                    break;
                if (line.isEmpty() || line.equals(registryPath) || line.startsWith(registryPath))
                    continue;
                String[] items = line.trim().split("\\s+");
                if (!nameSet.contains(items[0]))
                    continue;
                String value = items.length < 3 ? null : items[2];
                registryDatasList.add(new RegistryData(hkey, path, items[0], items[1], value));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return registryDatasList;
    }
}
