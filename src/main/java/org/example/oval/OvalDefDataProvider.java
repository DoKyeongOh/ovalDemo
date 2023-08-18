package org.example.oval;

import org.mitre.oval.xmlschema.oval_definitions_5.OvalDefinitions;
import org.mitre.oval.xmlschema.oval_definitions_5.DefinitionType;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5.StateType;
import org.mitre.oval.xmlschema.oval_definitions_5.TestType;

import javax.xml.bind.JAXBElement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface OvalDefDataProvider {

    DefinitionType getDefinition(String id);
    TestType getTest(String id);
    StateType getState(String id);
    ObjectType getObject(String id);
    void setDefinition(String id, DefinitionType definitionType);
    void setTest(String id, TestType testType);
    void setState(String id, StateType stateType);
    void setObject(String id, ObjectType objectType);

    static class OvalDefDataProviderImpl implements OvalDefDataProvider {
        private Map<String, DefinitionType> definitionTypeMap = new HashMap<>();
        private Map<String, TestType> testTypeMap = new HashMap<>();
        private Map<String, StateType> stateTypeMap = new HashMap<>();
        private Map<String, ObjectType> objectTypeMap = new HashMap<>();

        public OvalDefDataProviderImpl(OvalDefinitions ovalDefinitions) {
            List<DefinitionType> definitionTypeList = ovalDefinitions.getDefinitions().getDefinition();
            List<JAXBElement<? extends TestType>> testTypeList = ovalDefinitions.getTests().getTest();
            List<JAXBElement<? extends StateType>> stateTypeList = ovalDefinitions.getStates().getState();
            List<JAXBElement<? extends ObjectType>> objectTypeList = ovalDefinitions.getObjects().getObject();
            for (DefinitionType definitionType : definitionTypeList)
                definitionTypeMap.put(definitionType.getId(), definitionType);
            for (JAXBElement<? extends TestType> testType : testTypeList)
                testTypeMap.put(testType.getValue().getId(), testType.getValue());
            for (JAXBElement<? extends StateType> stateType : stateTypeList)
                stateTypeMap.put(stateType.getValue().getId(), stateType.getValue());
            for (JAXBElement<? extends ObjectType> objectType : objectTypeList)
                objectTypeMap.put(objectType.getValue().getId(), objectType.getValue());
        }

        @Override
        public DefinitionType getDefinition(String id) {
            return definitionTypeMap.get(id);
        }

        @Override
        public TestType getTest(String id) {
            return testTypeMap.get(id);
        }

        @Override
        public StateType getState(String id) {
            return stateTypeMap.get(id);
        }

        @Override
        public ObjectType getObject(String id) {
            return objectTypeMap.get(id);
        }

        @Override
        public void setDefinition(String id, DefinitionType definitionType) {
            definitionTypeMap.put(id, definitionType);
        }

        @Override
        public void setTest(String id, TestType testType) {
            testTypeMap.put(id, testType);
        }

        @Override
        public void setState(String id, StateType stateType) {
            stateTypeMap.put(id, stateType);
        }

        @Override
        public void setObject(String id, ObjectType objectType) {
            objectTypeMap.put(id, objectType);
        }
    }

}
