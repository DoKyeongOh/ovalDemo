package org.example.oval.variable.object;

import org.example.oval.OvalEntityMappingContext;
import org.example.oval.variable.OvalVariableExtractor;
import org.example.oval.variable.VariableExtractResult;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectComponentType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.RegistryObject;

public class RegistryComponentExtractor implements OvalVariableExtractor {
    private RegistryObject registryObject;
    private OvalEntityMappingContext ovalEntityMappingContext;
    private ObjectComponentType objectComponentType;
    public RegistryComponentExtractor(OvalEntityMappingContext ovalEntityMappingContext, ObjectComponentType objectComponentType) {
        this.ovalEntityMappingContext = ovalEntityMappingContext;
        this.objectComponentType = objectComponentType;
        this.registryObject = (RegistryObject) ovalEntityMappingContext.getObjectType(objectComponentType.getObjectRef());
    }
    @Override
    public VariableExtractResult extract() {
        return new VariableExtractResult(VariableExtractResult.VariableExtractResultType.DOES_NOT_EXIST);
    }
}
