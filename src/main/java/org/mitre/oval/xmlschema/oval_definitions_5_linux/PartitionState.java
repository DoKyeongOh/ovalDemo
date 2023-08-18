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
 *         &lt;element name="mount_point" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="device" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="uuid" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="fs_type" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="mount_options" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="total_space" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="space_used" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="space_left" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="space_left_for_unprivileged_users" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="block_size" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
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
    "mountPoint",
    "device",
    "uuid",
    "fsType",
    "mountOptions",
    "totalSpace",
    "spaceUsed",
    "spaceLeft",
    "spaceLeftForUnprivilegedUsers",
    "blockSize"
})
public class PartitionState
    extends StateType
{

    @XmlElement(name = "mount_point")
    protected EntityStateStringType mountPoint;
    protected EntityStateStringType device;
    protected EntityStateStringType uuid;
    @XmlElement(name = "fs_type")
    protected EntityStateStringType fsType;
    @XmlElement(name = "mount_options")
    protected EntityStateStringType mountOptions;
    @XmlElement(name = "total_space")
    protected EntityStateIntType totalSpace;
    @XmlElement(name = "space_used")
    protected EntityStateIntType spaceUsed;
    @XmlElement(name = "space_left")
    protected EntityStateIntType spaceLeft;
    @XmlElement(name = "space_left_for_unprivileged_users")
    protected EntityStateIntType spaceLeftForUnprivilegedUsers;
    @XmlElement(name = "block_size")
    protected EntityStateIntType blockSize;

    /**
     * mountPoint 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getMountPoint() {
        return mountPoint;
    }

    /**
     * mountPoint 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setMountPoint(EntityStateStringType value) {
        this.mountPoint = value;
    }

    /**
     * device 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getDevice() {
        return device;
    }

    /**
     * device 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setDevice(EntityStateStringType value) {
        this.device = value;
    }

    /**
     * uuid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getUuid() {
        return uuid;
    }

    /**
     * uuid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setUuid(EntityStateStringType value) {
        this.uuid = value;
    }

    /**
     * fsType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getFsType() {
        return fsType;
    }

    /**
     * fsType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setFsType(EntityStateStringType value) {
        this.fsType = value;
    }

    /**
     * mountOptions 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getMountOptions() {
        return mountOptions;
    }

    /**
     * mountOptions 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setMountOptions(EntityStateStringType value) {
        this.mountOptions = value;
    }

    /**
     * totalSpace 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getTotalSpace() {
        return totalSpace;
    }

    /**
     * totalSpace 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setTotalSpace(EntityStateIntType value) {
        this.totalSpace = value;
    }

    /**
     * spaceUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getSpaceUsed() {
        return spaceUsed;
    }

    /**
     * spaceUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setSpaceUsed(EntityStateIntType value) {
        this.spaceUsed = value;
    }

    /**
     * spaceLeft 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getSpaceLeft() {
        return spaceLeft;
    }

    /**
     * spaceLeft 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setSpaceLeft(EntityStateIntType value) {
        this.spaceLeft = value;
    }

    /**
     * spaceLeftForUnprivilegedUsers 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getSpaceLeftForUnprivilegedUsers() {
        return spaceLeftForUnprivilegedUsers;
    }

    /**
     * spaceLeftForUnprivilegedUsers 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setSpaceLeftForUnprivilegedUsers(EntityStateIntType value) {
        this.spaceLeftForUnprivilegedUsers = value;
    }

    /**
     * blockSize 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getBlockSize() {
        return blockSize;
    }

    /**
     * blockSize 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setBlockSize(EntityStateIntType value) {
        this.blockSize = value;
    }

}
