//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5_esx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The ViSdkManagedEntityBehaviors complex type defines a number of behaviors that allow a more detailed definition of the visdkmanagedobject_object being specified.  Note that using these behaviors is *highly* encouraged because enumerating all Managed Objects in an inventory hierarchy could cause performance problems.  Interpreters should enumerate only the entities specified by the behavior prior to set/filter logic and evaluation.
 * 
 * <p>ViSdkManagedEntityBehaviors complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ViSdkManagedEntityBehaviors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="managed_entity_type" default="VirtualMachine">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="ClusterComputerResource"/>
 *             &lt;enumeration value="ComputeResource"/>
 *             &lt;enumeration value="Datacenter"/>
 *             &lt;enumeration value="Datastore"/>
 *             &lt;enumeration value="DistributedVirtualPortgroup"/>
 *             &lt;enumeration value="DistributedVirtualSwitch"/>
 *             &lt;enumeration value="Folder"/>
 *             &lt;enumeration value="HostSystem"/>
 *             &lt;enumeration value="Network"/>
 *             &lt;enumeration value="ResourcePool"/>
 *             &lt;enumeration value="VirtualApp"/>
 *             &lt;enumeration value="VirtualMachine"/>
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
@XmlType(name = "ViSdkManagedEntityBehaviors")
public class ViSdkManagedEntityBehaviors {

    @XmlAttribute(name = "managed_entity_type")
    protected String managedEntityType;

    /**
     * managedEntityType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagedEntityType() {
        if (managedEntityType == null) {
            return "VirtualMachine";
        } else {
            return managedEntityType;
        }
    }

    /**
     * managedEntityType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagedEntityType(String value) {
        this.managedEntityType = value;
    }

}
