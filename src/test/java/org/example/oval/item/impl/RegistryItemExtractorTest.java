package org.example.oval.item.impl;

import org.junit.Test;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.RegistryItem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.prefs.Preferences;

public class RegistryItemExtractorTest {

    @Test
    public void test() throws IOException {
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec("reg query \"HKEY_CURRENT_USER\\Environment\" /v ANT_HOME");

        RegistryItem registryItem = new RegistryItem();

        String line = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }

}