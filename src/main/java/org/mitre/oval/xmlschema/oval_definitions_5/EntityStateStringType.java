//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5_aix.EntityStateFilesetStateType;
import org.mitre.oval.xmlschema.oval_definitions_5_aix.EntityStateFixInstallationStatusType;
import org.mitre.oval.xmlschema.oval_definitions_5_aix.EntityStateInterimFixStateType;
import org.mitre.oval.xmlschema.oval_definitions_5_android.EntityStateEncryptionStatusType;
import org.mitre.oval.xmlschema.oval_definitions_5_android.EntityStateKeyguardDisabledFeaturesType;
import org.mitre.oval.xmlschema.oval_definitions_5_android.EntityStateNetworkType;
import org.mitre.oval.xmlschema.oval_definitions_5_android.EntityStatePasswordQualityType;
import org.mitre.oval.xmlschema.oval_definitions_5_android.EntityStateWifiAuthAlgorithmType;
import org.mitre.oval.xmlschema.oval_definitions_5_android.EntityStateWifiCurrentStatusType;
import org.mitre.oval.xmlschema.oval_definitions_5_android.EntityStateWifiGroupCipherType;
import org.mitre.oval.xmlschema.oval_definitions_5_android.EntityStateWifiKeyMgmtType;
import org.mitre.oval.xmlschema.oval_definitions_5_android.EntityStateWifiPairwiseCipherType;
import org.mitre.oval.xmlschema.oval_definitions_5_android.EntityStateWifiProtocolType;
import org.mitre.oval.xmlschema.oval_definitions_5_asa.EntityStateApplyServicePolicyType;
import org.mitre.oval.xmlschema.oval_definitions_5_asa.EntityStateClassMapType;
import org.mitre.oval.xmlschema.oval_definitions_5_asa.EntityStateInspectionType;
import org.mitre.oval.xmlschema.oval_definitions_5_asa.EntityStateMatchType;
import org.mitre.oval.xmlschema.oval_definitions_5_esx.EntityStateClassificationType;
import org.mitre.oval.xmlschema.oval_definitions_5_esx.EntityStateSupportLevelType;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.EntityStateEngineType;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.EntityStateFamilyType;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.EntityStateHashTypeType;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.EntityStateLdaptypeType;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.EntityStateVariableRefType;
import org.mitre.oval.xmlschema.oval_definitions_5_ios.EntityStateTrainIdentifierType;
import org.mitre.oval.xmlschema.oval_definitions_5_junos.EntityStateJunosReleaseTypeType;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.EntityStateRpmVerifyResultType;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.EntityStatePlistTypeType;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.EntityStateEventSeverityType;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.EntityStatePolicyFeatureStateType;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.EntityStatePolicyRoleType;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.EntityStateTraceSeverityType;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.EntityStateUrlZoneType;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.EntityStateClientUUIDType;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.EntityStateLDOMRoleType;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.EntityStatePublisherTypeType;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.EntityStateSmfServiceStateType;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.EntityStateV12NEnvType;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.EntityStateCapabilityType;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.EntityStateEncryptMethodType;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.EntityStateEndpointType;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.EntityStateGconfTypeType;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.EntityStateInterfaceType;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.EntityStateRoutingTableFlagsType;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.EntityStateWaitStatusType;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.EntityStateXinetdTypeStatusType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.EntityStateAddrTypeType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.EntityStateAdstypeType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.EntityStateAuditType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.EntityStateCmdletVerbType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.EntityStateDriveTypeType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.EntityStateFileAttributeType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.EntityStateFileTypeType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.EntityStateGUIDType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.EntityStateInterfaceTypeType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.EntityStateNTUserAccountTypeType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.EntityStateNamingContextType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.EntityStatePeSubsystemType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.EntityStatePeTargetMachineType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.EntityStateRegistryHiveType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.EntityStateRegistryTypeType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.EntityStateServiceControlsAcceptedType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.EntityStateServiceCurrentStateType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.EntityStateServiceStartTypeType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.EntityStateServiceTypeType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.EntityStateSharedResourceTypeType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.EntityStateSystemMetricIndexType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.EntityStateUserRightType;


/**
 * The EntityStateStringType type is extended by the entities of an individual OVAL State. This type provides uniformity to each state entity by including the attributes found in the EntityStateSimpleBaseType. This specific type describes simple string data.
 * 
 * <p>EntityStateStringType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="EntityStateStringType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntityStateSimpleBaseType">
 *       &lt;attribute name="datatype" type="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration" fixed="string" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityStateStringType")
@XmlSeeAlso({
    EntityStateFixInstallationStatusType.class,
    EntityStateInterimFixStateType.class,
    EntityStateFilesetStateType.class,
    EntityStateWifiAuthAlgorithmType.class,
    EntityStateWifiKeyMgmtType.class,
    EntityStateKeyguardDisabledFeaturesType.class,
    EntityStateWifiProtocolType.class,
    EntityStateEncryptionStatusType.class,
    EntityStateWifiGroupCipherType.class,
    EntityStateNetworkType.class,
    EntityStatePasswordQualityType.class,
    EntityStateWifiCurrentStatusType.class,
    EntityStateWifiPairwiseCipherType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_asa.EntityStateSNMPVersionStringType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_asa.EntityStateSNMPAuthStringType.class,
    EntityStateInspectionType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_asa.EntityStateSNMPPrivStringType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_asa.EntityStateAccessListInterfaceDirectionType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_asa.EntityStateSNMPSecLevelStringType.class,
    EntityStateMatchType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_asa.EntityStateAccessListUseType.class,
    EntityStateClassMapType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_asa.EntityStateAccessListIPVersionType.class,
    EntityStateApplyServicePolicyType.class,
    EntityStateSupportLevelType.class,
    EntityStateClassificationType.class,
    EntityStateHashTypeType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_independent.EntityStateWindowsViewType.class,
    EntityStateFamilyType.class,
    EntityStateVariableRefType.class,
    EntityStateEngineType.class,
    EntityStateLdaptypeType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.EntityStateRoutingProtocolType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.EntityStateSNMPModeStringType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.EntityStateSNMPPrivStringType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.EntityStateSNMPSecLevelStringType.class,
    EntityStateTrainIdentifierType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.EntityStateAccessListUseType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.EntityStateRoutingAuthTypeStringType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.EntityStateSwitchportModeType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.EntityStateSNMPVersionStringType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.EntityStateSNMPAuthStringType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.EntityStateAccessListInterfaceDirectionType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.EntityStateTrunkEncapType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.EntityStateAccessListIPVersionType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.EntityStateRoutingProtocolType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.EntityStateSNMPModeStringType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.EntityStateSNMPPrivStringType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.EntityStateSNMPSecLevelStringType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.EntityStateAccessListUseType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.EntityStateSwitchportModeType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.EntityStateRoutingAuthTypeStringType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.EntityStateSNMPVersionStringType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.EntityStateSNMPAuthStringType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.EntityStateAccessListInterfaceDirectionType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.EntityStateTrunkEncapType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.EntityStateAccessListIPVersionType.class,
    EntityStateJunosReleaseTypeType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.EntityStateProtocolType.class,
    EntityStateRpmVerifyResultType.class,
    EntityStatePlistTypeType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_macos.EntityStatePermissionCompareType.class,
    EntityStateEventSeverityType.class,
    EntityStatePolicyRoleType.class,
    EntityStateTraceSeverityType.class,
    EntityStateUrlZoneType.class,
    EntityStatePolicyFeatureStateType.class,
    EntityStateSmfServiceStateType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_solaris.EntityStatePermissionCompareType.class,
    EntityStateClientUUIDType.class,
    EntityStateLDOMRoleType.class,
    EntityStatePublisherTypeType.class,
    EntityStateV12NEnvType.class,
    EntityStateCapabilityType.class,
    EntityStateInterfaceType.class,
    EntityStateEncryptMethodType.class,
    EntityStateWaitStatusType.class,
    EntityStateGconfTypeType.class,
    EntityStateXinetdTypeStatusType.class,
    EntityStateEndpointType.class,
    EntityStateRoutingTableFlagsType.class,
    EntityStateRegistryTypeType.class,
    EntityStateAuditType.class,
    EntityStateFileTypeType.class,
    EntityStateDriveTypeType.class,
    EntityStateInterfaceTypeType.class,
    EntityStateServiceControlsAcceptedType.class,
    EntityStateUserRightType.class,
    EntityStateNTUserAccountTypeType.class,
    EntityStateRegistryHiveType.class,
    EntityStateServiceStartTypeType.class,
    EntityStateServiceCurrentStateType.class,
    EntityStateAddrTypeType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_windows.EntityStateWindowsViewType.class,
    EntityStateAdstypeType.class,
    EntityStateCmdletVerbType.class,
    EntityStateFileAttributeType.class,
    EntityStateGUIDType.class,
    EntityStatePeTargetMachineType.class,
    EntityStateNamingContextType.class,
    EntityStateServiceTypeType.class,
    EntityStateSharedResourceTypeType.class,
    EntityStateSystemMetricIndexType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_windows.EntityStateProtocolType.class,
    EntityStatePeSubsystemType.class
})
public class EntityStateStringType
    extends EntityStateSimpleBaseType
{


}
