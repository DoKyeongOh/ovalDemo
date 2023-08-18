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
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.OvalSystemCharacteristics;


/**
 * The SystemType complex type holds the evaluation results of the definitions and tests, as well as a copy of the OVAL System Characteristics used to perform the evaluation. The definitions section holds the results of the definitions and the tests section holds the results of the tests. The oval_system_characteristics section is a copy of the System Characteristics document used to perform the evaluation of the OVAL Definitions.
 * 
 * <p>SystemType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SystemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="definitions" type="{http://oval.mitre.org/XMLSchema/oval-results-5}DefinitionsType" minOccurs="0"/>
 *         &lt;element name="tests" type="{http://oval.mitre.org/XMLSchema/oval-results-5}TestsType" minOccurs="0"/>
 *         &lt;element ref="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}oval_system_characteristics"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemType", propOrder = {
    "definitions",
    "tests",
    "ovalSystemCharacteristics"
})
public class SystemType {

    protected DefinitionsType definitions;
    protected TestsType tests;
    @XmlElement(name = "oval_system_characteristics", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", required = true)
    protected OvalSystemCharacteristics ovalSystemCharacteristics;

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
     * ovalSystemCharacteristics 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OvalSystemCharacteristics }
     *     
     */
    public OvalSystemCharacteristics getOvalSystemCharacteristics() {
        return ovalSystemCharacteristics;
    }

    /**
     * ovalSystemCharacteristics 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OvalSystemCharacteristics }
     *     
     */
    public void setOvalSystemCharacteristics(OvalSystemCharacteristics value) {
        this.ovalSystemCharacteristics = value;
    }

}
