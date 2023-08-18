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
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemIntType;
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
 *         &lt;element name="force_logoff" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="lockout_duration" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="lockout_observation_window" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="lockout_threshold" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
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
    "forceLogoff",
    "lockoutDuration",
    "lockoutObservationWindow",
    "lockoutThreshold"
})
public class LockoutpolicyItem
    extends ItemType
{

    @XmlElement(name = "force_logoff")
    protected EntityItemIntType forceLogoff;
    @XmlElement(name = "lockout_duration")
    protected EntityItemIntType lockoutDuration;
    @XmlElement(name = "lockout_observation_window")
    protected EntityItemIntType lockoutObservationWindow;
    @XmlElement(name = "lockout_threshold")
    protected EntityItemIntType lockoutThreshold;

    /**
     * forceLogoff 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getForceLogoff() {
        return forceLogoff;
    }

    /**
     * forceLogoff 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setForceLogoff(EntityItemIntType value) {
        this.forceLogoff = value;
    }

    /**
     * lockoutDuration 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getLockoutDuration() {
        return lockoutDuration;
    }

    /**
     * lockoutDuration 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setLockoutDuration(EntityItemIntType value) {
        this.lockoutDuration = value;
    }

    /**
     * lockoutObservationWindow 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getLockoutObservationWindow() {
        return lockoutObservationWindow;
    }

    /**
     * lockoutObservationWindow 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setLockoutObservationWindow(EntityItemIntType value) {
        this.lockoutObservationWindow = value;
    }

    /**
     * lockoutThreshold 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getLockoutThreshold() {
        return lockoutThreshold;
    }

    /**
     * lockoutThreshold 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setLockoutThreshold(EntityItemIntType value) {
        this.lockoutThreshold = value;
    }

}
