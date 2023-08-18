//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5_sharepoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateBoolType;
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
 *         &lt;element name="farmname" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="eventseverity" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint}EntityStateEventSeverityType" minOccurs="0"/>
 *         &lt;element name="hidden" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="levelid" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="levelname" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="traceseverity" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint}EntityStateTraceSeverityType" minOccurs="0"/>
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
    "farmname",
    "eventseverity",
    "hidden",
    "levelid",
    "levelname",
    "traceseverity"
})
public class SpdiagnosticslevelState
    extends StateType
{

    protected EntityStateStringType farmname;
    protected EntityStateEventSeverityType eventseverity;
    protected EntityStateBoolType hidden;
    protected EntityStateStringType levelid;
    protected EntityStateStringType levelname;
    protected EntityStateTraceSeverityType traceseverity;

    /**
     * farmname 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getFarmname() {
        return farmname;
    }

    /**
     * farmname 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setFarmname(EntityStateStringType value) {
        this.farmname = value;
    }

    /**
     * eventseverity 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateEventSeverityType }
     *     
     */
    public EntityStateEventSeverityType getEventseverity() {
        return eventseverity;
    }

    /**
     * eventseverity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateEventSeverityType }
     *     
     */
    public void setEventseverity(EntityStateEventSeverityType value) {
        this.eventseverity = value;
    }

    /**
     * hidden 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getHidden() {
        return hidden;
    }

    /**
     * hidden 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setHidden(EntityStateBoolType value) {
        this.hidden = value;
    }

    /**
     * levelid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getLevelid() {
        return levelid;
    }

    /**
     * levelid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setLevelid(EntityStateStringType value) {
        this.levelid = value;
    }

    /**
     * levelname 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getLevelname() {
        return levelname;
    }

    /**
     * levelname 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setLevelname(EntityStateStringType value) {
        this.levelname = value;
    }

    /**
     * traceseverity 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateTraceSeverityType }
     *     
     */
    public EntityStateTraceSeverityType getTraceseverity() {
        return traceseverity;
    }

    /**
     * traceseverity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateTraceSeverityType }
     *     
     */
    public void setTraceseverity(EntityStateTraceSeverityType value) {
        this.traceseverity = value;
    }

}
