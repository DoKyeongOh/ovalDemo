//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_unix;

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
 *         &lt;element name="protocol" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="service_name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="server_program" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="server_arguments" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="endpoint_type" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix}EntityItemEndpointType" minOccurs="0"/>
 *         &lt;element name="exec_as_user" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="wait_status" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix}EntityItemWaitStatusType" minOccurs="0"/>
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
    "protocol",
    "serviceName",
    "serverProgram",
    "serverArguments",
    "endpointType",
    "execAsUser",
    "waitStatus"
})
public class InetdItem
    extends ItemType
{

    protected EntityItemStringType protocol;
    @XmlElement(name = "service_name")
    protected EntityItemStringType serviceName;
    @XmlElement(name = "server_program")
    protected EntityItemStringType serverProgram;
    @XmlElement(name = "server_arguments")
    protected EntityItemStringType serverArguments;
    @XmlElement(name = "endpoint_type")
    protected EntityItemEndpointType endpointType;
    @XmlElement(name = "exec_as_user")
    protected EntityItemStringType execAsUser;
    @XmlElement(name = "wait_status")
    protected EntityItemWaitStatusType waitStatus;

    /**
     * protocol 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getProtocol() {
        return protocol;
    }

    /**
     * protocol 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setProtocol(EntityItemStringType value) {
        this.protocol = value;
    }

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
     * serverProgram 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getServerProgram() {
        return serverProgram;
    }

    /**
     * serverProgram 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setServerProgram(EntityItemStringType value) {
        this.serverProgram = value;
    }

    /**
     * serverArguments 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getServerArguments() {
        return serverArguments;
    }

    /**
     * serverArguments 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setServerArguments(EntityItemStringType value) {
        this.serverArguments = value;
    }

    /**
     * endpointType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemEndpointType }
     *     
     */
    public EntityItemEndpointType getEndpointType() {
        return endpointType;
    }

    /**
     * endpointType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemEndpointType }
     *     
     */
    public void setEndpointType(EntityItemEndpointType value) {
        this.endpointType = value;
    }

    /**
     * execAsUser 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getExecAsUser() {
        return execAsUser;
    }

    /**
     * execAsUser 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setExecAsUser(EntityItemStringType value) {
        this.execAsUser = value;
    }

    /**
     * waitStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemWaitStatusType }
     *     
     */
    public EntityItemWaitStatusType getWaitStatus() {
        return waitStatus;
    }

    /**
     * waitStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemWaitStatusType }
     *     
     */
    public void setWaitStatus(EntityItemWaitStatusType value) {
        this.waitStatus = value;
    }

}
