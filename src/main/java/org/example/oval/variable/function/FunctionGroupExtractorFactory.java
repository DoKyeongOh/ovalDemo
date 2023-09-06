package org.example.oval.variable.function;
import org.example.oval.OvalEntityMapping;
import org.example.oval.variable.OvalVariableExtractor;
import org.mitre.oval.xmlschema.oval_definitions_5.ConcatFunctionType;
import org.mitre.oval.xmlschema.oval_definitions_5.EscapeRegexFunctionType;
import org.mitre.oval.xmlschema.oval_definitions_5.LocalVariable;

public class FunctionGroupExtractorFactory {
    public static OvalVariableExtractor getFromVariable(OvalEntityMapping ovalEntityMapping,
                                                        LocalVariable localVariable) {
        ConcatFunctionType concatVariable = localVariable.getConcat();
        if (concatVariable != null)
            return new ConcatVariableExtractor(ovalEntityMapping, concatVariable);
        EscapeRegexFunctionType escapeRegex = localVariable.getEscapeRegex();
        if (escapeRegex != null)
            return new EscapeRegexFunctionExtractor(ovalEntityMapping, escapeRegex);
        return null;
    }
    public static OvalVariableExtractor getFromComponent(OvalEntityMapping ovalEntityMapping, Object component) {
        if (component instanceof ConcatFunctionType)
            return new ConcatVariableExtractor(ovalEntityMapping, (ConcatFunctionType) component);
        if (component instanceof EscapeRegexFunctionType)
            return new EscapeRegexFunctionExtractor(ovalEntityMapping, (EscapeRegexFunctionType) component);
        return null;
    }
}
