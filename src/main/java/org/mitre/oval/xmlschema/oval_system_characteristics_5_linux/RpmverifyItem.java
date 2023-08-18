//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_linux;

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
 *         &lt;element name="name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="filepath" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="size_differs" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux}EntityItemRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="mode_differs" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux}EntityItemRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="md5_differs" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux}EntityItemRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="device_differs" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux}EntityItemRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="link_mismatch" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux}EntityItemRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="ownership_differs" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux}EntityItemRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="group_differs" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux}EntityItemRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="mtime_differs" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux}EntityItemRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="capabilities_differ" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux}EntityItemRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="configuration_file" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="documentation_file" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="ghost_file" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="license_file" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="readme_file" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
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
public class RpmverifyItem
    extends ItemType
{

    protected EntityItemStringType name;
    protected EntityItemStringType filepath;
    @XmlElement(name = "size_differs")
    protected EntityItemRpmVerifyResultType sizeDiffers;
    @XmlElement(name = "mode_differs")
    protected EntityItemRpmVerifyResultType modeDiffers;
    @XmlElement(name = "md5_differs")
    protected EntityItemRpmVerifyResultType md5Differs;
    @XmlElement(name = "device_differs")
    protected EntityItemRpmVerifyResultType deviceDiffers;
    @XmlElement(name = "link_mismatch")
    protected EntityItemRpmVerifyResultType linkMismatch;
    @XmlElement(name = "ownership_differs")
    protected EntityItemRpmVerifyResultType ownershipDiffers;
    @XmlElement(name = "group_differs")
    protected EntityItemRpmVerifyResultType groupDiffers;
    @XmlElement(name = "mtime_differs")
    protected EntityItemRpmVerifyResultType mtimeDiffers;
    @XmlElement(name = "capabilities_differ")
    protected EntityItemRpmVerifyResultType capabilitiesDiffer;
    @XmlElement(name = "configuration_file")
    protected EntityItemBoolType configurationFile;
    @XmlElement(name = "documentation_file")
    protected EntityItemBoolType documentationFile;
    @XmlElement(name = "ghost_file")
    protected EntityItemBoolType ghostFile;
    @XmlElement(name = "license_file")
    protected EntityItemBoolType licenseFile;
    @XmlElement(name = "readme_file")
    protected EntityItemBoolType readmeFile;

    /**
     * name 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getName() {
        return name;
    }

    /**
     * name 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setName(EntityItemStringType value) {
        this.name = value;
    }

    /**
     * filepath 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getFilepath() {
        return filepath;
    }

    /**
     * filepath 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setFilepath(EntityItemStringType value) {
        this.filepath = value;
    }

    /**
     * sizeDiffers 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public EntityItemRpmVerifyResultType getSizeDiffers() {
        return sizeDiffers;
    }

    /**
     * sizeDiffers 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public void setSizeDiffers(EntityItemRpmVerifyResultType value) {
        this.sizeDiffers = value;
    }

    /**
     * modeDiffers 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public EntityItemRpmVerifyResultType getModeDiffers() {
        return modeDiffers;
    }

    /**
     * modeDiffers 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public void setModeDiffers(EntityItemRpmVerifyResultType value) {
        this.modeDiffers = value;
    }

    /**
     * md5Differs 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public EntityItemRpmVerifyResultType getMd5Differs() {
        return md5Differs;
    }

    /**
     * md5Differs 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public void setMd5Differs(EntityItemRpmVerifyResultType value) {
        this.md5Differs = value;
    }

    /**
     * deviceDiffers 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public EntityItemRpmVerifyResultType getDeviceDiffers() {
        return deviceDiffers;
    }

    /**
     * deviceDiffers 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public void setDeviceDiffers(EntityItemRpmVerifyResultType value) {
        this.deviceDiffers = value;
    }

    /**
     * linkMismatch 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public EntityItemRpmVerifyResultType getLinkMismatch() {
        return linkMismatch;
    }

    /**
     * linkMismatch 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public void setLinkMismatch(EntityItemRpmVerifyResultType value) {
        this.linkMismatch = value;
    }

    /**
     * ownershipDiffers 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public EntityItemRpmVerifyResultType getOwnershipDiffers() {
        return ownershipDiffers;
    }

    /**
     * ownershipDiffers 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public void setOwnershipDiffers(EntityItemRpmVerifyResultType value) {
        this.ownershipDiffers = value;
    }

    /**
     * groupDiffers 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public EntityItemRpmVerifyResultType getGroupDiffers() {
        return groupDiffers;
    }

    /**
     * groupDiffers 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public void setGroupDiffers(EntityItemRpmVerifyResultType value) {
        this.groupDiffers = value;
    }

    /**
     * mtimeDiffers 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public EntityItemRpmVerifyResultType getMtimeDiffers() {
        return mtimeDiffers;
    }

    /**
     * mtimeDiffers 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public void setMtimeDiffers(EntityItemRpmVerifyResultType value) {
        this.mtimeDiffers = value;
    }

    /**
     * capabilitiesDiffer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public EntityItemRpmVerifyResultType getCapabilitiesDiffer() {
        return capabilitiesDiffer;
    }

    /**
     * capabilitiesDiffer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public void setCapabilitiesDiffer(EntityItemRpmVerifyResultType value) {
        this.capabilitiesDiffer = value;
    }

    /**
     * configurationFile 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getConfigurationFile() {
        return configurationFile;
    }

    /**
     * configurationFile 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setConfigurationFile(EntityItemBoolType value) {
        this.configurationFile = value;
    }

    /**
     * documentationFile 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getDocumentationFile() {
        return documentationFile;
    }

    /**
     * documentationFile 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setDocumentationFile(EntityItemBoolType value) {
        this.documentationFile = value;
    }

    /**
     * ghostFile 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getGhostFile() {
        return ghostFile;
    }

    /**
     * ghostFile 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setGhostFile(EntityItemBoolType value) {
        this.ghostFile = value;
    }

    /**
     * licenseFile 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getLicenseFile() {
        return licenseFile;
    }

    /**
     * licenseFile 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setLicenseFile(EntityItemBoolType value) {
        this.licenseFile = value;
    }

    /**
     * readmeFile 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getReadmeFile() {
        return readmeFile;
    }

    /**
     * readmeFile 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setReadmeFile(EntityItemBoolType value) {
        this.readmeFile = value;
    }

}
