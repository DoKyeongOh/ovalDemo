//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5_linux;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateIntType;
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
 *         &lt;element name="loaded_profiles_count" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="enforce_mode_profiles_count" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="complain_mode_profiles_count" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="processes_with_profiles_count" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="enforce_mode_processes_count" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="complain_mode_processes_count" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="unconfined_processes_with_profiles_count" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
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
    "loadedProfilesCount",
    "enforceModeProfilesCount",
    "complainModeProfilesCount",
    "processesWithProfilesCount",
    "enforceModeProcessesCount",
    "complainModeProcessesCount",
    "unconfinedProcessesWithProfilesCount"
})
public class ApparmorstatusState
    extends StateType
{

    @XmlElement(name = "loaded_profiles_count")
    protected EntityStateIntType loadedProfilesCount;
    @XmlElement(name = "enforce_mode_profiles_count")
    protected EntityStateIntType enforceModeProfilesCount;
    @XmlElement(name = "complain_mode_profiles_count")
    protected EntityStateIntType complainModeProfilesCount;
    @XmlElement(name = "processes_with_profiles_count")
    protected EntityStateIntType processesWithProfilesCount;
    @XmlElement(name = "enforce_mode_processes_count")
    protected EntityStateIntType enforceModeProcessesCount;
    @XmlElement(name = "complain_mode_processes_count")
    protected EntityStateIntType complainModeProcessesCount;
    @XmlElement(name = "unconfined_processes_with_profiles_count")
    protected EntityStateIntType unconfinedProcessesWithProfilesCount;

    /**
     * loadedProfilesCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getLoadedProfilesCount() {
        return loadedProfilesCount;
    }

    /**
     * loadedProfilesCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setLoadedProfilesCount(EntityStateIntType value) {
        this.loadedProfilesCount = value;
    }

    /**
     * enforceModeProfilesCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getEnforceModeProfilesCount() {
        return enforceModeProfilesCount;
    }

    /**
     * enforceModeProfilesCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setEnforceModeProfilesCount(EntityStateIntType value) {
        this.enforceModeProfilesCount = value;
    }

    /**
     * complainModeProfilesCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getComplainModeProfilesCount() {
        return complainModeProfilesCount;
    }

    /**
     * complainModeProfilesCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setComplainModeProfilesCount(EntityStateIntType value) {
        this.complainModeProfilesCount = value;
    }

    /**
     * processesWithProfilesCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getProcessesWithProfilesCount() {
        return processesWithProfilesCount;
    }

    /**
     * processesWithProfilesCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setProcessesWithProfilesCount(EntityStateIntType value) {
        this.processesWithProfilesCount = value;
    }

    /**
     * enforceModeProcessesCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getEnforceModeProcessesCount() {
        return enforceModeProcessesCount;
    }

    /**
     * enforceModeProcessesCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setEnforceModeProcessesCount(EntityStateIntType value) {
        this.enforceModeProcessesCount = value;
    }

    /**
     * complainModeProcessesCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getComplainModeProcessesCount() {
        return complainModeProcessesCount;
    }

    /**
     * complainModeProcessesCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setComplainModeProcessesCount(EntityStateIntType value) {
        this.complainModeProcessesCount = value;
    }

    /**
     * unconfinedProcessesWithProfilesCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getUnconfinedProcessesWithProfilesCount() {
        return unconfinedProcessesWithProfilesCount;
    }

    /**
     * unconfinedProcessesWithProfilesCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setUnconfinedProcessesWithProfilesCount(EntityStateIntType value) {
        this.unconfinedProcessesWithProfilesCount = value;
    }

}
