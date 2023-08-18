//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_sharepoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemBoolType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;


/**
 * <p>anonymous complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}ItemType">
 *       &lt;sequence>
 *         &lt;element name="webappuri" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="urlzone" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint}EntityItemUrlZoneType" minOccurs="0"/>
 *         &lt;element name="displayname" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="issystemuser" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="username" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="policyroletype" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint}EntityItemPolicyRoleType" minOccurs="0"/>
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
    "webappuri",
    "urlzone",
    "displayname",
    "issystemuser",
    "username",
    "policyroletype"
})
public class SppolicyItem
    extends ItemType
{

    protected EntityItemStringType webappuri;
    protected EntityItemUrlZoneType urlzone;
    protected EntityItemStringType displayname;
    protected EntityItemBoolType issystemuser;
    protected EntityItemStringType username;
    protected EntityItemPolicyRoleType policyroletype;

    /**
     * webappuri 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getWebappuri() {
        return webappuri;
    }

    /**
     * webappuri 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setWebappuri(EntityItemStringType value) {
        this.webappuri = value;
    }

    /**
     * urlzone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemUrlZoneType }
     *     
     */
    public EntityItemUrlZoneType getUrlzone() {
        return urlzone;
    }

    /**
     * urlzone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemUrlZoneType }
     *     
     */
    public void setUrlzone(EntityItemUrlZoneType value) {
        this.urlzone = value;
    }

    /**
     * displayname 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getDisplayname() {
        return displayname;
    }

    /**
     * displayname 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setDisplayname(EntityItemStringType value) {
        this.displayname = value;
    }

    /**
     * issystemuser 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getIssystemuser() {
        return issystemuser;
    }

    /**
     * issystemuser 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setIssystemuser(EntityItemBoolType value) {
        this.issystemuser = value;
    }

    /**
     * username 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getUsername() {
        return username;
    }

    /**
     * username 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setUsername(EntityItemStringType value) {
        this.username = value;
    }

    /**
     * policyroletype 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemPolicyRoleType }
     *     
     */
    public EntityItemPolicyRoleType getPolicyroletype() {
        return policyroletype;
    }

    /**
     * policyroletype 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemPolicyRoleType }
     *     
     */
    public void setPolicyroletype(EntityItemPolicyRoleType value) {
        this.policyroletype = value;
    }

}
