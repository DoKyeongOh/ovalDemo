//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_windows;

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
 *         &lt;element name="netname" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="shared_type" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemSharedResourceTypeType" minOccurs="0"/>
 *         &lt;element name="max_uses" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="current_uses" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="local_path" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="access_read_permission" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="access_write_permission" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="access_create_permission" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="access_exec_permission" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="access_delete_permission" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="access_atrib_permission" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="access_perm_permission" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="access_all_permission" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
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
    "netname",
    "sharedType",
    "maxUses",
    "currentUses",
    "localPath",
    "accessReadPermission",
    "accessWritePermission",
    "accessCreatePermission",
    "accessExecPermission",
    "accessDeletePermission",
    "accessAtribPermission",
    "accessPermPermission",
    "accessAllPermission"
})
public class SharedresourceItem
    extends ItemType
{

    protected EntityItemStringType netname;
    @XmlElement(name = "shared_type")
    protected EntityItemSharedResourceTypeType sharedType;
    @XmlElement(name = "max_uses")
    protected EntityItemIntType maxUses;
    @XmlElement(name = "current_uses")
    protected EntityItemIntType currentUses;
    @XmlElement(name = "local_path")
    protected EntityItemStringType localPath;
    @XmlElement(name = "access_read_permission")
    protected EntityItemBoolType accessReadPermission;
    @XmlElement(name = "access_write_permission")
    protected EntityItemBoolType accessWritePermission;
    @XmlElement(name = "access_create_permission")
    protected EntityItemBoolType accessCreatePermission;
    @XmlElement(name = "access_exec_permission")
    protected EntityItemBoolType accessExecPermission;
    @XmlElement(name = "access_delete_permission")
    protected EntityItemBoolType accessDeletePermission;
    @XmlElement(name = "access_atrib_permission")
    protected EntityItemBoolType accessAtribPermission;
    @XmlElement(name = "access_perm_permission")
    protected EntityItemBoolType accessPermPermission;
    @XmlElement(name = "access_all_permission")
    protected EntityItemBoolType accessAllPermission;

    /**
     * netname 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getNetname() {
        return netname;
    }

    /**
     * netname 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setNetname(EntityItemStringType value) {
        this.netname = value;
    }

    /**
     * sharedType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemSharedResourceTypeType }
     *     
     */
    public EntityItemSharedResourceTypeType getSharedType() {
        return sharedType;
    }

    /**
     * sharedType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemSharedResourceTypeType }
     *     
     */
    public void setSharedType(EntityItemSharedResourceTypeType value) {
        this.sharedType = value;
    }

    /**
     * maxUses 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMaxUses() {
        return maxUses;
    }

    /**
     * maxUses 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMaxUses(EntityItemIntType value) {
        this.maxUses = value;
    }

    /**
     * currentUses 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getCurrentUses() {
        return currentUses;
    }

    /**
     * currentUses 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setCurrentUses(EntityItemIntType value) {
        this.currentUses = value;
    }

    /**
     * localPath 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getLocalPath() {
        return localPath;
    }

    /**
     * localPath 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setLocalPath(EntityItemStringType value) {
        this.localPath = value;
    }

    /**
     * accessReadPermission 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAccessReadPermission() {
        return accessReadPermission;
    }

    /**
     * accessReadPermission 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAccessReadPermission(EntityItemBoolType value) {
        this.accessReadPermission = value;
    }

    /**
     * accessWritePermission 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAccessWritePermission() {
        return accessWritePermission;
    }

    /**
     * accessWritePermission 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAccessWritePermission(EntityItemBoolType value) {
        this.accessWritePermission = value;
    }

    /**
     * accessCreatePermission 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAccessCreatePermission() {
        return accessCreatePermission;
    }

    /**
     * accessCreatePermission 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAccessCreatePermission(EntityItemBoolType value) {
        this.accessCreatePermission = value;
    }

    /**
     * accessExecPermission 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAccessExecPermission() {
        return accessExecPermission;
    }

    /**
     * accessExecPermission 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAccessExecPermission(EntityItemBoolType value) {
        this.accessExecPermission = value;
    }

    /**
     * accessDeletePermission 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAccessDeletePermission() {
        return accessDeletePermission;
    }

    /**
     * accessDeletePermission 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAccessDeletePermission(EntityItemBoolType value) {
        this.accessDeletePermission = value;
    }

    /**
     * accessAtribPermission 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAccessAtribPermission() {
        return accessAtribPermission;
    }

    /**
     * accessAtribPermission 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAccessAtribPermission(EntityItemBoolType value) {
        this.accessAtribPermission = value;
    }

    /**
     * accessPermPermission 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAccessPermPermission() {
        return accessPermPermission;
    }

    /**
     * accessPermPermission 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAccessPermPermission(EntityItemBoolType value) {
        this.accessPermPermission = value;
    }

    /**
     * accessAllPermission 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAccessAllPermission() {
        return accessAllPermission;
    }

    /**
     * accessAllPermission 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAccessAllPermission(EntityItemBoolType value) {
        this.accessAllPermission = value;
    }

}
