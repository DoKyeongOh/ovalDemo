//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_common_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The ElementMapType is used to document the association between OVAL test, object, state, and item entities.
 * 
 * <p>ElementMapType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ElementMapType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="test" type="{http://oval.mitre.org/XMLSchema/oval-common-5}ElementMapItemType"/>
 *         &lt;element name="object" type="{http://oval.mitre.org/XMLSchema/oval-common-5}ElementMapItemType" minOccurs="0"/>
 *         &lt;element name="state" type="{http://oval.mitre.org/XMLSchema/oval-common-5}ElementMapItemType" minOccurs="0"/>
 *         &lt;element name="item" type="{http://oval.mitre.org/XMLSchema/oval-common-5}ElementMapItemType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementMapType", propOrder = {
    "test",
    "object",
    "state",
    "item"
})
public class ElementMapType {

    @XmlElement(required = true)
    protected ElementMapItemType test;
    protected ElementMapItemType object;
    protected ElementMapItemType state;
    protected ElementMapItemType item;

    /**
     * test 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ElementMapItemType }
     *     
     */
    public ElementMapItemType getTest() {
        return test;
    }

    /**
     * test 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementMapItemType }
     *     
     */
    public void setTest(ElementMapItemType value) {
        this.test = value;
    }

    /**
     * object 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ElementMapItemType }
     *     
     */
    public ElementMapItemType getObject() {
        return object;
    }

    /**
     * object 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementMapItemType }
     *     
     */
    public void setObject(ElementMapItemType value) {
        this.object = value;
    }

    /**
     * state 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ElementMapItemType }
     *     
     */
    public ElementMapItemType getState() {
        return state;
    }

    /**
     * state 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementMapItemType }
     *     
     */
    public void setState(ElementMapItemType value) {
        this.state = value;
    }

    /**
     * item 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ElementMapItemType }
     *     
     */
    public ElementMapItemType getItem() {
        return item;
    }

    /**
     * item 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementMapItemType }
     *     
     */
    public void setItem(ElementMapItemType value) {
        this.item = value;
    }

}
