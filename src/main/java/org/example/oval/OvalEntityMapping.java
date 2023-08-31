package org.example.oval;

import org.mitre.oval.xmlschema.oval_definitions_5.*;

import javax.xml.bind.JAXBElement;
import java.util.HashMap;
import java.util.Map;

public class OvalEntityMapping {
    private Map<String, ObjectType> objectTypeMap;
    private Map<String, StateType> stateTypeMap;
    private Map<String, VariableType> variableTypeMap;

    public OvalEntityMapping() {
        objectTypeMap = new HashMap<>();
        stateTypeMap = new HashMap<>();
        variableTypeMap = new HashMap<>();
    }

    public void init(OvalDefinitions ovalDefinitions) {
        StatesType statesType = ovalDefinitions.getStates();
        if (statesType != null)
            for (JAXBElement<? extends StateType> stateType : statesType.getState())
                stateTypeMap.put(stateType.getValue().getId(), stateType.getValue());

        ObjectsType objectsType = ovalDefinitions.getObjects();
        if (objectsType != null)
            for (JAXBElement<? extends ObjectType> objectType : objectsType.getObject())
                objectTypeMap.put(objectType.getValue().getId(), objectType.getValue());

        VariablesType variables = ovalDefinitions.getVariables();
        if (variables != null)
            for (JAXBElement<? extends VariableType> variable : variables.getVariable())
                variableTypeMap.put(variable.getValue().getId(), variable.getValue());
    }

    public void addObjectType(String objectId, ObjectType objectType) {
        this.objectTypeMap.put(objectId, objectType);
    }

    public ObjectType getObjectType(String objectId) {
        return this.objectTypeMap.get(objectId);
    }

    public void addStateType(String stateId, StateType stateType) {
        this.stateTypeMap.put(stateId, stateType);
    }

    public StateType getStateType(String stateId) {
        return this.stateTypeMap.get(stateId);
    }
    public void addVariableType(String variableId, VariableType variableType) {
        this.variableTypeMap.put(variableId, variableType);
    }
    public VariableType getVariableType(String variableId) {
        return this.variableTypeMap.get(variableId);
    }

}
