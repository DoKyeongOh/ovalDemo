package org.example.oval;

import org.example.oval.variable.VariableExtractResult;
import org.junit.Test;
import org.mitre.oval.xmlschema.oval_definitions_5.*;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;

import java.math.BigInteger;
import java.util.List;

public class OvalSimpleValueExtractorTest {

    @Test
    public void test() throws Exception {
        {
            OvalEntityMappingContext ovalEntityMappingContext = new OvalEntityMappingContext();
            EntitySimpleBaseType entitySimpleBaseType = new EntityObjectStringType();
            OvalSimpleValueExtractor extractor = new OvalSimpleValueExtractor(ovalEntityMappingContext);
            assert extractor.extract(entitySimpleBaseType).isEmpty();
        }
        {
            OvalEntityMappingContext ovalEntityMappingContext = new OvalEntityMappingContext();
            EntitySimpleBaseType entitySimpleBaseType = new EntityObjectStringType();
            entitySimpleBaseType.setValue("hello");
            OvalSimpleValueExtractor extractor = new OvalSimpleValueExtractor(ovalEntityMappingContext);
            List<Object> result = extractor.extract(entitySimpleBaseType);
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

            OvalSimpleValueExtractor extractor = new OvalSimpleValueExtractor(ovalEntityMappingContext);
            List<Object> result = extractor.extract(entitySimpleBaseType);
            assert result.size() == 1;
            assert result.get(0).equals("hello");
        }
        {
            ItemType itemType = new ItemType();
            itemType.setId(new BigInteger("1"));

            VariableExtractResult variableExtractResult = new VariableExtractResult();
            variableExtractResult.getExtractedItems().add(itemType);

            OvalEntityMappingContext entityMappingContext = new OvalEntityMappingContext();
            entityMappingContext.putVariableResult("var-1", variableExtractResult);
            OvalSimpleValueExtractor extractor = new OvalSimpleValueExtractor(entityMappingContext);

            EntitySimpleBaseType entitySimpleBaseType = new EntityObjectStringType();
            entitySimpleBaseType.setVarRef("var-1");
            List<Object> extract = extractor.extract(entitySimpleBaseType);
            assert extract.size() == 1;
            assert ((ItemType) extract.get(0)).getId().toString().equals("1");
        }
    }

    @Test
    public void testAbnormal() {
        {
            OvalSimpleValueExtractor extractor = new OvalSimpleValueExtractor(null);
            assert extractor.extract(null).isEmpty();
        }
        {
            EntitySimpleBaseType entitySimpleBaseType = new EntityObjectStringType();
            entitySimpleBaseType.setVarRef("var-1");
            OvalSimpleValueExtractor extractor = new OvalSimpleValueExtractor(new OvalEntityMappingContext());
            assert extractor.extract(entitySimpleBaseType).isEmpty();
        }
        {
            OvalEntityMappingContext entityMappingContext = new OvalEntityMappingContext();
            entityMappingContext.putVariableType("var-1", new ExternalVariable());
            EntitySimpleBaseType entitySimpleBaseType = new EntityObjectStringType();
            entitySimpleBaseType.setVarRef("var-1");
            OvalSimpleValueExtractor extractor = new OvalSimpleValueExtractor(entityMappingContext);
            assert extractor.extract(entitySimpleBaseType).isEmpty();
        }

    }

}