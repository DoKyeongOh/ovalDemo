//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5_unix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="protocol" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="service_name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="server_program" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="server_arguments" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="endpoint_type" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#unix}EntityStateEndpointType" minOccurs="0"/>
 *         &lt;element name="exec_as_user" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="wait_status" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#unix}EntityStateWaitStatusType" minOccurs="0"/>
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
public class InetdState
    extends StateType
{

    protected EntityStateStringType protocol;
    @XmlElement(name = "service_name")
    protected EntityStateStringType serviceName;
    @XmlElement(name = "server_program")
    protected EntityStateStringType serverProgram;
    @XmlElement(name = "server_arguments")
    protected EntityStateStringType serverArguments;
    @XmlElement(name = "endpoint_type")
    protected EntityStateEndpointType endpointType;
    @XmlElement(name = "exec_as_user")
    protected EntityStateStringType execAsUser;
    @XmlElement(name = "wait_status")
    protected EntityStateWaitStatusType waitStatus;

    /**
     * protocol 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getProtocol() {
        return protocol;
    }

    /**
     * protocol 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setProtocol(EntityStateStringType value) {
        this.protocol = value;
    }

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
     * serverProgram 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getServerProgram() {
        return serverProgram;
    }

    /**
     * serverProgram 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setServerProgram(EntityStateStringType value) {
        this.serverProgram = value;
    }

    /**
     * serverArguments 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getServerArguments() {
        return serverArguments;
    }

    /**
     * serverArguments 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setServerArguments(EntityStateStringType value) {
        this.serverArguments = value;
    }

    /**
     * endpointType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateEndpointType }
     *     
     */
    public EntityStateEndpointType getEndpointType() {
        return endpointType;
    }

    /**
     * endpointType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateEndpointType }
     *     
     */
    public void setEndpointType(EntityStateEndpointType value) {
        this.endpointType = value;
    }

    /**
     * execAsUser 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getExecAsUser() {
        return execAsUser;
    }

    /**
     * execAsUser 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setExecAsUser(EntityStateStringType value) {
        this.execAsUser = value;
    }

    /**
     * waitStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateWaitStatusType }
     *     
     */
    public EntityStateWaitStatusType getWaitStatus() {
        return waitStatus;
    }

    /**
     * waitStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateWaitStatusType }
     *     
     */
    public void setWaitStatus(EntityStateWaitStatusType value) {
        this.waitStatus = value;
    }

}
