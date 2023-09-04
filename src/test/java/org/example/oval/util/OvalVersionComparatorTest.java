package org.example.oval.util;

import org.junit.Test;

public class OvalVersionComparatorTest {

    @Test
    public void testEquals() {
        String version = null;
        String compare = null;
        assert !OvalVersionComparator.isEquals(version, compare);

        version = "";
        compare = "";
        assert OvalVersionComparator.isEquals(version, compare);

        version = "1";
        compare = "";
        assert !OvalVersionComparator.isEquals(version, compare);

        version = "1.1";
        compare = "1";
        assert !OvalVersionComparator.isEquals(version, compare);

        version = "1.12,343";
        compare = "1.12,343";
        assert OvalVersionComparator.isEquals(version, compare);
    }

    @Test
    public void testGraterThan() {
        String version = null;
        String compare = null;
        assert !OvalVersionComparator.isGraterThan(version, compare, false);

        version = "";
        compare = "";
        assert !OvalVersionComparator.isGraterThan(version, compare, false);

        version = "1";
        compare = "";
        assert !OvalVersionComparator.isGraterThan(version, compare, false);

        version = "1.1";
        compare = "1";
        assert OvalVersionComparator.isGraterThan(version, compare, false);

        version = "1.12,343";
        compare = "1.12,343";
        assert OvalVersionComparator.isGraterThan(version, compare, false);
    }

}