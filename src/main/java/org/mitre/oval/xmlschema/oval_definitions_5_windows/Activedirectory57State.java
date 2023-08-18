//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5_windows;

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
 *         &lt;element name="naming_context" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateNamingContextType" minOccurs="0"/>
 *         &lt;element name="relative_dn" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="attribute" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="object_class" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="adstype" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAdstypeType" minOccurs="0"/>
 *         &lt;element name="value" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateRecordType" minOccurs="0"/>
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
    "namingContext",
    "relativeDn",
    "attribute",
    "objectClass",
    "adstype",
    "value"
})
public class Activedirectory57State
    extends StateType
{

    @XmlElement(name = "naming_context")
    protected EntityStateNamingContextType namingContext;
    @XmlElement(name = "relative_dn")
    protected EntityStateStringType relativeDn;
    protected EntityStateStringType attribute;
    @XmlElement(name = "object_class")
    protected EntityStateStringType objectClass;
    protected EntityStateAdstypeType adstype;
    protected EntityStateRecordType value;

    /**
     * namingContext 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateNamingContextType }
     *     
     */
    public EntityStateNamingContextType getNamingContext() {
        return namingContext;
    }

    /**
     * namingContext 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateNamingContextType }
     *     
     */
    public void setNamingContext(EntityStateNamingContextType value) {
        this.namingContext = value;
    }

    /**
     * relativeDn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getRelativeDn() {
        return relativeDn;
    }

    /**
     * relativeDn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setRelativeDn(EntityStateStringType value) {
        this.relativeDn = value;
    }

    /**
     * attribute 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getAttribute() {
        return attribute;
    }

    /**
     * attribute 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setAttribute(EntityStateStringType value) {
        this.attribute = value;
    }

    /**
     * objectClass 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getObjectClass() {
        return objectClass;
    }

    /**
     * objectClass 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setObjectClass(EntityStateStringType value) {
        this.objectClass = value;
    }

    /**
     * adstype 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAdstypeType }
     *     
     */
    public EntityStateAdstypeType getAdstype() {
        return adstype;
    }

    /**
     * adstype 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAdstypeType }
     *     
     */
    public void setAdstype(EntityStateAdstypeType value) {
        this.adstype = value;
    }

    /**
     * value 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateRecordType }
     *     
     */
    public EntityStateRecordType getValue() {
        return value;
    }

    /**
     * value 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateRecordType }
     *     
     */
    public void setValue(EntityStateRecordType value) {
        this.value = value;
    }

}
