package org.example.oval.item;

import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;

import java.util.ArrayList;
import java.util.List;

public class ItemSetExtractResult {

    private List<ItemType> extractedItems = new ArrayList<>();
    private ItemSetExtractResultType resultType = ItemSetExtractResultType.COMPLETE;

    public List<ItemType> getExtractedItems() {
        return extractedItems;
    }

    public ItemSetExtractResult() {

    }

    public ItemSetExtractResult(ItemSetExtractResultType itemSetExtractResultType) {
        this.resultType = itemSetExtractResultType;
    }

    public ItemSetExtractResult(List<ItemType> extractedItems) {
        this.extractedItems = extractedItems;
    }

    public void setExtractedItems(List<ItemType> extractedItems) {
        this.extractedItems = extractedItems;
    }

    public ItemSetExtractResultType getResultType() {
        return resultType;
    }

    public void setResultType(ItemSetExtractResultType resultType) {
        this.resultType = resultType;
    }

    public static enum ItemSetExtractResultType {
        ERROR, COMPLETE, INCOMPLETE, DOES_NOT_EXIST, NOT_COLLECTED, NOT_APPLICABLE
    }
}
