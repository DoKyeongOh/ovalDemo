//
// 占쏙옙 占쏙옙占쏙옙占쏙옙 JAXB(JavaTM Architecture for XML Binding) 占쏙옙占쏙옙 占쏙옙占쏙옙 2.2.8-b130911.1802 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占실억옙占쏙옙占싹댐옙. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>占쏙옙 占쏙옙占쏙옙占싹십시울옙. 
// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占싹몌옙 占쌀쏙옙 占쏙옙키占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쌌실됩니댐옙. 
// 占쏙옙占쏙옙 占쏙옙짜: 2023.08.18 占시곤옙 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_freebsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemAnySimpleType;
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
 *         &lt;element name="pkginst" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="category" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
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
 *         &lt;element name="vendor" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="description" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
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
    "pkginst",
    "name",
    "category",
    "version",
    "vendor",
    "description"
})
public class PortinfoItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#freebsd")
    protected EntityItemStringType pkginst;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#freebsd")
    protected EntityItemStringType name;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#freebsd")
    protected EntityItemStringType category;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#freebsd")
    protected Version version;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#freebsd")
    protected EntityItemStringType vendor;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#freebsd")
    protected EntityItemStringType description;

    /**
     * pkginst 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getPkginst() {
        return pkginst;
    }

    /**
     * pkginst 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setPkginst(EntityItemStringType value) {
        this.pkginst = value;
    }

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
     * category 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getCategory() {
        return category;
    }

    /**
     * category 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setCategory(EntityItemStringType value) {
        this.category = value;
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
     * vendor 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getVendor() {
        return vendor;
    }

    /**
     * vendor 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setVendor(EntityItemStringType value) {
        this.vendor = value;
    }

    /**
     * description 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getDescription() {
        return description;
    }

    /**
     * description 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setDescription(EntityItemStringType value) {
        this.description = value;
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
