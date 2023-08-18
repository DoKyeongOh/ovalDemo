//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The EntityItemAnySimpleType type is extended by the entities of an individual item. This type provides uniformity to each entity by including the attributes found in the EntityItemSimpleBaseType. This specific type describes any simple data.
 * 
 * <p>EntityItemAnySimpleType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="EntityItemAnySimpleType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-system-characteristics-5>EntityItemSimpleBaseType">
 *       &lt;attribute name="datatype" type="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration" default="string" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityItemAnySimpleType")
@XmlSeeAlso({
    org.mitre.oval.xmlschema.oval_system_characteristics_5_freebsd.PortinfoItem.Version.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_hpux.SwlistItem.Version.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.RouterItem.OspfAuthenticationArea.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.RoutingprotocolauthintfItem.OspfArea.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.InterfaceItem.IpDirectedBroadcastCommand.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.InterfaceItem.ProxyArpCommand.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.InterfaceItem.ShutdownCommand.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.InterfaceItem.SwitchportNativeVlan.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.InterfaceItem.SwitchportAccessVlan.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.RouterItem.OspfAuthenticationArea.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.RoutingprotocolauthintfItem.OspfArea.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.InterfaceItem.SwitchportNativeVlan.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.InterfaceItem.SwitchportAccessVlan.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.RpmverifypackageItem.Epoch.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.RpmverifypackageItem.Version.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.RpmverifypackageItem.Release.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.RpminfoItem.Epoch.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.RpminfoItem.Release.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.RpminfoItem.Version.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.DpkginfoItem.Epoch.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.DpkginfoItem.Release.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.DpkginfoItem.Version.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.DpkginfoItem.Evr.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.RpmverifyfileItem.Epoch.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.RpmverifyfileItem.Version.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.RpmverifyfileItem.Release.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.SlackwarepkginfoItem.Version.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.FileItem.GroupId.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.FileItem.UserId.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.FileItem.ATime.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.FileItem.CTime.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.FileItem.MTime.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.PasswordItem.UserId.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.PasswordItem.GroupId.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.ShadowItem.ChgLst.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.ShadowItem.ChgAllow.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.ShadowItem.ChgReq.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.ShadowItem.ExpWarn.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.ShadowItem.ExpInact.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.ShadowItem.ExpDate.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.ShadowItem.Flag.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.ProcessItem.Priority.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.FileItem.ProductVersion.class
})
public class EntityItemAnySimpleType
    extends EntityItemSimpleBaseType
{


}
