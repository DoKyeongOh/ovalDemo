//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_windows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemBoolType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemIntType;
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
 *         &lt;element name="max_passwd_age" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="min_passwd_age" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="min_passwd_len" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="password_hist_len" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="password_complexity" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="reversible_encryption" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="anonymous_name_lookup" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
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
    "maxPasswdAge",
    "minPasswdAge",
    "minPasswdLen",
    "passwordHistLen",
    "passwordComplexity",
    "reversibleEncryption",
    "anonymousNameLookup"
})
public class PasswordpolicyItem
    extends ItemType
{

    @XmlElement(name = "max_passwd_age")
    protected EntityItemIntType maxPasswdAge;
    @XmlElement(name = "min_passwd_age")
    protected EntityItemIntType minPasswdAge;
    @XmlElement(name = "min_passwd_len")
    protected EntityItemIntType minPasswdLen;
    @XmlElement(name = "password_hist_len")
    protected EntityItemIntType passwordHistLen;
    @XmlElement(name = "password_complexity")
    protected EntityItemBoolType passwordComplexity;
    @XmlElement(name = "reversible_encryption")
    protected EntityItemBoolType reversibleEncryption;
    @XmlElement(name = "anonymous_name_lookup")
    protected EntityItemBoolType anonymousNameLookup;

    /**
     * maxPasswdAge 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMaxPasswdAge() {
        return maxPasswdAge;
    }

    /**
     * maxPasswdAge 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMaxPasswdAge(EntityItemIntType value) {
        this.maxPasswdAge = value;
    }

    /**
     * minPasswdAge 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMinPasswdAge() {
        return minPasswdAge;
    }

    /**
     * minPasswdAge 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMinPasswdAge(EntityItemIntType value) {
        this.minPasswdAge = value;
    }

    /**
     * minPasswdLen 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMinPasswdLen() {
        return minPasswdLen;
    }

    /**
     * minPasswdLen 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMinPasswdLen(EntityItemIntType value) {
        this.minPasswdLen = value;
    }

    /**
     * passwordHistLen 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getPasswordHistLen() {
        return passwordHistLen;
    }

    /**
     * passwordHistLen 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setPasswordHistLen(EntityItemIntType value) {
        this.passwordHistLen = value;
    }

    /**
     * passwordComplexity 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getPasswordComplexity() {
        return passwordComplexity;
    }

    /**
     * passwordComplexity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setPasswordComplexity(EntityItemBoolType value) {
        this.passwordComplexity = value;
    }

    /**
     * reversibleEncryption 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getReversibleEncryption() {
        return reversibleEncryption;
    }

    /**
     * reversibleEncryption 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setReversibleEncryption(EntityItemBoolType value) {
        this.reversibleEncryption = value;
    }

    /**
     * anonymousNameLookup 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAnonymousNameLookup() {
        return anonymousNameLookup;
    }

    /**
     * anonymousNameLookup 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAnonymousNameLookup(EntityItemBoolType value) {
        this.anonymousNameLookup = value;
    }

}
