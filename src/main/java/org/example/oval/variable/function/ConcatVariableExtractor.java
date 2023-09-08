package org.example.oval.variable.function;

import org.example.oval.OvalEntityMappingContext;
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

    private OvalEntityMappingContext entityMappingContext;
    private ConcatFunctionType concatFunctionType;

    public ConcatVariableExtractor(OvalEntityMappingContext entityMappingContext, ConcatFunctionType concatFunctionType) {
        this.entityMappingContext = entityMappingContext;
        this.concatFunctionType = concatFunctionType;
    }

    @Override
    public VariableExtractResult extract() {
        List<OvalVariableExtractor> extractors = new ArrayList<>();
        List<Object> objects = concatFunctionType.getObjectComponentOrVariableComponentOrLiteralComponent();
        for (Object object : objects) {
            if (object instanceof ObjectComponentType) {
                ObjectComponentType objectComponentType = (ObjectComponentType) object;
                extractors.add(ObjectComponentExtractorFactory.getExtractor(entityMappingContext, objectComponentType));
            } else if (object instanceof VariableComponentType) {
                VariableComponentType variableComponentType = (VariableComponentType) object;
                String varRef = variableComponentType.getVarRef();
                VariableType variableType = entityMappingContext.getVariableType(varRef);
                extractors.add(OvalVariableExtractorFactory.getExtractor(entityMappingContext, variableType));
            } else if (object instanceof LiteralComponentType) {
                LiteralComponentType literalComponentType = (LiteralComponentType) object;
                extractors.add(new LiteralComponentExtractor(literalComponentType));
            } else {
                extractors.add(FunctionGroupExtractorFactory.getFromComponent(entityMappingContext, object));
            }
        }

        Set<VariableExtractResultType> extractedTypes = new HashSet<>();
        List<Object> extractedObjects = new ArrayList<>();
        for (OvalVariableExtractor extractor : extractors) {
            VariableExtractResult variableExtractResult = extractor.extract();
            if (variableExtractResult == null) {
                extractedTypes.add(VariableExtractResultType.ERROR);
                continue;
            }
            extractedTypes.add(variableExtractResult.getResultType());
            if (variableExtractResult.getResultType() != VariableExtractResultType.COMPLETE)
                continue;
            extractedObjects.addAll(variableExtractResult.getExtractedItems());
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
        for (Object o : extractedObjects)
            concat += o.toString();
        VariableExtractResult variableExtractResult = new VariableExtractResult();
        variableExtractResult.getExtractedItems().add(concat);
        return variableExtractResult;
    }
}
