package org.example.oval.variable.function;

import org.example.oval.OvalEntityMappingContext;
import org.example.oval.variable.OvalVariableExtractor;
import org.example.oval.variable.VariableExtractResult;
import org.mitre.oval.xmlschema.oval_definitions_5.EscapeRegexFunctionType;
import org.mitre.oval.xmlschema.oval_definitions_5.LocalVariable;

public class EscapeRegexFunctionExtractor implements OvalVariableExtractor {

    private OvalEntityMappingContext entityMappingContext;
    private LocalVariable localVariable;
    private EscapeRegexFunctionType escapeRegex;

    public EscapeRegexFunctionExtractor(OvalEntityMappingContext entityMappingContext, EscapeRegexFunctionType escapeRegex) {
        this.entityMappingContext = entityMappingContext;
        this.escapeRegex = escapeRegex;
    }

    @Override
    public VariableExtractResult extract() throws Exception {
        return null;
    }
}
