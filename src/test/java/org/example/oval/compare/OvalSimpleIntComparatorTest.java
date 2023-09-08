package org.example.oval.compare;

import org.junit.Test;
import org.mitre.oval.xmlschema.oval_common_5.OperationEnumeration;

import org.example.oval.compare.OvalSimpleValueComparator.OvalSimpleValueCompareResult;

public class OvalSimpleIntComparatorTest {

    @Test
    public void test() {
        OvalSimpleIntComparator comparator = new OvalSimpleIntComparator();

        assert comparator.compare(1, 1, OperationEnumeration.EQUALS) ==
                OvalSimpleValueCompareResult.SUCCESS;
        assert comparator.compare(1, 1, OperationEnumeration.NOT_EQUAL) ==
                OvalSimpleValueCompareResult.FAIL;
        assert comparator.compare(1, 2, OperationEnumeration.EQUALS) ==
                OvalSimpleValueCompareResult.FAIL;
        assert comparator.compare(1, 2, OperationEnumeration.NOT_EQUAL) ==
                OvalSimpleValueCompareResult.SUCCESS;

        assert comparator.compare(2, 1, OperationEnumeration.GREATER_THAN) ==
                OvalSimpleValueCompareResult.SUCCESS;
        assert comparator.compare(1, 2, OperationEnumeration.GREATER_THAN) ==
                OvalSimpleValueCompareResult.FAIL;
        assert comparator.compare(1, 2, OperationEnumeration.LESS_THAN) ==
                OvalSimpleValueCompareResult.SUCCESS;
        assert comparator.compare(2, 1, OperationEnumeration.LESS_THAN) ==
                OvalSimpleValueCompareResult.FAIL;

        assert comparator.compare(1, 1, OperationEnumeration.GREATER_THAN_OR_EQUAL) ==
                OvalSimpleValueCompareResult.SUCCESS;
        assert comparator.compare(1, 2, OperationEnumeration.GREATER_THAN_OR_EQUAL) ==
                OvalSimpleValueCompareResult.FAIL;
        assert comparator.compare(1, 1, OperationEnumeration.LESS_THAN_OR_EQUAL) ==
                OvalSimpleValueCompareResult.SUCCESS;
        assert comparator.compare(2, 1, OperationEnumeration.LESS_THAN_OR_EQUAL) ==
                OvalSimpleValueCompareResult.FAIL;

        assert comparator.compare(15, 5, OperationEnumeration.BITWISE_AND) ==
                OvalSimpleValueCompareResult.SUCCESS;
        assert comparator.compare(5, 15, OperationEnumeration.BITWISE_AND) ==
                OvalSimpleValueCompareResult.FAIL;

        assert comparator.compare(15, 5, OperationEnumeration.BITWISE_OR) ==
                OvalSimpleValueCompareResult.FAIL;
        assert comparator.compare(5, 15, OperationEnumeration.BITWISE_OR) ==
                OvalSimpleValueCompareResult.SUCCESS;


        assert comparator.compare(null, null, OperationEnumeration.BITWISE_OR) ==
                OvalSimpleValueCompareResult.ERROR;
    }

}