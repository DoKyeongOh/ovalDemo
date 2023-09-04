package org.example.oval.file;

import org.example.oval.OvalEntityMapping;
import org.example.oval.OvalItemSetExtractor;
import org.mitre.oval.xmlschema.oval_definitions_5.Set;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;

import java.util.List;

public class WinFileItemSetExtractor implements OvalItemSetExtractor {
    private Set fileItemSet;
    private OvalEntityMapping ovalEntityMapping;
    public WinFileItemSetExtractor(Set fileItemSet, OvalEntityMapping ovalEntityMapping) {
        this.fileItemSet = fileItemSet;
        this.ovalEntityMapping = ovalEntityMapping;
    }

    @Override
    public List<ItemType> extract() {
        return null;
    }
}
