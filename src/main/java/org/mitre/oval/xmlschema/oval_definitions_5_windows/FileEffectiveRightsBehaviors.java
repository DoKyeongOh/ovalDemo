//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5_windows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The FileEffectiveRightsBehaviors extend the win-def:FileBehaviors and therefore include the behaviors defined by that type.
 * 
 * <p>FileEffectiveRightsBehaviors complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="FileEffectiveRightsBehaviors">
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}FileBehaviors">
 *       &lt;attribute name="include_group" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="resolve_group" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileEffectiveRightsBehaviors")
public class FileEffectiveRightsBehaviors
    extends FileBehaviors
{

    @XmlAttribute(name = "include_group")
    protected Boolean includeGroup;
    @XmlAttribute(name = "resolve_group")
    protected Boolean resolveGroup;

    /**
     * includeGroup 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIncludeGroup() {
        if (includeGroup == null) {
            return true;
        } else {
            return includeGroup;
        }
    }

    /**
     * includeGroup 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeGroup(Boolean value) {
        this.includeGroup = value;
    }

    /**
     * resolveGroup 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isResolveGroup() {
        if (resolveGroup == null) {
            return false;
        } else {
            return resolveGroup;
        }
    }

    /**
     * resolveGroup 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResolveGroup(Boolean value) {
        this.resolveGroup = value;
    }

}
