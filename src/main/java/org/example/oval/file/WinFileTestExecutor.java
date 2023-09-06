package org.example.oval.file;

import org.example.oval.OvalEntityMapping;
import org.example.oval.item.ItemExtractResult;
import org.example.oval.test.OvalTestExecutor;
import org.example.oval.test.OvalTestResultType;
import org.mitre.oval.xmlschema.oval_definitions_5.StateRefType;
import org.mitre.oval.xmlschema.oval_definitions_5.StateType;
import org.mitre.oval.xmlschema.oval_definitions_5.TestType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileTest;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;

import java.util.List;

public class WinFileTestExecutor implements OvalTestExecutor {
    private FileTest fileTest;
    public WinFileTestExecutor(TestType testType) {
        this.fileTest = (FileTest) testType;
    }

    @Override
    public OvalTestResultType execute(OvalEntityMapping ovalEntityMapping, ItemExtractResult itemExtractResult)
            throws Exception {
        for (StateRefType stateRefType : fileTest.getState()) {
            StateType inputState = ovalEntityMapping.getStateType(stateRefType.getStateRef());
            if (inputState == null)
                throw new Exception("input file state is null. test id : " + this.fileTest.getId());
            if (!inputState.getClass().equals(FileState.class))
                throw new Exception("input file state is not file_state. test id : " + this.fileTest.getId());

            FileState fileState = (FileState) inputState;
        }
        return OvalTestResultType.UNKNOWN;
    }
}
