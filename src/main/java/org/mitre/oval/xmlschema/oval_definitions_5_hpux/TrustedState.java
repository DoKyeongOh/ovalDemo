//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5_hpux;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateBoolType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateIntType;
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
 *         &lt;element name="username" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="uid" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="password" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="account_owner" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="boot_auth" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="audit_id" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="audit_flag" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="pw_change_min" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="pw_max_size" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="pw_expiration" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="pw_life" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="pw_change_s" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="pw_change_u" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="acct_expire" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="max_llogin" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="exp_warning" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="usr_chg_pw" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="gen_pw" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="pw_restrict" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="pw_null" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="pw_gen_char" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="pw_gen_let" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="login_time" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="pw_changer" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="login_time_s" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="login_time_u" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="login_tty_s" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="login_tty_u" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="num_u_logins" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="max_u_logins" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="lock_flag" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
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
public class TrustedState
    extends StateType
{

    protected EntityStateStringType username;
    protected EntityStateIntType uid;
    protected EntityStateStringType password;
    @XmlElement(name = "account_owner")
    protected EntityStateIntType accountOwner;
    @XmlElement(name = "boot_auth")
    protected EntityStateStringType bootAuth;
    @XmlElement(name = "audit_id")
    protected EntityStateStringType auditId;
    @XmlElement(name = "audit_flag")
    protected EntityStateStringType auditFlag;
    @XmlElement(name = "pw_change_min")
    protected EntityStateStringType pwChangeMin;
    @XmlElement(name = "pw_max_size")
    protected EntityStateIntType pwMaxSize;
    @XmlElement(name = "pw_expiration")
    protected EntityStateIntType pwExpiration;
    @XmlElement(name = "pw_life")
    protected EntityStateStringType pwLife;
    @XmlElement(name = "pw_change_s")
    protected EntityStateStringType pwChangeS;
    @XmlElement(name = "pw_change_u")
    protected EntityStateStringType pwChangeU;
    @XmlElement(name = "acct_expire")
    protected EntityStateIntType acctExpire;
    @XmlElement(name = "max_llogin")
    protected EntityStateStringType maxLlogin;
    @XmlElement(name = "exp_warning")
    protected EntityStateIntType expWarning;
    @XmlElement(name = "usr_chg_pw")
    protected EntityStateStringType usrChgPw;
    @XmlElement(name = "gen_pw")
    protected EntityStateStringType genPw;
    @XmlElement(name = "pw_restrict")
    protected EntityStateStringType pwRestrict;
    @XmlElement(name = "pw_null")
    protected EntityStateStringType pwNull;
    @XmlElement(name = "pw_gen_char")
    protected EntityStateStringType pwGenChar;
    @XmlElement(name = "pw_gen_let")
    protected EntityStateStringType pwGenLet;
    @XmlElement(name = "login_time")
    protected EntityStateStringType loginTime;
    @XmlElement(name = "pw_changer")
    protected EntityStateIntType pwChanger;
    @XmlElement(name = "login_time_s")
    protected EntityStateStringType loginTimeS;
    @XmlElement(name = "login_time_u")
    protected EntityStateStringType loginTimeU;
    @XmlElement(name = "login_tty_s")
    protected EntityStateStringType loginTtyS;
    @XmlElement(name = "login_tty_u")
    protected EntityStateStringType loginTtyU;
    @XmlElement(name = "num_u_logins")
    protected EntityStateIntType numULogins;
    @XmlElement(name = "max_u_logins")
    protected EntityStateIntType maxULogins;
    @XmlElement(name = "lock_flag")
    protected EntityStateBoolType lockFlag;

    /**
     * username 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getUsername() {
        return username;
    }

    /**
     * username 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setUsername(EntityStateStringType value) {
        this.username = value;
    }

    /**
     * uid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getUid() {
        return uid;
    }

    /**
     * uid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setUid(EntityStateIntType value) {
        this.uid = value;
    }

    /**
     * password 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getPassword() {
        return password;
    }

    /**
     * password 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setPassword(EntityStateStringType value) {
        this.password = value;
    }

    /**
     * accountOwner 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getAccountOwner() {
        return accountOwner;
    }

    /**
     * accountOwner 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setAccountOwner(EntityStateIntType value) {
        this.accountOwner = value;
    }

    /**
     * bootAuth 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getBootAuth() {
        return bootAuth;
    }

    /**
     * bootAuth 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setBootAuth(EntityStateStringType value) {
        this.bootAuth = value;
    }

    /**
     * auditId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getAuditId() {
        return auditId;
    }

    /**
     * auditId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setAuditId(EntityStateStringType value) {
        this.auditId = value;
    }

    /**
     * auditFlag 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getAuditFlag() {
        return auditFlag;
    }

    /**
     * auditFlag 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setAuditFlag(EntityStateStringType value) {
        this.auditFlag = value;
    }

    /**
     * pwChangeMin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getPwChangeMin() {
        return pwChangeMin;
    }

    /**
     * pwChangeMin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setPwChangeMin(EntityStateStringType value) {
        this.pwChangeMin = value;
    }

    /**
     * pwMaxSize 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getPwMaxSize() {
        return pwMaxSize;
    }

    /**
     * pwMaxSize 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setPwMaxSize(EntityStateIntType value) {
        this.pwMaxSize = value;
    }

    /**
     * pwExpiration 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getPwExpiration() {
        return pwExpiration;
    }

    /**
     * pwExpiration 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setPwExpiration(EntityStateIntType value) {
        this.pwExpiration = value;
    }

    /**
     * pwLife 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getPwLife() {
        return pwLife;
    }

    /**
     * pwLife 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setPwLife(EntityStateStringType value) {
        this.pwLife = value;
    }

    /**
     * pwChangeS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getPwChangeS() {
        return pwChangeS;
    }

    /**
     * pwChangeS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setPwChangeS(EntityStateStringType value) {
        this.pwChangeS = value;
    }

    /**
     * pwChangeU 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getPwChangeU() {
        return pwChangeU;
    }

    /**
     * pwChangeU 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setPwChangeU(EntityStateStringType value) {
        this.pwChangeU = value;
    }

    /**
     * acctExpire 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getAcctExpire() {
        return acctExpire;
    }

    /**
     * acctExpire 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setAcctExpire(EntityStateIntType value) {
        this.acctExpire = value;
    }

    /**
     * maxLlogin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getMaxLlogin() {
        return maxLlogin;
    }

    /**
     * maxLlogin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setMaxLlogin(EntityStateStringType value) {
        this.maxLlogin = value;
    }

    /**
     * expWarning 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getExpWarning() {
        return expWarning;
    }

    /**
     * expWarning 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setExpWarning(EntityStateIntType value) {
        this.expWarning = value;
    }

    /**
     * usrChgPw 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getUsrChgPw() {
        return usrChgPw;
    }

    /**
     * usrChgPw 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setUsrChgPw(EntityStateStringType value) {
        this.usrChgPw = value;
    }

    /**
     * genPw 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getGenPw() {
        return genPw;
    }

    /**
     * genPw 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setGenPw(EntityStateStringType value) {
        this.genPw = value;
    }

    /**
     * pwRestrict 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getPwRestrict() {
        return pwRestrict;
    }

    /**
     * pwRestrict 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setPwRestrict(EntityStateStringType value) {
        this.pwRestrict = value;
    }

    /**
     * pwNull 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getPwNull() {
        return pwNull;
    }

    /**
     * pwNull 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setPwNull(EntityStateStringType value) {
        this.pwNull = value;
    }

    /**
     * pwGenChar 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getPwGenChar() {
        return pwGenChar;
    }

    /**
     * pwGenChar 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setPwGenChar(EntityStateStringType value) {
        this.pwGenChar = value;
    }

    /**
     * pwGenLet 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getPwGenLet() {
        return pwGenLet;
    }

    /**
     * pwGenLet 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setPwGenLet(EntityStateStringType value) {
        this.pwGenLet = value;
    }

    /**
     * loginTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getLoginTime() {
        return loginTime;
    }

    /**
     * loginTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setLoginTime(EntityStateStringType value) {
        this.loginTime = value;
    }

    /**
     * pwChanger 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getPwChanger() {
        return pwChanger;
    }

    /**
     * pwChanger 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setPwChanger(EntityStateIntType value) {
        this.pwChanger = value;
    }

    /**
     * loginTimeS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getLoginTimeS() {
        return loginTimeS;
    }

    /**
     * loginTimeS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setLoginTimeS(EntityStateStringType value) {
        this.loginTimeS = value;
    }

    /**
     * loginTimeU 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getLoginTimeU() {
        return loginTimeU;
    }

    /**
     * loginTimeU 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setLoginTimeU(EntityStateStringType value) {
        this.loginTimeU = value;
    }

    /**
     * loginTtyS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getLoginTtyS() {
        return loginTtyS;
    }

    /**
     * loginTtyS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setLoginTtyS(EntityStateStringType value) {
        this.loginTtyS = value;
    }

    /**
     * loginTtyU 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getLoginTtyU() {
        return loginTtyU;
    }

    /**
     * loginTtyU 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setLoginTtyU(EntityStateStringType value) {
        this.loginTtyU = value;
    }

    /**
     * numULogins 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getNumULogins() {
        return numULogins;
    }

    /**
     * numULogins 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setNumULogins(EntityStateIntType value) {
        this.numULogins = value;
    }

    /**
     * maxULogins 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMaxULogins() {
        return maxULogins;
    }

    /**
     * maxULogins 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMaxULogins(EntityStateIntType value) {
        this.maxULogins = value;
    }

    /**
     * lockFlag 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getLockFlag() {
        return lockFlag;
    }

    /**
     * lockFlag 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setLockFlag(EntityStateBoolType value) {
        this.lockFlag = value;
    }

}
