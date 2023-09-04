package org.example.oval.family;

import org.example.oval.item.ItemExtractResult;
import org.example.oval.item.OvalItemExtractor;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.FamilyObject;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.StatusEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_independent.EntityItemFamilyType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_independent.FamilyItem;

import java.util.ArrayList;
import java.util.List;


public class FamilyItemExtractor implements OvalItemExtractor {
    private FamilyObject familyObject;
    public FamilyItemExtractor(ObjectType inputObject) throws Exception {
        if (inputObject == null)
            throw new Exception("input family object is not null.");
        if (!inputObject.getClass().equals(FamilyObject.class))
            throw new Exception("input family object is not family_object.");
        familyObject = (FamilyObject) inputObject;
    }
    @Override
    public ItemExtractResult extract() throws Exception {
        EntityItemFamilyType entityItemFamilyType = new EntityItemFamilyType();
        entityItemFamilyType.setValue(System.getProperty("os.name"));
        entityItemFamilyType.setStatus(StatusEnumeration.EXISTS);
        FamilyItem familyItem = new FamilyItem();
        familyItem.setFamily(entityItemFamilyType);
        ItemExtractResult itemExtractResult = new ItemExtractResult();
        itemExtractResult.getExtractedItems().add(familyItem);
        itemExtractResult.setResultType(ItemExtractResult.ItemExtractResultType.COMPLETE);
        return itemExtractResult;
    }
}
