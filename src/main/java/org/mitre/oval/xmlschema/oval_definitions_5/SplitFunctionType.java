//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The split function takes a single string component and turns it into a collection of values based on a delimiter string. For example, assume that a basic component element returns the value "a-b-c-d" to the split function with the delimiter set to "-". The local_variable element would be evaluated to have four values "a", "b", "c", and "d". If the basic component returns a value that begins, or ends, with a delimiter, the local_variable element would contain empty string values at the beginning, or end, of the collection of values returned for that string component. For example, if the delimiter is "-", and the basic component element returns the value "-a-a-", the local_variable element would evaluate to a collection of four values "", "a", "a", and "". Likewise, if the basic component element returns a value that contains adjacent delimiters such as "---", the local_variable element would evaluate to a collection of four values "", "", "", and "".
 *                 Lastly, if the basic component element used by the split function returnsa collection of values, then the split function is performed multiple times, and all of the results, from each of the split functions, are returned.
 * 
 * <p>SplitFunctionType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SplitFunctionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://oval.mitre.org/XMLSchema/oval-definitions-5}ComponentGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="delimiter" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SplitFunctionType", propOrder = {
    "objectComponent",
    "variableComponent",
    "literalComponent",
    "arithmetic",
    "begin",
    "concat",
    "end",
    "escapeRegex",
    "split",
    "substring",
    "timeDifference",
    "regexCapture",
    "unique",
    "count",
    "globToRegex"
})
public class SplitFunctionType {

    @XmlElement(name = "object_component")
    protected ObjectComponentType objectComponent;
    @XmlElement(name = "variable_component")
    protected VariableComponentType variableComponent;
    @XmlElement(name = "literal_component")
    protected LiteralComponentType literalComponent;
    protected ArithmeticFunctionType arithmetic;
    protected BeginFunctionType begin;
    protected ConcatFunctionType concat;
    protected EndFunctionType end;
    @XmlElement(name = "escape_regex")
    protected EscapeRegexFunctionType escapeRegex;
    protected SplitFunctionType split;
    protected SubstringFunctionType substring;
    @XmlElement(name = "time_difference")
    protected TimeDifferenceFunctionType timeDifference;
    @XmlElement(name = "regex_capture")
    protected RegexCaptureFunctionType regexCapture;
    protected UniqueFunctionType unique;
    protected CountFunctionType count;
    @XmlElement(name = "glob_to_regex")
    protected GlobToRegexFunctionType globToRegex;
    @XmlAttribute(name = "delimiter", required = true)
    protected String delimiter;

    /**
     * objectComponent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ObjectComponentType }
     *     
     */
    public ObjectComponentType getObjectComponent() {
        return objectComponent;
    }

    /**
     * objectComponent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectComponentType }
     *     
     */
    public void setObjectComponent(ObjectComponentType value) {
        this.objectComponent = value;
    }

    /**
     * variableComponent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link VariableComponentType }
     *     
     */
    public VariableComponentType getVariableComponent() {
        return variableComponent;
    }

    /**
     * variableComponent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableComponentType }
     *     
     */
    public void setVariableComponent(VariableComponentType value) {
        this.variableComponent = value;
    }

    /**
     * literalComponent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link LiteralComponentType }
     *     
     */
    public LiteralComponentType getLiteralComponent() {
        return literalComponent;
    }

    /**
     * literalComponent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link LiteralComponentType }
     *     
     */
    public void setLiteralComponent(LiteralComponentType value) {
        this.literalComponent = value;
    }

    /**
     * arithmetic 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ArithmeticFunctionType }
     *     
     */
    public ArithmeticFunctionType getArithmetic() {
        return arithmetic;
    }

    /**
     * arithmetic 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ArithmeticFunctionType }
     *     
     */
    public void setArithmetic(ArithmeticFunctionType value) {
        this.arithmetic = value;
    }

    /**
     * begin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BeginFunctionType }
     *     
     */
    public BeginFunctionType getBegin() {
        return begin;
    }

    /**
     * begin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BeginFunctionType }
     *     
     */
    public void setBegin(BeginFunctionType value) {
        this.begin = value;
    }

    /**
     * concat 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ConcatFunctionType }
     *     
     */
    public ConcatFunctionType getConcat() {
        return concat;
    }

    /**
     * concat 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ConcatFunctionType }
     *     
     */
    public void setConcat(ConcatFunctionType value) {
        this.concat = value;
    }

    /**
     * end 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EndFunctionType }
     *     
     */
    public EndFunctionType getEnd() {
        return end;
    }

    /**
     * end 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EndFunctionType }
     *     
     */
    public void setEnd(EndFunctionType value) {
        this.end = value;
    }

    /**
     * escapeRegex 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EscapeRegexFunctionType }
     *     
     */
    public EscapeRegexFunctionType getEscapeRegex() {
        return escapeRegex;
    }

    /**
     * escapeRegex 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EscapeRegexFunctionType }
     *     
     */
    public void setEscapeRegex(EscapeRegexFunctionType value) {
        this.escapeRegex = value;
    }

    /**
     * split 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SplitFunctionType }
     *     
     */
    public SplitFunctionType getSplit() {
        return split;
    }

    /**
     * split 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitFunctionType }
     *     
     */
    public void setSplit(SplitFunctionType value) {
        this.split = value;
    }

    /**
     * substring 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SubstringFunctionType }
     *     
     */
    public SubstringFunctionType getSubstring() {
        return substring;
    }

    /**
     * substring 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstringFunctionType }
     *     
     */
    public void setSubstring(SubstringFunctionType value) {
        this.substring = value;
    }

    /**
     * timeDifference 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TimeDifferenceFunctionType }
     *     
     */
    public TimeDifferenceFunctionType getTimeDifference() {
        return timeDifference;
    }

    /**
     * timeDifference 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDifferenceFunctionType }
     *     
     */
    public void setTimeDifference(TimeDifferenceFunctionType value) {
        this.timeDifference = value;
    }

    /**
     * regexCapture 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link RegexCaptureFunctionType }
     *     
     */
    public RegexCaptureFunctionType getRegexCapture() {
        return regexCapture;
    }

    /**
     * regexCapture 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link RegexCaptureFunctionType }
     *     
     */
    public void setRegexCapture(RegexCaptureFunctionType value) {
        this.regexCapture = value;
    }

    /**
     * unique 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link UniqueFunctionType }
     *     
     */
    public UniqueFunctionType getUnique() {
        return unique;
    }

    /**
     * unique 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueFunctionType }
     *     
     */
    public void setUnique(UniqueFunctionType value) {
        this.unique = value;
    }

    /**
     * count 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CountFunctionType }
     *     
     */
    public CountFunctionType getCount() {
        return count;
    }

    /**
     * count 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CountFunctionType }
     *     
     */
    public void setCount(CountFunctionType value) {
        this.count = value;
    }

    /**
     * globToRegex 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link GlobToRegexFunctionType }
     *     
     */
    public GlobToRegexFunctionType getGlobToRegex() {
        return globToRegex;
    }

    /**
     * globToRegex 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobToRegexFunctionType }
     *     
     */
    public void setGlobToRegex(GlobToRegexFunctionType value) {
        this.globToRegex = value;
    }

    /**
     * delimiter 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * delimiter 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelimiter(String value) {
        this.delimiter = value;
    }

}
