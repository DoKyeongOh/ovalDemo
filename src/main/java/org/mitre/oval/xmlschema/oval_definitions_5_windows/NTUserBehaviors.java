//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5_windows;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The NTUserBehaviors complex type defines a number of behaviors that allow a more detailed definition of the ntuser_object being specified. Note that using these
 *                         behaviors may result in some unique results. For example, a double negative type condition might be created where an object entity says include everything except a specific
 *                         item, but a behavior is used that might then add that item back in.
 * 
 * <p>NTUserBehaviors complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="NTUserBehaviors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="include_default" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="max_depth" default="-1">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;fractionDigits value="0"/>
 *             &lt;minInclusive value="-1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="recurse_direction" default="none">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="none"/>
 *             &lt;enumeration value="up"/>
 *             &lt;enumeration value="down"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="windows_view" default="64_bit">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="32_bit"/>
 *             &lt;enumeration value="64_bit"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NTUserBehaviors")
public class NTUserBehaviors {

    @XmlAttribute(name = "include_default")
    protected Boolean includeDefault;
    @XmlAttribute(name = "max_depth")
    protected BigInteger maxDepth;
    @XmlAttribute(name = "recurse_direction")
    protected String recurseDirection;
    @XmlAttribute(name = "windows_view")
    protected String windowsView;

    /**
     * includeDefault 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIncludeDefault() {
        if (includeDefault == null) {
            return false;
        } else {
            return includeDefault;
        }
    }

    /**
     * includeDefault 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeDefault(Boolean value) {
        this.includeDefault = value;
    }

    /**
     * maxDepth 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxDepth() {
        if (maxDepth == null) {
            return new BigInteger("-1");
        } else {
            return maxDepth;
        }
    }

    /**
     * maxDepth 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxDepth(BigInteger value) {
        this.maxDepth = value;
    }

    /**
     * recurseDirection 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurseDirection() {
        if (recurseDirection == null) {
            return "none";
        } else {
            return recurseDirection;
        }
    }

    /**
     * recurseDirection 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurseDirection(String value) {
        this.recurseDirection = value;
    }

    /**
     * windowsView 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindowsView() {
        if (windowsView == null) {
            return "64_bit";
        } else {
            return windowsView;
        }
    }

    /**
     * windowsView 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindowsView(String value) {
        this.windowsView = value;
    }

}
