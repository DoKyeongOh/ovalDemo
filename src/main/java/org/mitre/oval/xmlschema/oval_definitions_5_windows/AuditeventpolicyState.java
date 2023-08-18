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
 *         &lt;element name="account_logon" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="account_management" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="detailed_tracking" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="directory_service_access" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="logon" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="object_access" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="policy_change" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="privilege_use" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="system" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
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
    "accountLogon",
    "accountManagement",
    "detailedTracking",
    "directoryServiceAccess",
    "logon",
    "objectAccess",
    "policyChange",
    "privilegeUse",
    "system"
})
public class AuditeventpolicyState
    extends StateType
{

    @XmlElement(name = "account_logon")
    protected EntityStateAuditType accountLogon;
    @XmlElement(name = "account_management")
    protected EntityStateAuditType accountManagement;
    @XmlElement(name = "detailed_tracking")
    protected EntityStateAuditType detailedTracking;
    @XmlElement(name = "directory_service_access")
    protected EntityStateAuditType directoryServiceAccess;
    protected EntityStateAuditType logon;
    @XmlElement(name = "object_access")
    protected EntityStateAuditType objectAccess;
    @XmlElement(name = "policy_change")
    protected EntityStateAuditType policyChange;
    @XmlElement(name = "privilege_use")
    protected EntityStateAuditType privilegeUse;
    protected EntityStateAuditType system;

    /**
     * accountLogon 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getAccountLogon() {
        return accountLogon;
    }

    /**
     * accountLogon 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setAccountLogon(EntityStateAuditType value) {
        this.accountLogon = value;
    }

    /**
     * accountManagement 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getAccountManagement() {
        return accountManagement;
    }

    /**
     * accountManagement 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setAccountManagement(EntityStateAuditType value) {
        this.accountManagement = value;
    }

    /**
     * detailedTracking 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getDetailedTracking() {
        return detailedTracking;
    }

    /**
     * detailedTracking 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setDetailedTracking(EntityStateAuditType value) {
        this.detailedTracking = value;
    }

    /**
     * directoryServiceAccess 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getDirectoryServiceAccess() {
        return directoryServiceAccess;
    }

    /**
     * directoryServiceAccess 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setDirectoryServiceAccess(EntityStateAuditType value) {
        this.directoryServiceAccess = value;
    }

    /**
     * logon 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getLogon() {
        return logon;
    }

    /**
     * logon 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setLogon(EntityStateAuditType value) {
        this.logon = value;
    }

    /**
     * objectAccess 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getObjectAccess() {
        return objectAccess;
    }

    /**
     * objectAccess 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setObjectAccess(EntityStateAuditType value) {
        this.objectAccess = value;
    }

    /**
     * policyChange 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getPolicyChange() {
        return policyChange;
    }

    /**
     * policyChange 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setPolicyChange(EntityStateAuditType value) {
        this.policyChange = value;
    }

    /**
     * privilegeUse 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getPrivilegeUse() {
        return privilegeUse;
    }

    /**
     * privilegeUse 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setPrivilegeUse(EntityStateAuditType value) {
        this.privilegeUse = value;
    }

    /**
     * system 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getSystem() {
        return system;
    }

    /**
     * system 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setSystem(EntityStateAuditType value) {
        this.system = value;
    }

}
