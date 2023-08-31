package org.example.oval.variable;

import org.example.oval.OvalEntityMapping;
import org.mitre.oval.xmlschema.oval_definitions_5.*;

public class OvalVariableExtractorFactory {

    public static OvalVariableExtractor getExtractor(OvalEntityMapping ovalEntityMapping, VariableType variableType)
            throws Exception {
        if (variableType instanceof LocalVariable) {
            LocalVariable localVariable = (LocalVariable) variableType;
            return LocalVariableExtractorFactory.getLocalVariableExtractor(ovalEntityMapping, localVariable);
        } else
            return null;
    }

}
