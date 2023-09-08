package org.example.oval;

import org.example.oval.variable.OvalVariableExtractor;
import org.example.oval.variable.OvalVariableExtractorFactory;
import org.example.oval.variable.VariableExtractResult;
import org.mitre.oval.xmlschema.oval_definitions_5.EntitySimpleBaseType;
import org.mitre.oval.xmlschema.oval_definitions_5.VariableType;

import java.util.ArrayList;
import java.util.List;

public class OvalSimpleValueExtractor {

    private OvalEntityMappingContext ovalEntityMappingContext;

    public OvalSimpleValueExtractor(OvalEntityMappingContext ovalEntityMappingContext) {
        this.ovalEntityMappingContext = ovalEntityMappingContext;
    }

    public List<Object> extract(EntitySimpleBaseType entitySimpleBaseType) throws Exception {
        String varRef = entitySimpleBaseType.getVarRef();
        if (varRef != null) {
            VariableExtractResult variableResult = ovalEntityMappingContext.getVariableResult(varRef);
            if (variableResult != null)
                return variableResult.getExtractedItems();

            VariableType variable = ovalEntityMappingContext.getVariableType(varRef);
            if (variable == null)
                return new ArrayList<>();

            OvalVariableExtractor extractor = OvalVariableExtractorFactory.getExtractor(ovalEntityMappingContext, variable);
            variableResult = extractor.extract();
            ovalEntityMappingContext.putVariableResult(varRef, variableResult);
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
