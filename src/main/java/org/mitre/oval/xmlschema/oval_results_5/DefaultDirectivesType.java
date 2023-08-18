//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_results_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The optional include_source_definitions attribute indicates whether or not the source OVAL Definitions document has been included in the results document.  A value of false indicates that the source OVAL Definitions has not been included. By default the source document is included.
 * 
 * <p>DefaultDirectivesType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="DefaultDirectivesType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.mitre.org/XMLSchema/oval-results-5}DirectivesType">
 *       &lt;attribute name="include_source_definitions" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefaultDirectivesType")
public class DefaultDirectivesType
    extends DirectivesType
{

    @XmlAttribute(name = "include_source_definitions")
    protected Boolean includeSourceDefinitions;

    /**
     * includeSourceDefinitions 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIncludeSourceDefinitions() {
        if (includeSourceDefinitions == null) {
            return true;
        } else {
            return includeSourceDefinitions;
        }
    }

    /**
     * includeSourceDefinitions 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSourceDefinitions(Boolean value) {
        this.includeSourceDefinitions = value;
    }

}
