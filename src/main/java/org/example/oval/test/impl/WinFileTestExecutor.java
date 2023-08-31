package org.example.oval.test.impl;

import org.example.oval.test.OvalTestResultType;
import org.mitre.oval.xmlschema.oval_definitions_5.StateRefType;
import org.mitre.oval.xmlschema.oval_definitions_5.StateType;
import org.mitre.oval.xmlschema.oval_definitions_5.TestType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileTest;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;

import java.util.List;
import java.util.Map;

public class WinFileTestExecutor implements OvalTestExecutor {
    private FileTest fileTest;
    // Map<String, StateType> stateTypeMap, List<ItemType> itemTypes 멤버로
    public WinFileTestExecutor(TestType testType) {
        this.fileTest = (FileTest) testType;
    }

    @Override
    public OvalTestResultType execute(Map<String, StateType> stateTypeMap, List<ItemType> itemTypes) throws Exception {
        for (StateRefType stateRefType : fileTest.getState()) {
            StateType inputState = stateTypeMap.get(stateRefType.getStateRef());
            if (inputState == null)
                throw new Exception("input file state is null. test id : " + this.fileTest.getId());
            if (!inputState.getClass().equals(FileState.class))
                throw new Exception("input file state is not file_state. test id : " + this.fileTest.getId());

            FileState fileState = (FileState) inputState;
        }
        return OvalTestResultType.UNKNOWN;
    }
}
