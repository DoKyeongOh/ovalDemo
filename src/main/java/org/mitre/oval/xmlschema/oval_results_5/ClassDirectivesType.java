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
import org.mitre.oval.xmlschema.oval_common_5.ClassEnumeration;


/**
 * The required class attribute allows a set of directives to be specified for each supported OVAL Definition class (See the definition of the oval:ClassEnumeration for more information about the supported classes). A set of class specific directives overrides the default directives for the specified definition class. A given class may be specified once.
 * 
 * <p>ClassDirectivesType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ClassDirectivesType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.mitre.org/XMLSchema/oval-results-5}DirectivesType">
 *       &lt;attribute name="class" use="required" type="{http://oval.mitre.org/XMLSchema/oval-common-5}ClassEnumeration" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassDirectivesType")
public class ClassDirectivesType
    extends DirectivesType
{

    @XmlAttribute(name = "class", required = true)
    protected ClassEnumeration clazz;

    /**
     * clazz 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ClassEnumeration }
     *     
     */
    public ClassEnumeration getClazz() {
        return clazz;
    }

    /**
     * clazz 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassEnumeration }
     *     
     */
    public void setClazz(ClassEnumeration value) {
        this.clazz = value;
    }

}
