//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_common_5.CheckEnumeration;
import org.mitre.oval.xmlschema.oval_common_5.ExistenceEnumeration;


/**
 * The entity_check and var_check attributes are considered together when evaluating a single state entity. When a variable identifies more than one value and multiple item entities with the same name exist, for a single state entity, a many-to-many comparison must be conducted.  In this situation, there are many values for the state entity that must be compared to many item entities.  Each item entity is compared to the state entity. For each item entity, an interim result is calculated by using the var_check attribute to combine the result of comparing each variable value with a single system value. Then these interim results are combined for each system value using the entity_check attribute.
 * 
 * <p>EntityStateComplexBaseType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="EntityStateComplexBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityComplexBaseType">
 *       &lt;attribute name="entity_check" type="{http://oval.mitre.org/XMLSchema/oval-common-5}CheckEnumeration" default="all" />
 *       &lt;attribute name="check_existence" type="{http://oval.mitre.org/XMLSchema/oval-common-5}ExistenceEnumeration" default="at_least_one_exists" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityStateComplexBaseType")
@XmlSeeAlso({
    EntityStateRecordType.class
})
public abstract class EntityStateComplexBaseType
    extends EntityComplexBaseType
{

    @XmlAttribute(name = "entity_check")
    protected CheckEnumeration entityCheck;
    @XmlAttribute(name = "check_existence")
    protected ExistenceEnumeration checkExistence;

    /**
     * entityCheck 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CheckEnumeration }
     *     
     */
    public CheckEnumeration getEntityCheck() {
        if (entityCheck == null) {
            return CheckEnumeration.ALL;
        } else {
            return entityCheck;
        }
    }

    /**
     * entityCheck 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckEnumeration }
     *     
     */
    public void setEntityCheck(CheckEnumeration value) {
        this.entityCheck = value;
    }

    /**
     * checkExistence 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ExistenceEnumeration }
     *     
     */
    public ExistenceEnumeration getCheckExistence() {
        if (checkExistence == null) {
            return ExistenceEnumeration.AT_LEAST_ONE_EXISTS;
        } else {
            return checkExistence;
        }
    }

    /**
     * checkExistence 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ExistenceEnumeration }
     *     
     */
    public void setCheckExistence(ExistenceEnumeration value) {
        this.checkExistence = value;
    }

}
