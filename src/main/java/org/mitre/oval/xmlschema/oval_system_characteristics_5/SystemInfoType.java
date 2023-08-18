//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * Additional system information is also allowed although it is not part of the official OVAL Schema. Individual organizations can place system information that they feel is important and these will be skipped during the validation. All OVAL really cares about is that the required system information items are there.
 * 
 * <p>SystemInfoType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SystemInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="os_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="os_version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="architecture" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="primary_host_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="interfaces" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}InterfacesType"/>
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemInfoType", propOrder = {
    "osName",
    "osVersion",
    "architecture",
    "primaryHostName",
    "interfaces",
    "any"
})
public class SystemInfoType {

    @XmlElement(name = "os_name", required = true)
    protected String osName;
    @XmlElement(name = "os_version", required = true)
    protected String osVersion;
    @XmlElement(required = true)
    protected String architecture;
    @XmlElement(name = "primary_host_name", required = true)
    protected String primaryHostName;
    @XmlElement(required = true)
    protected InterfacesType interfaces;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * osName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOsName() {
        return osName;
    }

    /**
     * osName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOsName(String value) {
        this.osName = value;
    }

    /**
     * osVersion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOsVersion() {
        return osVersion;
    }

    /**
     * osVersion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOsVersion(String value) {
        this.osVersion = value;
    }

    /**
     * architecture 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchitecture() {
        return architecture;
    }

    /**
     * architecture 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchitecture(String value) {
        this.architecture = value;
    }

    /**
     * primaryHostName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryHostName() {
        return primaryHostName;
    }

    /**
     * primaryHostName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryHostName(String value) {
        this.primaryHostName = value;
    }

    /**
     * interfaces 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link InterfacesType }
     *     
     */
    public InterfacesType getInterfaces() {
        return interfaces;
    }

    /**
     * interfaces 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfacesType }
     *     
     */
    public void setInterfaces(InterfacesType value) {
        this.interfaces = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
