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


/**
 * The EntityStateAnySimpleType type is extended by the entities of an individual OVAL State. This type provides uniformity to each state entity by including the attributes found in the EntityStateSimpleBaseType. This specific type describes any simple data.
 * 
 * <p>EntityStateAnySimpleType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="EntityStateAnySimpleType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntityStateSimpleBaseType">
 *       &lt;attribute name="datatype" type="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration" default="string" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityStateAnySimpleType")
@XmlSeeAlso({
    org.mitre.oval.xmlschema.oval_definitions_5_freebsd.PortinfoState.Version.class,
    org.mitre.oval.xmlschema.oval_definitions_5_hpux.SwlistState.Version.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.RoutingprotocolauthintfState.OspfArea.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.RouterState.OspfAuthenticationArea.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.InterfaceState.IpDirectedBroadcastCommand.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.InterfaceState.ProxyArpCommand.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.InterfaceState.ShutdownCommand.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.InterfaceState.SwitchportNativeVlan.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.InterfaceState.SwitchportAccessVlan.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.RouterState.OspfAuthenticationArea.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.InterfaceState.SwitchportNativeVlan.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.InterfaceState.SwitchportAccessVlan.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.RoutingprotocolauthintfState.OspfArea.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.RpminfoState.Epoch.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.RpminfoState.Release.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.RpminfoState.Version.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifypackageState.Epoch.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifypackageState.Version.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifypackageState.Release.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.SlackwarepkginfoState.Version.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.DpkginfoState.Epoch.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.DpkginfoState.Release.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.DpkginfoState.Version.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.DpkginfoState.Evr.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifyfileState.Epoch.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifyfileState.Version.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifyfileState.Release.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.PasswordState.UserId.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.PasswordState.GroupId.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.ShadowState.ChgLst.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.ShadowState.ChgAllow.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.ShadowState.ChgReq.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.ShadowState.ExpWarn.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.ShadowState.ExpInact.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.ShadowState.ExpDate.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.ShadowState.Flag.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.FileState.GroupId.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.FileState.UserId.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.FileState.ATime.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.FileState.CTime.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.FileState.MTime.class,
    org.mitre.oval.xmlschema.oval_definitions_5_windows.Process58State.Priority.class,
    org.mitre.oval.xmlschema.oval_definitions_5_windows.FileState.ProductVersion.class,
    org.mitre.oval.xmlschema.oval_definitions_5_windows.ProcessState.Priority.class
})
public class EntityStateAnySimpleType
    extends EntityStateSimpleBaseType
{


}
