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
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateBoolType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateIntType;
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
 *         &lt;element name="max_passwd_age" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="min_passwd_age" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="min_passwd_len" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="password_hist_len" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="password_complexity" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="reversible_encryption" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="anonymous_name_lookup" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
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
public class PasswordpolicyState
    extends StateType
{

    @XmlElement(name = "max_passwd_age")
    protected EntityStateIntType maxPasswdAge;
    @XmlElement(name = "min_passwd_age")
    protected EntityStateIntType minPasswdAge;
    @XmlElement(name = "min_passwd_len")
    protected EntityStateIntType minPasswdLen;
    @XmlElement(name = "password_hist_len")
    protected EntityStateIntType passwordHistLen;
    @XmlElement(name = "password_complexity")
    protected EntityStateBoolType passwordComplexity;
    @XmlElement(name = "reversible_encryption")
    protected EntityStateBoolType reversibleEncryption;
    @XmlElement(name = "anonymous_name_lookup")
    protected EntityStateBoolType anonymousNameLookup;

    /**
     * maxPasswdAge 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMaxPasswdAge() {
        return maxPasswdAge;
    }

    /**
     * maxPasswdAge 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMaxPasswdAge(EntityStateIntType value) {
        this.maxPasswdAge = value;
    }

    /**
     * minPasswdAge 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMinPasswdAge() {
        return minPasswdAge;
    }

    /**
     * minPasswdAge 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMinPasswdAge(EntityStateIntType value) {
        this.minPasswdAge = value;
    }

    /**
     * minPasswdLen 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMinPasswdLen() {
        return minPasswdLen;
    }

    /**
     * minPasswdLen 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMinPasswdLen(EntityStateIntType value) {
        this.minPasswdLen = value;
    }

    /**
     * passwordHistLen 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getPasswordHistLen() {
        return passwordHistLen;
    }

    /**
     * passwordHistLen 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setPasswordHistLen(EntityStateIntType value) {
        this.passwordHistLen = value;
    }

    /**
     * passwordComplexity 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getPasswordComplexity() {
        return passwordComplexity;
    }

    /**
     * passwordComplexity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setPasswordComplexity(EntityStateBoolType value) {
        this.passwordComplexity = value;
    }

    /**
     * reversibleEncryption 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getReversibleEncryption() {
        return reversibleEncryption;
    }

    /**
     * reversibleEncryption 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setReversibleEncryption(EntityStateBoolType value) {
        this.reversibleEncryption = value;
    }

    /**
     * anonymousNameLookup 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAnonymousNameLookup() {
        return anonymousNameLookup;
    }

    /**
     * anonymousNameLookup 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAnonymousNameLookup(EntityStateBoolType value) {
        this.anonymousNameLookup = value;
    }

}
