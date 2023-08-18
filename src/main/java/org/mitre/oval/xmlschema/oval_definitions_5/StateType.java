//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_common_5.NotesType;
import org.mitre.oval.xmlschema.oval_common_5.OperatorEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5_aix.FilesetState;
import org.mitre.oval.xmlschema.oval_definitions_5_aix.FixState;
import org.mitre.oval.xmlschema.oval_definitions_5_aix.InterimFixState;
import org.mitre.oval.xmlschema.oval_definitions_5_aix.NoState;
import org.mitre.oval.xmlschema.oval_definitions_5_aix.OslevelState;
import org.mitre.oval.xmlschema.oval_definitions_5_android.AppmanagerState;
import org.mitre.oval.xmlschema.oval_definitions_5_android.BluetoothState;
import org.mitre.oval.xmlschema.oval_definitions_5_android.CameraState;
import org.mitre.oval.xmlschema.oval_definitions_5_android.CertificateState;
import org.mitre.oval.xmlschema.oval_definitions_5_android.DevicesettingsState;
import org.mitre.oval.xmlschema.oval_definitions_5_android.EncryptionState;
import org.mitre.oval.xmlschema.oval_definitions_5_android.LocationserviceState;
import org.mitre.oval.xmlschema.oval_definitions_5_android.NetworkState;
import org.mitre.oval.xmlschema.oval_definitions_5_android.SystemdetailsState;
import org.mitre.oval.xmlschema.oval_definitions_5_android.TelephonyState;
import org.mitre.oval.xmlschema.oval_definitions_5_android.WifiState;
import org.mitre.oval.xmlschema.oval_definitions_5_android.WifinetworkState;
import org.mitre.oval.xmlschema.oval_definitions_5_apache.HttpdState;
import org.mitre.oval.xmlschema.oval_definitions_5_apple_ios.GlobalrestrictionsState;
import org.mitre.oval.xmlschema.oval_definitions_5_apple_ios.PasscodepolicyState;
import org.mitre.oval.xmlschema.oval_definitions_5_apple_ios.ProfileState;
import org.mitre.oval.xmlschema.oval_definitions_5_asa.ClassMapState;
import org.mitre.oval.xmlschema.oval_definitions_5_asa.PolicyMapState;
import org.mitre.oval.xmlschema.oval_definitions_5_asa.ServicePolicyState;
import org.mitre.oval.xmlschema.oval_definitions_5_asa.SnmpGroupState;
import org.mitre.oval.xmlschema.oval_definitions_5_asa.SnmpHostState;
import org.mitre.oval.xmlschema.oval_definitions_5_asa.SnmpUserState;
import org.mitre.oval.xmlschema.oval_definitions_5_asa.TcpMapState;
import org.mitre.oval.xmlschema.oval_definitions_5_catos.ModuleState;
import org.mitre.oval.xmlschema.oval_definitions_5_esx.Patch56State;
import org.mitre.oval.xmlschema.oval_definitions_5_esx.VisdkmanagedobjectState;
import org.mitre.oval.xmlschema.oval_definitions_5_freebsd.PortinfoState;
import org.mitre.oval.xmlschema.oval_definitions_5_hpux.GetconfState;
import org.mitre.oval.xmlschema.oval_definitions_5_hpux.Patch53State;
import org.mitre.oval.xmlschema.oval_definitions_5_hpux.SwlistState;
import org.mitre.oval.xmlschema.oval_definitions_5_hpux.TrustedState;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.Environmentvariable58State;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.EnvironmentvariableState;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.FamilyState;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.Filehash58State;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.FilehashState;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.Ldap57State;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.LdapState;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.Sql57State;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.SqlState;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.Textfilecontent54State;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.TextfilecontentState;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.VariableState;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.XmlfilecontentState;
import org.mitre.oval.xmlschema.oval_definitions_5_ios.SnmpState;
import org.mitre.oval.xmlschema.oval_definitions_5_ios.TclshState;
import org.mitre.oval.xmlschema.oval_definitions_5_junos.ShowState;
import org.mitre.oval.xmlschema.oval_definitions_5_junos.XmlConfigState;
import org.mitre.oval.xmlschema.oval_definitions_5_junos.XmlShowState;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.ApparmorstatusState;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.DpkginfoState;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.IflistenersState;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.PartitionState;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.RpminfoState;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifyState;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifyfileState;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifypackageState;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.SelinuxbooleanState;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.SelinuxsecuritycontextState;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.SlackwarepkginfoState;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.SystemdunitdependencyState;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.SystemdunitpropertyState;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.AccountinfoState;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.AuthorizationdbState;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.CorestorageState;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.DiskutilState;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.GatekeeperState;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.Inetlisteningserver510State;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.KeychainState;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.LaunchdState;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.NvramState;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.Plist510State;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.Plist511State;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.PlistState;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.Pwpolicy59State;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.PwpolicyState;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.RlimitState;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.SoftwareupdateState;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.SystemprofilerState;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.SystemsetupState;
import org.mitre.oval.xmlschema.oval_definitions_5_netconf.ConfigState;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.BestbetState;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.InfopolicycollState;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpantivirussettingsState;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpcrawlruleState;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpdiagnosticslevelState;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpdiagnosticsserviceState;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpgroupState;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.Spjobdefinition510State;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpjobdefinitionState;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SplistState;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SppolicyState;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SppolicyfeatureState;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpsiteState;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpsiteadministrationState;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpwebState;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpwebapplicationState;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.FacetState;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.ImageState;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.IsainfoState;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.Package511State;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.PackageState;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.PackageavoidlistState;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.PackagecheckState;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.PackagefreezelistState;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.PackagepublisherState;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.SmfState;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.SmfpropertyState;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.VariantState;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.VirtualizationinfoState;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.FileextendedattributeState;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.GconfState;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.InetdState;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.RoutingtableState;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.RunlevelState;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.SccsState;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.ShadowState;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.SymlinkState;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.SysctlState;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.UnameState;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.XinetdState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.AccesstokenState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.Activedirectory57State;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.ActivedirectoryState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.AuditeventpolicyState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.AuditeventpolicysubcategoriesState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.CmdletState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.Fileauditedpermissions53State;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileauditedpermissionsState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.Fileeffectiverights53State;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileeffectiverightsState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.GroupSidState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.GroupState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.JunctionState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.LicenseState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.LockoutpolicyState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.MetabaseState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.NtuserState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.PasswordpolicyState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.PeheaderState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.PortState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.PrintereffectiverightsState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.RegistryState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.Regkeyauditedpermissions53State;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.RegkeyauditedpermissionsState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.Regkeyeffectiverights53State;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.RegkeyeffectiverightsState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.ServiceState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.ServiceeffectiverightsState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.SharedresourceState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.SharedresourceauditedpermissionsState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.SharedresourceeffectiverightsState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.SidSidState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.SidState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.SystemmetricState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.UacState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.UserSid55State;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.UserSidState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.UserState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.UserrightState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.VolumeState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.Wmi57State;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.WmiState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.WuaupdatesearcherState;
import org.w3._2000._09.xmldsig_.SignatureType;


/**
 * When evaluating a particular state against an object, one should evaluate each individual entity separately. The individual results are then combined by the operator to produce an overall result. This process holds true even when there are multiple instances of the same entity. Evaluate each instance separately, taking the entity check attribute into account, and then combine everything using the operator.
 * 
 * <p>StateType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="StateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/>
 *         &lt;element ref="{http://oval.mitre.org/XMLSchema/oval-common-5}notes" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://oval.mitre.org/XMLSchema/oval-common-5}StateIDPattern" />
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="operator" type="{http://oval.mitre.org/XMLSchema/oval-common-5}OperatorEnumeration" default="AND" />
 *       &lt;attribute name="comment" type="{http://oval.mitre.org/XMLSchema/oval-common-5}NonEmptyStringType" />
 *       &lt;attribute name="deprecated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StateType", propOrder = {
    "signature",
    "notes"
})
@XmlSeeAlso({
    InterimFixState.class,
    FilesetState.class,
    OslevelState.class,
    NoState.class,
    FixState.class,
    SystemdetailsState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_android.PasswordState.class,
    EncryptionState.class,
    LocationserviceState.class,
    WifinetworkState.class,
    BluetoothState.class,
    WifiState.class,
    DevicesettingsState.class,
    AppmanagerState.class,
    CertificateState.class,
    NetworkState.class,
    CameraState.class,
    TelephonyState.class,
    HttpdState.class,
    GlobalrestrictionsState.class,
    PasscodepolicyState.class,
    ProfileState.class,
    PolicyMapState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_asa.LineState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_asa.InterfaceState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_asa.AclState.class,
    ClassMapState.class,
    TcpMapState.class,
    SnmpUserState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_asa.VersionState.class,
    ServicePolicyState.class,
    SnmpHostState.class,
    SnmpGroupState.class,
    ModuleState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_catos.VersionState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_catos.Version55State.class,
    org.mitre.oval.xmlschema.oval_definitions_5_catos.LineState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_esx.VersionState.class,
    VisdkmanagedobjectState.class,
    Patch56State.class,
    org.mitre.oval.xmlschema.oval_definitions_5_esx.PatchState.class,
    PortinfoState.class,
    Patch53State.class,
    TrustedState.class,
    GetconfState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_hpux.NddState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_hpux.PatchState.class,
    SwlistState.class,
    Sql57State.class,
    VariableState.class,
    FamilyState.class,
    SqlState.class,
    LdapState.class,
    Ldap57State.class,
    EnvironmentvariableState.class,
    XmlfilecontentState.class,
    Filehash58State.class,
    TextfilecontentState.class,
    Environmentvariable58State.class,
    Textfilecontent54State.class,
    FilehashState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.RoutingprotocolauthintfState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.SnmpuserState.class,
    TclshState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.SnmpviewState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.SnmphostState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.SectionState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.RouterState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.SnmpcommunityState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.Version55State.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.LineState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.InterfaceState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.AclState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.SnmpgroupState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.BgpneighborState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.GlobalState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.VersionState.class,
    SnmpState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.SectionState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.RouterState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.SnmpcommunityState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.LineState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.InterfaceState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.AclState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.RoutingprotocolauthintfState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.SnmpgroupState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.BgpneighborState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.SnmpuserState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.GlobalState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.VersionState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.SnmpviewState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.SnmphostState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_junos.VersionState.class,
    ShowState.class,
    XmlConfigState.class,
    XmlShowState.class,
    PartitionState.class,
    IflistenersState.class,
    RpminfoState.class,
    RpmverifypackageState.class,
    SystemdunitdependencyState.class,
    SelinuxbooleanState.class,
    SlackwarepkginfoState.class,
    DpkginfoState.class,
    SelinuxsecuritycontextState.class,
    RpmverifyState.class,
    ApparmorstatusState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.InetlisteningserversState.class,
    RpmverifyfileState.class,
    SystemdunitpropertyState.class,
    Pwpolicy59State.class,
    DiskutilState.class,
    SystemprofilerState.class,
    PlistState.class,
    Plist510State.class,
    GatekeeperState.class,
    PwpolicyState.class,
    AuthorizationdbState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_macos.InetlisteningserversState.class,
    Plist511State.class,
    SoftwareupdateState.class,
    Inetlisteningserver510State.class,
    LaunchdState.class,
    KeychainState.class,
    SystemsetupState.class,
    CorestorageState.class,
    NvramState.class,
    AccountinfoState.class,
    RlimitState.class,
    ConfigState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_pixos.VersionState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_pixos.LineState.class,
    SpwebapplicationState.class,
    SplistState.class,
    Spjobdefinition510State.class,
    SpcrawlruleState.class,
    SppolicyState.class,
    SpdiagnosticsserviceState.class,
    SpgroupState.class,
    SpjobdefinitionState.class,
    InfopolicycollState.class,
    SpsiteState.class,
    SpdiagnosticslevelState.class,
    SpwebState.class,
    SppolicyfeatureState.class,
    SpantivirussettingsState.class,
    SpsiteadministrationState.class,
    BestbetState.class,
    VariantState.class,
    PackagepublisherState.class,
    PackagefreezelistState.class,
    PackageState.class,
    IsainfoState.class,
    SmfState.class,
    PackageavoidlistState.class,
    Package511State.class,
    VirtualizationinfoState.class,
    SmfpropertyState.class,
    FacetState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_solaris.NddState.class,
    PackagecheckState.class,
    ImageState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_solaris.PatchState.class,
    FileextendedattributeState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.PasswordState.class,
    InetdState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.DnscacheState.class,
    ShadowState.class,
    RunlevelState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.Process58State.class,
    UnameState.class,
    SccsState.class,
    RoutingtableState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.InterfaceState.class,
    XinetdState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.FileState.class,
    GconfState.class,
    SysctlState.class,
    SymlinkState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.ProcessState.class,
    CmdletState.class,
    UserSid55State.class,
    Activedirectory57State.class,
    LockoutpolicyState.class,
    GroupSidState.class,
    NtuserState.class,
    Regkeyeffectiverights53State.class,
    SharedresourceeffectiverightsState.class,
    RegkeyauditedpermissionsState.class,
    SystemmetricState.class,
    SidState.class,
    UserState.class,
    SidSidState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_windows.InterfaceState.class,
    PortState.class,
    WmiState.class,
    ServiceeffectiverightsState.class,
    Fileeffectiverights53State.class,
    PeheaderState.class,
    Wmi57State.class,
    RegistryState.class,
    UserSidState.class,
    GroupState.class,
    VolumeState.class,
    Regkeyauditedpermissions53State.class,
    LicenseState.class,
    SharedresourceauditedpermissionsState.class,
    MetabaseState.class,
    AuditeventpolicyState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_windows.DnscacheState.class,
    UserrightState.class,
    WuaupdatesearcherState.class,
    AccesstokenState.class,
    Fileauditedpermissions53State.class,
    org.mitre.oval.xmlschema.oval_definitions_5_windows.Process58State.class,
    FileeffectiverightsState.class,
    ServiceState.class,
    PasswordpolicyState.class,
    AuditeventpolicysubcategoriesState.class,
    ActivedirectoryState.class,
    SharedresourceState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_windows.FileState.class,
    UacState.class,
    RegkeyeffectiverightsState.class,
    PrintereffectiverightsState.class,
    JunctionState.class,
    FileauditedpermissionsState.class,
    org.mitre.oval.xmlschema.oval_definitions_5_windows.ProcessState.class
})
public class StateType {

    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected SignatureType signature;
    @XmlElementRef(name = "notes", namespace = "http://oval.mitre.org/XMLSchema/oval-common-5", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends NotesType> notes;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "version", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger version;
    @XmlAttribute(name = "operator")
    protected OperatorEnumeration operator;
    @XmlAttribute(name = "comment")
    protected String comment;
    @XmlAttribute(name = "deprecated")
    protected Boolean deprecated;

    /**
     * signature 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * signature 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

    /**
     * notes 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Notes }{@code >}
     *     {@link JAXBElement }{@code <}{@link NotesType }{@code >}
     *     
     */
    public JAXBElement<? extends NotesType> getNotes() {
        return notes;
    }

    /**
     * notes 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Notes }{@code >}
     *     {@link JAXBElement }{@code <}{@link NotesType }{@code >}
     *     
     */
    public void setNotes(JAXBElement<? extends NotesType> value) {
        this.notes = value;
    }

    /**
     * id 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * id 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * version 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersion() {
        return version;
    }

    /**
     * version 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVersion(BigInteger value) {
        this.version = value;
    }

    /**
     * operator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OperatorEnumeration }
     *     
     */
    public OperatorEnumeration getOperator() {
        if (operator == null) {
            return OperatorEnumeration.AND;
        } else {
            return operator;
        }
    }

    /**
     * operator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorEnumeration }
     *     
     */
    public void setOperator(OperatorEnumeration value) {
        this.operator = value;
    }

    /**
     * comment 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * comment 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * deprecated 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDeprecated() {
        if (deprecated == null) {
            return false;
        } else {
            return deprecated;
        }
    }

    /**
     * deprecated 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeprecated(Boolean value) {
        this.deprecated = value;
    }

}
