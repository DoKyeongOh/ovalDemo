package org.example.oval.file;

import org.example.oval.OvalEntityMapping;
import org.example.oval.OvalItemSetExtractor;
import org.mitre.oval.xmlschema.oval_definitions_5.*;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.FileState;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;

import java.util.ArrayList;
import java.util.List;

public class UnixFileItemSetExtractor implements OvalItemSetExtractor {

    private Set fileItemSet;
    private OvalEntityMapping ovalEntityMapping;

    public UnixFileItemSetExtractor(Set fileItemSet, OvalEntityMapping ovalEntityMapping) {
        this.fileItemSet = fileItemSet;
        this.ovalEntityMapping = ovalEntityMapping;
    }

    @Override
    public List<ItemType> extract() throws Exception {
        List<ItemType> itemTypes = new ArrayList<>();
        List<Set> childSets = fileItemSet.getSet();
        if (childSets != null && !childSets.isEmpty()) {
            for (Set childSet : childSets)
                itemTypes.addAll(new UnixFileItemSetExtractor(childSet, ovalEntityMapping).extract());
        }
        List<String> objectReferences = fileItemSet.getObjectReference();
        for (String objectRef : objectReferences) {
            ObjectType objectType = ovalEntityMapping.getObjectType(objectRef);
            List<ItemType> fileItems = new UnixFileItemExtractor(objectType, ovalEntityMapping).extract();
            itemTypes.addAll(fileItems);
        }

        List<Filter> filters = fileItemSet.getFilter();
        for (Filter filter : filters) {
            String stateId = filter.getValue();
            StateType stateType = ovalEntityMapping.getStateType(stateId);
            if (stateType instanceof FileState == false)
                throw new Exception("file set filter error");
            FileState fileState = (FileState) stateType;
            fileState.getOperator();
            FilterActionEnumeration action = filter.getAction();
        }


        return null;
    }
}
