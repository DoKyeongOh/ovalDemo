package org.example.oval;

import org.junit.Test;
import org.mitre.oval.xmlschema.oval_definitions_5.*;

import java.util.List;

public class OvalSimpleValueExtractorTest {

    @Test
    public void test() throws Exception {
        {
            OvalEntityMappingContext ovalEntityMappingContext = new OvalEntityMappingContext();
            EntitySimpleBaseType entitySimpleBaseType = new EntityObjectStringType();
            OvalSimpleValueExtractor converter = new OvalSimpleValueExtractor(ovalEntityMappingContext);
            assert converter.extract(entitySimpleBaseType).isEmpty();
        }
        {
            OvalEntityMappingContext ovalEntityMappingContext = new OvalEntityMappingContext();
            EntitySimpleBaseType entitySimpleBaseType = new EntityObjectStringType();
            entitySimpleBaseType.setValue("hello");
            OvalSimpleValueExtractor converter = new OvalSimpleValueExtractor(ovalEntityMappingContext);
            List<Object> result = converter.extract(entitySimpleBaseType);
            assert result.size() == 1;
            assert result.get(0).equals("hello");
        }
        {
            LiteralComponentType literalComponentType = new LiteralComponentType();
            literalComponentType.setValue("hello");
            LocalVariable localVariable = new LocalVariable();
            localVariable.setLiteralComponent(literalComponentType);

            OvalEntityMappingContext ovalEntityMappingContext = new OvalEntityMappingContext();
            ovalEntityMappingContext.putVariableType("var-1", localVariable);
            EntitySimpleBaseType entitySimpleBaseType = new EntityObjectStringType();
            entitySimpleBaseType.setVarRef("var-1");

            OvalSimpleValueExtractor converter = new OvalSimpleValueExtractor(ovalEntityMappingContext);
            List<Object> result = converter.extract(entitySimpleBaseType);
            assert result.size() == 1;
            assert result.get(0).equals("hello");
        }
    }

}