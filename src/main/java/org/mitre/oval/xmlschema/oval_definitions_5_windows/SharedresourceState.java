//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5_windows;

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
 *         &lt;element name="netname" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="shared_type" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateSharedResourceTypeType" minOccurs="0"/>
 *         &lt;element name="max_uses" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="current_uses" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="local_path" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="access_read_permission" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="access_write_permission" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="access_create_permission" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="access_exec_permission" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="access_delete_permission" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="access_atrib_permission" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="access_perm_permission" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="access_all_permission" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
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
public class SharedresourceState
    extends StateType
{

    protected EntityStateStringType netname;
    @XmlElement(name = "shared_type")
    protected EntityStateSharedResourceTypeType sharedType;
    @XmlElement(name = "max_uses")
    protected EntityStateIntType maxUses;
    @XmlElement(name = "current_uses")
    protected EntityStateIntType currentUses;
    @XmlElement(name = "local_path")
    protected EntityStateStringType localPath;
    @XmlElement(name = "access_read_permission")
    protected EntityStateBoolType accessReadPermission;
    @XmlElement(name = "access_write_permission")
    protected EntityStateBoolType accessWritePermission;
    @XmlElement(name = "access_create_permission")
    protected EntityStateBoolType accessCreatePermission;
    @XmlElement(name = "access_exec_permission")
    protected EntityStateBoolType accessExecPermission;
    @XmlElement(name = "access_delete_permission")
    protected EntityStateBoolType accessDeletePermission;
    @XmlElement(name = "access_atrib_permission")
    protected EntityStateBoolType accessAtribPermission;
    @XmlElement(name = "access_perm_permission")
    protected EntityStateBoolType accessPermPermission;
    @XmlElement(name = "access_all_permission")
    protected EntityStateBoolType accessAllPermission;

    /**
     * netname 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getNetname() {
        return netname;
    }

    /**
     * netname 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setNetname(EntityStateStringType value) {
        this.netname = value;
    }

    /**
     * sharedType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateSharedResourceTypeType }
     *     
     */
    public EntityStateSharedResourceTypeType getSharedType() {
        return sharedType;
    }

    /**
     * sharedType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateSharedResourceTypeType }
     *     
     */
    public void setSharedType(EntityStateSharedResourceTypeType value) {
        this.sharedType = value;
    }

    /**
     * maxUses 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMaxUses() {
        return maxUses;
    }

    /**
     * maxUses 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMaxUses(EntityStateIntType value) {
        this.maxUses = value;
    }

    /**
     * currentUses 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getCurrentUses() {
        return currentUses;
    }

    /**
     * currentUses 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setCurrentUses(EntityStateIntType value) {
        this.currentUses = value;
    }

    /**
     * localPath 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getLocalPath() {
        return localPath;
    }

    /**
     * localPath 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setLocalPath(EntityStateStringType value) {
        this.localPath = value;
    }

    /**
     * accessReadPermission 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAccessReadPermission() {
        return accessReadPermission;
    }

    /**
     * accessReadPermission 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAccessReadPermission(EntityStateBoolType value) {
        this.accessReadPermission = value;
    }

    /**
     * accessWritePermission 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAccessWritePermission() {
        return accessWritePermission;
    }

    /**
     * accessWritePermission 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAccessWritePermission(EntityStateBoolType value) {
        this.accessWritePermission = value;
    }

    /**
     * accessCreatePermission 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAccessCreatePermission() {
        return accessCreatePermission;
    }

    /**
     * accessCreatePermission 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAccessCreatePermission(EntityStateBoolType value) {
        this.accessCreatePermission = value;
    }

    /**
     * accessExecPermission 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAccessExecPermission() {
        return accessExecPermission;
    }

    /**
     * accessExecPermission 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAccessExecPermission(EntityStateBoolType value) {
        this.accessExecPermission = value;
    }

    /**
     * accessDeletePermission 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAccessDeletePermission() {
        return accessDeletePermission;
    }

    /**
     * accessDeletePermission 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAccessDeletePermission(EntityStateBoolType value) {
        this.accessDeletePermission = value;
    }

    /**
     * accessAtribPermission 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAccessAtribPermission() {
        return accessAtribPermission;
    }

    /**
     * accessAtribPermission 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAccessAtribPermission(EntityStateBoolType value) {
        this.accessAtribPermission = value;
    }

    /**
     * accessPermPermission 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAccessPermPermission() {
        return accessPermPermission;
    }

    /**
     * accessPermPermission 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAccessPermPermission(EntityStateBoolType value) {
        this.accessPermPermission = value;
    }

    /**
     * accessAllPermission 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAccessAllPermission() {
        return accessAllPermission;
    }

    /**
     * accessAllPermission 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAccessAllPermission(EntityStateBoolType value) {
        this.accessAllPermission = value;
    }

}
