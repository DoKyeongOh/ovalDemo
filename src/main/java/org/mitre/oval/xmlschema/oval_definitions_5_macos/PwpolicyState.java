//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5_macos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateBoolType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateIntType;
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
 *         &lt;element name="username" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="userpass" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="directory_node" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="maxChars" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="maxFailedLoginAttempts" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="minChars" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="passwordCannotBeName" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="requiresAlpha" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="requiresNumeric" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
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
    "username",
    "userpass",
    "directoryNode",
    "maxChars",
    "maxFailedLoginAttempts",
    "minChars",
    "passwordCannotBeName",
    "requiresAlpha",
    "requiresNumeric"
})
public class PwpolicyState
    extends StateType
{

    protected EntityStateStringType username;
    protected EntityStateStringType userpass;
    @XmlElement(name = "directory_node")
    protected EntityStateStringType directoryNode;
    protected EntityStateIntType maxChars;
    protected EntityStateIntType maxFailedLoginAttempts;
    protected EntityStateIntType minChars;
    protected EntityStateBoolType passwordCannotBeName;
    protected EntityStateBoolType requiresAlpha;
    protected EntityStateBoolType requiresNumeric;

    /**
     * username 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getUsername() {
        return username;
    }

    /**
     * username 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setUsername(EntityStateStringType value) {
        this.username = value;
    }

    /**
     * userpass 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getUserpass() {
        return userpass;
    }

    /**
     * userpass 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setUserpass(EntityStateStringType value) {
        this.userpass = value;
    }

    /**
     * directoryNode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getDirectoryNode() {
        return directoryNode;
    }

    /**
     * directoryNode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setDirectoryNode(EntityStateStringType value) {
        this.directoryNode = value;
    }

    /**
     * maxChars 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMaxChars() {
        return maxChars;
    }

    /**
     * maxChars 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMaxChars(EntityStateIntType value) {
        this.maxChars = value;
    }

    /**
     * maxFailedLoginAttempts 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMaxFailedLoginAttempts() {
        return maxFailedLoginAttempts;
    }

    /**
     * maxFailedLoginAttempts 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMaxFailedLoginAttempts(EntityStateIntType value) {
        this.maxFailedLoginAttempts = value;
    }

    /**
     * minChars 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMinChars() {
        return minChars;
    }

    /**
     * minChars 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMinChars(EntityStateIntType value) {
        this.minChars = value;
    }

    /**
     * passwordCannotBeName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getPasswordCannotBeName() {
        return passwordCannotBeName;
    }

    /**
     * passwordCannotBeName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setPasswordCannotBeName(EntityStateBoolType value) {
        this.passwordCannotBeName = value;
    }

    /**
     * requiresAlpha 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getRequiresAlpha() {
        return requiresAlpha;
    }

    /**
     * requiresAlpha 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setRequiresAlpha(EntityStateBoolType value) {
        this.requiresAlpha = value;
    }

    /**
     * requiresNumeric 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getRequiresNumeric() {
        return requiresNumeric;
    }

    /**
     * requiresNumeric 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setRequiresNumeric(EntityStateBoolType value) {
        this.requiresNumeric = value;
    }

}
