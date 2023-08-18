//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5_solaris;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateRecordType;
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
 *         &lt;element name="current" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="supported" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris}EntityStateV12NEnvType" minOccurs="0"/>
 *         &lt;element name="parent" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris}EntityStateV12NEnvType" minOccurs="0"/>
 *         &lt;element name="ldom-role" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris}EntityStateLDOMRoleType" minOccurs="0"/>
 *         &lt;element name="properties" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateRecordType" minOccurs="0"/>
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
    "current",
    "supported",
    "parent",
    "ldomRole",
    "properties"
})
public class VirtualizationinfoState
    extends StateType
{

    protected EntityStateStringType current;
    protected EntityStateV12NEnvType supported;
    protected EntityStateV12NEnvType parent;
    @XmlElement(name = "ldom-role")
    protected EntityStateLDOMRoleType ldomRole;
    protected EntityStateRecordType properties;

    /**
     * current 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getCurrent() {
        return current;
    }

    /**
     * current 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setCurrent(EntityStateStringType value) {
        this.current = value;
    }

    /**
     * supported 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateV12NEnvType }
     *     
     */
    public EntityStateV12NEnvType getSupported() {
        return supported;
    }

    /**
     * supported 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateV12NEnvType }
     *     
     */
    public void setSupported(EntityStateV12NEnvType value) {
        this.supported = value;
    }

    /**
     * parent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateV12NEnvType }
     *     
     */
    public EntityStateV12NEnvType getParent() {
        return parent;
    }

    /**
     * parent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateV12NEnvType }
     *     
     */
    public void setParent(EntityStateV12NEnvType value) {
        this.parent = value;
    }

    /**
     * ldomRole 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateLDOMRoleType }
     *     
     */
    public EntityStateLDOMRoleType getLdomRole() {
        return ldomRole;
    }

    /**
     * ldomRole 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateLDOMRoleType }
     *     
     */
    public void setLdomRole(EntityStateLDOMRoleType value) {
        this.ldomRole = value;
    }

    /**
     * properties 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateRecordType }
     *     
     */
    public EntityStateRecordType getProperties() {
        return properties;
    }

    /**
     * properties 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateRecordType }
     *     
     */
    public void setProperties(EntityStateRecordType value) {
        this.properties = value;
    }

}
