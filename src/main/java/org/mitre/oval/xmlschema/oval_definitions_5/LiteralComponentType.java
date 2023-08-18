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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.mitre.oval.xmlschema.oval_common_5.SimpleDatatypeEnumeration;


/**
 * The LiteralComponentType complex type defines a literal value to be used as a component.  The optional datatype attribute defines the type of data expected.  The default datatype is 'string'.
 * 
 * <p>LiteralComponentType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="LiteralComponentType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anySimpleType">
 *       &lt;attribute name="datatype" type="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration" default="string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiteralComponentType", propOrder = {
    "value"
})
public class LiteralComponentType {

    @XmlValue
    @XmlSchemaType(name = "anySimpleType")
    protected Object value;
    @XmlAttribute(name = "datatype")
    protected SimpleDatatypeEnumeration datatype;

    /**
     * value 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getValue() {
        return value;
    }

    /**
     * value 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setValue(Object value) {
        this.value = value;
    }

    /**
     * datatype 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SimpleDatatypeEnumeration }
     *     
     */
    public SimpleDatatypeEnumeration getDatatype() {
        if (datatype == null) {
            return SimpleDatatypeEnumeration.STRING;
        } else {
            return datatype;
        }
    }

    /**
     * datatype 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleDatatypeEnumeration }
     *     
     */
    public void setDatatype(SimpleDatatypeEnumeration value) {
        this.datatype = value;
    }

}
