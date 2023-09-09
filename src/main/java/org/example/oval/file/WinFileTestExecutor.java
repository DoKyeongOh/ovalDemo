package org.example.oval.file;

import org.example.oval.OvalEntityMappingContext;
import org.example.oval.compare.OvalSimpleValueComparator;
import org.example.oval.compare.OvalSimpleValueComparatorFactory;
import org.example.oval.item.ItemExtractResult;
import org.example.oval.item.ItemExtractResult.ItemExtractResultType;
import org.example.oval.test.OvalTestExecutor;
import org.example.oval.test.OvalTestResultType;
import org.mitre.oval.xmlschema.oval_common_5.OperationEnumeration;
import org.mitre.oval.xmlschema.oval_common_5.SimpleDatatypeEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5.*;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileTest;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemVersionType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.FileItem;

import javax.xml.bind.JAXBElement;

public class WinFileTestExecutor implements OvalTestExecutor {
    private FileTest fileTest;
    public WinFileTestExecutor(TestType testType) {
        this.fileTest = (FileTest) testType;
    }

    @Override
    public OvalTestResultType execute(OvalEntityMappingContext mappingContext) {
        ObjectRefType objectRef = fileTest.getObject();
        if (objectRef == null)
            return OvalTestResultType.ERROR;
        ItemExtractResult itemResult = mappingContext.getItemResult(objectRef.getObjectRef());
        if (itemResult == null)
            return OvalTestResultType.ERROR;


        switch (fileTest.getCheckExistence()) {
            case ALL_EXIST:
            case AT_LEAST_ONE_EXISTS:
                if (itemResult.getResultType() == ItemExtractResultType.DOES_NOT_EXIST)
                    return OvalTestResultType.FALSE;
                break;
            case ONLY_ONE_EXISTS:
                if (itemResult.getExtractedItems().size() != 1)
                    return OvalTestResultType.FALSE;
                break;
            case NONE_EXIST:
                if (itemResult.getResultType() != ItemExtractResultType.DOES_NOT_EXIST)
                    return OvalTestResultType.FALSE;
                break;
            case ANY_EXIST:
                break;
        }

        int success = 0;
        for (ItemType itemType : itemResult.getExtractedItems()) {
            if (itemType instanceof FileItem == false)
                return OvalTestResultType.ERROR;

            FileItem fileItem = (FileItem) itemType;
            for (StateRefType stateRefType : fileTest.getState()) {
                StateType inputState = mappingContext.getStateType(stateRefType.getStateRef());
                if (inputState == null)
                    return OvalTestResultType.ERROR;
                if (!inputState.getClass().equals(FileState.class))
                    return OvalTestResultType.ERROR;
                FileState fileState = (FileState) inputState;
                success += filterFileItem(fileItem, fileState) ? 1 : 0;
            }
        }

        switch (fileTest.getCheck()) {
            case ALL:
                if (success != itemResult.getExtractedItems().size())
                    return OvalTestResultType.FALSE;
                break;
            case AT_LEAST_ONE:
                if (success < 1)
                    return OvalTestResultType.FALSE;
                break;
            case NONE_EXIST:
                if (success > 0)
                    return OvalTestResultType.FALSE;
                break;
            case NONE_SATISFY:
                break;
            case ONLY_ONE:
                if (success != 1)
                    return OvalTestResultType.FALSE;
                break;
        }
        return OvalTestResultType.TRUE;
    }

    private boolean filterFileItem(FileItem fileItem, FileState fileState) {
        if (fileState.getRest().isEmpty())
            return true;

        for (JAXBElement<? extends EntityStateSimpleBaseType> stateElement : fileState.getRest()) {
            EntityStateSimpleBaseType stateSimpleType = stateElement.getValue();
            Object object = stateSimpleType.getValue();
            String stateName = stateElement.getName().getLocalPart();
            OperationEnumeration operation = stateSimpleType.getOperation();

            if (stateName.equalsIgnoreCase("version")) {
                EntityItemVersionType version = fileItem.getVersion();
                Object compare = version == null ? null : version.getValue();
                OvalSimpleValueComparator comparator = OvalSimpleValueComparatorFactory
                        .getComparator(SimpleDatatypeEnumeration.VERSION);
                OvalSimpleValueComparator.OvalSimpleValueCompareResult compareResult =
                        comparator.compare(object, compare, operation);
                if (compareResult != OvalSimpleValueComparator.OvalSimpleValueCompareResult.SUCCESS)
                    return false;
            }

            if (stateName.equalsIgnoreCase("filepath")) {
                EntityItemStringType filepath = fileItem.getFilepath();
                Object compare = filepath.getValue();
                OvalSimpleValueComparator comparator = OvalSimpleValueComparatorFactory
                        .getComparator(SimpleDatatypeEnumeration.STRING);
                OvalSimpleValueComparator.OvalSimpleValueCompareResult compareResult = comparator.compare(object, compare, operation);
                if (compareResult != OvalSimpleValueComparator.OvalSimpleValueCompareResult.SUCCESS)
                    return false;
            }
        }
        return true;
    }
}
