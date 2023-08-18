//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_android;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="network_type" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android}EntityItemNetworkType" minOccurs="0"/>
 *         &lt;element name="sim_country_iso" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="sim_operator_code" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
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
    "networkType",
    "simCountryIso",
    "simOperatorCode"
})
public class TelephonyItem
    extends ItemType
{

    @XmlElement(name = "network_type")
    protected EntityItemNetworkType networkType;
    @XmlElement(name = "sim_country_iso")
    protected EntityItemStringType simCountryIso;
    @XmlElement(name = "sim_operator_code")
    protected EntityItemStringType simOperatorCode;

    /**
     * networkType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemNetworkType }
     *     
     */
    public EntityItemNetworkType getNetworkType() {
        return networkType;
    }

    /**
     * networkType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemNetworkType }
     *     
     */
    public void setNetworkType(EntityItemNetworkType value) {
        this.networkType = value;
    }

    /**
     * simCountryIso 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getSimCountryIso() {
        return simCountryIso;
    }

    /**
     * simCountryIso 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setSimCountryIso(EntityItemStringType value) {
        this.simCountryIso = value;
    }

    /**
     * simOperatorCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getSimOperatorCode() {
        return simOperatorCode;
    }

    /**
     * simOperatorCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setSimOperatorCode(EntityItemStringType value) {
        this.simOperatorCode = value;
    }

}
