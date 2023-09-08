package org.example.oval.item;

import org.example.oval.OvalEntityMappingContext;
import org.example.oval.item.ItemSetExtractResult.ItemSetExtractResultType;
import org.mitre.oval.xmlschema.oval_definitions_5.Filter;
import org.mitre.oval.xmlschema.oval_definitions_5.Set;
import org.mitre.oval.xmlschema.oval_definitions_5.SetOperatorEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.RegistryObject;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface OvalItemSetExtractor {
    ItemSetExtractResult extract();
    ItemSetExtractResult extractFromChildSet();

    ItemSetExtractResult extractFromObject(OvalItemExtractor extractor);

    default ItemSetExtractResult getNotCompleteResult(SetOperatorEnumeration enumeration, ItemSetExtractResultType type1,
                                                      ItemSetExtractResultType type2) {
        switch (enumeration) {
            case UNION:
                if (type1 == ItemSetExtractResultType.ERROR ||
                        type2 == ItemSetExtractResultType.ERROR)
                    return new ItemSetExtractResult(ItemSetExtractResultType.ERROR);
                if (type1 == ItemSetExtractResultType.INCOMPLETE ||
                        type2 == ItemSetExtractResultType.INCOMPLETE)
                    return new ItemSetExtractResult(ItemSetExtractResultType.INCOMPLETE);
                if (type1 == ItemSetExtractResultType.DOES_NOT_EXIST ||
                        type2 == ItemSetExtractResultType.DOES_NOT_EXIST)
                    return new ItemSetExtractResult(ItemSetExtractResultType.DOES_NOT_EXIST);
                if (type1 == ItemSetExtractResultType.NOT_COLLECTED ||
                        type2 == ItemSetExtractResultType.NOT_COLLECTED)
                    return new ItemSetExtractResult(ItemSetExtractResultType.NOT_COLLECTED);
                if (type1 == ItemSetExtractResultType.NOT_APPLICABLE ||
                        type2 == ItemSetExtractResultType.NOT_APPLICABLE)
                    return new ItemSetExtractResult(ItemSetExtractResultType.NOT_APPLICABLE);
                break;
            case INTERSECTION:
                if (type1 == ItemSetExtractResultType.DOES_NOT_EXIST ||
                        type2 == ItemSetExtractResultType.DOES_NOT_EXIST)
                    return new ItemSetExtractResult(ItemSetExtractResultType.DOES_NOT_EXIST);
                if (type1 == ItemSetExtractResultType.ERROR ||
                        type2 == ItemSetExtractResultType.ERROR)
                    return new ItemSetExtractResult(ItemSetExtractResultType.ERROR);
                if (type1 == ItemSetExtractResultType.NOT_COLLECTED ||
                        type2 == ItemSetExtractResultType.NOT_COLLECTED)
                    return new ItemSetExtractResult(ItemSetExtractResultType.NOT_COLLECTED);
                if (type1 == ItemSetExtractResultType.INCOMPLETE ||
                        type2 == ItemSetExtractResultType.INCOMPLETE)
                    return new ItemSetExtractResult(ItemSetExtractResultType.INCOMPLETE);
                if (type1 == ItemSetExtractResultType.NOT_APPLICABLE ||
                        type2 == ItemSetExtractResultType.NOT_APPLICABLE)
                    return new ItemSetExtractResult(ItemSetExtractResultType.NOT_APPLICABLE);
                break;
            case COMPLEMENT:
                if (type1 == ItemSetExtractResultType.ERROR)
                    return new ItemSetExtractResult(ItemSetExtractResultType.ERROR);
                if (type2 == ItemSetExtractResultType.NOT_APPLICABLE)
                    return new ItemSetExtractResult(ItemSetExtractResultType.ERROR);
                if (type1 == ItemSetExtractResultType.DOES_NOT_EXIST)
                    return new ItemSetExtractResult(ItemSetExtractResultType.DOES_NOT_EXIST);
                if (type2 == ItemSetExtractResultType.ERROR)
                    return new ItemSetExtractResult(ItemSetExtractResultType.ERROR);
                if (type1 == ItemSetExtractResultType.NOT_COLLECTED || type2 == ItemSetExtractResultType.NOT_COLLECTED)
                    return new ItemSetExtractResult(ItemSetExtractResultType.NOT_COLLECTED);
                if (type2 == ItemSetExtractResultType.INCOMPLETE)
                    return new ItemSetExtractResult(ItemSetExtractResultType.ERROR);
                if (type1 == ItemSetExtractResultType.INCOMPLETE)
                    return new ItemSetExtractResult(ItemSetExtractResultType.INCOMPLETE);
                break;
        }
        return new ItemSetExtractResult(ItemSetExtractResultType.COMPLETE);
    }

    default ItemSetExtractResult getCompleteResult(Map<String, ItemType> map1, Map<String, ItemType> map2,
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
        return new ItemSetExtractResult(itemTypes);
    }

}
