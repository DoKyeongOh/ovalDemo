package org.example.oval.variable.function;

import org.example.oval.OvalEntityMapping;
import org.example.oval.variable.OvalVariableExtractor;
import org.example.oval.variable.VariableExtractResult;
import org.mitre.oval.xmlschema.oval_definitions_5.EscapeRegexFunctionType;
import org.mitre.oval.xmlschema.oval_definitions_5.LocalVariable;

public class EscapeRegexFunctionExtractor implements OvalVariableExtractor {

    private OvalEntityMapping ovalEntityMapping;
    private LocalVariable localVariable;
    private EscapeRegexFunctionType escapeRegex;

    public EscapeRegexFunctionExtractor(OvalEntityMapping ovalEntityMapping, EscapeRegexFunctionType escapeRegex) {
        this.ovalEntityMapping = ovalEntityMapping;
        this.escapeRegex = escapeRegex;
    }

    @Override
    public VariableExtractResult extract() throws Exception {
        return null;
    }
}
