//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5_android;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateBoolType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateIntType;
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
 *         &lt;element name="hardware" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="model" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="product" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="cpu_abi" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="cpu_abi2" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="build_fingerprint" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="os_version_code_name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="os_version_build_number" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="os_version_release_name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="os_version_sdk_number" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="hardware_keystore" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
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
    "hardware",
    "manufacturer",
    "model",
    "product",
    "cpuAbi",
    "cpuAbi2",
    "buildFingerprint",
    "osVersionCodeName",
    "osVersionBuildNumber",
    "osVersionReleaseName",
    "osVersionSdkNumber",
    "hardwareKeystore"
})
public class SystemdetailsState
    extends StateType
{

    protected EntityStateStringType hardware;
    protected EntityStateStringType manufacturer;
    protected EntityStateStringType model;
    protected EntityStateStringType product;
    @XmlElement(name = "cpu_abi")
    protected EntityStateStringType cpuAbi;
    @XmlElement(name = "cpu_abi2")
    protected EntityStateStringType cpuAbi2;
    @XmlElement(name = "build_fingerprint")
    protected EntityStateStringType buildFingerprint;
    @XmlElement(name = "os_version_code_name")
    protected EntityStateStringType osVersionCodeName;
    @XmlElement(name = "os_version_build_number")
    protected EntityStateStringType osVersionBuildNumber;
    @XmlElement(name = "os_version_release_name")
    protected EntityStateStringType osVersionReleaseName;
    @XmlElement(name = "os_version_sdk_number")
    protected EntityStateIntType osVersionSdkNumber;
    @XmlElement(name = "hardware_keystore")
    protected EntityStateBoolType hardwareKeystore;

    /**
     * hardware 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getHardware() {
        return hardware;
    }

    /**
     * hardware 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setHardware(EntityStateStringType value) {
        this.hardware = value;
    }

    /**
     * manufacturer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getManufacturer() {
        return manufacturer;
    }

    /**
     * manufacturer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setManufacturer(EntityStateStringType value) {
        this.manufacturer = value;
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
     * product 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getProduct() {
        return product;
    }

    /**
     * product 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setProduct(EntityStateStringType value) {
        this.product = value;
    }

    /**
     * cpuAbi 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getCpuAbi() {
        return cpuAbi;
    }

    /**
     * cpuAbi 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setCpuAbi(EntityStateStringType value) {
        this.cpuAbi = value;
    }

    /**
     * cpuAbi2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getCpuAbi2() {
        return cpuAbi2;
    }

    /**
     * cpuAbi2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setCpuAbi2(EntityStateStringType value) {
        this.cpuAbi2 = value;
    }

    /**
     * buildFingerprint 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getBuildFingerprint() {
        return buildFingerprint;
    }

    /**
     * buildFingerprint 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setBuildFingerprint(EntityStateStringType value) {
        this.buildFingerprint = value;
    }

    /**
     * osVersionCodeName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getOsVersionCodeName() {
        return osVersionCodeName;
    }

    /**
     * osVersionCodeName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setOsVersionCodeName(EntityStateStringType value) {
        this.osVersionCodeName = value;
    }

    /**
     * osVersionBuildNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getOsVersionBuildNumber() {
        return osVersionBuildNumber;
    }

    /**
     * osVersionBuildNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setOsVersionBuildNumber(EntityStateStringType value) {
        this.osVersionBuildNumber = value;
    }

    /**
     * osVersionReleaseName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getOsVersionReleaseName() {
        return osVersionReleaseName;
    }

    /**
     * osVersionReleaseName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setOsVersionReleaseName(EntityStateStringType value) {
        this.osVersionReleaseName = value;
    }

    /**
     * osVersionSdkNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getOsVersionSdkNumber() {
        return osVersionSdkNumber;
    }

    /**
     * osVersionSdkNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setOsVersionSdkNumber(EntityStateIntType value) {
        this.osVersionSdkNumber = value;
    }

    /**
     * hardwareKeystore 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getHardwareKeystore() {
        return hardwareKeystore;
    }

    /**
     * hardwareKeystore 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setHardwareKeystore(EntityStateBoolType value) {
        this.hardwareKeystore = value;
    }

}
