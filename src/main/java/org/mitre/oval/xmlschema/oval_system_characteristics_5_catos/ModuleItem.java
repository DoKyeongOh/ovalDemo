//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_catos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemIntType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemVersionType;
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
 *         &lt;element name="module_number" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="type" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="model" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="software_major_release" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemVersionType" minOccurs="0"/>
 *         &lt;element name="software_individual_release" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="software_version_id" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="hardware_major_release" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemVersionType" minOccurs="0"/>
 *         &lt;element name="hardware_individual_release" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="firmware_major_release" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemVersionType" minOccurs="0"/>
 *         &lt;element name="firmware_individual_release" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
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
    "moduleNumber",
    "type",
    "model",
    "softwareMajorRelease",
    "softwareIndividualRelease",
    "softwareVersionId",
    "hardwareMajorRelease",
    "hardwareIndividualRelease",
    "firmwareMajorRelease",
    "firmwareIndividualRelease"
})
public class ModuleItem
    extends ItemType
{

    @XmlElement(name = "module_number", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#catos")
    protected EntityItemIntType moduleNumber;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#catos")
    protected EntityItemStringType type;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#catos")
    protected EntityItemStringType model;
    @XmlElement(name = "software_major_release", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#catos")
    protected EntityItemVersionType softwareMajorRelease;
    @XmlElement(name = "software_individual_release", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#catos")
    protected EntityItemIntType softwareIndividualRelease;
    @XmlElement(name = "software_version_id", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#catos")
    protected EntityItemStringType softwareVersionId;
    @XmlElement(name = "hardware_major_release", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#catos")
    protected EntityItemVersionType hardwareMajorRelease;
    @XmlElement(name = "hardware_individual_release", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#catos")
    protected EntityItemIntType hardwareIndividualRelease;
    @XmlElement(name = "firmware_major_release", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#catos")
    protected EntityItemVersionType firmwareMajorRelease;
    @XmlElement(name = "firmware_individual_release", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#catos")
    protected EntityItemIntType firmwareIndividualRelease;

    /**
     * moduleNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getModuleNumber() {
        return moduleNumber;
    }

    /**
     * moduleNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setModuleNumber(EntityItemIntType value) {
        this.moduleNumber = value;
    }

    /**
     * type 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getType() {
        return type;
    }

    /**
     * type 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setType(EntityItemStringType value) {
        this.type = value;
    }

    /**
     * model 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getModel() {
        return model;
    }

    /**
     * model 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setModel(EntityItemStringType value) {
        this.model = value;
    }

    /**
     * softwareMajorRelease 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemVersionType }
     *     
     */
    public EntityItemVersionType getSoftwareMajorRelease() {
        return softwareMajorRelease;
    }

    /**
     * softwareMajorRelease 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemVersionType }
     *     
     */
    public void setSoftwareMajorRelease(EntityItemVersionType value) {
        this.softwareMajorRelease = value;
    }

    /**
     * softwareIndividualRelease 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getSoftwareIndividualRelease() {
        return softwareIndividualRelease;
    }

    /**
     * softwareIndividualRelease 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setSoftwareIndividualRelease(EntityItemIntType value) {
        this.softwareIndividualRelease = value;
    }

    /**
     * softwareVersionId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getSoftwareVersionId() {
        return softwareVersionId;
    }

    /**
     * softwareVersionId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setSoftwareVersionId(EntityItemStringType value) {
        this.softwareVersionId = value;
    }

    /**
     * hardwareMajorRelease 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemVersionType }
     *     
     */
    public EntityItemVersionType getHardwareMajorRelease() {
        return hardwareMajorRelease;
    }

    /**
     * hardwareMajorRelease 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemVersionType }
     *     
     */
    public void setHardwareMajorRelease(EntityItemVersionType value) {
        this.hardwareMajorRelease = value;
    }

    /**
     * hardwareIndividualRelease 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getHardwareIndividualRelease() {
        return hardwareIndividualRelease;
    }

    /**
     * hardwareIndividualRelease 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setHardwareIndividualRelease(EntityItemIntType value) {
        this.hardwareIndividualRelease = value;
    }

    /**
     * firmwareMajorRelease 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemVersionType }
     *     
     */
    public EntityItemVersionType getFirmwareMajorRelease() {
        return firmwareMajorRelease;
    }

    /**
     * firmwareMajorRelease 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemVersionType }
     *     
     */
    public void setFirmwareMajorRelease(EntityItemVersionType value) {
        this.firmwareMajorRelease = value;
    }

    /**
     * firmwareIndividualRelease 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getFirmwareIndividualRelease() {
        return firmwareIndividualRelease;
    }

    /**
     * firmwareIndividualRelease 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setFirmwareIndividualRelease(EntityItemIntType value) {
        this.firmwareIndividualRelease = value;
    }

}
