package org.example.oval.file;

import org.example.oval.OvalEntityMappingContext;
import org.example.oval.item.ItemExtractResult;
import org.junit.Test;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.Filter;
import org.mitre.oval.xmlschema.oval_definitions_5.Set;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.FileObject;

import java.util.ArrayList;
import java.util.List;

public class UnixFileItemSetExtractorTest {

    @Test
    public void test() throws Exception {
        FakeSet set = new FakeSet();
        set.setObjectReference(new ArrayList<>());
        set.setFilter(new ArrayList<>());
        OvalEntityMappingContext ovalEntityMappingContext = new OvalEntityMappingContext();

        for (int i=0 ; i<2 ; i++) {
            set.getObjectReference().add("object-if-"+i);
            ovalEntityMappingContext.putObjectType("object-if-"+i, new FileObject());
            FileObject fileObject = (FileObject) ovalEntityMappingContext.getObjectType("object-if-" + i);
            fileObject.setFilepath(new EntityObjectStringType());
            fileObject.getFilepath().setValue("target/temp/fileExtractorTest/dumy0");
        }

        UnixFileItemSetExtractor unixFileItemSetExtractor = new UnixFileItemSetExtractor(set, ovalEntityMappingContext);
        ItemExtractResult extract = unixFileItemSetExtractor.extract();
    }

    private class FakeSet extends Set {
        public void setObjectReference(List<String> objectReferences) {
            this.objectReference = objectReferences;
        }
        public void setFilter(List<Filter> filters) {
            this.filter = filters;
        }
    }

}