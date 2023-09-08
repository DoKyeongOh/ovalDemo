package org.example.oval.variable;

import org.example.oval.OvalEntityMappingContext;
import org.example.oval.variable.object.RegistryComponentExtractor;
import org.junit.Test;
import org.mitre.oval.xmlschema.oval_definitions_5.*;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.RegistryObject;

public class LocalVariableExtractorFactoryTest {

    @Test
    public void test() throws Exception {
        {
            LocalVariable localVariable = new LocalVariable();
            OvalVariableExtractor localVariableExtractor =
                    LocalVariableExtractorFactory.getLocalVariableExtractor(null, localVariable);
            assert localVariableExtractor == null;
        }
        {
            LocalVariable localVariable = new LocalVariable();
            localVariable.setLiteralComponent(new LiteralComponentType());
            localVariable.setObjectComponent(new ObjectComponentType());
            try {
                LocalVariableExtractorFactory.getLocalVariableExtractor(null, localVariable);
                assert false;
            } catch (Exception e) {
                assert true;
            }
        }
        {
            LocalVariable localVariable = new LocalVariable();
            localVariable.setObjectComponent(new ObjectComponentType());
            localVariable.setVariableComponent(new VariableComponentType());
            try {
                LocalVariableExtractorFactory.getLocalVariableExtractor(null, localVariable);
                assert false;
            } catch (Exception e) {
                assert true;
            }
        }
        {
            LocalVariable localVariable = new LocalVariable();
            localVariable.setLiteralComponent(new LiteralComponentType());
            localVariable.setVariableComponent(new VariableComponentType());
            try {
                LocalVariableExtractorFactory.getLocalVariableExtractor(null, localVariable);
                assert false;
            } catch (Exception e) {
                assert true;
            }
        }
        {
            LocalVariable localVariable = new LocalVariable();
            localVariable.setLiteralComponent(new LiteralComponentType());
            localVariable.setConcat(new ConcatFunctionType());
            try {
                LocalVariableExtractorFactory.getLocalVariableExtractor(null, localVariable);
                assert false;
            } catch (Exception e) {
                assert true;
            }
        }
        {
            LocalVariable localVariable = new LocalVariable();
            localVariable.setLiteralComponent(new LiteralComponentType());
            OvalVariableExtractor localVariableExtractor =
                    LocalVariableExtractorFactory.getLocalVariableExtractor(null, localVariable);
            assert localVariableExtractor instanceof LocalVariableExtractorFactory.LiteralComponentExtractor;
        }
        {
            LocalVariable localVariable = new LocalVariable();
            localVariable.setVariableComponent(new VariableComponentType());
            OvalVariableExtractor localVariableExtractor =
                    LocalVariableExtractorFactory.getLocalVariableExtractor(null, localVariable);
            assert localVariableExtractor instanceof LocalVariableExtractorFactory.VariableComponentExtractor;
        }
    }

    @Test
    public void testObjectComponent() throws Exception {
        ObjectComponentType objectComponentType = new ObjectComponentType();
        objectComponentType.setObjectRef("object-1");
        OvalEntityMappingContext ovalEntityMappingContext = new OvalEntityMappingContext();
        ovalEntityMappingContext.putObjectType("object-1", new RegistryObject());
        LocalVariable localVariable = new LocalVariable();
        localVariable.setObjectComponent(objectComponentType);
        OvalVariableExtractor localVariableExtractor =
                LocalVariableExtractorFactory.getLocalVariableExtractor(ovalEntityMappingContext, localVariable);
        assert localVariableExtractor instanceof RegistryComponentExtractor;
    }

}