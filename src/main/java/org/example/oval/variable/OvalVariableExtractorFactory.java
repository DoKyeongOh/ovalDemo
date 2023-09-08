package org.example.oval.variable;

import org.example.oval.OvalEntityMappingContext;
import org.mitre.oval.xmlschema.oval_definitions_5.*;

public class OvalVariableExtractorFactory {

    public static OvalVariableExtractor getExtractor(OvalEntityMappingContext entityMappingContext,
                                                     VariableType variableType) {
        if (variableType instanceof LocalVariable) {
            LocalVariable localVariable = (LocalVariable) variableType;
            return LocalVariableExtractorFactory.getLocalVariableExtractor(entityMappingContext, localVariable);
        } else
            return null;
    }

}
