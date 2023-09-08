package org.example.oval;

import org.example.oval.file.FileFinder;
import org.junit.Test;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectRefType;
import org.mitre.oval.xmlschema.oval_definitions_5.OvalDefinitions;
import org.mitre.oval.xmlschema.oval_definitions_5.TestType;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

public class DefinitionsLoaderTest {
    @Test
    public void testLoadDefinitionsFile() throws JAXBException, IOException, NoSuchFieldException, IllegalAccessException {
        File ovalDefFile = new File("src/main/resources/all.windows.vulnerability.xml");
        OvalDefinitionsLoader ovalDefinitionsLoader = new OvalDefinitionsLoader();
        OvalDefinitions ovalDefinitions = ovalDefinitionsLoader.load(ovalDefFile);
        System.out.println(ovalDefinitions);
    }

    @Test
    public void test2() throws ClassNotFoundException {
        Class<?> evalutationDefinitionIds = Class.forName("EvalutationDefinitionIds.class");
    }
    @Test
    public void test() {
        List<File> foundFiles = new ArrayList<>();
        String baseDir = "C:\\Users\\82105\\IdeaProjects\\ovalDemo\\target\\classes\\org\\mitre";
        File dir = new File(baseDir);
        FileFinder.findDown(dir, file -> {
            if (file.isDirectory())
                return;
            String name = file.getName();
            if (!name.endsWith(".class"))
                return;
            Class specClass = null;
            try {
                String classname = name.substring(0, file.getName().length() - 6);
                specClass = Class.forName(classname);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            if (specClass.getSuperclass() != TestType.class)
                return;
            try {
                Field field = specClass.getDeclaredField("object");
            } catch (NoSuchFieldException e) {
                foundFiles.add(file);
            }
        });
    }

}