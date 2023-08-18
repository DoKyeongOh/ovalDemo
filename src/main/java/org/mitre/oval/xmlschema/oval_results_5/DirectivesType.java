//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_results_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The DirectivesType complex type presents a set of flags that describe what information has been included in the results document. There are six possible results (true, false, unknown, error, not evaluated, and not applicable) for the evaluation of an OVAL Definition. The directives state which of these results are being reported in the results document.
 * 
 * <p>DirectivesType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="DirectivesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="definition_true" type="{http://oval.mitre.org/XMLSchema/oval-results-5}DirectiveType"/>
 *         &lt;element name="definition_false" type="{http://oval.mitre.org/XMLSchema/oval-results-5}DirectiveType"/>
 *         &lt;element name="definition_unknown" type="{http://oval.mitre.org/XMLSchema/oval-results-5}DirectiveType"/>
 *         &lt;element name="definition_error" type="{http://oval.mitre.org/XMLSchema/oval-results-5}DirectiveType"/>
 *         &lt;element name="definition_not_evaluated" type="{http://oval.mitre.org/XMLSchema/oval-results-5}DirectiveType"/>
 *         &lt;element name="definition_not_applicable" type="{http://oval.mitre.org/XMLSchema/oval-results-5}DirectiveType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectivesType", propOrder = {
    "definitionTrue",
    "definitionFalse",
    "definitionUnknown",
    "definitionError",
    "definitionNotEvaluated",
    "definitionNotApplicable"
})
@XmlSeeAlso({
    DefaultDirectivesType.class,
    ClassDirectivesType.class
})
public class DirectivesType {

    @XmlElement(name = "definition_true", required = true)
    protected DirectiveType definitionTrue;
    @XmlElement(name = "definition_false", required = true)
    protected DirectiveType definitionFalse;
    @XmlElement(name = "definition_unknown", required = true)
    protected DirectiveType definitionUnknown;
    @XmlElement(name = "definition_error", required = true)
    protected DirectiveType definitionError;
    @XmlElement(name = "definition_not_evaluated", required = true)
    protected DirectiveType definitionNotEvaluated;
    @XmlElement(name = "definition_not_applicable", required = true)
    protected DirectiveType definitionNotApplicable;

    /**
     * definitionTrue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DirectiveType }
     *     
     */
    public DirectiveType getDefinitionTrue() {
        return definitionTrue;
    }

    /**
     * definitionTrue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectiveType }
     *     
     */
    public void setDefinitionTrue(DirectiveType value) {
        this.definitionTrue = value;
    }

    /**
     * definitionFalse 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DirectiveType }
     *     
     */
    public DirectiveType getDefinitionFalse() {
        return definitionFalse;
    }

    /**
     * definitionFalse 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectiveType }
     *     
     */
    public void setDefinitionFalse(DirectiveType value) {
        this.definitionFalse = value;
    }

    /**
     * definitionUnknown 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DirectiveType }
     *     
     */
    public DirectiveType getDefinitionUnknown() {
        return definitionUnknown;
    }

    /**
     * definitionUnknown 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectiveType }
     *     
     */
    public void setDefinitionUnknown(DirectiveType value) {
        this.definitionUnknown = value;
    }

    /**
     * definitionError 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DirectiveType }
     *     
     */
    public DirectiveType getDefinitionError() {
        return definitionError;
    }

    /**
     * definitionError 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectiveType }
     *     
     */
    public void setDefinitionError(DirectiveType value) {
        this.definitionError = value;
    }

    /**
     * definitionNotEvaluated 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DirectiveType }
     *     
     */
    public DirectiveType getDefinitionNotEvaluated() {
        return definitionNotEvaluated;
    }

    /**
     * definitionNotEvaluated 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectiveType }
     *     
     */
    public void setDefinitionNotEvaluated(DirectiveType value) {
        this.definitionNotEvaluated = value;
    }

    /**
     * definitionNotApplicable 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DirectiveType }
     *     
     */
    public DirectiveType getDefinitionNotApplicable() {
        return definitionNotApplicable;
    }

    /**
     * definitionNotApplicable 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectiveType }
     *     
     */
    public void setDefinitionNotApplicable(DirectiveType value) {
        this.definitionNotApplicable = value;
    }

}
