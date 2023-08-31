package org.example.oval.set;

import org.example.oval.OvalEntityMapping;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5.Set;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileObject;

public class WinFileItemSetExtractor implements OvalItemSetExtractor {
    private Set fileItemSet;

    public WinFileItemSetExtractor(ObjectType objectType) {
        FileObject fileObject = (FileObject) objectType;
        fileItemSet = fileObject.getSet();
    }

    @Override
    public void extract(OvalEntityMapping ovalEntityMapping) {

    }
}
