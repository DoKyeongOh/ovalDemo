//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5_iosxe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.StateType;


/**
 * <p>anonymous complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.mitre.org/XMLSchema/oval-definitions-5}StateType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="ip_version" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe}EntityStateAccessListIPVersionType" minOccurs="0"/>
 *         &lt;element name="use" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe}EntityStateAccessListUseType" minOccurs="0"/>
 *         &lt;element name="used_in" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="interface_direction" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe}EntityStateAccessListInterfaceDirectionType" minOccurs="0"/>
 *         &lt;element name="acl_config_lines" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="config_line" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
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
    "ipVersion",
    "use",
    "usedIn",
    "interfaceDirection",
    "aclConfigLines",
    "configLine"
})
public class AclState
    extends StateType
{

    protected EntityStateStringType name;
    @XmlElement(name = "ip_version")
    protected EntityStateAccessListIPVersionType ipVersion;
    protected EntityStateAccessListUseType use;
    @XmlElement(name = "used_in")
    protected EntityStateStringType usedIn;
    @XmlElement(name = "interface_direction")
    protected EntityStateAccessListInterfaceDirectionType interfaceDirection;
    @XmlElement(name = "acl_config_lines")
    protected EntityStateStringType aclConfigLines;
    @XmlElement(name = "config_line")
    protected EntityStateStringType configLine;

    /**
     * name 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getName() {
        return name;
    }

    /**
     * name 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setName(EntityStateStringType value) {
        this.name = value;
    }

    /**
     * ipVersion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAccessListIPVersionType }
     *     
     */
    public EntityStateAccessListIPVersionType getIpVersion() {
        return ipVersion;
    }

    /**
     * ipVersion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAccessListIPVersionType }
     *     
     */
    public void setIpVersion(EntityStateAccessListIPVersionType value) {
        this.ipVersion = value;
    }

    /**
     * use 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAccessListUseType }
     *     
     */
    public EntityStateAccessListUseType getUse() {
        return use;
    }

    /**
     * use 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAccessListUseType }
     *     
     */
    public void setUse(EntityStateAccessListUseType value) {
        this.use = value;
    }

    /**
     * usedIn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getUsedIn() {
        return usedIn;
    }

    /**
     * usedIn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setUsedIn(EntityStateStringType value) {
        this.usedIn = value;
    }

    /**
     * interfaceDirection 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAccessListInterfaceDirectionType }
     *     
     */
    public EntityStateAccessListInterfaceDirectionType getInterfaceDirection() {
        return interfaceDirection;
    }

    /**
     * interfaceDirection 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAccessListInterfaceDirectionType }
     *     
     */
    public void setInterfaceDirection(EntityStateAccessListInterfaceDirectionType value) {
        this.interfaceDirection = value;
    }

    /**
     * aclConfigLines 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getAclConfigLines() {
        return aclConfigLines;
    }

    /**
     * aclConfigLines 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setAclConfigLines(EntityStateStringType value) {
        this.aclConfigLines = value;
    }

    /**
     * configLine 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getConfigLine() {
        return configLine;
    }

    /**
     * configLine 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setConfigLine(EntityStateStringType value) {
        this.configLine = value;
    }

}
