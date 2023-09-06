package org.example.oval;

import org.junit.Test;
import org.mitre.oval.xmlschema.oval_definitions_5.*;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.RegistryObject;

import java.util.List;

public class OvalSimpleValueExtractorTest {

    @Test
    public void test() throws Exception {
        {
            OvalEntityMapping ovalEntityMapping = new OvalEntityMapping();
            EntitySimpleBaseType entitySimpleBaseType = new EntityObjectStringType();
            OvalSimpleValueExtractor converter = new OvalSimpleValueExtractor(ovalEntityMapping);
            assert converter.extract(entitySimpleBaseType).isEmpty();
        }
        {
            OvalEntityMapping ovalEntityMapping = new OvalEntityMapping();
            EntitySimpleBaseType entitySimpleBaseType = new EntityObjectStringType();
            entitySimpleBaseType.setValue("hello");
            OvalSimpleValueExtractor converter = new OvalSimpleValueExtractor(ovalEntityMapping);
            List<Object> result = converter.extract(entitySimpleBaseType);
            assert result.size() == 1;
            assert result.get(0).equals("hello");
        }
        {
            LiteralComponentType literalComponentType = new LiteralComponentType();
            literalComponentType.setValue("hello");
            LocalVariable localVariable = new LocalVariable();
            localVariable.setLiteralComponent(literalComponentType);

            OvalEntityMapping ovalEntityMapping = new OvalEntityMapping();
            ovalEntityMapping.addVariableType("var-1", localVariable);
            EntitySimpleBaseType entitySimpleBaseType = new EntityObjectStringType();
            entitySimpleBaseType.setVarRef("var-1");

            OvalSimpleValueExtractor converter = new OvalSimpleValueExtractor(ovalEntityMapping);
            List<Object> result = converter.extract(entitySimpleBaseType);
            assert result.size() == 1;
            assert result.get(0).equals("hello");
        }
    }

}