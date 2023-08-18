//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_common_5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ComplexDatatypeEnumeration에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="ComplexDatatypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="record"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ComplexDatatypeEnumeration")
@XmlEnum
public enum ComplexDatatypeEnumeration {


    /**
     * The record datatype describes an entity with structured set of named fields and values as its content. The only allowed operation within OVAL for record values is 'equals'. Note that the record datatype is not currently allowed when using variables.
     * 
     */
    @XmlEnumValue("record")
    RECORD("record");
    private final String value;

    ComplexDatatypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComplexDatatypeEnumeration fromValue(String v) {
        for (ComplexDatatypeEnumeration c: ComplexDatatypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
