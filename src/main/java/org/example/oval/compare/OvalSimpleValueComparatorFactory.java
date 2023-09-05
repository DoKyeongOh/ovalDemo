package org.example.oval.compare;

import org.mitre.oval.xmlschema.oval_common_5.SimpleDatatypeEnumeration;

public class OvalSimpleValueComparatorFactory {

    public static OvalSimpleValueComparator getComparator(String datatype) {
        SimpleDatatypeEnumeration enumeration = SimpleDatatypeEnumeration.fromValue(datatype);
        return getComparator(enumeration);
    }

    public static OvalSimpleValueComparator getComparator(SimpleDatatypeEnumeration datatype) {
        switch (datatype) {
            case BINARY:
                break;
            case BOOLEAN:
                return new OvalSimpleBoolComparator();
            case EVR_STRING:
                break;
            case DEBIAN_EVR_STRING:
                break;
            case FILESET_REVISION:
                break;
            case FLOAT:
                break;
            case IOS_VERSION:
                break;
            case INT:
                break;
            case IPV_4_ADDRESS:
                break;
            case IPV_6_ADDRESS:
                break;
            case STRING:
                return new OvalSimpleStringComparator();
            case VERSION:
                return new OvalSimpleVersionComparator();
        }
        return (object, compare, operationEnumeration) -> OvalSimpleValueComparator.OvalSimpleValueCompareResult.ERROR;
    }

}
