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
 *         &lt;element name="path" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="filename" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="trustee_name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
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
 *         &lt;element name="file_read_data" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="file_write_data" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="file_append_data" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="file_read_ea" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="file_write_ea" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="file_execute" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="file_delete_child" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="file_read_attributes" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="file_write_attributes" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
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
    "path",
    "filename",
    "trusteeName",
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
    "fileReadData",
    "fileWriteData",
    "fileAppendData",
    "fileReadEa",
    "fileWriteEa",
    "fileExecute",
    "fileDeleteChild",
    "fileReadAttributes",
    "fileWriteAttributes",
    "windowsView"
})
public class FileauditedpermissionsState
    extends StateType
{

    protected EntityStateStringType path;
    protected EntityStateStringType filename;
    @XmlElement(name = "trustee_name")
    protected EntityStateStringType trusteeName;
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
    @XmlElement(name = "file_read_data")
    protected EntityStateAuditType fileReadData;
    @XmlElement(name = "file_write_data")
    protected EntityStateAuditType fileWriteData;
    @XmlElement(name = "file_append_data")
    protected EntityStateAuditType fileAppendData;
    @XmlElement(name = "file_read_ea")
    protected EntityStateAuditType fileReadEa;
    @XmlElement(name = "file_write_ea")
    protected EntityStateAuditType fileWriteEa;
    @XmlElement(name = "file_execute")
    protected EntityStateAuditType fileExecute;
    @XmlElement(name = "file_delete_child")
    protected EntityStateAuditType fileDeleteChild;
    @XmlElement(name = "file_read_attributes")
    protected EntityStateAuditType fileReadAttributes;
    @XmlElement(name = "file_write_attributes")
    protected EntityStateAuditType fileWriteAttributes;
    @XmlElement(name = "windows_view")
    protected EntityStateWindowsViewType windowsView;

    /**
     * path 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getPath() {
        return path;
    }

    /**
     * path 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setPath(EntityStateStringType value) {
        this.path = value;
    }

    /**
     * filename 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getFilename() {
        return filename;
    }

    /**
     * filename 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setFilename(EntityStateStringType value) {
        this.filename = value;
    }

    /**
     * trusteeName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getTrusteeName() {
        return trusteeName;
    }

    /**
     * trusteeName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setTrusteeName(EntityStateStringType value) {
        this.trusteeName = value;
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
     * fileReadData 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getFileReadData() {
        return fileReadData;
    }

    /**
     * fileReadData 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setFileReadData(EntityStateAuditType value) {
        this.fileReadData = value;
    }

    /**
     * fileWriteData 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getFileWriteData() {
        return fileWriteData;
    }

    /**
     * fileWriteData 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setFileWriteData(EntityStateAuditType value) {
        this.fileWriteData = value;
    }

    /**
     * fileAppendData 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getFileAppendData() {
        return fileAppendData;
    }

    /**
     * fileAppendData 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setFileAppendData(EntityStateAuditType value) {
        this.fileAppendData = value;
    }

    /**
     * fileReadEa 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getFileReadEa() {
        return fileReadEa;
    }

    /**
     * fileReadEa 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setFileReadEa(EntityStateAuditType value) {
        this.fileReadEa = value;
    }

    /**
     * fileWriteEa 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getFileWriteEa() {
        return fileWriteEa;
    }

    /**
     * fileWriteEa 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setFileWriteEa(EntityStateAuditType value) {
        this.fileWriteEa = value;
    }

    /**
     * fileExecute 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getFileExecute() {
        return fileExecute;
    }

    /**
     * fileExecute 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setFileExecute(EntityStateAuditType value) {
        this.fileExecute = value;
    }

    /**
     * fileDeleteChild 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getFileDeleteChild() {
        return fileDeleteChild;
    }

    /**
     * fileDeleteChild 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setFileDeleteChild(EntityStateAuditType value) {
        this.fileDeleteChild = value;
    }

    /**
     * fileReadAttributes 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getFileReadAttributes() {
        return fileReadAttributes;
    }

    /**
     * fileReadAttributes 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setFileReadAttributes(EntityStateAuditType value) {
        this.fileReadAttributes = value;
    }

    /**
     * fileWriteAttributes 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getFileWriteAttributes() {
        return fileWriteAttributes;
    }

    /**
     * fileWriteAttributes 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setFileWriteAttributes(EntityStateAuditType value) {
        this.fileWriteAttributes = value;
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
