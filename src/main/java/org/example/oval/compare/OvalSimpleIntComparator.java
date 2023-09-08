package org.example.oval.compare;

import org.mitre.oval.xmlschema.oval_common_5.OperationEnumeration;

public class OvalSimpleIntComparator implements OvalSimpleValueComparator{
    @Override
    public OvalSimpleValueCompareResult compare(Object object, Object compare, OperationEnumeration operationEnumeration) {
        int objectInt = 0;
        int compareInt = 0;
        try {
            objectInt = (int) object;
            compareInt = (int) compare;
        } catch (Exception e) {
            return OvalSimpleValueCompareResult.ERROR;
        }
        boolean success = false;
        switch (operationEnumeration) {
            case EQUALS:
                success = objectInt == compareInt;
                break;
            case NOT_EQUAL:
                success = objectInt != compareInt;
                break;
            case GREATER_THAN:
                success = objectInt > compareInt;
                break;
            case LESS_THAN:
                success = objectInt < compareInt;
                break;
            case GREATER_THAN_OR_EQUAL:
                success = objectInt >= compareInt;
                break;
            case LESS_THAN_OR_EQUAL:
                success = objectInt <= compareInt;
                break;
            case BITWISE_AND:
                success = (objectInt & compareInt) == compareInt;
                break;
            case BITWISE_OR:
                success = (objectInt | compareInt) == compareInt;
                break;
        }
        if (success)
            return OvalSimpleValueCompareResult.SUCCESS;
        return OvalSimpleValueCompareResult.FAIL;
    }
}
