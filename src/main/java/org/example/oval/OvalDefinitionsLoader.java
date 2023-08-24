package org.example.oval;

import org.mitre.oval.xmlschema.oval_definitions_5.OvalDefinitions;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class OvalDefinitionsLoader {
    public OvalDefinitions load(File defXmlFile) throws IOException, JAXBException {
        try (FileInputStream is = new FileInputStream(defXmlFile)) {
            JAXBContext jaxbContext = JAXBContext.newInstance(OvalDefinitions.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            return (OvalDefinitions) unmarshaller.unmarshal(is);
        }
    }
}
