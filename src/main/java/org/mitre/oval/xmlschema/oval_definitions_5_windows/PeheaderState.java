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
 *         &lt;element name="filepath" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="path" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="filename" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="header_signature" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="target_machine_type" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStatePeTargetMachineType" minOccurs="0"/>
 *         &lt;element name="number_of_sections" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="time_date_stamp" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="pointer_to_symbol_table" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="number_of_symbols" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="size_of_optional_header" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="image_file_relocs_stripped" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_executable_image" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_line_nums_stripped" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_local_syms_stripped" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_aggresive_ws_trim" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_large_address_aware" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_16bit_machine" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_bytes_reversed_lo" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_32bit_machine" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_debug_stripped" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_removable_run_from_swap" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_system" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_dll" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_up_system_only" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_bytes_reveresed_hi" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="magic_number" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="major_linker_version" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="minor_linker_version" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="size_of_code" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="size_of_initialized_data" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="size_of_uninitialized_data" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="address_of_entry_point" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="base_of_code" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="base_of_data" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="image_base_address" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="section_alignment" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="file_alignment" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="major_operating_system_version" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="minor_operating_system_version" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="major_image_version" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="minor_image_version" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="major_subsystem_version" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="minor_susbsystem_version" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="size_of_image" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="size_of_headers" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="checksum" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="subsystem" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStatePeSubsystemType" minOccurs="0"/>
 *         &lt;element name="dll_characteristics" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="size_of_stack_reserve" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="size_of_stack_commit" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="size_of_heap_reserve" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="size_of_heap_commit" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="loader_flags" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="number_of_rva_and_sizes" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="real_number_of_directory_entries" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
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
    "filepath",
    "path",
    "filename",
    "headerSignature",
    "targetMachineType",
    "numberOfSections",
    "timeDateStamp",
    "pointerToSymbolTable",
    "numberOfSymbols",
    "sizeOfOptionalHeader",
    "imageFileRelocsStripped",
    "imageFileExecutableImage",
    "imageFileLineNumsStripped",
    "imageFileLocalSymsStripped",
    "imageFileAggresiveWsTrim",
    "imageFileLargeAddressAware",
    "imageFile16BitMachine",
    "imageFileBytesReversedLo",
    "imageFile32BitMachine",
    "imageFileDebugStripped",
    "imageFileRemovableRunFromSwap",
    "imageFileSystem",
    "imageFileDll",
    "imageFileUpSystemOnly",
    "imageFileBytesReveresedHi",
    "magicNumber",
    "majorLinkerVersion",
    "minorLinkerVersion",
    "sizeOfCode",
    "sizeOfInitializedData",
    "sizeOfUninitializedData",
    "addressOfEntryPoint",
    "baseOfCode",
    "baseOfData",
    "imageBaseAddress",
    "sectionAlignment",
    "fileAlignment",
    "majorOperatingSystemVersion",
    "minorOperatingSystemVersion",
    "majorImageVersion",
    "minorImageVersion",
    "majorSubsystemVersion",
    "minorSusbsystemVersion",
    "sizeOfImage",
    "sizeOfHeaders",
    "checksum",
    "subsystem",
    "dllCharacteristics",
    "sizeOfStackReserve",
    "sizeOfStackCommit",
    "sizeOfHeapReserve",
    "sizeOfHeapCommit",
    "loaderFlags",
    "numberOfRvaAndSizes",
    "realNumberOfDirectoryEntries",
    "windowsView"
})
public class PeheaderState
    extends StateType
{

    protected EntityStateStringType filepath;
    protected EntityStateStringType path;
    protected EntityStateStringType filename;
    @XmlElement(name = "header_signature")
    protected EntityStateStringType headerSignature;
    @XmlElement(name = "target_machine_type")
    protected EntityStatePeTargetMachineType targetMachineType;
    @XmlElement(name = "number_of_sections")
    protected EntityStateIntType numberOfSections;
    @XmlElement(name = "time_date_stamp")
    protected EntityStateIntType timeDateStamp;
    @XmlElement(name = "pointer_to_symbol_table")
    protected EntityStateIntType pointerToSymbolTable;
    @XmlElement(name = "number_of_symbols")
    protected EntityStateIntType numberOfSymbols;
    @XmlElement(name = "size_of_optional_header")
    protected EntityStateIntType sizeOfOptionalHeader;
    @XmlElement(name = "image_file_relocs_stripped", defaultValue = "false")
    protected EntityStateBoolType imageFileRelocsStripped;
    @XmlElement(name = "image_file_executable_image", defaultValue = "false")
    protected EntityStateBoolType imageFileExecutableImage;
    @XmlElement(name = "image_file_line_nums_stripped", defaultValue = "false")
    protected EntityStateBoolType imageFileLineNumsStripped;
    @XmlElement(name = "image_file_local_syms_stripped", defaultValue = "false")
    protected EntityStateBoolType imageFileLocalSymsStripped;
    @XmlElement(name = "image_file_aggresive_ws_trim", defaultValue = "false")
    protected EntityStateBoolType imageFileAggresiveWsTrim;
    @XmlElement(name = "image_file_large_address_aware", defaultValue = "false")
    protected EntityStateBoolType imageFileLargeAddressAware;
    @XmlElement(name = "image_file_16bit_machine", defaultValue = "false")
    protected EntityStateBoolType imageFile16BitMachine;
    @XmlElement(name = "image_file_bytes_reversed_lo", defaultValue = "false")
    protected EntityStateBoolType imageFileBytesReversedLo;
    @XmlElement(name = "image_file_32bit_machine", defaultValue = "false")
    protected EntityStateBoolType imageFile32BitMachine;
    @XmlElement(name = "image_file_debug_stripped", defaultValue = "false")
    protected EntityStateBoolType imageFileDebugStripped;
    @XmlElement(name = "image_file_removable_run_from_swap", defaultValue = "false")
    protected EntityStateBoolType imageFileRemovableRunFromSwap;
    @XmlElement(name = "image_file_system", defaultValue = "false")
    protected EntityStateBoolType imageFileSystem;
    @XmlElement(name = "image_file_dll", defaultValue = "false")
    protected EntityStateBoolType imageFileDll;
    @XmlElement(name = "image_file_up_system_only", defaultValue = "false")
    protected EntityStateBoolType imageFileUpSystemOnly;
    @XmlElement(name = "image_file_bytes_reveresed_hi", defaultValue = "false")
    protected EntityStateBoolType imageFileBytesReveresedHi;
    @XmlElement(name = "magic_number")
    protected EntityStateIntType magicNumber;
    @XmlElement(name = "major_linker_version")
    protected EntityStateIntType majorLinkerVersion;
    @XmlElement(name = "minor_linker_version")
    protected EntityStateIntType minorLinkerVersion;
    @XmlElement(name = "size_of_code")
    protected EntityStateIntType sizeOfCode;
    @XmlElement(name = "size_of_initialized_data")
    protected EntityStateIntType sizeOfInitializedData;
    @XmlElement(name = "size_of_uninitialized_data")
    protected EntityStateIntType sizeOfUninitializedData;
    @XmlElement(name = "address_of_entry_point")
    protected EntityStateIntType addressOfEntryPoint;
    @XmlElement(name = "base_of_code")
    protected EntityStateIntType baseOfCode;
    @XmlElement(name = "base_of_data")
    protected EntityStateIntType baseOfData;
    @XmlElement(name = "image_base_address")
    protected EntityStateIntType imageBaseAddress;
    @XmlElement(name = "section_alignment")
    protected EntityStateIntType sectionAlignment;
    @XmlElement(name = "file_alignment")
    protected EntityStateIntType fileAlignment;
    @XmlElement(name = "major_operating_system_version")
    protected EntityStateIntType majorOperatingSystemVersion;
    @XmlElement(name = "minor_operating_system_version")
    protected EntityStateIntType minorOperatingSystemVersion;
    @XmlElement(name = "major_image_version")
    protected EntityStateIntType majorImageVersion;
    @XmlElement(name = "minor_image_version")
    protected EntityStateIntType minorImageVersion;
    @XmlElement(name = "major_subsystem_version")
    protected EntityStateIntType majorSubsystemVersion;
    @XmlElement(name = "minor_susbsystem_version")
    protected EntityStateIntType minorSusbsystemVersion;
    @XmlElement(name = "size_of_image")
    protected EntityStateIntType sizeOfImage;
    @XmlElement(name = "size_of_headers")
    protected EntityStateIntType sizeOfHeaders;
    protected EntityStateIntType checksum;
    protected EntityStatePeSubsystemType subsystem;
    @XmlElement(name = "dll_characteristics")
    protected EntityStateIntType dllCharacteristics;
    @XmlElement(name = "size_of_stack_reserve")
    protected EntityStateIntType sizeOfStackReserve;
    @XmlElement(name = "size_of_stack_commit")
    protected EntityStateIntType sizeOfStackCommit;
    @XmlElement(name = "size_of_heap_reserve")
    protected EntityStateIntType sizeOfHeapReserve;
    @XmlElement(name = "size_of_heap_commit")
    protected EntityStateIntType sizeOfHeapCommit;
    @XmlElement(name = "loader_flags")
    protected EntityStateIntType loaderFlags;
    @XmlElement(name = "number_of_rva_and_sizes")
    protected EntityStateIntType numberOfRvaAndSizes;
    @XmlElement(name = "real_number_of_directory_entries")
    protected EntityStateIntType realNumberOfDirectoryEntries;
    @XmlElement(name = "windows_view")
    protected EntityStateWindowsViewType windowsView;

    /**
     * filepath 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getFilepath() {
        return filepath;
    }

    /**
     * filepath 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setFilepath(EntityStateStringType value) {
        this.filepath = value;
    }

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
     * headerSignature 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getHeaderSignature() {
        return headerSignature;
    }

    /**
     * headerSignature 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setHeaderSignature(EntityStateStringType value) {
        this.headerSignature = value;
    }

    /**
     * targetMachineType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatePeTargetMachineType }
     *     
     */
    public EntityStatePeTargetMachineType getTargetMachineType() {
        return targetMachineType;
    }

    /**
     * targetMachineType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatePeTargetMachineType }
     *     
     */
    public void setTargetMachineType(EntityStatePeTargetMachineType value) {
        this.targetMachineType = value;
    }

    /**
     * numberOfSections 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getNumberOfSections() {
        return numberOfSections;
    }

    /**
     * numberOfSections 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setNumberOfSections(EntityStateIntType value) {
        this.numberOfSections = value;
    }

    /**
     * timeDateStamp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getTimeDateStamp() {
        return timeDateStamp;
    }

    /**
     * timeDateStamp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setTimeDateStamp(EntityStateIntType value) {
        this.timeDateStamp = value;
    }

    /**
     * pointerToSymbolTable 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getPointerToSymbolTable() {
        return pointerToSymbolTable;
    }

    /**
     * pointerToSymbolTable 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setPointerToSymbolTable(EntityStateIntType value) {
        this.pointerToSymbolTable = value;
    }

    /**
     * numberOfSymbols 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getNumberOfSymbols() {
        return numberOfSymbols;
    }

    /**
     * numberOfSymbols 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setNumberOfSymbols(EntityStateIntType value) {
        this.numberOfSymbols = value;
    }

    /**
     * sizeOfOptionalHeader 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getSizeOfOptionalHeader() {
        return sizeOfOptionalHeader;
    }

    /**
     * sizeOfOptionalHeader 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setSizeOfOptionalHeader(EntityStateIntType value) {
        this.sizeOfOptionalHeader = value;
    }

    /**
     * imageFileRelocsStripped 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getImageFileRelocsStripped() {
        return imageFileRelocsStripped;
    }

    /**
     * imageFileRelocsStripped 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setImageFileRelocsStripped(EntityStateBoolType value) {
        this.imageFileRelocsStripped = value;
    }

    /**
     * imageFileExecutableImage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getImageFileExecutableImage() {
        return imageFileExecutableImage;
    }

    /**
     * imageFileExecutableImage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setImageFileExecutableImage(EntityStateBoolType value) {
        this.imageFileExecutableImage = value;
    }

    /**
     * imageFileLineNumsStripped 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getImageFileLineNumsStripped() {
        return imageFileLineNumsStripped;
    }

    /**
     * imageFileLineNumsStripped 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setImageFileLineNumsStripped(EntityStateBoolType value) {
        this.imageFileLineNumsStripped = value;
    }

    /**
     * imageFileLocalSymsStripped 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getImageFileLocalSymsStripped() {
        return imageFileLocalSymsStripped;
    }

    /**
     * imageFileLocalSymsStripped 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setImageFileLocalSymsStripped(EntityStateBoolType value) {
        this.imageFileLocalSymsStripped = value;
    }

    /**
     * imageFileAggresiveWsTrim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getImageFileAggresiveWsTrim() {
        return imageFileAggresiveWsTrim;
    }

    /**
     * imageFileAggresiveWsTrim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setImageFileAggresiveWsTrim(EntityStateBoolType value) {
        this.imageFileAggresiveWsTrim = value;
    }

    /**
     * imageFileLargeAddressAware 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getImageFileLargeAddressAware() {
        return imageFileLargeAddressAware;
    }

    /**
     * imageFileLargeAddressAware 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setImageFileLargeAddressAware(EntityStateBoolType value) {
        this.imageFileLargeAddressAware = value;
    }

    /**
     * imageFile16BitMachine 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getImageFile16BitMachine() {
        return imageFile16BitMachine;
    }

    /**
     * imageFile16BitMachine 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setImageFile16BitMachine(EntityStateBoolType value) {
        this.imageFile16BitMachine = value;
    }

    /**
     * imageFileBytesReversedLo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getImageFileBytesReversedLo() {
        return imageFileBytesReversedLo;
    }

    /**
     * imageFileBytesReversedLo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setImageFileBytesReversedLo(EntityStateBoolType value) {
        this.imageFileBytesReversedLo = value;
    }

    /**
     * imageFile32BitMachine 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getImageFile32BitMachine() {
        return imageFile32BitMachine;
    }

    /**
     * imageFile32BitMachine 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setImageFile32BitMachine(EntityStateBoolType value) {
        this.imageFile32BitMachine = value;
    }

    /**
     * imageFileDebugStripped 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getImageFileDebugStripped() {
        return imageFileDebugStripped;
    }

    /**
     * imageFileDebugStripped 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setImageFileDebugStripped(EntityStateBoolType value) {
        this.imageFileDebugStripped = value;
    }

    /**
     * imageFileRemovableRunFromSwap 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getImageFileRemovableRunFromSwap() {
        return imageFileRemovableRunFromSwap;
    }

    /**
     * imageFileRemovableRunFromSwap 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setImageFileRemovableRunFromSwap(EntityStateBoolType value) {
        this.imageFileRemovableRunFromSwap = value;
    }

    /**
     * imageFileSystem 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getImageFileSystem() {
        return imageFileSystem;
    }

    /**
     * imageFileSystem 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setImageFileSystem(EntityStateBoolType value) {
        this.imageFileSystem = value;
    }

    /**
     * imageFileDll 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getImageFileDll() {
        return imageFileDll;
    }

    /**
     * imageFileDll 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setImageFileDll(EntityStateBoolType value) {
        this.imageFileDll = value;
    }

    /**
     * imageFileUpSystemOnly 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getImageFileUpSystemOnly() {
        return imageFileUpSystemOnly;
    }

    /**
     * imageFileUpSystemOnly 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setImageFileUpSystemOnly(EntityStateBoolType value) {
        this.imageFileUpSystemOnly = value;
    }

    /**
     * imageFileBytesReveresedHi 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getImageFileBytesReveresedHi() {
        return imageFileBytesReveresedHi;
    }

    /**
     * imageFileBytesReveresedHi 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setImageFileBytesReveresedHi(EntityStateBoolType value) {
        this.imageFileBytesReveresedHi = value;
    }

    /**
     * magicNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMagicNumber() {
        return magicNumber;
    }

    /**
     * magicNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMagicNumber(EntityStateIntType value) {
        this.magicNumber = value;
    }

    /**
     * majorLinkerVersion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMajorLinkerVersion() {
        return majorLinkerVersion;
    }

    /**
     * majorLinkerVersion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMajorLinkerVersion(EntityStateIntType value) {
        this.majorLinkerVersion = value;
    }

    /**
     * minorLinkerVersion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMinorLinkerVersion() {
        return minorLinkerVersion;
    }

    /**
     * minorLinkerVersion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMinorLinkerVersion(EntityStateIntType value) {
        this.minorLinkerVersion = value;
    }

    /**
     * sizeOfCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getSizeOfCode() {
        return sizeOfCode;
    }

    /**
     * sizeOfCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setSizeOfCode(EntityStateIntType value) {
        this.sizeOfCode = value;
    }

    /**
     * sizeOfInitializedData 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getSizeOfInitializedData() {
        return sizeOfInitializedData;
    }

    /**
     * sizeOfInitializedData 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setSizeOfInitializedData(EntityStateIntType value) {
        this.sizeOfInitializedData = value;
    }

    /**
     * sizeOfUninitializedData 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getSizeOfUninitializedData() {
        return sizeOfUninitializedData;
    }

    /**
     * sizeOfUninitializedData 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setSizeOfUninitializedData(EntityStateIntType value) {
        this.sizeOfUninitializedData = value;
    }

    /**
     * addressOfEntryPoint 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getAddressOfEntryPoint() {
        return addressOfEntryPoint;
    }

    /**
     * addressOfEntryPoint 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setAddressOfEntryPoint(EntityStateIntType value) {
        this.addressOfEntryPoint = value;
    }

    /**
     * baseOfCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getBaseOfCode() {
        return baseOfCode;
    }

    /**
     * baseOfCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setBaseOfCode(EntityStateIntType value) {
        this.baseOfCode = value;
    }

    /**
     * baseOfData 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getBaseOfData() {
        return baseOfData;
    }

    /**
     * baseOfData 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setBaseOfData(EntityStateIntType value) {
        this.baseOfData = value;
    }

    /**
     * imageBaseAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getImageBaseAddress() {
        return imageBaseAddress;
    }

    /**
     * imageBaseAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setImageBaseAddress(EntityStateIntType value) {
        this.imageBaseAddress = value;
    }

    /**
     * sectionAlignment 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getSectionAlignment() {
        return sectionAlignment;
    }

    /**
     * sectionAlignment 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setSectionAlignment(EntityStateIntType value) {
        this.sectionAlignment = value;
    }

    /**
     * fileAlignment 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getFileAlignment() {
        return fileAlignment;
    }

    /**
     * fileAlignment 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setFileAlignment(EntityStateIntType value) {
        this.fileAlignment = value;
    }

    /**
     * majorOperatingSystemVersion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMajorOperatingSystemVersion() {
        return majorOperatingSystemVersion;
    }

    /**
     * majorOperatingSystemVersion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMajorOperatingSystemVersion(EntityStateIntType value) {
        this.majorOperatingSystemVersion = value;
    }

    /**
     * minorOperatingSystemVersion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMinorOperatingSystemVersion() {
        return minorOperatingSystemVersion;
    }

    /**
     * minorOperatingSystemVersion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMinorOperatingSystemVersion(EntityStateIntType value) {
        this.minorOperatingSystemVersion = value;
    }

    /**
     * majorImageVersion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMajorImageVersion() {
        return majorImageVersion;
    }

    /**
     * majorImageVersion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMajorImageVersion(EntityStateIntType value) {
        this.majorImageVersion = value;
    }

    /**
     * minorImageVersion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMinorImageVersion() {
        return minorImageVersion;
    }

    /**
     * minorImageVersion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMinorImageVersion(EntityStateIntType value) {
        this.minorImageVersion = value;
    }

    /**
     * majorSubsystemVersion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMajorSubsystemVersion() {
        return majorSubsystemVersion;
    }

    /**
     * majorSubsystemVersion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMajorSubsystemVersion(EntityStateIntType value) {
        this.majorSubsystemVersion = value;
    }

    /**
     * minorSusbsystemVersion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMinorSusbsystemVersion() {
        return minorSusbsystemVersion;
    }

    /**
     * minorSusbsystemVersion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMinorSusbsystemVersion(EntityStateIntType value) {
        this.minorSusbsystemVersion = value;
    }

    /**
     * sizeOfImage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getSizeOfImage() {
        return sizeOfImage;
    }

    /**
     * sizeOfImage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setSizeOfImage(EntityStateIntType value) {
        this.sizeOfImage = value;
    }

    /**
     * sizeOfHeaders 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getSizeOfHeaders() {
        return sizeOfHeaders;
    }

    /**
     * sizeOfHeaders 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setSizeOfHeaders(EntityStateIntType value) {
        this.sizeOfHeaders = value;
    }

    /**
     * checksum 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getChecksum() {
        return checksum;
    }

    /**
     * checksum 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setChecksum(EntityStateIntType value) {
        this.checksum = value;
    }

    /**
     * subsystem 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatePeSubsystemType }
     *     
     */
    public EntityStatePeSubsystemType getSubsystem() {
        return subsystem;
    }

    /**
     * subsystem 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatePeSubsystemType }
     *     
     */
    public void setSubsystem(EntityStatePeSubsystemType value) {
        this.subsystem = value;
    }

    /**
     * dllCharacteristics 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getDllCharacteristics() {
        return dllCharacteristics;
    }

    /**
     * dllCharacteristics 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setDllCharacteristics(EntityStateIntType value) {
        this.dllCharacteristics = value;
    }

    /**
     * sizeOfStackReserve 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getSizeOfStackReserve() {
        return sizeOfStackReserve;
    }

    /**
     * sizeOfStackReserve 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setSizeOfStackReserve(EntityStateIntType value) {
        this.sizeOfStackReserve = value;
    }

    /**
     * sizeOfStackCommit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getSizeOfStackCommit() {
        return sizeOfStackCommit;
    }

    /**
     * sizeOfStackCommit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setSizeOfStackCommit(EntityStateIntType value) {
        this.sizeOfStackCommit = value;
    }

    /**
     * sizeOfHeapReserve 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getSizeOfHeapReserve() {
        return sizeOfHeapReserve;
    }

    /**
     * sizeOfHeapReserve 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setSizeOfHeapReserve(EntityStateIntType value) {
        this.sizeOfHeapReserve = value;
    }

    /**
     * sizeOfHeapCommit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getSizeOfHeapCommit() {
        return sizeOfHeapCommit;
    }

    /**
     * sizeOfHeapCommit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setSizeOfHeapCommit(EntityStateIntType value) {
        this.sizeOfHeapCommit = value;
    }

    /**
     * loaderFlags 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getLoaderFlags() {
        return loaderFlags;
    }

    /**
     * loaderFlags 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setLoaderFlags(EntityStateIntType value) {
        this.loaderFlags = value;
    }

    /**
     * numberOfRvaAndSizes 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getNumberOfRvaAndSizes() {
        return numberOfRvaAndSizes;
    }

    /**
     * numberOfRvaAndSizes 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setNumberOfRvaAndSizes(EntityStateIntType value) {
        this.numberOfRvaAndSizes = value;
    }

    /**
     * realNumberOfDirectoryEntries 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getRealNumberOfDirectoryEntries() {
        return realNumberOfDirectoryEntries;
    }

    /**
     * realNumberOfDirectoryEntries 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setRealNumberOfDirectoryEntries(EntityStateIntType value) {
        this.realNumberOfDirectoryEntries = value;
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
