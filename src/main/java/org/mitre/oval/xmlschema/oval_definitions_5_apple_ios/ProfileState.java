//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5_apple_ios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateBoolType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateIntType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateRecordType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.StateType;


/**
 * <p>anonymous complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.mitre.org/XMLSchema/oval-definitions-5}StateType">
 *       &lt;sequence>
 *         &lt;element name="has_removal_passcode" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="is_encrypted" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="payload" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateRecordType" minOccurs="0"/>
 *         &lt;element name="description" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="display_name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="identifier" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="organization" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="removal_disallowed" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="uuid" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="version" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rest"
})
public class ProfileState
    extends StateType
{

    @XmlElementRefs({
        @XmlElementRef(name = "version", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "uuid", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "removal_disallowed", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "has_removal_passcode", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "payload", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "display_name", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "organization", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "description", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "is_encrypted", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "identifier", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * 나머지 콘텐츠 모델을 가져옵니다. 
     * 
     * <p>
     * 다음 원인으로 인해 이 "catch-all" 속성을 가져오고 있습니다.
     * 필드 이름 "Version"이(가) 스키마의 다른 두 부분에 사용되었습니다. 참조: 
     * file:/C:/work/oval/5.11.2/apple-ios-definitions-schema.xsd의 525행
     * file:/C:/work/oval/5.11.2/oval-definitions-schema.xsd의 497행
     * <p>
     * 이 속성을 제거하려면 다음 선언 중 하나에 
     * 속성 사용자 정의를 적용하여 이름을 변경하십시오. 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link EntityStateIntType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateBoolType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateBoolType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateRecordType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateBoolType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }

}
