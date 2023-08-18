//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MetadataType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MetadataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-definitions-5}MetadataType">
 *       &lt;sequence>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="affected" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}AffectedType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reference" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="oval_repository">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dates" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}MetadataDatesType"/>
 *                   &lt;element name="status" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}MetadataStatusEnumeration"/>
 *                   &lt;element name="affected_cpe_list" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}AffectedCPEListType" minOccurs="0"/>
 *                   &lt;element name="min_schema_version" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}MetadataMinSchemaVersionType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataType")
public class MetadataType
    extends OriginalMetadataType
{


}
