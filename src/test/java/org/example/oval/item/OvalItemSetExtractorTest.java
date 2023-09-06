package org.example.oval.item;

import org.example.oval.file.WinFileItemSetExtractor;
import org.junit.Test;
import org.mitre.oval.xmlschema.oval_definitions_5.SetOperatorEnumeration;

import org.example.oval.item.ItemSetExtractResult.ItemSetExtractResultType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class OvalItemSetExtractorTest {

    @Test
    public void testNotCompleteUnion() {
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.UNION;
            ItemSetExtractResultType type1 = ItemSetExtractResultType.COMPLETE;
            ItemSetExtractResultType type2 = ItemSetExtractResultType.COMPLETE;
            ItemSetExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemSetExtractResultType.COMPLETE;
        }
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.UNION;
            ItemSetExtractResultType type1 = ItemSetExtractResultType.ERROR;
            ItemSetExtractResultType type2 = ItemSetExtractResultType.INCOMPLETE;
            ItemSetExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemSetExtractResultType.ERROR;
        }
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.UNION;
            ItemSetExtractResultType type1 = ItemSetExtractResultType.INCOMPLETE;
            ItemSetExtractResultType type2 = ItemSetExtractResultType.DOES_NOT_EXIST;
            ItemSetExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemSetExtractResultType.INCOMPLETE;
        }
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.UNION;
            ItemSetExtractResultType type1 = ItemSetExtractResultType.DOES_NOT_EXIST;
            ItemSetExtractResultType type2 = ItemSetExtractResultType.NOT_COLLECTED;
            ItemSetExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemSetExtractResultType.DOES_NOT_EXIST;
        }
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.UNION;
            ItemSetExtractResultType type1 = ItemSetExtractResultType.NOT_COLLECTED;
            ItemSetExtractResultType type2 = ItemSetExtractResultType.NOT_APPLICABLE;
            ItemSetExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemSetExtractResultType.NOT_COLLECTED;
        }
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.UNION;
            ItemSetExtractResultType type1 = ItemSetExtractResultType.NOT_APPLICABLE;
            ItemSetExtractResultType type2 = ItemSetExtractResultType.COMPLETE;
            ItemSetExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemSetExtractResultType.NOT_APPLICABLE;
        }
    }

    @Test
    public void testNotCompleteIntersection() {
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.INTERSECTION;
            ItemSetExtractResultType type1 = ItemSetExtractResultType.COMPLETE;
            ItemSetExtractResultType type2 = ItemSetExtractResultType.COMPLETE;
            ItemSetExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemSetExtractResultType.COMPLETE;
        }
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.INTERSECTION;
            ItemSetExtractResultType type1 = ItemSetExtractResultType.DOES_NOT_EXIST;
            ItemSetExtractResultType type2 = ItemSetExtractResultType.ERROR;
            ItemSetExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemSetExtractResultType.DOES_NOT_EXIST;
        }
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.INTERSECTION;
            ItemSetExtractResultType type1 = ItemSetExtractResultType.ERROR;
            ItemSetExtractResultType type2 = ItemSetExtractResultType.NOT_COLLECTED;
            ItemSetExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemSetExtractResultType.ERROR;
        }
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.INTERSECTION;
            ItemSetExtractResultType type1 = ItemSetExtractResultType.NOT_COLLECTED;
            ItemSetExtractResultType type2 = ItemSetExtractResultType.INCOMPLETE;
            ItemSetExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemSetExtractResultType.NOT_COLLECTED;
        }
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.INTERSECTION;
            ItemSetExtractResultType type1 = ItemSetExtractResultType.INCOMPLETE;
            ItemSetExtractResultType type2 = ItemSetExtractResultType.NOT_APPLICABLE;
            ItemSetExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemSetExtractResultType.INCOMPLETE;
        }
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.INTERSECTION;
            ItemSetExtractResultType type1 = ItemSetExtractResultType.NOT_APPLICABLE;
            ItemSetExtractResultType type2 = ItemSetExtractResultType.COMPLETE;
            ItemSetExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemSetExtractResultType.NOT_APPLICABLE;
        }
    }

    @Test
    public void testNotCompleteComplement() {
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.COMPLEMENT;
            ItemSetExtractResultType type1 = ItemSetExtractResultType.COMPLETE;
            ItemSetExtractResultType type2 = ItemSetExtractResultType.COMPLETE;
            ItemSetExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemSetExtractResultType.COMPLETE;
        }
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.COMPLEMENT;
            ItemSetExtractResultType type1 = ItemSetExtractResultType.ERROR;
            ItemSetExtractResultType type2 = ItemSetExtractResultType.NOT_COLLECTED;
            ItemSetExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemSetExtractResultType.ERROR;
        }
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.COMPLEMENT;
            ItemSetExtractResultType type1 = ItemSetExtractResultType.DOES_NOT_EXIST;
            ItemSetExtractResultType type2 = ItemSetExtractResultType.NOT_APPLICABLE;
            ItemSetExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemSetExtractResultType.ERROR;
        }
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.COMPLEMENT;
            ItemSetExtractResultType type1 = ItemSetExtractResultType.DOES_NOT_EXIST;
            ItemSetExtractResultType type2 = ItemSetExtractResultType.ERROR;
            ItemSetExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemSetExtractResultType.DOES_NOT_EXIST;
        }
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.COMPLEMENT;
            ItemSetExtractResultType type1 = ItemSetExtractResultType.NOT_COLLECTED;
            ItemSetExtractResultType type2 = ItemSetExtractResultType.ERROR;
            ItemSetExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemSetExtractResultType.ERROR;
        }
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.COMPLEMENT;
            ItemSetExtractResultType type1 = ItemSetExtractResultType.DOES_NOT_EXIST;
            ItemSetExtractResultType type2 = ItemSetExtractResultType.NOT_COLLECTED;
            ItemSetExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemSetExtractResultType.DOES_NOT_EXIST;
        }
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.COMPLEMENT;
            ItemSetExtractResultType type1 = ItemSetExtractResultType.INCOMPLETE;
            ItemSetExtractResultType type2 = ItemSetExtractResultType.NOT_COLLECTED;
            ItemSetExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemSetExtractResultType.NOT_COLLECTED;
        }
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.COMPLEMENT;
            ItemSetExtractResultType type1 = ItemSetExtractResultType.NOT_COLLECTED;
            ItemSetExtractResultType type2 = ItemSetExtractResultType.INCOMPLETE;
            ItemSetExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemSetExtractResultType.NOT_COLLECTED;
        }
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.COMPLEMENT;
            ItemSetExtractResultType type1 = ItemSetExtractResultType.INCOMPLETE;
            ItemSetExtractResultType type2 = ItemSetExtractResultType.DOES_NOT_EXIST;
            ItemSetExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemSetExtractResultType.INCOMPLETE;
        }
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.COMPLEMENT;
            ItemSetExtractResultType type1 = ItemSetExtractResultType.INCOMPLETE;
            ItemSetExtractResultType type2 = ItemSetExtractResultType.INCOMPLETE;
            ItemSetExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemSetExtractResultType.ERROR;
        }
    }

    @Test
    public void testCompleteResult() {
        OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
        Map<String, ItemType> map1 = new HashMap<>();
        Map<String, ItemType> map2 = new HashMap<>();
        for (int i=0 ; i<2 ; i++) {
            if (i < 4) {
                ItemType itemType = new ItemType();
                itemType.setId(new BigInteger("" + i));
                map1.put("item-" + i, itemType);
            } else {

            }
        }
        for (int i=1 ; i<3 ; i++) {
            ItemType itemType = new ItemType();
            itemType.setId(new BigInteger("" + i));
            map2.put("item-" + i, itemType);
        }

        {
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.UNION;
            ItemSetExtractResult completeResult = ovalItemSetExtractor.getCompleteResult(map1, map2, enumeration);
            assert completeResult.getExtractedItems().size() == 1;
            assert completeResult.getExtractedItems().get(0).getId().equals(new BigInteger("1"));
        }
        {
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.INTERSECTION;
            ItemSetExtractResult completeResult = ovalItemSetExtractor.getCompleteResult(map1, map2, enumeration);
            assert completeResult.getExtractedItems().size() == 2;

            Map<String, ItemType> itemTypeMap = new HashMap<>();
            for (ItemType itemType : completeResult.getExtractedItems())
                itemTypeMap.put(itemType.getId().toString(), itemType);

            assert itemTypeMap.containsKey("0");
            assert itemTypeMap.containsKey("2");
        }
        {
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.COMPLEMENT;
            ItemSetExtractResult completeResult = ovalItemSetExtractor.getCompleteResult(map1, map2, enumeration);
            assert completeResult.getExtractedItems().size() == 1;
            assert completeResult.getExtractedItems().get(0).getId().equals(new BigInteger("0"));
        }
    }
}

