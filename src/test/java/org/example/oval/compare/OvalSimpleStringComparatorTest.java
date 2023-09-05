package org.example.oval.compare;

import org.junit.Test;
import org.mitre.oval.xmlschema.oval_common_5.OperationEnumeration;

import org.example.oval.compare.OvalSimpleValueComparator.OvalSimpleValueCompareResult;

public class OvalSimpleStringComparatorTest {

    @Test
    public void testEquals() {
        OvalSimpleStringComparator comparator = new OvalSimpleStringComparator();
        String object = null;
        String compare = null;
        assert comparator.compare(object, compare, OperationEnumeration.EQUALS) ==
                OvalSimpleValueCompareResult.ERROR;

        object = "";
        compare = "";
        assert comparator.compare(object, compare, OperationEnumeration.EQUALS) ==
                OvalSimpleValueCompareResult.SUCCESS;

        object = "abc";
        compare = "";
        assert comparator.compare(object, compare, OperationEnumeration.EQUALS) ==
                OvalSimpleValueCompareResult.FAIL;

        object = "abc";
        compare = "abc";
        assert comparator.compare(object, compare, OperationEnumeration.EQUALS) ==
                OvalSimpleValueCompareResult.SUCCESS;

        object = "abC";
        compare = "Abc";
        assert comparator.compare(object, compare, OperationEnumeration.EQUALS) ==
                OvalSimpleValueCompareResult.FAIL;
    }

    @Test
    public void testNotEqual() {
        OvalSimpleStringComparator comparator = new OvalSimpleStringComparator();
        String object = null;
        String compare = null;
        assert comparator.compare(object, compare, OperationEnumeration.NOT_EQUAL) ==
                OvalSimpleValueCompareResult.ERROR;

        object = "";
        compare = "";
        assert comparator.compare(object, compare, OperationEnumeration.NOT_EQUAL) ==
                OvalSimpleValueCompareResult.FAIL;

        object = "abc";
        compare = "";
        assert comparator.compare(object, compare, OperationEnumeration.NOT_EQUAL) ==
                OvalSimpleValueCompareResult.SUCCESS;

        object = "abc";
        compare = "abc";
        assert comparator.compare(object, compare, OperationEnumeration.NOT_EQUAL) ==
                OvalSimpleValueCompareResult.FAIL;

        object = "abC";
        compare = "Abc";
        assert comparator.compare(object, compare, OperationEnumeration.NOT_EQUAL) ==
                OvalSimpleValueCompareResult.SUCCESS;
    }

    @Test
    public void testCaseInsensitiveEquals() {
        OvalSimpleStringComparator comparator = new OvalSimpleStringComparator();
        String object = null;
        String compare = null;
        assert comparator.compare(object, compare, OperationEnumeration.CASE_INSENSITIVE_EQUALS) ==
                OvalSimpleValueCompareResult.ERROR;

        object = "";
        compare = "";
        assert comparator.compare(object, compare, OperationEnumeration.CASE_INSENSITIVE_EQUALS) ==
                OvalSimpleValueCompareResult.SUCCESS;

        object = "abc";
        compare = "";
        assert comparator.compare(object, compare, OperationEnumeration.CASE_INSENSITIVE_EQUALS) ==
                OvalSimpleValueCompareResult.FAIL;

        object = "abc";
        compare = "abc";
        assert comparator.compare(object, compare, OperationEnumeration.CASE_INSENSITIVE_EQUALS) ==
                OvalSimpleValueCompareResult.SUCCESS;

        object = "abC";
        compare = "Abc";
        assert comparator.compare(object, compare, OperationEnumeration.CASE_INSENSITIVE_EQUALS) ==
                OvalSimpleValueCompareResult.SUCCESS;
    }

    @Test
    public void testCaseInsensitiveNotEquals() {
        OvalSimpleStringComparator comparator = new OvalSimpleStringComparator();
        String object = null;
        String compare = null;
        assert comparator.compare(object, compare, OperationEnumeration.CASE_INSENSITIVE_NOT_EQUAL) ==
                OvalSimpleValueCompareResult.ERROR;

        object = "";
        compare = "";
        assert comparator.compare(object, compare, OperationEnumeration.CASE_INSENSITIVE_NOT_EQUAL) ==
                OvalSimpleValueCompareResult.FAIL;

        object = "abc";
        compare = "";
        assert comparator.compare(object, compare, OperationEnumeration.CASE_INSENSITIVE_NOT_EQUAL) ==
                OvalSimpleValueCompareResult.SUCCESS;

        object = "abc";
        compare = "abc";
        assert comparator.compare(object, compare, OperationEnumeration.CASE_INSENSITIVE_NOT_EQUAL) ==
                OvalSimpleValueCompareResult.FAIL;

        object = "abC";
        compare = "Abc";
        assert comparator.compare(object, compare, OperationEnumeration.CASE_INSENSITIVE_NOT_EQUAL) ==
                OvalSimpleValueCompareResult.FAIL;
    }

    @Test
    public void testPatternMatch() {
        OvalSimpleStringComparator comparator = new OvalSimpleStringComparator();
        String object = null;
        String compare = null;
        assert comparator.compare(object, compare, OperationEnumeration.PATTERN_MATCH) ==
                OvalSimpleValueCompareResult.ERROR;

        object = "who_are_you123";
        compare = "who_are_you*";
        assert comparator.compare(object, compare, OperationEnumeration.PATTERN_MATCH) ==
                OvalSimpleValueCompareResult.SUCCESS;

        object = "who_are_2_you123";
        compare = "who_are_you*";
        assert comparator.compare(object, compare, OperationEnumeration.PATTERN_MATCH) ==
                OvalSimpleValueCompareResult.FAIL;

    }

}