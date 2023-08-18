//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_android;

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
 *         &lt;element name="max_num_failed_user_auth" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="password_hist" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="password_quality" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android}EntityItemPasswordQualityType" minOccurs="0"/>
 *         &lt;element name="password_min_length" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="password_min_letters" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="password_min_lower_case_letters" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="password_min_non_letters" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="password_min_numeric" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="password_min_symbols" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="password_min_upper_case_letters" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="password_expiration_timeout" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="password_visible" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="active_password_sufficient" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="current_failed_password_attempts" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="screen_lock_timeout" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="keyguard_disabled_features" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android}EntityItemKeyguardDisabledFeaturesType" minOccurs="0"/>
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
    "maxNumFailedUserAuth",
    "passwordHist",
    "passwordQuality",
    "passwordMinLength",
    "passwordMinLetters",
    "passwordMinLowerCaseLetters",
    "passwordMinNonLetters",
    "passwordMinNumeric",
    "passwordMinSymbols",
    "passwordMinUpperCaseLetters",
    "passwordExpirationTimeout",
    "passwordVisible",
    "activePasswordSufficient",
    "currentFailedPasswordAttempts",
    "screenLockTimeout",
    "keyguardDisabledFeatures"
})
public class PasswordItem
    extends ItemType
{

    @XmlElement(name = "max_num_failed_user_auth")
    protected EntityItemIntType maxNumFailedUserAuth;
    @XmlElement(name = "password_hist")
    protected EntityItemIntType passwordHist;
    @XmlElement(name = "password_quality")
    protected EntityItemPasswordQualityType passwordQuality;
    @XmlElement(name = "password_min_length")
    protected EntityItemIntType passwordMinLength;
    @XmlElement(name = "password_min_letters")
    protected EntityItemIntType passwordMinLetters;
    @XmlElement(name = "password_min_lower_case_letters")
    protected EntityItemIntType passwordMinLowerCaseLetters;
    @XmlElement(name = "password_min_non_letters")
    protected EntityItemIntType passwordMinNonLetters;
    @XmlElement(name = "password_min_numeric")
    protected EntityItemIntType passwordMinNumeric;
    @XmlElement(name = "password_min_symbols")
    protected EntityItemIntType passwordMinSymbols;
    @XmlElement(name = "password_min_upper_case_letters")
    protected EntityItemIntType passwordMinUpperCaseLetters;
    @XmlElement(name = "password_expiration_timeout")
    protected EntityItemIntType passwordExpirationTimeout;
    @XmlElement(name = "password_visible")
    protected EntityItemBoolType passwordVisible;
    @XmlElement(name = "active_password_sufficient")
    protected EntityItemBoolType activePasswordSufficient;
    @XmlElement(name = "current_failed_password_attempts")
    protected EntityItemIntType currentFailedPasswordAttempts;
    @XmlElement(name = "screen_lock_timeout")
    protected EntityItemIntType screenLockTimeout;
    @XmlElement(name = "keyguard_disabled_features")
    protected EntityItemKeyguardDisabledFeaturesType keyguardDisabledFeatures;

    /**
     * maxNumFailedUserAuth 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMaxNumFailedUserAuth() {
        return maxNumFailedUserAuth;
    }

    /**
     * maxNumFailedUserAuth 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMaxNumFailedUserAuth(EntityItemIntType value) {
        this.maxNumFailedUserAuth = value;
    }

    /**
     * passwordHist 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getPasswordHist() {
        return passwordHist;
    }

    /**
     * passwordHist 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setPasswordHist(EntityItemIntType value) {
        this.passwordHist = value;
    }

    /**
     * passwordQuality 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemPasswordQualityType }
     *     
     */
    public EntityItemPasswordQualityType getPasswordQuality() {
        return passwordQuality;
    }

    /**
     * passwordQuality 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemPasswordQualityType }
     *     
     */
    public void setPasswordQuality(EntityItemPasswordQualityType value) {
        this.passwordQuality = value;
    }

    /**
     * passwordMinLength 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getPasswordMinLength() {
        return passwordMinLength;
    }

    /**
     * passwordMinLength 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setPasswordMinLength(EntityItemIntType value) {
        this.passwordMinLength = value;
    }

    /**
     * passwordMinLetters 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getPasswordMinLetters() {
        return passwordMinLetters;
    }

    /**
     * passwordMinLetters 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setPasswordMinLetters(EntityItemIntType value) {
        this.passwordMinLetters = value;
    }

    /**
     * passwordMinLowerCaseLetters 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getPasswordMinLowerCaseLetters() {
        return passwordMinLowerCaseLetters;
    }

    /**
     * passwordMinLowerCaseLetters 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setPasswordMinLowerCaseLetters(EntityItemIntType value) {
        this.passwordMinLowerCaseLetters = value;
    }

    /**
     * passwordMinNonLetters 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getPasswordMinNonLetters() {
        return passwordMinNonLetters;
    }

    /**
     * passwordMinNonLetters 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setPasswordMinNonLetters(EntityItemIntType value) {
        this.passwordMinNonLetters = value;
    }

    /**
     * passwordMinNumeric 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getPasswordMinNumeric() {
        return passwordMinNumeric;
    }

    /**
     * passwordMinNumeric 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setPasswordMinNumeric(EntityItemIntType value) {
        this.passwordMinNumeric = value;
    }

    /**
     * passwordMinSymbols 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getPasswordMinSymbols() {
        return passwordMinSymbols;
    }

    /**
     * passwordMinSymbols 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setPasswordMinSymbols(EntityItemIntType value) {
        this.passwordMinSymbols = value;
    }

    /**
     * passwordMinUpperCaseLetters 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getPasswordMinUpperCaseLetters() {
        return passwordMinUpperCaseLetters;
    }

    /**
     * passwordMinUpperCaseLetters 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setPasswordMinUpperCaseLetters(EntityItemIntType value) {
        this.passwordMinUpperCaseLetters = value;
    }

    /**
     * passwordExpirationTimeout 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getPasswordExpirationTimeout() {
        return passwordExpirationTimeout;
    }

    /**
     * passwordExpirationTimeout 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setPasswordExpirationTimeout(EntityItemIntType value) {
        this.passwordExpirationTimeout = value;
    }

    /**
     * passwordVisible 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getPasswordVisible() {
        return passwordVisible;
    }

    /**
     * passwordVisible 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setPasswordVisible(EntityItemBoolType value) {
        this.passwordVisible = value;
    }

    /**
     * activePasswordSufficient 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getActivePasswordSufficient() {
        return activePasswordSufficient;
    }

    /**
     * activePasswordSufficient 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setActivePasswordSufficient(EntityItemBoolType value) {
        this.activePasswordSufficient = value;
    }

    /**
     * currentFailedPasswordAttempts 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getCurrentFailedPasswordAttempts() {
        return currentFailedPasswordAttempts;
    }

    /**
     * currentFailedPasswordAttempts 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setCurrentFailedPasswordAttempts(EntityItemIntType value) {
        this.currentFailedPasswordAttempts = value;
    }

    /**
     * screenLockTimeout 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getScreenLockTimeout() {
        return screenLockTimeout;
    }

    /**
     * screenLockTimeout 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setScreenLockTimeout(EntityItemIntType value) {
        this.screenLockTimeout = value;
    }

    /**
     * keyguardDisabledFeatures 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemKeyguardDisabledFeaturesType }
     *     
     */
    public EntityItemKeyguardDisabledFeaturesType getKeyguardDisabledFeatures() {
        return keyguardDisabledFeatures;
    }

    /**
     * keyguardDisabledFeatures 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemKeyguardDisabledFeaturesType }
     *     
     */
    public void setKeyguardDisabledFeatures(EntityItemKeyguardDisabledFeaturesType value) {
        this.keyguardDisabledFeatures = value;
    }

}
