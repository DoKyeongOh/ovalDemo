//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_macos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemIntType;
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
 *         &lt;element name="cpu_current" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="cpu_max" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="filesize_current" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="filesize_max" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="data_current" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="data_max" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="stack_current" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="stack_max" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="core_current" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="core_max" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="rss_current" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="rss_max" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="memlock_current" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="memlock_max" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="maxproc_current" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="maxproc_max" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="maxfiles_current" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="maxfiles_max" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
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
public class RlimitItem
    extends ItemType
{

    @XmlElement(name = "cpu_current", required = true)
    protected EntityItemIntType cpuCurrent;
    @XmlElement(name = "cpu_max", required = true)
    protected EntityItemIntType cpuMax;
    @XmlElement(name = "filesize_current", required = true)
    protected EntityItemIntType filesizeCurrent;
    @XmlElement(name = "filesize_max", required = true)
    protected EntityItemIntType filesizeMax;
    @XmlElement(name = "data_current", required = true)
    protected EntityItemIntType dataCurrent;
    @XmlElement(name = "data_max", required = true)
    protected EntityItemIntType dataMax;
    @XmlElement(name = "stack_current", required = true)
    protected EntityItemIntType stackCurrent;
    @XmlElement(name = "stack_max", required = true)
    protected EntityItemIntType stackMax;
    @XmlElement(name = "core_current", required = true)
    protected EntityItemIntType coreCurrent;
    @XmlElement(name = "core_max", required = true)
    protected EntityItemIntType coreMax;
    @XmlElement(name = "rss_current", required = true)
    protected EntityItemIntType rssCurrent;
    @XmlElement(name = "rss_max", required = true)
    protected EntityItemIntType rssMax;
    @XmlElement(name = "memlock_current", required = true)
    protected EntityItemIntType memlockCurrent;
    @XmlElement(name = "memlock_max", required = true)
    protected EntityItemIntType memlockMax;
    @XmlElement(name = "maxproc_current", required = true)
    protected EntityItemIntType maxprocCurrent;
    @XmlElement(name = "maxproc_max", required = true)
    protected EntityItemIntType maxprocMax;
    @XmlElement(name = "maxfiles_current", required = true)
    protected EntityItemIntType maxfilesCurrent;
    @XmlElement(name = "maxfiles_max", required = true)
    protected EntityItemIntType maxfilesMax;

    /**
     * cpuCurrent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getCpuCurrent() {
        return cpuCurrent;
    }

    /**
     * cpuCurrent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setCpuCurrent(EntityItemIntType value) {
        this.cpuCurrent = value;
    }

    /**
     * cpuMax 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getCpuMax() {
        return cpuMax;
    }

    /**
     * cpuMax 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setCpuMax(EntityItemIntType value) {
        this.cpuMax = value;
    }

    /**
     * filesizeCurrent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getFilesizeCurrent() {
        return filesizeCurrent;
    }

    /**
     * filesizeCurrent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setFilesizeCurrent(EntityItemIntType value) {
        this.filesizeCurrent = value;
    }

    /**
     * filesizeMax 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getFilesizeMax() {
        return filesizeMax;
    }

    /**
     * filesizeMax 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setFilesizeMax(EntityItemIntType value) {
        this.filesizeMax = value;
    }

    /**
     * dataCurrent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getDataCurrent() {
        return dataCurrent;
    }

    /**
     * dataCurrent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setDataCurrent(EntityItemIntType value) {
        this.dataCurrent = value;
    }

    /**
     * dataMax 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getDataMax() {
        return dataMax;
    }

    /**
     * dataMax 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setDataMax(EntityItemIntType value) {
        this.dataMax = value;
    }

    /**
     * stackCurrent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getStackCurrent() {
        return stackCurrent;
    }

    /**
     * stackCurrent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setStackCurrent(EntityItemIntType value) {
        this.stackCurrent = value;
    }

    /**
     * stackMax 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getStackMax() {
        return stackMax;
    }

    /**
     * stackMax 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setStackMax(EntityItemIntType value) {
        this.stackMax = value;
    }

    /**
     * coreCurrent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getCoreCurrent() {
        return coreCurrent;
    }

    /**
     * coreCurrent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setCoreCurrent(EntityItemIntType value) {
        this.coreCurrent = value;
    }

    /**
     * coreMax 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getCoreMax() {
        return coreMax;
    }

    /**
     * coreMax 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setCoreMax(EntityItemIntType value) {
        this.coreMax = value;
    }

    /**
     * rssCurrent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getRssCurrent() {
        return rssCurrent;
    }

    /**
     * rssCurrent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setRssCurrent(EntityItemIntType value) {
        this.rssCurrent = value;
    }

    /**
     * rssMax 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getRssMax() {
        return rssMax;
    }

    /**
     * rssMax 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setRssMax(EntityItemIntType value) {
        this.rssMax = value;
    }

    /**
     * memlockCurrent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMemlockCurrent() {
        return memlockCurrent;
    }

    /**
     * memlockCurrent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMemlockCurrent(EntityItemIntType value) {
        this.memlockCurrent = value;
    }

    /**
     * memlockMax 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMemlockMax() {
        return memlockMax;
    }

    /**
     * memlockMax 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMemlockMax(EntityItemIntType value) {
        this.memlockMax = value;
    }

    /**
     * maxprocCurrent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMaxprocCurrent() {
        return maxprocCurrent;
    }

    /**
     * maxprocCurrent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMaxprocCurrent(EntityItemIntType value) {
        this.maxprocCurrent = value;
    }

    /**
     * maxprocMax 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMaxprocMax() {
        return maxprocMax;
    }

    /**
     * maxprocMax 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMaxprocMax(EntityItemIntType value) {
        this.maxprocMax = value;
    }

    /**
     * maxfilesCurrent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMaxfilesCurrent() {
        return maxfilesCurrent;
    }

    /**
     * maxfilesCurrent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMaxfilesCurrent(EntityItemIntType value) {
        this.maxfilesCurrent = value;
    }

    /**
     * maxfilesMax 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMaxfilesMax() {
        return maxfilesMax;
    }

    /**
     * maxfilesMax 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMaxfilesMax(EntityItemIntType value) {
        this.maxfilesMax = value;
    }

}
