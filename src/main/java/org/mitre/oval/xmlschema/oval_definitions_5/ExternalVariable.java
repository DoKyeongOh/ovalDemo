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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.mitre.org/XMLSchema/oval-definitions-5}VariableType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="possible_value" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}PossibleValueType"/>
 *         &lt;element name="possible_restriction" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}PossibleRestrictionType"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "possibleValueOrPossibleRestriction"
})
public class ExternalVariable
    extends VariableType
{

    @XmlElements({
        @XmlElement(name = "possible_value", type = PossibleValueType.class),
        @XmlElement(name = "possible_restriction", type = PossibleRestrictionType.class)
    })
    protected List<Object> possibleValueOrPossibleRestriction;

    /**
     * Gets the value of the possibleValueOrPossibleRestriction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the possibleValueOrPossibleRestriction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPossibleValueOrPossibleRestriction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PossibleValueType }
     * {@link PossibleRestrictionType }
     * 
     * 
     */
    public List<Object> getPossibleValueOrPossibleRestriction() {
        if (possibleValueOrPossibleRestriction == null) {
            possibleValueOrPossibleRestriction = new ArrayList<Object>();
        }
        return this.possibleValueOrPossibleRestriction;
    }

}
