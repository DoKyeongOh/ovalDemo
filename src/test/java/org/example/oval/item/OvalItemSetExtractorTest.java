package org.example.oval.item;

import org.example.oval.file.WinFileItemSetExtractor;
import org.junit.Test;
import org.mitre.oval.xmlschema.oval_definitions_5.SetOperatorEnumeration;

import org.example.oval.item.ItemExtractResult.ItemExtractResultType;
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
            ItemExtractResultType type1 = ItemExtractResultType.COMPLETE;
            ItemExtractResultType type2 = ItemExtractResultType.COMPLETE;
            ItemExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemExtractResultType.COMPLETE;
        }
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.UNION;
            ItemExtractResultType type1 = ItemExtractResultType.ERROR;
            ItemExtractResultType type2 = ItemExtractResultType.INCOMPLETE;
            ItemExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemExtractResultType.ERROR;
        }
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.UNION;
            ItemExtractResultType type1 = ItemExtractResultType.INCOMPLETE;
            ItemExtractResultType type2 = ItemExtractResultType.DOES_NOT_EXIST;
            ItemExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemExtractResultType.INCOMPLETE;
        }
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.UNION;
            ItemExtractResultType type1 = ItemExtractResultType.DOES_NOT_EXIST;
            ItemExtractResultType type2 = ItemExtractResultType.NOT_COLLECTED;
            ItemExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemExtractResultType.DOES_NOT_EXIST;
        }
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.UNION;
            ItemExtractResultType type1 = ItemExtractResultType.NOT_COLLECTED;
            ItemExtractResultType type2 = ItemExtractResultType.NOT_APPLICABLE;
            ItemExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemExtractResultType.NOT_COLLECTED;
        }
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.UNION;
            ItemExtractResultType type1 = ItemExtractResultType.NOT_APPLICABLE;
            ItemExtractResultType type2 = ItemExtractResultType.COMPLETE;
            ItemExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemExtractResultType.NOT_APPLICABLE;
        }
    }

    @Test
    public void testNotCompleteIntersection() {
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.INTERSECTION;
            ItemExtractResultType type1 = ItemExtractResultType.COMPLETE;
            ItemExtractResultType type2 = ItemExtractResultType.COMPLETE;
            ItemExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemExtractResultType.COMPLETE;
        }
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.INTERSECTION;
            ItemExtractResultType type1 = ItemExtractResultType.DOES_NOT_EXIST;
            ItemExtractResultType type2 = ItemExtractResultType.ERROR;
            ItemExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemExtractResultType.DOES_NOT_EXIST;
        }
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.INTERSECTION;
            ItemExtractResultType type1 = ItemExtractResultType.ERROR;
            ItemExtractResultType type2 = ItemExtractResultType.NOT_COLLECTED;
            ItemExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemExtractResultType.ERROR;
        }
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.INTERSECTION;
            ItemExtractResultType type1 = ItemExtractResultType.NOT_COLLECTED;
            ItemExtractResultType type2 = ItemExtractResultType.INCOMPLETE;
            ItemExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemExtractResultType.NOT_COLLECTED;
        }
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.INTERSECTION;
            ItemExtractResultType type1 = ItemExtractResultType.INCOMPLETE;
            ItemExtractResultType type2 = ItemExtractResultType.NOT_APPLICABLE;
            ItemExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemExtractResultType.INCOMPLETE;
        }
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.INTERSECTION;
            ItemExtractResultType type1 = ItemExtractResultType.NOT_APPLICABLE;
            ItemExtractResultType type2 = ItemExtractResultType.COMPLETE;
            ItemExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemExtractResultType.NOT_APPLICABLE;
        }
    }

    @Test
    public void testNotCompleteComplement() {
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.COMPLEMENT;
            ItemExtractResultType type1 = ItemExtractResultType.COMPLETE;
            ItemExtractResultType type2 = ItemExtractResultType.COMPLETE;
            ItemExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemExtractResultType.COMPLETE;
        }
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.COMPLEMENT;
            ItemExtractResultType type1 = ItemExtractResultType.ERROR;
            ItemExtractResultType type2 = ItemExtractResultType.NOT_COLLECTED;
            ItemExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemExtractResultType.ERROR;
        }
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.COMPLEMENT;
            ItemExtractResultType type1 = ItemExtractResultType.DOES_NOT_EXIST;
            ItemExtractResultType type2 = ItemExtractResultType.NOT_APPLICABLE;
            ItemExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemExtractResultType.ERROR;
        }
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.COMPLEMENT;
            ItemExtractResultType type1 = ItemExtractResultType.DOES_NOT_EXIST;
            ItemExtractResultType type2 = ItemExtractResultType.ERROR;
            ItemExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemExtractResultType.DOES_NOT_EXIST;
        }
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.COMPLEMENT;
            ItemExtractResultType type1 = ItemExtractResultType.NOT_COLLECTED;
            ItemExtractResultType type2 = ItemExtractResultType.ERROR;
            ItemExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemExtractResultType.ERROR;
        }
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.COMPLEMENT;
            ItemExtractResultType type1 = ItemExtractResultType.DOES_NOT_EXIST;
            ItemExtractResultType type2 = ItemExtractResultType.NOT_COLLECTED;
            ItemExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemExtractResultType.DOES_NOT_EXIST;
        }
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.COMPLEMENT;
            ItemExtractResultType type1 = ItemExtractResultType.INCOMPLETE;
            ItemExtractResultType type2 = ItemExtractResultType.NOT_COLLECTED;
            ItemExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemExtractResultType.NOT_COLLECTED;
        }
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.COMPLEMENT;
            ItemExtractResultType type1 = ItemExtractResultType.NOT_COLLECTED;
            ItemExtractResultType type2 = ItemExtractResultType.INCOMPLETE;
            ItemExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemExtractResultType.NOT_COLLECTED;
        }
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.COMPLEMENT;
            ItemExtractResultType type1 = ItemExtractResultType.INCOMPLETE;
            ItemExtractResultType type2 = ItemExtractResultType.DOES_NOT_EXIST;
            ItemExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemExtractResultType.INCOMPLETE;
        }
        {
            OvalItemSetExtractor ovalItemSetExtractor = new WinFileItemSetExtractor(null, null);
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.COMPLEMENT;
            ItemExtractResultType type1 = ItemExtractResultType.INCOMPLETE;
            ItemExtractResultType type2 = ItemExtractResultType.INCOMPLETE;
            ItemExtractResult result = ovalItemSetExtractor.getNotCompleteResult(enumeration, type1, type2);
            assert result.getResultType() == ItemExtractResultType.ERROR;
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
            ItemExtractResult completeResult = ovalItemSetExtractor.getCompleteResult(map1, map2, enumeration);
            assert completeResult.getExtractedItems().size() == 1;
            assert completeResult.getExtractedItems().get(0).getId().equals(new BigInteger("1"));
        }
        {
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.INTERSECTION;
            ItemExtractResult completeResult = ovalItemSetExtractor.getCompleteResult(map1, map2, enumeration);
            assert completeResult.getExtractedItems().size() == 2;

            Map<String, ItemType> itemTypeMap = new HashMap<>();
            for (ItemType itemType : completeResult.getExtractedItems())
                itemTypeMap.put(itemType.getId().toString(), itemType);

            assert itemTypeMap.containsKey("0");
            assert itemTypeMap.containsKey("2");
        }
        {
            SetOperatorEnumeration enumeration = SetOperatorEnumeration.COMPLEMENT;
            ItemExtractResult completeResult = ovalItemSetExtractor.getCompleteResult(map1, map2, enumeration);
            assert completeResult.getExtractedItems().size() == 1;
            assert completeResult.getExtractedItems().get(0).getId().equals(new BigInteger("0"));
        }
    }
}

