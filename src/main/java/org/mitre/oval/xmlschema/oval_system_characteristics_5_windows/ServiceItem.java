//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_windows;

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
 *         &lt;element name="service_name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="display_name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="description" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="service_type" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemServiceTypeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="start_type" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemServiceStartTypeType" minOccurs="0"/>
 *         &lt;element name="current_state" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemServiceCurrentStateType" minOccurs="0"/>
 *         &lt;element name="controls_accepted" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemServiceControlsAcceptedType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="start_name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="path" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="pid" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="service_flag" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="dependencies" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" maxOccurs="unbounded" minOccurs="0"/>
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
public class ServiceItem
    extends ItemType
{

    @XmlElement(name = "service_name")
    protected EntityItemStringType serviceName;
    @XmlElement(name = "display_name")
    protected EntityItemStringType displayName;
    protected EntityItemStringType description;
    @XmlElement(name = "service_type")
    protected List<EntityItemServiceTypeType> serviceType;
    @XmlElement(name = "start_type")
    protected EntityItemServiceStartTypeType startType;
    @XmlElement(name = "current_state")
    protected EntityItemServiceCurrentStateType currentState;
    @XmlElement(name = "controls_accepted")
    protected List<EntityItemServiceControlsAcceptedType> controlsAccepted;
    @XmlElement(name = "start_name")
    protected EntityItemStringType startName;
    protected EntityItemStringType path;
    protected EntityItemIntType pid;
    @XmlElement(name = "service_flag")
    protected EntityItemBoolType serviceFlag;
    protected List<EntityItemStringType> dependencies;

    /**
     * serviceName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getServiceName() {
        return serviceName;
    }

    /**
     * serviceName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setServiceName(EntityItemStringType value) {
        this.serviceName = value;
    }

    /**
     * displayName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getDisplayName() {
        return displayName;
    }

    /**
     * displayName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setDisplayName(EntityItemStringType value) {
        this.displayName = value;
    }

    /**
     * description 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getDescription() {
        return description;
    }

    /**
     * description 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setDescription(EntityItemStringType value) {
        this.description = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemServiceTypeType }
     * 
     * 
     */
    public List<EntityItemServiceTypeType> getServiceType() {
        if (serviceType == null) {
            serviceType = new ArrayList<EntityItemServiceTypeType>();
        }
        return this.serviceType;
    }

    /**
     * startType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemServiceStartTypeType }
     *     
     */
    public EntityItemServiceStartTypeType getStartType() {
        return startType;
    }

    /**
     * startType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemServiceStartTypeType }
     *     
     */
    public void setStartType(EntityItemServiceStartTypeType value) {
        this.startType = value;
    }

    /**
     * currentState 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemServiceCurrentStateType }
     *     
     */
    public EntityItemServiceCurrentStateType getCurrentState() {
        return currentState;
    }

    /**
     * currentState 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemServiceCurrentStateType }
     *     
     */
    public void setCurrentState(EntityItemServiceCurrentStateType value) {
        this.currentState = value;
    }

    /**
     * Gets the value of the controlsAccepted property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controlsAccepted property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControlsAccepted().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemServiceControlsAcceptedType }
     * 
     * 
     */
    public List<EntityItemServiceControlsAcceptedType> getControlsAccepted() {
        if (controlsAccepted == null) {
            controlsAccepted = new ArrayList<EntityItemServiceControlsAcceptedType>();
        }
        return this.controlsAccepted;
    }

    /**
     * startName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getStartName() {
        return startName;
    }

    /**
     * startName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setStartName(EntityItemStringType value) {
        this.startName = value;
    }

    /**
     * path 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getPath() {
        return path;
    }

    /**
     * path 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setPath(EntityItemStringType value) {
        this.path = value;
    }

    /**
     * pid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getPid() {
        return pid;
    }

    /**
     * pid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setPid(EntityItemIntType value) {
        this.pid = value;
    }

    /**
     * serviceFlag 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getServiceFlag() {
        return serviceFlag;
    }

    /**
     * serviceFlag 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setServiceFlag(EntityItemBoolType value) {
        this.serviceFlag = value;
    }

    /**
     * Gets the value of the dependencies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dependencies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDependencies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemStringType }
     * 
     * 
     */
    public List<EntityItemStringType> getDependencies() {
        if (dependencies == null) {
            dependencies = new ArrayList<EntityItemStringType>();
        }
        return this.dependencies;
    }

}
