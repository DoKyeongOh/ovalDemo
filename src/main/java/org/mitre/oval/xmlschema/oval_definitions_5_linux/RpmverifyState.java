//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5_linux;

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
 *         &lt;element name="name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="filepath" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="size_differs" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#linux}EntityStateRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="mode_differs" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#linux}EntityStateRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="md5_differs" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#linux}EntityStateRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="device_differs" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#linux}EntityStateRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="link_mismatch" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#linux}EntityStateRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="ownership_differs" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#linux}EntityStateRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="group_differs" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#linux}EntityStateRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="mtime_differs" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#linux}EntityStateRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="capabilities_differ" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#linux}EntityStateRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="configuration_file" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="documentation_file" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="ghost_file" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="license_file" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="readme_file" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
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
    "name",
    "filepath",
    "sizeDiffers",
    "modeDiffers",
    "md5Differs",
    "deviceDiffers",
    "linkMismatch",
    "ownershipDiffers",
    "groupDiffers",
    "mtimeDiffers",
    "capabilitiesDiffer",
    "configurationFile",
    "documentationFile",
    "ghostFile",
    "licenseFile",
    "readmeFile"
})
public class RpmverifyState
    extends StateType
{

    protected EntityStateStringType name;
    protected EntityStateStringType filepath;
    @XmlElement(name = "size_differs")
    protected EntityStateRpmVerifyResultType sizeDiffers;
    @XmlElement(name = "mode_differs")
    protected EntityStateRpmVerifyResultType modeDiffers;
    @XmlElement(name = "md5_differs")
    protected EntityStateRpmVerifyResultType md5Differs;
    @XmlElement(name = "device_differs")
    protected EntityStateRpmVerifyResultType deviceDiffers;
    @XmlElement(name = "link_mismatch")
    protected EntityStateRpmVerifyResultType linkMismatch;
    @XmlElement(name = "ownership_differs")
    protected EntityStateRpmVerifyResultType ownershipDiffers;
    @XmlElement(name = "group_differs")
    protected EntityStateRpmVerifyResultType groupDiffers;
    @XmlElement(name = "mtime_differs")
    protected EntityStateRpmVerifyResultType mtimeDiffers;
    @XmlElement(name = "capabilities_differ")
    protected EntityStateRpmVerifyResultType capabilitiesDiffer;
    @XmlElement(name = "configuration_file")
    protected EntityStateBoolType configurationFile;
    @XmlElement(name = "documentation_file")
    protected EntityStateBoolType documentationFile;
    @XmlElement(name = "ghost_file")
    protected EntityStateBoolType ghostFile;
    @XmlElement(name = "license_file")
    protected EntityStateBoolType licenseFile;
    @XmlElement(name = "readme_file")
    protected EntityStateBoolType readmeFile;

    /**
     * name 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getName() {
        return name;
    }

    /**
     * name 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setName(EntityStateStringType value) {
        this.name = value;
    }

    /**
     * filepath 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getFilepath() {
        return filepath;
    }

    /**
     * filepath 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setFilepath(EntityStateStringType value) {
        this.filepath = value;
    }

    /**
     * sizeDiffers 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateRpmVerifyResultType }
     *     
     */
    public EntityStateRpmVerifyResultType getSizeDiffers() {
        return sizeDiffers;
    }

    /**
     * sizeDiffers 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateRpmVerifyResultType }
     *     
     */
    public void setSizeDiffers(EntityStateRpmVerifyResultType value) {
        this.sizeDiffers = value;
    }

    /**
     * modeDiffers 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateRpmVerifyResultType }
     *     
     */
    public EntityStateRpmVerifyResultType getModeDiffers() {
        return modeDiffers;
    }

    /**
     * modeDiffers 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateRpmVerifyResultType }
     *     
     */
    public void setModeDiffers(EntityStateRpmVerifyResultType value) {
        this.modeDiffers = value;
    }

    /**
     * md5Differs 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateRpmVerifyResultType }
     *     
     */
    public EntityStateRpmVerifyResultType getMd5Differs() {
        return md5Differs;
    }

    /**
     * md5Differs 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateRpmVerifyResultType }
     *     
     */
    public void setMd5Differs(EntityStateRpmVerifyResultType value) {
        this.md5Differs = value;
    }

    /**
     * deviceDiffers 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateRpmVerifyResultType }
     *     
     */
    public EntityStateRpmVerifyResultType getDeviceDiffers() {
        return deviceDiffers;
    }

    /**
     * deviceDiffers 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateRpmVerifyResultType }
     *     
     */
    public void setDeviceDiffers(EntityStateRpmVerifyResultType value) {
        this.deviceDiffers = value;
    }

    /**
     * linkMismatch 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateRpmVerifyResultType }
     *     
     */
    public EntityStateRpmVerifyResultType getLinkMismatch() {
        return linkMismatch;
    }

    /**
     * linkMismatch 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateRpmVerifyResultType }
     *     
     */
    public void setLinkMismatch(EntityStateRpmVerifyResultType value) {
        this.linkMismatch = value;
    }

    /**
     * ownershipDiffers 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateRpmVerifyResultType }
     *     
     */
    public EntityStateRpmVerifyResultType getOwnershipDiffers() {
        return ownershipDiffers;
    }

    /**
     * ownershipDiffers 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateRpmVerifyResultType }
     *     
     */
    public void setOwnershipDiffers(EntityStateRpmVerifyResultType value) {
        this.ownershipDiffers = value;
    }

    /**
     * groupDiffers 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateRpmVerifyResultType }
     *     
     */
    public EntityStateRpmVerifyResultType getGroupDiffers() {
        return groupDiffers;
    }

    /**
     * groupDiffers 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateRpmVerifyResultType }
     *     
     */
    public void setGroupDiffers(EntityStateRpmVerifyResultType value) {
        this.groupDiffers = value;
    }

    /**
     * mtimeDiffers 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateRpmVerifyResultType }
     *     
     */
    public EntityStateRpmVerifyResultType getMtimeDiffers() {
        return mtimeDiffers;
    }

    /**
     * mtimeDiffers 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateRpmVerifyResultType }
     *     
     */
    public void setMtimeDiffers(EntityStateRpmVerifyResultType value) {
        this.mtimeDiffers = value;
    }

    /**
     * capabilitiesDiffer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateRpmVerifyResultType }
     *     
     */
    public EntityStateRpmVerifyResultType getCapabilitiesDiffer() {
        return capabilitiesDiffer;
    }

    /**
     * capabilitiesDiffer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateRpmVerifyResultType }
     *     
     */
    public void setCapabilitiesDiffer(EntityStateRpmVerifyResultType value) {
        this.capabilitiesDiffer = value;
    }

    /**
     * configurationFile 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getConfigurationFile() {
        return configurationFile;
    }

    /**
     * configurationFile 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setConfigurationFile(EntityStateBoolType value) {
        this.configurationFile = value;
    }

    /**
     * documentationFile 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getDocumentationFile() {
        return documentationFile;
    }

    /**
     * documentationFile 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setDocumentationFile(EntityStateBoolType value) {
        this.documentationFile = value;
    }

    /**
     * ghostFile 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getGhostFile() {
        return ghostFile;
    }

    /**
     * ghostFile 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setGhostFile(EntityStateBoolType value) {
        this.ghostFile = value;
    }

    /**
     * licenseFile 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getLicenseFile() {
        return licenseFile;
    }

    /**
     * licenseFile 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setLicenseFile(EntityStateBoolType value) {
        this.licenseFile = value;
    }

    /**
     * readmeFile 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getReadmeFile() {
        return readmeFile;
    }

    /**
     * readmeFile 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setReadmeFile(EntityStateBoolType value) {
        this.readmeFile = value;
    }

}
