//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_solaris;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemRecordType;
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
 *         &lt;element name="current" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="supported" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris}EntityItemV12NEnvType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="parent" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris}EntityItemV12NEnvType" minOccurs="0"/>
 *         &lt;element name="ldom-role" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris}EntityItemLDOMRoleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="properties" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemRecordType" minOccurs="0"/>
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
    "current",
    "supported",
    "parent",
    "ldomRole",
    "properties"
})
public class VirtualizationinfoItem
    extends ItemType
{

    protected EntityItemStringType current;
    protected List<EntityItemV12NEnvType> supported;
    protected EntityItemV12NEnvType parent;
    @XmlElement(name = "ldom-role")
    protected List<EntityItemLDOMRoleType> ldomRole;
    protected EntityItemRecordType properties;

    /**
     * current 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getCurrent() {
        return current;
    }

    /**
     * current 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setCurrent(EntityItemStringType value) {
        this.current = value;
    }

    /**
     * Gets the value of the supported property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supported property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupported().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemV12NEnvType }
     * 
     * 
     */
    public List<EntityItemV12NEnvType> getSupported() {
        if (supported == null) {
            supported = new ArrayList<EntityItemV12NEnvType>();
        }
        return this.supported;
    }

    /**
     * parent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemV12NEnvType }
     *     
     */
    public EntityItemV12NEnvType getParent() {
        return parent;
    }

    /**
     * parent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemV12NEnvType }
     *     
     */
    public void setParent(EntityItemV12NEnvType value) {
        this.parent = value;
    }

    /**
     * Gets the value of the ldomRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ldomRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLdomRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemLDOMRoleType }
     * 
     * 
     */
    public List<EntityItemLDOMRoleType> getLdomRole() {
        if (ldomRole == null) {
            ldomRole = new ArrayList<EntityItemLDOMRoleType>();
        }
        return this.ldomRole;
    }

    /**
     * properties 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemRecordType }
     *     
     */
    public EntityItemRecordType getProperties() {
        return properties;
    }

    /**
     * properties 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemRecordType }
     *     
     */
    public void setProperties(EntityItemRecordType value) {
        this.properties = value;
    }

}
