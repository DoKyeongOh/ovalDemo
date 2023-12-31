//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_hpux;

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
 *         &lt;element name="username" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="uid" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="password" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="account_owner" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="boot_auth" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="audit_id" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="audit_flag" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="pw_change_min" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="pw_max_size" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="pw_expiration" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="pw_life" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="pw_change_s" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="pw_change_u" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="acct_expire" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="max_llogin" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="exp_warning" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="usr_chg_pw" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="gen_pw" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="pw_restrict" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="pw_null" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="pw_gen_char" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="pw_gen_let" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="login_time" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="pw_changer" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="login_time_s" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="login_time_u" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="login_tty_s" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="login_tty_u" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="num_u_logins" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="max_u_logins" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="lock_flag" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
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
    "username",
    "uid",
    "password",
    "accountOwner",
    "bootAuth",
    "auditId",
    "auditFlag",
    "pwChangeMin",
    "pwMaxSize",
    "pwExpiration",
    "pwLife",
    "pwChangeS",
    "pwChangeU",
    "acctExpire",
    "maxLlogin",
    "expWarning",
    "usrChgPw",
    "genPw",
    "pwRestrict",
    "pwNull",
    "pwGenChar",
    "pwGenLet",
    "loginTime",
    "pwChanger",
    "loginTimeS",
    "loginTimeU",
    "loginTtyS",
    "loginTtyU",
    "numULogins",
    "maxULogins",
    "lockFlag"
})
public class TrustedItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType username;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemIntType uid;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType password;
    @XmlElement(name = "account_owner", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemIntType accountOwner;
    @XmlElement(name = "boot_auth", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType bootAuth;
    @XmlElement(name = "audit_id", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType auditId;
    @XmlElement(name = "audit_flag", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType auditFlag;
    @XmlElement(name = "pw_change_min", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType pwChangeMin;
    @XmlElement(name = "pw_max_size", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemIntType pwMaxSize;
    @XmlElement(name = "pw_expiration", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemIntType pwExpiration;
    @XmlElement(name = "pw_life", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType pwLife;
    @XmlElement(name = "pw_change_s", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType pwChangeS;
    @XmlElement(name = "pw_change_u", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType pwChangeU;
    @XmlElement(name = "acct_expire", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemIntType acctExpire;
    @XmlElement(name = "max_llogin", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType maxLlogin;
    @XmlElement(name = "exp_warning", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemIntType expWarning;
    @XmlElement(name = "usr_chg_pw", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType usrChgPw;
    @XmlElement(name = "gen_pw", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType genPw;
    @XmlElement(name = "pw_restrict", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType pwRestrict;
    @XmlElement(name = "pw_null", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType pwNull;
    @XmlElement(name = "pw_gen_char", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType pwGenChar;
    @XmlElement(name = "pw_gen_let", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType pwGenLet;
    @XmlElement(name = "login_time", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType loginTime;
    @XmlElement(name = "pw_changer", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemIntType pwChanger;
    @XmlElement(name = "login_time_s", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType loginTimeS;
    @XmlElement(name = "login_time_u", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType loginTimeU;
    @XmlElement(name = "login_tty_s", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType loginTtyS;
    @XmlElement(name = "login_tty_u", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType loginTtyU;
    @XmlElement(name = "num_u_logins", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemIntType numULogins;
    @XmlElement(name = "max_u_logins", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemIntType maxULogins;
    @XmlElement(name = "lock_flag", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemBoolType lockFlag;

    /**
     * username 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getUsername() {
        return username;
    }

    /**
     * username 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setUsername(EntityItemStringType value) {
        this.username = value;
    }

    /**
     * uid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getUid() {
        return uid;
    }

    /**
     * uid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setUid(EntityItemIntType value) {
        this.uid = value;
    }

    /**
     * password 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getPassword() {
        return password;
    }

    /**
     * password 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setPassword(EntityItemStringType value) {
        this.password = value;
    }

    /**
     * accountOwner 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getAccountOwner() {
        return accountOwner;
    }

    /**
     * accountOwner 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setAccountOwner(EntityItemIntType value) {
        this.accountOwner = value;
    }

    /**
     * bootAuth 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getBootAuth() {
        return bootAuth;
    }

    /**
     * bootAuth 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setBootAuth(EntityItemStringType value) {
        this.bootAuth = value;
    }

    /**
     * auditId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getAuditId() {
        return auditId;
    }

    /**
     * auditId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setAuditId(EntityItemStringType value) {
        this.auditId = value;
    }

    /**
     * auditFlag 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getAuditFlag() {
        return auditFlag;
    }

    /**
     * auditFlag 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setAuditFlag(EntityItemStringType value) {
        this.auditFlag = value;
    }

    /**
     * pwChangeMin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getPwChangeMin() {
        return pwChangeMin;
    }

    /**
     * pwChangeMin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setPwChangeMin(EntityItemStringType value) {
        this.pwChangeMin = value;
    }

    /**
     * pwMaxSize 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getPwMaxSize() {
        return pwMaxSize;
    }

    /**
     * pwMaxSize 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setPwMaxSize(EntityItemIntType value) {
        this.pwMaxSize = value;
    }

    /**
     * pwExpiration 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getPwExpiration() {
        return pwExpiration;
    }

    /**
     * pwExpiration 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setPwExpiration(EntityItemIntType value) {
        this.pwExpiration = value;
    }

    /**
     * pwLife 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getPwLife() {
        return pwLife;
    }

    /**
     * pwLife 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setPwLife(EntityItemStringType value) {
        this.pwLife = value;
    }

    /**
     * pwChangeS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getPwChangeS() {
        return pwChangeS;
    }

    /**
     * pwChangeS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setPwChangeS(EntityItemStringType value) {
        this.pwChangeS = value;
    }

    /**
     * pwChangeU 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getPwChangeU() {
        return pwChangeU;
    }

    /**
     * pwChangeU 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setPwChangeU(EntityItemStringType value) {
        this.pwChangeU = value;
    }

    /**
     * acctExpire 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getAcctExpire() {
        return acctExpire;
    }

    /**
     * acctExpire 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setAcctExpire(EntityItemIntType value) {
        this.acctExpire = value;
    }

    /**
     * maxLlogin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getMaxLlogin() {
        return maxLlogin;
    }

    /**
     * maxLlogin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setMaxLlogin(EntityItemStringType value) {
        this.maxLlogin = value;
    }

    /**
     * expWarning 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getExpWarning() {
        return expWarning;
    }

    /**
     * expWarning 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setExpWarning(EntityItemIntType value) {
        this.expWarning = value;
    }

    /**
     * usrChgPw 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getUsrChgPw() {
        return usrChgPw;
    }

    /**
     * usrChgPw 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setUsrChgPw(EntityItemStringType value) {
        this.usrChgPw = value;
    }

    /**
     * genPw 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getGenPw() {
        return genPw;
    }

    /**
     * genPw 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setGenPw(EntityItemStringType value) {
        this.genPw = value;
    }

    /**
     * pwRestrict 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getPwRestrict() {
        return pwRestrict;
    }

    /**
     * pwRestrict 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setPwRestrict(EntityItemStringType value) {
        this.pwRestrict = value;
    }

    /**
     * pwNull 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getPwNull() {
        return pwNull;
    }

    /**
     * pwNull 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setPwNull(EntityItemStringType value) {
        this.pwNull = value;
    }

    /**
     * pwGenChar 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getPwGenChar() {
        return pwGenChar;
    }

    /**
     * pwGenChar 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setPwGenChar(EntityItemStringType value) {
        this.pwGenChar = value;
    }

    /**
     * pwGenLet 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getPwGenLet() {
        return pwGenLet;
    }

    /**
     * pwGenLet 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setPwGenLet(EntityItemStringType value) {
        this.pwGenLet = value;
    }

    /**
     * loginTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getLoginTime() {
        return loginTime;
    }

    /**
     * loginTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setLoginTime(EntityItemStringType value) {
        this.loginTime = value;
    }

    /**
     * pwChanger 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getPwChanger() {
        return pwChanger;
    }

    /**
     * pwChanger 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setPwChanger(EntityItemIntType value) {
        this.pwChanger = value;
    }

    /**
     * loginTimeS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getLoginTimeS() {
        return loginTimeS;
    }

    /**
     * loginTimeS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setLoginTimeS(EntityItemStringType value) {
        this.loginTimeS = value;
    }

    /**
     * loginTimeU 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getLoginTimeU() {
        return loginTimeU;
    }

    /**
     * loginTimeU 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setLoginTimeU(EntityItemStringType value) {
        this.loginTimeU = value;
    }

    /**
     * loginTtyS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getLoginTtyS() {
        return loginTtyS;
    }

    /**
     * loginTtyS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setLoginTtyS(EntityItemStringType value) {
        this.loginTtyS = value;
    }

    /**
     * loginTtyU 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getLoginTtyU() {
        return loginTtyU;
    }

    /**
     * loginTtyU 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setLoginTtyU(EntityItemStringType value) {
        this.loginTtyU = value;
    }

    /**
     * numULogins 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getNumULogins() {
        return numULogins;
    }

    /**
     * numULogins 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setNumULogins(EntityItemIntType value) {
        this.numULogins = value;
    }

    /**
     * maxULogins 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMaxULogins() {
        return maxULogins;
    }

    /**
     * maxULogins 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMaxULogins(EntityItemIntType value) {
        this.maxULogins = value;
    }

    /**
     * lockFlag 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getLockFlag() {
        return lockFlag;
    }

    /**
     * lockFlag 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setLockFlag(EntityItemBoolType value) {
        this.lockFlag = value;
    }

}
