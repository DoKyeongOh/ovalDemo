//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5_android;

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
 *         &lt;element name="max_num_failed_user_auth" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="password_hist" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="password_quality" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#android}EntityStatePasswordQualityType" minOccurs="0"/>
 *         &lt;element name="password_min_length" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="password_min_letters" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="password_min_lower_case_letters" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="password_min_non_letters" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="password_min_numeric" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="password_min_symbols" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="password_min_upper_case_letters" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="password_expiration_timeout" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="password_visible" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="active_password_sufficient" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="current_failed_password_attempts" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="screen_lock_timeout" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="keyguard_disabled_features" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#android}EntityStateKeyguardDisabledFeaturesType" minOccurs="0"/>
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
public class PasswordState
    extends StateType
{

    @XmlElement(name = "max_num_failed_user_auth")
    protected EntityStateIntType maxNumFailedUserAuth;
    @XmlElement(name = "password_hist")
    protected EntityStateIntType passwordHist;
    @XmlElement(name = "password_quality")
    protected EntityStatePasswordQualityType passwordQuality;
    @XmlElement(name = "password_min_length")
    protected EntityStateIntType passwordMinLength;
    @XmlElement(name = "password_min_letters")
    protected EntityStateIntType passwordMinLetters;
    @XmlElement(name = "password_min_lower_case_letters")
    protected EntityStateIntType passwordMinLowerCaseLetters;
    @XmlElement(name = "password_min_non_letters")
    protected EntityStateIntType passwordMinNonLetters;
    @XmlElement(name = "password_min_numeric")
    protected EntityStateIntType passwordMinNumeric;
    @XmlElement(name = "password_min_symbols")
    protected EntityStateIntType passwordMinSymbols;
    @XmlElement(name = "password_min_upper_case_letters")
    protected EntityStateIntType passwordMinUpperCaseLetters;
    @XmlElement(name = "password_expiration_timeout")
    protected EntityStateIntType passwordExpirationTimeout;
    @XmlElement(name = "password_visible")
    protected EntityStateBoolType passwordVisible;
    @XmlElement(name = "active_password_sufficient")
    protected EntityStateBoolType activePasswordSufficient;
    @XmlElement(name = "current_failed_password_attempts")
    protected EntityStateIntType currentFailedPasswordAttempts;
    @XmlElement(name = "screen_lock_timeout")
    protected EntityStateIntType screenLockTimeout;
    @XmlElement(name = "keyguard_disabled_features")
    protected EntityStateKeyguardDisabledFeaturesType keyguardDisabledFeatures;

    /**
     * maxNumFailedUserAuth 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMaxNumFailedUserAuth() {
        return maxNumFailedUserAuth;
    }

    /**
     * maxNumFailedUserAuth 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMaxNumFailedUserAuth(EntityStateIntType value) {
        this.maxNumFailedUserAuth = value;
    }

    /**
     * passwordHist 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getPasswordHist() {
        return passwordHist;
    }

    /**
     * passwordHist 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setPasswordHist(EntityStateIntType value) {
        this.passwordHist = value;
    }

    /**
     * passwordQuality 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatePasswordQualityType }
     *     
     */
    public EntityStatePasswordQualityType getPasswordQuality() {
        return passwordQuality;
    }

    /**
     * passwordQuality 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatePasswordQualityType }
     *     
     */
    public void setPasswordQuality(EntityStatePasswordQualityType value) {
        this.passwordQuality = value;
    }

    /**
     * passwordMinLength 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getPasswordMinLength() {
        return passwordMinLength;
    }

    /**
     * passwordMinLength 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setPasswordMinLength(EntityStateIntType value) {
        this.passwordMinLength = value;
    }

    /**
     * passwordMinLetters 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getPasswordMinLetters() {
        return passwordMinLetters;
    }

    /**
     * passwordMinLetters 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setPasswordMinLetters(EntityStateIntType value) {
        this.passwordMinLetters = value;
    }

    /**
     * passwordMinLowerCaseLetters 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getPasswordMinLowerCaseLetters() {
        return passwordMinLowerCaseLetters;
    }

    /**
     * passwordMinLowerCaseLetters 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setPasswordMinLowerCaseLetters(EntityStateIntType value) {
        this.passwordMinLowerCaseLetters = value;
    }

    /**
     * passwordMinNonLetters 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getPasswordMinNonLetters() {
        return passwordMinNonLetters;
    }

    /**
     * passwordMinNonLetters 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setPasswordMinNonLetters(EntityStateIntType value) {
        this.passwordMinNonLetters = value;
    }

    /**
     * passwordMinNumeric 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getPasswordMinNumeric() {
        return passwordMinNumeric;
    }

    /**
     * passwordMinNumeric 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setPasswordMinNumeric(EntityStateIntType value) {
        this.passwordMinNumeric = value;
    }

    /**
     * passwordMinSymbols 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getPasswordMinSymbols() {
        return passwordMinSymbols;
    }

    /**
     * passwordMinSymbols 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setPasswordMinSymbols(EntityStateIntType value) {
        this.passwordMinSymbols = value;
    }

    /**
     * passwordMinUpperCaseLetters 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getPasswordMinUpperCaseLetters() {
        return passwordMinUpperCaseLetters;
    }

    /**
     * passwordMinUpperCaseLetters 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setPasswordMinUpperCaseLetters(EntityStateIntType value) {
        this.passwordMinUpperCaseLetters = value;
    }

    /**
     * passwordExpirationTimeout 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getPasswordExpirationTimeout() {
        return passwordExpirationTimeout;
    }

    /**
     * passwordExpirationTimeout 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setPasswordExpirationTimeout(EntityStateIntType value) {
        this.passwordExpirationTimeout = value;
    }

    /**
     * passwordVisible 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getPasswordVisible() {
        return passwordVisible;
    }

    /**
     * passwordVisible 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setPasswordVisible(EntityStateBoolType value) {
        this.passwordVisible = value;
    }

    /**
     * activePasswordSufficient 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getActivePasswordSufficient() {
        return activePasswordSufficient;
    }

    /**
     * activePasswordSufficient 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setActivePasswordSufficient(EntityStateBoolType value) {
        this.activePasswordSufficient = value;
    }

    /**
     * currentFailedPasswordAttempts 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getCurrentFailedPasswordAttempts() {
        return currentFailedPasswordAttempts;
    }

    /**
     * currentFailedPasswordAttempts 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setCurrentFailedPasswordAttempts(EntityStateIntType value) {
        this.currentFailedPasswordAttempts = value;
    }

    /**
     * screenLockTimeout 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getScreenLockTimeout() {
        return screenLockTimeout;
    }

    /**
     * screenLockTimeout 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setScreenLockTimeout(EntityStateIntType value) {
        this.screenLockTimeout = value;
    }

    /**
     * keyguardDisabledFeatures 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateKeyguardDisabledFeaturesType }
     *     
     */
    public EntityStateKeyguardDisabledFeaturesType getKeyguardDisabledFeatures() {
        return keyguardDisabledFeatures;
    }

    /**
     * keyguardDisabledFeatures 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateKeyguardDisabledFeaturesType }
     *     
     */
    public void setKeyguardDisabledFeatures(EntityStateKeyguardDisabledFeaturesType value) {
        this.keyguardDisabledFeatures = value;
    }

}
