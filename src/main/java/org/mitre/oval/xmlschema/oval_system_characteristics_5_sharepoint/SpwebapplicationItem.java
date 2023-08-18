//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_sharepoint;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="webapplicationurl" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="allowparttopartcommunication" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allowaccesstowebpartcatalog" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="blockedfileextention" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="defaultquotatemplate" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="externalworkflowparticipantsenabled" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="recyclebinenabled" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="automaticallydeleteunusedsitecollections" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="selfservicesitecreationenabled" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="secondstagerecyclebinquota" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="recyclebinretentionperiod" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="outboundmailserverinstance" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="outboundmailsenderaddress" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="outboundmailreplytoaddress" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="secvalexpires" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="timeout" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="isadministrationwebapplication" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="applicationpoolname" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="applicationpoolusername" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="openitems" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="addlistitems" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="approveitems" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="deletelistitems" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="deleteversions" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="editlistitems" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="managelists" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="viewversions" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="viewlistitems" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="cancelcheckout" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="createalerts" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="viewformpages" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="viewpages" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="addandcustomizepages" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="applystylesheets" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="applythemeandborder" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="browsedirectories" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="browseuserinfo" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="creategroups" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="createsscsite" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="editmyuserinfo" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="enumeratepermissions" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="managealerts" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="managepermissions" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="managesubwebs" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="manageweb" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="open" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="useclientintegration" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="useremoteapis" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="viewusagedata" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="managepersonalviews" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="adddelprivatewebparts" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="updatepersonalwebparts" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
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
    "webapplicationurl",
    "allowparttopartcommunication",
    "allowaccesstowebpartcatalog",
    "blockedfileextention",
    "defaultquotatemplate",
    "externalworkflowparticipantsenabled",
    "recyclebinenabled",
    "automaticallydeleteunusedsitecollections",
    "selfservicesitecreationenabled",
    "secondstagerecyclebinquota",
    "recyclebinretentionperiod",
    "outboundmailserverinstance",
    "outboundmailsenderaddress",
    "outboundmailreplytoaddress",
    "secvalexpires",
    "timeout",
    "isadministrationwebapplication",
    "applicationpoolname",
    "applicationpoolusername",
    "openitems",
    "addlistitems",
    "approveitems",
    "deletelistitems",
    "deleteversions",
    "editlistitems",
    "managelists",
    "viewversions",
    "viewlistitems",
    "cancelcheckout",
    "createalerts",
    "viewformpages",
    "viewpages",
    "addandcustomizepages",
    "applystylesheets",
    "applythemeandborder",
    "browsedirectories",
    "browseuserinfo",
    "creategroups",
    "createsscsite",
    "editmyuserinfo",
    "enumeratepermissions",
    "managealerts",
    "managepermissions",
    "managesubwebs",
    "manageweb",
    "open",
    "useclientintegration",
    "useremoteapis",
    "viewusagedata",
    "managepersonalviews",
    "adddelprivatewebparts",
    "updatepersonalwebparts"
})
public class SpwebapplicationItem
    extends ItemType
{

    protected EntityItemStringType webapplicationurl;
    protected EntityItemBoolType allowparttopartcommunication;
    protected EntityItemBoolType allowaccesstowebpartcatalog;
    protected List<EntityItemStringType> blockedfileextention;
    protected EntityItemStringType defaultquotatemplate;
    protected EntityItemBoolType externalworkflowparticipantsenabled;
    protected EntityItemBoolType recyclebinenabled;
    protected EntityItemBoolType automaticallydeleteunusedsitecollections;
    protected EntityItemBoolType selfservicesitecreationenabled;
    protected EntityItemIntType secondstagerecyclebinquota;
    protected EntityItemIntType recyclebinretentionperiod;
    protected EntityItemStringType outboundmailserverinstance;
    protected EntityItemStringType outboundmailsenderaddress;
    protected EntityItemStringType outboundmailreplytoaddress;
    protected EntityItemBoolType secvalexpires;
    protected EntityItemIntType timeout;
    protected EntityItemBoolType isadministrationwebapplication;
    protected EntityItemStringType applicationpoolname;
    protected EntityItemStringType applicationpoolusername;
    protected EntityItemBoolType openitems;
    protected EntityItemBoolType addlistitems;
    protected EntityItemBoolType approveitems;
    protected EntityItemBoolType deletelistitems;
    protected EntityItemBoolType deleteversions;
    protected EntityItemBoolType editlistitems;
    protected EntityItemBoolType managelists;
    protected EntityItemBoolType viewversions;
    protected EntityItemBoolType viewlistitems;
    protected EntityItemBoolType cancelcheckout;
    protected EntityItemBoolType createalerts;
    protected EntityItemBoolType viewformpages;
    protected EntityItemBoolType viewpages;
    protected EntityItemBoolType addandcustomizepages;
    protected EntityItemBoolType applystylesheets;
    protected EntityItemBoolType applythemeandborder;
    protected EntityItemBoolType browsedirectories;
    protected EntityItemBoolType browseuserinfo;
    protected EntityItemBoolType creategroups;
    protected EntityItemBoolType createsscsite;
    protected EntityItemBoolType editmyuserinfo;
    protected EntityItemBoolType enumeratepermissions;
    protected EntityItemBoolType managealerts;
    protected EntityItemBoolType managepermissions;
    protected EntityItemBoolType managesubwebs;
    protected EntityItemBoolType manageweb;
    protected EntityItemBoolType open;
    protected EntityItemBoolType useclientintegration;
    protected EntityItemBoolType useremoteapis;
    protected EntityItemBoolType viewusagedata;
    protected EntityItemBoolType managepersonalviews;
    protected EntityItemBoolType adddelprivatewebparts;
    protected EntityItemBoolType updatepersonalwebparts;

    /**
     * webapplicationurl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getWebapplicationurl() {
        return webapplicationurl;
    }

    /**
     * webapplicationurl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setWebapplicationurl(EntityItemStringType value) {
        this.webapplicationurl = value;
    }

    /**
     * allowparttopartcommunication 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowparttopartcommunication() {
        return allowparttopartcommunication;
    }

    /**
     * allowparttopartcommunication 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowparttopartcommunication(EntityItemBoolType value) {
        this.allowparttopartcommunication = value;
    }

    /**
     * allowaccesstowebpartcatalog 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowaccesstowebpartcatalog() {
        return allowaccesstowebpartcatalog;
    }

    /**
     * allowaccesstowebpartcatalog 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowaccesstowebpartcatalog(EntityItemBoolType value) {
        this.allowaccesstowebpartcatalog = value;
    }

    /**
     * Gets the value of the blockedfileextention property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blockedfileextention property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlockedfileextention().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemStringType }
     * 
     * 
     */
    public List<EntityItemStringType> getBlockedfileextention() {
        if (blockedfileextention == null) {
            blockedfileextention = new ArrayList<EntityItemStringType>();
        }
        return this.blockedfileextention;
    }

    /**
     * defaultquotatemplate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getDefaultquotatemplate() {
        return defaultquotatemplate;
    }

    /**
     * defaultquotatemplate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setDefaultquotatemplate(EntityItemStringType value) {
        this.defaultquotatemplate = value;
    }

    /**
     * externalworkflowparticipantsenabled 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getExternalworkflowparticipantsenabled() {
        return externalworkflowparticipantsenabled;
    }

    /**
     * externalworkflowparticipantsenabled 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setExternalworkflowparticipantsenabled(EntityItemBoolType value) {
        this.externalworkflowparticipantsenabled = value;
    }

    /**
     * recyclebinenabled 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getRecyclebinenabled() {
        return recyclebinenabled;
    }

    /**
     * recyclebinenabled 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setRecyclebinenabled(EntityItemBoolType value) {
        this.recyclebinenabled = value;
    }

    /**
     * automaticallydeleteunusedsitecollections 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAutomaticallydeleteunusedsitecollections() {
        return automaticallydeleteunusedsitecollections;
    }

    /**
     * automaticallydeleteunusedsitecollections 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAutomaticallydeleteunusedsitecollections(EntityItemBoolType value) {
        this.automaticallydeleteunusedsitecollections = value;
    }

    /**
     * selfservicesitecreationenabled 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSelfservicesitecreationenabled() {
        return selfservicesitecreationenabled;
    }

    /**
     * selfservicesitecreationenabled 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSelfservicesitecreationenabled(EntityItemBoolType value) {
        this.selfservicesitecreationenabled = value;
    }

    /**
     * secondstagerecyclebinquota 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getSecondstagerecyclebinquota() {
        return secondstagerecyclebinquota;
    }

    /**
     * secondstagerecyclebinquota 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setSecondstagerecyclebinquota(EntityItemIntType value) {
        this.secondstagerecyclebinquota = value;
    }

    /**
     * recyclebinretentionperiod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getRecyclebinretentionperiod() {
        return recyclebinretentionperiod;
    }

    /**
     * recyclebinretentionperiod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setRecyclebinretentionperiod(EntityItemIntType value) {
        this.recyclebinretentionperiod = value;
    }

    /**
     * outboundmailserverinstance 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getOutboundmailserverinstance() {
        return outboundmailserverinstance;
    }

    /**
     * outboundmailserverinstance 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setOutboundmailserverinstance(EntityItemStringType value) {
        this.outboundmailserverinstance = value;
    }

    /**
     * outboundmailsenderaddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getOutboundmailsenderaddress() {
        return outboundmailsenderaddress;
    }

    /**
     * outboundmailsenderaddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setOutboundmailsenderaddress(EntityItemStringType value) {
        this.outboundmailsenderaddress = value;
    }

    /**
     * outboundmailreplytoaddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getOutboundmailreplytoaddress() {
        return outboundmailreplytoaddress;
    }

    /**
     * outboundmailreplytoaddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setOutboundmailreplytoaddress(EntityItemStringType value) {
        this.outboundmailreplytoaddress = value;
    }

    /**
     * secvalexpires 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSecvalexpires() {
        return secvalexpires;
    }

    /**
     * secvalexpires 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSecvalexpires(EntityItemBoolType value) {
        this.secvalexpires = value;
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
     * isadministrationwebapplication 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getIsadministrationwebapplication() {
        return isadministrationwebapplication;
    }

    /**
     * isadministrationwebapplication 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setIsadministrationwebapplication(EntityItemBoolType value) {
        this.isadministrationwebapplication = value;
    }

    /**
     * applicationpoolname 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getApplicationpoolname() {
        return applicationpoolname;
    }

    /**
     * applicationpoolname 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setApplicationpoolname(EntityItemStringType value) {
        this.applicationpoolname = value;
    }

    /**
     * applicationpoolusername 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getApplicationpoolusername() {
        return applicationpoolusername;
    }

    /**
     * applicationpoolusername 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setApplicationpoolusername(EntityItemStringType value) {
        this.applicationpoolusername = value;
    }

    /**
     * openitems 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getOpenitems() {
        return openitems;
    }

    /**
     * openitems 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setOpenitems(EntityItemBoolType value) {
        this.openitems = value;
    }

    /**
     * addlistitems 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAddlistitems() {
        return addlistitems;
    }

    /**
     * addlistitems 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAddlistitems(EntityItemBoolType value) {
        this.addlistitems = value;
    }

    /**
     * approveitems 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getApproveitems() {
        return approveitems;
    }

    /**
     * approveitems 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setApproveitems(EntityItemBoolType value) {
        this.approveitems = value;
    }

    /**
     * deletelistitems 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getDeletelistitems() {
        return deletelistitems;
    }

    /**
     * deletelistitems 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setDeletelistitems(EntityItemBoolType value) {
        this.deletelistitems = value;
    }

    /**
     * deleteversions 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getDeleteversions() {
        return deleteversions;
    }

    /**
     * deleteversions 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setDeleteversions(EntityItemBoolType value) {
        this.deleteversions = value;
    }

    /**
     * editlistitems 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getEditlistitems() {
        return editlistitems;
    }

    /**
     * editlistitems 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setEditlistitems(EntityItemBoolType value) {
        this.editlistitems = value;
    }

    /**
     * managelists 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getManagelists() {
        return managelists;
    }

    /**
     * managelists 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setManagelists(EntityItemBoolType value) {
        this.managelists = value;
    }

    /**
     * viewversions 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getViewversions() {
        return viewversions;
    }

    /**
     * viewversions 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setViewversions(EntityItemBoolType value) {
        this.viewversions = value;
    }

    /**
     * viewlistitems 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getViewlistitems() {
        return viewlistitems;
    }

    /**
     * viewlistitems 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setViewlistitems(EntityItemBoolType value) {
        this.viewlistitems = value;
    }

    /**
     * cancelcheckout 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getCancelcheckout() {
        return cancelcheckout;
    }

    /**
     * cancelcheckout 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setCancelcheckout(EntityItemBoolType value) {
        this.cancelcheckout = value;
    }

    /**
     * createalerts 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getCreatealerts() {
        return createalerts;
    }

    /**
     * createalerts 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setCreatealerts(EntityItemBoolType value) {
        this.createalerts = value;
    }

    /**
     * viewformpages 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getViewformpages() {
        return viewformpages;
    }

    /**
     * viewformpages 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setViewformpages(EntityItemBoolType value) {
        this.viewformpages = value;
    }

    /**
     * viewpages 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getViewpages() {
        return viewpages;
    }

    /**
     * viewpages 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setViewpages(EntityItemBoolType value) {
        this.viewpages = value;
    }

    /**
     * addandcustomizepages 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAddandcustomizepages() {
        return addandcustomizepages;
    }

    /**
     * addandcustomizepages 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAddandcustomizepages(EntityItemBoolType value) {
        this.addandcustomizepages = value;
    }

    /**
     * applystylesheets 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getApplystylesheets() {
        return applystylesheets;
    }

    /**
     * applystylesheets 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setApplystylesheets(EntityItemBoolType value) {
        this.applystylesheets = value;
    }

    /**
     * applythemeandborder 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getApplythemeandborder() {
        return applythemeandborder;
    }

    /**
     * applythemeandborder 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setApplythemeandborder(EntityItemBoolType value) {
        this.applythemeandborder = value;
    }

    /**
     * browsedirectories 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getBrowsedirectories() {
        return browsedirectories;
    }

    /**
     * browsedirectories 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setBrowsedirectories(EntityItemBoolType value) {
        this.browsedirectories = value;
    }

    /**
     * browseuserinfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getBrowseuserinfo() {
        return browseuserinfo;
    }

    /**
     * browseuserinfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setBrowseuserinfo(EntityItemBoolType value) {
        this.browseuserinfo = value;
    }

    /**
     * creategroups 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getCreategroups() {
        return creategroups;
    }

    /**
     * creategroups 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setCreategroups(EntityItemBoolType value) {
        this.creategroups = value;
    }

    /**
     * createsscsite 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getCreatesscsite() {
        return createsscsite;
    }

    /**
     * createsscsite 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setCreatesscsite(EntityItemBoolType value) {
        this.createsscsite = value;
    }

    /**
     * editmyuserinfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getEditmyuserinfo() {
        return editmyuserinfo;
    }

    /**
     * editmyuserinfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setEditmyuserinfo(EntityItemBoolType value) {
        this.editmyuserinfo = value;
    }

    /**
     * enumeratepermissions 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getEnumeratepermissions() {
        return enumeratepermissions;
    }

    /**
     * enumeratepermissions 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setEnumeratepermissions(EntityItemBoolType value) {
        this.enumeratepermissions = value;
    }

    /**
     * managealerts 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getManagealerts() {
        return managealerts;
    }

    /**
     * managealerts 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setManagealerts(EntityItemBoolType value) {
        this.managealerts = value;
    }

    /**
     * managepermissions 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getManagepermissions() {
        return managepermissions;
    }

    /**
     * managepermissions 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setManagepermissions(EntityItemBoolType value) {
        this.managepermissions = value;
    }

    /**
     * managesubwebs 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getManagesubwebs() {
        return managesubwebs;
    }

    /**
     * managesubwebs 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setManagesubwebs(EntityItemBoolType value) {
        this.managesubwebs = value;
    }

    /**
     * manageweb 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getManageweb() {
        return manageweb;
    }

    /**
     * manageweb 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setManageweb(EntityItemBoolType value) {
        this.manageweb = value;
    }

    /**
     * open 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getOpen() {
        return open;
    }

    /**
     * open 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setOpen(EntityItemBoolType value) {
        this.open = value;
    }

    /**
     * useclientintegration 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getUseclientintegration() {
        return useclientintegration;
    }

    /**
     * useclientintegration 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setUseclientintegration(EntityItemBoolType value) {
        this.useclientintegration = value;
    }

    /**
     * useremoteapis 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getUseremoteapis() {
        return useremoteapis;
    }

    /**
     * useremoteapis 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setUseremoteapis(EntityItemBoolType value) {
        this.useremoteapis = value;
    }

    /**
     * viewusagedata 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getViewusagedata() {
        return viewusagedata;
    }

    /**
     * viewusagedata 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setViewusagedata(EntityItemBoolType value) {
        this.viewusagedata = value;
    }

    /**
     * managepersonalviews 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getManagepersonalviews() {
        return managepersonalviews;
    }

    /**
     * managepersonalviews 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setManagepersonalviews(EntityItemBoolType value) {
        this.managepersonalviews = value;
    }

    /**
     * adddelprivatewebparts 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAdddelprivatewebparts() {
        return adddelprivatewebparts;
    }

    /**
     * adddelprivatewebparts 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAdddelprivatewebparts(EntityItemBoolType value) {
        this.adddelprivatewebparts = value;
    }

    /**
     * updatepersonalwebparts 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getUpdatepersonalwebparts() {
        return updatepersonalwebparts;
    }

    /**
     * updatepersonalwebparts 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setUpdatepersonalwebparts(EntityItemBoolType value) {
        this.updatepersonalwebparts = value;
    }

}
