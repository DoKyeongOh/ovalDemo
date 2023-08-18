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
 *         &lt;element name="webapplicationurl" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="allowparttopartcommunication" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allowaccesstowebpartcatalog" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="blockedfileextention" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="defaultquotatemplate" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="externalworkflowparticipantsenabled" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="recyclebinenabled" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="automaticallydeleteunusedsitecollections" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="selfservicesitecreationenabled" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="secondstagerecyclebinquota" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="recyclebinretentionperiod" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="outboundmailserverinstance" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="outboundmailsenderaddress" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="outboundmailreplytoaddress" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="secvalexpires" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="timeout" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="isadministrationwebapplication" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="applicationpoolname" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="applicationpoolusername" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="openitems" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="addlistitems" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="approveitems" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="deletelistitems" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="deleteversions" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="editlistitems" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="managelists" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="viewversions" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="viewlistitems" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="cancelcheckout" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="createalerts" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="viewformpages" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="viewpages" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="addandcustomizepages" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="applystylesheets" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="applythemeandborder" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="browsedirectories" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="browseuserinfo" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="creategroups" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="createsscsite" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="editmyuserinfo" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="enumeratepermissions" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="managealerts" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="managepermissions" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="managesubwebs" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="manageweb" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="open" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="useclientintegration" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="useremoteapis" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="viewusagedata" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="managepersonalviews" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="adddelprivatewebparts" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="updatepersonalwebparts" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
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
public class SpwebapplicationState
    extends StateType
{

    protected EntityStateStringType webapplicationurl;
    protected EntityStateBoolType allowparttopartcommunication;
    protected EntityStateBoolType allowaccesstowebpartcatalog;
    protected EntityStateStringType blockedfileextention;
    protected EntityStateStringType defaultquotatemplate;
    protected EntityStateBoolType externalworkflowparticipantsenabled;
    protected EntityStateBoolType recyclebinenabled;
    protected EntityStateBoolType automaticallydeleteunusedsitecollections;
    protected EntityStateBoolType selfservicesitecreationenabled;
    protected EntityStateIntType secondstagerecyclebinquota;
    protected EntityStateIntType recyclebinretentionperiod;
    protected EntityStateStringType outboundmailserverinstance;
    protected EntityStateStringType outboundmailsenderaddress;
    protected EntityStateStringType outboundmailreplytoaddress;
    protected EntityStateBoolType secvalexpires;
    protected EntityStateIntType timeout;
    protected EntityStateBoolType isadministrationwebapplication;
    protected EntityStateStringType applicationpoolname;
    protected EntityStateStringType applicationpoolusername;
    protected EntityStateBoolType openitems;
    protected EntityStateBoolType addlistitems;
    protected EntityStateBoolType approveitems;
    protected EntityStateBoolType deletelistitems;
    protected EntityStateBoolType deleteversions;
    protected EntityStateBoolType editlistitems;
    protected EntityStateBoolType managelists;
    protected EntityStateBoolType viewversions;
    protected EntityStateBoolType viewlistitems;
    protected EntityStateBoolType cancelcheckout;
    protected EntityStateBoolType createalerts;
    protected EntityStateBoolType viewformpages;
    protected EntityStateBoolType viewpages;
    protected EntityStateBoolType addandcustomizepages;
    protected EntityStateBoolType applystylesheets;
    protected EntityStateBoolType applythemeandborder;
    protected EntityStateBoolType browsedirectories;
    protected EntityStateBoolType browseuserinfo;
    protected EntityStateBoolType creategroups;
    protected EntityStateBoolType createsscsite;
    protected EntityStateBoolType editmyuserinfo;
    protected EntityStateBoolType enumeratepermissions;
    protected EntityStateBoolType managealerts;
    protected EntityStateBoolType managepermissions;
    protected EntityStateBoolType managesubwebs;
    protected EntityStateBoolType manageweb;
    protected EntityStateBoolType open;
    protected EntityStateBoolType useclientintegration;
    protected EntityStateBoolType useremoteapis;
    protected EntityStateBoolType viewusagedata;
    protected EntityStateBoolType managepersonalviews;
    protected EntityStateBoolType adddelprivatewebparts;
    protected EntityStateBoolType updatepersonalwebparts;

    /**
     * webapplicationurl 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getWebapplicationurl() {
        return webapplicationurl;
    }

    /**
     * webapplicationurl 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setWebapplicationurl(EntityStateStringType value) {
        this.webapplicationurl = value;
    }

    /**
     * allowparttopartcommunication 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowparttopartcommunication() {
        return allowparttopartcommunication;
    }

    /**
     * allowparttopartcommunication 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowparttopartcommunication(EntityStateBoolType value) {
        this.allowparttopartcommunication = value;
    }

    /**
     * allowaccesstowebpartcatalog 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowaccesstowebpartcatalog() {
        return allowaccesstowebpartcatalog;
    }

    /**
     * allowaccesstowebpartcatalog 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowaccesstowebpartcatalog(EntityStateBoolType value) {
        this.allowaccesstowebpartcatalog = value;
    }

    /**
     * blockedfileextention 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getBlockedfileextention() {
        return blockedfileextention;
    }

    /**
     * blockedfileextention 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setBlockedfileextention(EntityStateStringType value) {
        this.blockedfileextention = value;
    }

    /**
     * defaultquotatemplate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getDefaultquotatemplate() {
        return defaultquotatemplate;
    }

    /**
     * defaultquotatemplate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setDefaultquotatemplate(EntityStateStringType value) {
        this.defaultquotatemplate = value;
    }

    /**
     * externalworkflowparticipantsenabled 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getExternalworkflowparticipantsenabled() {
        return externalworkflowparticipantsenabled;
    }

    /**
     * externalworkflowparticipantsenabled 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setExternalworkflowparticipantsenabled(EntityStateBoolType value) {
        this.externalworkflowparticipantsenabled = value;
    }

    /**
     * recyclebinenabled 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getRecyclebinenabled() {
        return recyclebinenabled;
    }

    /**
     * recyclebinenabled 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setRecyclebinenabled(EntityStateBoolType value) {
        this.recyclebinenabled = value;
    }

    /**
     * automaticallydeleteunusedsitecollections 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAutomaticallydeleteunusedsitecollections() {
        return automaticallydeleteunusedsitecollections;
    }

    /**
     * automaticallydeleteunusedsitecollections 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAutomaticallydeleteunusedsitecollections(EntityStateBoolType value) {
        this.automaticallydeleteunusedsitecollections = value;
    }

    /**
     * selfservicesitecreationenabled 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSelfservicesitecreationenabled() {
        return selfservicesitecreationenabled;
    }

    /**
     * selfservicesitecreationenabled 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSelfservicesitecreationenabled(EntityStateBoolType value) {
        this.selfservicesitecreationenabled = value;
    }

    /**
     * secondstagerecyclebinquota 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getSecondstagerecyclebinquota() {
        return secondstagerecyclebinquota;
    }

    /**
     * secondstagerecyclebinquota 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setSecondstagerecyclebinquota(EntityStateIntType value) {
        this.secondstagerecyclebinquota = value;
    }

    /**
     * recyclebinretentionperiod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getRecyclebinretentionperiod() {
        return recyclebinretentionperiod;
    }

    /**
     * recyclebinretentionperiod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setRecyclebinretentionperiod(EntityStateIntType value) {
        this.recyclebinretentionperiod = value;
    }

    /**
     * outboundmailserverinstance 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getOutboundmailserverinstance() {
        return outboundmailserverinstance;
    }

    /**
     * outboundmailserverinstance 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setOutboundmailserverinstance(EntityStateStringType value) {
        this.outboundmailserverinstance = value;
    }

    /**
     * outboundmailsenderaddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getOutboundmailsenderaddress() {
        return outboundmailsenderaddress;
    }

    /**
     * outboundmailsenderaddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setOutboundmailsenderaddress(EntityStateStringType value) {
        this.outboundmailsenderaddress = value;
    }

    /**
     * outboundmailreplytoaddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getOutboundmailreplytoaddress() {
        return outboundmailreplytoaddress;
    }

    /**
     * outboundmailreplytoaddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setOutboundmailreplytoaddress(EntityStateStringType value) {
        this.outboundmailreplytoaddress = value;
    }

    /**
     * secvalexpires 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSecvalexpires() {
        return secvalexpires;
    }

    /**
     * secvalexpires 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSecvalexpires(EntityStateBoolType value) {
        this.secvalexpires = value;
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
     * isadministrationwebapplication 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getIsadministrationwebapplication() {
        return isadministrationwebapplication;
    }

    /**
     * isadministrationwebapplication 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setIsadministrationwebapplication(EntityStateBoolType value) {
        this.isadministrationwebapplication = value;
    }

    /**
     * applicationpoolname 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getApplicationpoolname() {
        return applicationpoolname;
    }

    /**
     * applicationpoolname 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setApplicationpoolname(EntityStateStringType value) {
        this.applicationpoolname = value;
    }

    /**
     * applicationpoolusername 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getApplicationpoolusername() {
        return applicationpoolusername;
    }

    /**
     * applicationpoolusername 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setApplicationpoolusername(EntityStateStringType value) {
        this.applicationpoolusername = value;
    }

    /**
     * openitems 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getOpenitems() {
        return openitems;
    }

    /**
     * openitems 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setOpenitems(EntityStateBoolType value) {
        this.openitems = value;
    }

    /**
     * addlistitems 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAddlistitems() {
        return addlistitems;
    }

    /**
     * addlistitems 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAddlistitems(EntityStateBoolType value) {
        this.addlistitems = value;
    }

    /**
     * approveitems 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getApproveitems() {
        return approveitems;
    }

    /**
     * approveitems 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setApproveitems(EntityStateBoolType value) {
        this.approveitems = value;
    }

    /**
     * deletelistitems 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getDeletelistitems() {
        return deletelistitems;
    }

    /**
     * deletelistitems 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setDeletelistitems(EntityStateBoolType value) {
        this.deletelistitems = value;
    }

    /**
     * deleteversions 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getDeleteversions() {
        return deleteversions;
    }

    /**
     * deleteversions 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setDeleteversions(EntityStateBoolType value) {
        this.deleteversions = value;
    }

    /**
     * editlistitems 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getEditlistitems() {
        return editlistitems;
    }

    /**
     * editlistitems 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setEditlistitems(EntityStateBoolType value) {
        this.editlistitems = value;
    }

    /**
     * managelists 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getManagelists() {
        return managelists;
    }

    /**
     * managelists 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setManagelists(EntityStateBoolType value) {
        this.managelists = value;
    }

    /**
     * viewversions 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getViewversions() {
        return viewversions;
    }

    /**
     * viewversions 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setViewversions(EntityStateBoolType value) {
        this.viewversions = value;
    }

    /**
     * viewlistitems 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getViewlistitems() {
        return viewlistitems;
    }

    /**
     * viewlistitems 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setViewlistitems(EntityStateBoolType value) {
        this.viewlistitems = value;
    }

    /**
     * cancelcheckout 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getCancelcheckout() {
        return cancelcheckout;
    }

    /**
     * cancelcheckout 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setCancelcheckout(EntityStateBoolType value) {
        this.cancelcheckout = value;
    }

    /**
     * createalerts 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getCreatealerts() {
        return createalerts;
    }

    /**
     * createalerts 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setCreatealerts(EntityStateBoolType value) {
        this.createalerts = value;
    }

    /**
     * viewformpages 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getViewformpages() {
        return viewformpages;
    }

    /**
     * viewformpages 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setViewformpages(EntityStateBoolType value) {
        this.viewformpages = value;
    }

    /**
     * viewpages 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getViewpages() {
        return viewpages;
    }

    /**
     * viewpages 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setViewpages(EntityStateBoolType value) {
        this.viewpages = value;
    }

    /**
     * addandcustomizepages 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAddandcustomizepages() {
        return addandcustomizepages;
    }

    /**
     * addandcustomizepages 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAddandcustomizepages(EntityStateBoolType value) {
        this.addandcustomizepages = value;
    }

    /**
     * applystylesheets 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getApplystylesheets() {
        return applystylesheets;
    }

    /**
     * applystylesheets 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setApplystylesheets(EntityStateBoolType value) {
        this.applystylesheets = value;
    }

    /**
     * applythemeandborder 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getApplythemeandborder() {
        return applythemeandborder;
    }

    /**
     * applythemeandborder 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setApplythemeandborder(EntityStateBoolType value) {
        this.applythemeandborder = value;
    }

    /**
     * browsedirectories 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getBrowsedirectories() {
        return browsedirectories;
    }

    /**
     * browsedirectories 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setBrowsedirectories(EntityStateBoolType value) {
        this.browsedirectories = value;
    }

    /**
     * browseuserinfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getBrowseuserinfo() {
        return browseuserinfo;
    }

    /**
     * browseuserinfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setBrowseuserinfo(EntityStateBoolType value) {
        this.browseuserinfo = value;
    }

    /**
     * creategroups 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getCreategroups() {
        return creategroups;
    }

    /**
     * creategroups 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setCreategroups(EntityStateBoolType value) {
        this.creategroups = value;
    }

    /**
     * createsscsite 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getCreatesscsite() {
        return createsscsite;
    }

    /**
     * createsscsite 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setCreatesscsite(EntityStateBoolType value) {
        this.createsscsite = value;
    }

    /**
     * editmyuserinfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getEditmyuserinfo() {
        return editmyuserinfo;
    }

    /**
     * editmyuserinfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setEditmyuserinfo(EntityStateBoolType value) {
        this.editmyuserinfo = value;
    }

    /**
     * enumeratepermissions 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getEnumeratepermissions() {
        return enumeratepermissions;
    }

    /**
     * enumeratepermissions 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setEnumeratepermissions(EntityStateBoolType value) {
        this.enumeratepermissions = value;
    }

    /**
     * managealerts 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getManagealerts() {
        return managealerts;
    }

    /**
     * managealerts 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setManagealerts(EntityStateBoolType value) {
        this.managealerts = value;
    }

    /**
     * managepermissions 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getManagepermissions() {
        return managepermissions;
    }

    /**
     * managepermissions 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setManagepermissions(EntityStateBoolType value) {
        this.managepermissions = value;
    }

    /**
     * managesubwebs 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getManagesubwebs() {
        return managesubwebs;
    }

    /**
     * managesubwebs 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setManagesubwebs(EntityStateBoolType value) {
        this.managesubwebs = value;
    }

    /**
     * manageweb 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getManageweb() {
        return manageweb;
    }

    /**
     * manageweb 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setManageweb(EntityStateBoolType value) {
        this.manageweb = value;
    }

    /**
     * open 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getOpen() {
        return open;
    }

    /**
     * open 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setOpen(EntityStateBoolType value) {
        this.open = value;
    }

    /**
     * useclientintegration 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getUseclientintegration() {
        return useclientintegration;
    }

    /**
     * useclientintegration 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setUseclientintegration(EntityStateBoolType value) {
        this.useclientintegration = value;
    }

    /**
     * useremoteapis 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getUseremoteapis() {
        return useremoteapis;
    }

    /**
     * useremoteapis 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setUseremoteapis(EntityStateBoolType value) {
        this.useremoteapis = value;
    }

    /**
     * viewusagedata 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getViewusagedata() {
        return viewusagedata;
    }

    /**
     * viewusagedata 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setViewusagedata(EntityStateBoolType value) {
        this.viewusagedata = value;
    }

    /**
     * managepersonalviews 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getManagepersonalviews() {
        return managepersonalviews;
    }

    /**
     * managepersonalviews 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setManagepersonalviews(EntityStateBoolType value) {
        this.managepersonalviews = value;
    }

    /**
     * adddelprivatewebparts 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAdddelprivatewebparts() {
        return adddelprivatewebparts;
    }

    /**
     * adddelprivatewebparts 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAdddelprivatewebparts(EntityStateBoolType value) {
        this.adddelprivatewebparts = value;
    }

    /**
     * updatepersonalwebparts 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getUpdatepersonalwebparts() {
        return updatepersonalwebparts;
    }

    /**
     * updatepersonalwebparts 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setUpdatepersonalwebparts(EntityStateBoolType value) {
        this.updatepersonalwebparts = value;
    }

}
