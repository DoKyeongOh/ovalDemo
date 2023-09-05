package org.example.oval.variable.function;
import org.example.oval.OvalEntityMapping;
import org.example.oval.variable.OvalVariableExtractor;
import org.mitre.oval.xmlschema.oval_definitions_5.ConcatFunctionType;
import org.mitre.oval.xmlschema.oval_definitions_5.LocalVariable;

import java.util.List;

public class FunctionGroupExtractorFactory {
    public static OvalVariableExtractor getExtractor(OvalEntityMapping ovalEntityMapping, LocalVariable localVariable) {
        ConcatFunctionType concatVariable = localVariable.getConcat();
        if (concatVariable != null)
            return new ConcatVariableExtractor(ovalEntityMapping, concatVariable);
        return null;
    }
}
