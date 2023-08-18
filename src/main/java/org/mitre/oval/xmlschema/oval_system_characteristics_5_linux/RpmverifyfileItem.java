//
// 占쏙옙 占쏙옙占쏙옙占쏙옙 JAXB(JavaTM Architecture for XML Binding) 占쏙옙占쏙옙 占쏙옙占쏙옙 2.2.8-b130911.1802 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占실억옙占쏙옙占싹댐옙. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>占쏙옙 占쏙옙占쏙옙占싹십시울옙. 
// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占싹몌옙 占쌀쏙옙 占쏙옙키占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쌌실됩니댐옙. 
// 占쏙옙占쏙옙 占쏙옙짜: 2023.08.18 占시곤옙 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_linux;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemAnySimpleType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemBoolType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;


/**
 * <p>anonymous complex type占쏙옙 占쏙옙占쏙옙 Java 클占쏙옙占쏙옙占쌉니댐옙.
 * 
 * <p>占쏙옙占쏙옙 占쏙옙키占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙 클占쏙옙占쏙옙占쏙옙 占쏙옙占쌉되댐옙 占십울옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}ItemType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="epoch" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-system-characteristics-5>EntityItemAnySimpleType">
 *                 &lt;attribute name="datatype" default="string">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration">
 *                       &lt;enumeration value="string"/>
 *                       &lt;enumeration value="int"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="version" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-system-characteristics-5>EntityItemAnySimpleType">
 *                 &lt;attribute name="datatype" default="string">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration">
 *                       &lt;enumeration value="string"/>
 *                       &lt;enumeration value="version"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="release" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-system-characteristics-5>EntityItemAnySimpleType">
 *                 &lt;attribute name="datatype" default="string">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration">
 *                       &lt;enumeration value="string"/>
 *                       &lt;enumeration value="version"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="arch" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="filepath" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="extended_name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="size_differs" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux}EntityItemRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="mode_differs" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux}EntityItemRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="md5_differs" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux}EntityItemRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="filedigest_differs" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux}EntityItemRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="device_differs" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux}EntityItemRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="link_mismatch" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux}EntityItemRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="ownership_differs" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux}EntityItemRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="group_differs" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux}EntityItemRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="mtime_differs" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux}EntityItemRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="capabilities_differ" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux}EntityItemRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="configuration_file" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="documentation_file" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="ghost_file" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="license_file" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="readme_file" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
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
    "name",
    "epoch",
    "version",
    "release",
    "arch",
    "filepath",
    "extendedName",
    "sizeDiffers",
    "modeDiffers",
    "md5Differs",
    "filedigestDiffers",
    "deviceDiffers",
    "linkMismatch",
    "ownershipDiffers",
    "groupDiffers",
    "mtimeDiffers",
    "capabilitiesDiffer",
    "configurationFile",
    "documentationFile",
    "ghostFile",
    "licenseFile",
    "readmeFile"
})
public class RpmverifyfileItem
    extends ItemType
{

    protected EntityItemStringType name;
    protected Epoch epoch;
    protected Version version;
    protected Release release;
    protected EntityItemStringType arch;
    protected EntityItemStringType filepath;
    @XmlElement(name = "extended_name")
    protected EntityItemStringType extendedName;
    @XmlElement(name = "size_differs")
    protected EntityItemRpmVerifyResultType sizeDiffers;
    @XmlElement(name = "mode_differs")
    protected EntityItemRpmVerifyResultType modeDiffers;
    @XmlElement(name = "md5_differs")
    protected EntityItemRpmVerifyResultType md5Differs;
    @XmlElement(name = "filedigest_differs")
    protected EntityItemRpmVerifyResultType filedigestDiffers;
    @XmlElement(name = "device_differs")
    protected EntityItemRpmVerifyResultType deviceDiffers;
    @XmlElement(name = "link_mismatch")
    protected EntityItemRpmVerifyResultType linkMismatch;
    @XmlElement(name = "ownership_differs")
    protected EntityItemRpmVerifyResultType ownershipDiffers;
    @XmlElement(name = "group_differs")
    protected EntityItemRpmVerifyResultType groupDiffers;
    @XmlElement(name = "mtime_differs")
    protected EntityItemRpmVerifyResultType mtimeDiffers;
    @XmlElement(name = "capabilities_differ")
    protected EntityItemRpmVerifyResultType capabilitiesDiffer;
    @XmlElement(name = "configuration_file")
    protected EntityItemBoolType configurationFile;
    @XmlElement(name = "documentation_file")
    protected EntityItemBoolType documentationFile;
    @XmlElement(name = "ghost_file")
    protected EntityItemBoolType ghostFile;
    @XmlElement(name = "license_file")
    protected EntityItemBoolType licenseFile;
    @XmlElement(name = "readme_file")
    protected EntityItemBoolType readmeFile;

    /**
     * name 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
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
     * name 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
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
     * epoch 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link Epoch }
     *     
     */
    public Epoch getEpoch() {
        return epoch;
    }

    /**
     * epoch 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link Epoch }
     *     
     */
    public void setEpoch(Epoch value) {
        this.epoch = value;
    }

    /**
     * version 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link Version }
     *     
     */
    public Version getVersion() {
        return version;
    }

    /**
     * version 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link Version }
     *     
     */
    public void setVersion(Version value) {
        this.version = value;
    }

    /**
     * release 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link Release }
     *     
     */
    public Release getRelease() {
        return release;
    }

    /**
     * release 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link Release }
     *     
     */
    public void setRelease(Release value) {
        this.release = value;
    }

    /**
     * arch 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getArch() {
        return arch;
    }

    /**
     * arch 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setArch(EntityItemStringType value) {
        this.arch = value;
    }

    /**
     * filepath 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
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
     * filepath 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
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
     * extendedName 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getExtendedName() {
        return extendedName;
    }

    /**
     * extendedName 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setExtendedName(EntityItemStringType value) {
        this.extendedName = value;
    }

    /**
     * sizeDiffers 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public EntityItemRpmVerifyResultType getSizeDiffers() {
        return sizeDiffers;
    }

    /**
     * sizeDiffers 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public void setSizeDiffers(EntityItemRpmVerifyResultType value) {
        this.sizeDiffers = value;
    }

    /**
     * modeDiffers 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public EntityItemRpmVerifyResultType getModeDiffers() {
        return modeDiffers;
    }

    /**
     * modeDiffers 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public void setModeDiffers(EntityItemRpmVerifyResultType value) {
        this.modeDiffers = value;
    }

    /**
     * md5Differs 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public EntityItemRpmVerifyResultType getMd5Differs() {
        return md5Differs;
    }

    /**
     * md5Differs 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public void setMd5Differs(EntityItemRpmVerifyResultType value) {
        this.md5Differs = value;
    }

    /**
     * filedigestDiffers 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public EntityItemRpmVerifyResultType getFiledigestDiffers() {
        return filedigestDiffers;
    }

    /**
     * filedigestDiffers 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public void setFiledigestDiffers(EntityItemRpmVerifyResultType value) {
        this.filedigestDiffers = value;
    }

    /**
     * deviceDiffers 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public EntityItemRpmVerifyResultType getDeviceDiffers() {
        return deviceDiffers;
    }

    /**
     * deviceDiffers 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public void setDeviceDiffers(EntityItemRpmVerifyResultType value) {
        this.deviceDiffers = value;
    }

    /**
     * linkMismatch 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public EntityItemRpmVerifyResultType getLinkMismatch() {
        return linkMismatch;
    }

    /**
     * linkMismatch 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public void setLinkMismatch(EntityItemRpmVerifyResultType value) {
        this.linkMismatch = value;
    }

    /**
     * ownershipDiffers 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public EntityItemRpmVerifyResultType getOwnershipDiffers() {
        return ownershipDiffers;
    }

    /**
     * ownershipDiffers 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public void setOwnershipDiffers(EntityItemRpmVerifyResultType value) {
        this.ownershipDiffers = value;
    }

    /**
     * groupDiffers 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public EntityItemRpmVerifyResultType getGroupDiffers() {
        return groupDiffers;
    }

    /**
     * groupDiffers 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public void setGroupDiffers(EntityItemRpmVerifyResultType value) {
        this.groupDiffers = value;
    }

    /**
     * mtimeDiffers 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public EntityItemRpmVerifyResultType getMtimeDiffers() {
        return mtimeDiffers;
    }

    /**
     * mtimeDiffers 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public void setMtimeDiffers(EntityItemRpmVerifyResultType value) {
        this.mtimeDiffers = value;
    }

    /**
     * capabilitiesDiffer 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public EntityItemRpmVerifyResultType getCapabilitiesDiffer() {
        return capabilitiesDiffer;
    }

    /**
     * capabilitiesDiffer 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public void setCapabilitiesDiffer(EntityItemRpmVerifyResultType value) {
        this.capabilitiesDiffer = value;
    }

    /**
     * configurationFile 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getConfigurationFile() {
        return configurationFile;
    }

    /**
     * configurationFile 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setConfigurationFile(EntityItemBoolType value) {
        this.configurationFile = value;
    }

    /**
     * documentationFile 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getDocumentationFile() {
        return documentationFile;
    }

    /**
     * documentationFile 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setDocumentationFile(EntityItemBoolType value) {
        this.documentationFile = value;
    }

    /**
     * ghostFile 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getGhostFile() {
        return ghostFile;
    }

    /**
     * ghostFile 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setGhostFile(EntityItemBoolType value) {
        this.ghostFile = value;
    }

    /**
     * licenseFile 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getLicenseFile() {
        return licenseFile;
    }

    /**
     * licenseFile 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setLicenseFile(EntityItemBoolType value) {
        this.licenseFile = value;
    }

    /**
     * readmeFile 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getReadmeFile() {
        return readmeFile;
    }

    /**
     * readmeFile 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setReadmeFile(EntityItemBoolType value) {
        this.readmeFile = value;
    }


    /**
     * <p>anonymous complex type占쏙옙 占쏙옙占쏙옙 Java 클占쏙옙占쏙옙占쌉니댐옙.
     * 
     * <p>占쏙옙占쏙옙 占쏙옙키占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙 클占쏙옙占쏙옙占쏙옙 占쏙옙占쌉되댐옙 占십울옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-system-characteristics-5>EntityItemAnySimpleType">
     *       &lt;attribute name="datatype" default="string">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration">
     *             &lt;enumeration value="string"/>
     *             &lt;enumeration value="int"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Epoch
        extends EntityItemAnySimpleType
    {


    }


    /**
     * <p>anonymous complex type占쏙옙 占쏙옙占쏙옙 Java 클占쏙옙占쏙옙占쌉니댐옙.
     * 
     * <p>占쏙옙占쏙옙 占쏙옙키占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙 클占쏙옙占쏙옙占쏙옙 占쏙옙占쌉되댐옙 占십울옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-system-characteristics-5>EntityItemAnySimpleType">
     *       &lt;attribute name="datatype" default="string">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration">
     *             &lt;enumeration value="string"/>
     *             &lt;enumeration value="version"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Release
        extends EntityItemAnySimpleType
    {


    }


    /**
     * <p>anonymous complex type占쏙옙 占쏙옙占쏙옙 Java 클占쏙옙占쏙옙占쌉니댐옙.
     * 
     * <p>占쏙옙占쏙옙 占쏙옙키占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙 클占쏙옙占쏙옙占쏙옙 占쏙옙占쌉되댐옙 占십울옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-system-characteristics-5>EntityItemAnySimpleType">
     *       &lt;attribute name="datatype" default="string">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration">
     *             &lt;enumeration value="string"/>
     *             &lt;enumeration value="version"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Version
        extends EntityItemAnySimpleType
    {


    }

}
