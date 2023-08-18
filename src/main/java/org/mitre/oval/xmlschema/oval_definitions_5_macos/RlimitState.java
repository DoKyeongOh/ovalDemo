//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5_macos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateIntType;
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
 *         &lt;element name="cpu_current" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="cpu_max" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="filesize_current" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="filesize_max" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="data_current" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="data_max" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="stack_current" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="stack_max" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="core_current" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="core_max" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="rss_current" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="rss_max" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="memlock_current" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="memlock_max" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="maxproc_current" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="maxproc_max" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="maxfiles_current" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="maxfiles_max" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
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
    "cpuCurrent",
    "cpuMax",
    "filesizeCurrent",
    "filesizeMax",
    "dataCurrent",
    "dataMax",
    "stackCurrent",
    "stackMax",
    "coreCurrent",
    "coreMax",
    "rssCurrent",
    "rssMax",
    "memlockCurrent",
    "memlockMax",
    "maxprocCurrent",
    "maxprocMax",
    "maxfilesCurrent",
    "maxfilesMax"
})
public class RlimitState
    extends StateType
{

    @XmlElement(name = "cpu_current")
    protected EntityStateIntType cpuCurrent;
    @XmlElement(name = "cpu_max")
    protected EntityStateIntType cpuMax;
    @XmlElement(name = "filesize_current")
    protected EntityStateIntType filesizeCurrent;
    @XmlElement(name = "filesize_max")
    protected EntityStateIntType filesizeMax;
    @XmlElement(name = "data_current")
    protected EntityStateIntType dataCurrent;
    @XmlElement(name = "data_max")
    protected EntityStateIntType dataMax;
    @XmlElement(name = "stack_current")
    protected EntityStateIntType stackCurrent;
    @XmlElement(name = "stack_max")
    protected EntityStateIntType stackMax;
    @XmlElement(name = "core_current")
    protected EntityStateIntType coreCurrent;
    @XmlElement(name = "core_max")
    protected EntityStateIntType coreMax;
    @XmlElement(name = "rss_current")
    protected EntityStateIntType rssCurrent;
    @XmlElement(name = "rss_max")
    protected EntityStateIntType rssMax;
    @XmlElement(name = "memlock_current")
    protected EntityStateIntType memlockCurrent;
    @XmlElement(name = "memlock_max")
    protected EntityStateIntType memlockMax;
    @XmlElement(name = "maxproc_current")
    protected EntityStateIntType maxprocCurrent;
    @XmlElement(name = "maxproc_max")
    protected EntityStateIntType maxprocMax;
    @XmlElement(name = "maxfiles_current")
    protected EntityStateIntType maxfilesCurrent;
    @XmlElement(name = "maxfiles_max")
    protected EntityStateIntType maxfilesMax;

    /**
     * cpuCurrent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getCpuCurrent() {
        return cpuCurrent;
    }

    /**
     * cpuCurrent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setCpuCurrent(EntityStateIntType value) {
        this.cpuCurrent = value;
    }

    /**
     * cpuMax 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getCpuMax() {
        return cpuMax;
    }

    /**
     * cpuMax 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setCpuMax(EntityStateIntType value) {
        this.cpuMax = value;
    }

    /**
     * filesizeCurrent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getFilesizeCurrent() {
        return filesizeCurrent;
    }

    /**
     * filesizeCurrent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setFilesizeCurrent(EntityStateIntType value) {
        this.filesizeCurrent = value;
    }

    /**
     * filesizeMax 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getFilesizeMax() {
        return filesizeMax;
    }

    /**
     * filesizeMax 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setFilesizeMax(EntityStateIntType value) {
        this.filesizeMax = value;
    }

    /**
     * dataCurrent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getDataCurrent() {
        return dataCurrent;
    }

    /**
     * dataCurrent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setDataCurrent(EntityStateIntType value) {
        this.dataCurrent = value;
    }

    /**
     * dataMax 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getDataMax() {
        return dataMax;
    }

    /**
     * dataMax 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setDataMax(EntityStateIntType value) {
        this.dataMax = value;
    }

    /**
     * stackCurrent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getStackCurrent() {
        return stackCurrent;
    }

    /**
     * stackCurrent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setStackCurrent(EntityStateIntType value) {
        this.stackCurrent = value;
    }

    /**
     * stackMax 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getStackMax() {
        return stackMax;
    }

    /**
     * stackMax 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setStackMax(EntityStateIntType value) {
        this.stackMax = value;
    }

    /**
     * coreCurrent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getCoreCurrent() {
        return coreCurrent;
    }

    /**
     * coreCurrent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setCoreCurrent(EntityStateIntType value) {
        this.coreCurrent = value;
    }

    /**
     * coreMax 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getCoreMax() {
        return coreMax;
    }

    /**
     * coreMax 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setCoreMax(EntityStateIntType value) {
        this.coreMax = value;
    }

    /**
     * rssCurrent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getRssCurrent() {
        return rssCurrent;
    }

    /**
     * rssCurrent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setRssCurrent(EntityStateIntType value) {
        this.rssCurrent = value;
    }

    /**
     * rssMax 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getRssMax() {
        return rssMax;
    }

    /**
     * rssMax 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setRssMax(EntityStateIntType value) {
        this.rssMax = value;
    }

    /**
     * memlockCurrent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMemlockCurrent() {
        return memlockCurrent;
    }

    /**
     * memlockCurrent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMemlockCurrent(EntityStateIntType value) {
        this.memlockCurrent = value;
    }

    /**
     * memlockMax 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMemlockMax() {
        return memlockMax;
    }

    /**
     * memlockMax 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMemlockMax(EntityStateIntType value) {
        this.memlockMax = value;
    }

    /**
     * maxprocCurrent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMaxprocCurrent() {
        return maxprocCurrent;
    }

    /**
     * maxprocCurrent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMaxprocCurrent(EntityStateIntType value) {
        this.maxprocCurrent = value;
    }

    /**
     * maxprocMax 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMaxprocMax() {
        return maxprocMax;
    }

    /**
     * maxprocMax 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMaxprocMax(EntityStateIntType value) {
        this.maxprocMax = value;
    }

    /**
     * maxfilesCurrent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMaxfilesCurrent() {
        return maxfilesCurrent;
    }

    /**
     * maxfilesCurrent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMaxfilesCurrent(EntityStateIntType value) {
        this.maxfilesCurrent = value;
    }

    /**
     * maxfilesMax 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMaxfilesMax() {
        return maxfilesMax;
    }

    /**
     * maxfilesMax 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMaxfilesMax(EntityStateIntType value) {
        this.maxfilesMax = value;
    }

}
