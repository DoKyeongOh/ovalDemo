package org.example.oval.variable;

import org.example.oval.OvalEntityMapping;
import org.example.oval.variable.function.FunctionGroupExtractorFactory;
import org.example.oval.variable.object.ObjectComponentExtractorFactory;
import org.mitre.oval.xmlschema.oval_definitions_5.*;

public class LocalVariableExtractorFactory {
    public static OvalVariableExtractor getLocalVariableExtractor(OvalEntityMapping ovalEntityMapping,
                                                                  LocalVariable localVariable) throws Exception {
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
            throw new Exception("input variable error - " + localVariable.getId());
        if (localVariable.getLiteralComponent() != null)
            return new LiteralComponentExtractor(localVariable.getLiteralComponent());
        else if (localVariable.getVariableComponent() != null)
            return new VariableComponentExtractor(ovalEntityMapping, localVariable.getVariableComponent());
        else if (localVariable.getObjectComponent() != null)
            return ObjectComponentExtractorFactory.getExtractor(ovalEntityMapping, localVariable.getObjectComponent());
        else
            return FunctionGroupExtractorFactory.getFromVariable(ovalEntityMapping, localVariable);
    }

    public static class LiteralComponentExtractor implements OvalVariableExtractor {
        private LiteralComponentType literalComponentType;
        public LiteralComponentExtractor(LiteralComponentType literalComponentType) {
            this.literalComponentType = literalComponentType;
        }
        @Override
        public VariableExtractResult extract() throws Exception {
            VariableExtractResult variableExtractResult = new VariableExtractResult();
            variableExtractResult.getExtractedItems().add(literalComponentType.getValue());
            return variableExtractResult;
        }
    }

    public static class VariableComponentExtractor implements OvalVariableExtractor {
        private OvalEntityMapping ovalEntityMapping;
        private VariableComponentType variableComponentType;
        public VariableComponentExtractor(OvalEntityMapping ovalEntityMapping,
                                          VariableComponentType variableComponentType) {
            this.ovalEntityMapping = ovalEntityMapping;
            this.variableComponentType = variableComponentType;
        }
        @Override
        public VariableExtractResult extract() throws Exception {
            String varRef = variableComponentType.getVarRef();
            VariableType variableType = ovalEntityMapping.getVariableType(varRef);
            return OvalVariableExtractorFactory.getExtractor(ovalEntityMapping, variableType).extract();
        }
    }


}
