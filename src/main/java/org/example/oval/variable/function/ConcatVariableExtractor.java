package org.example.oval.variable.function;

import org.example.oval.OvalEntityMapping;
import org.example.oval.variable.LocalVariableExtractorFactory.LiteralComponentExtractor;
import org.example.oval.variable.OvalVariableExtractor;
import org.example.oval.variable.OvalVariableExtractorFactory;
import org.example.oval.variable.object.ObjectComponentExtractorFactory;
import org.mitre.oval.xmlschema.oval_definitions_5.*;

import java.util.ArrayList;
import java.util.List;

public class ConcatVariableExtractor implements OvalVariableExtractor {

    private OvalEntityMapping ovalEntityMapping;
    private ConcatFunctionType concatFunctionType;

    public ConcatVariableExtractor(OvalEntityMapping ovalEntityMapping, ConcatFunctionType concatFunctionType) {
        this.ovalEntityMapping = ovalEntityMapping;
        this.concatFunctionType = concatFunctionType;
    }

    @Override
    public Object extract() throws Exception {
        List<OvalVariableExtractor> extractors = new ArrayList<>();
        List<Object> objects = concatFunctionType.getObjectComponentOrVariableComponentOrLiteralComponent();
        for (Object object : objects) {
            if (object instanceof ObjectComponentType) {
                ObjectComponentType objectComponentType = (ObjectComponentType) object;
                extractors.add(ObjectComponentExtractorFactory.getExtractor(ovalEntityMapping, objectComponentType));
            } else if (object instanceof VariableComponentType) {
                VariableComponentType variableComponentType = (VariableComponentType) object;
                String varRef = variableComponentType.getVarRef();
                VariableType variableType = ovalEntityMapping.getVariableType(varRef);
                extractors.add(OvalVariableExtractorFactory.getExtractor(ovalEntityMapping, variableType));
            } else {
                LiteralComponentType literalComponentType = (LiteralComponentType) object;
                extractors.add(new LiteralComponentExtractor(literalComponentType));
            }
        }

        // wrapper 클래스 필요할듯. 각각의 결과 중 에러나 수집되지 않음 이슈가 있을 수 있음.
        List<Object> extractedObjects = new ArrayList<>();
        for (OvalVariableExtractor extractor : extractors)
            extractedObjects.add(extractor.extract());
        return extractedObjects;
    }
}
