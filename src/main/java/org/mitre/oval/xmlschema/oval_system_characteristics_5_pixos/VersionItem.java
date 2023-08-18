//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_pixos;

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
 *         &lt;element name="pix_release" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="pix_major_release" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemVersionType" minOccurs="0"/>
 *         &lt;element name="pix_minor_release" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemVersionType" minOccurs="0"/>
 *         &lt;element name="pix_build" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
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
    "pixRelease",
    "pixMajorRelease",
    "pixMinorRelease",
    "pixBuild"
})
public class VersionItem
    extends ItemType
{

    @XmlElement(name = "pix_release", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#pixos")
    protected EntityItemStringType pixRelease;
    @XmlElement(name = "pix_major_release", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#pixos")
    protected EntityItemVersionType pixMajorRelease;
    @XmlElement(name = "pix_minor_release", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#pixos")
    protected EntityItemVersionType pixMinorRelease;
    @XmlElement(name = "pix_build", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#pixos")
    protected EntityItemIntType pixBuild;

    /**
     * pixRelease 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getPixRelease() {
        return pixRelease;
    }

    /**
     * pixRelease 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setPixRelease(EntityItemStringType value) {
        this.pixRelease = value;
    }

    /**
     * pixMajorRelease 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemVersionType }
     *     
     */
    public EntityItemVersionType getPixMajorRelease() {
        return pixMajorRelease;
    }

    /**
     * pixMajorRelease 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemVersionType }
     *     
     */
    public void setPixMajorRelease(EntityItemVersionType value) {
        this.pixMajorRelease = value;
    }

    /**
     * pixMinorRelease 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemVersionType }
     *     
     */
    public EntityItemVersionType getPixMinorRelease() {
        return pixMinorRelease;
    }

    /**
     * pixMinorRelease 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemVersionType }
     *     
     */
    public void setPixMinorRelease(EntityItemVersionType value) {
        this.pixMinorRelease = value;
    }

    /**
     * pixBuild 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getPixBuild() {
        return pixBuild;
    }

    /**
     * pixBuild 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setPixBuild(EntityItemIntType value) {
        this.pixBuild = value;
    }

}
