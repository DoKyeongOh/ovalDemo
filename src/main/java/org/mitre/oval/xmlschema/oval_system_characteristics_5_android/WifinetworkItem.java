//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_android;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemBoolType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemIntType;
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
 *         &lt;element name="bssid" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="ssid" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="auth_algorithms" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android}EntityItemWifiAuthAlgorithmType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="group_ciphers" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android}EntityItemWifiGroupCipherType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="key_management" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android}EntityItemWifiKeyMgmtType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pairwise_ciphers" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android}EntityItemWifiPairwiseCipherType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="protocols" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android}EntityItemWifiProtocolType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hidden_ssid" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="network_id" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="current_status" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android}EntityItemWifiCurrentStatusType" minOccurs="0"/>
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
    "bssid",
    "ssid",
    "authAlgorithms",
    "groupCiphers",
    "keyManagement",
    "pairwiseCiphers",
    "protocols",
    "hiddenSsid",
    "networkId",
    "priority",
    "currentStatus"
})
public class WifinetworkItem
    extends ItemType
{

    protected EntityItemStringType bssid;
    protected EntityItemStringType ssid;
    @XmlElement(name = "auth_algorithms")
    protected List<EntityItemWifiAuthAlgorithmType> authAlgorithms;
    @XmlElement(name = "group_ciphers")
    protected List<EntityItemWifiGroupCipherType> groupCiphers;
    @XmlElement(name = "key_management")
    protected List<EntityItemWifiKeyMgmtType> keyManagement;
    @XmlElement(name = "pairwise_ciphers")
    protected List<EntityItemWifiPairwiseCipherType> pairwiseCiphers;
    protected List<EntityItemWifiProtocolType> protocols;
    @XmlElement(name = "hidden_ssid")
    protected EntityItemBoolType hiddenSsid;
    @XmlElement(name = "network_id")
    protected EntityItemIntType networkId;
    protected EntityItemIntType priority;
    @XmlElement(name = "current_status")
    protected EntityItemWifiCurrentStatusType currentStatus;

    /**
     * bssid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getBssid() {
        return bssid;
    }

    /**
     * bssid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setBssid(EntityItemStringType value) {
        this.bssid = value;
    }

    /**
     * ssid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getSsid() {
        return ssid;
    }

    /**
     * ssid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setSsid(EntityItemStringType value) {
        this.ssid = value;
    }

    /**
     * Gets the value of the authAlgorithms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authAlgorithms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthAlgorithms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemWifiAuthAlgorithmType }
     * 
     * 
     */
    public List<EntityItemWifiAuthAlgorithmType> getAuthAlgorithms() {
        if (authAlgorithms == null) {
            authAlgorithms = new ArrayList<EntityItemWifiAuthAlgorithmType>();
        }
        return this.authAlgorithms;
    }

    /**
     * Gets the value of the groupCiphers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupCiphers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupCiphers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemWifiGroupCipherType }
     * 
     * 
     */
    public List<EntityItemWifiGroupCipherType> getGroupCiphers() {
        if (groupCiphers == null) {
            groupCiphers = new ArrayList<EntityItemWifiGroupCipherType>();
        }
        return this.groupCiphers;
    }

    /**
     * Gets the value of the keyManagement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyManagement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyManagement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemWifiKeyMgmtType }
     * 
     * 
     */
    public List<EntityItemWifiKeyMgmtType> getKeyManagement() {
        if (keyManagement == null) {
            keyManagement = new ArrayList<EntityItemWifiKeyMgmtType>();
        }
        return this.keyManagement;
    }

    /**
     * Gets the value of the pairwiseCiphers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pairwiseCiphers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPairwiseCiphers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemWifiPairwiseCipherType }
     * 
     * 
     */
    public List<EntityItemWifiPairwiseCipherType> getPairwiseCiphers() {
        if (pairwiseCiphers == null) {
            pairwiseCiphers = new ArrayList<EntityItemWifiPairwiseCipherType>();
        }
        return this.pairwiseCiphers;
    }

    /**
     * Gets the value of the protocols property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the protocols property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProtocols().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemWifiProtocolType }
     * 
     * 
     */
    public List<EntityItemWifiProtocolType> getProtocols() {
        if (protocols == null) {
            protocols = new ArrayList<EntityItemWifiProtocolType>();
        }
        return this.protocols;
    }

    /**
     * hiddenSsid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getHiddenSsid() {
        return hiddenSsid;
    }

    /**
     * hiddenSsid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setHiddenSsid(EntityItemBoolType value) {
        this.hiddenSsid = value;
    }

    /**
     * networkId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getNetworkId() {
        return networkId;
    }

    /**
     * networkId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setNetworkId(EntityItemIntType value) {
        this.networkId = value;
    }

    /**
     * priority 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getPriority() {
        return priority;
    }

    /**
     * priority 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setPriority(EntityItemIntType value) {
        this.priority = value;
    }

    /**
     * currentStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemWifiCurrentStatusType }
     *     
     */
    public EntityItemWifiCurrentStatusType getCurrentStatus() {
        return currentStatus;
    }

    /**
     * currentStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemWifiCurrentStatusType }
     *     
     */
    public void setCurrentStatus(EntityItemWifiCurrentStatusType value) {
        this.currentStatus = value;
    }

}
