package org.example.oval.variable.function;

import org.example.oval.OvalEntityMappingContext;
import org.example.oval.item.ItemExtractResult;
import org.example.oval.variable.LocalVariableExtractorFactory.LiteralComponentExtractor;
import org.example.oval.variable.OvalVariableExtractor;
import org.example.oval.variable.OvalVariableExtractorFactory;
import org.example.oval.variable.VariableExtractResult;
import org.example.oval.variable.VariableExtractResult.VariableExtractResultType;
import org.example.oval.variable.object.ObjectComponentExtractorFactory;
import org.mitre.oval.xmlschema.oval_definitions_5.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConcatVariableExtractor implements OvalVariableExtractor {
    private OvalEntityMappingContext mappingContext;
    private ConcatFunctionType concatFunctionType;

    public ConcatVariableExtractor(OvalEntityMappingContext mappingContext, ConcatFunctionType concatFunctionType) {
        this.mappingContext = mappingContext;
        this.concatFunctionType = concatFunctionType;
    }

    @Override
    public VariableExtractResult extract() {
        List<VariableExtractResult> variableExtractResults = new ArrayList<>();
        Set<VariableExtractResultType> extractedTypes = new HashSet<>();
        List<Object> objects = concatFunctionType.getObjectComponentOrVariableComponentOrLiteralComponent();
        for (Object object : objects) {
            OvalVariableExtractor extractor = null;
            if (object instanceof ObjectComponentType) {
                ObjectComponentType objectComponentType = (ObjectComponentType) object;
                extractor = ObjectComponentExtractorFactory.getExtractor(mappingContext, objectComponentType);
            } else if (object instanceof VariableComponentType) {
                VariableComponentType variableComponentType = (VariableComponentType) object;
                String varRef = variableComponentType.getVarRef();
                VariableType variableType = mappingContext.getVariableType(varRef);
                extractor = OvalVariableExtractorFactory.getExtractor(mappingContext, variableType);
            } else if (object instanceof LiteralComponentType) {
                LiteralComponentType literalComponentType = (LiteralComponentType) object;
                extractor = new LiteralComponentExtractor(literalComponentType);
            } else {
                extractor = FunctionGroupExtractorFactory.getFromComponent(mappingContext, object);
            }
            if (extractor == null)
                return new VariableExtractResult(VariableExtractResultType.ERROR);
            VariableExtractResult extractResult = extractor.extract();
            variableExtractResults.add(extractResult);
            extractedTypes.add(extractResult.getResultType());

        }

        if (extractedTypes.contains(VariableExtractResultType.ERROR))
            return new VariableExtractResult(VariableExtractResultType.ERROR);
        if (extractedTypes.contains(VariableExtractResultType.INCOMPLETE))
            return new VariableExtractResult(VariableExtractResultType.INCOMPLETE);
        if (extractedTypes.contains(VariableExtractResultType.DOES_NOT_EXIST))
            return new VariableExtractResult(VariableExtractResultType.DOES_NOT_EXIST);
        if (extractedTypes.contains(VariableExtractResultType.NOT_COLLECTED))
            return new VariableExtractResult(VariableExtractResultType.NOT_COLLECTED);
        if (extractedTypes.contains(VariableExtractResultType.NOT_APPLICABLE))
            return new VariableExtractResult(VariableExtractResultType.NOT_APPLICABLE);

        String concat = "";
        for (VariableExtractResult variableExtractResult : variableExtractResults)
            for (Object o : variableExtractResult.getExtractedItems())
                concat += o.toString();
        VariableExtractResult variableExtractResult = new VariableExtractResult();
        variableExtractResult.getExtractedItems().add(concat);
        return variableExtractResult;
    }
}
