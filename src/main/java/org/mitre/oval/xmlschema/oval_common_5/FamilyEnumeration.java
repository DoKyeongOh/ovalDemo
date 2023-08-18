//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_common_5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FamilyEnumeration에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="FamilyEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="android"/>
 *     &lt;enumeration value="asa"/>
 *     &lt;enumeration value="apple_ios"/>
 *     &lt;enumeration value="catos"/>
 *     &lt;enumeration value="ios"/>
 *     &lt;enumeration value="iosxe"/>
 *     &lt;enumeration value="junos"/>
 *     &lt;enumeration value="macos"/>
 *     &lt;enumeration value="pixos"/>
 *     &lt;enumeration value="undefined"/>
 *     &lt;enumeration value="unix"/>
 *     &lt;enumeration value="vmware_infrastructure"/>
 *     &lt;enumeration value="windows"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FamilyEnumeration")
@XmlEnum
public enum FamilyEnumeration {


    /**
     * The android value describes the Android mobile operating system.
     * 
     */
    @XmlEnumValue("android")
    ANDROID("android"),

    /**
     * The asa value describes the Cisco ASA security devices.
     * 
     */
    @XmlEnumValue("asa")
    ASA("asa"),

    /**
     * The apple_ios value describes the iOS mobile operating system.
     * 
     */
    @XmlEnumValue("apple_ios")
    APPLE_IOS("apple_ios"),

    /**
     * The catos value describes the Cisco CatOS operating system.
     * 
     */
    @XmlEnumValue("catos")
    CATOS("catos"),

    /**
     * The ios value describes the Cisco IOS operating system.
     * 
     */
    @XmlEnumValue("ios")
    IOS("ios"),

    /**
     * The iosxe value describes the Cisco IOS XE operating system.
     * 
     */
    @XmlEnumValue("iosxe")
    IOSXE("iosxe"),

    /**
     * The junos value describes the Juniper JunOS operating system.
     * 
     */
    @XmlEnumValue("junos")
    JUNOS("junos"),

    /**
     * The macos value describes the Mac operating system.
     * 
     */
    @XmlEnumValue("macos")
    MACOS("macos"),

    /**
     * The pixos value describes the Cisco PIX operating system.
     * 
     */
    @XmlEnumValue("pixos")
    PIXOS("pixos"),

    /**
     * The undefined value is to be used when the desired family is not available.
     * 
     */
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),

    /**
     * The unix value describes the UNIX operating system.
     * 
     */
    @XmlEnumValue("unix")
    UNIX("unix"),

    /**
     * The vmware_infrastructure value describes VMWare Infrastructure.
     * 
     */
    @XmlEnumValue("vmware_infrastructure")
    VMWARE_INFRASTRUCTURE("vmware_infrastructure"),

    /**
     * The windows value describes the Microsoft Windows operating system.
     * 
     */
    @XmlEnumValue("windows")
    WINDOWS("windows");
    private final String value;

    FamilyEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FamilyEnumeration fromValue(String v) {
        for (FamilyEnumeration c: FamilyEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
