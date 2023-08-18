//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_results_5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ResultEnumeration에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="ResultEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="true"/>
 *     &lt;enumeration value="false"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="error"/>
 *     &lt;enumeration value="not evaluated"/>
 *     &lt;enumeration value="not applicable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResultEnumeration")
@XmlEnum
public enum ResultEnumeration {


    /**
     * When evaluating a definition or test, a result value of 'true' means that the characteristics being evaluated match the information represented in the system characteristic document. When evaluating a tested_item, and a state exists, a result value of 'true' indicates that the item matches the state.
     * 
     */
    @XmlEnumValue("true")
    TRUE("true"),

    /**
     * When evaluating a definition or test, a result value of 'false' means that the characteristics being evaluated do not match the information represented in the system characteristic document.  When evaluating a tested_item, and a state exists, a result value of 'false' indicates that the item does not match the state.
     * 
     */
    @XmlEnumValue("false")
    FALSE("false"),

    /**
     * When evaluating a definition or test, a result value of 'unknown' means that the characteristics being evaluated cannot be found in the system characteristic document (or the characteristics can be found but collected object flag is 'not collected'). For example, assume that a definition tests a file, but data pertaining to that file cannot be found and is not recorded in the System Characteristics document. The lack of an item (in the system_data section) for this file in the System Characteristics document means that no attempt was made to collect information about the file. In this situation, there is no way of knowing what the result would be if the file was collected. Note that finding a collected_object element in the system characteristic document is not the same as finding a matching element of the system. When evaluating an OVAL Test, the lack of a matching object on a system (for example, file not found) does not cause a result of unknown since an test considers both the state of an item and its existence. In this case the test result would be based on the existence check specified by the check_existence attribute on the test.  When evaluating a tested_item, and a state exists, a result value of 'unknown' indicates that it could not be determined whether or not the item and state match. For example, if a registry_object with a hive equal to HKEY_LOCAL_MACHINE, a key with the xsi:nil attribute set to 'true', and a name with the xsi:nil attribute set to 'true' was collected and compared against a registry_state with key entity equal to 'SOFTWARE', the tested_item result would be 'unknown' because an assertion of whether or not the item matches the state could not be determined since the key entity of the item was not collected.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * When evaluating a definition or test, a result value of 'error' means that the characteristics being evaluated exist in the system characteristic document but there was an error either collecting information or in performing analysis. For example, if there was an error returned by an api when trying to determine if an object exists on a system. Another example would be: xsi:nil might be set on an object entity, but then the entity is compared to a state entity with a value, thus producing an error.  When evaluating a tested_item, and a state exists, a result value of 'error' indicates that there was either an error collecting the item or there was an error analyzing the item against the state. For example, a tested_item will receive a result value of 'error' if an attempt is made to compare a state entity against an item entity that has a status of 'error'.
     * 
     */
    @XmlEnumValue("error")
    ERROR("error"),

    /**
     * When evaluating a definition or test, a result value of 'not evaluated' means that a choice was made not to evaluate the given definition or test. The actual result is not known since if evaluation had occurred the result could have been either true or false.  When evaluating a tested_item, a result value of 'not evaluated' indicates that a state was not specified and is equivalent to an existence check.
     * 
     */
    @XmlEnumValue("not evaluated")
    NOT_EVALUATED("not evaluated"),

    /**
     * When evaluating a definition or test, a result value of 'not applicable' means that the definition or test being evaluated is not valid on the given platform. For example, trying to collect Linux RPM information on a Windows system is not possible and so a result of not applicable is used.  Another example would be in trying to collect RPM information on a linux system that does not have the RPM packaging system installed.
     * 
     */
    @XmlEnumValue("not applicable")
    NOT_APPLICABLE("not applicable");
    private final String value;

    ResultEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResultEnumeration fromValue(String v) {
        for (ResultEnumeration c: ResultEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
