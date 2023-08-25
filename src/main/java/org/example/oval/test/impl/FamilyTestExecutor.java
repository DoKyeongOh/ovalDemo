package org.example.oval.test.impl;

import org.example.oval.test.OvalTestExecutor;
import org.example.oval.test.OvalTestResultType;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5.StateRefType;
import org.mitre.oval.xmlschema.oval_definitions_5.StateType;
import org.mitre.oval.xmlschema.oval_definitions_5.TestType;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.EntityStateFamilyType;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.FamilyObject;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.FamilyState;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.FamilyTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Map;

public class FamilyTestExecutor extends OvalTestExecutor {

    private List<FamilyState> stateTypeList;
    private FamilyObject objectType;
    private static final Set<String> unixes = new HashSet<>(Arrays.asList("unix", "linux", "macos", "solaris", "aix", "hp-ux", "freebsd", "openbsd",
            "netbsd", "irix", "tru64 unix", "digital unix", "unixware", "a/ux", "sunos", "xenix", "sco unix",
            "dynix/ptx", "ultrix", "unix system v", "nextstep", "haiku", "minix", "plan 9", "inferno", "dragonfly bsd",
            "hp mpe/ix", "tandem nsk", "qnx", "aros"));
    private static final Set<String> linuxes = new HashSet<>(Arrays.asList("linux", "ubuntu", "centos", "debian", "fedora",
            "red hat enterprise linux", "arch linux", "suse linux", "gentoo linux", "linux mint", "manjaro linux",
            "elementary os", "kali linux", "zorin os", "slackware linux", "opensuse", "mageia", "puppy linux",
            "alpine linux", "parrot os", "pclinuxos", "void linux", "solus", "clear linux", "sabayon linux", "knoppix",
            "lubuntu", "xubuntu", "linux lite", "blackarch linux"));

    public FamilyTestExecutor(TestType testType) {
        super(testType);
    }

    @Override
    public void init(Map<String, StateType> stateTypeMap, Map<String, ObjectType> objectTypeMap) throws Exception {
        FamilyTest familyTest = (FamilyTest) testType;
        stateTypeList = new ArrayList<>();
        for (StateRefType stateRefType : ((FamilyTest) testType).getState()) {
            StateType inputState = stateTypeMap.get(stateRefType.getStateRef());
            if (inputState == null)
                throw new Exception("input family state is null. test id : " + testType.getId());
            if (!inputState.getClass().equals(FamilyState.class))
                throw new Exception("input family state is not family_state. test id : " + testType.getId());
            stateTypeList.add((FamilyState) inputState);
        }
        ObjectType inputObject = objectTypeMap.get(familyTest.getObject().getObjectRef());
        if (inputObject == null)
            throw new Exception("input family object is not null. test id : " + testType.getId());
        if (!inputObject.getClass().equals(FamilyObject.class))
            throw new Exception("input family object is not family_object. test id : " + testType.getId());
        objectType = (FamilyObject) objectTypeMap.get(familyTest.getObject().getObjectRef());
    }

    @Override
    public OvalTestResultType execute() throws Exception {
        int trueCount = 0;
        int falseCount = 0;
        String osName = System.getProperty("os.name").toLowerCase();
        for (FamilyState familyState : stateTypeList) {
            if (familyState.getFamily() == null || familyState.getFamily().getValue() == null)
                throw new Exception("input family state's family element is null. test id : " + testType.getId());

            String family = (String) familyState.getFamily().getValue();
            switch (family.toLowerCase()) {
                case "unix":
                    trueCount += unixes.contains(osName) || linuxes.contains(osName) ? 1 : 0;
                    falseCount += unixes.contains(osName) || linuxes.contains(osName) ? 0 : 1;
                    break;
                case "windows":
                    trueCount += osName.contains("windows") ? 1 : 0;
                    break;
                default:
            }
        }
        switch (testType.getCheckExistence()) { // family test's exist item is only one.
            case ALL_EXIST:
            case ANY_EXIST:
            case AT_LEAST_ONE_EXISTS:
            case ONLY_ONE_EXISTS:
                break;
            case NONE_EXIST:
                return OvalTestResultType.FALSE;
        }
        if (falseCount > 0)
            return OvalTestResultType.FALSE;
        if (trueCount > 0)
            return OvalTestResultType.TRUE;
        return OvalTestResultType.UNKNOWN;
    }
}
