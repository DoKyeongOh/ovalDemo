package org.example.oval.variable.object;

import org.example.oval.OvalEntityMapping;
import org.example.oval.variable.OvalVariableExtractor;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectComponentType;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;

public class ObjectComponentExtractorFactory {
    public static OvalVariableExtractor getExtractor(OvalEntityMapping ovalEntityMapping,
                                                     ObjectComponentType objectComponentType) {
        String objectRef = objectComponentType.getObjectRef();
        Class<? extends ObjectType> objectTypeClass = ovalEntityMapping.getObjectType(objectRef).getClass();
        if (objectTypeClass.equals(org.mitre.oval.xmlschema.oval_definitions_5_windows.RegistryObject.class))
            return new RegistryComponentExtractor(ovalEntityMapping, objectComponentType);
        return null;
    }
}
