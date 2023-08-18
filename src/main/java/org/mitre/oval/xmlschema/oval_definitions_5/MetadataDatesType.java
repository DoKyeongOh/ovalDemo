//
// 占쏙옙 占쏙옙占쏙옙占쏙옙 JAXB(JavaTM Architecture for XML Binding) 占쏙옙占쏙옙 占쏙옙占쏙옙 2.2.8-b130911.1802 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占실억옙占쏙옙占싹댐옙. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>占쏙옙 占쏙옙占쏙옙占싹십시울옙. 
// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占싹몌옙 占쌀쏙옙 占쏙옙키占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쌌실됩니댐옙. 
// 占쏙옙占쏙옙 占쏙옙짜: 2023.08.18 占시곤옙 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>MetadataDatesType complex type占쏙옙 占쏙옙占쏙옙 Java 클占쏙옙占쏙옙占쌉니댐옙.
 * 
 * <p>占쏙옙占쏙옙 占쏙옙키占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙 클占쏙옙占쏙옙占쏙옙 占쏙옙占쌉되댐옙 占십울옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
 * 
 * <pre>
 * &lt;complexType name="MetadataDatesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="created" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="contributor" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}MetadataContributorType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="submitted">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="contributor" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}MetadataContributorType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="modified">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="contributor" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}MetadataContributorType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                   &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                   &lt;attribute name="comment" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="status_change">
 *             &lt;complexType>
 *               &lt;simpleContent>
 *                 &lt;extension base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>MetadataStatusEnumeration">
 *                   &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;/extension>
 *               &lt;/simpleContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataDatesType", propOrder = {
    "created",
    "submitted",
    "modifiedOrStatusChange"
})
public class MetadataDatesType {

    protected Created created;
    @XmlElement(required = true)
    protected Submitted submitted;
    @XmlElements({
        @XmlElement(name = "modified", type = Modified.class),
        @XmlElement(name = "status_change", type = StatusChange.class)
    })
    protected List<Object> modifiedOrStatusChange;

    /**
     * created 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link Created }
     *     
     */
    public Created getCreated() {
        return created;
    }

    /**
     * created 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link Created }
     *     
     */
    public void setCreated(Created value) {
        this.created = value;
    }

    /**
     * submitted 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
     * 
     * @return
     *     possible object is
     *     {@link Submitted }
     *     
     */
    public Submitted getSubmitted() {
        return submitted;
    }

    /**
     * submitted 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * @param value
     *     allowed object is
     *     {@link Submitted }
     *     
     */
    public void setSubmitted(Submitted value) {
        this.submitted = value;
    }

    /**
     * Gets the value of the modifiedOrStatusChange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modifiedOrStatusChange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModifiedOrStatusChange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Modified }
     * {@link StatusChange }
     * 
     * 
     */
    public List<Object> getModifiedOrStatusChange() {
        if (modifiedOrStatusChange == null) {
            modifiedOrStatusChange = new ArrayList<Object>();
        }
        return this.modifiedOrStatusChange;
    }


    /**
     * <p>anonymous complex type占쏙옙 占쏙옙占쏙옙 Java 클占쏙옙占쏙옙占쌉니댐옙.
     * 
     * <p>占쏙옙占쏙옙 占쏙옙키占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙 클占쏙옙占쏙옙占쏙옙 占쏙옙占쌉되댐옙 占십울옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="contributor" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}MetadataContributorType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "contributor"
    })
    public static class Created {

        protected List<MetadataContributorType> contributor;
        @XmlAttribute(name = "date", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar date;

        /**
         * Gets the value of the contributor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contributor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContributor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MetadataContributorType }
         * 
         * 
         */
        public List<MetadataContributorType> getContributor() {
            if (contributor == null) {
                contributor = new ArrayList<MetadataContributorType>();
            }
            return this.contributor;
        }

        /**
         * date 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * date 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
        }

    }


    /**
     * <p>anonymous complex type占쏙옙 占쏙옙占쏙옙 Java 클占쏙옙占쏙옙占쌉니댐옙.
     * 
     * <p>占쏙옙占쏙옙 占쏙옙키占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙 클占쏙옙占쏙옙占쏙옙 占쏙옙占쌉되댐옙 占십울옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="contributor" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}MetadataContributorType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="comment" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "contributor"
    })
    public static class Modified {

        protected List<MetadataContributorType> contributor;
        @XmlAttribute(name = "date", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar date;
        @XmlAttribute(name = "comment", required = true)
        protected String comment;

        /**
         * Gets the value of the contributor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contributor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContributor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MetadataContributorType }
         * 
         * 
         */
        public List<MetadataContributorType> getContributor() {
            if (contributor == null) {
                contributor = new ArrayList<MetadataContributorType>();
            }
            return this.contributor;
        }

        /**
         * date 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * date 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
        }

        /**
         * comment 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComment() {
            return comment;
        }

        /**
         * comment 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComment(String value) {
            this.comment = value;
        }

    }


    /**
     * <p>anonymous complex type占쏙옙 占쏙옙占쏙옙 Java 클占쏙옙占쏙옙占쌉니댐옙.
     * 
     * <p>占쏙옙占쏙옙 占쏙옙키占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙 클占쏙옙占쏙옙占쏙옙 占쏙옙占쌉되댐옙 占십울옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>MetadataStatusEnumeration">
     *       &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class StatusChange {

        @XmlValue
        protected MetadataStatusEnumeration value;
        @XmlAttribute(name = "date", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar date;

        /**
         * value 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
         * 
         * @return
         *     possible object is
         *     {@link MetadataStatusEnumeration }
         *     
         */
        public MetadataStatusEnumeration getValue() {
            return value;
        }

        /**
         * value 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
         * 
         * @param value
         *     allowed object is
         *     {@link MetadataStatusEnumeration }
         *     
         */
        public void setValue(MetadataStatusEnumeration value) {
            this.value = value;
        }

        /**
         * date 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * date 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
        }

    }


    /**
     * <p>anonymous complex type占쏙옙 占쏙옙占쏙옙 Java 클占쏙옙占쏙옙占쌉니댐옙.
     * 
     * <p>占쏙옙占쏙옙 占쏙옙키占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙 클占쏙옙占쏙옙占쏙옙 占쏙옙占쌉되댐옙 占십울옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="contributor" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}MetadataContributorType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "contributor"
    })
    public static class Submitted {

        protected List<MetadataContributorType> contributor;
        @XmlAttribute(name = "date", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar date;

        /**
         * Gets the value of the contributor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contributor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContributor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MetadataContributorType }
         * 
         * 
         */
        public List<MetadataContributorType> getContributor() {
            if (contributor == null) {
                contributor = new ArrayList<MetadataContributorType>();
            }
            return this.contributor;
        }

        /**
         * date 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占심니댐옙.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * date 占쌈쇽옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌌니댐옙.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
        }

    }

}
