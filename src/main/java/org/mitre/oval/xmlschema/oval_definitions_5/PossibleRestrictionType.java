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
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_common_5.OperatorEnumeration;


/**
 * The PossibleRestrictionType complex type outlines a range of possible expected value of an external variable. Each possible_restriction element contains an unbounded list of child restriction elements that each specify a range that an actual value may fall in. For example, a restriction element may specify that a value must be less than 10. When multiple restriction elements are present, a valid possible value's evaluation is based on the operator attribute. The operator attribute is set to AND by default. Other valid operation values are explained in the description of the OperatorEnumeration simple type. One can think of the possible_value and possible_restriction elements as an OR'd list of possible values, with the restriction elements as using the selected operation to evaluate its own list of value descriptions. Please refer to the description of the RestrictionType complex type for more information. The required hint attribute gives a short description of what the value means or represents.
 * 
 * <p>PossibleRestrictionType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PossibleRestrictionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="restriction" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}RestrictionType" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *       &lt;attribute name="operator" type="{http://oval.mitre.org/XMLSchema/oval-common-5}OperatorEnumeration" default="AND" />
 *       &lt;attribute name="hint" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PossibleRestrictionType", propOrder = {
    "restriction"
})
public class PossibleRestrictionType {

    protected List<RestrictionType> restriction;
    @XmlAttribute(name = "operator")
    protected OperatorEnumeration operator;
    @XmlAttribute(name = "hint", required = true)
    protected String hint;

    /**
     * Gets the value of the restriction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restriction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestriction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RestrictionType }
     * 
     * 
     */
    public List<RestrictionType> getRestriction() {
        if (restriction == null) {
            restriction = new ArrayList<RestrictionType>();
        }
        return this.restriction;
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
     * hint 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHint() {
        return hint;
    }

    /**
     * hint 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHint(String value) {
        this.hint = value;
    }

}
