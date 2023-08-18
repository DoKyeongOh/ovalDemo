//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5_catos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateIntType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateVersionType;
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
 *         &lt;element name="module_number" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="type" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="model" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="software_major_release" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateVersionType" minOccurs="0"/>
 *         &lt;element name="software_individual_release" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="software_version_id" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="hardware_major_release" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateVersionType" minOccurs="0"/>
 *         &lt;element name="hardware_individual_release" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="firmware_major_release" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateVersionType" minOccurs="0"/>
 *         &lt;element name="firmware_individual_release" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
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
public class ModuleState
    extends StateType
{

    @XmlElement(name = "module_number", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos")
    protected EntityStateIntType moduleNumber;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos")
    protected EntityStateStringType type;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos")
    protected EntityStateStringType model;
    @XmlElement(name = "software_major_release", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos")
    protected EntityStateVersionType softwareMajorRelease;
    @XmlElement(name = "software_individual_release", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos")
    protected EntityStateIntType softwareIndividualRelease;
    @XmlElement(name = "software_version_id", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos")
    protected EntityStateStringType softwareVersionId;
    @XmlElement(name = "hardware_major_release", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos")
    protected EntityStateVersionType hardwareMajorRelease;
    @XmlElement(name = "hardware_individual_release", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos")
    protected EntityStateIntType hardwareIndividualRelease;
    @XmlElement(name = "firmware_major_release", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos")
    protected EntityStateVersionType firmwareMajorRelease;
    @XmlElement(name = "firmware_individual_release", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos")
    protected EntityStateIntType firmwareIndividualRelease;

    /**
     * moduleNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getModuleNumber() {
        return moduleNumber;
    }

    /**
     * moduleNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setModuleNumber(EntityStateIntType value) {
        this.moduleNumber = value;
    }

    /**
     * type 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getType() {
        return type;
    }

    /**
     * type 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setType(EntityStateStringType value) {
        this.type = value;
    }

    /**
     * model 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getModel() {
        return model;
    }

    /**
     * model 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setModel(EntityStateStringType value) {
        this.model = value;
    }

    /**
     * softwareMajorRelease 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateVersionType }
     *     
     */
    public EntityStateVersionType getSoftwareMajorRelease() {
        return softwareMajorRelease;
    }

    /**
     * softwareMajorRelease 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateVersionType }
     *     
     */
    public void setSoftwareMajorRelease(EntityStateVersionType value) {
        this.softwareMajorRelease = value;
    }

    /**
     * softwareIndividualRelease 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getSoftwareIndividualRelease() {
        return softwareIndividualRelease;
    }

    /**
     * softwareIndividualRelease 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setSoftwareIndividualRelease(EntityStateIntType value) {
        this.softwareIndividualRelease = value;
    }

    /**
     * softwareVersionId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getSoftwareVersionId() {
        return softwareVersionId;
    }

    /**
     * softwareVersionId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setSoftwareVersionId(EntityStateStringType value) {
        this.softwareVersionId = value;
    }

    /**
     * hardwareMajorRelease 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateVersionType }
     *     
     */
    public EntityStateVersionType getHardwareMajorRelease() {
        return hardwareMajorRelease;
    }

    /**
     * hardwareMajorRelease 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateVersionType }
     *     
     */
    public void setHardwareMajorRelease(EntityStateVersionType value) {
        this.hardwareMajorRelease = value;
    }

    /**
     * hardwareIndividualRelease 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getHardwareIndividualRelease() {
        return hardwareIndividualRelease;
    }

    /**
     * hardwareIndividualRelease 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setHardwareIndividualRelease(EntityStateIntType value) {
        this.hardwareIndividualRelease = value;
    }

    /**
     * firmwareMajorRelease 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateVersionType }
     *     
     */
    public EntityStateVersionType getFirmwareMajorRelease() {
        return firmwareMajorRelease;
    }

    /**
     * firmwareMajorRelease 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateVersionType }
     *     
     */
    public void setFirmwareMajorRelease(EntityStateVersionType value) {
        this.firmwareMajorRelease = value;
    }

    /**
     * firmwareIndividualRelease 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getFirmwareIndividualRelease() {
        return firmwareIndividualRelease;
    }

    /**
     * firmwareIndividualRelease 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setFirmwareIndividualRelease(EntityStateIntType value) {
        this.firmwareIndividualRelease = value;
    }

}
