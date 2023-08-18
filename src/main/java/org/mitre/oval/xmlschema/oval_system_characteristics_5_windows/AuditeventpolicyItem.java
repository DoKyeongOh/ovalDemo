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
 *         &lt;element name="account_logon" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="account_management" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="detailed_tracking" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="directory_service_access" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="logon" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="object_access" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="policy_change" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="privilege_use" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="system" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
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
public class AuditeventpolicyItem
    extends ItemType
{

    @XmlElement(name = "account_logon")
    protected EntityItemAuditType accountLogon;
    @XmlElement(name = "account_management")
    protected EntityItemAuditType accountManagement;
    @XmlElement(name = "detailed_tracking")
    protected EntityItemAuditType detailedTracking;
    @XmlElement(name = "directory_service_access")
    protected EntityItemAuditType directoryServiceAccess;
    protected EntityItemAuditType logon;
    @XmlElement(name = "object_access")
    protected EntityItemAuditType objectAccess;
    @XmlElement(name = "policy_change")
    protected EntityItemAuditType policyChange;
    @XmlElement(name = "privilege_use")
    protected EntityItemAuditType privilegeUse;
    protected EntityItemAuditType system;

    /**
     * accountLogon 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getAccountLogon() {
        return accountLogon;
    }

    /**
     * accountLogon 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setAccountLogon(EntityItemAuditType value) {
        this.accountLogon = value;
    }

    /**
     * accountManagement 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getAccountManagement() {
        return accountManagement;
    }

    /**
     * accountManagement 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setAccountManagement(EntityItemAuditType value) {
        this.accountManagement = value;
    }

    /**
     * detailedTracking 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getDetailedTracking() {
        return detailedTracking;
    }

    /**
     * detailedTracking 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setDetailedTracking(EntityItemAuditType value) {
        this.detailedTracking = value;
    }

    /**
     * directoryServiceAccess 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getDirectoryServiceAccess() {
        return directoryServiceAccess;
    }

    /**
     * directoryServiceAccess 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setDirectoryServiceAccess(EntityItemAuditType value) {
        this.directoryServiceAccess = value;
    }

    /**
     * logon 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getLogon() {
        return logon;
    }

    /**
     * logon 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setLogon(EntityItemAuditType value) {
        this.logon = value;
    }

    /**
     * objectAccess 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getObjectAccess() {
        return objectAccess;
    }

    /**
     * objectAccess 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setObjectAccess(EntityItemAuditType value) {
        this.objectAccess = value;
    }

    /**
     * policyChange 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getPolicyChange() {
        return policyChange;
    }

    /**
     * policyChange 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setPolicyChange(EntityItemAuditType value) {
        this.policyChange = value;
    }

    /**
     * privilegeUse 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getPrivilegeUse() {
        return privilegeUse;
    }

    /**
     * privilegeUse 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setPrivilegeUse(EntityItemAuditType value) {
        this.privilegeUse = value;
    }

    /**
     * system 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getSystem() {
        return system;
    }

    /**
     * system 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setSystem(EntityItemAuditType value) {
        this.system = value;
    }

}
