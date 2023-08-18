//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_windows;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemBoolType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemIntType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;
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
 *         &lt;element name="user" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="enabled" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="group" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="last_logon" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="full_name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="password_age_days" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="lockout" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="passwd_notreqd" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="dont_expire_passwd" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="encrypted_text_password_allowed" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="not_delegated" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="use_des_key_only" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="dont_require_preauth" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="password_expired" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="smartcard_required" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="trusted_for_delegation" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="trusted_to_authenticate_for_delegation" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
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
    "user",
    "enabled",
    "group",
    "lastLogon",
    "fullName",
    "comment",
    "passwordAgeDays",
    "lockout",
    "passwdNotreqd",
    "dontExpirePasswd",
    "encryptedTextPasswordAllowed",
    "notDelegated",
    "useDesKeyOnly",
    "dontRequirePreauth",
    "passwordExpired",
    "smartcardRequired",
    "trustedForDelegation",
    "trustedToAuthenticateForDelegation"
})
public class UserItem
    extends ItemType
{

    protected EntityItemStringType user;
    protected EntityItemBoolType enabled;
    protected List<EntityItemStringType> group;
    @XmlElement(name = "last_logon")
    protected EntityItemIntType lastLogon;
    @XmlElement(name = "full_name")
    protected EntityItemStringType fullName;
    protected EntityItemStringType comment;
    @XmlElement(name = "password_age_days")
    protected EntityItemIntType passwordAgeDays;
    protected EntityItemBoolType lockout;
    @XmlElement(name = "passwd_notreqd")
    protected EntityItemBoolType passwdNotreqd;
    @XmlElement(name = "dont_expire_passwd")
    protected EntityItemBoolType dontExpirePasswd;
    @XmlElement(name = "encrypted_text_password_allowed")
    protected EntityItemBoolType encryptedTextPasswordAllowed;
    @XmlElement(name = "not_delegated")
    protected EntityItemBoolType notDelegated;
    @XmlElement(name = "use_des_key_only")
    protected EntityItemBoolType useDesKeyOnly;
    @XmlElement(name = "dont_require_preauth")
    protected EntityItemBoolType dontRequirePreauth;
    @XmlElement(name = "password_expired")
    protected EntityItemBoolType passwordExpired;
    @XmlElement(name = "smartcard_required")
    protected EntityItemBoolType smartcardRequired;
    @XmlElement(name = "trusted_for_delegation")
    protected EntityItemBoolType trustedForDelegation;
    @XmlElement(name = "trusted_to_authenticate_for_delegation")
    protected EntityItemBoolType trustedToAuthenticateForDelegation;

    /**
     * user 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getUser() {
        return user;
    }

    /**
     * user 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setUser(EntityItemStringType value) {
        this.user = value;
    }

    /**
     * enabled 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getEnabled() {
        return enabled;
    }

    /**
     * enabled 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setEnabled(EntityItemBoolType value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the group property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemStringType }
     * 
     * 
     */
    public List<EntityItemStringType> getGroup() {
        if (group == null) {
            group = new ArrayList<EntityItemStringType>();
        }
        return this.group;
    }

    /**
     * lastLogon 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getLastLogon() {
        return lastLogon;
    }

    /**
     * lastLogon 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setLastLogon(EntityItemIntType value) {
        this.lastLogon = value;
    }

    /**
     * fullName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getFullName() {
        return fullName;
    }

    /**
     * fullName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setFullName(EntityItemStringType value) {
        this.fullName = value;
    }

    /**
     * comment 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getComment() {
        return comment;
    }

    /**
     * comment 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setComment(EntityItemStringType value) {
        this.comment = value;
    }

    /**
     * passwordAgeDays 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getPasswordAgeDays() {
        return passwordAgeDays;
    }

    /**
     * passwordAgeDays 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setPasswordAgeDays(EntityItemIntType value) {
        this.passwordAgeDays = value;
    }

    /**
     * lockout 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getLockout() {
        return lockout;
    }

    /**
     * lockout 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setLockout(EntityItemBoolType value) {
        this.lockout = value;
    }

    /**
     * passwdNotreqd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getPasswdNotreqd() {
        return passwdNotreqd;
    }

    /**
     * passwdNotreqd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setPasswdNotreqd(EntityItemBoolType value) {
        this.passwdNotreqd = value;
    }

    /**
     * dontExpirePasswd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getDontExpirePasswd() {
        return dontExpirePasswd;
    }

    /**
     * dontExpirePasswd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setDontExpirePasswd(EntityItemBoolType value) {
        this.dontExpirePasswd = value;
    }

    /**
     * encryptedTextPasswordAllowed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getEncryptedTextPasswordAllowed() {
        return encryptedTextPasswordAllowed;
    }

    /**
     * encryptedTextPasswordAllowed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setEncryptedTextPasswordAllowed(EntityItemBoolType value) {
        this.encryptedTextPasswordAllowed = value;
    }

    /**
     * notDelegated 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getNotDelegated() {
        return notDelegated;
    }

    /**
     * notDelegated 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setNotDelegated(EntityItemBoolType value) {
        this.notDelegated = value;
    }

    /**
     * useDesKeyOnly 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getUseDesKeyOnly() {
        return useDesKeyOnly;
    }

    /**
     * useDesKeyOnly 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setUseDesKeyOnly(EntityItemBoolType value) {
        this.useDesKeyOnly = value;
    }

    /**
     * dontRequirePreauth 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getDontRequirePreauth() {
        return dontRequirePreauth;
    }

    /**
     * dontRequirePreauth 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setDontRequirePreauth(EntityItemBoolType value) {
        this.dontRequirePreauth = value;
    }

    /**
     * passwordExpired 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getPasswordExpired() {
        return passwordExpired;
    }

    /**
     * passwordExpired 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setPasswordExpired(EntityItemBoolType value) {
        this.passwordExpired = value;
    }

    /**
     * smartcardRequired 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSmartcardRequired() {
        return smartcardRequired;
    }

    /**
     * smartcardRequired 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSmartcardRequired(EntityItemBoolType value) {
        this.smartcardRequired = value;
    }

    /**
     * trustedForDelegation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getTrustedForDelegation() {
        return trustedForDelegation;
    }

    /**
     * trustedForDelegation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setTrustedForDelegation(EntityItemBoolType value) {
        this.trustedForDelegation = value;
    }

    /**
     * trustedToAuthenticateForDelegation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getTrustedToAuthenticateForDelegation() {
        return trustedToAuthenticateForDelegation;
    }

    /**
     * trustedToAuthenticateForDelegation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setTrustedToAuthenticateForDelegation(EntityItemBoolType value) {
        this.trustedToAuthenticateForDelegation = value;
    }

}
