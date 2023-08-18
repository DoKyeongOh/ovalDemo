//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5_linux;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The RpmVerifyFileBehaviors complex type defines a set of behaviors that for controlling how the individual files in installed rpms are verified. These behaviors align with the verify-options of the rpm command with the addition of two behaviors that will indicate that a file with a given attribute marker should not be collected.
 * 
 * <p>RpmVerifyFileBehaviors complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="RpmVerifyFileBehaviors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="nolinkto" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="nomd5" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="nosize" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="nouser" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="nogroup" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="nomtime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="nomode" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="nordev" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="noconfigfiles" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="noghostfiles" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="nofiledigest" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="nocaps" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RpmVerifyFileBehaviors")
public class RpmVerifyFileBehaviors {

    @XmlAttribute(name = "nolinkto")
    protected Boolean nolinkto;
    @XmlAttribute(name = "nomd5")
    protected Boolean nomd5;
    @XmlAttribute(name = "nosize")
    protected Boolean nosize;
    @XmlAttribute(name = "nouser")
    protected Boolean nouser;
    @XmlAttribute(name = "nogroup")
    protected Boolean nogroup;
    @XmlAttribute(name = "nomtime")
    protected Boolean nomtime;
    @XmlAttribute(name = "nomode")
    protected Boolean nomode;
    @XmlAttribute(name = "nordev")
    protected Boolean nordev;
    @XmlAttribute(name = "noconfigfiles")
    protected Boolean noconfigfiles;
    @XmlAttribute(name = "noghostfiles")
    protected Boolean noghostfiles;
    @XmlAttribute(name = "nofiledigest")
    protected Boolean nofiledigest;
    @XmlAttribute(name = "nocaps")
    protected Boolean nocaps;

    /**
     * nolinkto 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNolinkto() {
        if (nolinkto == null) {
            return false;
        } else {
            return nolinkto;
        }
    }

    /**
     * nolinkto 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNolinkto(Boolean value) {
        this.nolinkto = value;
    }

    /**
     * nomd5 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNomd5() {
        if (nomd5 == null) {
            return false;
        } else {
            return nomd5;
        }
    }

    /**
     * nomd5 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNomd5(Boolean value) {
        this.nomd5 = value;
    }

    /**
     * nosize 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNosize() {
        if (nosize == null) {
            return false;
        } else {
            return nosize;
        }
    }

    /**
     * nosize 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNosize(Boolean value) {
        this.nosize = value;
    }

    /**
     * nouser 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNouser() {
        if (nouser == null) {
            return false;
        } else {
            return nouser;
        }
    }

    /**
     * nouser 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNouser(Boolean value) {
        this.nouser = value;
    }

    /**
     * nogroup 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNogroup() {
        if (nogroup == null) {
            return false;
        } else {
            return nogroup;
        }
    }

    /**
     * nogroup 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNogroup(Boolean value) {
        this.nogroup = value;
    }

    /**
     * nomtime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNomtime() {
        if (nomtime == null) {
            return false;
        } else {
            return nomtime;
        }
    }

    /**
     * nomtime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNomtime(Boolean value) {
        this.nomtime = value;
    }

    /**
     * nomode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNomode() {
        if (nomode == null) {
            return false;
        } else {
            return nomode;
        }
    }

    /**
     * nomode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNomode(Boolean value) {
        this.nomode = value;
    }

    /**
     * nordev 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNordev() {
        if (nordev == null) {
            return false;
        } else {
            return nordev;
        }
    }

    /**
     * nordev 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNordev(Boolean value) {
        this.nordev = value;
    }

    /**
     * noconfigfiles 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNoconfigfiles() {
        if (noconfigfiles == null) {
            return false;
        } else {
            return noconfigfiles;
        }
    }

    /**
     * noconfigfiles 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoconfigfiles(Boolean value) {
        this.noconfigfiles = value;
    }

    /**
     * noghostfiles 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNoghostfiles() {
        if (noghostfiles == null) {
            return false;
        } else {
            return noghostfiles;
        }
    }

    /**
     * noghostfiles 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoghostfiles(Boolean value) {
        this.noghostfiles = value;
    }

    /**
     * nofiledigest 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNofiledigest() {
        if (nofiledigest == null) {
            return false;
        } else {
            return nofiledigest;
        }
    }

    /**
     * nofiledigest 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNofiledigest(Boolean value) {
        this.nofiledigest = value;
    }

    /**
     * nocaps 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNocaps() {
        if (nocaps == null) {
            return false;
        } else {
            return nocaps;
        }
    }

    /**
     * nocaps 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNocaps(Boolean value) {
        this.nocaps = value;
    }

}
