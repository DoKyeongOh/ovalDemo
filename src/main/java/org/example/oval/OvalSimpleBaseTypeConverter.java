package org.example.oval;

import org.example.oval.variable.OvalVariableExtractorFactory;
import org.mitre.oval.xmlschema.oval_definitions_5.EntitySimpleBaseType;
import org.mitre.oval.xmlschema.oval_definitions_5.VariableType;

import java.util.ArrayList;
import java.util.List;

public class OvalSimpleBaseTypeConverter {

    private OvalEntityMapping ovalEntityMapping;

    public OvalSimpleBaseTypeConverter(OvalEntityMapping ovalEntityMapping) {
        this.ovalEntityMapping = ovalEntityMapping;
    }

    public List<Object> convert(EntitySimpleBaseType entitySimpleBaseType) throws Exception {
        Object value = entitySimpleBaseType.getValue();
        String varRef = entitySimpleBaseType.getVarRef();
        if (value != null && varRef != null)
            throw new Exception("EntitySimpleBaseType cannot have value and var_ref at the same time.");
        if (value != null) {
            List<Object> variables = new ArrayList<>();
            variables.add(value);
            return variables;
        }
        VariableType variableType = ovalEntityMapping.getVariableType(varRef);
        if (variableType == null)
            return new ArrayList<>();
        Object variable = OvalVariableExtractorFactory.getExtractor(ovalEntityMapping, variableType).extract();
        if (variable instanceof List)
            return (List<Object>) variable;
        List<Object> variables = new ArrayList<>();
        variables.add(variable);
        return variables;
    }

}
