package org.example.oval.item;

import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;

import java.util.ArrayList;
import java.util.List;

public class ItemExtractResult {

    private List<ItemType> extractedItems = new ArrayList<>();
    private ItemExtractResultType resultType = ItemExtractResultType.COMPLETE;

    public List<ItemType> getExtractedItems() {
        return extractedItems;
    }

    public void setExtractedItems(List<ItemType> extractedItems) {
        this.extractedItems = extractedItems;
    }

    public ItemExtractResultType getResultType() {
        return resultType;
    }

    public void setResultType(ItemExtractResultType resultType) {
        this.resultType = resultType;
    }

    public static enum ItemExtractResultType {
        ERROR, COMPLETE, INCOMPLETE, DOES_NOT_EXIST, NOT_COLLECTED, NOT_APPLICABLE
    }

}
