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
 *         &lt;element name="admin_approval_mode" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="elevation_prompt_admin" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="elevation_prompt_standard" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="detect_installations" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="elevate_signed_executables" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="elevate_uiaccess" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="run_admins_aam" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="secure_desktop" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="virtualize_write_failures" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
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
public class UacState
    extends StateType
{

    @XmlElement(name = "admin_approval_mode")
    protected EntityStateBoolType adminApprovalMode;
    @XmlElement(name = "elevation_prompt_admin")
    protected EntityStateStringType elevationPromptAdmin;
    @XmlElement(name = "elevation_prompt_standard")
    protected EntityStateStringType elevationPromptStandard;
    @XmlElement(name = "detect_installations")
    protected EntityStateBoolType detectInstallations;
    @XmlElement(name = "elevate_signed_executables")
    protected EntityStateBoolType elevateSignedExecutables;
    @XmlElement(name = "elevate_uiaccess")
    protected EntityStateBoolType elevateUiaccess;
    @XmlElement(name = "run_admins_aam")
    protected EntityStateBoolType runAdminsAam;
    @XmlElement(name = "secure_desktop")
    protected EntityStateBoolType secureDesktop;
    @XmlElement(name = "virtualize_write_failures")
    protected EntityStateBoolType virtualizeWriteFailures;

    /**
     * adminApprovalMode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAdminApprovalMode() {
        return adminApprovalMode;
    }

    /**
     * adminApprovalMode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAdminApprovalMode(EntityStateBoolType value) {
        this.adminApprovalMode = value;
    }

    /**
     * elevationPromptAdmin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getElevationPromptAdmin() {
        return elevationPromptAdmin;
    }

    /**
     * elevationPromptAdmin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setElevationPromptAdmin(EntityStateStringType value) {
        this.elevationPromptAdmin = value;
    }

    /**
     * elevationPromptStandard 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getElevationPromptStandard() {
        return elevationPromptStandard;
    }

    /**
     * elevationPromptStandard 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setElevationPromptStandard(EntityStateStringType value) {
        this.elevationPromptStandard = value;
    }

    /**
     * detectInstallations 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getDetectInstallations() {
        return detectInstallations;
    }

    /**
     * detectInstallations 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setDetectInstallations(EntityStateBoolType value) {
        this.detectInstallations = value;
    }

    /**
     * elevateSignedExecutables 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getElevateSignedExecutables() {
        return elevateSignedExecutables;
    }

    /**
     * elevateSignedExecutables 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setElevateSignedExecutables(EntityStateBoolType value) {
        this.elevateSignedExecutables = value;
    }

    /**
     * elevateUiaccess 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getElevateUiaccess() {
        return elevateUiaccess;
    }

    /**
     * elevateUiaccess 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setElevateUiaccess(EntityStateBoolType value) {
        this.elevateUiaccess = value;
    }

    /**
     * runAdminsAam 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getRunAdminsAam() {
        return runAdminsAam;
    }

    /**
     * runAdminsAam 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setRunAdminsAam(EntityStateBoolType value) {
        this.runAdminsAam = value;
    }

    /**
     * secureDesktop 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSecureDesktop() {
        return secureDesktop;
    }

    /**
     * secureDesktop 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSecureDesktop(EntityStateBoolType value) {
        this.secureDesktop = value;
    }

    /**
     * virtualizeWriteFailures 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getVirtualizeWriteFailures() {
        return virtualizeWriteFailures;
    }

    /**
     * virtualizeWriteFailures 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setVirtualizeWriteFailures(EntityStateBoolType value) {
        this.virtualizeWriteFailures = value;
    }

}
