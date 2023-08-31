package org.example.oval.set;

import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;

public class OvalItemSetExtractorFactory {

    public static OvalItemSetExtractor getExtractor(ObjectType objectType) {
        Class<? extends ObjectType> objectTypeClass = objectType.getClass();
        if (objectTypeClass.equals(org.mitre.oval.xmlschema.oval_definitions_5_windows.FileObject.class))
            return new WinFileItemSetExtractor(objectType);
        else if (objectTypeClass.equals(org.mitre.oval.xmlschema.oval_definitions_5_windows.RegistryObject.class))
            return new RegistryItemSetExtractor(objectType);
        else
            return null;
    }

}
