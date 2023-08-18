//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5_esx;

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
 *         &lt;element name="patch_name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="knowledge_base_id" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="bundle_id" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="classification" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#esx}EntityStateClassificationType" minOccurs="0"/>
 *         &lt;element name="support_level" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#esx}EntityStateSupportLevelType" minOccurs="0"/>
 *         &lt;element name="status" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
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
    "patchName",
    "knowledgeBaseId",
    "bundleId",
    "classification",
    "supportLevel",
    "status"
})
public class Patch56State
    extends StateType
{

    @XmlElement(name = "patch_name")
    protected EntityStateStringType patchName;
    @XmlElement(name = "knowledge_base_id")
    protected EntityStateIntType knowledgeBaseId;
    @XmlElement(name = "bundle_id")
    protected EntityStateIntType bundleId;
    protected EntityStateClassificationType classification;
    @XmlElement(name = "support_level")
    protected EntityStateSupportLevelType supportLevel;
    protected EntityStateBoolType status;

    /**
     * patchName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getPatchName() {
        return patchName;
    }

    /**
     * patchName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setPatchName(EntityStateStringType value) {
        this.patchName = value;
    }

    /**
     * knowledgeBaseId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getKnowledgeBaseId() {
        return knowledgeBaseId;
    }

    /**
     * knowledgeBaseId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setKnowledgeBaseId(EntityStateIntType value) {
        this.knowledgeBaseId = value;
    }

    /**
     * bundleId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getBundleId() {
        return bundleId;
    }

    /**
     * bundleId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setBundleId(EntityStateIntType value) {
        this.bundleId = value;
    }

    /**
     * classification 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateClassificationType }
     *     
     */
    public EntityStateClassificationType getClassification() {
        return classification;
    }

    /**
     * classification 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateClassificationType }
     *     
     */
    public void setClassification(EntityStateClassificationType value) {
        this.classification = value;
    }

    /**
     * supportLevel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateSupportLevelType }
     *     
     */
    public EntityStateSupportLevelType getSupportLevel() {
        return supportLevel;
    }

    /**
     * supportLevel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateSupportLevelType }
     *     
     */
    public void setSupportLevel(EntityStateSupportLevelType value) {
        this.supportLevel = value;
    }

    /**
     * status 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getStatus() {
        return status;
    }

    /**
     * status 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setStatus(EntityStateBoolType value) {
        this.status = value;
    }

}
