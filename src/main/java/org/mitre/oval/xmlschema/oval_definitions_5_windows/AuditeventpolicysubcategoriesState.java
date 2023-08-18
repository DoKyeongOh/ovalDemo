//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5_windows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="credential_validation" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="kerberos_authentication_service" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="kerberos_service_ticket_operations" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="kerberos_ticket_events" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="other_account_logon_events" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="application_group_management" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="computer_account_management" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="distribution_group_management" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="other_account_management_events" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="security_group_management" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="user_account_management" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="dpapi_activity" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="process_creation" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="process_termination" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="rpc_events" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="directory_service_access" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="directory_service_changes" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="directory_service_replication" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="detailed_directory_service_replication" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="account_lockout" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="ipsec_extended_mode" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="ipsec_main_mode" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="ipsec_quick_mode" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="logoff" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="logon" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="network_policy_server" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="other_logon_logoff_events" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="special_logon" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="logon_claims" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="application_generated" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="certification_services" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="detailed_file_share" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="file_share" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="file_system" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="filtering_platform_connection" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="filtering_platform_packet_drop" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="handle_manipulation" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="kernel_object" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="other_object_access_events" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="registry" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="sam" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="removable_storage" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="central_access_policy_staging" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="audit_policy_change" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="authentication_policy_change" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="authorization_policy_change" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="filtering_platform_policy_change" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="mpssvc_rule_level_policy_change" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="other_policy_change_events" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="non_sensitive_privilege_use" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="other_privilege_use_events" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="sensitive_privilege_use" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="ipsec_driver" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="other_system_events" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="security_state_change" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="security_system_extension" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="system_integrity" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="group_membership" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="pnp_activity" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="user_device_claims" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="audit_detailedtracking_tokenrightadjusted" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
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
public class AuditeventpolicysubcategoriesState
    extends StateType
{

    @XmlElement(name = "credential_validation")
    protected EntityStateAuditType credentialValidation;
    @XmlElement(name = "kerberos_authentication_service")
    protected EntityStateAuditType kerberosAuthenticationService;
    @XmlElement(name = "kerberos_service_ticket_operations")
    protected EntityStateAuditType kerberosServiceTicketOperations;
    @XmlElement(name = "kerberos_ticket_events")
    protected EntityStateAuditType kerberosTicketEvents;
    @XmlElement(name = "other_account_logon_events")
    protected EntityStateAuditType otherAccountLogonEvents;
    @XmlElement(name = "application_group_management")
    protected EntityStateAuditType applicationGroupManagement;
    @XmlElement(name = "computer_account_management")
    protected EntityStateAuditType computerAccountManagement;
    @XmlElement(name = "distribution_group_management")
    protected EntityStateAuditType distributionGroupManagement;
    @XmlElement(name = "other_account_management_events")
    protected EntityStateAuditType otherAccountManagementEvents;
    @XmlElement(name = "security_group_management")
    protected EntityStateAuditType securityGroupManagement;
    @XmlElement(name = "user_account_management")
    protected EntityStateAuditType userAccountManagement;
    @XmlElement(name = "dpapi_activity")
    protected EntityStateAuditType dpapiActivity;
    @XmlElement(name = "process_creation")
    protected EntityStateAuditType processCreation;
    @XmlElement(name = "process_termination")
    protected EntityStateAuditType processTermination;
    @XmlElement(name = "rpc_events")
    protected EntityStateAuditType rpcEvents;
    @XmlElement(name = "directory_service_access")
    protected EntityStateAuditType directoryServiceAccess;
    @XmlElement(name = "directory_service_changes")
    protected EntityStateAuditType directoryServiceChanges;
    @XmlElement(name = "directory_service_replication")
    protected EntityStateAuditType directoryServiceReplication;
    @XmlElement(name = "detailed_directory_service_replication")
    protected EntityStateAuditType detailedDirectoryServiceReplication;
    @XmlElement(name = "account_lockout")
    protected EntityStateAuditType accountLockout;
    @XmlElement(name = "ipsec_extended_mode")
    protected EntityStateAuditType ipsecExtendedMode;
    @XmlElement(name = "ipsec_main_mode")
    protected EntityStateAuditType ipsecMainMode;
    @XmlElement(name = "ipsec_quick_mode")
    protected EntityStateAuditType ipsecQuickMode;
    protected EntityStateAuditType logoff;
    protected EntityStateAuditType logon;
    @XmlElement(name = "network_policy_server")
    protected EntityStateAuditType networkPolicyServer;
    @XmlElement(name = "other_logon_logoff_events")
    protected EntityStateAuditType otherLogonLogoffEvents;
    @XmlElement(name = "special_logon")
    protected EntityStateAuditType specialLogon;
    @XmlElement(name = "logon_claims")
    protected EntityStateAuditType logonClaims;
    @XmlElement(name = "application_generated")
    protected EntityStateAuditType applicationGenerated;
    @XmlElement(name = "certification_services")
    protected EntityStateAuditType certificationServices;
    @XmlElement(name = "detailed_file_share")
    protected EntityStateAuditType detailedFileShare;
    @XmlElement(name = "file_share")
    protected EntityStateAuditType fileShare;
    @XmlElement(name = "file_system")
    protected EntityStateAuditType fileSystem;
    @XmlElement(name = "filtering_platform_connection")
    protected EntityStateAuditType filteringPlatformConnection;
    @XmlElement(name = "filtering_platform_packet_drop")
    protected EntityStateAuditType filteringPlatformPacketDrop;
    @XmlElement(name = "handle_manipulation")
    protected EntityStateAuditType handleManipulation;
    @XmlElement(name = "kernel_object")
    protected EntityStateAuditType kernelObject;
    @XmlElement(name = "other_object_access_events")
    protected EntityStateAuditType otherObjectAccessEvents;
    protected EntityStateAuditType registry;
    protected EntityStateAuditType sam;
    @XmlElement(name = "removable_storage")
    protected EntityStateAuditType removableStorage;
    @XmlElement(name = "central_access_policy_staging")
    protected EntityStateAuditType centralAccessPolicyStaging;
    @XmlElement(name = "audit_policy_change")
    protected EntityStateAuditType auditPolicyChange;
    @XmlElement(name = "authentication_policy_change")
    protected EntityStateAuditType authenticationPolicyChange;
    @XmlElement(name = "authorization_policy_change")
    protected EntityStateAuditType authorizationPolicyChange;
    @XmlElement(name = "filtering_platform_policy_change")
    protected EntityStateAuditType filteringPlatformPolicyChange;
    @XmlElement(name = "mpssvc_rule_level_policy_change")
    protected EntityStateAuditType mpssvcRuleLevelPolicyChange;
    @XmlElement(name = "other_policy_change_events")
    protected EntityStateAuditType otherPolicyChangeEvents;
    @XmlElement(name = "non_sensitive_privilege_use")
    protected EntityStateAuditType nonSensitivePrivilegeUse;
    @XmlElement(name = "other_privilege_use_events")
    protected EntityStateAuditType otherPrivilegeUseEvents;
    @XmlElement(name = "sensitive_privilege_use")
    protected EntityStateAuditType sensitivePrivilegeUse;
    @XmlElement(name = "ipsec_driver")
    protected EntityStateAuditType ipsecDriver;
    @XmlElement(name = "other_system_events")
    protected EntityStateAuditType otherSystemEvents;
    @XmlElement(name = "security_state_change")
    protected EntityStateAuditType securityStateChange;
    @XmlElement(name = "security_system_extension")
    protected EntityStateAuditType securitySystemExtension;
    @XmlElement(name = "system_integrity")
    protected EntityStateAuditType systemIntegrity;
    @XmlElement(name = "group_membership")
    protected EntityStateAuditType groupMembership;
    @XmlElement(name = "pnp_activity")
    protected EntityStateAuditType pnpActivity;
    @XmlElement(name = "user_device_claims")
    protected EntityStateAuditType userDeviceClaims;
    @XmlElement(name = "audit_detailedtracking_tokenrightadjusted")
    protected EntityStateAuditType auditDetailedtrackingTokenrightadjusted;

    /**
     * credentialValidation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getCredentialValidation() {
        return credentialValidation;
    }

    /**
     * credentialValidation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setCredentialValidation(EntityStateAuditType value) {
        this.credentialValidation = value;
    }

    /**
     * kerberosAuthenticationService 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getKerberosAuthenticationService() {
        return kerberosAuthenticationService;
    }

    /**
     * kerberosAuthenticationService 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setKerberosAuthenticationService(EntityStateAuditType value) {
        this.kerberosAuthenticationService = value;
    }

    /**
     * kerberosServiceTicketOperations 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getKerberosServiceTicketOperations() {
        return kerberosServiceTicketOperations;
    }

    /**
     * kerberosServiceTicketOperations 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setKerberosServiceTicketOperations(EntityStateAuditType value) {
        this.kerberosServiceTicketOperations = value;
    }

    /**
     * kerberosTicketEvents 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getKerberosTicketEvents() {
        return kerberosTicketEvents;
    }

    /**
     * kerberosTicketEvents 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setKerberosTicketEvents(EntityStateAuditType value) {
        this.kerberosTicketEvents = value;
    }

    /**
     * otherAccountLogonEvents 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getOtherAccountLogonEvents() {
        return otherAccountLogonEvents;
    }

    /**
     * otherAccountLogonEvents 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setOtherAccountLogonEvents(EntityStateAuditType value) {
        this.otherAccountLogonEvents = value;
    }

    /**
     * applicationGroupManagement 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getApplicationGroupManagement() {
        return applicationGroupManagement;
    }

    /**
     * applicationGroupManagement 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setApplicationGroupManagement(EntityStateAuditType value) {
        this.applicationGroupManagement = value;
    }

    /**
     * computerAccountManagement 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getComputerAccountManagement() {
        return computerAccountManagement;
    }

    /**
     * computerAccountManagement 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setComputerAccountManagement(EntityStateAuditType value) {
        this.computerAccountManagement = value;
    }

    /**
     * distributionGroupManagement 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getDistributionGroupManagement() {
        return distributionGroupManagement;
    }

    /**
     * distributionGroupManagement 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setDistributionGroupManagement(EntityStateAuditType value) {
        this.distributionGroupManagement = value;
    }

    /**
     * otherAccountManagementEvents 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getOtherAccountManagementEvents() {
        return otherAccountManagementEvents;
    }

    /**
     * otherAccountManagementEvents 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setOtherAccountManagementEvents(EntityStateAuditType value) {
        this.otherAccountManagementEvents = value;
    }

    /**
     * securityGroupManagement 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getSecurityGroupManagement() {
        return securityGroupManagement;
    }

    /**
     * securityGroupManagement 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setSecurityGroupManagement(EntityStateAuditType value) {
        this.securityGroupManagement = value;
    }

    /**
     * userAccountManagement 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getUserAccountManagement() {
        return userAccountManagement;
    }

    /**
     * userAccountManagement 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setUserAccountManagement(EntityStateAuditType value) {
        this.userAccountManagement = value;
    }

    /**
     * dpapiActivity 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getDpapiActivity() {
        return dpapiActivity;
    }

    /**
     * dpapiActivity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setDpapiActivity(EntityStateAuditType value) {
        this.dpapiActivity = value;
    }

    /**
     * processCreation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getProcessCreation() {
        return processCreation;
    }

    /**
     * processCreation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setProcessCreation(EntityStateAuditType value) {
        this.processCreation = value;
    }

    /**
     * processTermination 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getProcessTermination() {
        return processTermination;
    }

    /**
     * processTermination 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setProcessTermination(EntityStateAuditType value) {
        this.processTermination = value;
    }

    /**
     * rpcEvents 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getRpcEvents() {
        return rpcEvents;
    }

    /**
     * rpcEvents 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setRpcEvents(EntityStateAuditType value) {
        this.rpcEvents = value;
    }

    /**
     * directoryServiceAccess 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getDirectoryServiceAccess() {
        return directoryServiceAccess;
    }

    /**
     * directoryServiceAccess 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setDirectoryServiceAccess(EntityStateAuditType value) {
        this.directoryServiceAccess = value;
    }

    /**
     * directoryServiceChanges 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getDirectoryServiceChanges() {
        return directoryServiceChanges;
    }

    /**
     * directoryServiceChanges 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setDirectoryServiceChanges(EntityStateAuditType value) {
        this.directoryServiceChanges = value;
    }

    /**
     * directoryServiceReplication 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getDirectoryServiceReplication() {
        return directoryServiceReplication;
    }

    /**
     * directoryServiceReplication 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setDirectoryServiceReplication(EntityStateAuditType value) {
        this.directoryServiceReplication = value;
    }

    /**
     * detailedDirectoryServiceReplication 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getDetailedDirectoryServiceReplication() {
        return detailedDirectoryServiceReplication;
    }

    /**
     * detailedDirectoryServiceReplication 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setDetailedDirectoryServiceReplication(EntityStateAuditType value) {
        this.detailedDirectoryServiceReplication = value;
    }

    /**
     * accountLockout 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getAccountLockout() {
        return accountLockout;
    }

    /**
     * accountLockout 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setAccountLockout(EntityStateAuditType value) {
        this.accountLockout = value;
    }

    /**
     * ipsecExtendedMode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getIpsecExtendedMode() {
        return ipsecExtendedMode;
    }

    /**
     * ipsecExtendedMode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setIpsecExtendedMode(EntityStateAuditType value) {
        this.ipsecExtendedMode = value;
    }

    /**
     * ipsecMainMode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getIpsecMainMode() {
        return ipsecMainMode;
    }

    /**
     * ipsecMainMode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setIpsecMainMode(EntityStateAuditType value) {
        this.ipsecMainMode = value;
    }

    /**
     * ipsecQuickMode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getIpsecQuickMode() {
        return ipsecQuickMode;
    }

    /**
     * ipsecQuickMode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setIpsecQuickMode(EntityStateAuditType value) {
        this.ipsecQuickMode = value;
    }

    /**
     * logoff 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getLogoff() {
        return logoff;
    }

    /**
     * logoff 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setLogoff(EntityStateAuditType value) {
        this.logoff = value;
    }

    /**
     * logon 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getLogon() {
        return logon;
    }

    /**
     * logon 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setLogon(EntityStateAuditType value) {
        this.logon = value;
    }

    /**
     * networkPolicyServer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getNetworkPolicyServer() {
        return networkPolicyServer;
    }

    /**
     * networkPolicyServer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setNetworkPolicyServer(EntityStateAuditType value) {
        this.networkPolicyServer = value;
    }

    /**
     * otherLogonLogoffEvents 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getOtherLogonLogoffEvents() {
        return otherLogonLogoffEvents;
    }

    /**
     * otherLogonLogoffEvents 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setOtherLogonLogoffEvents(EntityStateAuditType value) {
        this.otherLogonLogoffEvents = value;
    }

    /**
     * specialLogon 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getSpecialLogon() {
        return specialLogon;
    }

    /**
     * specialLogon 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setSpecialLogon(EntityStateAuditType value) {
        this.specialLogon = value;
    }

    /**
     * logonClaims 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getLogonClaims() {
        return logonClaims;
    }

    /**
     * logonClaims 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setLogonClaims(EntityStateAuditType value) {
        this.logonClaims = value;
    }

    /**
     * applicationGenerated 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getApplicationGenerated() {
        return applicationGenerated;
    }

    /**
     * applicationGenerated 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setApplicationGenerated(EntityStateAuditType value) {
        this.applicationGenerated = value;
    }

    /**
     * certificationServices 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getCertificationServices() {
        return certificationServices;
    }

    /**
     * certificationServices 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setCertificationServices(EntityStateAuditType value) {
        this.certificationServices = value;
    }

    /**
     * detailedFileShare 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getDetailedFileShare() {
        return detailedFileShare;
    }

    /**
     * detailedFileShare 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setDetailedFileShare(EntityStateAuditType value) {
        this.detailedFileShare = value;
    }

    /**
     * fileShare 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getFileShare() {
        return fileShare;
    }

    /**
     * fileShare 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setFileShare(EntityStateAuditType value) {
        this.fileShare = value;
    }

    /**
     * fileSystem 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getFileSystem() {
        return fileSystem;
    }

    /**
     * fileSystem 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setFileSystem(EntityStateAuditType value) {
        this.fileSystem = value;
    }

    /**
     * filteringPlatformConnection 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getFilteringPlatformConnection() {
        return filteringPlatformConnection;
    }

    /**
     * filteringPlatformConnection 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setFilteringPlatformConnection(EntityStateAuditType value) {
        this.filteringPlatformConnection = value;
    }

    /**
     * filteringPlatformPacketDrop 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getFilteringPlatformPacketDrop() {
        return filteringPlatformPacketDrop;
    }

    /**
     * filteringPlatformPacketDrop 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setFilteringPlatformPacketDrop(EntityStateAuditType value) {
        this.filteringPlatformPacketDrop = value;
    }

    /**
     * handleManipulation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getHandleManipulation() {
        return handleManipulation;
    }

    /**
     * handleManipulation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setHandleManipulation(EntityStateAuditType value) {
        this.handleManipulation = value;
    }

    /**
     * kernelObject 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getKernelObject() {
        return kernelObject;
    }

    /**
     * kernelObject 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setKernelObject(EntityStateAuditType value) {
        this.kernelObject = value;
    }

    /**
     * otherObjectAccessEvents 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getOtherObjectAccessEvents() {
        return otherObjectAccessEvents;
    }

    /**
     * otherObjectAccessEvents 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setOtherObjectAccessEvents(EntityStateAuditType value) {
        this.otherObjectAccessEvents = value;
    }

    /**
     * registry 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getRegistry() {
        return registry;
    }

    /**
     * registry 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setRegistry(EntityStateAuditType value) {
        this.registry = value;
    }

    /**
     * sam 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getSam() {
        return sam;
    }

    /**
     * sam 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setSam(EntityStateAuditType value) {
        this.sam = value;
    }

    /**
     * removableStorage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getRemovableStorage() {
        return removableStorage;
    }

    /**
     * removableStorage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setRemovableStorage(EntityStateAuditType value) {
        this.removableStorage = value;
    }

    /**
     * centralAccessPolicyStaging 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getCentralAccessPolicyStaging() {
        return centralAccessPolicyStaging;
    }

    /**
     * centralAccessPolicyStaging 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setCentralAccessPolicyStaging(EntityStateAuditType value) {
        this.centralAccessPolicyStaging = value;
    }

    /**
     * auditPolicyChange 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getAuditPolicyChange() {
        return auditPolicyChange;
    }

    /**
     * auditPolicyChange 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setAuditPolicyChange(EntityStateAuditType value) {
        this.auditPolicyChange = value;
    }

    /**
     * authenticationPolicyChange 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getAuthenticationPolicyChange() {
        return authenticationPolicyChange;
    }

    /**
     * authenticationPolicyChange 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setAuthenticationPolicyChange(EntityStateAuditType value) {
        this.authenticationPolicyChange = value;
    }

    /**
     * authorizationPolicyChange 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getAuthorizationPolicyChange() {
        return authorizationPolicyChange;
    }

    /**
     * authorizationPolicyChange 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setAuthorizationPolicyChange(EntityStateAuditType value) {
        this.authorizationPolicyChange = value;
    }

    /**
     * filteringPlatformPolicyChange 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getFilteringPlatformPolicyChange() {
        return filteringPlatformPolicyChange;
    }

    /**
     * filteringPlatformPolicyChange 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setFilteringPlatformPolicyChange(EntityStateAuditType value) {
        this.filteringPlatformPolicyChange = value;
    }

    /**
     * mpssvcRuleLevelPolicyChange 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getMpssvcRuleLevelPolicyChange() {
        return mpssvcRuleLevelPolicyChange;
    }

    /**
     * mpssvcRuleLevelPolicyChange 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setMpssvcRuleLevelPolicyChange(EntityStateAuditType value) {
        this.mpssvcRuleLevelPolicyChange = value;
    }

    /**
     * otherPolicyChangeEvents 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getOtherPolicyChangeEvents() {
        return otherPolicyChangeEvents;
    }

    /**
     * otherPolicyChangeEvents 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setOtherPolicyChangeEvents(EntityStateAuditType value) {
        this.otherPolicyChangeEvents = value;
    }

    /**
     * nonSensitivePrivilegeUse 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getNonSensitivePrivilegeUse() {
        return nonSensitivePrivilegeUse;
    }

    /**
     * nonSensitivePrivilegeUse 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setNonSensitivePrivilegeUse(EntityStateAuditType value) {
        this.nonSensitivePrivilegeUse = value;
    }

    /**
     * otherPrivilegeUseEvents 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getOtherPrivilegeUseEvents() {
        return otherPrivilegeUseEvents;
    }

    /**
     * otherPrivilegeUseEvents 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setOtherPrivilegeUseEvents(EntityStateAuditType value) {
        this.otherPrivilegeUseEvents = value;
    }

    /**
     * sensitivePrivilegeUse 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getSensitivePrivilegeUse() {
        return sensitivePrivilegeUse;
    }

    /**
     * sensitivePrivilegeUse 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setSensitivePrivilegeUse(EntityStateAuditType value) {
        this.sensitivePrivilegeUse = value;
    }

    /**
     * ipsecDriver 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getIpsecDriver() {
        return ipsecDriver;
    }

    /**
     * ipsecDriver 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setIpsecDriver(EntityStateAuditType value) {
        this.ipsecDriver = value;
    }

    /**
     * otherSystemEvents 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getOtherSystemEvents() {
        return otherSystemEvents;
    }

    /**
     * otherSystemEvents 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setOtherSystemEvents(EntityStateAuditType value) {
        this.otherSystemEvents = value;
    }

    /**
     * securityStateChange 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getSecurityStateChange() {
        return securityStateChange;
    }

    /**
     * securityStateChange 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setSecurityStateChange(EntityStateAuditType value) {
        this.securityStateChange = value;
    }

    /**
     * securitySystemExtension 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getSecuritySystemExtension() {
        return securitySystemExtension;
    }

    /**
     * securitySystemExtension 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setSecuritySystemExtension(EntityStateAuditType value) {
        this.securitySystemExtension = value;
    }

    /**
     * systemIntegrity 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getSystemIntegrity() {
        return systemIntegrity;
    }

    /**
     * systemIntegrity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setSystemIntegrity(EntityStateAuditType value) {
        this.systemIntegrity = value;
    }

    /**
     * groupMembership 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getGroupMembership() {
        return groupMembership;
    }

    /**
     * groupMembership 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setGroupMembership(EntityStateAuditType value) {
        this.groupMembership = value;
    }

    /**
     * pnpActivity 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getPnpActivity() {
        return pnpActivity;
    }

    /**
     * pnpActivity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setPnpActivity(EntityStateAuditType value) {
        this.pnpActivity = value;
    }

    /**
     * userDeviceClaims 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getUserDeviceClaims() {
        return userDeviceClaims;
    }

    /**
     * userDeviceClaims 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setUserDeviceClaims(EntityStateAuditType value) {
        this.userDeviceClaims = value;
    }

    /**
     * auditDetailedtrackingTokenrightadjusted 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getAuditDetailedtrackingTokenrightadjusted() {
        return auditDetailedtrackingTokenrightadjusted;
    }

    /**
     * auditDetailedtrackingTokenrightadjusted 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setAuditDetailedtrackingTokenrightadjusted(EntityStateAuditType value) {
        this.auditDetailedtrackingTokenrightadjusted = value;
    }

}
