//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_apple_ios;

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
 *         &lt;element name="allow_simple" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="force_pin" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="max_failed_attempts" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="max_inactivity" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="max_pin_age_in_days" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="min_complex_chars" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="min_length" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="require_alphanumeric" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="pin_history" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="max_grace_period" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
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
public class PasscodepolicyItem
    extends ItemType
{

    @XmlElement(name = "allow_simple", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType allowSimple;
    @XmlElement(name = "force_pin", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType forcePin;
    @XmlElement(name = "max_failed_attempts", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemIntType maxFailedAttempts;
    @XmlElement(name = "max_inactivity", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemIntType maxInactivity;
    @XmlElement(name = "max_pin_age_in_days", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemIntType maxPinAgeInDays;
    @XmlElement(name = "min_complex_chars", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemIntType minComplexChars;
    @XmlElement(name = "min_length", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemIntType minLength;
    @XmlElement(name = "require_alphanumeric", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType requireAlphanumeric;
    @XmlElement(name = "pin_history", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemIntType pinHistory;
    @XmlElement(name = "max_grace_period", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemIntType maxGracePeriod;

    /**
     * allowSimple 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowSimple() {
        return allowSimple;
    }

    /**
     * allowSimple 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowSimple(EntityItemBoolType value) {
        this.allowSimple = value;
    }

    /**
     * forcePin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getForcePin() {
        return forcePin;
    }

    /**
     * forcePin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setForcePin(EntityItemBoolType value) {
        this.forcePin = value;
    }

    /**
     * maxFailedAttempts 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMaxFailedAttempts() {
        return maxFailedAttempts;
    }

    /**
     * maxFailedAttempts 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMaxFailedAttempts(EntityItemIntType value) {
        this.maxFailedAttempts = value;
    }

    /**
     * maxInactivity 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMaxInactivity() {
        return maxInactivity;
    }

    /**
     * maxInactivity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMaxInactivity(EntityItemIntType value) {
        this.maxInactivity = value;
    }

    /**
     * maxPinAgeInDays 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMaxPinAgeInDays() {
        return maxPinAgeInDays;
    }

    /**
     * maxPinAgeInDays 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMaxPinAgeInDays(EntityItemIntType value) {
        this.maxPinAgeInDays = value;
    }

    /**
     * minComplexChars 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMinComplexChars() {
        return minComplexChars;
    }

    /**
     * minComplexChars 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMinComplexChars(EntityItemIntType value) {
        this.minComplexChars = value;
    }

    /**
     * minLength 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMinLength() {
        return minLength;
    }

    /**
     * minLength 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMinLength(EntityItemIntType value) {
        this.minLength = value;
    }

    /**
     * requireAlphanumeric 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getRequireAlphanumeric() {
        return requireAlphanumeric;
    }

    /**
     * requireAlphanumeric 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setRequireAlphanumeric(EntityItemBoolType value) {
        this.requireAlphanumeric = value;
    }

    /**
     * pinHistory 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getPinHistory() {
        return pinHistory;
    }

    /**
     * pinHistory 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setPinHistory(EntityItemIntType value) {
        this.pinHistory = value;
    }

    /**
     * maxGracePeriod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMaxGracePeriod() {
        return maxGracePeriod;
    }

    /**
     * maxGracePeriod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMaxGracePeriod(EntityItemIntType value) {
        this.maxGracePeriod = value;
    }

}
