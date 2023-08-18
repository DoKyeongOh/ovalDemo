//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5_sharepoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="spwebservicename" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="spfarmname" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="allowdownload" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="cleaningenabled" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="downloadscanenabled" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="numberofthreads" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="skipsearchcrawl" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="timeout" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="uploadscanenabled" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="vendorupdatecount" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
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
public class SpantivirussettingsState
    extends StateType
{

    protected EntityStateStringType spwebservicename;
    protected EntityStateStringType spfarmname;
    protected EntityStateBoolType allowdownload;
    protected EntityStateBoolType cleaningenabled;
    protected EntityStateBoolType downloadscanenabled;
    protected EntityStateIntType numberofthreads;
    protected EntityStateBoolType skipsearchcrawl;
    protected EntityStateIntType timeout;
    protected EntityStateBoolType uploadscanenabled;
    protected EntityStateIntType vendorupdatecount;

    /**
     * spwebservicename 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getSpwebservicename() {
        return spwebservicename;
    }

    /**
     * spwebservicename 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setSpwebservicename(EntityStateStringType value) {
        this.spwebservicename = value;
    }

    /**
     * spfarmname 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getSpfarmname() {
        return spfarmname;
    }

    /**
     * spfarmname 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setSpfarmname(EntityStateStringType value) {
        this.spfarmname = value;
    }

    /**
     * allowdownload 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowdownload() {
        return allowdownload;
    }

    /**
     * allowdownload 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowdownload(EntityStateBoolType value) {
        this.allowdownload = value;
    }

    /**
     * cleaningenabled 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getCleaningenabled() {
        return cleaningenabled;
    }

    /**
     * cleaningenabled 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setCleaningenabled(EntityStateBoolType value) {
        this.cleaningenabled = value;
    }

    /**
     * downloadscanenabled 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getDownloadscanenabled() {
        return downloadscanenabled;
    }

    /**
     * downloadscanenabled 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setDownloadscanenabled(EntityStateBoolType value) {
        this.downloadscanenabled = value;
    }

    /**
     * numberofthreads 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getNumberofthreads() {
        return numberofthreads;
    }

    /**
     * numberofthreads 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setNumberofthreads(EntityStateIntType value) {
        this.numberofthreads = value;
    }

    /**
     * skipsearchcrawl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSkipsearchcrawl() {
        return skipsearchcrawl;
    }

    /**
     * skipsearchcrawl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSkipsearchcrawl(EntityStateBoolType value) {
        this.skipsearchcrawl = value;
    }

    /**
     * timeout 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getTimeout() {
        return timeout;
    }

    /**
     * timeout 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setTimeout(EntityStateIntType value) {
        this.timeout = value;
    }

    /**
     * uploadscanenabled 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getUploadscanenabled() {
        return uploadscanenabled;
    }

    /**
     * uploadscanenabled 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setUploadscanenabled(EntityStateBoolType value) {
        this.uploadscanenabled = value;
    }

    /**
     * vendorupdatecount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getVendorupdatecount() {
        return vendorupdatecount;
    }

    /**
     * vendorupdatecount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setVendorupdatecount(EntityStateIntType value) {
        this.vendorupdatecount = value;
    }

}
