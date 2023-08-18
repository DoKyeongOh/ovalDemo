//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_android;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemBinaryType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemBoolType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemIntType;
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
 *         &lt;element name="application_name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="uid" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="gid" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="package_name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="data_directory" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="version" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="current_status" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="permission" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="native_lib_dir" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="signing_certificate" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBinaryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="first_install_time" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="last_update_time" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="package_file_location" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
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
    "applicationName",
    "uid",
    "gid",
    "packageName",
    "dataDirectory",
    "version",
    "currentStatus",
    "permission",
    "nativeLibDir",
    "signingCertificate",
    "firstInstallTime",
    "lastUpdateTime",
    "packageFileLocation"
})
public class AppmanagerItem
    extends ItemType
{

    @XmlElement(name = "application_name")
    protected EntityItemStringType applicationName;
    protected EntityItemStringType uid;
    protected List<EntityItemStringType> gid;
    @XmlElement(name = "package_name")
    protected EntityItemStringType packageName;
    @XmlElement(name = "data_directory")
    protected EntityItemStringType dataDirectory;
    protected EntityItemStringType version;
    @XmlElement(name = "current_status")
    protected EntityItemBoolType currentStatus;
    protected List<EntityItemStringType> permission;
    @XmlElement(name = "native_lib_dir")
    protected EntityItemStringType nativeLibDir;
    @XmlElement(name = "signing_certificate")
    protected List<EntityItemBinaryType> signingCertificate;
    @XmlElement(name = "first_install_time")
    protected EntityItemIntType firstInstallTime;
    @XmlElement(name = "last_update_time")
    protected EntityItemIntType lastUpdateTime;
    @XmlElement(name = "package_file_location")
    protected EntityItemStringType packageFileLocation;

    /**
     * applicationName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getApplicationName() {
        return applicationName;
    }

    /**
     * applicationName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setApplicationName(EntityItemStringType value) {
        this.applicationName = value;
    }

    /**
     * uid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getUid() {
        return uid;
    }

    /**
     * uid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setUid(EntityItemStringType value) {
        this.uid = value;
    }

    /**
     * Gets the value of the gid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemStringType }
     * 
     * 
     */
    public List<EntityItemStringType> getGid() {
        if (gid == null) {
            gid = new ArrayList<EntityItemStringType>();
        }
        return this.gid;
    }

    /**
     * packageName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getPackageName() {
        return packageName;
    }

    /**
     * packageName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setPackageName(EntityItemStringType value) {
        this.packageName = value;
    }

    /**
     * dataDirectory 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getDataDirectory() {
        return dataDirectory;
    }

    /**
     * dataDirectory 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setDataDirectory(EntityItemStringType value) {
        this.dataDirectory = value;
    }

    /**
     * version 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getVersion() {
        return version;
    }

    /**
     * version 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setVersion(EntityItemStringType value) {
        this.version = value;
    }

    /**
     * currentStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getCurrentStatus() {
        return currentStatus;
    }

    /**
     * currentStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setCurrentStatus(EntityItemBoolType value) {
        this.currentStatus = value;
    }

    /**
     * Gets the value of the permission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the permission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemStringType }
     * 
     * 
     */
    public List<EntityItemStringType> getPermission() {
        if (permission == null) {
            permission = new ArrayList<EntityItemStringType>();
        }
        return this.permission;
    }

    /**
     * nativeLibDir 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getNativeLibDir() {
        return nativeLibDir;
    }

    /**
     * nativeLibDir 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setNativeLibDir(EntityItemStringType value) {
        this.nativeLibDir = value;
    }

    /**
     * Gets the value of the signingCertificate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signingCertificate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSigningCertificate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemBinaryType }
     * 
     * 
     */
    public List<EntityItemBinaryType> getSigningCertificate() {
        if (signingCertificate == null) {
            signingCertificate = new ArrayList<EntityItemBinaryType>();
        }
        return this.signingCertificate;
    }

    /**
     * firstInstallTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getFirstInstallTime() {
        return firstInstallTime;
    }

    /**
     * firstInstallTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setFirstInstallTime(EntityItemIntType value) {
        this.firstInstallTime = value;
    }

    /**
     * lastUpdateTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * lastUpdateTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setLastUpdateTime(EntityItemIntType value) {
        this.lastUpdateTime = value;
    }

    /**
     * packageFileLocation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getPackageFileLocation() {
        return packageFileLocation;
    }

    /**
     * packageFileLocation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setPackageFileLocation(EntityItemStringType value) {
        this.packageFileLocation = value;
    }

}
