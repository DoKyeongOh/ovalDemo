package org.example.oval.compare;

import org.mitre.oval.xmlschema.oval_common_5.OperationEnumeration;

public class OvalSimpleBoolComparator implements OvalSimpleValueComparator {
    @Override
    public OvalSimpleValueCompareResult compare(Object object, Object compare,
                                                OperationEnumeration operationEnumeration) {
        if (object == null || compare == null)
            return OvalSimpleValueCompareResult.ERROR;
        String objectBool = object.toString();
        String compareBool = compare.toString();
        if (!"true".equalsIgnoreCase(objectBool) && !"false".equalsIgnoreCase(objectBool))
            return OvalSimpleValueCompareResult.ERROR;
        if (!"true".equalsIgnoreCase(compareBool) && !"false".equalsIgnoreCase(compareBool))
            return OvalSimpleValueCompareResult.ERROR;
        boolean success = false;
        switch (operationEnumeration) {
            case EQUALS:
                success = objectBool.equalsIgnoreCase(compareBool);
                break;
            case NOT_EQUAL:
                success = !objectBool.equalsIgnoreCase(compareBool);
                break;
            default:
                return OvalSimpleValueCompareResult.ERROR;
        }
        if (success)
            return OvalSimpleValueCompareResult.SUCCESS;
        return OvalSimpleValueCompareResult.FAIL;
    }
}
