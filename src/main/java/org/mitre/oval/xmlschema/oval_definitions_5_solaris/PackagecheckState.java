//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5_solaris;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="pkginst" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="filepath" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="checksum_differs" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="size_differs" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="mtime_differs" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="uread" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris}EntityStatePermissionCompareType" minOccurs="0"/>
 *         &lt;element name="uwrite" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris}EntityStatePermissionCompareType" minOccurs="0"/>
 *         &lt;element name="uexec" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris}EntityStatePermissionCompareType" minOccurs="0"/>
 *         &lt;element name="gread" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris}EntityStatePermissionCompareType" minOccurs="0"/>
 *         &lt;element name="gwrite" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris}EntityStatePermissionCompareType" minOccurs="0"/>
 *         &lt;element name="gexec" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris}EntityStatePermissionCompareType" minOccurs="0"/>
 *         &lt;element name="oread" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris}EntityStatePermissionCompareType" minOccurs="0"/>
 *         &lt;element name="owrite" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris}EntityStatePermissionCompareType" minOccurs="0"/>
 *         &lt;element name="oexec" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris}EntityStatePermissionCompareType" minOccurs="0"/>
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
    "pkginst",
    "filepath",
    "checksumDiffers",
    "sizeDiffers",
    "mtimeDiffers",
    "uread",
    "uwrite",
    "uexec",
    "gread",
    "gwrite",
    "gexec",
    "oread",
    "owrite",
    "oexec"
})
public class PackagecheckState
    extends StateType
{

    protected EntityStateStringType pkginst;
    protected EntityStateStringType filepath;
    @XmlElement(name = "checksum_differs")
    protected EntityStateBoolType checksumDiffers;
    @XmlElement(name = "size_differs")
    protected EntityStateBoolType sizeDiffers;
    @XmlElement(name = "mtime_differs")
    protected EntityStateBoolType mtimeDiffers;
    protected EntityStatePermissionCompareType uread;
    protected EntityStatePermissionCompareType uwrite;
    protected EntityStatePermissionCompareType uexec;
    protected EntityStatePermissionCompareType gread;
    protected EntityStatePermissionCompareType gwrite;
    protected EntityStatePermissionCompareType gexec;
    protected EntityStatePermissionCompareType oread;
    protected EntityStatePermissionCompareType owrite;
    protected EntityStatePermissionCompareType oexec;

    /**
     * pkginst 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getPkginst() {
        return pkginst;
    }

    /**
     * pkginst 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setPkginst(EntityStateStringType value) {
        this.pkginst = value;
    }

    /**
     * filepath 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getFilepath() {
        return filepath;
    }

    /**
     * filepath 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setFilepath(EntityStateStringType value) {
        this.filepath = value;
    }

    /**
     * checksumDiffers 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getChecksumDiffers() {
        return checksumDiffers;
    }

    /**
     * checksumDiffers 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setChecksumDiffers(EntityStateBoolType value) {
        this.checksumDiffers = value;
    }

    /**
     * sizeDiffers 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSizeDiffers() {
        return sizeDiffers;
    }

    /**
     * sizeDiffers 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSizeDiffers(EntityStateBoolType value) {
        this.sizeDiffers = value;
    }

    /**
     * mtimeDiffers 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getMtimeDiffers() {
        return mtimeDiffers;
    }

    /**
     * mtimeDiffers 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setMtimeDiffers(EntityStateBoolType value) {
        this.mtimeDiffers = value;
    }

    /**
     * uread 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public EntityStatePermissionCompareType getUread() {
        return uread;
    }

    /**
     * uread 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public void setUread(EntityStatePermissionCompareType value) {
        this.uread = value;
    }

    /**
     * uwrite 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public EntityStatePermissionCompareType getUwrite() {
        return uwrite;
    }

    /**
     * uwrite 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public void setUwrite(EntityStatePermissionCompareType value) {
        this.uwrite = value;
    }

    /**
     * uexec 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public EntityStatePermissionCompareType getUexec() {
        return uexec;
    }

    /**
     * uexec 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public void setUexec(EntityStatePermissionCompareType value) {
        this.uexec = value;
    }

    /**
     * gread 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public EntityStatePermissionCompareType getGread() {
        return gread;
    }

    /**
     * gread 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public void setGread(EntityStatePermissionCompareType value) {
        this.gread = value;
    }

    /**
     * gwrite 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public EntityStatePermissionCompareType getGwrite() {
        return gwrite;
    }

    /**
     * gwrite 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public void setGwrite(EntityStatePermissionCompareType value) {
        this.gwrite = value;
    }

    /**
     * gexec 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public EntityStatePermissionCompareType getGexec() {
        return gexec;
    }

    /**
     * gexec 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public void setGexec(EntityStatePermissionCompareType value) {
        this.gexec = value;
    }

    /**
     * oread 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public EntityStatePermissionCompareType getOread() {
        return oread;
    }

    /**
     * oread 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public void setOread(EntityStatePermissionCompareType value) {
        this.oread = value;
    }

    /**
     * owrite 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public EntityStatePermissionCompareType getOwrite() {
        return owrite;
    }

    /**
     * owrite 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public void setOwrite(EntityStatePermissionCompareType value) {
        this.owrite = value;
    }

    /**
     * oexec 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public EntityStatePermissionCompareType getOexec() {
        return oexec;
    }

    /**
     * oexec 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public void setOexec(EntityStatePermissionCompareType value) {
        this.oexec = value;
    }

}
