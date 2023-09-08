package org.example.oval.compare;

import org.mitre.oval.xmlschema.oval_common_5.OperationEnumeration;

import java.util.regex.Pattern;

public class OvalSimpleBinaryComparator implements OvalSimpleValueComparator {
    @Override
    public OvalSimpleValueCompareResult compare(Object object, Object compare, OperationEnumeration operationEnumeration) {
        if (object == null || compare == null)
            return OvalSimpleValueCompareResult.ERROR;
        String objectStr = (String) object;
        String compareStr = (String) compare;
        boolean success = false;
        switch (operationEnumeration) {
            case EQUALS:
                success = objectStr.equals(compareStr);
                break;
            case NOT_EQUAL:
                success = !objectStr.equals(compareStr);
                break;
        }
        if (success)
            return OvalSimpleValueCompareResult.SUCCESS;
        return OvalSimpleValueCompareResult.FAIL;
    }
}
