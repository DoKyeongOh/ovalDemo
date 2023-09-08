package org.example.oval.item;

import org.example.oval.family.FamilyItemExtractor;
import org.example.oval.file.UnixFileItemExtractor;
import org.example.oval.file.WinFileItemExtractor;
import org.example.oval.item.OvalItemExtractor;
import org.example.oval.registry.RegistryDataReader;
import org.example.oval.registry.RegistryItemExtractor;
import org.example.oval.rpminfo.RpmInfoItemExtractor;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.FamilyObject;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.RpminfoObject;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.FileObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.RegistryObject;

public class OvalItemExtractorFactory {
    public static OvalItemExtractor getExtractor(Class<? extends ObjectType> objectTypeClass) {
        if (objectTypeClass.equals(FileObject.class))
            return new UnixFileItemExtractor();
        if (objectTypeClass.equals(org.mitre.oval.xmlschema.oval_definitions_5_windows.FileObject.class))
            return new WinFileItemExtractor();
        if (objectTypeClass.equals(RpminfoObject.class))
            return new RpmInfoItemExtractor();
        if (objectTypeClass.equals(FamilyObject.class))
            return new FamilyItemExtractor();
        if (objectTypeClass.equals(RegistryObject.class))
            return new RegistryItemExtractor(new RegistryDataReader());
        return null;
    }
}
