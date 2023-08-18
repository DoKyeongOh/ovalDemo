//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5_ios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateIOSVersionType;
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
 *         &lt;element name="major_release" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="train_number" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="train_identifier" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#ios}EntityStateTrainIdentifierType" minOccurs="0"/>
 *         &lt;element name="version_string" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIOSVersionType" minOccurs="0"/>
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
    "trainIdentifier",
    "versionString"
})
public class VersionState
    extends StateType
{

    @XmlElement(name = "major_release")
    protected EntityStateStringType majorRelease;
    @XmlElement(name = "train_number")
    protected EntityStateStringType trainNumber;
    @XmlElement(name = "train_identifier")
    protected EntityStateTrainIdentifierType trainIdentifier;
    @XmlElement(name = "version_string")
    protected EntityStateIOSVersionType versionString;

    /**
     * majorRelease 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getMajorRelease() {
        return majorRelease;
    }

    /**
     * majorRelease 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setMajorRelease(EntityStateStringType value) {
        this.majorRelease = value;
    }

    /**
     * trainNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getTrainNumber() {
        return trainNumber;
    }

    /**
     * trainNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setTrainNumber(EntityStateStringType value) {
        this.trainNumber = value;
    }

    /**
     * trainIdentifier 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateTrainIdentifierType }
     *     
     */
    public EntityStateTrainIdentifierType getTrainIdentifier() {
        return trainIdentifier;
    }

    /**
     * trainIdentifier 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateTrainIdentifierType }
     *     
     */
    public void setTrainIdentifier(EntityStateTrainIdentifierType value) {
        this.trainIdentifier = value;
    }

    /**
     * versionString 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIOSVersionType }
     *     
     */
    public EntityStateIOSVersionType getVersionString() {
        return versionString;
    }

    /**
     * versionString 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIOSVersionType }
     *     
     */
    public void setVersionString(EntityStateIOSVersionType value) {
        this.versionString = value;
    }

}
