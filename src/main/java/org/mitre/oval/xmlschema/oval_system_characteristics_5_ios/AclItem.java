//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_ios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="ip_version" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios}EntityItemAccessListIPVersionType" minOccurs="0"/>
 *         &lt;element name="use" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios}EntityItemAccessListUseType" minOccurs="0"/>
 *         &lt;element name="used_in" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="interface_direction" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios}EntityItemAccessListInterfaceDirectionType" minOccurs="0"/>
 *         &lt;element name="acl_config_lines" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="config_line" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" maxOccurs="unbounded" minOccurs="0"/>
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
    "ipVersion",
    "use",
    "usedIn",
    "interfaceDirection",
    "aclConfigLines",
    "configLine"
})
public class AclItem
    extends ItemType
{

    protected EntityItemStringType name;
    @XmlElement(name = "ip_version")
    protected EntityItemAccessListIPVersionType ipVersion;
    protected EntityItemAccessListUseType use;
    @XmlElement(name = "used_in")
    protected EntityItemStringType usedIn;
    @XmlElement(name = "interface_direction")
    protected EntityItemAccessListInterfaceDirectionType interfaceDirection;
    @XmlElement(name = "acl_config_lines")
    protected EntityItemStringType aclConfigLines;
    @XmlElement(name = "config_line")
    protected List<EntityItemStringType> configLine;

    /**
     * name 속성의 값을 가져옵니다.
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
     * name 속성의 값을 설정합니다.
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
     * ipVersion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAccessListIPVersionType }
     *     
     */
    public EntityItemAccessListIPVersionType getIpVersion() {
        return ipVersion;
    }

    /**
     * ipVersion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAccessListIPVersionType }
     *     
     */
    public void setIpVersion(EntityItemAccessListIPVersionType value) {
        this.ipVersion = value;
    }

    /**
     * use 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAccessListUseType }
     *     
     */
    public EntityItemAccessListUseType getUse() {
        return use;
    }

    /**
     * use 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAccessListUseType }
     *     
     */
    public void setUse(EntityItemAccessListUseType value) {
        this.use = value;
    }

    /**
     * usedIn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getUsedIn() {
        return usedIn;
    }

    /**
     * usedIn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setUsedIn(EntityItemStringType value) {
        this.usedIn = value;
    }

    /**
     * interfaceDirection 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAccessListInterfaceDirectionType }
     *     
     */
    public EntityItemAccessListInterfaceDirectionType getInterfaceDirection() {
        return interfaceDirection;
    }

    /**
     * interfaceDirection 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAccessListInterfaceDirectionType }
     *     
     */
    public void setInterfaceDirection(EntityItemAccessListInterfaceDirectionType value) {
        this.interfaceDirection = value;
    }

    /**
     * aclConfigLines 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getAclConfigLines() {
        return aclConfigLines;
    }

    /**
     * aclConfigLines 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setAclConfigLines(EntityItemStringType value) {
        this.aclConfigLines = value;
    }

    /**
     * Gets the value of the configLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfigLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemStringType }
     * 
     * 
     */
    public List<EntityItemStringType> getConfigLine() {
        if (configLine == null) {
            configLine = new ArrayList<EntityItemStringType>();
        }
        return this.configLine;
    }

}
