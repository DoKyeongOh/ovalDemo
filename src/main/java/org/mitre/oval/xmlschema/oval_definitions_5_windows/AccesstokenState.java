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
 *         &lt;element name="security_principle" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="seassignprimarytokenprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="seauditprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="sebackupprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="sechangenotifyprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="secreateglobalprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="secreatepagefileprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="secreatepermanentprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="secreatesymboliclinkprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="secreatetokenprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="sedebugprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="seenabledelegationprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="seimpersonateprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="seincreasebasepriorityprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="seincreasequotaprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="seincreaseworkingsetprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="seloaddriverprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="selockmemoryprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="semachineaccountprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="semanagevolumeprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="seprofilesingleprocessprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="serelabelprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="seremoteshutdownprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="serestoreprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="sesecurityprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="seshutdownprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="sesyncagentprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="sesystemenvironmentprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="sesystemprofileprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="sesystemtimeprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="setakeownershipprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="setcbprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="setimezoneprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="seundockprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="seunsolicitedinputprivilege" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="sebatchlogonright" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="seinteractivelogonright" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="senetworklogonright" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="seremoteinteractivelogonright" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="seservicelogonright" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="sedenybatchLogonright" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="sedenyinteractivelogonright" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="sedenynetworklogonright" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="sedenyremoteInteractivelogonright" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="sedenyservicelogonright" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="setrustedcredmanaccessnameright" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
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
    "securityPrinciple",
    "seassignprimarytokenprivilege",
    "seauditprivilege",
    "sebackupprivilege",
    "sechangenotifyprivilege",
    "secreateglobalprivilege",
    "secreatepagefileprivilege",
    "secreatepermanentprivilege",
    "secreatesymboliclinkprivilege",
    "secreatetokenprivilege",
    "sedebugprivilege",
    "seenabledelegationprivilege",
    "seimpersonateprivilege",
    "seincreasebasepriorityprivilege",
    "seincreasequotaprivilege",
    "seincreaseworkingsetprivilege",
    "seloaddriverprivilege",
    "selockmemoryprivilege",
    "semachineaccountprivilege",
    "semanagevolumeprivilege",
    "seprofilesingleprocessprivilege",
    "serelabelprivilege",
    "seremoteshutdownprivilege",
    "serestoreprivilege",
    "sesecurityprivilege",
    "seshutdownprivilege",
    "sesyncagentprivilege",
    "sesystemenvironmentprivilege",
    "sesystemprofileprivilege",
    "sesystemtimeprivilege",
    "setakeownershipprivilege",
    "setcbprivilege",
    "setimezoneprivilege",
    "seundockprivilege",
    "seunsolicitedinputprivilege",
    "sebatchlogonright",
    "seinteractivelogonright",
    "senetworklogonright",
    "seremoteinteractivelogonright",
    "seservicelogonright",
    "sedenybatchLogonright",
    "sedenyinteractivelogonright",
    "sedenynetworklogonright",
    "sedenyremoteInteractivelogonright",
    "sedenyservicelogonright",
    "setrustedcredmanaccessnameright"
})
public class AccesstokenState
    extends StateType
{

    @XmlElement(name = "security_principle")
    protected EntityStateStringType securityPrinciple;
    protected EntityStateBoolType seassignprimarytokenprivilege;
    protected EntityStateBoolType seauditprivilege;
    protected EntityStateBoolType sebackupprivilege;
    protected EntityStateBoolType sechangenotifyprivilege;
    protected EntityStateBoolType secreateglobalprivilege;
    protected EntityStateBoolType secreatepagefileprivilege;
    protected EntityStateBoolType secreatepermanentprivilege;
    protected EntityStateBoolType secreatesymboliclinkprivilege;
    protected EntityStateBoolType secreatetokenprivilege;
    protected EntityStateBoolType sedebugprivilege;
    protected EntityStateBoolType seenabledelegationprivilege;
    protected EntityStateBoolType seimpersonateprivilege;
    protected EntityStateBoolType seincreasebasepriorityprivilege;
    protected EntityStateBoolType seincreasequotaprivilege;
    protected EntityStateBoolType seincreaseworkingsetprivilege;
    protected EntityStateBoolType seloaddriverprivilege;
    protected EntityStateBoolType selockmemoryprivilege;
    protected EntityStateBoolType semachineaccountprivilege;
    protected EntityStateBoolType semanagevolumeprivilege;
    protected EntityStateBoolType seprofilesingleprocessprivilege;
    protected EntityStateBoolType serelabelprivilege;
    protected EntityStateBoolType seremoteshutdownprivilege;
    protected EntityStateBoolType serestoreprivilege;
    protected EntityStateBoolType sesecurityprivilege;
    protected EntityStateBoolType seshutdownprivilege;
    protected EntityStateBoolType sesyncagentprivilege;
    protected EntityStateBoolType sesystemenvironmentprivilege;
    protected EntityStateBoolType sesystemprofileprivilege;
    protected EntityStateBoolType sesystemtimeprivilege;
    protected EntityStateBoolType setakeownershipprivilege;
    protected EntityStateBoolType setcbprivilege;
    protected EntityStateBoolType setimezoneprivilege;
    protected EntityStateBoolType seundockprivilege;
    protected EntityStateBoolType seunsolicitedinputprivilege;
    protected EntityStateBoolType sebatchlogonright;
    protected EntityStateBoolType seinteractivelogonright;
    protected EntityStateBoolType senetworklogonright;
    protected EntityStateBoolType seremoteinteractivelogonright;
    protected EntityStateBoolType seservicelogonright;
    protected EntityStateBoolType sedenybatchLogonright;
    protected EntityStateBoolType sedenyinteractivelogonright;
    protected EntityStateBoolType sedenynetworklogonright;
    protected EntityStateBoolType sedenyremoteInteractivelogonright;
    protected EntityStateBoolType sedenyservicelogonright;
    protected EntityStateBoolType setrustedcredmanaccessnameright;

    /**
     * securityPrinciple 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getSecurityPrinciple() {
        return securityPrinciple;
    }

    /**
     * securityPrinciple 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setSecurityPrinciple(EntityStateStringType value) {
        this.securityPrinciple = value;
    }

    /**
     * seassignprimarytokenprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSeassignprimarytokenprivilege() {
        return seassignprimarytokenprivilege;
    }

    /**
     * seassignprimarytokenprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSeassignprimarytokenprivilege(EntityStateBoolType value) {
        this.seassignprimarytokenprivilege = value;
    }

    /**
     * seauditprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSeauditprivilege() {
        return seauditprivilege;
    }

    /**
     * seauditprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSeauditprivilege(EntityStateBoolType value) {
        this.seauditprivilege = value;
    }

    /**
     * sebackupprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSebackupprivilege() {
        return sebackupprivilege;
    }

    /**
     * sebackupprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSebackupprivilege(EntityStateBoolType value) {
        this.sebackupprivilege = value;
    }

    /**
     * sechangenotifyprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSechangenotifyprivilege() {
        return sechangenotifyprivilege;
    }

    /**
     * sechangenotifyprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSechangenotifyprivilege(EntityStateBoolType value) {
        this.sechangenotifyprivilege = value;
    }

    /**
     * secreateglobalprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSecreateglobalprivilege() {
        return secreateglobalprivilege;
    }

    /**
     * secreateglobalprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSecreateglobalprivilege(EntityStateBoolType value) {
        this.secreateglobalprivilege = value;
    }

    /**
     * secreatepagefileprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSecreatepagefileprivilege() {
        return secreatepagefileprivilege;
    }

    /**
     * secreatepagefileprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSecreatepagefileprivilege(EntityStateBoolType value) {
        this.secreatepagefileprivilege = value;
    }

    /**
     * secreatepermanentprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSecreatepermanentprivilege() {
        return secreatepermanentprivilege;
    }

    /**
     * secreatepermanentprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSecreatepermanentprivilege(EntityStateBoolType value) {
        this.secreatepermanentprivilege = value;
    }

    /**
     * secreatesymboliclinkprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSecreatesymboliclinkprivilege() {
        return secreatesymboliclinkprivilege;
    }

    /**
     * secreatesymboliclinkprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSecreatesymboliclinkprivilege(EntityStateBoolType value) {
        this.secreatesymboliclinkprivilege = value;
    }

    /**
     * secreatetokenprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSecreatetokenprivilege() {
        return secreatetokenprivilege;
    }

    /**
     * secreatetokenprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSecreatetokenprivilege(EntityStateBoolType value) {
        this.secreatetokenprivilege = value;
    }

    /**
     * sedebugprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSedebugprivilege() {
        return sedebugprivilege;
    }

    /**
     * sedebugprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSedebugprivilege(EntityStateBoolType value) {
        this.sedebugprivilege = value;
    }

    /**
     * seenabledelegationprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSeenabledelegationprivilege() {
        return seenabledelegationprivilege;
    }

    /**
     * seenabledelegationprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSeenabledelegationprivilege(EntityStateBoolType value) {
        this.seenabledelegationprivilege = value;
    }

    /**
     * seimpersonateprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSeimpersonateprivilege() {
        return seimpersonateprivilege;
    }

    /**
     * seimpersonateprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSeimpersonateprivilege(EntityStateBoolType value) {
        this.seimpersonateprivilege = value;
    }

    /**
     * seincreasebasepriorityprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSeincreasebasepriorityprivilege() {
        return seincreasebasepriorityprivilege;
    }

    /**
     * seincreasebasepriorityprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSeincreasebasepriorityprivilege(EntityStateBoolType value) {
        this.seincreasebasepriorityprivilege = value;
    }

    /**
     * seincreasequotaprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSeincreasequotaprivilege() {
        return seincreasequotaprivilege;
    }

    /**
     * seincreasequotaprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSeincreasequotaprivilege(EntityStateBoolType value) {
        this.seincreasequotaprivilege = value;
    }

    /**
     * seincreaseworkingsetprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSeincreaseworkingsetprivilege() {
        return seincreaseworkingsetprivilege;
    }

    /**
     * seincreaseworkingsetprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSeincreaseworkingsetprivilege(EntityStateBoolType value) {
        this.seincreaseworkingsetprivilege = value;
    }

    /**
     * seloaddriverprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSeloaddriverprivilege() {
        return seloaddriverprivilege;
    }

    /**
     * seloaddriverprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSeloaddriverprivilege(EntityStateBoolType value) {
        this.seloaddriverprivilege = value;
    }

    /**
     * selockmemoryprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSelockmemoryprivilege() {
        return selockmemoryprivilege;
    }

    /**
     * selockmemoryprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSelockmemoryprivilege(EntityStateBoolType value) {
        this.selockmemoryprivilege = value;
    }

    /**
     * semachineaccountprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSemachineaccountprivilege() {
        return semachineaccountprivilege;
    }

    /**
     * semachineaccountprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSemachineaccountprivilege(EntityStateBoolType value) {
        this.semachineaccountprivilege = value;
    }

    /**
     * semanagevolumeprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSemanagevolumeprivilege() {
        return semanagevolumeprivilege;
    }

    /**
     * semanagevolumeprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSemanagevolumeprivilege(EntityStateBoolType value) {
        this.semanagevolumeprivilege = value;
    }

    /**
     * seprofilesingleprocessprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSeprofilesingleprocessprivilege() {
        return seprofilesingleprocessprivilege;
    }

    /**
     * seprofilesingleprocessprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSeprofilesingleprocessprivilege(EntityStateBoolType value) {
        this.seprofilesingleprocessprivilege = value;
    }

    /**
     * serelabelprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSerelabelprivilege() {
        return serelabelprivilege;
    }

    /**
     * serelabelprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSerelabelprivilege(EntityStateBoolType value) {
        this.serelabelprivilege = value;
    }

    /**
     * seremoteshutdownprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSeremoteshutdownprivilege() {
        return seremoteshutdownprivilege;
    }

    /**
     * seremoteshutdownprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSeremoteshutdownprivilege(EntityStateBoolType value) {
        this.seremoteshutdownprivilege = value;
    }

    /**
     * serestoreprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSerestoreprivilege() {
        return serestoreprivilege;
    }

    /**
     * serestoreprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSerestoreprivilege(EntityStateBoolType value) {
        this.serestoreprivilege = value;
    }

    /**
     * sesecurityprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSesecurityprivilege() {
        return sesecurityprivilege;
    }

    /**
     * sesecurityprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSesecurityprivilege(EntityStateBoolType value) {
        this.sesecurityprivilege = value;
    }

    /**
     * seshutdownprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSeshutdownprivilege() {
        return seshutdownprivilege;
    }

    /**
     * seshutdownprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSeshutdownprivilege(EntityStateBoolType value) {
        this.seshutdownprivilege = value;
    }

    /**
     * sesyncagentprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSesyncagentprivilege() {
        return sesyncagentprivilege;
    }

    /**
     * sesyncagentprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSesyncagentprivilege(EntityStateBoolType value) {
        this.sesyncagentprivilege = value;
    }

    /**
     * sesystemenvironmentprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSesystemenvironmentprivilege() {
        return sesystemenvironmentprivilege;
    }

    /**
     * sesystemenvironmentprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSesystemenvironmentprivilege(EntityStateBoolType value) {
        this.sesystemenvironmentprivilege = value;
    }

    /**
     * sesystemprofileprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSesystemprofileprivilege() {
        return sesystemprofileprivilege;
    }

    /**
     * sesystemprofileprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSesystemprofileprivilege(EntityStateBoolType value) {
        this.sesystemprofileprivilege = value;
    }

    /**
     * sesystemtimeprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSesystemtimeprivilege() {
        return sesystemtimeprivilege;
    }

    /**
     * sesystemtimeprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSesystemtimeprivilege(EntityStateBoolType value) {
        this.sesystemtimeprivilege = value;
    }

    /**
     * setakeownershipprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSetakeownershipprivilege() {
        return setakeownershipprivilege;
    }

    /**
     * setakeownershipprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSetakeownershipprivilege(EntityStateBoolType value) {
        this.setakeownershipprivilege = value;
    }

    /**
     * setcbprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSetcbprivilege() {
        return setcbprivilege;
    }

    /**
     * setcbprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSetcbprivilege(EntityStateBoolType value) {
        this.setcbprivilege = value;
    }

    /**
     * setimezoneprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSetimezoneprivilege() {
        return setimezoneprivilege;
    }

    /**
     * setimezoneprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSetimezoneprivilege(EntityStateBoolType value) {
        this.setimezoneprivilege = value;
    }

    /**
     * seundockprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSeundockprivilege() {
        return seundockprivilege;
    }

    /**
     * seundockprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSeundockprivilege(EntityStateBoolType value) {
        this.seundockprivilege = value;
    }

    /**
     * seunsolicitedinputprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSeunsolicitedinputprivilege() {
        return seunsolicitedinputprivilege;
    }

    /**
     * seunsolicitedinputprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSeunsolicitedinputprivilege(EntityStateBoolType value) {
        this.seunsolicitedinputprivilege = value;
    }

    /**
     * sebatchlogonright 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSebatchlogonright() {
        return sebatchlogonright;
    }

    /**
     * sebatchlogonright 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSebatchlogonright(EntityStateBoolType value) {
        this.sebatchlogonright = value;
    }

    /**
     * seinteractivelogonright 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSeinteractivelogonright() {
        return seinteractivelogonright;
    }

    /**
     * seinteractivelogonright 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSeinteractivelogonright(EntityStateBoolType value) {
        this.seinteractivelogonright = value;
    }

    /**
     * senetworklogonright 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSenetworklogonright() {
        return senetworklogonright;
    }

    /**
     * senetworklogonright 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSenetworklogonright(EntityStateBoolType value) {
        this.senetworklogonright = value;
    }

    /**
     * seremoteinteractivelogonright 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSeremoteinteractivelogonright() {
        return seremoteinteractivelogonright;
    }

    /**
     * seremoteinteractivelogonright 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSeremoteinteractivelogonright(EntityStateBoolType value) {
        this.seremoteinteractivelogonright = value;
    }

    /**
     * seservicelogonright 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSeservicelogonright() {
        return seservicelogonright;
    }

    /**
     * seservicelogonright 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSeservicelogonright(EntityStateBoolType value) {
        this.seservicelogonright = value;
    }

    /**
     * sedenybatchLogonright 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSedenybatchLogonright() {
        return sedenybatchLogonright;
    }

    /**
     * sedenybatchLogonright 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSedenybatchLogonright(EntityStateBoolType value) {
        this.sedenybatchLogonright = value;
    }

    /**
     * sedenyinteractivelogonright 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSedenyinteractivelogonright() {
        return sedenyinteractivelogonright;
    }

    /**
     * sedenyinteractivelogonright 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSedenyinteractivelogonright(EntityStateBoolType value) {
        this.sedenyinteractivelogonright = value;
    }

    /**
     * sedenynetworklogonright 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSedenynetworklogonright() {
        return sedenynetworklogonright;
    }

    /**
     * sedenynetworklogonright 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSedenynetworklogonright(EntityStateBoolType value) {
        this.sedenynetworklogonright = value;
    }

    /**
     * sedenyremoteInteractivelogonright 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSedenyremoteInteractivelogonright() {
        return sedenyremoteInteractivelogonright;
    }

    /**
     * sedenyremoteInteractivelogonright 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSedenyremoteInteractivelogonright(EntityStateBoolType value) {
        this.sedenyremoteInteractivelogonright = value;
    }

    /**
     * sedenyservicelogonright 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSedenyservicelogonright() {
        return sedenyservicelogonright;
    }

    /**
     * sedenyservicelogonright 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSedenyservicelogonright(EntityStateBoolType value) {
        this.sedenyservicelogonright = value;
    }

    /**
     * setrustedcredmanaccessnameright 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSetrustedcredmanaccessnameright() {
        return setrustedcredmanaccessnameright;
    }

    /**
     * setrustedcredmanaccessnameright 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSetrustedcredmanaccessnameright(EntityStateBoolType value) {
        this.setrustedcredmanaccessnameright = value;
    }

}
