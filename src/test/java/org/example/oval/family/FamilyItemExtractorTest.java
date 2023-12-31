package org.example.oval.family;

import org.example.oval.family.FamilyItemExtractor;
import org.junit.Test;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.FamilyObject;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_independent.FamilyItem;

import java.util.List;

public class FamilyItemExtractorTest {

    @Test
    public void test() throws Exception {
        FamilyItemExtractor familyItemExtractor = new FamilyItemExtractor();
        List<ItemType> familyItems = familyItemExtractor.extract(new FamilyObject(), null).getExtractedItems();
        assert familyItems.size() == 1;
        FamilyItem familyItem = (FamilyItem) familyItems.get(0);
        assert familyItem.getFamily().getValue().toString().toLowerCase().contains("windows");
    }

}