//
// 占쏙옙 占쏙옙占쏙옙占쏙옙 JAXB(JavaTM Architecture for XML Binding) 占쏙옙占쏙옙 占쏙옙占쏙옙 2.2.8-b130911.1802 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占실억옙占쏙옙占싹댐옙. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>占쏙옙 占쏙옙占쏙옙占싹십시울옙. 
// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占싹몌옙 占쌀쏙옙 占쏙옙키占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쌌실됩니댐옙. 
// 占쏙옙占쏙옙 占쏙옙짜: 2023.08.18 占시곤옙 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5_linux;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectAnySimpleType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.Filter;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5.Set;


/**
 * <p>anonymous complex type占쏙옙 占쏙옙占쏙옙 Java 클占쏙옙占쏙옙占쌉니댐옙.
 * 
 * <p>占쏙옙占쏙옙 占쏙옙키占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙 클占쏙옙占쏙옙占쏙옙 占쏙옙占쌉되댐옙 占십울옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.mitre.org/XMLSchema/oval-definitions-5}ObjectType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://oval.mitre.org/XMLSchema/oval-definitions-5}set"/>
 *           &lt;sequence>
 *             &lt;element name="behaviors" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#linux}RpmVerifyFileBehaviors" minOccurs="0"/>
 *             &lt;element name="name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityObjectStringType"/>
 *             &lt;element name="epoch">
 *               &lt;complexType>
 *                 &lt;simpleContent>
 *                   &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntityObjectAnySimpleType">
 *                     &lt;attribute name="datatype" default="string">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration">
 *                           &lt;enumeration value="string"/>
 *                           &lt;enumeration value="int"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/attribute>
 *                   &lt;/restriction>
 *                 &lt;/simpleContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *             &lt;element name="version">
 *               &lt;complexType>
 *                 &lt;simpleContent>
 *                   &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntityObjectAnySimpleType">
 *                     &lt;attribute name="datatype" default="string">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration">
 *                           &lt;enumeration value="string"/>
 *                           &lt;enumeration value="version"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/attribute>
 *                   &lt;/restriction>
 *                 &lt;/simpleContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *             &lt;element name="release">
 *               &lt;complexType>
 *                 &lt;simpleContent>
 *                   &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntityObjectAnySimpleType">
 *                     &lt;attribute name="datatype" default="string">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration">
 *                           &lt;enumeration value="string"/>
 *                           &lt;enumeration value="version"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/attribute>
 *                   &lt;/restriction>
 *                 &lt;/simpleContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *             &lt;element name="arch" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityObjectStringType"/>
 *             &lt;element name="filepath" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityObjectStringType"/>
 *             &lt;element ref="{http://oval.mitre.org/XMLSchema/oval-definitions-5}filter" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
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
    "rest"
})
public class RpmverifyfileObject
    extends ObjectType
{

    @XmlElementRefs({
        @XmlElementRef(name = "name", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "filepath", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "behaviors", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "filter", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", type = Filter.class, required = false),
        @XmlElementRef(name = "version", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "release", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "set", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", type = Set.class, required = false),
        @XmlElementRef(name = "epoch", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "arch", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux", type = JAXBElement.class, required = false)
    })
    protected List<Object> rest;

    /**
     * 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙. 
     * 
     * <p>
     * 占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙 占쏙옙 "catch-all" 占쌈쇽옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙 占쌍쏙옙占싹댐옙.
     * 占십듸옙 占싱몌옙 "Version"占쏙옙(占쏙옙) 占쏙옙키占쏙옙占쏙옙 占쌕몌옙 占쏙옙 占싸분울옙 占쏙옙占실억옙占쏙옙占싹댐옙. 占쏙옙占쏙옙: 
     * file:/C:/work/oval/5.11.2/linux-definitions-schema.xsd占쏙옙 1263占쏙옙
     * file:/C:/work/oval/5.11.2/oval-definitions-schema.xsd占쏙옙 420占쏙옙
     * <p>
     * 占쏙옙 占쌈쇽옙占쏙옙 占쏙옙占쏙옙占싹뤄옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙 占쏙옙 占싹놂옙占쏙옙 
     * 占쌈쇽옙 占쏙옙占쏙옙占?占쏙옙占실몌옙 占쏙옙占쏙옙占싹울옙 占싱몌옙占쏙옙 占쏙옙占쏙옙占싹십시울옙. 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link EntityObjectStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityObjectStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link RpmVerifyFileBehaviors }{@code >}
     * {@link Filter }
     * {@link JAXBElement }{@code <}{@link Version }{@code >}
     * {@link JAXBElement }{@code <}{@link Release }{@code >}
     * {@link Set }
     * {@link JAXBElement }{@code <}{@link Epoch }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityObjectStringType }{@code >}
     * 
     * 
     */
    public List<Object> getRest() {
        if (rest == null) {
            rest = new ArrayList<Object>();
        }
        return this.rest;
    }


    /**
     * <p>anonymous complex type占쏙옙 占쏙옙占쏙옙 Java 클占쏙옙占쏙옙占쌉니댐옙.
     * 
     * <p>占쏙옙占쏙옙 占쏙옙키占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙 클占쏙옙占쏙옙占쏙옙 占쏙옙占쌉되댐옙 占십울옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntityObjectAnySimpleType">
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
        extends EntityObjectAnySimpleType
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
     *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntityObjectAnySimpleType">
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
        extends EntityObjectAnySimpleType
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
     *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntityObjectAnySimpleType">
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
        extends EntityObjectAnySimpleType
    {


    }

}
