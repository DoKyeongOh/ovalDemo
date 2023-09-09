package org.example.oval.item;

import org.example.oval.item.ItemExtractResult.ItemExtractResultType;
import org.mitre.oval.xmlschema.oval_definitions_5.SetOperatorEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface OvalItemSetExtractor {
    ItemExtractResult extract();
    ItemExtractResult extractFromChildSet();

    ItemExtractResult extractFromObject(OvalItemExtractor extractor);

    default ItemExtractResult getNotCompleteResult(SetOperatorEnumeration enumeration, ItemExtractResultType type1,
                                                      ItemExtractResultType type2) {
        switch (enumeration) {
            case UNION:
                if (type1 == ItemExtractResultType.ERROR ||
                        type2 == ItemExtractResultType.ERROR)
                    return new ItemExtractResult(ItemExtractResultType.ERROR);
                if (type1 == ItemExtractResultType.INCOMPLETE ||
                        type2 == ItemExtractResultType.INCOMPLETE)
                    return new ItemExtractResult(ItemExtractResultType.INCOMPLETE);
                if (type1 == ItemExtractResultType.DOES_NOT_EXIST ||
                        type2 == ItemExtractResultType.DOES_NOT_EXIST)
                    return new ItemExtractResult(ItemExtractResultType.DOES_NOT_EXIST);
                if (type1 == ItemExtractResultType.NOT_COLLECTED ||
                        type2 == ItemExtractResultType.NOT_COLLECTED)
                    return new ItemExtractResult(ItemExtractResultType.NOT_COLLECTED);
                if (type1 == ItemExtractResultType.NOT_APPLICABLE ||
                        type2 == ItemExtractResultType.NOT_APPLICABLE)
                    return new ItemExtractResult(ItemExtractResultType.NOT_APPLICABLE);
                break;
            case INTERSECTION:
                if (type1 == ItemExtractResultType.DOES_NOT_EXIST ||
                        type2 == ItemExtractResultType.DOES_NOT_EXIST)
                    return new ItemExtractResult(ItemExtractResultType.DOES_NOT_EXIST);
                if (type1 == ItemExtractResultType.ERROR ||
                        type2 == ItemExtractResultType.ERROR)
                    return new ItemExtractResult(ItemExtractResultType.ERROR);
                if (type1 == ItemExtractResultType.NOT_COLLECTED ||
                        type2 == ItemExtractResultType.NOT_COLLECTED)
                    return new ItemExtractResult(ItemExtractResultType.NOT_COLLECTED);
                if (type1 == ItemExtractResultType.INCOMPLETE ||
                        type2 == ItemExtractResultType.INCOMPLETE)
                    return new ItemExtractResult(ItemExtractResultType.INCOMPLETE);
                if (type1 == ItemExtractResultType.NOT_APPLICABLE ||
                        type2 == ItemExtractResultType.NOT_APPLICABLE)
                    return new ItemExtractResult(ItemExtractResultType.NOT_APPLICABLE);
                break;
            case COMPLEMENT:
                if (type1 == ItemExtractResultType.ERROR)
                    return new ItemExtractResult(ItemExtractResultType.ERROR);
                if (type2 == ItemExtractResultType.NOT_APPLICABLE)
                    return new ItemExtractResult(ItemExtractResultType.ERROR);
                if (type1 == ItemExtractResultType.DOES_NOT_EXIST)
                    return new ItemExtractResult(ItemExtractResultType.DOES_NOT_EXIST);
                if (type2 == ItemExtractResultType.ERROR)
                    return new ItemExtractResult(ItemExtractResultType.ERROR);
                if (type1 == ItemExtractResultType.NOT_COLLECTED || type2 == ItemExtractResultType.NOT_COLLECTED)
                    return new ItemExtractResult(ItemExtractResultType.NOT_COLLECTED);
                if (type2 == ItemExtractResultType.INCOMPLETE)
                    return new ItemExtractResult(ItemExtractResultType.ERROR);
                if (type1 == ItemExtractResultType.INCOMPLETE)
                    return new ItemExtractResult(ItemExtractResultType.INCOMPLETE);
                break;
        }
        return new ItemExtractResult(ItemExtractResultType.COMPLETE);
    }

    default ItemExtractResult getCompleteResult(Map<String, ItemType> map1, Map<String, ItemType> map2,
                                                   SetOperatorEnumeration enumeration) {
        List<ItemType> itemTypes = new ArrayList<>();
        switch (enumeration) {
            case UNION:
                map1.keySet().stream()
                        .filter(map2::containsKey)
                        .forEach(key -> itemTypes.add(map1.get(key)));
                break;
            case INTERSECTION:
                map1.keySet().stream()
                        .filter(key -> !map2.containsKey(key))
                        .forEach(key -> itemTypes.add(map1.get(key)));
                map2.keySet().stream()
                        .filter(key -> !map1.containsKey(key))
                        .forEach(key -> itemTypes.add(map2.get(key)));
                break;
            case COMPLEMENT:
                map1.keySet().stream()
                        .filter(key -> !map2.containsKey(key))
                        .forEach(key -> itemTypes.add(map1.get(key)));
                break;
        }
        return new ItemExtractResult(itemTypes);
    }

}
