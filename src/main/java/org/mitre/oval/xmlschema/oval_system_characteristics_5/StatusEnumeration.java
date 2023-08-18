//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>StatusEnumeration에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="error"/>
 *     &lt;enumeration value="exists"/>
 *     &lt;enumeration value="does not exist"/>
 *     &lt;enumeration value="not collected"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatusEnumeration")
@XmlEnum
public enum StatusEnumeration {


    /**
     * A status of 'error' says that there was an error collecting information associated with an item as a whole or any specific entity. An item would have a status of 'error' if a problem occurred that prevented the item from being collected. For example, a file_item would have a status of 'error' if a handle to the file could not be opened because the handle was already in use by another program. See the documentation for ItemType for information about when an item entity status of 'error' should propagate up to the item status level.
     * 
     */
    @XmlEnumValue("error")
    ERROR("error"),

    /**
     * A status of 'exists' says that the item or specific piece of information exists on the system and has been collected.
     * 
     */
    @XmlEnumValue("exists")
    EXISTS("exists"),

    /**
     * A status of 'does not exist' says that the item or specific piece of information does not exist and therefore has not been collected. This status assumes that an attempt was made to collect the information, but the information just does not exist. This can happen when a certain entity is only pertinent to particular instances or if the information for that entity is not set.
     * 
     */
    @XmlEnumValue("does not exist")
    DOES_NOT_EXIST("does not exist"),

    /**
     * A status of 'not collected' says that no attempt was made to collect the item or specific piece of information so it is unknown what the value is and if it even exists.
     * 
     */
    @XmlEnumValue("not collected")
    NOT_COLLECTED("not collected");
    private final String value;

    StatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusEnumeration fromValue(String v) {
        for (StatusEnumeration c: StatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
