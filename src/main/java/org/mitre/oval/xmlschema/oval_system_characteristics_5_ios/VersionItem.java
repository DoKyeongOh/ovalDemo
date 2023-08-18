//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_ios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemIOSVersionType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemIntType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;
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
 *         &lt;element name="major_release" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="train_number" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="major_version" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="minor_version" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="release" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="train_identifier" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="rebuild" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="subrebuild" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="mainline_rebuild" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="version_string" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIOSVersionType" minOccurs="0"/>
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
    "majorRelease",
    "trainNumber",
    "majorVersion",
    "minorVersion",
    "release",
    "trainIdentifier",
    "rebuild",
    "subrebuild",
    "mainlineRebuild",
    "versionString"
})
public class VersionItem
    extends ItemType
{

    @XmlElement(name = "major_release")
    protected EntityItemStringType majorRelease;
    @XmlElement(name = "train_number")
    protected EntityItemStringType trainNumber;
    @XmlElement(name = "major_version")
    protected EntityItemIntType majorVersion;
    @XmlElement(name = "minor_version")
    protected EntityItemIntType minorVersion;
    protected EntityItemIntType release;
    @XmlElement(name = "train_identifier")
    protected EntityItemStringType trainIdentifier;
    protected EntityItemIntType rebuild;
    protected EntityItemStringType subrebuild;
    @XmlElement(name = "mainline_rebuild")
    protected EntityItemStringType mainlineRebuild;
    @XmlElement(name = "version_string")
    protected EntityItemIOSVersionType versionString;

    /**
     * majorRelease 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getMajorRelease() {
        return majorRelease;
    }

    /**
     * majorRelease 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setMajorRelease(EntityItemStringType value) {
        this.majorRelease = value;
    }

    /**
     * trainNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getTrainNumber() {
        return trainNumber;
    }

    /**
     * trainNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setTrainNumber(EntityItemStringType value) {
        this.trainNumber = value;
    }

    /**
     * majorVersion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMajorVersion() {
        return majorVersion;
    }

    /**
     * majorVersion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMajorVersion(EntityItemIntType value) {
        this.majorVersion = value;
    }

    /**
     * minorVersion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMinorVersion() {
        return minorVersion;
    }

    /**
     * minorVersion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMinorVersion(EntityItemIntType value) {
        this.minorVersion = value;
    }

    /**
     * release 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getRelease() {
        return release;
    }

    /**
     * release 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setRelease(EntityItemIntType value) {
        this.release = value;
    }

    /**
     * trainIdentifier 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getTrainIdentifier() {
        return trainIdentifier;
    }

    /**
     * trainIdentifier 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setTrainIdentifier(EntityItemStringType value) {
        this.trainIdentifier = value;
    }

    /**
     * rebuild 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getRebuild() {
        return rebuild;
    }

    /**
     * rebuild 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setRebuild(EntityItemIntType value) {
        this.rebuild = value;
    }

    /**
     * subrebuild 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getSubrebuild() {
        return subrebuild;
    }

    /**
     * subrebuild 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setSubrebuild(EntityItemStringType value) {
        this.subrebuild = value;
    }

    /**
     * mainlineRebuild 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getMainlineRebuild() {
        return mainlineRebuild;
    }

    /**
     * mainlineRebuild 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setMainlineRebuild(EntityItemStringType value) {
        this.mainlineRebuild = value;
    }

    /**
     * versionString 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIOSVersionType }
     *     
     */
    public EntityItemIOSVersionType getVersionString() {
        return versionString;
    }

    /**
     * versionString 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIOSVersionType }
     *     
     */
    public void setVersionString(EntityItemIOSVersionType value) {
        this.versionString = value;
    }

}
