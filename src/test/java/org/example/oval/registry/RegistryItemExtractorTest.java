package org.example.oval.registry;

import com.sun.jna.platform.win32.Advapi32Util;
import com.sun.jna.platform.win32.WinReg;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.prefs.AbstractPreferences;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

public class RegistryItemExtractorTest {

    @Test
    public void test() throws IOException, BackingStoreException {
        String hive = "HKEY_LOCAL_MACHINE";
        String key = "SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion";
        String name = "BuildLab";
        readRegistryFromPreferences(hive, key, name);
    }

    private void readRegistryValue(String hive, String key, String name) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec("reg query \""+hive+"\\"+key+"\" /ve ");

        String line = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
    private void readRegistryFromPreferences(String hive, String key, String name) throws BackingStoreException {
        String registryPath = hive + "\\" + key;
        Preferences preferences = Preferences.systemRoot();
        String[] subKeys = preferences.childrenNames();
        for (String subKey : subKeys) {
            System.out.println(subKey);
        }

        String s = Advapi32Util.registryGetStringValue(WinReg.HKEY_LOCAL_MACHINE, key, name);
        System.out.println(s);
    }

}