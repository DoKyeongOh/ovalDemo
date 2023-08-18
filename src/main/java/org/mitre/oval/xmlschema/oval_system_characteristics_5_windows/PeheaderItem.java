//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_windows;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="filepath" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="path" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="filename" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="header_signature" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="target_machine_type" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemPeTargetMachineType" minOccurs="0"/>
 *         &lt;element name="number_of_sections" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="time_date_stamp" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="pointer_to_symbol_table" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="number_of_symbols" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="size_of_optional_header" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="image_file_relocs_stripped" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_executable_image" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_line_nums_stripped" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_local_syms_stripped" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_aggresive_ws_trim" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_large_address_aware" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_16bit_machine" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_bytes_reversed_lo" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_32bit_machine" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_debug_stripped" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_removable_run_from_swap" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_system" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_dll" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_up_system_only" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="image_file_bytes_reveresed_hi" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="magic_number" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="major_linker_version" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="minor_linker_version" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="size_of_code" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="size_of_initialized_data" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="size_of_uninitialized_data" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="address_of_entry_point" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="base_of_code" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="base_of_data" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="image_base_address" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="section_alignment" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="file_alignment" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="major_operating_system_version" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="minor_operating_system_version" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="major_image_version" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="minor_image_version" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="major_subsystem_version" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="minor_susbsystem_version" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="size_of_image" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="size_of_headers" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="checksum" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="subsystem" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemPeSubsystemType" minOccurs="0"/>
 *         &lt;element name="dll_characteristics" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="size_of_stack_reserve" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="size_of_stack_commit" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="size_of_heap_reserve" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="size_of_heap_commit" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="loader_flags" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="number_of_rva_and_sizes" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="real_number_of_directory_entries" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="windows_view" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemWindowsViewType" minOccurs="0"/>
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
public class PeheaderItem
    extends ItemType
{

    protected EntityItemStringType filepath;
    protected EntityItemStringType path;
    protected EntityItemStringType filename;
    @XmlElement(name = "header_signature")
    protected EntityItemStringType headerSignature;
    @XmlElement(name = "target_machine_type")
    protected EntityItemPeTargetMachineType targetMachineType;
    @XmlElement(name = "number_of_sections")
    protected EntityItemIntType numberOfSections;
    @XmlElement(name = "time_date_stamp")
    protected EntityItemIntType timeDateStamp;
    @XmlElement(name = "pointer_to_symbol_table")
    protected EntityItemIntType pointerToSymbolTable;
    @XmlElement(name = "number_of_symbols")
    protected EntityItemIntType numberOfSymbols;
    @XmlElement(name = "size_of_optional_header")
    protected EntityItemIntType sizeOfOptionalHeader;
    @XmlElement(name = "image_file_relocs_stripped", defaultValue = "false")
    protected EntityItemBoolType imageFileRelocsStripped;
    @XmlElement(name = "image_file_executable_image", defaultValue = "false")
    protected EntityItemBoolType imageFileExecutableImage;
    @XmlElement(name = "image_file_line_nums_stripped", defaultValue = "false")
    protected EntityItemBoolType imageFileLineNumsStripped;
    @XmlElement(name = "image_file_local_syms_stripped", defaultValue = "false")
    protected EntityItemBoolType imageFileLocalSymsStripped;
    @XmlElement(name = "image_file_aggresive_ws_trim", defaultValue = "false")
    protected EntityItemBoolType imageFileAggresiveWsTrim;
    @XmlElement(name = "image_file_large_address_aware", defaultValue = "false")
    protected EntityItemBoolType imageFileLargeAddressAware;
    @XmlElement(name = "image_file_16bit_machine", defaultValue = "false")
    protected EntityItemBoolType imageFile16BitMachine;
    @XmlElement(name = "image_file_bytes_reversed_lo", defaultValue = "false")
    protected EntityItemBoolType imageFileBytesReversedLo;
    @XmlElement(name = "image_file_32bit_machine", defaultValue = "false")
    protected EntityItemBoolType imageFile32BitMachine;
    @XmlElement(name = "image_file_debug_stripped", defaultValue = "false")
    protected EntityItemBoolType imageFileDebugStripped;
    @XmlElement(name = "image_file_removable_run_from_swap", defaultValue = "false")
    protected EntityItemBoolType imageFileRemovableRunFromSwap;
    @XmlElement(name = "image_file_system", defaultValue = "false")
    protected EntityItemBoolType imageFileSystem;
    @XmlElement(name = "image_file_dll", defaultValue = "false")
    protected EntityItemBoolType imageFileDll;
    @XmlElement(name = "image_file_up_system_only", defaultValue = "false")
    protected EntityItemBoolType imageFileUpSystemOnly;
    @XmlElement(name = "image_file_bytes_reveresed_hi", defaultValue = "false")
    protected EntityItemBoolType imageFileBytesReveresedHi;
    @XmlElement(name = "magic_number")
    protected EntityItemIntType magicNumber;
    @XmlElement(name = "major_linker_version")
    protected EntityItemIntType majorLinkerVersion;
    @XmlElement(name = "minor_linker_version")
    protected EntityItemIntType minorLinkerVersion;
    @XmlElement(name = "size_of_code")
    protected EntityItemIntType sizeOfCode;
    @XmlElement(name = "size_of_initialized_data")
    protected EntityItemIntType sizeOfInitializedData;
    @XmlElement(name = "size_of_uninitialized_data")
    protected EntityItemIntType sizeOfUninitializedData;
    @XmlElement(name = "address_of_entry_point")
    protected EntityItemIntType addressOfEntryPoint;
    @XmlElement(name = "base_of_code")
    protected EntityItemIntType baseOfCode;
    @XmlElement(name = "base_of_data")
    protected EntityItemIntType baseOfData;
    @XmlElement(name = "image_base_address")
    protected EntityItemIntType imageBaseAddress;
    @XmlElement(name = "section_alignment")
    protected EntityItemIntType sectionAlignment;
    @XmlElement(name = "file_alignment")
    protected EntityItemIntType fileAlignment;
    @XmlElement(name = "major_operating_system_version")
    protected EntityItemIntType majorOperatingSystemVersion;
    @XmlElement(name = "minor_operating_system_version")
    protected EntityItemIntType minorOperatingSystemVersion;
    @XmlElement(name = "major_image_version")
    protected EntityItemIntType majorImageVersion;
    @XmlElement(name = "minor_image_version")
    protected EntityItemIntType minorImageVersion;
    @XmlElement(name = "major_subsystem_version")
    protected EntityItemIntType majorSubsystemVersion;
    @XmlElement(name = "minor_susbsystem_version")
    protected EntityItemIntType minorSusbsystemVersion;
    @XmlElement(name = "size_of_image")
    protected EntityItemIntType sizeOfImage;
    @XmlElement(name = "size_of_headers")
    protected EntityItemIntType sizeOfHeaders;
    protected EntityItemIntType checksum;
    protected EntityItemPeSubsystemType subsystem;
    @XmlElement(name = "dll_characteristics")
    protected List<EntityItemIntType> dllCharacteristics;
    @XmlElement(name = "size_of_stack_reserve")
    protected EntityItemIntType sizeOfStackReserve;
    @XmlElement(name = "size_of_stack_commit")
    protected EntityItemIntType sizeOfStackCommit;
    @XmlElement(name = "size_of_heap_reserve")
    protected EntityItemIntType sizeOfHeapReserve;
    @XmlElement(name = "size_of_heap_commit")
    protected EntityItemIntType sizeOfHeapCommit;
    @XmlElement(name = "loader_flags")
    protected EntityItemIntType loaderFlags;
    @XmlElement(name = "number_of_rva_and_sizes")
    protected EntityItemIntType numberOfRvaAndSizes;
    @XmlElement(name = "real_number_of_directory_entries")
    protected EntityItemIntType realNumberOfDirectoryEntries;
    @XmlElement(name = "windows_view")
    protected EntityItemWindowsViewType windowsView;

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
     * path 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getPath() {
        return path;
    }

    /**
     * path 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setPath(EntityItemStringType value) {
        this.path = value;
    }

    /**
     * filename 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getFilename() {
        return filename;
    }

    /**
     * filename 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setFilename(EntityItemStringType value) {
        this.filename = value;
    }

    /**
     * headerSignature 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getHeaderSignature() {
        return headerSignature;
    }

    /**
     * headerSignature 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setHeaderSignature(EntityItemStringType value) {
        this.headerSignature = value;
    }

    /**
     * targetMachineType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemPeTargetMachineType }
     *     
     */
    public EntityItemPeTargetMachineType getTargetMachineType() {
        return targetMachineType;
    }

    /**
     * targetMachineType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemPeTargetMachineType }
     *     
     */
    public void setTargetMachineType(EntityItemPeTargetMachineType value) {
        this.targetMachineType = value;
    }

    /**
     * numberOfSections 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getNumberOfSections() {
        return numberOfSections;
    }

    /**
     * numberOfSections 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setNumberOfSections(EntityItemIntType value) {
        this.numberOfSections = value;
    }

    /**
     * timeDateStamp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getTimeDateStamp() {
        return timeDateStamp;
    }

    /**
     * timeDateStamp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setTimeDateStamp(EntityItemIntType value) {
        this.timeDateStamp = value;
    }

    /**
     * pointerToSymbolTable 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getPointerToSymbolTable() {
        return pointerToSymbolTable;
    }

    /**
     * pointerToSymbolTable 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setPointerToSymbolTable(EntityItemIntType value) {
        this.pointerToSymbolTable = value;
    }

    /**
     * numberOfSymbols 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getNumberOfSymbols() {
        return numberOfSymbols;
    }

    /**
     * numberOfSymbols 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setNumberOfSymbols(EntityItemIntType value) {
        this.numberOfSymbols = value;
    }

    /**
     * sizeOfOptionalHeader 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getSizeOfOptionalHeader() {
        return sizeOfOptionalHeader;
    }

    /**
     * sizeOfOptionalHeader 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setSizeOfOptionalHeader(EntityItemIntType value) {
        this.sizeOfOptionalHeader = value;
    }

    /**
     * imageFileRelocsStripped 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getImageFileRelocsStripped() {
        return imageFileRelocsStripped;
    }

    /**
     * imageFileRelocsStripped 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setImageFileRelocsStripped(EntityItemBoolType value) {
        this.imageFileRelocsStripped = value;
    }

    /**
     * imageFileExecutableImage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getImageFileExecutableImage() {
        return imageFileExecutableImage;
    }

    /**
     * imageFileExecutableImage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setImageFileExecutableImage(EntityItemBoolType value) {
        this.imageFileExecutableImage = value;
    }

    /**
     * imageFileLineNumsStripped 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getImageFileLineNumsStripped() {
        return imageFileLineNumsStripped;
    }

    /**
     * imageFileLineNumsStripped 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setImageFileLineNumsStripped(EntityItemBoolType value) {
        this.imageFileLineNumsStripped = value;
    }

    /**
     * imageFileLocalSymsStripped 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getImageFileLocalSymsStripped() {
        return imageFileLocalSymsStripped;
    }

    /**
     * imageFileLocalSymsStripped 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setImageFileLocalSymsStripped(EntityItemBoolType value) {
        this.imageFileLocalSymsStripped = value;
    }

    /**
     * imageFileAggresiveWsTrim 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getImageFileAggresiveWsTrim() {
        return imageFileAggresiveWsTrim;
    }

    /**
     * imageFileAggresiveWsTrim 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setImageFileAggresiveWsTrim(EntityItemBoolType value) {
        this.imageFileAggresiveWsTrim = value;
    }

    /**
     * imageFileLargeAddressAware 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getImageFileLargeAddressAware() {
        return imageFileLargeAddressAware;
    }

    /**
     * imageFileLargeAddressAware 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setImageFileLargeAddressAware(EntityItemBoolType value) {
        this.imageFileLargeAddressAware = value;
    }

    /**
     * imageFile16BitMachine 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getImageFile16BitMachine() {
        return imageFile16BitMachine;
    }

    /**
     * imageFile16BitMachine 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setImageFile16BitMachine(EntityItemBoolType value) {
        this.imageFile16BitMachine = value;
    }

    /**
     * imageFileBytesReversedLo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getImageFileBytesReversedLo() {
        return imageFileBytesReversedLo;
    }

    /**
     * imageFileBytesReversedLo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setImageFileBytesReversedLo(EntityItemBoolType value) {
        this.imageFileBytesReversedLo = value;
    }

    /**
     * imageFile32BitMachine 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getImageFile32BitMachine() {
        return imageFile32BitMachine;
    }

    /**
     * imageFile32BitMachine 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setImageFile32BitMachine(EntityItemBoolType value) {
        this.imageFile32BitMachine = value;
    }

    /**
     * imageFileDebugStripped 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getImageFileDebugStripped() {
        return imageFileDebugStripped;
    }

    /**
     * imageFileDebugStripped 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setImageFileDebugStripped(EntityItemBoolType value) {
        this.imageFileDebugStripped = value;
    }

    /**
     * imageFileRemovableRunFromSwap 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getImageFileRemovableRunFromSwap() {
        return imageFileRemovableRunFromSwap;
    }

    /**
     * imageFileRemovableRunFromSwap 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setImageFileRemovableRunFromSwap(EntityItemBoolType value) {
        this.imageFileRemovableRunFromSwap = value;
    }

    /**
     * imageFileSystem 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getImageFileSystem() {
        return imageFileSystem;
    }

    /**
     * imageFileSystem 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setImageFileSystem(EntityItemBoolType value) {
        this.imageFileSystem = value;
    }

    /**
     * imageFileDll 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getImageFileDll() {
        return imageFileDll;
    }

    /**
     * imageFileDll 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setImageFileDll(EntityItemBoolType value) {
        this.imageFileDll = value;
    }

    /**
     * imageFileUpSystemOnly 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getImageFileUpSystemOnly() {
        return imageFileUpSystemOnly;
    }

    /**
     * imageFileUpSystemOnly 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setImageFileUpSystemOnly(EntityItemBoolType value) {
        this.imageFileUpSystemOnly = value;
    }

    /**
     * imageFileBytesReveresedHi 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getImageFileBytesReveresedHi() {
        return imageFileBytesReveresedHi;
    }

    /**
     * imageFileBytesReveresedHi 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setImageFileBytesReveresedHi(EntityItemBoolType value) {
        this.imageFileBytesReveresedHi = value;
    }

    /**
     * magicNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMagicNumber() {
        return magicNumber;
    }

    /**
     * magicNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMagicNumber(EntityItemIntType value) {
        this.magicNumber = value;
    }

    /**
     * majorLinkerVersion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMajorLinkerVersion() {
        return majorLinkerVersion;
    }

    /**
     * majorLinkerVersion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMajorLinkerVersion(EntityItemIntType value) {
        this.majorLinkerVersion = value;
    }

    /**
     * minorLinkerVersion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMinorLinkerVersion() {
        return minorLinkerVersion;
    }

    /**
     * minorLinkerVersion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMinorLinkerVersion(EntityItemIntType value) {
        this.minorLinkerVersion = value;
    }

    /**
     * sizeOfCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getSizeOfCode() {
        return sizeOfCode;
    }

    /**
     * sizeOfCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setSizeOfCode(EntityItemIntType value) {
        this.sizeOfCode = value;
    }

    /**
     * sizeOfInitializedData 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getSizeOfInitializedData() {
        return sizeOfInitializedData;
    }

    /**
     * sizeOfInitializedData 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setSizeOfInitializedData(EntityItemIntType value) {
        this.sizeOfInitializedData = value;
    }

    /**
     * sizeOfUninitializedData 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getSizeOfUninitializedData() {
        return sizeOfUninitializedData;
    }

    /**
     * sizeOfUninitializedData 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setSizeOfUninitializedData(EntityItemIntType value) {
        this.sizeOfUninitializedData = value;
    }

    /**
     * addressOfEntryPoint 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getAddressOfEntryPoint() {
        return addressOfEntryPoint;
    }

    /**
     * addressOfEntryPoint 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setAddressOfEntryPoint(EntityItemIntType value) {
        this.addressOfEntryPoint = value;
    }

    /**
     * baseOfCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getBaseOfCode() {
        return baseOfCode;
    }

    /**
     * baseOfCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setBaseOfCode(EntityItemIntType value) {
        this.baseOfCode = value;
    }

    /**
     * baseOfData 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getBaseOfData() {
        return baseOfData;
    }

    /**
     * baseOfData 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setBaseOfData(EntityItemIntType value) {
        this.baseOfData = value;
    }

    /**
     * imageBaseAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getImageBaseAddress() {
        return imageBaseAddress;
    }

    /**
     * imageBaseAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setImageBaseAddress(EntityItemIntType value) {
        this.imageBaseAddress = value;
    }

    /**
     * sectionAlignment 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getSectionAlignment() {
        return sectionAlignment;
    }

    /**
     * sectionAlignment 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setSectionAlignment(EntityItemIntType value) {
        this.sectionAlignment = value;
    }

    /**
     * fileAlignment 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getFileAlignment() {
        return fileAlignment;
    }

    /**
     * fileAlignment 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setFileAlignment(EntityItemIntType value) {
        this.fileAlignment = value;
    }

    /**
     * majorOperatingSystemVersion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMajorOperatingSystemVersion() {
        return majorOperatingSystemVersion;
    }

    /**
     * majorOperatingSystemVersion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMajorOperatingSystemVersion(EntityItemIntType value) {
        this.majorOperatingSystemVersion = value;
    }

    /**
     * minorOperatingSystemVersion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMinorOperatingSystemVersion() {
        return minorOperatingSystemVersion;
    }

    /**
     * minorOperatingSystemVersion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMinorOperatingSystemVersion(EntityItemIntType value) {
        this.minorOperatingSystemVersion = value;
    }

    /**
     * majorImageVersion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMajorImageVersion() {
        return majorImageVersion;
    }

    /**
     * majorImageVersion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMajorImageVersion(EntityItemIntType value) {
        this.majorImageVersion = value;
    }

    /**
     * minorImageVersion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMinorImageVersion() {
        return minorImageVersion;
    }

    /**
     * minorImageVersion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMinorImageVersion(EntityItemIntType value) {
        this.minorImageVersion = value;
    }

    /**
     * majorSubsystemVersion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMajorSubsystemVersion() {
        return majorSubsystemVersion;
    }

    /**
     * majorSubsystemVersion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMajorSubsystemVersion(EntityItemIntType value) {
        this.majorSubsystemVersion = value;
    }

    /**
     * minorSusbsystemVersion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMinorSusbsystemVersion() {
        return minorSusbsystemVersion;
    }

    /**
     * minorSusbsystemVersion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMinorSusbsystemVersion(EntityItemIntType value) {
        this.minorSusbsystemVersion = value;
    }

    /**
     * sizeOfImage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getSizeOfImage() {
        return sizeOfImage;
    }

    /**
     * sizeOfImage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setSizeOfImage(EntityItemIntType value) {
        this.sizeOfImage = value;
    }

    /**
     * sizeOfHeaders 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getSizeOfHeaders() {
        return sizeOfHeaders;
    }

    /**
     * sizeOfHeaders 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setSizeOfHeaders(EntityItemIntType value) {
        this.sizeOfHeaders = value;
    }

    /**
     * checksum 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getChecksum() {
        return checksum;
    }

    /**
     * checksum 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setChecksum(EntityItemIntType value) {
        this.checksum = value;
    }

    /**
     * subsystem 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemPeSubsystemType }
     *     
     */
    public EntityItemPeSubsystemType getSubsystem() {
        return subsystem;
    }

    /**
     * subsystem 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemPeSubsystemType }
     *     
     */
    public void setSubsystem(EntityItemPeSubsystemType value) {
        this.subsystem = value;
    }

    /**
     * Gets the value of the dllCharacteristics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dllCharacteristics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDllCharacteristics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemIntType }
     * 
     * 
     */
    public List<EntityItemIntType> getDllCharacteristics() {
        if (dllCharacteristics == null) {
            dllCharacteristics = new ArrayList<EntityItemIntType>();
        }
        return this.dllCharacteristics;
    }

    /**
     * sizeOfStackReserve 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getSizeOfStackReserve() {
        return sizeOfStackReserve;
    }

    /**
     * sizeOfStackReserve 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setSizeOfStackReserve(EntityItemIntType value) {
        this.sizeOfStackReserve = value;
    }

    /**
     * sizeOfStackCommit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getSizeOfStackCommit() {
        return sizeOfStackCommit;
    }

    /**
     * sizeOfStackCommit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setSizeOfStackCommit(EntityItemIntType value) {
        this.sizeOfStackCommit = value;
    }

    /**
     * sizeOfHeapReserve 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getSizeOfHeapReserve() {
        return sizeOfHeapReserve;
    }

    /**
     * sizeOfHeapReserve 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setSizeOfHeapReserve(EntityItemIntType value) {
        this.sizeOfHeapReserve = value;
    }

    /**
     * sizeOfHeapCommit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getSizeOfHeapCommit() {
        return sizeOfHeapCommit;
    }

    /**
     * sizeOfHeapCommit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setSizeOfHeapCommit(EntityItemIntType value) {
        this.sizeOfHeapCommit = value;
    }

    /**
     * loaderFlags 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getLoaderFlags() {
        return loaderFlags;
    }

    /**
     * loaderFlags 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setLoaderFlags(EntityItemIntType value) {
        this.loaderFlags = value;
    }

    /**
     * numberOfRvaAndSizes 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getNumberOfRvaAndSizes() {
        return numberOfRvaAndSizes;
    }

    /**
     * numberOfRvaAndSizes 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setNumberOfRvaAndSizes(EntityItemIntType value) {
        this.numberOfRvaAndSizes = value;
    }

    /**
     * realNumberOfDirectoryEntries 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getRealNumberOfDirectoryEntries() {
        return realNumberOfDirectoryEntries;
    }

    /**
     * realNumberOfDirectoryEntries 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setRealNumberOfDirectoryEntries(EntityItemIntType value) {
        this.realNumberOfDirectoryEntries = value;
    }

    /**
     * windowsView 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemWindowsViewType }
     *     
     */
    public EntityItemWindowsViewType getWindowsView() {
        return windowsView;
    }

    /**
     * windowsView 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemWindowsViewType }
     *     
     */
    public void setWindowsView(EntityItemWindowsViewType value) {
        this.windowsView = value;
    }

}
