package org.example.oval;

import org.example.oval.variable.OvalVariableExtractor;
import org.example.oval.variable.OvalVariableExtractorFactory;
import org.example.oval.variable.VariableExtractResult;
import org.mitre.oval.xmlschema.oval_definitions_5.EntitySimpleBaseType;
import org.mitre.oval.xmlschema.oval_definitions_5.VariableType;

import java.util.ArrayList;
import java.util.List;

public class OvalSimpleValueExtractor {

    private OvalEntityMappingContext mappingContext;

    public OvalSimpleValueExtractor(OvalEntityMappingContext mappingContext) {
        this.mappingContext = mappingContext;
    }

    public List<Object> extract(EntitySimpleBaseType entitySimpleBaseType) {
        if (entitySimpleBaseType == null)
            return new ArrayList<>();
        String varRef = entitySimpleBaseType.getVarRef();
        if (varRef != null) {
            VariableExtractResult variableResult = mappingContext.getVariableResult(varRef);
            if (variableResult != null)
                return variableResult.getExtractedItems();

            VariableType variable = mappingContext.getVariableType(varRef);
            if (variable == null)
                return new ArrayList<>();

            OvalVariableExtractor extractor = OvalVariableExtractorFactory.getExtractor(mappingContext, variable);
            if (extractor == null)
                return new ArrayList<>();

            variableResult = extractor.extract();
            mappingContext.putVariableResult(varRef, variableResult);
            return variableResult.getExtractedItems();
        }
        List<Object> variables = new ArrayList<>();
        Object value = entitySimpleBaseType.getValue();
        if (value == null)
            return variables;
        variables.add(value);
        return variables;
    }

}
