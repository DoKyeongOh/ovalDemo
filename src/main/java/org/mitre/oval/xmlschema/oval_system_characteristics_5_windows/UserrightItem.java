//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_windows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;


/**
 * The userright_item is used to specify a trustee name and corresponding SID that has been granted a user right/privilege.
 * 
 * <p>anonymous complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}ItemType">
 *       &lt;sequence>
 *         &lt;element name="userright" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemUserRightType" minOccurs="0"/>
 *         &lt;element name="trustee_name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="trustee_sid" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
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
    "userright",
    "trusteeName",
    "trusteeSid"
})
public class UserrightItem
    extends ItemType
{

    protected EntityItemUserRightType userright;
    @XmlElement(name = "trustee_name")
    protected EntityItemStringType trusteeName;
    @XmlElement(name = "trustee_sid")
    protected EntityItemStringType trusteeSid;

    /**
     * userright 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemUserRightType }
     *     
     */
    public EntityItemUserRightType getUserright() {
        return userright;
    }

    /**
     * userright 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemUserRightType }
     *     
     */
    public void setUserright(EntityItemUserRightType value) {
        this.userright = value;
    }

    /**
     * trusteeName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getTrusteeName() {
        return trusteeName;
    }

    /**
     * trusteeName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setTrusteeName(EntityItemStringType value) {
        this.trusteeName = value;
    }

    /**
     * trusteeSid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getTrusteeSid() {
        return trusteeSid;
    }

    /**
     * trusteeSid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setTrusteeSid(EntityItemStringType value) {
        this.trusteeSid = value;
    }

}
