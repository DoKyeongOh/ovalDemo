package org.example.oval.file;

import org.example.oval.OvalEntityMapping;
import org.example.oval.item.ItemExtractResult;
import org.example.oval.item.ItemSetExtractResult;
import org.example.oval.item.ItemSetExtractResult.ItemSetExtractResultType;
import org.example.oval.item.OvalItemSetExtractor;
import org.mitre.oval.xmlschema.oval_definitions_5.*;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.FileState;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.FileItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UnixFileItemSetExtractor implements OvalItemSetExtractor {

    private Set fileItemSet;
    private OvalEntityMapping ovalEntityMapping;

    public UnixFileItemSetExtractor(Set fileItemSet, OvalEntityMapping ovalEntityMapping) {
        this.fileItemSet = fileItemSet;
        this.ovalEntityMapping = ovalEntityMapping;
    }

    @Override
    public ItemSetExtractResult extract() throws Exception {
        if (fileItemSet == null)
            return new ItemSetExtractResult(ItemSetExtractResultType.NOT_COLLECTED);
        List<Set> childSets = fileItemSet.getSet();
        if (!childSets.isEmpty())
            return extractFromChildSet();
        else
            return extractFromObject();
    }

    private ItemSetExtractResult extractFromChildSet() throws Exception {
        List<Set> sets = fileItemSet.getSet();
        if (sets.isEmpty())
            return new ItemSetExtractResult(ItemSetExtractResultType.NOT_COLLECTED);
        if (sets.size() == 1)
            return new UnixFileItemSetExtractor(sets.get(0), ovalEntityMapping).extract();

        Set set1 = sets.get(0);
        Map<String, FileItem> fileItemMap1 = new HashMap<>();
        ItemSetExtractResult extract1 = new UnixFileItemSetExtractor(set1, ovalEntityMapping).extract();
        for (ItemType itemType : extract1.getExtractedItems()) {
            FileItem fileItem = (FileItem) itemType;
            fileItemMap1.put((String) fileItem.getFilepath().getValue(), fileItem);
        }

        Set set2 = sets.get(1);
        Map<String, FileItem> fileItemMap2 = new HashMap<>();
        ItemSetExtractResult extract2 = new UnixFileItemSetExtractor(set2, ovalEntityMapping).extract();
        for (ItemType itemType : extract2.getExtractedItems()) {
            FileItem fileItem = (FileItem) itemType;
            fileItemMap2.put((String) fileItem.getFilepath().getValue(), fileItem);
        }

        ItemSetExtractResultType resultType1 = extract1.getResultType();
        ItemSetExtractResultType resultType2 = extract2.getResultType();
        if (resultType1 != ItemSetExtractResultType.COMPLETE || resultType2 == ItemSetExtractResultType.COMPLETE)
            return getNotCompleteResult(fileItemSet.getSetOperator(), resultType1, resultType2);

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
        return new ItemSetExtractResult(itemTypes);
    }

    private ItemSetExtractResult extractFromObject() throws Exception {
        ItemSetExtractResult itemSetExtractResult = new ItemSetExtractResult();
        Map<String, FileItem> itemTypeMap = new HashMap<>();
        for (String objectRef : fileItemSet.getObjectReference()) {
            ObjectType objectType = ovalEntityMapping.getObjectType(objectRef);
            ItemExtractResult itemExtractResult = new UnixFileItemExtractor(objectType, ovalEntityMapping).extract();
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
                StateType stateType = ovalEntityMapping.getStateType(stateId);
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
        String stateFilename = (String) fileState.getFilename().getValue();
        String itemFilename = (String) fileItem.getFilename().getValue().getValue();
        if (!stateFilename.equals(itemFilename))
            return false;

        String statePath = (String) fileState.getPath().getValue();
        String itemPath = (String) fileItem.getPath().getValue();
        if (!statePath.equals(itemPath))
            return false;

        String stateFilePath = (String) fileState.getFilepath().getValue();
        String itemFilePath = (String) fileItem.getFilepath().getValue();
        if (!stateFilePath.equals(itemFilePath))
            return false;

        if (fileState.getCTime() != null && fileState.getCTime().getValue() != fileItem.getCTime().getValue())
            return false;
        if (fileState.getATime() != null && fileState.getATime().getValue() != fileItem.getATime().getValue())
            return false;
        if (fileState.getMTime() != null && fileState.getMTime().getValue() != fileItem.getMTime().getValue())
            return false;

        if (fileState.getGroupId() != null && fileState.getGroupId().getValue() != fileItem.getGroupId().getValue())
            return false;
        if (fileState.getUserId() != null && fileState.getUserId().getValue() != fileItem.getUserId().getValue())
            return false;
        if (fileState.getSize() != null && fileState.getSize().getValue() != fileItem.getSize().getValue())
            return false;
        if (fileState.getSgid() != null && fileState.getSgid().getValue() != fileItem.getSgid().getValue())
            return false;
        if (fileState.getSuid() != null && fileState.getSuid().getValue() != fileItem.getSuid().getValue())
            return false;

        if (fileState.getGread() != null && fileState.getGread().getValue() != fileItem.getGread().getValue())
            return false;
        if (fileState.getGwrite() != null && fileState.getGwrite().getValue() != fileItem.getGwrite().getValue())
            return false;
        if (fileState.getGexec() != null && fileState.getGexec().getValue() != fileItem.getGexec().getValue())
            return false;
        if (fileState.getUread() != null && fileState.getUread().getValue() != fileItem.getUread().getValue())
            return false;
        if (fileState.getUwrite() != null && fileState.getUwrite().getValue() != fileItem.getUwrite().getValue())
            return false;
        if (fileState.getUexec() != null && fileState.getUexec().getValue() != fileItem.getUexec().getValue())
            return false;
        if (fileState.getOread() != null && fileState.getOread().getValue() != fileItem.getOread().getValue())
            return false;
        if (fileState.getOwrite() != null && fileState.getOwrite().getValue() != fileItem.getOwrite().getValue())
            return false;
        if (fileState.getOexec() != null && fileState.getOexec().getValue() != fileItem.getOexec().getValue())
            return false;
        if (fileState.getHasExtendedAcl() != null && fileState.getHasExtendedAcl().getValue()
                != fileItem.getHasExtendedAcl().getValue())
            return false;
        return true;
    }

}
