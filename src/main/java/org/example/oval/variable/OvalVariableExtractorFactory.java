package org.example.oval.variable;

import org.example.oval.OvalEntityMappingContext;
import org.mitre.oval.xmlschema.oval_definitions_5.*;

public class OvalVariableExtractorFactory {

    public static OvalVariableExtractor getExtractor(OvalEntityMappingContext entityMappingContext,
                                                     VariableType variableType)
            throws Exception {
        if (variableType instanceof LocalVariable) {
            LocalVariable localVariable = (LocalVariable) variableType;
            return LocalVariableExtractorFactory.getLocalVariableExtractor(entityMappingContext, localVariable);
        } else
            throw new Exception("variable is not expected type of variable. id : " + variableType.getId());
    }

}
