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
 *         &lt;element name="rootpath" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="file_system" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="drive_type" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemDriveTypeType" minOccurs="0"/>
 *         &lt;element name="volume_max_component_length" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="serial_number" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="file_case_sensitive_search" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="file_case_preserved_names" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="file_unicode_on_disk" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="file_persistent_acls" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="file_file_compression" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="file_volume_quotas" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_sparse_files" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_reparse_points" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_remote_storage" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="file_volume_is_compressed" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_object_ids" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_encryption" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="file_named_streams" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="file_read_only_volume" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="file_sequential_write_once" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_transactions" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_hard_links" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_extended_attributes" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_open_by_file_id" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_usn_journal" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
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
    "rootpath",
    "fileSystem",
    "name",
    "driveType",
    "volumeMaxComponentLength",
    "serialNumber",
    "fileCaseSensitiveSearch",
    "fileCasePreservedNames",
    "fileUnicodeOnDisk",
    "filePersistentAcls",
    "fileFileCompression",
    "fileVolumeQuotas",
    "fileSupportsSparseFiles",
    "fileSupportsReparsePoints",
    "fileSupportsRemoteStorage",
    "fileVolumeIsCompressed",
    "fileSupportsObjectIds",
    "fileSupportsEncryption",
    "fileNamedStreams",
    "fileReadOnlyVolume",
    "fileSequentialWriteOnce",
    "fileSupportsTransactions",
    "fileSupportsHardLinks",
    "fileSupportsExtendedAttributes",
    "fileSupportsOpenByFileId",
    "fileSupportsUsnJournal"
})
public class VolumeItem
    extends ItemType
{

    protected EntityItemStringType rootpath;
    @XmlElement(name = "file_system")
    protected EntityItemStringType fileSystem;
    protected EntityItemStringType name;
    @XmlElement(name = "drive_type")
    protected EntityItemDriveTypeType driveType;
    @XmlElement(name = "volume_max_component_length")
    protected EntityItemIntType volumeMaxComponentLength;
    @XmlElement(name = "serial_number")
    protected EntityItemIntType serialNumber;
    @XmlElement(name = "file_case_sensitive_search")
    protected EntityItemBoolType fileCaseSensitiveSearch;
    @XmlElement(name = "file_case_preserved_names")
    protected EntityItemBoolType fileCasePreservedNames;
    @XmlElement(name = "file_unicode_on_disk")
    protected EntityItemBoolType fileUnicodeOnDisk;
    @XmlElement(name = "file_persistent_acls")
    protected EntityItemBoolType filePersistentAcls;
    @XmlElement(name = "file_file_compression")
    protected EntityItemBoolType fileFileCompression;
    @XmlElement(name = "file_volume_quotas")
    protected EntityItemBoolType fileVolumeQuotas;
    @XmlElement(name = "file_supports_sparse_files")
    protected EntityItemBoolType fileSupportsSparseFiles;
    @XmlElement(name = "file_supports_reparse_points")
    protected EntityItemBoolType fileSupportsReparsePoints;
    @XmlElement(name = "file_supports_remote_storage")
    protected EntityItemBoolType fileSupportsRemoteStorage;
    @XmlElement(name = "file_volume_is_compressed")
    protected EntityItemBoolType fileVolumeIsCompressed;
    @XmlElement(name = "file_supports_object_ids")
    protected EntityItemBoolType fileSupportsObjectIds;
    @XmlElement(name = "file_supports_encryption")
    protected EntityItemBoolType fileSupportsEncryption;
    @XmlElement(name = "file_named_streams")
    protected EntityItemBoolType fileNamedStreams;
    @XmlElement(name = "file_read_only_volume")
    protected EntityItemBoolType fileReadOnlyVolume;
    @XmlElement(name = "file_sequential_write_once")
    protected EntityItemBoolType fileSequentialWriteOnce;
    @XmlElement(name = "file_supports_transactions")
    protected EntityItemBoolType fileSupportsTransactions;
    @XmlElement(name = "file_supports_hard_links")
    protected EntityItemBoolType fileSupportsHardLinks;
    @XmlElement(name = "file_supports_extended_attributes")
    protected EntityItemBoolType fileSupportsExtendedAttributes;
    @XmlElement(name = "file_supports_open_by_file_id")
    protected EntityItemBoolType fileSupportsOpenByFileId;
    @XmlElement(name = "file_supports_usn_journal")
    protected EntityItemBoolType fileSupportsUsnJournal;

    /**
     * rootpath 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getRootpath() {
        return rootpath;
    }

    /**
     * rootpath 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setRootpath(EntityItemStringType value) {
        this.rootpath = value;
    }

    /**
     * fileSystem 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getFileSystem() {
        return fileSystem;
    }

    /**
     * fileSystem 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setFileSystem(EntityItemStringType value) {
        this.fileSystem = value;
    }

    /**
     * name 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getName() {
        return name;
    }

    /**
     * name 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setName(EntityItemStringType value) {
        this.name = value;
    }

    /**
     * driveType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemDriveTypeType }
     *     
     */
    public EntityItemDriveTypeType getDriveType() {
        return driveType;
    }

    /**
     * driveType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemDriveTypeType }
     *     
     */
    public void setDriveType(EntityItemDriveTypeType value) {
        this.driveType = value;
    }

    /**
     * volumeMaxComponentLength 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getVolumeMaxComponentLength() {
        return volumeMaxComponentLength;
    }

    /**
     * volumeMaxComponentLength 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setVolumeMaxComponentLength(EntityItemIntType value) {
        this.volumeMaxComponentLength = value;
    }

    /**
     * serialNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getSerialNumber() {
        return serialNumber;
    }

    /**
     * serialNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setSerialNumber(EntityItemIntType value) {
        this.serialNumber = value;
    }

    /**
     * fileCaseSensitiveSearch 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFileCaseSensitiveSearch() {
        return fileCaseSensitiveSearch;
    }

    /**
     * fileCaseSensitiveSearch 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFileCaseSensitiveSearch(EntityItemBoolType value) {
        this.fileCaseSensitiveSearch = value;
    }

    /**
     * fileCasePreservedNames 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFileCasePreservedNames() {
        return fileCasePreservedNames;
    }

    /**
     * fileCasePreservedNames 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFileCasePreservedNames(EntityItemBoolType value) {
        this.fileCasePreservedNames = value;
    }

    /**
     * fileUnicodeOnDisk 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFileUnicodeOnDisk() {
        return fileUnicodeOnDisk;
    }

    /**
     * fileUnicodeOnDisk 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFileUnicodeOnDisk(EntityItemBoolType value) {
        this.fileUnicodeOnDisk = value;
    }

    /**
     * filePersistentAcls 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFilePersistentAcls() {
        return filePersistentAcls;
    }

    /**
     * filePersistentAcls 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFilePersistentAcls(EntityItemBoolType value) {
        this.filePersistentAcls = value;
    }

    /**
     * fileFileCompression 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFileFileCompression() {
        return fileFileCompression;
    }

    /**
     * fileFileCompression 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFileFileCompression(EntityItemBoolType value) {
        this.fileFileCompression = value;
    }

    /**
     * fileVolumeQuotas 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFileVolumeQuotas() {
        return fileVolumeQuotas;
    }

    /**
     * fileVolumeQuotas 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFileVolumeQuotas(EntityItemBoolType value) {
        this.fileVolumeQuotas = value;
    }

    /**
     * fileSupportsSparseFiles 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFileSupportsSparseFiles() {
        return fileSupportsSparseFiles;
    }

    /**
     * fileSupportsSparseFiles 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFileSupportsSparseFiles(EntityItemBoolType value) {
        this.fileSupportsSparseFiles = value;
    }

    /**
     * fileSupportsReparsePoints 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFileSupportsReparsePoints() {
        return fileSupportsReparsePoints;
    }

    /**
     * fileSupportsReparsePoints 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFileSupportsReparsePoints(EntityItemBoolType value) {
        this.fileSupportsReparsePoints = value;
    }

    /**
     * fileSupportsRemoteStorage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFileSupportsRemoteStorage() {
        return fileSupportsRemoteStorage;
    }

    /**
     * fileSupportsRemoteStorage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFileSupportsRemoteStorage(EntityItemBoolType value) {
        this.fileSupportsRemoteStorage = value;
    }

    /**
     * fileVolumeIsCompressed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFileVolumeIsCompressed() {
        return fileVolumeIsCompressed;
    }

    /**
     * fileVolumeIsCompressed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFileVolumeIsCompressed(EntityItemBoolType value) {
        this.fileVolumeIsCompressed = value;
    }

    /**
     * fileSupportsObjectIds 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFileSupportsObjectIds() {
        return fileSupportsObjectIds;
    }

    /**
     * fileSupportsObjectIds 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFileSupportsObjectIds(EntityItemBoolType value) {
        this.fileSupportsObjectIds = value;
    }

    /**
     * fileSupportsEncryption 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFileSupportsEncryption() {
        return fileSupportsEncryption;
    }

    /**
     * fileSupportsEncryption 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFileSupportsEncryption(EntityItemBoolType value) {
        this.fileSupportsEncryption = value;
    }

    /**
     * fileNamedStreams 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFileNamedStreams() {
        return fileNamedStreams;
    }

    /**
     * fileNamedStreams 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFileNamedStreams(EntityItemBoolType value) {
        this.fileNamedStreams = value;
    }

    /**
     * fileReadOnlyVolume 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFileReadOnlyVolume() {
        return fileReadOnlyVolume;
    }

    /**
     * fileReadOnlyVolume 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFileReadOnlyVolume(EntityItemBoolType value) {
        this.fileReadOnlyVolume = value;
    }

    /**
     * fileSequentialWriteOnce 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFileSequentialWriteOnce() {
        return fileSequentialWriteOnce;
    }

    /**
     * fileSequentialWriteOnce 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFileSequentialWriteOnce(EntityItemBoolType value) {
        this.fileSequentialWriteOnce = value;
    }

    /**
     * fileSupportsTransactions 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFileSupportsTransactions() {
        return fileSupportsTransactions;
    }

    /**
     * fileSupportsTransactions 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFileSupportsTransactions(EntityItemBoolType value) {
        this.fileSupportsTransactions = value;
    }

    /**
     * fileSupportsHardLinks 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFileSupportsHardLinks() {
        return fileSupportsHardLinks;
    }

    /**
     * fileSupportsHardLinks 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFileSupportsHardLinks(EntityItemBoolType value) {
        this.fileSupportsHardLinks = value;
    }

    /**
     * fileSupportsExtendedAttributes 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFileSupportsExtendedAttributes() {
        return fileSupportsExtendedAttributes;
    }

    /**
     * fileSupportsExtendedAttributes 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFileSupportsExtendedAttributes(EntityItemBoolType value) {
        this.fileSupportsExtendedAttributes = value;
    }

    /**
     * fileSupportsOpenByFileId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFileSupportsOpenByFileId() {
        return fileSupportsOpenByFileId;
    }

    /**
     * fileSupportsOpenByFileId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFileSupportsOpenByFileId(EntityItemBoolType value) {
        this.fileSupportsOpenByFileId = value;
    }

    /**
     * fileSupportsUsnJournal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getFileSupportsUsnJournal() {
        return fileSupportsUsnJournal;
    }

    /**
     * fileSupportsUsnJournal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setFileSupportsUsnJournal(EntityItemBoolType value) {
        this.fileSupportsUsnJournal = value;
    }

}
