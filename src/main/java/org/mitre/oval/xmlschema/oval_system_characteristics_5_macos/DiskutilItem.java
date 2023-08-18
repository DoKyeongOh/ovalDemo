//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_macos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="device" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="filepath" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="uread" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos}EntityItemPermissionCompareType" minOccurs="0"/>
 *         &lt;element name="uwrite" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos}EntityItemPermissionCompareType" minOccurs="0"/>
 *         &lt;element name="uexec" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos}EntityItemPermissionCompareType" minOccurs="0"/>
 *         &lt;element name="gread" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos}EntityItemPermissionCompareType" minOccurs="0"/>
 *         &lt;element name="gwrite" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos}EntityItemPermissionCompareType" minOccurs="0"/>
 *         &lt;element name="gexec" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos}EntityItemPermissionCompareType" minOccurs="0"/>
 *         &lt;element name="oread" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos}EntityItemPermissionCompareType" minOccurs="0"/>
 *         &lt;element name="owrite" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos}EntityItemPermissionCompareType" minOccurs="0"/>
 *         &lt;element name="oexec" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos}EntityItemPermissionCompareType" minOccurs="0"/>
 *         &lt;element name="user_differs" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="actual_user" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="expected_user" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="group_differs" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="actual_group" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="expected_group" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="symlink_differs" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="actual_symlink" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="expected_symlink" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
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
    "device",
    "filepath",
    "uread",
    "uwrite",
    "uexec",
    "gread",
    "gwrite",
    "gexec",
    "oread",
    "owrite",
    "oexec",
    "userDiffers",
    "actualUser",
    "expectedUser",
    "groupDiffers",
    "actualGroup",
    "expectedGroup",
    "symlinkDiffers",
    "actualSymlink",
    "expectedSymlink"
})
public class DiskutilItem
    extends ItemType
{

    protected EntityItemStringType device;
    protected EntityItemStringType filepath;
    protected EntityItemPermissionCompareType uread;
    protected EntityItemPermissionCompareType uwrite;
    protected EntityItemPermissionCompareType uexec;
    protected EntityItemPermissionCompareType gread;
    protected EntityItemPermissionCompareType gwrite;
    protected EntityItemPermissionCompareType gexec;
    protected EntityItemPermissionCompareType oread;
    protected EntityItemPermissionCompareType owrite;
    protected EntityItemPermissionCompareType oexec;
    @XmlElement(name = "user_differs")
    protected EntityItemBoolType userDiffers;
    @XmlElement(name = "actual_user")
    protected EntityItemIntType actualUser;
    @XmlElement(name = "expected_user")
    protected EntityItemIntType expectedUser;
    @XmlElement(name = "group_differs")
    protected EntityItemBoolType groupDiffers;
    @XmlElement(name = "actual_group")
    protected EntityItemIntType actualGroup;
    @XmlElement(name = "expected_group")
    protected EntityItemIntType expectedGroup;
    @XmlElement(name = "symlink_differs")
    protected EntityItemBoolType symlinkDiffers;
    @XmlElement(name = "actual_symlink")
    protected EntityItemStringType actualSymlink;
    @XmlElement(name = "expected_symlink")
    protected EntityItemStringType expectedSymlink;

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
     * uread 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public EntityItemPermissionCompareType getUread() {
        return uread;
    }

    /**
     * uread 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public void setUread(EntityItemPermissionCompareType value) {
        this.uread = value;
    }

    /**
     * uwrite 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public EntityItemPermissionCompareType getUwrite() {
        return uwrite;
    }

    /**
     * uwrite 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public void setUwrite(EntityItemPermissionCompareType value) {
        this.uwrite = value;
    }

    /**
     * uexec 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public EntityItemPermissionCompareType getUexec() {
        return uexec;
    }

    /**
     * uexec 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public void setUexec(EntityItemPermissionCompareType value) {
        this.uexec = value;
    }

    /**
     * gread 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public EntityItemPermissionCompareType getGread() {
        return gread;
    }

    /**
     * gread 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public void setGread(EntityItemPermissionCompareType value) {
        this.gread = value;
    }

    /**
     * gwrite 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public EntityItemPermissionCompareType getGwrite() {
        return gwrite;
    }

    /**
     * gwrite 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public void setGwrite(EntityItemPermissionCompareType value) {
        this.gwrite = value;
    }

    /**
     * gexec 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public EntityItemPermissionCompareType getGexec() {
        return gexec;
    }

    /**
     * gexec 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public void setGexec(EntityItemPermissionCompareType value) {
        this.gexec = value;
    }

    /**
     * oread 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public EntityItemPermissionCompareType getOread() {
        return oread;
    }

    /**
     * oread 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public void setOread(EntityItemPermissionCompareType value) {
        this.oread = value;
    }

    /**
     * owrite 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public EntityItemPermissionCompareType getOwrite() {
        return owrite;
    }

    /**
     * owrite 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public void setOwrite(EntityItemPermissionCompareType value) {
        this.owrite = value;
    }

    /**
     * oexec 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public EntityItemPermissionCompareType getOexec() {
        return oexec;
    }

    /**
     * oexec 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public void setOexec(EntityItemPermissionCompareType value) {
        this.oexec = value;
    }

    /**
     * userDiffers 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getUserDiffers() {
        return userDiffers;
    }

    /**
     * userDiffers 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setUserDiffers(EntityItemBoolType value) {
        this.userDiffers = value;
    }

    /**
     * actualUser 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getActualUser() {
        return actualUser;
    }

    /**
     * actualUser 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setActualUser(EntityItemIntType value) {
        this.actualUser = value;
    }

    /**
     * expectedUser 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getExpectedUser() {
        return expectedUser;
    }

    /**
     * expectedUser 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setExpectedUser(EntityItemIntType value) {
        this.expectedUser = value;
    }

    /**
     * groupDiffers 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getGroupDiffers() {
        return groupDiffers;
    }

    /**
     * groupDiffers 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setGroupDiffers(EntityItemBoolType value) {
        this.groupDiffers = value;
    }

    /**
     * actualGroup 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getActualGroup() {
        return actualGroup;
    }

    /**
     * actualGroup 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setActualGroup(EntityItemIntType value) {
        this.actualGroup = value;
    }

    /**
     * expectedGroup 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getExpectedGroup() {
        return expectedGroup;
    }

    /**
     * expectedGroup 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setExpectedGroup(EntityItemIntType value) {
        this.expectedGroup = value;
    }

    /**
     * symlinkDiffers 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSymlinkDiffers() {
        return symlinkDiffers;
    }

    /**
     * symlinkDiffers 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSymlinkDiffers(EntityItemBoolType value) {
        this.symlinkDiffers = value;
    }

    /**
     * actualSymlink 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getActualSymlink() {
        return actualSymlink;
    }

    /**
     * actualSymlink 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setActualSymlink(EntityItemStringType value) {
        this.actualSymlink = value;
    }

    /**
     * expectedSymlink 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getExpectedSymlink() {
        return expectedSymlink;
    }

    /**
     * expectedSymlink 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setExpectedSymlink(EntityItemStringType value) {
        this.expectedSymlink = value;
    }

}
