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
 *         &lt;element name="hive" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateRegistryHiveType" minOccurs="0"/>
 *         &lt;element name="key" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="trustee_sid" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="standard_delete" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="standard_read_control" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="standard_write_dac" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="standard_write_owner" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="standard_synchronize" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="access_system_security" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="generic_read" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="generic_write" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="generic_execute" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="generic_all" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="key_query_value" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="key_set_value" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="key_create_sub_key" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="key_enumerate_sub_keys" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="key_notify" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="key_create_link" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="key_wow64_64key" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="key_wow64_32key" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="key_wow64_res" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="windows_view" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateWindowsViewType" minOccurs="0"/>
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
    "hive",
    "key",
    "trusteeSid",
    "standardDelete",
    "standardReadControl",
    "standardWriteDac",
    "standardWriteOwner",
    "standardSynchronize",
    "accessSystemSecurity",
    "genericRead",
    "genericWrite",
    "genericExecute",
    "genericAll",
    "keyQueryValue",
    "keySetValue",
    "keyCreateSubKey",
    "keyEnumerateSubKeys",
    "keyNotify",
    "keyCreateLink",
    "keyWow6464Key",
    "keyWow6432Key",
    "keyWow64Res",
    "windowsView"
})
public class Regkeyauditedpermissions53State
    extends StateType
{

    protected EntityStateRegistryHiveType hive;
    protected EntityStateStringType key;
    @XmlElement(name = "trustee_sid")
    protected EntityStateStringType trusteeSid;
    @XmlElement(name = "standard_delete")
    protected EntityStateAuditType standardDelete;
    @XmlElement(name = "standard_read_control")
    protected EntityStateAuditType standardReadControl;
    @XmlElement(name = "standard_write_dac")
    protected EntityStateAuditType standardWriteDac;
    @XmlElement(name = "standard_write_owner")
    protected EntityStateAuditType standardWriteOwner;
    @XmlElement(name = "standard_synchronize")
    protected EntityStateAuditType standardSynchronize;
    @XmlElement(name = "access_system_security")
    protected EntityStateAuditType accessSystemSecurity;
    @XmlElement(name = "generic_read")
    protected EntityStateAuditType genericRead;
    @XmlElement(name = "generic_write")
    protected EntityStateAuditType genericWrite;
    @XmlElement(name = "generic_execute")
    protected EntityStateAuditType genericExecute;
    @XmlElement(name = "generic_all")
    protected EntityStateAuditType genericAll;
    @XmlElement(name = "key_query_value")
    protected EntityStateAuditType keyQueryValue;
    @XmlElement(name = "key_set_value")
    protected EntityStateAuditType keySetValue;
    @XmlElement(name = "key_create_sub_key")
    protected EntityStateAuditType keyCreateSubKey;
    @XmlElement(name = "key_enumerate_sub_keys")
    protected EntityStateAuditType keyEnumerateSubKeys;
    @XmlElement(name = "key_notify")
    protected EntityStateAuditType keyNotify;
    @XmlElement(name = "key_create_link")
    protected EntityStateAuditType keyCreateLink;
    @XmlElement(name = "key_wow64_64key")
    protected EntityStateAuditType keyWow6464Key;
    @XmlElement(name = "key_wow64_32key")
    protected EntityStateAuditType keyWow6432Key;
    @XmlElement(name = "key_wow64_res")
    protected EntityStateAuditType keyWow64Res;
    @XmlElement(name = "windows_view")
    protected EntityStateWindowsViewType windowsView;

    /**
     * hive 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateRegistryHiveType }
     *     
     */
    public EntityStateRegistryHiveType getHive() {
        return hive;
    }

    /**
     * hive 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateRegistryHiveType }
     *     
     */
    public void setHive(EntityStateRegistryHiveType value) {
        this.hive = value;
    }

    /**
     * key 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getKey() {
        return key;
    }

    /**
     * key 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setKey(EntityStateStringType value) {
        this.key = value;
    }

    /**
     * trusteeSid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getTrusteeSid() {
        return trusteeSid;
    }

    /**
     * trusteeSid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setTrusteeSid(EntityStateStringType value) {
        this.trusteeSid = value;
    }

    /**
     * standardDelete 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getStandardDelete() {
        return standardDelete;
    }

    /**
     * standardDelete 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setStandardDelete(EntityStateAuditType value) {
        this.standardDelete = value;
    }

    /**
     * standardReadControl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getStandardReadControl() {
        return standardReadControl;
    }

    /**
     * standardReadControl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setStandardReadControl(EntityStateAuditType value) {
        this.standardReadControl = value;
    }

    /**
     * standardWriteDac 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getStandardWriteDac() {
        return standardWriteDac;
    }

    /**
     * standardWriteDac 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setStandardWriteDac(EntityStateAuditType value) {
        this.standardWriteDac = value;
    }

    /**
     * standardWriteOwner 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getStandardWriteOwner() {
        return standardWriteOwner;
    }

    /**
     * standardWriteOwner 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setStandardWriteOwner(EntityStateAuditType value) {
        this.standardWriteOwner = value;
    }

    /**
     * standardSynchronize 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getStandardSynchronize() {
        return standardSynchronize;
    }

    /**
     * standardSynchronize 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setStandardSynchronize(EntityStateAuditType value) {
        this.standardSynchronize = value;
    }

    /**
     * accessSystemSecurity 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getAccessSystemSecurity() {
        return accessSystemSecurity;
    }

    /**
     * accessSystemSecurity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setAccessSystemSecurity(EntityStateAuditType value) {
        this.accessSystemSecurity = value;
    }

    /**
     * genericRead 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getGenericRead() {
        return genericRead;
    }

    /**
     * genericRead 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setGenericRead(EntityStateAuditType value) {
        this.genericRead = value;
    }

    /**
     * genericWrite 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getGenericWrite() {
        return genericWrite;
    }

    /**
     * genericWrite 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setGenericWrite(EntityStateAuditType value) {
        this.genericWrite = value;
    }

    /**
     * genericExecute 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getGenericExecute() {
        return genericExecute;
    }

    /**
     * genericExecute 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setGenericExecute(EntityStateAuditType value) {
        this.genericExecute = value;
    }

    /**
     * genericAll 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getGenericAll() {
        return genericAll;
    }

    /**
     * genericAll 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setGenericAll(EntityStateAuditType value) {
        this.genericAll = value;
    }

    /**
     * keyQueryValue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getKeyQueryValue() {
        return keyQueryValue;
    }

    /**
     * keyQueryValue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setKeyQueryValue(EntityStateAuditType value) {
        this.keyQueryValue = value;
    }

    /**
     * keySetValue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getKeySetValue() {
        return keySetValue;
    }

    /**
     * keySetValue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setKeySetValue(EntityStateAuditType value) {
        this.keySetValue = value;
    }

    /**
     * keyCreateSubKey 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getKeyCreateSubKey() {
        return keyCreateSubKey;
    }

    /**
     * keyCreateSubKey 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setKeyCreateSubKey(EntityStateAuditType value) {
        this.keyCreateSubKey = value;
    }

    /**
     * keyEnumerateSubKeys 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getKeyEnumerateSubKeys() {
        return keyEnumerateSubKeys;
    }

    /**
     * keyEnumerateSubKeys 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setKeyEnumerateSubKeys(EntityStateAuditType value) {
        this.keyEnumerateSubKeys = value;
    }

    /**
     * keyNotify 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getKeyNotify() {
        return keyNotify;
    }

    /**
     * keyNotify 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setKeyNotify(EntityStateAuditType value) {
        this.keyNotify = value;
    }

    /**
     * keyCreateLink 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getKeyCreateLink() {
        return keyCreateLink;
    }

    /**
     * keyCreateLink 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setKeyCreateLink(EntityStateAuditType value) {
        this.keyCreateLink = value;
    }

    /**
     * keyWow6464Key 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getKeyWow6464Key() {
        return keyWow6464Key;
    }

    /**
     * keyWow6464Key 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setKeyWow6464Key(EntityStateAuditType value) {
        this.keyWow6464Key = value;
    }

    /**
     * keyWow6432Key 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getKeyWow6432Key() {
        return keyWow6432Key;
    }

    /**
     * keyWow6432Key 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setKeyWow6432Key(EntityStateAuditType value) {
        this.keyWow6432Key = value;
    }

    /**
     * keyWow64Res 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getKeyWow64Res() {
        return keyWow64Res;
    }

    /**
     * keyWow64Res 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setKeyWow64Res(EntityStateAuditType value) {
        this.keyWow64Res = value;
    }

    /**
     * windowsView 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateWindowsViewType }
     *     
     */
    public EntityStateWindowsViewType getWindowsView() {
        return windowsView;
    }

    /**
     * windowsView 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateWindowsViewType }
     *     
     */
    public void setWindowsView(EntityStateWindowsViewType value) {
        this.windowsView = value;
    }

}
