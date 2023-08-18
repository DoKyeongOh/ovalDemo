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
 * <p>ClassEnumeration에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="ClassEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="compliance"/>
 *     &lt;enumeration value="inventory"/>
 *     &lt;enumeration value="miscellaneous"/>
 *     &lt;enumeration value="patch"/>
 *     &lt;enumeration value="vulnerability"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClassEnumeration")
@XmlEnum
public enum ClassEnumeration {


    /**
     * A compliance definition describes the state of a machine as it complies with a specific policy. A definition of this class will evaluate to true when the system is found to be compliant with the stated policy. Another way of thinking about this is that a compliance definition is stating "the system is compliant if ...".
     * 
     */
    @XmlEnumValue("compliance")
    COMPLIANCE("compliance"),

    /**
     * An inventory definition describes whether a specific piece of software is installed on the system. A definition of this class will evaluate to true when the specified software is found on the system. Another way of thinking about this is that an inventory definition is stating "the software is installed if ...".
     * 
     */
    @XmlEnumValue("inventory")
    INVENTORY("inventory"),

    /**
     * The 'miscellaneous' class is used to identify definitions that do not fall into any of the other defined classes.
     * 
     */
    @XmlEnumValue("miscellaneous")
    MISCELLANEOUS("miscellaneous"),

    /**
     * A patch definition details the machine state of whether a patch executable should be installed. A definition of this class will evaluate to true when the specified patch is missing from the system. Another way of thinking about this is that a patch definition is stating "the patch should be installed if ...". Note that word SHOULD is intended to mean more than just CAN the patch executable be installed. In other words, if a more recent patch is already installed then the specified patch might not need to be installed.
     * 
     */
    @XmlEnumValue("patch")
    PATCH("patch"),

    /**
     * A vulnerability definition describes the conditions under which a machine is vulnerable. A definition of this class will evaluate to true when the system is found to be vulnerable with the stated issue. Another way of thinking about this is that a vulnerability definition is stating "the system is vulnerable if ...".
     * 
     */
    @XmlEnumValue("vulnerability")
    VULNERABILITY("vulnerability");
    private final String value;

    ClassEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClassEnumeration fromValue(String v) {
        for (ClassEnumeration c: ClassEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
