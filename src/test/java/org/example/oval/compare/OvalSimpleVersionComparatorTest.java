package org.example.oval.compare;

import org.junit.Test;
import org.mitre.oval.xmlschema.oval_common_5.OperationEnumeration;

import org.example.oval.compare.OvalSimpleValueComparator.OvalSimpleValueCompareResult;

public class OvalSimpleVersionComparatorTest {

    @Test
    public void testEquals() {
        OvalSimpleVersionComparator comparator = new OvalSimpleVersionComparator();
        String version = null;
        String compare = null;
        assert comparator.compare(version, compare, OperationEnumeration.EQUALS) ==
                OvalSimpleValueCompareResult.ERROR;

        version = "";
        compare = "";
        assert comparator.compare(version, compare, OperationEnumeration.EQUALS) ==
                OvalSimpleValueCompareResult.SUCCESS;

        version = "1";
        compare = "";
        assert comparator.compare(version, compare, OperationEnumeration.EQUALS) ==
                OvalSimpleValueCompareResult.FAIL;

        version = "1.1";
        compare = "1";
        assert comparator.compare(version, compare, OperationEnumeration.EQUALS) ==
                OvalSimpleValueCompareResult.FAIL;

        version = "1.12,343";
        compare = "1.12,343";
        assert comparator.compare(version, compare, OperationEnumeration.EQUALS) ==
                OvalSimpleValueCompareResult.SUCCESS;

        assert comparator.compare(version, compare, OperationEnumeration.PATTERN_MATCH) ==
                OvalSimpleValueCompareResult.ERROR;
    }

    @Test
    public void testNotEquals() {
        OvalSimpleVersionComparator comparator = new OvalSimpleVersionComparator();
        String version = null;
        String compare = null;
        assert comparator.compare(version, compare, OperationEnumeration.NOT_EQUAL) ==
                OvalSimpleValueCompareResult.ERROR;

        version = "";
        compare = "";
        assert comparator.compare(version, compare, OperationEnumeration.NOT_EQUAL) ==
                OvalSimpleValueCompareResult.FAIL;

        version = "1";
        compare = "";
        assert comparator.compare(version, compare, OperationEnumeration.NOT_EQUAL) ==
                OvalSimpleValueCompareResult.SUCCESS;

        version = "1.1";
        compare = "1";
        assert comparator.compare(version, compare, OperationEnumeration.NOT_EQUAL) ==
                OvalSimpleValueCompareResult.SUCCESS;

        version = "1.12,343";
        compare = "1.12,343";
        assert comparator.compare(version, compare, OperationEnumeration.NOT_EQUAL) ==
                OvalSimpleValueCompareResult.FAIL;
    }

    @Test
    public void testGraterThan() {
        OvalSimpleVersionComparator comparator = new OvalSimpleVersionComparator();
        String version = null;
        String compare = null;
        assert comparator.compare(version, compare, OperationEnumeration.GREATER_THAN) ==
                OvalSimpleValueCompareResult.ERROR;

        version = "";
        compare = "";
        assert comparator.compare(version, compare, OperationEnumeration.GREATER_THAN) ==
                OvalSimpleValueCompareResult.FAIL;

        version = "1";
        compare = "";
        assert comparator.compare(version, compare, OperationEnumeration.GREATER_THAN) ==
                OvalSimpleValueCompareResult.SUCCESS;

        version = "";
        compare = "1";
        assert comparator.compare(version, compare, OperationEnumeration.GREATER_THAN) ==
                OvalSimpleValueCompareResult.FAIL;

        version = "1.1";
        compare = "1";
        assert comparator.compare(version, compare, OperationEnumeration.GREATER_THAN) ==
                OvalSimpleValueCompareResult.SUCCESS;

        version = "1";
        compare = "1.1";
        assert comparator.compare(version, compare, OperationEnumeration.GREATER_THAN) ==
                OvalSimpleValueCompareResult.FAIL;

        version = "1.13,343";
        compare = "1.12,343";
        assert comparator.compare(version, compare, OperationEnumeration.GREATER_THAN) ==
                OvalSimpleValueCompareResult.SUCCESS;

        version = "1.12,343";
        compare = "1.13,343";
        assert comparator.compare(version, compare, OperationEnumeration.GREATER_THAN) ==
                OvalSimpleValueCompareResult.FAIL;

        version = "1.12,343";
        compare = "1.12,343";
        assert comparator.compare(version, compare, OperationEnumeration.GREATER_THAN) ==
                OvalSimpleValueCompareResult.FAIL;

        version = "1.12,343";
        compare = "1.12,343";
        assert comparator.compare(version, compare, OperationEnumeration.GREATER_THAN_OR_EQUAL) ==
                OvalSimpleValueCompareResult.SUCCESS;
    }

    @Test
    public void testLessThan() {
        OvalSimpleVersionComparator comparator = new OvalSimpleVersionComparator();
        String version = null;
        String compare = null;
        assert comparator.compare(version, compare, OperationEnumeration.LESS_THAN) ==
                OvalSimpleValueCompareResult.ERROR;

        version = "";
        compare = "";
        assert comparator.compare(version, compare, OperationEnumeration.LESS_THAN) ==
                OvalSimpleValueCompareResult.FAIL;

        version = "1";
        compare = "";
        assert comparator.compare(version, compare, OperationEnumeration.LESS_THAN) ==
                OvalSimpleValueCompareResult.FAIL;

        version = "";
        compare = "1";
        assert comparator.compare(version, compare, OperationEnumeration.LESS_THAN) ==
                OvalSimpleValueCompareResult.SUCCESS;

        version = "1.1";
        compare = "1";
        assert comparator.compare(version, compare, OperationEnumeration.LESS_THAN) ==
                OvalSimpleValueCompareResult.FAIL;

        version = "1";
        compare = "1.1";
        assert comparator.compare(version, compare, OperationEnumeration.LESS_THAN) ==
                OvalSimpleValueCompareResult.SUCCESS;

        version = "1.13,343";
        compare = "1.12,343";
        assert comparator.compare(version, compare, OperationEnumeration.LESS_THAN) ==
                OvalSimpleValueCompareResult.FAIL;

        version = "1.12,343";
        compare = "1.13,343";
        assert comparator.compare(version, compare, OperationEnumeration.LESS_THAN) ==
                OvalSimpleValueCompareResult.SUCCESS;

        version = "1.12,343";
        compare = "1.12,343";
        assert comparator.compare(version, compare, OperationEnumeration.LESS_THAN) ==
                OvalSimpleValueCompareResult.FAIL;

        version = "1.12,343";
        compare = "1.12,343";
        assert comparator.compare(version, compare, OperationEnumeration.LESS_THAN_OR_EQUAL) ==
                OvalSimpleValueCompareResult.SUCCESS;
    }

}