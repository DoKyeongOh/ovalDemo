//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_asa;

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
 *         &lt;element name="type" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa}EntityItemClassMapType" minOccurs="0"/>
 *         &lt;element name="type_inspect" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa}EntityItemInspectionType" minOccurs="0"/>
 *         &lt;element name="match_all_any" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa}EntityItemMatchType" minOccurs="0"/>
 *         &lt;element name="match" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="used_in_class_map" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="used_in_policy_map" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="policy_map_action" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" maxOccurs="unbounded" minOccurs="0"/>
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
    "type",
    "typeInspect",
    "matchAllAny",
    "match",
    "usedInClassMap",
    "usedInPolicyMap",
    "policyMapAction"
})
public class ClassMapItem
    extends ItemType
{

    protected EntityItemStringType name;
    protected EntityItemClassMapType type;
    @XmlElement(name = "type_inspect")
    protected EntityItemInspectionType typeInspect;
    @XmlElement(name = "match_all_any")
    protected EntityItemMatchType matchAllAny;
    protected List<EntityItemStringType> match;
    @XmlElement(name = "used_in_class_map")
    protected List<EntityItemStringType> usedInClassMap;
    @XmlElement(name = "used_in_policy_map")
    protected EntityItemStringType usedInPolicyMap;
    @XmlElement(name = "policy_map_action")
    protected List<EntityItemStringType> policyMapAction;

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
     * type 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemClassMapType }
     *     
     */
    public EntityItemClassMapType getType() {
        return type;
    }

    /**
     * type 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemClassMapType }
     *     
     */
    public void setType(EntityItemClassMapType value) {
        this.type = value;
    }

    /**
     * typeInspect 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemInspectionType }
     *     
     */
    public EntityItemInspectionType getTypeInspect() {
        return typeInspect;
    }

    /**
     * typeInspect 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemInspectionType }
     *     
     */
    public void setTypeInspect(EntityItemInspectionType value) {
        this.typeInspect = value;
    }

    /**
     * matchAllAny 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemMatchType }
     *     
     */
    public EntityItemMatchType getMatchAllAny() {
        return matchAllAny;
    }

    /**
     * matchAllAny 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemMatchType }
     *     
     */
    public void setMatchAllAny(EntityItemMatchType value) {
        this.matchAllAny = value;
    }

    /**
     * Gets the value of the match property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the match property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemStringType }
     * 
     * 
     */
    public List<EntityItemStringType> getMatch() {
        if (match == null) {
            match = new ArrayList<EntityItemStringType>();
        }
        return this.match;
    }

    /**
     * Gets the value of the usedInClassMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usedInClassMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsedInClassMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemStringType }
     * 
     * 
     */
    public List<EntityItemStringType> getUsedInClassMap() {
        if (usedInClassMap == null) {
            usedInClassMap = new ArrayList<EntityItemStringType>();
        }
        return this.usedInClassMap;
    }

    /**
     * usedInPolicyMap 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getUsedInPolicyMap() {
        return usedInPolicyMap;
    }

    /**
     * usedInPolicyMap 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setUsedInPolicyMap(EntityItemStringType value) {
        this.usedInPolicyMap = value;
    }

    /**
     * Gets the value of the policyMapAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policyMapAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicyMapAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemStringType }
     * 
     * 
     */
    public List<EntityItemStringType> getPolicyMapAction() {
        if (policyMapAction == null) {
            policyMapAction = new ArrayList<EntityItemStringType>();
        }
        return this.policyMapAction;
    }

}
