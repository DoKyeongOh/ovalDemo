//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_windows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="credential_validation" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="kerberos_authentication_service" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="kerberos_service_ticket_operations" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="kerberos_ticket_events" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="other_account_logon_events" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="application_group_management" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="computer_account_management" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="distribution_group_management" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="other_account_management_events" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="security_group_management" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="user_account_management" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="dpapi_activity" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="process_creation" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="process_termination" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="rpc_events" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="directory_service_access" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="directory_service_changes" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="directory_service_replication" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="detailed_directory_service_replication" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="account_lockout" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="ipsec_extended_mode" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="ipsec_main_mode" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="ipsec_quick_mode" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="logoff" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="logon" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="network_policy_server" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="other_logon_logoff_events" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="special_logon" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="logon_claims" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="application_generated" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="certification_services" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="detailed_file_share" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="file_share" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="file_system" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="filtering_platform_connection" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="filtering_platform_packet_drop" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="handle_manipulation" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="kernel_object" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="other_object_access_events" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="registry" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="sam" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="removable_storage" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="central_access_policy_staging" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="audit_policy_change" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="authentication_policy_change" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="authorization_policy_change" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="filtering_platform_policy_change" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="mpssvc_rule_level_policy_change" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="other_policy_change_events" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="non_sensitive_privilege_use" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="other_privilege_use_events" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="sensitive_privilege_use" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="ipsec_driver" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="other_system_events" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="security_state_change" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="security_system_extension" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="system_integrity" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="group_membership" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="pnp_activity" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="user_device_claims" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="audit_detailedtracking_tokenrightadjusted" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
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
    "credentialValidation",
    "kerberosAuthenticationService",
    "kerberosServiceTicketOperations",
    "kerberosTicketEvents",
    "otherAccountLogonEvents",
    "applicationGroupManagement",
    "computerAccountManagement",
    "distributionGroupManagement",
    "otherAccountManagementEvents",
    "securityGroupManagement",
    "userAccountManagement",
    "dpapiActivity",
    "processCreation",
    "processTermination",
    "rpcEvents",
    "directoryServiceAccess",
    "directoryServiceChanges",
    "directoryServiceReplication",
    "detailedDirectoryServiceReplication",
    "accountLockout",
    "ipsecExtendedMode",
    "ipsecMainMode",
    "ipsecQuickMode",
    "logoff",
    "logon",
    "networkPolicyServer",
    "otherLogonLogoffEvents",
    "specialLogon",
    "logonClaims",
    "applicationGenerated",
    "certificationServices",
    "detailedFileShare",
    "fileShare",
    "fileSystem",
    "filteringPlatformConnection",
    "filteringPlatformPacketDrop",
    "handleManipulation",
    "kernelObject",
    "otherObjectAccessEvents",
    "registry",
    "sam",
    "removableStorage",
    "centralAccessPolicyStaging",
    "auditPolicyChange",
    "authenticationPolicyChange",
    "authorizationPolicyChange",
    "filteringPlatformPolicyChange",
    "mpssvcRuleLevelPolicyChange",
    "otherPolicyChangeEvents",
    "nonSensitivePrivilegeUse",
    "otherPrivilegeUseEvents",
    "sensitivePrivilegeUse",
    "ipsecDriver",
    "otherSystemEvents",
    "securityStateChange",
    "securitySystemExtension",
    "systemIntegrity",
    "groupMembership",
    "pnpActivity",
    "userDeviceClaims",
    "auditDetailedtrackingTokenrightadjusted"
})
public class AuditeventpolicysubcategoriesItem
    extends ItemType
{

    @XmlElement(name = "credential_validation")
    protected EntityItemAuditType credentialValidation;
    @XmlElement(name = "kerberos_authentication_service")
    protected EntityItemAuditType kerberosAuthenticationService;
    @XmlElement(name = "kerberos_service_ticket_operations")
    protected EntityItemAuditType kerberosServiceTicketOperations;
    @XmlElement(name = "kerberos_ticket_events")
    protected EntityItemAuditType kerberosTicketEvents;
    @XmlElement(name = "other_account_logon_events")
    protected EntityItemAuditType otherAccountLogonEvents;
    @XmlElement(name = "application_group_management")
    protected EntityItemAuditType applicationGroupManagement;
    @XmlElement(name = "computer_account_management")
    protected EntityItemAuditType computerAccountManagement;
    @XmlElement(name = "distribution_group_management")
    protected EntityItemAuditType distributionGroupManagement;
    @XmlElement(name = "other_account_management_events")
    protected EntityItemAuditType otherAccountManagementEvents;
    @XmlElement(name = "security_group_management")
    protected EntityItemAuditType securityGroupManagement;
    @XmlElement(name = "user_account_management")
    protected EntityItemAuditType userAccountManagement;
    @XmlElement(name = "dpapi_activity")
    protected EntityItemAuditType dpapiActivity;
    @XmlElement(name = "process_creation")
    protected EntityItemAuditType processCreation;
    @XmlElement(name = "process_termination")
    protected EntityItemAuditType processTermination;
    @XmlElement(name = "rpc_events")
    protected EntityItemAuditType rpcEvents;
    @XmlElement(name = "directory_service_access")
    protected EntityItemAuditType directoryServiceAccess;
    @XmlElement(name = "directory_service_changes")
    protected EntityItemAuditType directoryServiceChanges;
    @XmlElement(name = "directory_service_replication")
    protected EntityItemAuditType directoryServiceReplication;
    @XmlElement(name = "detailed_directory_service_replication")
    protected EntityItemAuditType detailedDirectoryServiceReplication;
    @XmlElement(name = "account_lockout")
    protected EntityItemAuditType accountLockout;
    @XmlElement(name = "ipsec_extended_mode")
    protected EntityItemAuditType ipsecExtendedMode;
    @XmlElement(name = "ipsec_main_mode")
    protected EntityItemAuditType ipsecMainMode;
    @XmlElement(name = "ipsec_quick_mode")
    protected EntityItemAuditType ipsecQuickMode;
    protected EntityItemAuditType logoff;
    protected EntityItemAuditType logon;
    @XmlElement(name = "network_policy_server")
    protected EntityItemAuditType networkPolicyServer;
    @XmlElement(name = "other_logon_logoff_events")
    protected EntityItemAuditType otherLogonLogoffEvents;
    @XmlElement(name = "special_logon")
    protected EntityItemAuditType specialLogon;
    @XmlElement(name = "logon_claims")
    protected EntityItemAuditType logonClaims;
    @XmlElement(name = "application_generated")
    protected EntityItemAuditType applicationGenerated;
    @XmlElement(name = "certification_services")
    protected EntityItemAuditType certificationServices;
    @XmlElement(name = "detailed_file_share")
    protected EntityItemAuditType detailedFileShare;
    @XmlElement(name = "file_share")
    protected EntityItemAuditType fileShare;
    @XmlElement(name = "file_system")
    protected EntityItemAuditType fileSystem;
    @XmlElement(name = "filtering_platform_connection")
    protected EntityItemAuditType filteringPlatformConnection;
    @XmlElement(name = "filtering_platform_packet_drop")
    protected EntityItemAuditType filteringPlatformPacketDrop;
    @XmlElement(name = "handle_manipulation")
    protected EntityItemAuditType handleManipulation;
    @XmlElement(name = "kernel_object")
    protected EntityItemAuditType kernelObject;
    @XmlElement(name = "other_object_access_events")
    protected EntityItemAuditType otherObjectAccessEvents;
    protected EntityItemAuditType registry;
    protected EntityItemAuditType sam;
    @XmlElement(name = "removable_storage")
    protected EntityItemAuditType removableStorage;
    @XmlElement(name = "central_access_policy_staging")
    protected EntityItemAuditType centralAccessPolicyStaging;
    @XmlElement(name = "audit_policy_change")
    protected EntityItemAuditType auditPolicyChange;
    @XmlElement(name = "authentication_policy_change")
    protected EntityItemAuditType authenticationPolicyChange;
    @XmlElement(name = "authorization_policy_change")
    protected EntityItemAuditType authorizationPolicyChange;
    @XmlElement(name = "filtering_platform_policy_change")
    protected EntityItemAuditType filteringPlatformPolicyChange;
    @XmlElement(name = "mpssvc_rule_level_policy_change")
    protected EntityItemAuditType mpssvcRuleLevelPolicyChange;
    @XmlElement(name = "other_policy_change_events")
    protected EntityItemAuditType otherPolicyChangeEvents;
    @XmlElement(name = "non_sensitive_privilege_use")
    protected EntityItemAuditType nonSensitivePrivilegeUse;
    @XmlElement(name = "other_privilege_use_events")
    protected EntityItemAuditType otherPrivilegeUseEvents;
    @XmlElement(name = "sensitive_privilege_use")
    protected EntityItemAuditType sensitivePrivilegeUse;
    @XmlElement(name = "ipsec_driver")
    protected EntityItemAuditType ipsecDriver;
    @XmlElement(name = "other_system_events")
    protected EntityItemAuditType otherSystemEvents;
    @XmlElement(name = "security_state_change")
    protected EntityItemAuditType securityStateChange;
    @XmlElement(name = "security_system_extension")
    protected EntityItemAuditType securitySystemExtension;
    @XmlElement(name = "system_integrity")
    protected EntityItemAuditType systemIntegrity;
    @XmlElement(name = "group_membership")
    protected EntityItemAuditType groupMembership;
    @XmlElement(name = "pnp_activity")
    protected EntityItemAuditType pnpActivity;
    @XmlElement(name = "user_device_claims")
    protected EntityItemAuditType userDeviceClaims;
    @XmlElement(name = "audit_detailedtracking_tokenrightadjusted")
    protected EntityItemAuditType auditDetailedtrackingTokenrightadjusted;

    /**
     * credentialValidation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getCredentialValidation() {
        return credentialValidation;
    }

    /**
     * credentialValidation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setCredentialValidation(EntityItemAuditType value) {
        this.credentialValidation = value;
    }

    /**
     * kerberosAuthenticationService 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getKerberosAuthenticationService() {
        return kerberosAuthenticationService;
    }

    /**
     * kerberosAuthenticationService 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setKerberosAuthenticationService(EntityItemAuditType value) {
        this.kerberosAuthenticationService = value;
    }

    /**
     * kerberosServiceTicketOperations 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getKerberosServiceTicketOperations() {
        return kerberosServiceTicketOperations;
    }

    /**
     * kerberosServiceTicketOperations 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setKerberosServiceTicketOperations(EntityItemAuditType value) {
        this.kerberosServiceTicketOperations = value;
    }

    /**
     * kerberosTicketEvents 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getKerberosTicketEvents() {
        return kerberosTicketEvents;
    }

    /**
     * kerberosTicketEvents 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setKerberosTicketEvents(EntityItemAuditType value) {
        this.kerberosTicketEvents = value;
    }

    /**
     * otherAccountLogonEvents 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getOtherAccountLogonEvents() {
        return otherAccountLogonEvents;
    }

    /**
     * otherAccountLogonEvents 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setOtherAccountLogonEvents(EntityItemAuditType value) {
        this.otherAccountLogonEvents = value;
    }

    /**
     * applicationGroupManagement 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getApplicationGroupManagement() {
        return applicationGroupManagement;
    }

    /**
     * applicationGroupManagement 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setApplicationGroupManagement(EntityItemAuditType value) {
        this.applicationGroupManagement = value;
    }

    /**
     * computerAccountManagement 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getComputerAccountManagement() {
        return computerAccountManagement;
    }

    /**
     * computerAccountManagement 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setComputerAccountManagement(EntityItemAuditType value) {
        this.computerAccountManagement = value;
    }

    /**
     * distributionGroupManagement 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getDistributionGroupManagement() {
        return distributionGroupManagement;
    }

    /**
     * distributionGroupManagement 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setDistributionGroupManagement(EntityItemAuditType value) {
        this.distributionGroupManagement = value;
    }

    /**
     * otherAccountManagementEvents 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getOtherAccountManagementEvents() {
        return otherAccountManagementEvents;
    }

    /**
     * otherAccountManagementEvents 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setOtherAccountManagementEvents(EntityItemAuditType value) {
        this.otherAccountManagementEvents = value;
    }

    /**
     * securityGroupManagement 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getSecurityGroupManagement() {
        return securityGroupManagement;
    }

    /**
     * securityGroupManagement 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setSecurityGroupManagement(EntityItemAuditType value) {
        this.securityGroupManagement = value;
    }

    /**
     * userAccountManagement 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getUserAccountManagement() {
        return userAccountManagement;
    }

    /**
     * userAccountManagement 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setUserAccountManagement(EntityItemAuditType value) {
        this.userAccountManagement = value;
    }

    /**
     * dpapiActivity 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getDpapiActivity() {
        return dpapiActivity;
    }

    /**
     * dpapiActivity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setDpapiActivity(EntityItemAuditType value) {
        this.dpapiActivity = value;
    }

    /**
     * processCreation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getProcessCreation() {
        return processCreation;
    }

    /**
     * processCreation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setProcessCreation(EntityItemAuditType value) {
        this.processCreation = value;
    }

    /**
     * processTermination 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getProcessTermination() {
        return processTermination;
    }

    /**
     * processTermination 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setProcessTermination(EntityItemAuditType value) {
        this.processTermination = value;
    }

    /**
     * rpcEvents 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getRpcEvents() {
        return rpcEvents;
    }

    /**
     * rpcEvents 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setRpcEvents(EntityItemAuditType value) {
        this.rpcEvents = value;
    }

    /**
     * directoryServiceAccess 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getDirectoryServiceAccess() {
        return directoryServiceAccess;
    }

    /**
     * directoryServiceAccess 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setDirectoryServiceAccess(EntityItemAuditType value) {
        this.directoryServiceAccess = value;
    }

    /**
     * directoryServiceChanges 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getDirectoryServiceChanges() {
        return directoryServiceChanges;
    }

    /**
     * directoryServiceChanges 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setDirectoryServiceChanges(EntityItemAuditType value) {
        this.directoryServiceChanges = value;
    }

    /**
     * directoryServiceReplication 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getDirectoryServiceReplication() {
        return directoryServiceReplication;
    }

    /**
     * directoryServiceReplication 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setDirectoryServiceReplication(EntityItemAuditType value) {
        this.directoryServiceReplication = value;
    }

    /**
     * detailedDirectoryServiceReplication 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getDetailedDirectoryServiceReplication() {
        return detailedDirectoryServiceReplication;
    }

    /**
     * detailedDirectoryServiceReplication 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setDetailedDirectoryServiceReplication(EntityItemAuditType value) {
        this.detailedDirectoryServiceReplication = value;
    }

    /**
     * accountLockout 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getAccountLockout() {
        return accountLockout;
    }

    /**
     * accountLockout 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setAccountLockout(EntityItemAuditType value) {
        this.accountLockout = value;
    }

    /**
     * ipsecExtendedMode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getIpsecExtendedMode() {
        return ipsecExtendedMode;
    }

    /**
     * ipsecExtendedMode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setIpsecExtendedMode(EntityItemAuditType value) {
        this.ipsecExtendedMode = value;
    }

    /**
     * ipsecMainMode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getIpsecMainMode() {
        return ipsecMainMode;
    }

    /**
     * ipsecMainMode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setIpsecMainMode(EntityItemAuditType value) {
        this.ipsecMainMode = value;
    }

    /**
     * ipsecQuickMode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getIpsecQuickMode() {
        return ipsecQuickMode;
    }

    /**
     * ipsecQuickMode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setIpsecQuickMode(EntityItemAuditType value) {
        this.ipsecQuickMode = value;
    }

    /**
     * logoff 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getLogoff() {
        return logoff;
    }

    /**
     * logoff 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setLogoff(EntityItemAuditType value) {
        this.logoff = value;
    }

    /**
     * logon 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getLogon() {
        return logon;
    }

    /**
     * logon 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setLogon(EntityItemAuditType value) {
        this.logon = value;
    }

    /**
     * networkPolicyServer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getNetworkPolicyServer() {
        return networkPolicyServer;
    }

    /**
     * networkPolicyServer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setNetworkPolicyServer(EntityItemAuditType value) {
        this.networkPolicyServer = value;
    }

    /**
     * otherLogonLogoffEvents 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getOtherLogonLogoffEvents() {
        return otherLogonLogoffEvents;
    }

    /**
     * otherLogonLogoffEvents 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setOtherLogonLogoffEvents(EntityItemAuditType value) {
        this.otherLogonLogoffEvents = value;
    }

    /**
     * specialLogon 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getSpecialLogon() {
        return specialLogon;
    }

    /**
     * specialLogon 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setSpecialLogon(EntityItemAuditType value) {
        this.specialLogon = value;
    }

    /**
     * logonClaims 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getLogonClaims() {
        return logonClaims;
    }

    /**
     * logonClaims 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setLogonClaims(EntityItemAuditType value) {
        this.logonClaims = value;
    }

    /**
     * applicationGenerated 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getApplicationGenerated() {
        return applicationGenerated;
    }

    /**
     * applicationGenerated 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setApplicationGenerated(EntityItemAuditType value) {
        this.applicationGenerated = value;
    }

    /**
     * certificationServices 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getCertificationServices() {
        return certificationServices;
    }

    /**
     * certificationServices 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setCertificationServices(EntityItemAuditType value) {
        this.certificationServices = value;
    }

    /**
     * detailedFileShare 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getDetailedFileShare() {
        return detailedFileShare;
    }

    /**
     * detailedFileShare 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setDetailedFileShare(EntityItemAuditType value) {
        this.detailedFileShare = value;
    }

    /**
     * fileShare 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getFileShare() {
        return fileShare;
    }

    /**
     * fileShare 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setFileShare(EntityItemAuditType value) {
        this.fileShare = value;
    }

    /**
     * fileSystem 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getFileSystem() {
        return fileSystem;
    }

    /**
     * fileSystem 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setFileSystem(EntityItemAuditType value) {
        this.fileSystem = value;
    }

    /**
     * filteringPlatformConnection 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getFilteringPlatformConnection() {
        return filteringPlatformConnection;
    }

    /**
     * filteringPlatformConnection 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setFilteringPlatformConnection(EntityItemAuditType value) {
        this.filteringPlatformConnection = value;
    }

    /**
     * filteringPlatformPacketDrop 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getFilteringPlatformPacketDrop() {
        return filteringPlatformPacketDrop;
    }

    /**
     * filteringPlatformPacketDrop 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setFilteringPlatformPacketDrop(EntityItemAuditType value) {
        this.filteringPlatformPacketDrop = value;
    }

    /**
     * handleManipulation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getHandleManipulation() {
        return handleManipulation;
    }

    /**
     * handleManipulation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setHandleManipulation(EntityItemAuditType value) {
        this.handleManipulation = value;
    }

    /**
     * kernelObject 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getKernelObject() {
        return kernelObject;
    }

    /**
     * kernelObject 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setKernelObject(EntityItemAuditType value) {
        this.kernelObject = value;
    }

    /**
     * otherObjectAccessEvents 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getOtherObjectAccessEvents() {
        return otherObjectAccessEvents;
    }

    /**
     * otherObjectAccessEvents 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setOtherObjectAccessEvents(EntityItemAuditType value) {
        this.otherObjectAccessEvents = value;
    }

    /**
     * registry 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getRegistry() {
        return registry;
    }

    /**
     * registry 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setRegistry(EntityItemAuditType value) {
        this.registry = value;
    }

    /**
     * sam 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getSam() {
        return sam;
    }

    /**
     * sam 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setSam(EntityItemAuditType value) {
        this.sam = value;
    }

    /**
     * removableStorage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getRemovableStorage() {
        return removableStorage;
    }

    /**
     * removableStorage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setRemovableStorage(EntityItemAuditType value) {
        this.removableStorage = value;
    }

    /**
     * centralAccessPolicyStaging 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getCentralAccessPolicyStaging() {
        return centralAccessPolicyStaging;
    }

    /**
     * centralAccessPolicyStaging 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setCentralAccessPolicyStaging(EntityItemAuditType value) {
        this.centralAccessPolicyStaging = value;
    }

    /**
     * auditPolicyChange 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getAuditPolicyChange() {
        return auditPolicyChange;
    }

    /**
     * auditPolicyChange 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setAuditPolicyChange(EntityItemAuditType value) {
        this.auditPolicyChange = value;
    }

    /**
     * authenticationPolicyChange 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getAuthenticationPolicyChange() {
        return authenticationPolicyChange;
    }

    /**
     * authenticationPolicyChange 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setAuthenticationPolicyChange(EntityItemAuditType value) {
        this.authenticationPolicyChange = value;
    }

    /**
     * authorizationPolicyChange 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getAuthorizationPolicyChange() {
        return authorizationPolicyChange;
    }

    /**
     * authorizationPolicyChange 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setAuthorizationPolicyChange(EntityItemAuditType value) {
        this.authorizationPolicyChange = value;
    }

    /**
     * filteringPlatformPolicyChange 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getFilteringPlatformPolicyChange() {
        return filteringPlatformPolicyChange;
    }

    /**
     * filteringPlatformPolicyChange 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setFilteringPlatformPolicyChange(EntityItemAuditType value) {
        this.filteringPlatformPolicyChange = value;
    }

    /**
     * mpssvcRuleLevelPolicyChange 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getMpssvcRuleLevelPolicyChange() {
        return mpssvcRuleLevelPolicyChange;
    }

    /**
     * mpssvcRuleLevelPolicyChange 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setMpssvcRuleLevelPolicyChange(EntityItemAuditType value) {
        this.mpssvcRuleLevelPolicyChange = value;
    }

    /**
     * otherPolicyChangeEvents 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getOtherPolicyChangeEvents() {
        return otherPolicyChangeEvents;
    }

    /**
     * otherPolicyChangeEvents 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setOtherPolicyChangeEvents(EntityItemAuditType value) {
        this.otherPolicyChangeEvents = value;
    }

    /**
     * nonSensitivePrivilegeUse 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getNonSensitivePrivilegeUse() {
        return nonSensitivePrivilegeUse;
    }

    /**
     * nonSensitivePrivilegeUse 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setNonSensitivePrivilegeUse(EntityItemAuditType value) {
        this.nonSensitivePrivilegeUse = value;
    }

    /**
     * otherPrivilegeUseEvents 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getOtherPrivilegeUseEvents() {
        return otherPrivilegeUseEvents;
    }

    /**
     * otherPrivilegeUseEvents 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setOtherPrivilegeUseEvents(EntityItemAuditType value) {
        this.otherPrivilegeUseEvents = value;
    }

    /**
     * sensitivePrivilegeUse 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getSensitivePrivilegeUse() {
        return sensitivePrivilegeUse;
    }

    /**
     * sensitivePrivilegeUse 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setSensitivePrivilegeUse(EntityItemAuditType value) {
        this.sensitivePrivilegeUse = value;
    }

    /**
     * ipsecDriver 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getIpsecDriver() {
        return ipsecDriver;
    }

    /**
     * ipsecDriver 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setIpsecDriver(EntityItemAuditType value) {
        this.ipsecDriver = value;
    }

    /**
     * otherSystemEvents 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getOtherSystemEvents() {
        return otherSystemEvents;
    }

    /**
     * otherSystemEvents 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setOtherSystemEvents(EntityItemAuditType value) {
        this.otherSystemEvents = value;
    }

    /**
     * securityStateChange 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getSecurityStateChange() {
        return securityStateChange;
    }

    /**
     * securityStateChange 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setSecurityStateChange(EntityItemAuditType value) {
        this.securityStateChange = value;
    }

    /**
     * securitySystemExtension 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getSecuritySystemExtension() {
        return securitySystemExtension;
    }

    /**
     * securitySystemExtension 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setSecuritySystemExtension(EntityItemAuditType value) {
        this.securitySystemExtension = value;
    }

    /**
     * systemIntegrity 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getSystemIntegrity() {
        return systemIntegrity;
    }

    /**
     * systemIntegrity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setSystemIntegrity(EntityItemAuditType value) {
        this.systemIntegrity = value;
    }

    /**
     * groupMembership 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getGroupMembership() {
        return groupMembership;
    }

    /**
     * groupMembership 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setGroupMembership(EntityItemAuditType value) {
        this.groupMembership = value;
    }

    /**
     * pnpActivity 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getPnpActivity() {
        return pnpActivity;
    }

    /**
     * pnpActivity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setPnpActivity(EntityItemAuditType value) {
        this.pnpActivity = value;
    }

    /**
     * userDeviceClaims 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getUserDeviceClaims() {
        return userDeviceClaims;
    }

    /**
     * userDeviceClaims 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setUserDeviceClaims(EntityItemAuditType value) {
        this.userDeviceClaims = value;
    }

    /**
     * auditDetailedtrackingTokenrightadjusted 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getAuditDetailedtrackingTokenrightadjusted() {
        return auditDetailedtrackingTokenrightadjusted;
    }

    /**
     * auditDetailedtrackingTokenrightadjusted 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setAuditDetailedtrackingTokenrightadjusted(EntityItemAuditType value) {
        this.auditDetailedtrackingTokenrightadjusted = value;
    }

}
