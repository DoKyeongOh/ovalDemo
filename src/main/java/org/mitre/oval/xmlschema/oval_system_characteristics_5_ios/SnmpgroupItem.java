//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_ios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;


/**
 * <p>anonymous complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}ItemType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="version" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios}EntityItemSNMPVersionStringType" minOccurs="0"/>
 *         &lt;element name="snmpv3_sec_level" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios}EntityItemSNMPSecLevelStringType" minOccurs="0"/>
 *         &lt;element name="ipv4_acl" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="ipv6_acl" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="read_view" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="write_view" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="notify_view" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "version",
    "snmpv3SecLevel",
    "ipv4Acl",
    "ipv6Acl",
    "readView",
    "writeView",
    "notifyView"
})
public class SnmpgroupItem
    extends ItemType
{

    protected EntityItemStringType name;
    protected EntityItemSNMPVersionStringType version;
    @XmlElement(name = "snmpv3_sec_level")
    protected EntityItemSNMPSecLevelStringType snmpv3SecLevel;
    @XmlElement(name = "ipv4_acl")
    protected EntityItemStringType ipv4Acl;
    @XmlElement(name = "ipv6_acl")
    protected EntityItemStringType ipv6Acl;
    @XmlElement(name = "read_view")
    protected EntityItemStringType readView;
    @XmlElement(name = "write_view")
    protected EntityItemStringType writeView;
    @XmlElement(name = "notify_view")
    protected EntityItemStringType notifyView;

    /**
     * name 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getName() {
        return name;
    }

    /**
     * name 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setName(EntityItemStringType value) {
        this.name = value;
    }

    /**
     * version 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemSNMPVersionStringType }
     *     
     */
    public EntityItemSNMPVersionStringType getVersion() {
        return version;
    }

    /**
     * version 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemSNMPVersionStringType }
     *     
     */
    public void setVersion(EntityItemSNMPVersionStringType value) {
        this.version = value;
    }

    /**
     * snmpv3SecLevel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemSNMPSecLevelStringType }
     *     
     */
    public EntityItemSNMPSecLevelStringType getSnmpv3SecLevel() {
        return snmpv3SecLevel;
    }

    /**
     * snmpv3SecLevel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemSNMPSecLevelStringType }
     *     
     */
    public void setSnmpv3SecLevel(EntityItemSNMPSecLevelStringType value) {
        this.snmpv3SecLevel = value;
    }

    /**
     * ipv4Acl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getIpv4Acl() {
        return ipv4Acl;
    }

    /**
     * ipv4Acl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setIpv4Acl(EntityItemStringType value) {
        this.ipv4Acl = value;
    }

    /**
     * ipv6Acl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getIpv6Acl() {
        return ipv6Acl;
    }

    /**
     * ipv6Acl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setIpv6Acl(EntityItemStringType value) {
        this.ipv6Acl = value;
    }

    /**
     * readView 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getReadView() {
        return readView;
    }

    /**
     * readView 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setReadView(EntityItemStringType value) {
        this.readView = value;
    }

    /**
     * writeView 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getWriteView() {
        return writeView;
    }

    /**
     * writeView 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setWriteView(EntityItemStringType value) {
        this.writeView = value;
    }

    /**
     * notifyView 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getNotifyView() {
        return notifyView;
    }

    /**
     * notifyView 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setNotifyView(EntityItemStringType value) {
        this.notifyView = value;
    }

}
