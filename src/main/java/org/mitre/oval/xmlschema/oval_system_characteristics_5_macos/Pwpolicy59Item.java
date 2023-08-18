//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_macos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="target_user" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="username" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="userpass" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="directory_node" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="maxChars" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="maxFailedLoginAttempts" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="minChars" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="passwordCannotBeName" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="requiresAlpha" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="requiresNumeric" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="maxMinutesUntilChangePassword" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="minMinutesUntilChangePassword" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="requiresMixedCase" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="requiresSymbol" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="minutesUntilFailedLoginReset" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="usingHistory" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="canModifyPasswordforSelf" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="usingExpirationDate" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="usingHardExpirationDate" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="expirationDateGMT" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="hardExpireDateGMT" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="maxMinutesUntilDisabled" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="maxMinutesOfNonUse" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="newPasswordRequired" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="notGuessablePattern" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
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
    "targetUser",
    "username",
    "userpass",
    "directoryNode",
    "maxChars",
    "maxFailedLoginAttempts",
    "minChars",
    "passwordCannotBeName",
    "requiresAlpha",
    "requiresNumeric",
    "maxMinutesUntilChangePassword",
    "minMinutesUntilChangePassword",
    "requiresMixedCase",
    "requiresSymbol",
    "minutesUntilFailedLoginReset",
    "usingHistory",
    "canModifyPasswordforSelf",
    "usingExpirationDate",
    "usingHardExpirationDate",
    "expirationDateGMT",
    "hardExpireDateGMT",
    "maxMinutesUntilDisabled",
    "maxMinutesOfNonUse",
    "newPasswordRequired",
    "notGuessablePattern"
})
public class Pwpolicy59Item
    extends ItemType
{

    @XmlElementRef(name = "target_user", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityItemStringType> targetUser;
    @XmlElementRef(name = "username", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityItemStringType> username;
    @XmlElementRef(name = "userpass", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityItemStringType> userpass;
    @XmlElementRef(name = "directory_node", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityItemStringType> directoryNode;
    protected EntityItemIntType maxChars;
    protected EntityItemIntType maxFailedLoginAttempts;
    protected EntityItemIntType minChars;
    protected EntityItemBoolType passwordCannotBeName;
    protected EntityItemBoolType requiresAlpha;
    protected EntityItemBoolType requiresNumeric;
    protected EntityItemIntType maxMinutesUntilChangePassword;
    protected EntityItemIntType minMinutesUntilChangePassword;
    protected EntityItemBoolType requiresMixedCase;
    protected EntityItemBoolType requiresSymbol;
    protected EntityItemIntType minutesUntilFailedLoginReset;
    protected EntityItemIntType usingHistory;
    protected EntityItemBoolType canModifyPasswordforSelf;
    protected EntityItemBoolType usingExpirationDate;
    protected EntityItemBoolType usingHardExpirationDate;
    protected EntityItemStringType expirationDateGMT;
    protected EntityItemStringType hardExpireDateGMT;
    protected EntityItemIntType maxMinutesUntilDisabled;
    protected EntityItemIntType maxMinutesOfNonUse;
    protected EntityItemBoolType newPasswordRequired;
    protected EntityItemBoolType notGuessablePattern;

    /**
     * targetUser 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}
     *     
     */
    public JAXBElement<EntityItemStringType> getTargetUser() {
        return targetUser;
    }

    /**
     * targetUser 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}
     *     
     */
    public void setTargetUser(JAXBElement<EntityItemStringType> value) {
        this.targetUser = value;
    }

    /**
     * username 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}
     *     
     */
    public JAXBElement<EntityItemStringType> getUsername() {
        return username;
    }

    /**
     * username 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}
     *     
     */
    public void setUsername(JAXBElement<EntityItemStringType> value) {
        this.username = value;
    }

    /**
     * userpass 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}
     *     
     */
    public JAXBElement<EntityItemStringType> getUserpass() {
        return userpass;
    }

    /**
     * userpass 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}
     *     
     */
    public void setUserpass(JAXBElement<EntityItemStringType> value) {
        this.userpass = value;
    }

    /**
     * directoryNode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}
     *     
     */
    public JAXBElement<EntityItemStringType> getDirectoryNode() {
        return directoryNode;
    }

    /**
     * directoryNode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}
     *     
     */
    public void setDirectoryNode(JAXBElement<EntityItemStringType> value) {
        this.directoryNode = value;
    }

    /**
     * maxChars 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMaxChars() {
        return maxChars;
    }

    /**
     * maxChars 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMaxChars(EntityItemIntType value) {
        this.maxChars = value;
    }

    /**
     * maxFailedLoginAttempts 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMaxFailedLoginAttempts() {
        return maxFailedLoginAttempts;
    }

    /**
     * maxFailedLoginAttempts 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMaxFailedLoginAttempts(EntityItemIntType value) {
        this.maxFailedLoginAttempts = value;
    }

    /**
     * minChars 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMinChars() {
        return minChars;
    }

    /**
     * minChars 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMinChars(EntityItemIntType value) {
        this.minChars = value;
    }

    /**
     * passwordCannotBeName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getPasswordCannotBeName() {
        return passwordCannotBeName;
    }

    /**
     * passwordCannotBeName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setPasswordCannotBeName(EntityItemBoolType value) {
        this.passwordCannotBeName = value;
    }

    /**
     * requiresAlpha 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getRequiresAlpha() {
        return requiresAlpha;
    }

    /**
     * requiresAlpha 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setRequiresAlpha(EntityItemBoolType value) {
        this.requiresAlpha = value;
    }

    /**
     * requiresNumeric 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getRequiresNumeric() {
        return requiresNumeric;
    }

    /**
     * requiresNumeric 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setRequiresNumeric(EntityItemBoolType value) {
        this.requiresNumeric = value;
    }

    /**
     * maxMinutesUntilChangePassword 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMaxMinutesUntilChangePassword() {
        return maxMinutesUntilChangePassword;
    }

    /**
     * maxMinutesUntilChangePassword 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMaxMinutesUntilChangePassword(EntityItemIntType value) {
        this.maxMinutesUntilChangePassword = value;
    }

    /**
     * minMinutesUntilChangePassword 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMinMinutesUntilChangePassword() {
        return minMinutesUntilChangePassword;
    }

    /**
     * minMinutesUntilChangePassword 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMinMinutesUntilChangePassword(EntityItemIntType value) {
        this.minMinutesUntilChangePassword = value;
    }

    /**
     * requiresMixedCase 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getRequiresMixedCase() {
        return requiresMixedCase;
    }

    /**
     * requiresMixedCase 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setRequiresMixedCase(EntityItemBoolType value) {
        this.requiresMixedCase = value;
    }

    /**
     * requiresSymbol 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getRequiresSymbol() {
        return requiresSymbol;
    }

    /**
     * requiresSymbol 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setRequiresSymbol(EntityItemBoolType value) {
        this.requiresSymbol = value;
    }

    /**
     * minutesUntilFailedLoginReset 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMinutesUntilFailedLoginReset() {
        return minutesUntilFailedLoginReset;
    }

    /**
     * minutesUntilFailedLoginReset 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMinutesUntilFailedLoginReset(EntityItemIntType value) {
        this.minutesUntilFailedLoginReset = value;
    }

    /**
     * usingHistory 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getUsingHistory() {
        return usingHistory;
    }

    /**
     * usingHistory 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setUsingHistory(EntityItemIntType value) {
        this.usingHistory = value;
    }

    /**
     * canModifyPasswordforSelf 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getCanModifyPasswordforSelf() {
        return canModifyPasswordforSelf;
    }

    /**
     * canModifyPasswordforSelf 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setCanModifyPasswordforSelf(EntityItemBoolType value) {
        this.canModifyPasswordforSelf = value;
    }

    /**
     * usingExpirationDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getUsingExpirationDate() {
        return usingExpirationDate;
    }

    /**
     * usingExpirationDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setUsingExpirationDate(EntityItemBoolType value) {
        this.usingExpirationDate = value;
    }

    /**
     * usingHardExpirationDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getUsingHardExpirationDate() {
        return usingHardExpirationDate;
    }

    /**
     * usingHardExpirationDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setUsingHardExpirationDate(EntityItemBoolType value) {
        this.usingHardExpirationDate = value;
    }

    /**
     * expirationDateGMT 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getExpirationDateGMT() {
        return expirationDateGMT;
    }

    /**
     * expirationDateGMT 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setExpirationDateGMT(EntityItemStringType value) {
        this.expirationDateGMT = value;
    }

    /**
     * hardExpireDateGMT 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getHardExpireDateGMT() {
        return hardExpireDateGMT;
    }

    /**
     * hardExpireDateGMT 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setHardExpireDateGMT(EntityItemStringType value) {
        this.hardExpireDateGMT = value;
    }

    /**
     * maxMinutesUntilDisabled 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMaxMinutesUntilDisabled() {
        return maxMinutesUntilDisabled;
    }

    /**
     * maxMinutesUntilDisabled 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMaxMinutesUntilDisabled(EntityItemIntType value) {
        this.maxMinutesUntilDisabled = value;
    }

    /**
     * maxMinutesOfNonUse 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMaxMinutesOfNonUse() {
        return maxMinutesOfNonUse;
    }

    /**
     * maxMinutesOfNonUse 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMaxMinutesOfNonUse(EntityItemIntType value) {
        this.maxMinutesOfNonUse = value;
    }

    /**
     * newPasswordRequired 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getNewPasswordRequired() {
        return newPasswordRequired;
    }

    /**
     * newPasswordRequired 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setNewPasswordRequired(EntityItemBoolType value) {
        this.newPasswordRequired = value;
    }

    /**
     * notGuessablePattern 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getNotGuessablePattern() {
        return notGuessablePattern;
    }

    /**
     * notGuessablePattern 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setNotGuessablePattern(EntityItemBoolType value) {
        this.notGuessablePattern = value;
    }

}
