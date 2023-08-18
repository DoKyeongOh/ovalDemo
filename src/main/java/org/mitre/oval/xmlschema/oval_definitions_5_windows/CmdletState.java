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
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateRecordType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateVersionType;
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
 *         &lt;element name="module_name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="module_id" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateGUIDType" minOccurs="0"/>
 *         &lt;element name="module_version" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateVersionType" minOccurs="0"/>
 *         &lt;element name="verb" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateCmdletVerbType" minOccurs="0"/>
 *         &lt;element name="noun" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="parameters" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateRecordType" minOccurs="0"/>
 *         &lt;element name="select" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateRecordType" minOccurs="0"/>
 *         &lt;element name="value" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateRecordType" minOccurs="0"/>
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
    "moduleName",
    "moduleId",
    "moduleVersion",
    "verb",
    "noun",
    "parameters",
    "select",
    "value"
})
public class CmdletState
    extends StateType
{

    @XmlElement(name = "module_name")
    protected EntityStateStringType moduleName;
    @XmlElement(name = "module_id")
    protected EntityStateGUIDType moduleId;
    @XmlElement(name = "module_version")
    protected EntityStateVersionType moduleVersion;
    protected EntityStateCmdletVerbType verb;
    protected EntityStateStringType noun;
    protected EntityStateRecordType parameters;
    protected EntityStateRecordType select;
    protected EntityStateRecordType value;

    /**
     * moduleName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getModuleName() {
        return moduleName;
    }

    /**
     * moduleName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setModuleName(EntityStateStringType value) {
        this.moduleName = value;
    }

    /**
     * moduleId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateGUIDType }
     *     
     */
    public EntityStateGUIDType getModuleId() {
        return moduleId;
    }

    /**
     * moduleId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateGUIDType }
     *     
     */
    public void setModuleId(EntityStateGUIDType value) {
        this.moduleId = value;
    }

    /**
     * moduleVersion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateVersionType }
     *     
     */
    public EntityStateVersionType getModuleVersion() {
        return moduleVersion;
    }

    /**
     * moduleVersion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateVersionType }
     *     
     */
    public void setModuleVersion(EntityStateVersionType value) {
        this.moduleVersion = value;
    }

    /**
     * verb 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateCmdletVerbType }
     *     
     */
    public EntityStateCmdletVerbType getVerb() {
        return verb;
    }

    /**
     * verb 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateCmdletVerbType }
     *     
     */
    public void setVerb(EntityStateCmdletVerbType value) {
        this.verb = value;
    }

    /**
     * noun 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getNoun() {
        return noun;
    }

    /**
     * noun 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setNoun(EntityStateStringType value) {
        this.noun = value;
    }

    /**
     * parameters 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateRecordType }
     *     
     */
    public EntityStateRecordType getParameters() {
        return parameters;
    }

    /**
     * parameters 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateRecordType }
     *     
     */
    public void setParameters(EntityStateRecordType value) {
        this.parameters = value;
    }

    /**
     * select 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateRecordType }
     *     
     */
    public EntityStateRecordType getSelect() {
        return select;
    }

    /**
     * select 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateRecordType }
     *     
     */
    public void setSelect(EntityStateRecordType value) {
        this.select = value;
    }

    /**
     * value 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateRecordType }
     *     
     */
    public EntityStateRecordType getValue() {
        return value;
    }

    /**
     * value 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateRecordType }
     *     
     */
    public void setValue(EntityStateRecordType value) {
        this.value = value;
    }

}
