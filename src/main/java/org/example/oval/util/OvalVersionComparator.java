package org.example.oval.util;

public class OvalVersionComparator {

    public static boolean isEquals(String version, String compare) {
        if (version == null || compare == null)
            return false;
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

    public static boolean isGraterThan(String version, String compare, boolean containEqual) {
        if (version == null || compare == null)
            return false;
        String[] versionArr = version.split("\\D");
        String[] compareArr = compare.split("\\D");
        int loopCount = versionArr.length > compareArr.length ? compareArr.length : versionArr.length;
        for (int i=0 ; i<loopCount ; i++) {
            if (versionArr[i].isEmpty() || compareArr[i].isEmpty())
                return false;
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
    public static boolean isLessThan(String version, String compare, boolean containEqual) {
        if (version == null || compare == null)
            return false;
        String[] versionArr = version.split("\\D");
        String[] compareArr = compare.split("\\D");
        int loopCount = versionArr.length > compareArr.length ? compareArr.length : versionArr.length;
        for (int i=0 ; i<loopCount ; i++) {
            if (versionArr[i].isEmpty() || compareArr[i].isEmpty())
                return false;
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
