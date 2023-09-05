package org.example.oval;

import org.example.oval.variable.OvalVariableExtractorFactory;
import org.mitre.oval.xmlschema.oval_common_5.SimpleDatatypeEnumeration;
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
        List<Object> variables = new ArrayList<>();
        String varRef = entitySimpleBaseType.getVarRef();
        if (varRef != null) {
            VariableType variableType = ovalEntityMapping.getVariableType(varRef);
            if (variableType == null)
                return new ArrayList<>();
            Object variable = OvalVariableExtractorFactory.getExtractor(ovalEntityMapping, variableType).extract();
            if (variable instanceof List)
                return (List<Object>) variable;
            variables.add(variable);
            return variables;
        }
        Object value = entitySimpleBaseType.getValue();
        if (value == null)
            return variables;
        variables.add(value);
        return variables;
    }

}
