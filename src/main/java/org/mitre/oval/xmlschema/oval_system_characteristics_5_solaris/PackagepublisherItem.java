//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_solaris;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemBoolType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemIntType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemRecordType;
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
 *         &lt;element name="name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="type" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris}EntityItemPublisherTypeType" minOccurs="0"/>
 *         &lt;element name="origin_uri" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="alias" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="ssl_key" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="ssl_cert" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="client_uuid" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris}EntityItemClientUUIDType" minOccurs="0"/>
 *         &lt;element name="catalog_updated" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="enabled" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="order" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="properties" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemRecordType" minOccurs="0"/>
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
    "name",
    "type",
    "originUri",
    "alias",
    "sslKey",
    "sslCert",
    "clientUuid",
    "catalogUpdated",
    "enabled",
    "order",
    "properties"
})
public class PackagepublisherItem
    extends ItemType
{

    protected EntityItemStringType name;
    protected EntityItemPublisherTypeType type;
    @XmlElement(name = "origin_uri")
    protected EntityItemStringType originUri;
    protected EntityItemStringType alias;
    @XmlElement(name = "ssl_key")
    protected EntityItemStringType sslKey;
    @XmlElement(name = "ssl_cert")
    protected EntityItemStringType sslCert;
    @XmlElement(name = "client_uuid")
    protected EntityItemClientUUIDType clientUuid;
    @XmlElement(name = "catalog_updated")
    protected EntityItemIntType catalogUpdated;
    protected EntityItemBoolType enabled;
    protected EntityItemIntType order;
    protected EntityItemRecordType properties;

    /**
     * name 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getName() {
        return name;
    }

    /**
     * name 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setName(EntityItemStringType value) {
        this.name = value;
    }

    /**
     * type 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemPublisherTypeType }
     *     
     */
    public EntityItemPublisherTypeType getType() {
        return type;
    }

    /**
     * type 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemPublisherTypeType }
     *     
     */
    public void setType(EntityItemPublisherTypeType value) {
        this.type = value;
    }

    /**
     * originUri 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getOriginUri() {
        return originUri;
    }

    /**
     * originUri 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setOriginUri(EntityItemStringType value) {
        this.originUri = value;
    }

    /**
     * alias 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getAlias() {
        return alias;
    }

    /**
     * alias 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setAlias(EntityItemStringType value) {
        this.alias = value;
    }

    /**
     * sslKey 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getSslKey() {
        return sslKey;
    }

    /**
     * sslKey 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setSslKey(EntityItemStringType value) {
        this.sslKey = value;
    }

    /**
     * sslCert 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getSslCert() {
        return sslCert;
    }

    /**
     * sslCert 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setSslCert(EntityItemStringType value) {
        this.sslCert = value;
    }

    /**
     * clientUuid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemClientUUIDType }
     *     
     */
    public EntityItemClientUUIDType getClientUuid() {
        return clientUuid;
    }

    /**
     * clientUuid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemClientUUIDType }
     *     
     */
    public void setClientUuid(EntityItemClientUUIDType value) {
        this.clientUuid = value;
    }

    /**
     * catalogUpdated 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getCatalogUpdated() {
        return catalogUpdated;
    }

    /**
     * catalogUpdated 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setCatalogUpdated(EntityItemIntType value) {
        this.catalogUpdated = value;
    }

    /**
     * enabled 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getEnabled() {
        return enabled;
    }

    /**
     * enabled 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setEnabled(EntityItemBoolType value) {
        this.enabled = value;
    }

    /**
     * order 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getOrder() {
        return order;
    }

    /**
     * order 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setOrder(EntityItemIntType value) {
        this.order = value;
    }

    /**
     * properties 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemRecordType }
     *     
     */
    public EntityItemRecordType getProperties() {
        return properties;
    }

    /**
     * properties 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemRecordType }
     *     
     */
    public void setProperties(EntityItemRecordType value) {
        this.properties = value;
    }

}
