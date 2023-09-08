package org.example.oval.registry;

import org.example.oval.OvalEntityMappingContext;
import org.example.oval.OvalSimpleValueExtractor;
import org.example.oval.compare.OvalSimpleBinaryComparator;
import org.example.oval.compare.OvalSimpleIntComparator;
import org.example.oval.compare.OvalSimpleStringComparator;
import org.example.oval.compare.OvalSimpleValueComparator.OvalSimpleValueCompareResult;
import org.example.oval.item.ItemExtractResult;
import org.example.oval.item.ItemSetExtractResult;
import org.example.oval.item.ItemSetExtractResult.ItemSetExtractResultType;
import org.example.oval.item.OvalItemExtractor;
import org.example.oval.item.OvalItemSetExtractor;
import org.mitre.oval.xmlschema.oval_common_5.OperationEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5.*;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.RegistryState;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemAnySimpleType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.RegistryItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegistryItemSetExtractor implements OvalItemSetExtractor {

    private Set registryItemSet;
    private OvalEntityMappingContext mappingContext;

    public RegistryItemSetExtractor(Set registryItemSet, OvalEntityMappingContext mappingContext) {
        this.registryItemSet = registryItemSet;
        this.mappingContext = mappingContext;
    }

    @Override
    public ItemSetExtractResult extract() {
        if (registryItemSet == null)
            return new ItemSetExtractResult(ItemSetExtractResultType.ERROR);
        List<Set> childSets = registryItemSet.getSet();
        try {
            if (childSets.isEmpty())
                return extractFromObject(new RegistryItemExtractor(new RegistryDataReader()));
            else
                return extractFromChildSet();
        } catch (Exception e) {
            return new ItemSetExtractResult(ItemSetExtractResultType.ERROR);
        }
    }

    @Override
    public ItemSetExtractResult extractFromChildSet() {
        List<Set> childSets = registryItemSet.getSet();
        if (childSets.size() == 1)
            return new RegistryItemSetExtractor(childSets.get(0), mappingContext).extract();

        Set set1 = childSets.get(0);
        Map<String, ItemType> map1 = new HashMap<>();
        ItemSetExtractResult extractedResult1 = new RegistryItemSetExtractor(set1, mappingContext).extract();
        for (ItemType itemType : extractedResult1.getExtractedItems())
            map1.put(itemType.getId().toString(), itemType);

        Set set2 = childSets.get(1);
        Map<String, ItemType> map2 = new HashMap<>();
        ItemSetExtractResult extractedResult2 = new RegistryItemSetExtractor(set2, mappingContext).extract();
        for (ItemType itemType : extractedResult2.getExtractedItems())
            map2.put(itemType.getId().toString(), itemType);

        ItemSetExtractResultType resultType1 = extractedResult1.getResultType();
        ItemSetExtractResultType resultType2 = extractedResult2.getResultType();
        if (resultType1 != ItemSetExtractResultType.COMPLETE || resultType2 == ItemSetExtractResultType.COMPLETE)
            return getNotCompleteResult(registryItemSet.getSetOperator(), resultType1, resultType2);
        return getCompleteResult(map1, map2, registryItemSet.getSetOperator());
    }

    @Override
    public ItemSetExtractResult extractFromObject(OvalItemExtractor extractor) {
        Map<String, RegistryItem> registryItemMap = new HashMap<>();
        for (String objectRef : registryItemSet.getObjectReference()) {
            ItemExtractResult itemResult = mappingContext.getItemResult(objectRef);
            if (itemResult == null) {
                ObjectType objectType = mappingContext.getObjectType(objectRef);
                itemResult = extractor.extract(objectType, mappingContext);
            }
            for (ItemType itemType : itemResult.getExtractedItems())
                registryItemMap.put(itemType.getId().toString(), (RegistryItem) itemType);
        }

        List<ItemType> extractedItems = new ArrayList<>();
        List<Filter> filters = registryItemSet.getFilter();
        for (RegistryItem registryItem : registryItemMap.values()) {
            boolean success = true;
            for (Filter filter : filters) {
                String stateId = filter.getValue();
                StateType stateType = mappingContext.getStateType(stateId);
                if (stateType == null)
                    return new ItemSetExtractResult(ItemSetExtractResultType.ERROR);
                if (stateType instanceof RegistryState == false)
                    return new ItemSetExtractResult(ItemSetExtractResultType.ERROR);
                RegistryState registryState = (RegistryState) stateType;
                boolean filterInclude = filter.getAction() == FilterActionEnumeration.INCLUDE;
                success = filterInclude == filterRegistryItem(registryItem, registryState);
                if (!success)
                    break;
            }
            if (success)
                extractedItems.add(registryItem);
        }
        ItemSetExtractResult itemSetExtractResult = new ItemSetExtractResult(extractedItems);
        if (extractedItems.isEmpty())
            itemSetExtractResult.setResultType(ItemSetExtractResultType.DOES_NOT_EXIST);
        return itemSetExtractResult;
    }

    private boolean filterRegistryItem(RegistryItem registryItem, RegistryState registryState) {
        OvalSimpleStringComparator stringComparator = new OvalSimpleStringComparator();
        OvalSimpleValueCompareResult compareResult = OvalSimpleValueCompareResult.SUCCESS;
        OvalSimpleValueExtractor valueExtractor = new OvalSimpleValueExtractor(mappingContext);

        List<Object> stateHives = valueExtractor.extract(registryState.getHive());
        if (!stateHives.isEmpty() && registryItem.getHive() == null)
            return false;
        for (Object stateHive : stateHives) {
            String itemHive = (String) registryItem.getHive().getValue();
            OperationEnumeration enumeration = registryState.getHive().getOperation();
            compareResult = stringComparator.compare(itemHive, stateHive, enumeration);
        }
        if (compareResult != OvalSimpleValueCompareResult.SUCCESS)
            return false;

        List<Object> stateKeys = valueExtractor.extract(registryState.getKey());
        if (!stateKeys.isEmpty() && registryItem.getKey() == null)
            return false;
        for (Object stateKey : stateKeys) {
            String itemKey = (String) registryItem.getKey().getValue().getValue();
            OperationEnumeration enumeration = registryState.getKey().getOperation();
            compareResult = stringComparator.compare(itemKey, stateKey, enumeration);
        }
        if (compareResult != OvalSimpleValueCompareResult.SUCCESS)
            return false;

        List<Object> stateNames = valueExtractor.extract(registryState.getName());
        if (!stateNames.isEmpty() && registryItem.getName() == null)
            return false;
        for (Object stateName : stateNames) {
            String itemName = (String) registryItem.getName().getValue().getValue();
            OperationEnumeration enumeration = registryState.getName().getOperation();
            compareResult = stringComparator.compare(itemName, stateName, enumeration);
        }
        if (compareResult != OvalSimpleValueCompareResult.SUCCESS)
            return false;

        List<Object> stateTypes = valueExtractor.extract(registryState.getType());
        if (!stateTypes.isEmpty() && registryItem.getType() == null)
            return false;
        for (Object stateType : stateTypes) {
            String itemType = (String) registryItem.getType().getValue();
            OperationEnumeration enumeration = registryState.getType().getOperation();
            compareResult = stringComparator.compare(itemType, stateType, enumeration);
        }
        if (compareResult != OvalSimpleValueCompareResult.SUCCESS)
            return false;

        List<Object> stateValues = valueExtractor.extract(registryState.getValue());
        OperationEnumeration operation = registryState.getValue().getOperation();
        for (EntityItemAnySimpleType itemAnySimpleType : registryItem.getValue()) {
            String itemDatatype = itemAnySimpleType.getDatatype();
            String stataDatatype = registryState.getValue().getDatatype();
            if (!itemDatatype.equals(stataDatatype))
                return false;

            String type = (String) registryItem.getType().getValue();
            for (Object stateValue : stateValues) {
                switch (type) {
                    case "reg_binary":
                        OvalSimpleBinaryComparator binComparator = new OvalSimpleBinaryComparator();
                        compareResult = binComparator.compare(itemAnySimpleType.getValue(), stateValue, operation);
                        break;
                    case "reg_dword":
                    case "reg_dword_little_endian":
                    case "reg_dword_big_endian":
                    case "reg_qword":
                    case "reg_qword_little_endian":
                        OvalSimpleIntComparator intComparator = new OvalSimpleIntComparator();
                        compareResult = intComparator.compare(itemAnySimpleType.getValue(), stateValue, operation);
                        break;
                    case "reg_expand_sz":
                    case "reg_sz":
                    case "reg_link":
                        compareResult = stringComparator.compare(itemAnySimpleType.getValue(), stateValue, operation);
                        break;
                    case "reg_none":
                    case "reg_multi_sz":
                    case "reg_resource_list":
                    case "reg_full_resource_descriptor":
                    case "reg_resource_requirements_list":
                    default:
                        compareResult = OvalSimpleValueCompareResult.FAIL;
                }
            }
        }
        if (compareResult != OvalSimpleValueCompareResult.SUCCESS)
            return false;
        return true;
    }
}
