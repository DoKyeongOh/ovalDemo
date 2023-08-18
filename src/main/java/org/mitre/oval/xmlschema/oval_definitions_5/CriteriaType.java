//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_common_5.OperatorEnumeration;


/**
 * The optional applicability_check attribute provides a Boolean flag that when true indicates that the criteria is being used to determine whether the OVAL Definition applies to a given system.
 * 
 * <p>CriteriaType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="criteria" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}CriteriaType"/>
 *         &lt;element name="criterion" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}CriterionType"/>
 *         &lt;element name="extend_definition" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}ExtendDefinitionType"/>
 *       &lt;/choice>
 *       &lt;attribute name="applicability_check" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="operator" type="{http://oval.mitre.org/XMLSchema/oval-common-5}OperatorEnumeration" default="AND" />
 *       &lt;attribute name="negate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="comment" type="{http://oval.mitre.org/XMLSchema/oval-common-5}NonEmptyStringType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CriteriaType", propOrder = {
    "criteriaOrCriterionOrExtendDefinition"
})
public class CriteriaType {

    @XmlElements({
        @XmlElement(name = "criteria", type = CriteriaType.class),
        @XmlElement(name = "criterion", type = CriterionType.class),
        @XmlElement(name = "extend_definition", type = ExtendDefinitionType.class)
    })
    protected List<Object> criteriaOrCriterionOrExtendDefinition;
    @XmlAttribute(name = "applicability_check")
    protected Boolean applicabilityCheck;
    @XmlAttribute(name = "operator")
    protected OperatorEnumeration operator;
    @XmlAttribute(name = "negate")
    protected Boolean negate;
    @XmlAttribute(name = "comment")
    protected String comment;

    /**
     * Gets the value of the criteriaOrCriterionOrExtendDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criteriaOrCriterionOrExtendDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriteriaOrCriterionOrExtendDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CriteriaType }
     * {@link CriterionType }
     * {@link ExtendDefinitionType }
     * 
     * 
     */
    public List<Object> getCriteriaOrCriterionOrExtendDefinition() {
        if (criteriaOrCriterionOrExtendDefinition == null) {
            criteriaOrCriterionOrExtendDefinition = new ArrayList<Object>();
        }
        return this.criteriaOrCriterionOrExtendDefinition;
    }

    /**
     * applicabilityCheck 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplicabilityCheck() {
        return applicabilityCheck;
    }

    /**
     * applicabilityCheck 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplicabilityCheck(Boolean value) {
        this.applicabilityCheck = value;
    }

    /**
     * operator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OperatorEnumeration }
     *     
     */
    public OperatorEnumeration getOperator() {
        if (operator == null) {
            return OperatorEnumeration.AND;
        } else {
            return operator;
        }
    }

    /**
     * operator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorEnumeration }
     *     
     */
    public void setOperator(OperatorEnumeration value) {
        this.operator = value;
    }

    /**
     * negate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNegate() {
        if (negate == null) {
            return false;
        } else {
            return negate;
        }
    }

    /**
     * negate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegate(Boolean value) {
        this.negate = value;
    }

    /**
     * comment 속성의 값을 가져옵니다.
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
     * comment 속성의 값을 설정합니다.
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
