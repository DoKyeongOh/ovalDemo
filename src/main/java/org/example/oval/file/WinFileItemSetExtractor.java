package org.example.oval.file;

import org.example.oval.OvalEntityMapping;
import org.example.oval.item.ItemExtractResult;
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
    private OvalEntityMapping ovalEntityMapping;

    public WinFileItemSetExtractor(Set fileItemSet, OvalEntityMapping ovalEntityMapping) {
        this.fileItemSet = fileItemSet;
        this.ovalEntityMapping = ovalEntityMapping;
    }

    @Override
    public List<ItemType> extract() throws Exception {
        if (fileItemSet == null)
            return new ArrayList<>();
        List<Set> childSets = fileItemSet.getSet();
        if (!childSets.isEmpty())
            return extractFromChildSet();
        else
            return extractFromObject();
    }

    private List<ItemType> extractFromChildSet() throws Exception {
        List<Set> sets = fileItemSet.getSet();
        if (sets.isEmpty())
            return new ArrayList<>();
        if (sets.size() == 1)
            return new WinFileItemSetExtractor(sets.get(0), ovalEntityMapping).extract();

        Set set1 = sets.get(0);
        Map<String, FileItem> fileItemMap1 = new HashMap<>();
        List<ItemType> itemTypes1 = new WinFileItemSetExtractor(set1, ovalEntityMapping).extract();
        for (ItemType itemType : itemTypes1) {
            FileItem fileItem = (FileItem) itemType;
            fileItemMap1.put((String) fileItem.getFilepath().getValue(), fileItem);
        }

        Set set2 = sets.get(1);
        Map<String, FileItem> fileItemMap2 = new HashMap<>();
        List<ItemType> itemTypes2 = new WinFileItemSetExtractor(set2, ovalEntityMapping).extract();
        for (ItemType itemType : itemTypes2) {
            FileItem fileItem = (FileItem) itemType;
            fileItemMap2.put((String) fileItem.getFilepath().getValue(), fileItem);
        }

        List<ItemType> itemTypes = new ArrayList<>();
        switch (fileItemSet.getSetOperator()) {
            case UNION:
                fileItemMap1.keySet().stream()
                        .filter(fileItemMap2::containsKey)
                        .forEach(filePath -> itemTypes.add(fileItemMap1.get(filePath)));
                break;
            case INTERSECTION:
                fileItemMap1.keySet().stream()
                        .filter(filePath -> !fileItemMap2.containsKey(filePath))
                        .forEach(filePath -> itemTypes.add(fileItemMap1.get(filePath)));
                fileItemMap2.keySet().stream()
                        .filter(filePath -> !fileItemMap1.containsKey(filePath))
                        .forEach(filePath -> itemTypes.add(fileItemMap2.get(filePath)));
                break;
            case COMPLEMENT:
                fileItemMap1.keySet().stream()
                        .filter(filePath -> !fileItemMap2.containsKey(filePath))
                        .forEach(filePath -> itemTypes.add(fileItemMap1.get(filePath)));
                break;
        }
        return itemTypes;
    }

    private List<ItemType> extractFromObject() throws Exception {
        Map<String, FileItem> itemTypeMap = new HashMap<>();
        List<String> objectReferences = fileItemSet.getObjectReference();
        for (String objectRef : objectReferences) {
            ObjectType objectType = ovalEntityMapping.getObjectType(objectRef);
            ItemExtractResult itemExtractResult = new WinFileItemExtractor(objectType, ovalEntityMapping).extract();
            for (ItemType itemType : itemExtractResult.getExtractedItems()) {
                FileItem fileItem = (FileItem) itemType;
                itemTypeMap.put((String) fileItem.getFilepath().getValue(), fileItem);
            }
        }

        List<ItemType> result = new ArrayList<>();
        List<Filter> filters = fileItemSet.getFilter();
        for (ItemType itemType : itemTypeMap.values()) {
            FileItem fileItem = (FileItem) itemType;
            boolean success = true;
            for (Filter filter : filters) {
                String stateId = filter.getValue();
                StateType stateType = ovalEntityMapping.getStateType(stateId);
                if (stateType == null)
                    throw new Exception("file set filter is null");
                if (stateType instanceof FileState == false)
                    throw new Exception("file set filter error");
                FileState fileState = (FileState) stateType;
                boolean filterInclude = filter.getAction() == FilterActionEnumeration.INCLUDE;
                success = filterInclude == filterFileItem(fileItem, fileState);
                if (!success)
                    break;
            }
            if (success)
                result.add(itemType);
        }
        return result;
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
