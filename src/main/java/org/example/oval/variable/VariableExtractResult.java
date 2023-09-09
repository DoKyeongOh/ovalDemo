package org.example.oval.variable;

import java.util.ArrayList;
import java.util.List;

public class VariableExtractResult {

    private List<Object> extractedItems;

    private VariableExtractResultType resultType;

    public VariableExtractResult() {
        extractedItems = new ArrayList<>();
        resultType = VariableExtractResultType.COMPLETE;
    }

    public VariableExtractResult(List<Object> extractedItems) {
        this.extractedItems = extractedItems;
        resultType = VariableExtractResultType.COMPLETE;
        if (extractedItems.isEmpty())
            resultType = VariableExtractResultType.DOES_NOT_EXIST;
    }

    public VariableExtractResult(VariableExtractResultType resultType) {
        this.resultType = resultType;
        extractedItems = new ArrayList<>();
    }

    public List<Object> getExtractedItems() {
        return extractedItems;
    }

    public void setExtractedItems(List<Object> extractedItems) {
        this.extractedItems = extractedItems;
    }

    public VariableExtractResultType getResultType() {
        return resultType;
    }

    public void setResultType(VariableExtractResultType resultType) {
        this.resultType = resultType;
    }

    public enum VariableExtractResultType {
        ERROR, COMPLETE, INCOMPLETE, DOES_NOT_EXIST, NOT_COLLECTED, NOT_APPLICABLE
    }

}
