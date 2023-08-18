//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5_windows;

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
 *         &lt;element name="service_name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="display_name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="description" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="service_type" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateServiceTypeType" minOccurs="0"/>
 *         &lt;element name="start_type" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateServiceStartTypeType" minOccurs="0"/>
 *         &lt;element name="current_state" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateServiceCurrentStateType" minOccurs="0"/>
 *         &lt;element name="controls_accepted" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateServiceControlsAcceptedType" minOccurs="0"/>
 *         &lt;element name="start_name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="path" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="pid" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="service_flag" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="dependencies" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
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
    "serviceName",
    "displayName",
    "description",
    "serviceType",
    "startType",
    "currentState",
    "controlsAccepted",
    "startName",
    "path",
    "pid",
    "serviceFlag",
    "dependencies"
})
public class ServiceState
    extends StateType
{

    @XmlElement(name = "service_name")
    protected EntityStateStringType serviceName;
    @XmlElement(name = "display_name")
    protected EntityStateStringType displayName;
    protected EntityStateStringType description;
    @XmlElement(name = "service_type")
    protected EntityStateServiceTypeType serviceType;
    @XmlElement(name = "start_type")
    protected EntityStateServiceStartTypeType startType;
    @XmlElement(name = "current_state")
    protected EntityStateServiceCurrentStateType currentState;
    @XmlElement(name = "controls_accepted")
    protected EntityStateServiceControlsAcceptedType controlsAccepted;
    @XmlElement(name = "start_name")
    protected EntityStateStringType startName;
    protected EntityStateStringType path;
    protected EntityStateIntType pid;
    @XmlElement(name = "service_flag")
    protected EntityStateBoolType serviceFlag;
    protected EntityStateStringType dependencies;

    /**
     * serviceName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getServiceName() {
        return serviceName;
    }

    /**
     * serviceName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setServiceName(EntityStateStringType value) {
        this.serviceName = value;
    }

    /**
     * displayName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getDisplayName() {
        return displayName;
    }

    /**
     * displayName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setDisplayName(EntityStateStringType value) {
        this.displayName = value;
    }

    /**
     * description 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getDescription() {
        return description;
    }

    /**
     * description 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setDescription(EntityStateStringType value) {
        this.description = value;
    }

    /**
     * serviceType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateServiceTypeType }
     *     
     */
    public EntityStateServiceTypeType getServiceType() {
        return serviceType;
    }

    /**
     * serviceType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateServiceTypeType }
     *     
     */
    public void setServiceType(EntityStateServiceTypeType value) {
        this.serviceType = value;
    }

    /**
     * startType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateServiceStartTypeType }
     *     
     */
    public EntityStateServiceStartTypeType getStartType() {
        return startType;
    }

    /**
     * startType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateServiceStartTypeType }
     *     
     */
    public void setStartType(EntityStateServiceStartTypeType value) {
        this.startType = value;
    }

    /**
     * currentState 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateServiceCurrentStateType }
     *     
     */
    public EntityStateServiceCurrentStateType getCurrentState() {
        return currentState;
    }

    /**
     * currentState 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateServiceCurrentStateType }
     *     
     */
    public void setCurrentState(EntityStateServiceCurrentStateType value) {
        this.currentState = value;
    }

    /**
     * controlsAccepted 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateServiceControlsAcceptedType }
     *     
     */
    public EntityStateServiceControlsAcceptedType getControlsAccepted() {
        return controlsAccepted;
    }

    /**
     * controlsAccepted 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateServiceControlsAcceptedType }
     *     
     */
    public void setControlsAccepted(EntityStateServiceControlsAcceptedType value) {
        this.controlsAccepted = value;
    }

    /**
     * startName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getStartName() {
        return startName;
    }

    /**
     * startName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setStartName(EntityStateStringType value) {
        this.startName = value;
    }

    /**
     * path 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getPath() {
        return path;
    }

    /**
     * path 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setPath(EntityStateStringType value) {
        this.path = value;
    }

    /**
     * pid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getPid() {
        return pid;
    }

    /**
     * pid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setPid(EntityStateIntType value) {
        this.pid = value;
    }

    /**
     * serviceFlag 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getServiceFlag() {
        return serviceFlag;
    }

    /**
     * serviceFlag 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setServiceFlag(EntityStateBoolType value) {
        this.serviceFlag = value;
    }

    /**
     * dependencies 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getDependencies() {
        return dependencies;
    }

    /**
     * dependencies 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setDependencies(EntityStateStringType value) {
        this.dependencies = value;
    }

}
