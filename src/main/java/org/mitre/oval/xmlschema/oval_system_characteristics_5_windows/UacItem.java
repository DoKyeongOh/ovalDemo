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
 *         &lt;element name="admin_approval_mode" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="elevation_prompt_admin" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="elevation_prompt_standard" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="detect_installations" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="elevate_signed_executables" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="elevate_uiaccess" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="run_admins_aam" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="secure_desktop" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="virtualize_write_failures" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
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
    "adminApprovalMode",
    "elevationPromptAdmin",
    "elevationPromptStandard",
    "detectInstallations",
    "elevateSignedExecutables",
    "elevateUiaccess",
    "runAdminsAam",
    "secureDesktop",
    "virtualizeWriteFailures"
})
public class UacItem
    extends ItemType
{

    @XmlElement(name = "admin_approval_mode")
    protected EntityItemBoolType adminApprovalMode;
    @XmlElement(name = "elevation_prompt_admin")
    protected EntityItemStringType elevationPromptAdmin;
    @XmlElement(name = "elevation_prompt_standard")
    protected EntityItemStringType elevationPromptStandard;
    @XmlElement(name = "detect_installations")
    protected EntityItemBoolType detectInstallations;
    @XmlElement(name = "elevate_signed_executables")
    protected EntityItemBoolType elevateSignedExecutables;
    @XmlElement(name = "elevate_uiaccess")
    protected EntityItemBoolType elevateUiaccess;
    @XmlElement(name = "run_admins_aam")
    protected EntityItemBoolType runAdminsAam;
    @XmlElement(name = "secure_desktop")
    protected EntityItemBoolType secureDesktop;
    @XmlElement(name = "virtualize_write_failures")
    protected EntityItemBoolType virtualizeWriteFailures;

    /**
     * adminApprovalMode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAdminApprovalMode() {
        return adminApprovalMode;
    }

    /**
     * adminApprovalMode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAdminApprovalMode(EntityItemBoolType value) {
        this.adminApprovalMode = value;
    }

    /**
     * elevationPromptAdmin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getElevationPromptAdmin() {
        return elevationPromptAdmin;
    }

    /**
     * elevationPromptAdmin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setElevationPromptAdmin(EntityItemStringType value) {
        this.elevationPromptAdmin = value;
    }

    /**
     * elevationPromptStandard 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getElevationPromptStandard() {
        return elevationPromptStandard;
    }

    /**
     * elevationPromptStandard 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setElevationPromptStandard(EntityItemStringType value) {
        this.elevationPromptStandard = value;
    }

    /**
     * detectInstallations 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getDetectInstallations() {
        return detectInstallations;
    }

    /**
     * detectInstallations 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setDetectInstallations(EntityItemBoolType value) {
        this.detectInstallations = value;
    }

    /**
     * elevateSignedExecutables 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getElevateSignedExecutables() {
        return elevateSignedExecutables;
    }

    /**
     * elevateSignedExecutables 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setElevateSignedExecutables(EntityItemBoolType value) {
        this.elevateSignedExecutables = value;
    }

    /**
     * elevateUiaccess 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getElevateUiaccess() {
        return elevateUiaccess;
    }

    /**
     * elevateUiaccess 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setElevateUiaccess(EntityItemBoolType value) {
        this.elevateUiaccess = value;
    }

    /**
     * runAdminsAam 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getRunAdminsAam() {
        return runAdminsAam;
    }

    /**
     * runAdminsAam 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setRunAdminsAam(EntityItemBoolType value) {
        this.runAdminsAam = value;
    }

    /**
     * secureDesktop 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSecureDesktop() {
        return secureDesktop;
    }

    /**
     * secureDesktop 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSecureDesktop(EntityItemBoolType value) {
        this.secureDesktop = value;
    }

    /**
     * virtualizeWriteFailures 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getVirtualizeWriteFailures() {
        return virtualizeWriteFailures;
    }

    /**
     * virtualizeWriteFailures 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setVirtualizeWriteFailures(EntityItemBoolType value) {
        this.virtualizeWriteFailures = value;
    }

}
