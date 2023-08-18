//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5_macos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="timezone" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="usingnetworktime" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="networktimeserver" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="computersleep" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="displaysleep" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="harddisksleep" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="wakeonmodem" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="wakeonnetworkaccess" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="restartfreeze" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allowpowerbuttontosleepcomputer" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="remotelogin" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="remoteappleevents" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="computername" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="startupdisk" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="waitforstartupafterpowerfailure" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="disablekeyboardwhenenclosurelockisengaged" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="kernelbootarchitecturesetting" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
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
    "allowpowerbuttontosleepcomputer",
    "remotelogin",
    "remoteappleevents",
    "computername",
    "startupdisk",
    "waitforstartupafterpowerfailure",
    "disablekeyboardwhenenclosurelockisengaged",
    "kernelbootarchitecturesetting"
})
public class SystemsetupState
    extends StateType
{

    protected EntityStateStringType timezone;
    protected EntityStateBoolType usingnetworktime;
    protected EntityStateStringType networktimeserver;
    protected EntityStateIntType computersleep;
    protected EntityStateIntType displaysleep;
    protected EntityStateIntType harddisksleep;
    protected EntityStateBoolType wakeonmodem;
    protected EntityStateBoolType wakeonnetworkaccess;
    protected EntityStateBoolType restartfreeze;
    protected EntityStateBoolType allowpowerbuttontosleepcomputer;
    protected EntityStateBoolType remotelogin;
    protected EntityStateBoolType remoteappleevents;
    protected EntityStateStringType computername;
    protected EntityStateStringType startupdisk;
    protected EntityStateIntType waitforstartupafterpowerfailure;
    protected EntityStateBoolType disablekeyboardwhenenclosurelockisengaged;
    protected EntityStateStringType kernelbootarchitecturesetting;

    /**
     * timezone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getTimezone() {
        return timezone;
    }

    /**
     * timezone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setTimezone(EntityStateStringType value) {
        this.timezone = value;
    }

    /**
     * usingnetworktime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getUsingnetworktime() {
        return usingnetworktime;
    }

    /**
     * usingnetworktime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setUsingnetworktime(EntityStateBoolType value) {
        this.usingnetworktime = value;
    }

    /**
     * networktimeserver 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getNetworktimeserver() {
        return networktimeserver;
    }

    /**
     * networktimeserver 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setNetworktimeserver(EntityStateStringType value) {
        this.networktimeserver = value;
    }

    /**
     * computersleep 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getComputersleep() {
        return computersleep;
    }

    /**
     * computersleep 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setComputersleep(EntityStateIntType value) {
        this.computersleep = value;
    }

    /**
     * displaysleep 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getDisplaysleep() {
        return displaysleep;
    }

    /**
     * displaysleep 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setDisplaysleep(EntityStateIntType value) {
        this.displaysleep = value;
    }

    /**
     * harddisksleep 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getHarddisksleep() {
        return harddisksleep;
    }

    /**
     * harddisksleep 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setHarddisksleep(EntityStateIntType value) {
        this.harddisksleep = value;
    }

    /**
     * wakeonmodem 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getWakeonmodem() {
        return wakeonmodem;
    }

    /**
     * wakeonmodem 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setWakeonmodem(EntityStateBoolType value) {
        this.wakeonmodem = value;
    }

    /**
     * wakeonnetworkaccess 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getWakeonnetworkaccess() {
        return wakeonnetworkaccess;
    }

    /**
     * wakeonnetworkaccess 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setWakeonnetworkaccess(EntityStateBoolType value) {
        this.wakeonnetworkaccess = value;
    }

    /**
     * restartfreeze 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getRestartfreeze() {
        return restartfreeze;
    }

    /**
     * restartfreeze 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setRestartfreeze(EntityStateBoolType value) {
        this.restartfreeze = value;
    }

    /**
     * allowpowerbuttontosleepcomputer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowpowerbuttontosleepcomputer() {
        return allowpowerbuttontosleepcomputer;
    }

    /**
     * allowpowerbuttontosleepcomputer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowpowerbuttontosleepcomputer(EntityStateBoolType value) {
        this.allowpowerbuttontosleepcomputer = value;
    }

    /**
     * remotelogin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getRemotelogin() {
        return remotelogin;
    }

    /**
     * remotelogin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setRemotelogin(EntityStateBoolType value) {
        this.remotelogin = value;
    }

    /**
     * remoteappleevents 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getRemoteappleevents() {
        return remoteappleevents;
    }

    /**
     * remoteappleevents 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setRemoteappleevents(EntityStateBoolType value) {
        this.remoteappleevents = value;
    }

    /**
     * computername 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getComputername() {
        return computername;
    }

    /**
     * computername 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setComputername(EntityStateStringType value) {
        this.computername = value;
    }

    /**
     * startupdisk 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getStartupdisk() {
        return startupdisk;
    }

    /**
     * startupdisk 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setStartupdisk(EntityStateStringType value) {
        this.startupdisk = value;
    }

    /**
     * waitforstartupafterpowerfailure 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getWaitforstartupafterpowerfailure() {
        return waitforstartupafterpowerfailure;
    }

    /**
     * waitforstartupafterpowerfailure 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setWaitforstartupafterpowerfailure(EntityStateIntType value) {
        this.waitforstartupafterpowerfailure = value;
    }

    /**
     * disablekeyboardwhenenclosurelockisengaged 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getDisablekeyboardwhenenclosurelockisengaged() {
        return disablekeyboardwhenenclosurelockisengaged;
    }

    /**
     * disablekeyboardwhenenclosurelockisengaged 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setDisablekeyboardwhenenclosurelockisengaged(EntityStateBoolType value) {
        this.disablekeyboardwhenenclosurelockisengaged = value;
    }

    /**
     * kernelbootarchitecturesetting 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getKernelbootarchitecturesetting() {
        return kernelbootarchitecturesetting;
    }

    /**
     * kernelbootarchitecturesetting 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setKernelbootarchitecturesetting(EntityStateStringType value) {
        this.kernelbootarchitecturesetting = value;
    }

}
