package org.example.oval.variable;

import org.example.oval.OvalEntityMappingContext;
import org.example.oval.variable.function.FunctionGroupExtractorFactory;
import org.example.oval.variable.object.ObjectComponentExtractorFactory;
import org.mitre.oval.xmlschema.oval_definitions_5.*;

public class LocalVariableExtractorFactory {
    public static OvalVariableExtractor getLocalVariableExtractor(OvalEntityMappingContext entityMappingContext,
                                                                  LocalVariable localVariable) {
        int presentCount = 0;
        presentCount += localVariable.getLiteralComponent() != null ? 1 : 0;
        presentCount += localVariable.getObjectComponent() != null ? 1 : 0;
        presentCount += localVariable.getVariableComponent() != null ? 1 : 0;
        presentCount += localVariable.getConcat() != null || localVariable.getArithmetic() != null
                || localVariable.getBegin() != null || localVariable.getEnd() != null
                || localVariable.getCount() != null || localVariable.getGlobToRegex() != null
                || localVariable.getEscapeRegex() != null || localVariable.getRegexCapture() != null
                || localVariable.getSplit() != null || localVariable.getSubstring() != null
                || localVariable.getTimeDifference() != null || localVariable.getUnique() != null
                ? 1 : 0;
        if (presentCount > 1)
            return () -> new VariableExtractResult(VariableExtractResult.VariableExtractResultType.ERROR);
        if (localVariable.getLiteralComponent() != null)
            return new LiteralComponentExtractor(localVariable.getLiteralComponent());
        else if (localVariable.getVariableComponent() != null)
            return new VariableComponentExtractor(entityMappingContext, localVariable.getVariableComponent());
        else if (localVariable.getObjectComponent() != null)
            return ObjectComponentExtractorFactory.getExtractor(entityMappingContext, localVariable.getObjectComponent());
        else
            return FunctionGroupExtractorFactory.getFromVariable(entityMappingContext, localVariable);
    }

    public static class LiteralComponentExtractor implements OvalVariableExtractor {
        private LiteralComponentType literalComponentType;
        public LiteralComponentExtractor(LiteralComponentType literalComponentType) {
            this.literalComponentType = literalComponentType;
        }
        @Override
        public VariableExtractResult extract() {
            VariableExtractResult variableExtractResult = new VariableExtractResult();
            variableExtractResult.getExtractedItems().add(literalComponentType.getValue());
            return variableExtractResult;
        }
    }

    public static class VariableComponentExtractor implements OvalVariableExtractor {
        private OvalEntityMappingContext ovalEntityMappingContext;
        private VariableComponentType variableComponentType;
        public VariableComponentExtractor(OvalEntityMappingContext ovalEntityMappingContext,
                                          VariableComponentType variableComponentType) {
            this.ovalEntityMappingContext = ovalEntityMappingContext;
            this.variableComponentType = variableComponentType;
        }
        @Override
        public VariableExtractResult extract() {
            String varRef = variableComponentType.getVarRef();
            VariableType variableType = ovalEntityMappingContext.getVariableType(varRef);
            return OvalVariableExtractorFactory.getExtractor(ovalEntityMappingContext, variableType).extract();
        }
    }


}
