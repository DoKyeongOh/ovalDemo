//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5_ios;

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
 *         &lt;element name="view" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="mode" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#ios}EntityStateSNMPModeStringType" minOccurs="0"/>
 *         &lt;element name="ipv4_acl" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="ipv6_acl" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
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
    "view",
    "mode",
    "ipv4Acl",
    "ipv6Acl"
})
public class SnmpcommunityState
    extends StateType
{

    protected EntityStateStringType name;
    protected EntityStateStringType view;
    protected EntityStateSNMPModeStringType mode;
    @XmlElement(name = "ipv4_acl")
    protected EntityStateStringType ipv4Acl;
    @XmlElement(name = "ipv6_acl")
    protected EntityStateStringType ipv6Acl;

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
     * view 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getView() {
        return view;
    }

    /**
     * view 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setView(EntityStateStringType value) {
        this.view = value;
    }

    /**
     * mode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateSNMPModeStringType }
     *     
     */
    public EntityStateSNMPModeStringType getMode() {
        return mode;
    }

    /**
     * mode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateSNMPModeStringType }
     *     
     */
    public void setMode(EntityStateSNMPModeStringType value) {
        this.mode = value;
    }

    /**
     * ipv4Acl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getIpv4Acl() {
        return ipv4Acl;
    }

    /**
     * ipv4Acl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setIpv4Acl(EntityStateStringType value) {
        this.ipv4Acl = value;
    }

    /**
     * ipv6Acl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getIpv6Acl() {
        return ipv6Acl;
    }

    /**
     * ipv6Acl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setIpv6Acl(EntityStateStringType value) {
        this.ipv6Acl = value;
    }

}
