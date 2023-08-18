//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DateTimeFormatEnumeration에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="DateTimeFormatEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="year_month_day"/>
 *     &lt;enumeration value="month_day_year"/>
 *     &lt;enumeration value="day_month_year"/>
 *     &lt;enumeration value="win_filetime"/>
 *     &lt;enumeration value="seconds_since_epoch"/>
 *     &lt;enumeration value="cim_datetime"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DateTimeFormatEnumeration")
@XmlEnum
public enum DateTimeFormatEnumeration {


    /**
     * The year_month_day value specifies date-time strings that follow the formats: 'yyyymmdd', 'yyyymmddThhmmss', 'yyyy/mm/dd hh:mm:ss', 'yyyy/mm/dd', 'yyyy-mm-dd hh:mm:ss', or 'yyyy-mm-dd'
     * 
     */
    @XmlEnumValue("year_month_day")
    YEAR_MONTH_DAY("year_month_day"),

    /**
     * The month_day_year value specifies date-time strings that follow the formats: 'mm/dd/yyyy hh:mm:ss', 'mm/dd/yyyy', 'mm-dd-yyyy hh:mm:ss', 'mm-dd-yyyy', 'NameOfMonth, dd yyyy hh:mm:ss' or 'NameOfMonth, dd yyyy', 'AbreviatedNameOfMonth, dd yyyy hh:mm:ss', or 'AbreviatedNameOfMonth, dd yyyy'
     * 
     */
    @XmlEnumValue("month_day_year")
    MONTH_DAY_YEAR("month_day_year"),

    /**
     * The day_month_year value specifies date-time strings that follow the formats: 'dd/mm/yyyy hh:mm:ss', 'dd/mm/yyyy', 'dd-mm-yyyy hh:mm:ss', or 'dd-mm-yyyy'
     * 
     */
    @XmlEnumValue("day_month_year")
    DAY_MONTH_YEAR("day_month_year"),

    /**
     * The win_filetime value specifies date-time strings that follow the windows file time format.
     * 
     */
    @XmlEnumValue("win_filetime")
    WIN_FILETIME("win_filetime"),

    /**
     * The seconds_since_epoch value specifies date-time values that represent the time in seconds since the UNIX epoch.  The Unix epoch is the time 00:00:00 UTC on January 1, 1970.
     * 
     */
    @XmlEnumValue("seconds_since_epoch")
    SECONDS_SINCE_EPOCH("seconds_since_epoch"),

    /**
     * The cim_datetime model is used by WMI and its value specifies date-time strings that follow the format: 'yyyymmddHHMMSS.mmmmmmsUUU', and alternatively 'yyyy-mm-dd HH:MM:SS:mmm' only when used in WMI Query Language queries.
     * 
     */
    @XmlEnumValue("cim_datetime")
    CIM_DATETIME("cim_datetime");
    private final String value;

    DateTimeFormatEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DateTimeFormatEnumeration fromValue(String v) {
        for (DateTimeFormatEnumeration c: DateTimeFormatEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
