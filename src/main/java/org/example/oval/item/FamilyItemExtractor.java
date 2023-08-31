package org.example.oval.item;

import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.StatusEnumeration;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_independent.EntityItemFamilyType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_independent.FamilyItem;

import java.util.ArrayList;
import java.util.List;


public class FamilyItemExtractor implements OvalItemExtractor {
    @Override
    public List<ItemType> extract() throws Exception {
        EntityItemFamilyType entityItemFamilyType = new EntityItemFamilyType();
        entityItemFamilyType.setValue(System.getProperty("os.name"));
        entityItemFamilyType.setStatus(StatusEnumeration.EXISTS);
        FamilyItem familyItem = new FamilyItem();
        familyItem.setFamily(entityItemFamilyType);
        List<ItemType> itemTypes = new ArrayList<>();
        itemTypes.add(familyItem);
        return itemTypes;
    }
}
