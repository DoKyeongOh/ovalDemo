//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5_android;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="ssid" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="bssid" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="auth_algorithms" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#android}EntityStateWifiAuthAlgorithmType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="group_ciphers" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#android}EntityStateWifiGroupCipherType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="key_management" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#android}EntityStateWifiKeyMgmtType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pairwise_ciphers" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#android}EntityStateWifiPairwiseCipherType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="protocols" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#android}EntityStateWifiProtocolType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hidden_ssid" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="network_id" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="current_status" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#android}EntityStateWifiCurrentStatusType" minOccurs="0"/>
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
    "ssid",
    "bssid",
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
public class WifinetworkState
    extends StateType
{

    protected EntityStateStringType ssid;
    protected EntityStateStringType bssid;
    @XmlElement(name = "auth_algorithms")
    protected List<EntityStateWifiAuthAlgorithmType> authAlgorithms;
    @XmlElement(name = "group_ciphers")
    protected List<EntityStateWifiGroupCipherType> groupCiphers;
    @XmlElement(name = "key_management")
    protected List<EntityStateWifiKeyMgmtType> keyManagement;
    @XmlElement(name = "pairwise_ciphers")
    protected List<EntityStateWifiPairwiseCipherType> pairwiseCiphers;
    protected List<EntityStateWifiProtocolType> protocols;
    @XmlElement(name = "hidden_ssid")
    protected EntityStateBoolType hiddenSsid;
    @XmlElement(name = "network_id")
    protected EntityStateIntType networkId;
    protected EntityStateIntType priority;
    @XmlElement(name = "current_status")
    protected EntityStateWifiCurrentStatusType currentStatus;

    /**
     * ssid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getSsid() {
        return ssid;
    }

    /**
     * ssid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setSsid(EntityStateStringType value) {
        this.ssid = value;
    }

    /**
     * bssid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getBssid() {
        return bssid;
    }

    /**
     * bssid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setBssid(EntityStateStringType value) {
        this.bssid = value;
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
     * {@link EntityStateWifiAuthAlgorithmType }
     * 
     * 
     */
    public List<EntityStateWifiAuthAlgorithmType> getAuthAlgorithms() {
        if (authAlgorithms == null) {
            authAlgorithms = new ArrayList<EntityStateWifiAuthAlgorithmType>();
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
     * {@link EntityStateWifiGroupCipherType }
     * 
     * 
     */
    public List<EntityStateWifiGroupCipherType> getGroupCiphers() {
        if (groupCiphers == null) {
            groupCiphers = new ArrayList<EntityStateWifiGroupCipherType>();
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
     * {@link EntityStateWifiKeyMgmtType }
     * 
     * 
     */
    public List<EntityStateWifiKeyMgmtType> getKeyManagement() {
        if (keyManagement == null) {
            keyManagement = new ArrayList<EntityStateWifiKeyMgmtType>();
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
     * {@link EntityStateWifiPairwiseCipherType }
     * 
     * 
     */
    public List<EntityStateWifiPairwiseCipherType> getPairwiseCiphers() {
        if (pairwiseCiphers == null) {
            pairwiseCiphers = new ArrayList<EntityStateWifiPairwiseCipherType>();
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
     * {@link EntityStateWifiProtocolType }
     * 
     * 
     */
    public List<EntityStateWifiProtocolType> getProtocols() {
        if (protocols == null) {
            protocols = new ArrayList<EntityStateWifiProtocolType>();
        }
        return this.protocols;
    }

    /**
     * hiddenSsid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getHiddenSsid() {
        return hiddenSsid;
    }

    /**
     * hiddenSsid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setHiddenSsid(EntityStateBoolType value) {
        this.hiddenSsid = value;
    }

    /**
     * networkId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getNetworkId() {
        return networkId;
    }

    /**
     * networkId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setNetworkId(EntityStateIntType value) {
        this.networkId = value;
    }

    /**
     * priority 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getPriority() {
        return priority;
    }

    /**
     * priority 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setPriority(EntityStateIntType value) {
        this.priority = value;
    }

    /**
     * currentStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateWifiCurrentStatusType }
     *     
     */
    public EntityStateWifiCurrentStatusType getCurrentStatus() {
        return currentStatus;
    }

    /**
     * currentStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateWifiCurrentStatusType }
     *     
     */
    public void setCurrentStatus(EntityStateWifiCurrentStatusType value) {
        this.currentStatus = value;
    }

}
