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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.mitre.oval.xmlschema.oval_common_5.CheckEnumeration;
import org.mitre.oval.xmlschema.oval_common_5.OperationEnumeration;


/**
 * Note that when the mask attribute is set to 'true' on a field's parent element the field must be masked regardless of the field's mask attribute value.
 * 
 * <p>EntityObjectFieldType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="EntityObjectFieldType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anySimpleType">
 *       &lt;attGroup ref="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityAttributeGroup"/>
 *       &lt;attribute name="name" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[^A-Z]+"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="entity_check" type="{http://oval.mitre.org/XMLSchema/oval-common-5}CheckEnumeration" default="all" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityObjectFieldType", propOrder = {
    "value"
})
public class EntityObjectFieldType {

    @XmlValue
    @XmlSchemaType(name = "anySimpleType")
    protected Object value;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "entity_check")
    protected CheckEnumeration entityCheck;
    @XmlAttribute(name = "datatype")
    protected String datatype;
    @XmlAttribute(name = "operation")
    protected OperationEnumeration operation;
    @XmlAttribute(name = "mask")
    protected Boolean mask;
    @XmlAttribute(name = "var_ref")
    protected String varRef;
    @XmlAttribute(name = "var_check")
    protected CheckEnumeration varCheck;

    /**
     * value 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getValue() {
        return value;
    }

    /**
     * value 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setValue(Object value) {
        this.value = value;
    }

    /**
     * name 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * name 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

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
     * datatype 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatatype() {
        if (datatype == null) {
            return "string";
        } else {
            return datatype;
        }
    }

    /**
     * datatype 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatatype(String value) {
        this.datatype = value;
    }

    /**
     * operation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OperationEnumeration }
     *     
     */
    public OperationEnumeration getOperation() {
        if (operation == null) {
            return OperationEnumeration.EQUALS;
        } else {
            return operation;
        }
    }

    /**
     * operation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationEnumeration }
     *     
     */
    public void setOperation(OperationEnumeration value) {
        this.operation = value;
    }

    /**
     * mask 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMask() {
        if (mask == null) {
            return false;
        } else {
            return mask;
        }
    }

    /**
     * mask 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMask(Boolean value) {
        this.mask = value;
    }

    /**
     * varRef 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVarRef() {
        return varRef;
    }

    /**
     * varRef 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVarRef(String value) {
        this.varRef = value;
    }

    /**
     * varCheck 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CheckEnumeration }
     *     
     */
    public CheckEnumeration getVarCheck() {
        return varCheck;
    }

    /**
     * varCheck 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckEnumeration }
     *     
     */
    public void setVarCheck(CheckEnumeration value) {
        this.varCheck = value;
    }

}
