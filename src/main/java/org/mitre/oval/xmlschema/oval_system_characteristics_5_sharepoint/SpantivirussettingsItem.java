//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_sharepoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemBoolType;
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
 *         &lt;element name="spwebservicename" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="spfarmname" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="allowdownload" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="cleaningenabled" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="downloadscanenabled" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="numberofthreads" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="skipsearchcrawl" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="timeout" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="uploadscanenabled" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="vendorupdatecount" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
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
    "spwebservicename",
    "spfarmname",
    "allowdownload",
    "cleaningenabled",
    "downloadscanenabled",
    "numberofthreads",
    "skipsearchcrawl",
    "timeout",
    "uploadscanenabled",
    "vendorupdatecount"
})
public class SpantivirussettingsItem
    extends ItemType
{

    protected EntityItemStringType spwebservicename;
    protected EntityItemStringType spfarmname;
    protected EntityItemBoolType allowdownload;
    protected EntityItemBoolType cleaningenabled;
    protected EntityItemBoolType downloadscanenabled;
    protected EntityItemIntType numberofthreads;
    protected EntityItemBoolType skipsearchcrawl;
    protected EntityItemIntType timeout;
    protected EntityItemBoolType uploadscanenabled;
    protected EntityItemIntType vendorupdatecount;

    /**
     * spwebservicename 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getSpwebservicename() {
        return spwebservicename;
    }

    /**
     * spwebservicename 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setSpwebservicename(EntityItemStringType value) {
        this.spwebservicename = value;
    }

    /**
     * spfarmname 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getSpfarmname() {
        return spfarmname;
    }

    /**
     * spfarmname 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setSpfarmname(EntityItemStringType value) {
        this.spfarmname = value;
    }

    /**
     * allowdownload 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowdownload() {
        return allowdownload;
    }

    /**
     * allowdownload 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowdownload(EntityItemBoolType value) {
        this.allowdownload = value;
    }

    /**
     * cleaningenabled 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getCleaningenabled() {
        return cleaningenabled;
    }

    /**
     * cleaningenabled 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setCleaningenabled(EntityItemBoolType value) {
        this.cleaningenabled = value;
    }

    /**
     * downloadscanenabled 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getDownloadscanenabled() {
        return downloadscanenabled;
    }

    /**
     * downloadscanenabled 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setDownloadscanenabled(EntityItemBoolType value) {
        this.downloadscanenabled = value;
    }

    /**
     * numberofthreads 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getNumberofthreads() {
        return numberofthreads;
    }

    /**
     * numberofthreads 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setNumberofthreads(EntityItemIntType value) {
        this.numberofthreads = value;
    }

    /**
     * skipsearchcrawl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSkipsearchcrawl() {
        return skipsearchcrawl;
    }

    /**
     * skipsearchcrawl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSkipsearchcrawl(EntityItemBoolType value) {
        this.skipsearchcrawl = value;
    }

    /**
     * timeout 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getTimeout() {
        return timeout;
    }

    /**
     * timeout 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setTimeout(EntityItemIntType value) {
        this.timeout = value;
    }

    /**
     * uploadscanenabled 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getUploadscanenabled() {
        return uploadscanenabled;
    }

    /**
     * uploadscanenabled 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setUploadscanenabled(EntityItemBoolType value) {
        this.uploadscanenabled = value;
    }

    /**
     * vendorupdatecount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getVendorupdatecount() {
        return vendorupdatecount;
    }

    /**
     * vendorupdatecount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setVendorupdatecount(EntityItemIntType value) {
        this.vendorupdatecount = value;
    }

}
