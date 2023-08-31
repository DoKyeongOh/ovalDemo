package org.example.oval;

import org.junit.Test;
import org.mitre.oval.xmlschema.oval_definitions_5.*;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OvalSimpleBaseTypeConverterTest {

    @Test
    public void test() throws Exception {
        {
            OvalEntityMapping ovalEntityMapping = new OvalEntityMapping();
            EntitySimpleBaseType entitySimpleBaseType = new EntityObjectStringType();
            OvalSimpleBaseTypeConverter converter = new OvalSimpleBaseTypeConverter(ovalEntityMapping);
            assert converter.convert(entitySimpleBaseType).isEmpty();
        }
        {
            OvalEntityMapping ovalEntityMapping = new OvalEntityMapping();
            EntitySimpleBaseType entitySimpleBaseType = new EntityObjectStringType();
            entitySimpleBaseType.setValue("hello");
            OvalSimpleBaseTypeConverter converter = new OvalSimpleBaseTypeConverter(ovalEntityMapping);
            List<Object> result = converter.convert(entitySimpleBaseType);
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

            OvalSimpleBaseTypeConverter converter = new OvalSimpleBaseTypeConverter(ovalEntityMapping);
            List<Object> result = converter.convert(entitySimpleBaseType);
            assert result.size() == 1;
            assert result.get(0).equals("hello");
        }
        {
            ObjectComponentType objectComponentType = new ObjectComponentType();
            objectComponentType.setObjectRef("obj-1");
            LocalVariable localVariable = new LocalVariable();
            localVariable.setObjectComponent(objectComponentType);

            RegistryObject registryObject = new RegistryObject();
            registryObject.setId("obj-1");

            OvalEntityMapping ovalEntityMapping = new OvalEntityMapping();
            ovalEntityMapping.addVariableType("var-1", localVariable);
            ovalEntityMapping.addObjectType("obj-1", registryObject);

            EntitySimpleBaseType entitySimpleBaseType = new EntityObjectStringType();
            entitySimpleBaseType.setVarRef("var-1");

            OvalSimpleBaseTypeConverter converter = new OvalSimpleBaseTypeConverter(ovalEntityMapping);
            List<Object> result = converter.convert(entitySimpleBaseType);
            assert result.size() == 1;
        }
    }

}