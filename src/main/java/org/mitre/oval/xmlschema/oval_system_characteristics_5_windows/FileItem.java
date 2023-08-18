//
// 占쏙옙 占쏙옙占쏙옙占쏙옙 JAXB(JavaTM Architecture for XML Binding) 占쏙옙占쏙옙 占쏙옙占쏙옙 2.2.8-b130911.1802 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占실억옙占쏙옙占싹댐옙. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>占쏙옙 占쏙옙占쏙옙占싹십시울옙. 
// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占싹몌옙 占쌀쏙옙 占쏙옙키占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쌌실됩니댐옙. 
// 占쏙옙占쏙옙 占쏙옙짜: 2023.08.18 占시곤옙 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_windows;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemAnySimpleType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemIntType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemVersionType;
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
 *         &lt;element name="filepath" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="path" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="filename" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="size" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="a_time" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="c_time" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="m_time" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="ms_checksum" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="version" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemVersionType" minOccurs="0"/>
 *         &lt;element name="type" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemFileTypeType" minOccurs="0"/>
 *         &lt;element name="attribute" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemFileAttributeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="development_class" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="company" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="internal_name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="language" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="original_filename" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="product_name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="product_version" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-system-characteristics-5>EntityItemAnySimpleType">
 *                 &lt;attribute name="datatype" default="version">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration">
 *                       &lt;enumeration value="version"/>
 *                       &lt;enumeration value="string"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "owner",
    "size",
    "aTime",
    "cTime",
    "mTime",
    "msChecksum",
    "version",
    "type",
    "attribute",
    "developmentClass",
    "company",
    "internalName",
    "language",
    "originalFilename",
    "productName",
    "productVersion",
    "windowsView"
})
public class FileItem
    extends ItemType
{

    protected EntityItemStringType filepath;
    protected EntityItemStringType path;
    @XmlElementRef(name = "filename", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityItemStringType> filename;
    protected EntityItemStringType owner;
    protected EntityItemIntType size;
    @XmlElement(name = "a_time")
    protected EntityItemIntType aTime;
    @XmlElement(name = "c_time")
    protected EntityItemIntType cTime;
    @XmlElement(name = "m_time")
    protected EntityItemIntType mTime;
    @XmlElement(name = "ms_checksum")
    protected EntityItemStringType msChecksum;
    protected EntityItemVersionType version;
    protected EntityItemFileTypeType type;
    protected List<EntityItemFileAttributeType> attribute;
    @XmlElement(name = "development_class")
    protected EntityItemStringType developmentClass;
    protected EntityItemStringType company;
    @XmlElement(name = "internal_name")
    protected EntityItemStringType internalName;
    protected EntityItemStringType language;
    @XmlElement(name = "original_filename")
    protected EntityItemStringType originalFilename;
    @XmlElement(name = "product_name")
    protected EntityItemStringType productName;
    @XmlElement(name = "product_version")
    protected ProductVersion productVersion;
    @XmlElement(name = "windows_view")
    protected EntityItemWindowsViewType windowsView;

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
     * path 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
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
     * path 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
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
     * filename 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}
     *     
     */
    public JAXBElement<EntityItemStringType> getFilename() {
        return filename;
    }

    /**
     * filename 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}
     *     
     */
    public void setFilename(JAXBElement<EntityItemStringType> value) {
        this.filename = value;
    }

    /**
     * owner 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getOwner() {
        return owner;
    }

    /**
     * owner 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setOwner(EntityItemStringType value) {
        this.owner = value;
    }

    /**
     * size 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getSize() {
        return size;
    }

    /**
     * size 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setSize(EntityItemIntType value) {
        this.size = value;
    }

    /**
     * aTime 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getATime() {
        return aTime;
    }

    /**
     * aTime 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setATime(EntityItemIntType value) {
        this.aTime = value;
    }

    /**
     * cTime 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getCTime() {
        return cTime;
    }

    /**
     * cTime 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setCTime(EntityItemIntType value) {
        this.cTime = value;
    }

    /**
     * mTime 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMTime() {
        return mTime;
    }

    /**
     * mTime 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMTime(EntityItemIntType value) {
        this.mTime = value;
    }

    /**
     * msChecksum 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getMsChecksum() {
        return msChecksum;
    }

    /**
     * msChecksum 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setMsChecksum(EntityItemStringType value) {
        this.msChecksum = value;
    }

    /**
     * version 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemVersionType }
     *     
     */
    public EntityItemVersionType getVersion() {
        return version;
    }

    /**
     * version 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemVersionType }
     *     
     */
    public void setVersion(EntityItemVersionType value) {
        this.version = value;
    }

    /**
     * type 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemFileTypeType }
     *     
     */
    public EntityItemFileTypeType getType() {
        return type;
    }

    /**
     * type 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemFileTypeType }
     *     
     */
    public void setType(EntityItemFileTypeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemFileAttributeType }
     * 
     * 
     */
    public List<EntityItemFileAttributeType> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<EntityItemFileAttributeType>();
        }
        return this.attribute;
    }

    /**
     * developmentClass 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getDevelopmentClass() {
        return developmentClass;
    }

    /**
     * developmentClass 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setDevelopmentClass(EntityItemStringType value) {
        this.developmentClass = value;
    }

    /**
     * company 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getCompany() {
        return company;
    }

    /**
     * company 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setCompany(EntityItemStringType value) {
        this.company = value;
    }

    /**
     * internalName 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getInternalName() {
        return internalName;
    }

    /**
     * internalName 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setInternalName(EntityItemStringType value) {
        this.internalName = value;
    }

    /**
     * language 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getLanguage() {
        return language;
    }

    /**
     * language 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setLanguage(EntityItemStringType value) {
        this.language = value;
    }

    /**
     * originalFilename 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getOriginalFilename() {
        return originalFilename;
    }

    /**
     * originalFilename 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setOriginalFilename(EntityItemStringType value) {
        this.originalFilename = value;
    }

    /**
     * productName 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getProductName() {
        return productName;
    }

    /**
     * productName 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setProductName(EntityItemStringType value) {
        this.productName = value;
    }

    /**
     * productVersion 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link ProductVersion }
     *     
     */
    public ProductVersion getProductVersion() {
        return productVersion;
    }

    /**
     * productVersion 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductVersion }
     *     
     */
    public void setProductVersion(ProductVersion value) {
        this.productVersion = value;
    }

    /**
     * windowsView 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
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
     * windowsView 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemWindowsViewType }
     *     
     */
    public void setWindowsView(EntityItemWindowsViewType value) {
        this.windowsView = value;
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
     *       &lt;attribute name="datatype" default="version">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration">
     *             &lt;enumeration value="version"/>
     *             &lt;enumeration value="string"/>
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
    public static class ProductVersion
        extends EntityItemAnySimpleType
    {


    }

}
