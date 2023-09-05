package org.example.oval.compare;

import org.mitre.oval.xmlschema.oval_common_5.OperationEnumeration;

import java.util.regex.Pattern;

public class OvalSimpleStringComparator implements OvalSimpleValueComparator {
    @Override
    public OvalSimpleValueCompareResult compare(Object object, Object compare,
                                                OperationEnumeration operationEnumeration) {
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
            case CASE_INSENSITIVE_EQUALS:
                success = objectStr.equalsIgnoreCase(compareStr);
                break;
            case CASE_INSENSITIVE_NOT_EQUAL:
                success = !objectStr.equalsIgnoreCase(compareStr);
                break;
            case PATTERN_MATCH: // object : data, compare : pattern
                Pattern compile = Pattern.compile(compareStr);
                success = compile.matcher(objectStr).find();
                break;
        }
        if (success)
            return OvalSimpleValueCompareResult.SUCCESS;
        return OvalSimpleValueCompareResult.FAIL;
    }
}
