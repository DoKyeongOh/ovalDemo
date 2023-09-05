package org.example.oval.compare;

import org.mitre.oval.xmlschema.oval_common_5.OperationEnumeration;

public interface OvalSimpleValueComparator {
    OvalSimpleValueCompareResult compare(Object object, Object compare, OperationEnumeration operationEnumeration);


    public enum OvalSimpleValueCompareResult {
        SUCCESS, FAIL, ERROR
    }
}
