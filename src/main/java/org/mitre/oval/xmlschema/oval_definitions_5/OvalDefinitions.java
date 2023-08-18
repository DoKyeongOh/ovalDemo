//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_common_5.GeneratorType;
import org.w3._2000._09.xmldsig_.SignatureType;


/**
 * <p>anonymous complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="generator" type="{http://oval.mitre.org/XMLSchema/oval-common-5}GeneratorType"/>
 *         &lt;element name="definitions" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}DefinitionsType" minOccurs="0"/>
 *         &lt;element name="tests" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}TestsType" minOccurs="0"/>
 *         &lt;element name="objects" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}ObjectsType" minOccurs="0"/>
 *         &lt;element name="states" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}StatesType" minOccurs="0"/>
 *         &lt;element name="variables" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}VariablesType" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "generator",
    "definitions",
    "tests",
    "objects",
    "states",
    "variables",
    "signature"
})
@XmlRootElement(name = "oval_definitions")
public class OvalDefinitions {

    @XmlElement(required = true)
    protected GeneratorType generator;
    protected DefinitionsType definitions;
    protected TestsType tests;
    protected ObjectsType objects;
    protected StatesType states;
    protected VariablesType variables;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected SignatureType signature;

    /**
     * generator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link GeneratorType }
     *     
     */
    public GeneratorType getGenerator() {
        return generator;
    }

    /**
     * generator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneratorType }
     *     
     */
    public void setGenerator(GeneratorType value) {
        this.generator = value;
    }

    /**
     * definitions 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DefinitionsType }
     *     
     */
    public DefinitionsType getDefinitions() {
        return definitions;
    }

    /**
     * definitions 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DefinitionsType }
     *     
     */
    public void setDefinitions(DefinitionsType value) {
        this.definitions = value;
    }

    /**
     * tests 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TestsType }
     *     
     */
    public TestsType getTests() {
        return tests;
    }

    /**
     * tests 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TestsType }
     *     
     */
    public void setTests(TestsType value) {
        this.tests = value;
    }

    /**
     * objects 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ObjectsType }
     *     
     */
    public ObjectsType getObjects() {
        return objects;
    }

    /**
     * objects 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectsType }
     *     
     */
    public void setObjects(ObjectsType value) {
        this.objects = value;
    }

    /**
     * states 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link StatesType }
     *     
     */
    public StatesType getStates() {
        return states;
    }

    /**
     * states 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link StatesType }
     *     
     */
    public void setStates(StatesType value) {
        this.states = value;
    }

    /**
     * variables 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link VariablesType }
     *     
     */
    public VariablesType getVariables() {
        return variables;
    }

    /**
     * variables 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link VariablesType }
     *     
     */
    public void setVariables(VariablesType value) {
        this.variables = value;
    }

    /**
     * The optional Signature element allows an XML Signature as defined by the W3C to be attached to the document. This allows authentication and data integrity to be provided to the user. Enveloped signatures are supported. More information about the official W3C Recommendation regarding XML digital signatures can be found at http://www.w3.org/TR/xmldsig-core/.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * signature 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

}
