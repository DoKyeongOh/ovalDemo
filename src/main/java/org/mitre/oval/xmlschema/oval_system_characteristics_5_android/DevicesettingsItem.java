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
 *         &lt;element name="adb_enabled" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allow_mock_location" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="install_non_market_apps" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="device_admin" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="auto_time" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="auto_time_zone" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="usb_mass_storage_enabled" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
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
    "adbEnabled",
    "allowMockLocation",
    "installNonMarketApps",
    "deviceAdmin",
    "autoTime",
    "autoTimeZone",
    "usbMassStorageEnabled"
})
public class DevicesettingsItem
    extends ItemType
{

    @XmlElement(name = "adb_enabled")
    protected EntityItemBoolType adbEnabled;
    @XmlElement(name = "allow_mock_location")
    protected EntityItemBoolType allowMockLocation;
    @XmlElement(name = "install_non_market_apps")
    protected EntityItemBoolType installNonMarketApps;
    @XmlElement(name = "device_admin")
    protected List<EntityItemStringType> deviceAdmin;
    @XmlElement(name = "auto_time")
    protected EntityItemBoolType autoTime;
    @XmlElement(name = "auto_time_zone")
    protected EntityItemBoolType autoTimeZone;
    @XmlElement(name = "usb_mass_storage_enabled")
    protected EntityItemBoolType usbMassStorageEnabled;

    /**
     * adbEnabled 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAdbEnabled() {
        return adbEnabled;
    }

    /**
     * adbEnabled 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAdbEnabled(EntityItemBoolType value) {
        this.adbEnabled = value;
    }

    /**
     * allowMockLocation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowMockLocation() {
        return allowMockLocation;
    }

    /**
     * allowMockLocation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowMockLocation(EntityItemBoolType value) {
        this.allowMockLocation = value;
    }

    /**
     * installNonMarketApps 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getInstallNonMarketApps() {
        return installNonMarketApps;
    }

    /**
     * installNonMarketApps 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setInstallNonMarketApps(EntityItemBoolType value) {
        this.installNonMarketApps = value;
    }

    /**
     * Gets the value of the deviceAdmin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceAdmin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceAdmin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemStringType }
     * 
     * 
     */
    public List<EntityItemStringType> getDeviceAdmin() {
        if (deviceAdmin == null) {
            deviceAdmin = new ArrayList<EntityItemStringType>();
        }
        return this.deviceAdmin;
    }

    /**
     * autoTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAutoTime() {
        return autoTime;
    }

    /**
     * autoTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAutoTime(EntityItemBoolType value) {
        this.autoTime = value;
    }

    /**
     * autoTimeZone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAutoTimeZone() {
        return autoTimeZone;
    }

    /**
     * autoTimeZone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAutoTimeZone(EntityItemBoolType value) {
        this.autoTimeZone = value;
    }

    /**
     * usbMassStorageEnabled 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getUsbMassStorageEnabled() {
        return usbMassStorageEnabled;
    }

    /**
     * usbMassStorageEnabled 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setUsbMassStorageEnabled(EntityItemBoolType value) {
        this.usbMassStorageEnabled = value;
    }

}
