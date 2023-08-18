//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5_asa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.StateType;


/**
 * <p>anonymous complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.mitre.org/XMLSchema/oval-definitions-5}StateType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="type" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#asa}EntityStateClassMapType" minOccurs="0"/>
 *         &lt;element name="type_inspect" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#asa}EntityStateInspectionType" minOccurs="0"/>
 *         &lt;element name="match_all_any" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#asa}EntityStateMatchType" minOccurs="0"/>
 *         &lt;element name="match" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="used_in_class_map" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="used_in_policy_map" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="policy_map_action" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
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
public class ClassMapState
    extends StateType
{

    protected EntityStateStringType name;
    protected EntityStateClassMapType type;
    @XmlElement(name = "type_inspect")
    protected EntityStateInspectionType typeInspect;
    @XmlElement(name = "match_all_any")
    protected EntityStateMatchType matchAllAny;
    protected EntityStateStringType match;
    @XmlElement(name = "used_in_class_map")
    protected EntityStateStringType usedInClassMap;
    @XmlElement(name = "used_in_policy_map")
    protected EntityStateStringType usedInPolicyMap;
    @XmlElement(name = "policy_map_action")
    protected EntityStateStringType policyMapAction;

    /**
     * name 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getName() {
        return name;
    }

    /**
     * name 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setName(EntityStateStringType value) {
        this.name = value;
    }

    /**
     * type 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateClassMapType }
     *     
     */
    public EntityStateClassMapType getType() {
        return type;
    }

    /**
     * type 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateClassMapType }
     *     
     */
    public void setType(EntityStateClassMapType value) {
        this.type = value;
    }

    /**
     * typeInspect 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateInspectionType }
     *     
     */
    public EntityStateInspectionType getTypeInspect() {
        return typeInspect;
    }

    /**
     * typeInspect 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateInspectionType }
     *     
     */
    public void setTypeInspect(EntityStateInspectionType value) {
        this.typeInspect = value;
    }

    /**
     * matchAllAny 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateMatchType }
     *     
     */
    public EntityStateMatchType getMatchAllAny() {
        return matchAllAny;
    }

    /**
     * matchAllAny 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateMatchType }
     *     
     */
    public void setMatchAllAny(EntityStateMatchType value) {
        this.matchAllAny = value;
    }

    /**
     * match 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getMatch() {
        return match;
    }

    /**
     * match 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setMatch(EntityStateStringType value) {
        this.match = value;
    }

    /**
     * usedInClassMap 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getUsedInClassMap() {
        return usedInClassMap;
    }

    /**
     * usedInClassMap 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setUsedInClassMap(EntityStateStringType value) {
        this.usedInClassMap = value;
    }

    /**
     * usedInPolicyMap 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getUsedInPolicyMap() {
        return usedInPolicyMap;
    }

    /**
     * usedInPolicyMap 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setUsedInPolicyMap(EntityStateStringType value) {
        this.usedInPolicyMap = value;
    }

    /**
     * policyMapAction 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getPolicyMapAction() {
        return policyMapAction;
    }

    /**
     * policyMapAction 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setPolicyMapAction(EntityStateStringType value) {
        this.policyMapAction = value;
    }

}
