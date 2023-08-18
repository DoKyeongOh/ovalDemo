//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_windows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemBoolType;
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
 *         &lt;element name="security_principle" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="seassignprimarytokenprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="seauditprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="sebackupprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="sechangenotifyprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="secreateglobalprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="secreatepagefileprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="secreatepermanentprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="secreatesymboliclinkprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="secreatetokenprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="sedebugprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="seenabledelegationprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="seimpersonateprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="seincreasebasepriorityprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="seincreasequotaprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="seincreaseworkingsetprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="seloaddriverprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="selockmemoryprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="semachineaccountprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="semanagevolumeprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="seprofilesingleprocessprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="serelabelprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="seremoteshutdownprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="serestoreprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="sesecurityprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="seshutdownprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="sesyncagentprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="sesystemenvironmentprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="sesystemprofileprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="sesystemtimeprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="setakeownershipprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="setcbprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="setimezoneprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="seundockprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="seunsolicitedinputprivilege" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="sebatchlogonright" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="seinteractivelogonright" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="senetworklogonright" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="seremoteinteractivelogonright" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="seservicelogonright" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="sedenybatchLogonright" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="sedenyinteractivelogonright" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="sedenynetworklogonright" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="sedenyremoteInteractivelogonright" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="sedenyservicelogonright" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="setrustedcredmanaccessnameright" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
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
public class AccesstokenItem
    extends ItemType
{

    @XmlElement(name = "security_principle")
    protected EntityItemStringType securityPrinciple;
    protected EntityItemBoolType seassignprimarytokenprivilege;
    protected EntityItemBoolType seauditprivilege;
    protected EntityItemBoolType sebackupprivilege;
    protected EntityItemBoolType sechangenotifyprivilege;
    protected EntityItemBoolType secreateglobalprivilege;
    protected EntityItemBoolType secreatepagefileprivilege;
    protected EntityItemBoolType secreatepermanentprivilege;
    protected EntityItemBoolType secreatesymboliclinkprivilege;
    protected EntityItemBoolType secreatetokenprivilege;
    protected EntityItemBoolType sedebugprivilege;
    protected EntityItemBoolType seenabledelegationprivilege;
    protected EntityItemBoolType seimpersonateprivilege;
    protected EntityItemBoolType seincreasebasepriorityprivilege;
    protected EntityItemBoolType seincreasequotaprivilege;
    protected EntityItemBoolType seincreaseworkingsetprivilege;
    protected EntityItemBoolType seloaddriverprivilege;
    protected EntityItemBoolType selockmemoryprivilege;
    protected EntityItemBoolType semachineaccountprivilege;
    protected EntityItemBoolType semanagevolumeprivilege;
    protected EntityItemBoolType seprofilesingleprocessprivilege;
    protected EntityItemBoolType serelabelprivilege;
    protected EntityItemBoolType seremoteshutdownprivilege;
    protected EntityItemBoolType serestoreprivilege;
    protected EntityItemBoolType sesecurityprivilege;
    protected EntityItemBoolType seshutdownprivilege;
    protected EntityItemBoolType sesyncagentprivilege;
    protected EntityItemBoolType sesystemenvironmentprivilege;
    protected EntityItemBoolType sesystemprofileprivilege;
    protected EntityItemBoolType sesystemtimeprivilege;
    protected EntityItemBoolType setakeownershipprivilege;
    protected EntityItemBoolType setcbprivilege;
    protected EntityItemBoolType setimezoneprivilege;
    protected EntityItemBoolType seundockprivilege;
    protected EntityItemBoolType seunsolicitedinputprivilege;
    protected EntityItemBoolType sebatchlogonright;
    protected EntityItemBoolType seinteractivelogonright;
    protected EntityItemBoolType senetworklogonright;
    protected EntityItemBoolType seremoteinteractivelogonright;
    protected EntityItemBoolType seservicelogonright;
    protected EntityItemBoolType sedenybatchLogonright;
    protected EntityItemBoolType sedenyinteractivelogonright;
    protected EntityItemBoolType sedenynetworklogonright;
    protected EntityItemBoolType sedenyremoteInteractivelogonright;
    protected EntityItemBoolType sedenyservicelogonright;
    protected EntityItemBoolType setrustedcredmanaccessnameright;

    /**
     * securityPrinciple 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getSecurityPrinciple() {
        return securityPrinciple;
    }

    /**
     * securityPrinciple 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setSecurityPrinciple(EntityItemStringType value) {
        this.securityPrinciple = value;
    }

    /**
     * seassignprimarytokenprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSeassignprimarytokenprivilege() {
        return seassignprimarytokenprivilege;
    }

    /**
     * seassignprimarytokenprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSeassignprimarytokenprivilege(EntityItemBoolType value) {
        this.seassignprimarytokenprivilege = value;
    }

    /**
     * seauditprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSeauditprivilege() {
        return seauditprivilege;
    }

    /**
     * seauditprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSeauditprivilege(EntityItemBoolType value) {
        this.seauditprivilege = value;
    }

    /**
     * sebackupprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSebackupprivilege() {
        return sebackupprivilege;
    }

    /**
     * sebackupprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSebackupprivilege(EntityItemBoolType value) {
        this.sebackupprivilege = value;
    }

    /**
     * sechangenotifyprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSechangenotifyprivilege() {
        return sechangenotifyprivilege;
    }

    /**
     * sechangenotifyprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSechangenotifyprivilege(EntityItemBoolType value) {
        this.sechangenotifyprivilege = value;
    }

    /**
     * secreateglobalprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSecreateglobalprivilege() {
        return secreateglobalprivilege;
    }

    /**
     * secreateglobalprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSecreateglobalprivilege(EntityItemBoolType value) {
        this.secreateglobalprivilege = value;
    }

    /**
     * secreatepagefileprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSecreatepagefileprivilege() {
        return secreatepagefileprivilege;
    }

    /**
     * secreatepagefileprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSecreatepagefileprivilege(EntityItemBoolType value) {
        this.secreatepagefileprivilege = value;
    }

    /**
     * secreatepermanentprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSecreatepermanentprivilege() {
        return secreatepermanentprivilege;
    }

    /**
     * secreatepermanentprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSecreatepermanentprivilege(EntityItemBoolType value) {
        this.secreatepermanentprivilege = value;
    }

    /**
     * secreatesymboliclinkprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSecreatesymboliclinkprivilege() {
        return secreatesymboliclinkprivilege;
    }

    /**
     * secreatesymboliclinkprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSecreatesymboliclinkprivilege(EntityItemBoolType value) {
        this.secreatesymboliclinkprivilege = value;
    }

    /**
     * secreatetokenprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSecreatetokenprivilege() {
        return secreatetokenprivilege;
    }

    /**
     * secreatetokenprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSecreatetokenprivilege(EntityItemBoolType value) {
        this.secreatetokenprivilege = value;
    }

    /**
     * sedebugprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSedebugprivilege() {
        return sedebugprivilege;
    }

    /**
     * sedebugprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSedebugprivilege(EntityItemBoolType value) {
        this.sedebugprivilege = value;
    }

    /**
     * seenabledelegationprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSeenabledelegationprivilege() {
        return seenabledelegationprivilege;
    }

    /**
     * seenabledelegationprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSeenabledelegationprivilege(EntityItemBoolType value) {
        this.seenabledelegationprivilege = value;
    }

    /**
     * seimpersonateprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSeimpersonateprivilege() {
        return seimpersonateprivilege;
    }

    /**
     * seimpersonateprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSeimpersonateprivilege(EntityItemBoolType value) {
        this.seimpersonateprivilege = value;
    }

    /**
     * seincreasebasepriorityprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSeincreasebasepriorityprivilege() {
        return seincreasebasepriorityprivilege;
    }

    /**
     * seincreasebasepriorityprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSeincreasebasepriorityprivilege(EntityItemBoolType value) {
        this.seincreasebasepriorityprivilege = value;
    }

    /**
     * seincreasequotaprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSeincreasequotaprivilege() {
        return seincreasequotaprivilege;
    }

    /**
     * seincreasequotaprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSeincreasequotaprivilege(EntityItemBoolType value) {
        this.seincreasequotaprivilege = value;
    }

    /**
     * seincreaseworkingsetprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSeincreaseworkingsetprivilege() {
        return seincreaseworkingsetprivilege;
    }

    /**
     * seincreaseworkingsetprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSeincreaseworkingsetprivilege(EntityItemBoolType value) {
        this.seincreaseworkingsetprivilege = value;
    }

    /**
     * seloaddriverprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSeloaddriverprivilege() {
        return seloaddriverprivilege;
    }

    /**
     * seloaddriverprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSeloaddriverprivilege(EntityItemBoolType value) {
        this.seloaddriverprivilege = value;
    }

    /**
     * selockmemoryprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSelockmemoryprivilege() {
        return selockmemoryprivilege;
    }

    /**
     * selockmemoryprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSelockmemoryprivilege(EntityItemBoolType value) {
        this.selockmemoryprivilege = value;
    }

    /**
     * semachineaccountprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSemachineaccountprivilege() {
        return semachineaccountprivilege;
    }

    /**
     * semachineaccountprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSemachineaccountprivilege(EntityItemBoolType value) {
        this.semachineaccountprivilege = value;
    }

    /**
     * semanagevolumeprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSemanagevolumeprivilege() {
        return semanagevolumeprivilege;
    }

    /**
     * semanagevolumeprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSemanagevolumeprivilege(EntityItemBoolType value) {
        this.semanagevolumeprivilege = value;
    }

    /**
     * seprofilesingleprocessprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSeprofilesingleprocessprivilege() {
        return seprofilesingleprocessprivilege;
    }

    /**
     * seprofilesingleprocessprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSeprofilesingleprocessprivilege(EntityItemBoolType value) {
        this.seprofilesingleprocessprivilege = value;
    }

    /**
     * serelabelprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSerelabelprivilege() {
        return serelabelprivilege;
    }

    /**
     * serelabelprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSerelabelprivilege(EntityItemBoolType value) {
        this.serelabelprivilege = value;
    }

    /**
     * seremoteshutdownprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSeremoteshutdownprivilege() {
        return seremoteshutdownprivilege;
    }

    /**
     * seremoteshutdownprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSeremoteshutdownprivilege(EntityItemBoolType value) {
        this.seremoteshutdownprivilege = value;
    }

    /**
     * serestoreprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSerestoreprivilege() {
        return serestoreprivilege;
    }

    /**
     * serestoreprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSerestoreprivilege(EntityItemBoolType value) {
        this.serestoreprivilege = value;
    }

    /**
     * sesecurityprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSesecurityprivilege() {
        return sesecurityprivilege;
    }

    /**
     * sesecurityprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSesecurityprivilege(EntityItemBoolType value) {
        this.sesecurityprivilege = value;
    }

    /**
     * seshutdownprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSeshutdownprivilege() {
        return seshutdownprivilege;
    }

    /**
     * seshutdownprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSeshutdownprivilege(EntityItemBoolType value) {
        this.seshutdownprivilege = value;
    }

    /**
     * sesyncagentprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSesyncagentprivilege() {
        return sesyncagentprivilege;
    }

    /**
     * sesyncagentprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSesyncagentprivilege(EntityItemBoolType value) {
        this.sesyncagentprivilege = value;
    }

    /**
     * sesystemenvironmentprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSesystemenvironmentprivilege() {
        return sesystemenvironmentprivilege;
    }

    /**
     * sesystemenvironmentprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSesystemenvironmentprivilege(EntityItemBoolType value) {
        this.sesystemenvironmentprivilege = value;
    }

    /**
     * sesystemprofileprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSesystemprofileprivilege() {
        return sesystemprofileprivilege;
    }

    /**
     * sesystemprofileprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSesystemprofileprivilege(EntityItemBoolType value) {
        this.sesystemprofileprivilege = value;
    }

    /**
     * sesystemtimeprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSesystemtimeprivilege() {
        return sesystemtimeprivilege;
    }

    /**
     * sesystemtimeprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSesystemtimeprivilege(EntityItemBoolType value) {
        this.sesystemtimeprivilege = value;
    }

    /**
     * setakeownershipprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSetakeownershipprivilege() {
        return setakeownershipprivilege;
    }

    /**
     * setakeownershipprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSetakeownershipprivilege(EntityItemBoolType value) {
        this.setakeownershipprivilege = value;
    }

    /**
     * setcbprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSetcbprivilege() {
        return setcbprivilege;
    }

    /**
     * setcbprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSetcbprivilege(EntityItemBoolType value) {
        this.setcbprivilege = value;
    }

    /**
     * setimezoneprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSetimezoneprivilege() {
        return setimezoneprivilege;
    }

    /**
     * setimezoneprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSetimezoneprivilege(EntityItemBoolType value) {
        this.setimezoneprivilege = value;
    }

    /**
     * seundockprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSeundockprivilege() {
        return seundockprivilege;
    }

    /**
     * seundockprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSeundockprivilege(EntityItemBoolType value) {
        this.seundockprivilege = value;
    }

    /**
     * seunsolicitedinputprivilege 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSeunsolicitedinputprivilege() {
        return seunsolicitedinputprivilege;
    }

    /**
     * seunsolicitedinputprivilege 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSeunsolicitedinputprivilege(EntityItemBoolType value) {
        this.seunsolicitedinputprivilege = value;
    }

    /**
     * sebatchlogonright 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSebatchlogonright() {
        return sebatchlogonright;
    }

    /**
     * sebatchlogonright 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSebatchlogonright(EntityItemBoolType value) {
        this.sebatchlogonright = value;
    }

    /**
     * seinteractivelogonright 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSeinteractivelogonright() {
        return seinteractivelogonright;
    }

    /**
     * seinteractivelogonright 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSeinteractivelogonright(EntityItemBoolType value) {
        this.seinteractivelogonright = value;
    }

    /**
     * senetworklogonright 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSenetworklogonright() {
        return senetworklogonright;
    }

    /**
     * senetworklogonright 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSenetworklogonright(EntityItemBoolType value) {
        this.senetworklogonright = value;
    }

    /**
     * seremoteinteractivelogonright 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSeremoteinteractivelogonright() {
        return seremoteinteractivelogonright;
    }

    /**
     * seremoteinteractivelogonright 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSeremoteinteractivelogonright(EntityItemBoolType value) {
        this.seremoteinteractivelogonright = value;
    }

    /**
     * seservicelogonright 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSeservicelogonright() {
        return seservicelogonright;
    }

    /**
     * seservicelogonright 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSeservicelogonright(EntityItemBoolType value) {
        this.seservicelogonright = value;
    }

    /**
     * sedenybatchLogonright 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSedenybatchLogonright() {
        return sedenybatchLogonright;
    }

    /**
     * sedenybatchLogonright 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSedenybatchLogonright(EntityItemBoolType value) {
        this.sedenybatchLogonright = value;
    }

    /**
     * sedenyinteractivelogonright 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSedenyinteractivelogonright() {
        return sedenyinteractivelogonright;
    }

    /**
     * sedenyinteractivelogonright 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSedenyinteractivelogonright(EntityItemBoolType value) {
        this.sedenyinteractivelogonright = value;
    }

    /**
     * sedenynetworklogonright 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSedenynetworklogonright() {
        return sedenynetworklogonright;
    }

    /**
     * sedenynetworklogonright 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSedenynetworklogonright(EntityItemBoolType value) {
        this.sedenynetworklogonright = value;
    }

    /**
     * sedenyremoteInteractivelogonright 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSedenyremoteInteractivelogonright() {
        return sedenyremoteInteractivelogonright;
    }

    /**
     * sedenyremoteInteractivelogonright 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSedenyremoteInteractivelogonright(EntityItemBoolType value) {
        this.sedenyremoteInteractivelogonright = value;
    }

    /**
     * sedenyservicelogonright 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSedenyservicelogonright() {
        return sedenyservicelogonright;
    }

    /**
     * sedenyservicelogonright 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSedenyservicelogonright(EntityItemBoolType value) {
        this.sedenyservicelogonright = value;
    }

    /**
     * setrustedcredmanaccessnameright 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSetrustedcredmanaccessnameright() {
        return setrustedcredmanaccessnameright;
    }

    /**
     * setrustedcredmanaccessnameright 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSetrustedcredmanaccessnameright(EntityItemBoolType value) {
        this.setrustedcredmanaccessnameright = value;
    }

}
