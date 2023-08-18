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
 *         &lt;element name="rootpath" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="file_system" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="drive_type" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateDriveTypeType" minOccurs="0"/>
 *         &lt;element name="volume_max_component_length" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="serial_number" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="file_case_sensitive_search" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="file_case_preserved_names" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="file_unicode_on_disk" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="file_persistent_acls" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="file_file_compression" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="file_volume_quotas" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_sparse_files" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_reparse_points" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_remote_storage" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="file_volume_is_compressed" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_object_ids" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_encryption" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="file_named_streams" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="file_read_only_volume" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="file_sequential_write_once" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_transactions" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_hard_links" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_extended_attributes" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_open_by_file_id" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_usn_journal" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
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
public class VolumeState
    extends StateType
{

    protected EntityStateStringType rootpath;
    @XmlElement(name = "file_system")
    protected EntityStateStringType fileSystem;
    protected EntityStateStringType name;
    @XmlElement(name = "drive_type")
    protected EntityStateDriveTypeType driveType;
    @XmlElement(name = "volume_max_component_length")
    protected EntityStateIntType volumeMaxComponentLength;
    @XmlElement(name = "serial_number")
    protected EntityStateIntType serialNumber;
    @XmlElement(name = "file_case_sensitive_search")
    protected EntityStateBoolType fileCaseSensitiveSearch;
    @XmlElement(name = "file_case_preserved_names")
    protected EntityStateBoolType fileCasePreservedNames;
    @XmlElement(name = "file_unicode_on_disk")
    protected EntityStateBoolType fileUnicodeOnDisk;
    @XmlElement(name = "file_persistent_acls")
    protected EntityStateBoolType filePersistentAcls;
    @XmlElement(name = "file_file_compression")
    protected EntityStateBoolType fileFileCompression;
    @XmlElement(name = "file_volume_quotas")
    protected EntityStateBoolType fileVolumeQuotas;
    @XmlElement(name = "file_supports_sparse_files")
    protected EntityStateBoolType fileSupportsSparseFiles;
    @XmlElement(name = "file_supports_reparse_points")
    protected EntityStateBoolType fileSupportsReparsePoints;
    @XmlElement(name = "file_supports_remote_storage")
    protected EntityStateBoolType fileSupportsRemoteStorage;
    @XmlElement(name = "file_volume_is_compressed")
    protected EntityStateBoolType fileVolumeIsCompressed;
    @XmlElement(name = "file_supports_object_ids")
    protected EntityStateBoolType fileSupportsObjectIds;
    @XmlElement(name = "file_supports_encryption")
    protected EntityStateBoolType fileSupportsEncryption;
    @XmlElement(name = "file_named_streams")
    protected EntityStateBoolType fileNamedStreams;
    @XmlElement(name = "file_read_only_volume")
    protected EntityStateBoolType fileReadOnlyVolume;
    @XmlElement(name = "file_sequential_write_once")
    protected EntityStateBoolType fileSequentialWriteOnce;
    @XmlElement(name = "file_supports_transactions")
    protected EntityStateBoolType fileSupportsTransactions;
    @XmlElement(name = "file_supports_hard_links")
    protected EntityStateBoolType fileSupportsHardLinks;
    @XmlElement(name = "file_supports_extended_attributes")
    protected EntityStateBoolType fileSupportsExtendedAttributes;
    @XmlElement(name = "file_supports_open_by_file_id")
    protected EntityStateBoolType fileSupportsOpenByFileId;
    @XmlElement(name = "file_supports_usn_journal")
    protected EntityStateBoolType fileSupportsUsnJournal;

    /**
     * rootpath 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getRootpath() {
        return rootpath;
    }

    /**
     * rootpath 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setRootpath(EntityStateStringType value) {
        this.rootpath = value;
    }

    /**
     * fileSystem 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getFileSystem() {
        return fileSystem;
    }

    /**
     * fileSystem 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setFileSystem(EntityStateStringType value) {
        this.fileSystem = value;
    }

    /**
     * name 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getName() {
        return name;
    }

    /**
     * name 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setName(EntityStateStringType value) {
        this.name = value;
    }

    /**
     * driveType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateDriveTypeType }
     *     
     */
    public EntityStateDriveTypeType getDriveType() {
        return driveType;
    }

    /**
     * driveType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateDriveTypeType }
     *     
     */
    public void setDriveType(EntityStateDriveTypeType value) {
        this.driveType = value;
    }

    /**
     * volumeMaxComponentLength 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getVolumeMaxComponentLength() {
        return volumeMaxComponentLength;
    }

    /**
     * volumeMaxComponentLength 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setVolumeMaxComponentLength(EntityStateIntType value) {
        this.volumeMaxComponentLength = value;
    }

    /**
     * serialNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getSerialNumber() {
        return serialNumber;
    }

    /**
     * serialNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setSerialNumber(EntityStateIntType value) {
        this.serialNumber = value;
    }

    /**
     * fileCaseSensitiveSearch 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFileCaseSensitiveSearch() {
        return fileCaseSensitiveSearch;
    }

    /**
     * fileCaseSensitiveSearch 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFileCaseSensitiveSearch(EntityStateBoolType value) {
        this.fileCaseSensitiveSearch = value;
    }

    /**
     * fileCasePreservedNames 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFileCasePreservedNames() {
        return fileCasePreservedNames;
    }

    /**
     * fileCasePreservedNames 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFileCasePreservedNames(EntityStateBoolType value) {
        this.fileCasePreservedNames = value;
    }

    /**
     * fileUnicodeOnDisk 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFileUnicodeOnDisk() {
        return fileUnicodeOnDisk;
    }

    /**
     * fileUnicodeOnDisk 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFileUnicodeOnDisk(EntityStateBoolType value) {
        this.fileUnicodeOnDisk = value;
    }

    /**
     * filePersistentAcls 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFilePersistentAcls() {
        return filePersistentAcls;
    }

    /**
     * filePersistentAcls 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFilePersistentAcls(EntityStateBoolType value) {
        this.filePersistentAcls = value;
    }

    /**
     * fileFileCompression 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFileFileCompression() {
        return fileFileCompression;
    }

    /**
     * fileFileCompression 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFileFileCompression(EntityStateBoolType value) {
        this.fileFileCompression = value;
    }

    /**
     * fileVolumeQuotas 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFileVolumeQuotas() {
        return fileVolumeQuotas;
    }

    /**
     * fileVolumeQuotas 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFileVolumeQuotas(EntityStateBoolType value) {
        this.fileVolumeQuotas = value;
    }

    /**
     * fileSupportsSparseFiles 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFileSupportsSparseFiles() {
        return fileSupportsSparseFiles;
    }

    /**
     * fileSupportsSparseFiles 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFileSupportsSparseFiles(EntityStateBoolType value) {
        this.fileSupportsSparseFiles = value;
    }

    /**
     * fileSupportsReparsePoints 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFileSupportsReparsePoints() {
        return fileSupportsReparsePoints;
    }

    /**
     * fileSupportsReparsePoints 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFileSupportsReparsePoints(EntityStateBoolType value) {
        this.fileSupportsReparsePoints = value;
    }

    /**
     * fileSupportsRemoteStorage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFileSupportsRemoteStorage() {
        return fileSupportsRemoteStorage;
    }

    /**
     * fileSupportsRemoteStorage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFileSupportsRemoteStorage(EntityStateBoolType value) {
        this.fileSupportsRemoteStorage = value;
    }

    /**
     * fileVolumeIsCompressed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFileVolumeIsCompressed() {
        return fileVolumeIsCompressed;
    }

    /**
     * fileVolumeIsCompressed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFileVolumeIsCompressed(EntityStateBoolType value) {
        this.fileVolumeIsCompressed = value;
    }

    /**
     * fileSupportsObjectIds 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFileSupportsObjectIds() {
        return fileSupportsObjectIds;
    }

    /**
     * fileSupportsObjectIds 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFileSupportsObjectIds(EntityStateBoolType value) {
        this.fileSupportsObjectIds = value;
    }

    /**
     * fileSupportsEncryption 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFileSupportsEncryption() {
        return fileSupportsEncryption;
    }

    /**
     * fileSupportsEncryption 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFileSupportsEncryption(EntityStateBoolType value) {
        this.fileSupportsEncryption = value;
    }

    /**
     * fileNamedStreams 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFileNamedStreams() {
        return fileNamedStreams;
    }

    /**
     * fileNamedStreams 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFileNamedStreams(EntityStateBoolType value) {
        this.fileNamedStreams = value;
    }

    /**
     * fileReadOnlyVolume 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFileReadOnlyVolume() {
        return fileReadOnlyVolume;
    }

    /**
     * fileReadOnlyVolume 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFileReadOnlyVolume(EntityStateBoolType value) {
        this.fileReadOnlyVolume = value;
    }

    /**
     * fileSequentialWriteOnce 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFileSequentialWriteOnce() {
        return fileSequentialWriteOnce;
    }

    /**
     * fileSequentialWriteOnce 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFileSequentialWriteOnce(EntityStateBoolType value) {
        this.fileSequentialWriteOnce = value;
    }

    /**
     * fileSupportsTransactions 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFileSupportsTransactions() {
        return fileSupportsTransactions;
    }

    /**
     * fileSupportsTransactions 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFileSupportsTransactions(EntityStateBoolType value) {
        this.fileSupportsTransactions = value;
    }

    /**
     * fileSupportsHardLinks 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFileSupportsHardLinks() {
        return fileSupportsHardLinks;
    }

    /**
     * fileSupportsHardLinks 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFileSupportsHardLinks(EntityStateBoolType value) {
        this.fileSupportsHardLinks = value;
    }

    /**
     * fileSupportsExtendedAttributes 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFileSupportsExtendedAttributes() {
        return fileSupportsExtendedAttributes;
    }

    /**
     * fileSupportsExtendedAttributes 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFileSupportsExtendedAttributes(EntityStateBoolType value) {
        this.fileSupportsExtendedAttributes = value;
    }

    /**
     * fileSupportsOpenByFileId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFileSupportsOpenByFileId() {
        return fileSupportsOpenByFileId;
    }

    /**
     * fileSupportsOpenByFileId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFileSupportsOpenByFileId(EntityStateBoolType value) {
        this.fileSupportsOpenByFileId = value;
    }

    /**
     * fileSupportsUsnJournal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getFileSupportsUsnJournal() {
        return fileSupportsUsnJournal;
    }

    /**
     * fileSupportsUsnJournal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setFileSupportsUsnJournal(EntityStateBoolType value) {
        this.fileSupportsUsnJournal = value;
    }

}
