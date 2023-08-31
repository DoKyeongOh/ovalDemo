package org.example.oval.test.impl;

import org.example.oval.OvalEntityMapping;
import org.example.oval.test.OvalTestExecutor;
import org.example.oval.test.OvalTestResultType;
import org.mitre.oval.xmlschema.oval_definitions_5.StateRefType;
import org.mitre.oval.xmlschema.oval_definitions_5.StateType;
import org.mitre.oval.xmlschema.oval_definitions_5.TestType;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.FamilyState;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.FamilyTest;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_independent.FamilyItem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FamilyTestExecutor implements OvalTestExecutor {
    private FamilyTest familyTest;

    private static final Set<String> unixes = new HashSet<>(Arrays.asList("unix", "linux", "macos", "solaris", "aix",
            "hp-ux", "freebsd", "openbsd", "netbsd", "irix", "tru64 unix", "digital unix", "unixware", "a/ux", "sunos",
            "xenix", "sco unix", "dynix/ptx", "ultrix", "unix system v", "nextstep", "haiku", "minix", "plan 9",
            "inferno", "dragonfly bsd", "hp mpe/ix", "tandem nsk", "qnx", "aros"));
    private static final Set<String> linuxes = new HashSet<>(Arrays.asList("linux", "ubuntu", "centos", "debian",
            "fedora", "red hat enterprise linux", "arch linux", "suse linux", "gentoo linux", "linux mint",
            "manjaro linux", "elementary os", "kali linux", "zorin os", "slackware linux", "opensuse", "mageia",
            "puppy linux", "alpine linux", "parrot os", "pclinuxos", "void linux", "solus", "clear linux",
            "sabayon linux", "knoppix", "lubuntu", "xubuntu", "linux lite", "blackarch linux"));

    public FamilyTestExecutor(TestType testType) {
        familyTest = (FamilyTest) testType;
    }

    @Override
    public OvalTestResultType execute(OvalEntityMapping ovalEntityMapping, List<ItemType> itemTypes) throws Exception {
        boolean success = true;
        if (!validateItem(itemTypes))
            return OvalTestResultType.UNKNOWN;
        FamilyItem familyItem = (FamilyItem) itemTypes.get(0);
        String familyItemValue = (String) familyItem.getFamily().getValue();
        for (StateRefType stateRefType : familyTest.getState()) {
            StateType inputState = ovalEntityMapping.getStateType(stateRefType.getStateRef());
            if (inputState == null)
                throw new Exception("input state not found. test id : " + familyTest.getId());
            FamilyState familyState = (FamilyState) inputState;
            String familyStateValue = (String) familyState.getFamily().getValue();
            if (familyStateValue == null || (familyStateValue != null && familyStateValue.isEmpty()))
                throw new Exception("input state is null. test id : " + familyTest.getId());
            switch (familyStateValue.toLowerCase()) {
                case "unix":
                    success = unixes.contains(familyItemValue) || linuxes.contains(familyItemValue);
                    break;
                case "windows":
                    success = familyItemValue.contains("windows");
                    break;
                default:
            }
        }
        switch (familyTest.getCheckExistence()) {
            case ALL_EXIST:
            case AT_LEAST_ONE_EXISTS:
            case ONLY_ONE_EXISTS:
            case ANY_EXIST:
                break;
            case NONE_EXIST:
                return OvalTestResultType.FALSE;
        }
        return success ? OvalTestResultType.TRUE : OvalTestResultType.FALSE;
    }

    private static boolean validateItem(List<ItemType> itemTypes) {
        if (itemTypes == null || (itemTypes != null && itemTypes.isEmpty()))
            return false;
        if (itemTypes.get(0) == null)
            return false;
        if (!itemTypes.get(0).getClass().equals(FamilyItem.class))
            return false;
        String familyItemValue = "";
        FamilyItem familyItem = (FamilyItem) itemTypes.get(0);
        if (familyItem.getFamily() == null)
            return false;
        familyItemValue = (String) familyItem.getFamily().getValue();
        if (familyItemValue == null || (familyItemValue != null && familyItemValue.isEmpty()))
            return false;
        return true;
    }
}
