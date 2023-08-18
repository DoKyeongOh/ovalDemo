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
 * <p>CheckEnumeration에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="CheckEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="all"/>
 *     &lt;enumeration value="at least one"/>
 *     &lt;enumeration value="none exist"/>
 *     &lt;enumeration value="none satisfy"/>
 *     &lt;enumeration value="only one"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CheckEnumeration")
@XmlEnum
public enum CheckEnumeration {


    /**
     * A value of 'all' means that a final result of true is given if all the individual results under consideration are true.
     * 
     */
    @XmlEnumValue("all")
    ALL("all"),

    /**
     * A value of 'at least one' means that a final result of true is given if at least one of the individual results under consideration is true.
     * 
     */
    @XmlEnumValue("at least one")
    AT_LEAST_ONE("at least one"),

    /**
     * A value of 'none exists' means that a test evaluates to true if no matching object exists that satisfy the data requirements.
     * 
     */
    @XmlEnumValue("none exist")
    NONE_EXIST("none exist"),

    /**
     * A value of 'none satisfy' means that a final result of true is given if none the individual results under consideration are true.
     * 
     */
    @XmlEnumValue("none satisfy")
    NONE_SATISFY("none satisfy"),

    /**
     * A value of 'only one' means that a final result of true is given if one and only one of the individual results under consideration are true.
     * 
     */
    @XmlEnumValue("only one")
    ONLY_ONE("only one");
    private final String value;

    CheckEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CheckEnumeration fromValue(String v) {
        for (CheckEnumeration c: CheckEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
