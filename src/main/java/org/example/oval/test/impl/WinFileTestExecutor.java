package org.example.oval.test.impl;

import org.example.oval.test.OvalTestExecutor;
import org.example.oval.test.OvalTestResultType;
import org.mitre.oval.xmlschema.oval_definitions_5.*;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileBehaviors;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileTest;

import javax.xml.bind.JAXBElement;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WinFileTestExecutor extends OvalTestExecutor {
    private FileObject objectType;
    private List<FileState> stateTypeList;
    public WinFileTestExecutor(TestType testType) {
        super(testType);
    }

    @Override
    public void init(Map<String, StateType> stateTypeMap, Map<String, ObjectType> objectTypeMap) throws Exception {
        FileTest fileTest = (FileTest) testType;
        stateTypeList = new ArrayList<>();
        for (StateRefType stateRefType : fileTest.getState()) {
            StateType inputState = stateTypeMap.get(stateRefType.getStateRef());
            if (inputState == null)
                throw new Exception("input file state is null. test id : " + testType.getId());
            if (!inputState.getClass().equals(FileState.class))
                throw new Exception("input file state is not file_state. test id : " + testType.getId());
            stateTypeList.add((FileState) inputState);
        }
        objectType = (FileObject) objectTypeMap.get(fileTest.getObject().getObjectRef());
    }

    @Override
    public OvalTestResultType execute() throws Exception {
        boolean setExist = objectType.getSet() != null;
        boolean filepathExist = objectType.getFilepath() != null;
        boolean pathExist = objectType.getFilename() != null || objectType.getPath() != null;
        if (setExist && (filepathExist || pathExist))
            throw new Exception("set type and other type cannot be used at the same time");

        if (!setExist && !filepathExist && !pathExist)
            throw new Exception("file data in file_object is not exist");

        if (filepathExist && pathExist)
            throw new Exception("filepath and (path + filepath) cannot be used at the same time");

        List<File> files = null;
        if (setExist)
            files = findFilesBySet(objectType.getSet());
        else if (filepathExist)
            files = findFilesByFilepath(objectType.getFilepath());
        else if (pathExist)
            files = findFilesByPath(objectType.getPath(), objectType.getFilename());


        FileBehaviors behaviors = objectType.getBehaviors();
        return OvalTestResultType.UNKNOWN;
    }

    private List<File> findFilesByPath(EntityObjectStringType path, JAXBElement<EntityObjectStringType> filename) {
        List<File> files = new ArrayList<>();
        switch (path.getOperation()) {
            case EQUALS: // new File().exist()
                break;
            case NOT_EQUAL: // new File().exist()
                break;
            case CASE_INSENSITIVE_EQUALS: // 대소문자 구분 없어야함 -> 전체파일 검색
                break;
            case CASE_INSENSITIVE_NOT_EQUAL: // 전체파일 검색
                break;
            case PATTERN_MATCH: //
                break;
            case SUBSET_OF: // 전체 파일을 검색해야함
                break;
            case SUPERSET_OF: // 전체 파일을 검색해야함
                break;
            default:
                break;
        }
        return files;
    }

    private List<File> findFilesByFilepath(EntityObjectStringType filepath) {
        List<File> files = new ArrayList<>();
        return files;
    }

    private List<File> findFilesBySet(Set set) {
        List<File> files = new ArrayList<>();
        return files;
    }
}
