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


/**
 * Note that the datatype associated with the components should be 'string' or 'int' depending on which date time format is specified.  The result of this function though is always an integer.
 * 
 * <p>TimeDifferenceFunctionType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="TimeDifferenceFunctionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="2">
 *         &lt;group ref="{http://oval.mitre.org/XMLSchema/oval-definitions-5}ComponentGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="format_1" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}DateTimeFormatEnumeration" default="year_month_day" />
 *       &lt;attribute name="format_2" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}DateTimeFormatEnumeration" default="year_month_day" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeDifferenceFunctionType", propOrder = {
    "objectComponentOrVariableComponentOrLiteralComponent"
})
public class TimeDifferenceFunctionType {

    @XmlElements({
        @XmlElement(name = "object_component", type = ObjectComponentType.class),
        @XmlElement(name = "variable_component", type = VariableComponentType.class),
        @XmlElement(name = "literal_component", type = LiteralComponentType.class),
        @XmlElement(name = "arithmetic", type = ArithmeticFunctionType.class),
        @XmlElement(name = "begin", type = BeginFunctionType.class),
        @XmlElement(name = "concat", type = ConcatFunctionType.class),
        @XmlElement(name = "end", type = EndFunctionType.class),
        @XmlElement(name = "escape_regex", type = EscapeRegexFunctionType.class),
        @XmlElement(name = "split", type = SplitFunctionType.class),
        @XmlElement(name = "substring", type = SubstringFunctionType.class),
        @XmlElement(name = "time_difference", type = TimeDifferenceFunctionType.class),
        @XmlElement(name = "regex_capture", type = RegexCaptureFunctionType.class),
        @XmlElement(name = "unique", type = UniqueFunctionType.class),
        @XmlElement(name = "count", type = CountFunctionType.class),
        @XmlElement(name = "glob_to_regex", type = GlobToRegexFunctionType.class)
    })
    protected List<Object> objectComponentOrVariableComponentOrLiteralComponent;
    @XmlAttribute(name = "format_1")
    protected DateTimeFormatEnumeration format1;
    @XmlAttribute(name = "format_2")
    protected DateTimeFormatEnumeration format2;

    /**
     * Gets the value of the objectComponentOrVariableComponentOrLiteralComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectComponentOrVariableComponentOrLiteralComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectComponentOrVariableComponentOrLiteralComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectComponentType }
     * {@link VariableComponentType }
     * {@link LiteralComponentType }
     * {@link ArithmeticFunctionType }
     * {@link BeginFunctionType }
     * {@link ConcatFunctionType }
     * {@link EndFunctionType }
     * {@link EscapeRegexFunctionType }
     * {@link SplitFunctionType }
     * {@link SubstringFunctionType }
     * {@link TimeDifferenceFunctionType }
     * {@link RegexCaptureFunctionType }
     * {@link UniqueFunctionType }
     * {@link CountFunctionType }
     * {@link GlobToRegexFunctionType }
     * 
     * 
     */
    public List<Object> getObjectComponentOrVariableComponentOrLiteralComponent() {
        if (objectComponentOrVariableComponentOrLiteralComponent == null) {
            objectComponentOrVariableComponentOrLiteralComponent = new ArrayList<Object>();
        }
        return this.objectComponentOrVariableComponentOrLiteralComponent;
    }

    /**
     * format1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeFormatEnumeration }
     *     
     */
    public DateTimeFormatEnumeration getFormat1() {
        if (format1 == null) {
            return DateTimeFormatEnumeration.YEAR_MONTH_DAY;
        } else {
            return format1;
        }
    }

    /**
     * format1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeFormatEnumeration }
     *     
     */
    public void setFormat1(DateTimeFormatEnumeration value) {
        this.format1 = value;
    }

    /**
     * format2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeFormatEnumeration }
     *     
     */
    public DateTimeFormatEnumeration getFormat2() {
        if (format2 == null) {
            return DateTimeFormatEnumeration.YEAR_MONTH_DAY;
        } else {
            return format2;
        }
    }

    /**
     * format2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeFormatEnumeration }
     *     
     */
    public void setFormat2(DateTimeFormatEnumeration value) {
        this.format2 = value;
    }

}
