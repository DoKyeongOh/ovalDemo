//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MetadataStatusEnumeration에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="MetadataStatusEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACCEPTED"/>
 *     &lt;enumeration value="DEPRECATED"/>
 *     &lt;enumeration value="DRAFT"/>
 *     &lt;enumeration value="INCOMPLETE"/>
 *     &lt;enumeration value="INITIAL SUBMISSION"/>
 *     &lt;enumeration value="INTERIM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MetadataStatusEnumeration")
@XmlEnum
public enum MetadataStatusEnumeration {

    ACCEPTED("ACCEPTED"),
    DEPRECATED("DEPRECATED"),
    DRAFT("DRAFT"),
    INCOMPLETE("INCOMPLETE"),
    @XmlEnumValue("INITIAL SUBMISSION")
    INITIAL_SUBMISSION("INITIAL SUBMISSION"),
    INTERIM("INTERIM");
    private final String value;

    MetadataStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MetadataStatusEnumeration fromValue(String v) {
        for (MetadataStatusEnumeration c: MetadataStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
