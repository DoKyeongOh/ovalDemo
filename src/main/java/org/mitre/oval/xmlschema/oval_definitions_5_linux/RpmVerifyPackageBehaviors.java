//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5_linux;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The RpmVerifyPackageBehaviors complex type defines a set of behaviors that for controlling how installed rpms are verified. These behaviors align with the verify-options of the rpm command.
 * 
 * <p>RpmVerifyPackageBehaviors complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="RpmVerifyPackageBehaviors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="nodeps" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="nodigest" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="noscripts" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="nosignature" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RpmVerifyPackageBehaviors")
public class RpmVerifyPackageBehaviors {

    @XmlAttribute(name = "nodeps")
    protected Boolean nodeps;
    @XmlAttribute(name = "nodigest")
    protected Boolean nodigest;
    @XmlAttribute(name = "noscripts")
    protected Boolean noscripts;
    @XmlAttribute(name = "nosignature")
    protected Boolean nosignature;

    /**
     * nodeps 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNodeps() {
        if (nodeps == null) {
            return false;
        } else {
            return nodeps;
        }
    }

    /**
     * nodeps 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNodeps(Boolean value) {
        this.nodeps = value;
    }

    /**
     * nodigest 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNodigest() {
        if (nodigest == null) {
            return false;
        } else {
            return nodigest;
        }
    }

    /**
     * nodigest 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNodigest(Boolean value) {
        this.nodigest = value;
    }

    /**
     * noscripts 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNoscripts() {
        if (noscripts == null) {
            return false;
        } else {
            return noscripts;
        }
    }

    /**
     * noscripts 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoscripts(Boolean value) {
        this.noscripts = value;
    }

    /**
     * nosignature 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNosignature() {
        if (nosignature == null) {
            return false;
        } else {
            return nosignature;
        }
    }

    /**
     * nosignature 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNosignature(Boolean value) {
        this.nosignature = value;
    }

}
