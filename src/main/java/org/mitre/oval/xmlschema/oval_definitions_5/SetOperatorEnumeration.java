//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SetOperatorEnumeration에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="SetOperatorEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COMPLEMENT"/>
 *     &lt;enumeration value="INTERSECTION"/>
 *     &lt;enumeration value="UNION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SetOperatorEnumeration")
@XmlEnum
public enum SetOperatorEnumeration {


    /**
     * The complement operator is defined in OVAL as a relative complement. The resulting unique set contains everything that belongs to the first declared set that is not part of the second declared set. If A and B are sets (with A being the first declared set), then the relative complement is the set of elements in A, but not in B, with the duplicates removed.
     * 
     */
    COMPLEMENT,

    /**
     * The intersection of two sets in OVAL results in a unique set that contains everything that belongs to both sets in the collection, but nothing else. If A and B are sets, then the intersection of A and B contains all the elements of A that also belong to B, but no other elements, with the duplicates removed.
     * 
     */
    INTERSECTION,

    /**
     * The union of two sets in OVAL results in a unique set that contains everything that belongs to either of the original sets. If A and B are sets, then the union of A and B contains all the elements of A and all elements of B, with the duplicates removed.
     * 
     */
    UNION;

    public String value() {
        return name();
    }

    public static SetOperatorEnumeration fromValue(String v) {
        return valueOf(v);
    }

}
