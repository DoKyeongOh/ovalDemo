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
 * <p>MessageLevelEnumeration에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageLevelEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="debug"/>
 *     &lt;enumeration value="error"/>
 *     &lt;enumeration value="fatal"/>
 *     &lt;enumeration value="info"/>
 *     &lt;enumeration value="warning"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MessageLevelEnumeration")
@XmlEnum
public enum MessageLevelEnumeration {


    /**
     * Debug messages should only be displayed by a tool when run in some sort of verbose mode.
     * 
     */
    @XmlEnumValue("debug")
    DEBUG("debug"),

    /**
     * Error messages should be recorded when there was an error that did not allow the collection of specific data.
     * 
     */
    @XmlEnumValue("error")
    ERROR("error"),

    /**
     * A fatal message should be recorded when an error causes the failure of more than just a single piece of data.
     * 
     */
    @XmlEnumValue("fatal")
    FATAL("fatal"),

    /**
     * Info messages are used to pass useful information about the data collection to a user.
     * 
     */
    @XmlEnumValue("info")
    INFO("info"),

    /**
     * A warning message reports something that might not correct but information was still collected.
     * 
     */
    @XmlEnumValue("warning")
    WARNING("warning");
    private final String value;

    MessageLevelEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageLevelEnumeration fromValue(String v) {
        for (MessageLevelEnumeration c: MessageLevelEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
