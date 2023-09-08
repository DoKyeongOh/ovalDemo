package org.example.oval.file;

import org.example.oval.OvalEntityMappingContext;
import org.example.oval.item.ItemExtractResult;
import org.example.oval.item.ItemSetExtractResult;
import org.example.oval.item.ItemSetExtractResult.ItemSetExtractResultType;
import org.example.oval.item.OvalItemSetExtractor;
import org.example.oval.compare.OvalSimpleValueComparator;
import org.example.oval.compare.OvalSimpleValueComparator.OvalSimpleValueCompareResult;
import org.example.oval.compare.OvalSimpleValueComparatorFactory;
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
    private OvalEntityMappingContext ovalEntityMappingContext;

    public WinFileItemSetExtractor(Set fileItemSet, OvalEntityMappingContext ovalEntityMappingContext) {
        this.fileItemSet = fileItemSet;
        this.ovalEntityMappingContext = ovalEntityMappingContext;
    }

    @Override
    public ItemSetExtractResult extract() {
        if (fileItemSet == null)
            return new ItemSetExtractResult(ItemSetExtractResultType.ERROR);
        List<Set> childSets = fileItemSet.getSet();
        try {
            if (childSets.isEmpty())
                return extractFromObject();
            else
                return extractFromChildSet();
        } catch (Exception e) {
            return new ItemSetExtractResult(ItemSetExtractResultType.ERROR);
        }
    }

    private ItemSetExtractResult extractFromChildSet() {
        List<Set> sets = fileItemSet.getSet();
        if (sets.size() == 1)
            return new WinFileItemSetExtractor(sets.get(0), ovalEntityMappingContext).extract();

        Set set1 = sets.get(0);
        Map<String, ItemType> map1 = new HashMap<>();
        ItemSetExtractResult extract1 = new WinFileItemSetExtractor(set1, ovalEntityMappingContext).extract();
        for (ItemType itemType : extract1.getExtractedItems())
            map1.put(itemType.getId().toString(), itemType);

        Set set2 = sets.get(1);
        Map<String, ItemType> map2 = new HashMap<>();
        ItemSetExtractResult extract2 = new WinFileItemSetExtractor(set2, ovalEntityMappingContext).extract();
        for (ItemType itemType : extract2.getExtractedItems())
            map2.put(itemType.getId().toString(), itemType);

        ItemSetExtractResultType resultType1 = extract1.getResultType();
        ItemSetExtractResultType resultType2 = extract2.getResultType();
        if (resultType1 != ItemSetExtractResultType.COMPLETE || resultType2 == ItemSetExtractResultType.COMPLETE)
            return getNotCompleteResult(fileItemSet.getSetOperator(), resultType1, resultType2);
        return getCompleteResult(map1, map2, fileItemSet.getSetOperator());
    }

    private ItemSetExtractResult extractFromObject() throws Exception {
        ItemSetExtractResult itemSetExtractResult = new ItemSetExtractResult();
        Map<String, FileItem> itemTypeMap = new HashMap<>();
        for (String objectRef : fileItemSet.getObjectReference()) {
            ObjectType objectType = ovalEntityMappingContext.getObjectType(objectRef);
            ItemExtractResult itemExtractResult = ovalEntityMappingContext.getItemResult(objectRef);
            if (itemExtractResult == null) {
                WinFileItemExtractor extractor = new WinFileItemExtractor();
                itemExtractResult = extractor.extract(objectType, ovalEntityMappingContext);
            }
            for (ItemType itemType : itemExtractResult.getExtractedItems()) {
                FileItem fileItem = (FileItem) itemType;
                itemTypeMap.put((String) fileItem.getFilepath().getValue(), fileItem);
            }
        }

        List<ItemType> extractedItems = new ArrayList<>();
        List<Filter> filters = fileItemSet.getFilter();
        for (ItemType itemType : itemTypeMap.values()) {
            FileItem fileItem = (FileItem) itemType;
            boolean success = true;
            for (Filter filter : filters) {
                String stateId = filter.getValue();
                StateType stateType = ovalEntityMappingContext.getStateType(stateId);
                if (stateType == null)
                    throw new Exception("file set filter is null");
                if (stateType instanceof FileState == false)
                    throw new Exception("file set filter error");
                boolean filterInclude = filter.getAction() == FilterActionEnumeration.INCLUDE;
                success = filterInclude == filterFileItem(fileItem, (FileState) stateType);
                if (!success)
                    break;
            }
            if (success)
                extractedItems.add(itemType);
        }
        itemSetExtractResult.setExtractedItems(extractedItems);
        if (extractedItems.isEmpty())
            itemSetExtractResult.setResultType(ItemSetExtractResultType.DOES_NOT_EXIST);
        return itemSetExtractResult;
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
