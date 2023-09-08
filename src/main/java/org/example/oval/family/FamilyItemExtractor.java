package org.example.oval.family;

import org.example.oval.OvalEntityMappingContext;
import org.example.oval.item.ItemExtractResult;
import org.example.oval.item.OvalItemExtractor;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.FamilyObject;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.StatusEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_independent.EntityItemFamilyType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_independent.FamilyItem;


public class FamilyItemExtractor implements OvalItemExtractor {
    public FamilyItemExtractor() {

    }
    @Override
    public ItemExtractResult extract(ObjectType inputObject, OvalEntityMappingContext ovalEntityMappingContext) {
        if (inputObject == null)
            return new ItemExtractResult(ItemExtractResult.ItemExtractResultType.ERROR);
        if (!inputObject.getClass().equals(FamilyObject.class))
            return new ItemExtractResult(ItemExtractResult.ItemExtractResultType.ERROR);

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
