//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5_unix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;


/**
 * The EntityStateRoutingTableFlagsType complex type restricts a string value to a specific set of values that describe the flags associated with a routing table entry. This list is based off the values defined in the man pages of various platforms. For Linux, please see route(8). For Solaris, please see netstat(1M). For HP-UX, please see netstat(1). For Mac OS, please see netstat(1). For FreeBSD, please see netstat(1). Documentation on each allowed value can be found in the previously listed man pages. The empty string is also allowed to support empty elements associated with variable references. Note that when using pattern matches and variables care must be taken to ensure that the regular expression and variable values align with the enumerated values.
 * 
 * <p>EntityStateRoutingTableFlagsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="EntityStateRoutingTableFlagsType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntityStateStringType">
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityStateRoutingTableFlagsType")
public class EntityStateRoutingTableFlagsType
    extends EntityStateStringType
{


}