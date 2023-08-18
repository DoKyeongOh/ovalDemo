//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_linux;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="mount_point" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="device" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="uuid" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="fs_type" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="mount_options" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="total_space" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="space_used" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="space_left" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="space_left_for_unprivileged_users" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="block_size" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
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
public class PartitionItem
    extends ItemType
{

    @XmlElement(name = "mount_point")
    protected EntityItemStringType mountPoint;
    protected EntityItemStringType device;
    protected EntityItemStringType uuid;
    @XmlElement(name = "fs_type")
    protected EntityItemStringType fsType;
    @XmlElement(name = "mount_options")
    protected List<EntityItemStringType> mountOptions;
    @XmlElement(name = "total_space")
    protected EntityItemIntType totalSpace;
    @XmlElement(name = "space_used")
    protected EntityItemIntType spaceUsed;
    @XmlElement(name = "space_left")
    protected EntityItemIntType spaceLeft;
    @XmlElement(name = "space_left_for_unprivileged_users")
    protected EntityItemIntType spaceLeftForUnprivilegedUsers;
    @XmlElement(name = "block_size")
    protected EntityItemIntType blockSize;

    /**
     * mountPoint 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getMountPoint() {
        return mountPoint;
    }

    /**
     * mountPoint 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setMountPoint(EntityItemStringType value) {
        this.mountPoint = value;
    }

    /**
     * device 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getDevice() {
        return device;
    }

    /**
     * device 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setDevice(EntityItemStringType value) {
        this.device = value;
    }

    /**
     * uuid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getUuid() {
        return uuid;
    }

    /**
     * uuid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setUuid(EntityItemStringType value) {
        this.uuid = value;
    }

    /**
     * fsType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getFsType() {
        return fsType;
    }

    /**
     * fsType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setFsType(EntityItemStringType value) {
        this.fsType = value;
    }

    /**
     * Gets the value of the mountOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mountOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMountOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemStringType }
     * 
     * 
     */
    public List<EntityItemStringType> getMountOptions() {
        if (mountOptions == null) {
            mountOptions = new ArrayList<EntityItemStringType>();
        }
        return this.mountOptions;
    }

    /**
     * totalSpace 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getTotalSpace() {
        return totalSpace;
    }

    /**
     * totalSpace 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setTotalSpace(EntityItemIntType value) {
        this.totalSpace = value;
    }

    /**
     * spaceUsed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getSpaceUsed() {
        return spaceUsed;
    }

    /**
     * spaceUsed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setSpaceUsed(EntityItemIntType value) {
        this.spaceUsed = value;
    }

    /**
     * spaceLeft 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getSpaceLeft() {
        return spaceLeft;
    }

    /**
     * spaceLeft 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setSpaceLeft(EntityItemIntType value) {
        this.spaceLeft = value;
    }

    /**
     * spaceLeftForUnprivilegedUsers 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getSpaceLeftForUnprivilegedUsers() {
        return spaceLeftForUnprivilegedUsers;
    }

    /**
     * spaceLeftForUnprivilegedUsers 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setSpaceLeftForUnprivilegedUsers(EntityItemIntType value) {
        this.spaceLeftForUnprivilegedUsers = value;
    }

    /**
     * blockSize 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getBlockSize() {
        return blockSize;
    }

    /**
     * blockSize 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setBlockSize(EntityItemIntType value) {
        this.blockSize = value;
    }

}
