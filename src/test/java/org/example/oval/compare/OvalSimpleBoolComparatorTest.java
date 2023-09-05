package org.example.oval.compare;

import org.junit.Test;
import org.mitre.oval.xmlschema.oval_common_5.OperationEnumeration;

import org.example.oval.compare.OvalSimpleValueComparator.OvalSimpleValueCompareResult;

public class OvalSimpleBoolComparatorTest {

    @Test
    public void testEquals() {
        OvalSimpleBoolComparator comparator = new OvalSimpleBoolComparator();
        String object = null;
        String compare = null;
        assert comparator.compare(object, compare, OperationEnumeration.EQUALS) == OvalSimpleValueCompareResult.ERROR;

        object = "";
        compare = "";
        assert comparator.compare(object, compare, OperationEnumeration.EQUALS) == OvalSimpleValueCompareResult.ERROR;

        object = "a";
        compare = "";
        assert comparator.compare(object, compare, OperationEnumeration.EQUALS) == OvalSimpleValueCompareResult.ERROR;

        object = "";
        compare = "a";
        assert comparator.compare(object, compare, OperationEnumeration.EQUALS) == OvalSimpleValueCompareResult.ERROR;

        object = "true";
        compare = "";
        assert comparator.compare(object, compare, OperationEnumeration.EQUALS) == OvalSimpleValueCompareResult.ERROR;

        object = "";
        compare = "true";
        assert comparator.compare(object, compare, OperationEnumeration.EQUALS) == OvalSimpleValueCompareResult.ERROR;

        object = "true";
        compare = "true";
        assert comparator.compare(object, compare, OperationEnumeration.EQUALS) == OvalSimpleValueCompareResult.SUCCESS;

        object = "true";
        compare = "false";
        assert comparator.compare(object, compare, OperationEnumeration.EQUALS) == OvalSimpleValueCompareResult.FAIL;

        object = "false";
        compare = "true";
        assert comparator.compare(object, compare, OperationEnumeration.EQUALS) == OvalSimpleValueCompareResult.FAIL;

        object = "false";
        compare = "false";
        assert comparator.compare(object, compare, OperationEnumeration.EQUALS) == OvalSimpleValueCompareResult.SUCCESS;
    }
    @Test
    public void testNotEqual() {
        OvalSimpleBoolComparator comparator = new OvalSimpleBoolComparator();
        String object = null;
        String compare = null;
        assert comparator.compare(object, compare, OperationEnumeration.NOT_EQUAL) == OvalSimpleValueCompareResult.ERROR;

        object = "";
        compare = "";
        assert comparator.compare(object, compare, OperationEnumeration.NOT_EQUAL) == OvalSimpleValueCompareResult.ERROR;

        object = "a";
        compare = "";
        assert comparator.compare(object, compare, OperationEnumeration.NOT_EQUAL) == OvalSimpleValueCompareResult.ERROR;

        object = "";
        compare = "a";
        assert comparator.compare(object, compare, OperationEnumeration.NOT_EQUAL) == OvalSimpleValueCompareResult.ERROR;

        object = "true";
        compare = "";
        assert comparator.compare(object, compare, OperationEnumeration.NOT_EQUAL) == OvalSimpleValueCompareResult.ERROR;

        object = "";
        compare = "true";
        assert comparator.compare(object, compare, OperationEnumeration.NOT_EQUAL) == OvalSimpleValueCompareResult.ERROR;

        object = "true";
        compare = "true";
        assert comparator.compare(object, compare, OperationEnumeration.NOT_EQUAL) == OvalSimpleValueCompareResult.FAIL;

        object = "true";
        compare = "false";
        assert comparator.compare(object, compare, OperationEnumeration.NOT_EQUAL) == OvalSimpleValueCompareResult.SUCCESS;

        object = "false";
        compare = "true";
        assert comparator.compare(object, compare, OperationEnumeration.NOT_EQUAL) == OvalSimpleValueCompareResult.SUCCESS;

        object = "false";
        compare = "false";
        assert comparator.compare(object, compare, OperationEnumeration.NOT_EQUAL) == OvalSimpleValueCompareResult.FAIL;
    }

    @Test
    public void testOtherOperation() {
        OvalSimpleBoolComparator comparator = new OvalSimpleBoolComparator();
        String object = "true";
        String compare = "true";
        assert comparator.compare(object, compare, OperationEnumeration.LESS_THAN) ==
                OvalSimpleValueCompareResult.ERROR;
    }

}