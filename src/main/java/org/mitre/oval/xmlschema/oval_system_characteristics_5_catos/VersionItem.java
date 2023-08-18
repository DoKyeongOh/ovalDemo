//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_catos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemIntType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemVersionType;
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
 *         &lt;element name="switch_series" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="image_name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="catos_release" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemVersionType" minOccurs="0"/>
 *         &lt;element name="catos_major_release" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemVersionType" minOccurs="0"/>
 *         &lt;element name="catos_individual_release" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="catos_version_id" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
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
    "switchSeries",
    "imageName",
    "catosRelease",
    "catosMajorRelease",
    "catosIndividualRelease",
    "catosVersionId"
})
public class VersionItem
    extends ItemType
{

    @XmlElement(name = "switch_series", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#catos")
    protected EntityItemStringType switchSeries;
    @XmlElement(name = "image_name", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#catos")
    protected EntityItemStringType imageName;
    @XmlElement(name = "catos_release", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#catos")
    protected EntityItemVersionType catosRelease;
    @XmlElement(name = "catos_major_release", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#catos")
    protected EntityItemVersionType catosMajorRelease;
    @XmlElement(name = "catos_individual_release", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#catos")
    protected EntityItemIntType catosIndividualRelease;
    @XmlElement(name = "catos_version_id", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#catos")
    protected EntityItemStringType catosVersionId;

    /**
     * switchSeries 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getSwitchSeries() {
        return switchSeries;
    }

    /**
     * switchSeries 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setSwitchSeries(EntityItemStringType value) {
        this.switchSeries = value;
    }

    /**
     * imageName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getImageName() {
        return imageName;
    }

    /**
     * imageName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setImageName(EntityItemStringType value) {
        this.imageName = value;
    }

    /**
     * catosRelease 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemVersionType }
     *     
     */
    public EntityItemVersionType getCatosRelease() {
        return catosRelease;
    }

    /**
     * catosRelease 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemVersionType }
     *     
     */
    public void setCatosRelease(EntityItemVersionType value) {
        this.catosRelease = value;
    }

    /**
     * catosMajorRelease 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemVersionType }
     *     
     */
    public EntityItemVersionType getCatosMajorRelease() {
        return catosMajorRelease;
    }

    /**
     * catosMajorRelease 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemVersionType }
     *     
     */
    public void setCatosMajorRelease(EntityItemVersionType value) {
        this.catosMajorRelease = value;
    }

    /**
     * catosIndividualRelease 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getCatosIndividualRelease() {
        return catosIndividualRelease;
    }

    /**
     * catosIndividualRelease 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setCatosIndividualRelease(EntityItemIntType value) {
        this.catosIndividualRelease = value;
    }

    /**
     * catosVersionId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getCatosVersionId() {
        return catosVersionId;
    }

    /**
     * catosVersionId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setCatosVersionId(EntityItemStringType value) {
        this.catosVersionId = value;
    }

}
