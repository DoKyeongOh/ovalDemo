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
 * <p>ExistenceEnumeration에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="ExistenceEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="all_exist"/>
 *     &lt;enumeration value="any_exist"/>
 *     &lt;enumeration value="at_least_one_exists"/>
 *     &lt;enumeration value="none_exist"/>
 *     &lt;enumeration value="only_one_exists"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExistenceEnumeration")
@XmlEnum
public enum ExistenceEnumeration {


    /**
     * When used in the context of an OVAL state entity's check_existence attribute, a value of 'all_exist' means that every item entity for an object defined by the description exists on the system. When used in the context of an OVAL test's check_existence attribute, this value is equivalent to 'at_least_one_exists' because non-existent items have no impact upon evaluation.
     * 
     */
    @XmlEnumValue("all_exist")
    ALL_EXIST("all_exist"),

    /**
     * A value of 'any_exist' means that zero or more objects defined by the description exist on the system.
     * 
     */
    @XmlEnumValue("any_exist")
    ANY_EXIST("any_exist"),

    /**
     * A value of 'at_least_one_exists' means that at least one object defined by the description exists on the system.
     * 
     */
    @XmlEnumValue("at_least_one_exists")
    AT_LEAST_ONE_EXISTS("at_least_one_exists"),

    /**
     * A value of 'none_exist' means that none of the objects defined by the description exist on the system.
     * 
     */
    @XmlEnumValue("none_exist")
    NONE_EXIST("none_exist"),

    /**
     * A value of 'only_one_exists' means that only one object defined by the description exists on the system.
     * 
     */
    @XmlEnumValue("only_one_exists")
    ONLY_ONE_EXISTS("only_one_exists");
    private final String value;

    ExistenceEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExistenceEnumeration fromValue(String v) {
        for (ExistenceEnumeration c: ExistenceEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
