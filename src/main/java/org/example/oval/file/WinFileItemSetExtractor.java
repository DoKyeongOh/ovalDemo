package org.example.oval.file;

import org.example.oval.OvalEntityMappingContext;
import org.example.oval.compare.OvalSimpleValueComparator;
import org.example.oval.compare.OvalSimpleValueComparator.OvalSimpleValueCompareResult;
import org.example.oval.compare.OvalSimpleValueComparatorFactory;
import org.example.oval.item.ItemExtractResult;
import org.example.oval.item.ItemExtractResult.ItemExtractResultType;
import org.example.oval.item.OvalItemExtractor;
import org.example.oval.item.OvalItemSetExtractor;
import org.mitre.oval.xmlschema.oval_common_5.OperationEnumeration;
import org.mitre.oval.xmlschema.oval_common_5.SimpleDatatypeEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5.*;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileState;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemVersionType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.FileItem;

import javax.xml.bind.JAXBElement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WinFileItemSetExtractor implements OvalItemSetExtractor {

    private Set fileItemSet;
    private OvalEntityMappingContext mappingContext;

    public WinFileItemSetExtractor(Set fileItemSet, OvalEntityMappingContext mappingContext) {
        this.fileItemSet = fileItemSet;
        this.mappingContext = mappingContext;
    }

    @Override
    public ItemExtractResult extract() {
        if (fileItemSet == null)
            return new ItemExtractResult(ItemExtractResultType.ERROR);
        List<Set> childSets = fileItemSet.getSet();
        try {
            if (childSets.isEmpty())
                return extractFromObject(new WinFileItemExtractor());
            else
                return extractFromChildSet();
        } catch (Exception e) {
            return new ItemExtractResult(ItemExtractResultType.ERROR);
        }
    }

    @Override
    public ItemExtractResult extractFromChildSet() {
        List<Set> sets = fileItemSet.getSet();
        if (sets.size() == 1)
            return new WinFileItemSetExtractor(sets.get(0), mappingContext).extract();

        Set set1 = sets.get(0);
        Map<String, ItemType> map1 = new HashMap<>();
        ItemExtractResult extract1 = new WinFileItemSetExtractor(set1, mappingContext).extract();
        for (ItemType itemType : extract1.getExtractedItems())
            map1.put(itemType.getId().toString(), itemType);

        Set set2 = sets.get(1);
        Map<String, ItemType> map2 = new HashMap<>();
        ItemExtractResult extract2 = new WinFileItemSetExtractor(set2, mappingContext).extract();
        for (ItemType itemType : extract2.getExtractedItems())
            map2.put(itemType.getId().toString(), itemType);

        ItemExtractResultType resultType1 = extract1.getResultType();
        ItemExtractResultType resultType2 = extract2.getResultType();
        if (resultType1 != ItemExtractResultType.COMPLETE || resultType2 == ItemExtractResultType.COMPLETE)
            return getNotCompleteResult(fileItemSet.getSetOperator(), resultType1, resultType2);
        return getCompleteResult(map1, map2, fileItemSet.getSetOperator());
    }

    @Override
    public ItemExtractResult extractFromObject(OvalItemExtractor extractor) {
        Map<String, FileItem> fileItemMap = new HashMap<>();
        for (String objectRef : fileItemSet.getObjectReference()) {
            ItemExtractResult itemExtractResult = mappingContext.getItemResult(objectRef);
            ObjectType objectType = mappingContext.getObjectType(objectRef);
            if (itemExtractResult == null)
                itemExtractResult = extractor.extract(objectType, mappingContext);
            for (ItemType itemType : itemExtractResult.getExtractedItems())
                fileItemMap.put(itemType.getId().toString(), (FileItem) itemType);
        }

        List<ItemType> extractedItems = new ArrayList<>();
        List<Filter> filters = fileItemSet.getFilter();
        for (FileItem fileItem : fileItemMap.values()) {
            boolean success = true;
            for (Filter filter : filters) {
                String stateId = filter.getValue();
                StateType stateType = mappingContext.getStateType(stateId);
                if (stateType == null)
                    return new ItemExtractResult(ItemExtractResultType.ERROR);
                if (stateType instanceof FileState == false)
                    return new ItemExtractResult(ItemExtractResultType.ERROR);
                FileState fileState = (FileState) stateType;
                boolean filterInclude = filter.getAction() == FilterActionEnumeration.INCLUDE;
                success = filterInclude == filterFileItem(fileItem, fileState);
                if (!success)
                    break;
            }
            if (success)
                extractedItems.add(fileItem);
        }
        ItemExtractResult ItemExtractResult = new ItemExtractResult(extractedItems);
        if (extractedItems.isEmpty())
            ItemExtractResult.setResultType(ItemExtractResultType.DOES_NOT_EXIST);
        return ItemExtractResult;
    }

    private boolean filterFileItem(FileItem fileItem, FileState fileState) {
        if (fileState.getRest().isEmpty())
            return true;

        for (JAXBElement<? extends EntityStateSimpleBaseType> stateElement : fileState.getRest()) {
            EntityStateSimpleBaseType stateSimpleType = stateElement.getValue();
            Object object = stateSimpleType.getValue();
            String stateName = stateElement.getName().getLocalPart();
            OperationEnumeration operation = stateSimpleType.getOperation();

            if (stateName.equalsIgnoreCase("version")) {
                EntityItemVersionType version = fileItem.getVersion();
                Object compare = version == null ? null : version.getValue();
                OvalSimpleValueComparator comparator = OvalSimpleValueComparatorFactory
                        .getComparator(SimpleDatatypeEnumeration.VERSION);
                OvalSimpleValueCompareResult compareResult =
                        comparator.compare(object, compare, operation);
                if (compareResult != OvalSimpleValueCompareResult.SUCCESS)
                    return false;
            }

            if (stateName.equalsIgnoreCase("filepath")) {
                EntityItemStringType filepath = fileItem.getFilepath();
                Object compare = filepath.getValue();
                OvalSimpleValueComparator comparator = OvalSimpleValueComparatorFactory
                        .getComparator(SimpleDatatypeEnumeration.STRING);
                OvalSimpleValueCompareResult compareResult = comparator.compare(object, compare, operation);
                if (compareResult != OvalSimpleValueCompareResult.SUCCESS)
                    return false;
            }
        }
        return true;
    }
}
