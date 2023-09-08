package org.example.oval.variable.function;
import org.example.oval.OvalEntityMappingContext;
import org.example.oval.variable.OvalVariableExtractor;
import org.mitre.oval.xmlschema.oval_definitions_5.ConcatFunctionType;
import org.mitre.oval.xmlschema.oval_definitions_5.EscapeRegexFunctionType;
import org.mitre.oval.xmlschema.oval_definitions_5.LocalVariable;

public class FunctionGroupExtractorFactory {
    public static OvalVariableExtractor getFromVariable(OvalEntityMappingContext entityMappingContext,
                                                        LocalVariable localVariable) {
        ConcatFunctionType concatVariable = localVariable.getConcat();
        if (concatVariable != null)
            return new ConcatVariableExtractor(entityMappingContext, concatVariable);
        EscapeRegexFunctionType escapeRegex = localVariable.getEscapeRegex();
        if (escapeRegex != null)
            return new EscapeRegexFunctionExtractor(entityMappingContext, escapeRegex);
        return null;
    }
    public static OvalVariableExtractor getFromComponent(OvalEntityMappingContext entityMappingContext,
                                                         Object component) {
        if (component instanceof ConcatFunctionType)
            return new ConcatVariableExtractor(entityMappingContext, (ConcatFunctionType) component);
        if (component instanceof EscapeRegexFunctionType)
            return new EscapeRegexFunctionExtractor(entityMappingContext, (EscapeRegexFunctionType) component);
        return null;
    }
}
