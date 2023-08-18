//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_macos;

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
 *         &lt;element name="timezone" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType"/>
 *         &lt;element name="usingnetworktime" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType"/>
 *         &lt;element name="networktimeserver" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="computersleep" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="displaysleep" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="harddisksleep" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="wakeonmodem" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType"/>
 *         &lt;element name="wakeonnetworkaccess" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType"/>
 *         &lt;element name="restartfreeze" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType"/>
 *         &lt;element name="restartpowerfailure" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType"/>
 *         &lt;element name="allowpowerbuttontosleepcomputer" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType"/>
 *         &lt;element name="remotelogin" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType"/>
 *         &lt;element name="remoteappleevents" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="computername" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType"/>
 *         &lt;element name="localsubnetname" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType"/>
 *         &lt;element name="startupdisk" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType"/>
 *         &lt;element name="waitforstartupafterpowerfailure" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="disablekeyboardwhenenclosurelockisengaged" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType"/>
 *         &lt;element name="kernelbootarchitecturesetting" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType"/>
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
    "timezone",
    "usingnetworktime",
    "networktimeserver",
    "computersleep",
    "displaysleep",
    "harddisksleep",
    "wakeonmodem",
    "wakeonnetworkaccess",
    "restartfreeze",
    "restartpowerfailure",
    "allowpowerbuttontosleepcomputer",
    "remotelogin",
    "remoteappleevents",
    "computername",
    "localsubnetname",
    "startupdisk",
    "waitforstartupafterpowerfailure",
    "disablekeyboardwhenenclosurelockisengaged",
    "kernelbootarchitecturesetting"
})
public class SystemsetupItem
    extends ItemType
{

    @XmlElement(required = true)
    protected EntityItemStringType timezone;
    @XmlElement(required = true)
    protected EntityItemBoolType usingnetworktime;
    protected EntityItemStringType networktimeserver;
    @XmlElement(required = true)
    protected EntityItemIntType computersleep;
    @XmlElement(required = true)
    protected EntityItemIntType displaysleep;
    @XmlElement(required = true)
    protected EntityItemIntType harddisksleep;
    @XmlElement(required = true)
    protected EntityItemBoolType wakeonmodem;
    @XmlElement(required = true)
    protected EntityItemBoolType wakeonnetworkaccess;
    @XmlElement(required = true)
    protected EntityItemBoolType restartfreeze;
    @XmlElement(required = true)
    protected EntityItemBoolType restartpowerfailure;
    @XmlElement(required = true)
    protected EntityItemBoolType allowpowerbuttontosleepcomputer;
    @XmlElement(required = true)
    protected EntityItemBoolType remotelogin;
    protected EntityItemBoolType remoteappleevents;
    @XmlElement(required = true)
    protected EntityItemStringType computername;
    @XmlElement(required = true)
    protected EntityItemStringType localsubnetname;
    @XmlElement(required = true)
    protected EntityItemStringType startupdisk;
    @XmlElement(required = true)
    protected EntityItemIntType waitforstartupafterpowerfailure;
    @XmlElement(required = true)
    protected EntityItemBoolType disablekeyboardwhenenclosurelockisengaged;
    @XmlElement(required = true)
    protected EntityItemStringType kernelbootarchitecturesetting;

    /**
     * timezone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getTimezone() {
        return timezone;
    }

    /**
     * timezone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setTimezone(EntityItemStringType value) {
        this.timezone = value;
    }

    /**
     * usingnetworktime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getUsingnetworktime() {
        return usingnetworktime;
    }

    /**
     * usingnetworktime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setUsingnetworktime(EntityItemBoolType value) {
        this.usingnetworktime = value;
    }

    /**
     * networktimeserver 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getNetworktimeserver() {
        return networktimeserver;
    }

    /**
     * networktimeserver 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setNetworktimeserver(EntityItemStringType value) {
        this.networktimeserver = value;
    }

    /**
     * computersleep 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getComputersleep() {
        return computersleep;
    }

    /**
     * computersleep 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setComputersleep(EntityItemIntType value) {
        this.computersleep = value;
    }

    /**
     * displaysleep 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getDisplaysleep() {
        return displaysleep;
    }

    /**
     * displaysleep 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setDisplaysleep(EntityItemIntType value) {
        this.displaysleep = value;
    }

    /**
     * harddisksleep 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getHarddisksleep() {
        return harddisksleep;
    }

    /**
     * harddisksleep 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setHarddisksleep(EntityItemIntType value) {
        this.harddisksleep = value;
    }

    /**
     * wakeonmodem 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getWakeonmodem() {
        return wakeonmodem;
    }

    /**
     * wakeonmodem 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setWakeonmodem(EntityItemBoolType value) {
        this.wakeonmodem = value;
    }

    /**
     * wakeonnetworkaccess 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getWakeonnetworkaccess() {
        return wakeonnetworkaccess;
    }

    /**
     * wakeonnetworkaccess 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setWakeonnetworkaccess(EntityItemBoolType value) {
        this.wakeonnetworkaccess = value;
    }

    /**
     * restartfreeze 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getRestartfreeze() {
        return restartfreeze;
    }

    /**
     * restartfreeze 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setRestartfreeze(EntityItemBoolType value) {
        this.restartfreeze = value;
    }

    /**
     * restartpowerfailure 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getRestartpowerfailure() {
        return restartpowerfailure;
    }

    /**
     * restartpowerfailure 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setRestartpowerfailure(EntityItemBoolType value) {
        this.restartpowerfailure = value;
    }

    /**
     * allowpowerbuttontosleepcomputer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowpowerbuttontosleepcomputer() {
        return allowpowerbuttontosleepcomputer;
    }

    /**
     * allowpowerbuttontosleepcomputer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowpowerbuttontosleepcomputer(EntityItemBoolType value) {
        this.allowpowerbuttontosleepcomputer = value;
    }

    /**
     * remotelogin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getRemotelogin() {
        return remotelogin;
    }

    /**
     * remotelogin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setRemotelogin(EntityItemBoolType value) {
        this.remotelogin = value;
    }

    /**
     * remoteappleevents 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getRemoteappleevents() {
        return remoteappleevents;
    }

    /**
     * remoteappleevents 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setRemoteappleevents(EntityItemBoolType value) {
        this.remoteappleevents = value;
    }

    /**
     * computername 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getComputername() {
        return computername;
    }

    /**
     * computername 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setComputername(EntityItemStringType value) {
        this.computername = value;
    }

    /**
     * localsubnetname 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getLocalsubnetname() {
        return localsubnetname;
    }

    /**
     * localsubnetname 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setLocalsubnetname(EntityItemStringType value) {
        this.localsubnetname = value;
    }

    /**
     * startupdisk 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getStartupdisk() {
        return startupdisk;
    }

    /**
     * startupdisk 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setStartupdisk(EntityItemStringType value) {
        this.startupdisk = value;
    }

    /**
     * waitforstartupafterpowerfailure 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getWaitforstartupafterpowerfailure() {
        return waitforstartupafterpowerfailure;
    }

    /**
     * waitforstartupafterpowerfailure 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setWaitforstartupafterpowerfailure(EntityItemIntType value) {
        this.waitforstartupafterpowerfailure = value;
    }

    /**
     * disablekeyboardwhenenclosurelockisengaged 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getDisablekeyboardwhenenclosurelockisengaged() {
        return disablekeyboardwhenenclosurelockisengaged;
    }

    /**
     * disablekeyboardwhenenclosurelockisengaged 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setDisablekeyboardwhenenclosurelockisengaged(EntityItemBoolType value) {
        this.disablekeyboardwhenenclosurelockisengaged = value;
    }

    /**
     * kernelbootarchitecturesetting 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getKernelbootarchitecturesetting() {
        return kernelbootarchitecturesetting;
    }

    /**
     * kernelbootarchitecturesetting 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setKernelbootarchitecturesetting(EntityItemStringType value) {
        this.kernelbootarchitecturesetting = value;
    }

}
