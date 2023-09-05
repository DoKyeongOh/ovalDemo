package org.example.oval.compare;

import org.mitre.oval.xmlschema.oval_common_5.OperationEnumeration;

public class OvalSimpleVersionComparator implements OvalSimpleValueComparator {
    @Override
    public OvalSimpleValueCompareResult compare(Object object, Object compare,
                                                OperationEnumeration operationEnumeration) {
        if (object == null || compare == null)
            return OvalSimpleValueCompareResult.ERROR;

        String version = object.toString();
        String compareVersion = compare.toString();
        boolean success = false;
        switch (operationEnumeration) {
            case EQUALS:
                success = isEquals(version, compareVersion);
                break;
            case NOT_EQUAL:
                success = !isEquals(version, compareVersion);
                break;
            case GREATER_THAN:
                success = isGraterThan(version, compareVersion, false);
                break;
            case LESS_THAN:
                success = isLessThan(version, compareVersion, false);
                break;
            case GREATER_THAN_OR_EQUAL:
                success = isGraterThan(version, compareVersion, true);
                break;
            case LESS_THAN_OR_EQUAL:
                success = isLessThan(version, compareVersion, true);
                break;
            default:
                return OvalSimpleValueCompareResult.ERROR;
        }
        if (success)
            return OvalSimpleValueCompareResult.SUCCESS;
        return OvalSimpleValueCompareResult.FAIL;
    }

    private boolean isEquals(String version, String compare) {
        String[] versionArr = version.split("\\D");
        String[] compareArr = compare.split("\\D");
        if (versionArr.length != compareArr.length)
            return false;
        int loopCount = versionArr.length > compareArr.length ? compareArr.length : versionArr.length;
        for (int i=0 ; i<loopCount ; i++)
            if (!versionArr[i].equals(compareArr[i]))
                return false;
        return true;
    }

    private boolean isGraterThan(String version, String compare, boolean containEqual) {
        String[] versionArr = version.split("\\D");
        String[] compareArr = compare.split("\\D");
        int loopCount = versionArr.length > compareArr.length ? compareArr.length : versionArr.length;
        for (int i=0 ; i<loopCount ; i++) {
            if (versionArr[i].isEmpty())
                return false;
            if (compareArr[i].isEmpty())
                return true;
            int versionNum = Integer.parseInt(versionArr[i]);
            int compareNum = Integer.parseInt(compareArr[i]);
            if (versionNum > compareNum)
                return true;
            if (versionNum < compareNum)
                return false;
        }
        if (containEqual && versionArr.length == compareArr.length)
            return true;
        if (versionArr.length > compareArr.length)
            return true;
        return false;
    }
    private boolean isLessThan(String version, String compare, boolean containEqual) {
        String[] versionArr = version.split("\\D");
        String[] compareArr = compare.split("\\D");
        int loopCount = versionArr.length > compareArr.length ? compareArr.length : versionArr.length;
        for (int i=0 ; i<loopCount ; i++) {
            if (compareArr[i].isEmpty())
                return false;
            if (versionArr[i].isEmpty())
                return true;
            int versionNum = Integer.parseInt(versionArr[i]);
            int compareNum = Integer.parseInt(compareArr[i]);
            if (versionNum < compareNum)
                return true;
            if (versionNum > compareNum)
                return false;
        }
        if (containEqual && versionArr.length == compareArr.length)
            return true;
        if (versionArr.length < compareArr.length)
            return true;
        return false;
    }

}
