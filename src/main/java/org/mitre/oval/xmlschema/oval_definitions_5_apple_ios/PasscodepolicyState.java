//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5_apple_ios;

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
 *         &lt;element name="allow_simple" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="force_pin" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="max_failed_attempts" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="max_inactivity" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="max_pin_age_in_days" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="min_complex_chars" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="min_length" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="require_alphanumeric" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="pin_history" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="max_grace_period" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
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
    "allowSimple",
    "forcePin",
    "maxFailedAttempts",
    "maxInactivity",
    "maxPinAgeInDays",
    "minComplexChars",
    "minLength",
    "requireAlphanumeric",
    "pinHistory",
    "maxGracePeriod"
})
public class PasscodepolicyState
    extends StateType
{

    @XmlElement(name = "allow_simple", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowSimple;
    @XmlElement(name = "force_pin", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType forcePin;
    @XmlElement(name = "max_failed_attempts", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateIntType maxFailedAttempts;
    @XmlElement(name = "max_inactivity", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateIntType maxInactivity;
    @XmlElement(name = "max_pin_age_in_days", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateIntType maxPinAgeInDays;
    @XmlElement(name = "min_complex_chars", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateIntType minComplexChars;
    @XmlElement(name = "min_length", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateIntType minLength;
    @XmlElement(name = "require_alphanumeric", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType requireAlphanumeric;
    @XmlElement(name = "pin_history", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateIntType pinHistory;
    @XmlElement(name = "max_grace_period", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateIntType maxGracePeriod;

    /**
     * allowSimple 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowSimple() {
        return allowSimple;
    }

    /**
     * allowSimple 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowSimple(EntityStateBoolType value) {
        this.allowSimple = value;
    }

    /**
     * forcePin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getForcePin() {
        return forcePin;
    }

    /**
     * forcePin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setForcePin(EntityStateBoolType value) {
        this.forcePin = value;
    }

    /**
     * maxFailedAttempts 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMaxFailedAttempts() {
        return maxFailedAttempts;
    }

    /**
     * maxFailedAttempts 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMaxFailedAttempts(EntityStateIntType value) {
        this.maxFailedAttempts = value;
    }

    /**
     * maxInactivity 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMaxInactivity() {
        return maxInactivity;
    }

    /**
     * maxInactivity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMaxInactivity(EntityStateIntType value) {
        this.maxInactivity = value;
    }

    /**
     * maxPinAgeInDays 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMaxPinAgeInDays() {
        return maxPinAgeInDays;
    }

    /**
     * maxPinAgeInDays 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMaxPinAgeInDays(EntityStateIntType value) {
        this.maxPinAgeInDays = value;
    }

    /**
     * minComplexChars 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMinComplexChars() {
        return minComplexChars;
    }

    /**
     * minComplexChars 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMinComplexChars(EntityStateIntType value) {
        this.minComplexChars = value;
    }

    /**
     * minLength 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMinLength() {
        return minLength;
    }

    /**
     * minLength 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMinLength(EntityStateIntType value) {
        this.minLength = value;
    }

    /**
     * requireAlphanumeric 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getRequireAlphanumeric() {
        return requireAlphanumeric;
    }

    /**
     * requireAlphanumeric 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setRequireAlphanumeric(EntityStateBoolType value) {
        this.requireAlphanumeric = value;
    }

    /**
     * pinHistory 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getPinHistory() {
        return pinHistory;
    }

    /**
     * pinHistory 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setPinHistory(EntityStateIntType value) {
        this.pinHistory = value;
    }

    /**
     * maxGracePeriod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMaxGracePeriod() {
        return maxGracePeriod;
    }

    /**
     * maxGracePeriod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMaxGracePeriod(EntityStateIntType value) {
        this.maxGracePeriod = value;
    }

}
