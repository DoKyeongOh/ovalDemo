//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The EntityObjectAnySimpleType type is extended by the entities of an individual OVAL Object. This type provides uniformity to each object entity by including the attributes found in the EntitySimpleBaseType. This specific type describes any simple data.
 * 
 * <p>EntityObjectAnySimpleType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="EntityObjectAnySimpleType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntitySimpleBaseType">
 *       &lt;attribute name="datatype" type="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration" default="string" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityObjectAnySimpleType")
@XmlSeeAlso({
    org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifypackageObject.Epoch.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifypackageObject.Version.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifypackageObject.Release.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifyfileObject.Epoch.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifyfileObject.Version.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifyfileObject.Release.class
})
public class EntityObjectAnySimpleType
    extends EntitySimpleBaseType
{


}
