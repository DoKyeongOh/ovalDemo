//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_definitions_5_apple_ios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateBoolType;
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
 *         &lt;element name="allow_account_modification" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_airdrop" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_app_cellular_data_modification" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_app_installation" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_assistant" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_assistant_user_generated_content" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_assistant_while_locked" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_bookstore" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_bookstore_erotica" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_camera" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_cloud_backup" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_cloud_document_sync" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_cloud_keychain_sync" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_diagnostic_submission" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_explicit_content" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_find_my_friends_modification" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_fingerprint_for_unlock" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_game_center" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_host_pairing" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_lock_screen_control_center" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_lock_screen_notifications_view" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_lock_screen_today_view" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_open_from_managed_to_unmanaged" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_open_from_unmanaged_to_managed" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_ota_pki_updates" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_passbook_while_locked" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_photo_stream" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_safari" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_screen_shot" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_shared_stream" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_ui_configuration_profile_installation" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_untrusted_tls_prompt" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_voice_dialing" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_youtube" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_itunes" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="autonomous_single_app_mode_permitted_appids" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="force_encrypted_backup" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="force_itunes_store_password_entry" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="force_limit_ad_tracking" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="safari_allow_auto_fill" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
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
    "allowAccountModification",
    "allowAirdrop",
    "allowAppCellularDataModification",
    "allowAppInstallation",
    "allowAssistant",
    "allowAssistantUserGeneratedContent",
    "allowAssistantWhileLocked",
    "allowBookstore",
    "allowBookstoreErotica",
    "allowCamera",
    "allowCloudBackup",
    "allowCloudDocumentSync",
    "allowCloudKeychainSync",
    "allowDiagnosticSubmission",
    "allowExplicitContent",
    "allowFindMyFriendsModification",
    "allowFingerprintForUnlock",
    "allowGameCenter",
    "allowHostPairing",
    "allowLockScreenControlCenter",
    "allowLockScreenNotificationsView",
    "allowLockScreenTodayView",
    "allowOpenFromManagedToUnmanaged",
    "allowOpenFromUnmanagedToManaged",
    "allowOtaPkiUpdates",
    "allowPassbookWhileLocked",
    "allowPhotoStream",
    "allowSafari",
    "allowScreenShot",
    "allowSharedStream",
    "allowUiConfigurationProfileInstallation",
    "allowUntrustedTlsPrompt",
    "allowVoiceDialing",
    "allowYoutube",
    "allowItunes",
    "autonomousSingleAppModePermittedAppids",
    "forceEncryptedBackup",
    "forceItunesStorePasswordEntry",
    "forceLimitAdTracking",
    "safariAllowAutoFill"
})
public class GlobalrestrictionsState
    extends StateType
{

    @XmlElement(name = "allow_account_modification", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowAccountModification;
    @XmlElement(name = "allow_airdrop", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowAirdrop;
    @XmlElement(name = "allow_app_cellular_data_modification", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowAppCellularDataModification;
    @XmlElement(name = "allow_app_installation", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowAppInstallation;
    @XmlElement(name = "allow_assistant", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowAssistant;
    @XmlElement(name = "allow_assistant_user_generated_content", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowAssistantUserGeneratedContent;
    @XmlElement(name = "allow_assistant_while_locked", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowAssistantWhileLocked;
    @XmlElement(name = "allow_bookstore", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowBookstore;
    @XmlElement(name = "allow_bookstore_erotica", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowBookstoreErotica;
    @XmlElement(name = "allow_camera", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowCamera;
    @XmlElement(name = "allow_cloud_backup", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowCloudBackup;
    @XmlElement(name = "allow_cloud_document_sync", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowCloudDocumentSync;
    @XmlElement(name = "allow_cloud_keychain_sync", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowCloudKeychainSync;
    @XmlElement(name = "allow_diagnostic_submission", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowDiagnosticSubmission;
    @XmlElement(name = "allow_explicit_content", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowExplicitContent;
    @XmlElement(name = "allow_find_my_friends_modification", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowFindMyFriendsModification;
    @XmlElement(name = "allow_fingerprint_for_unlock", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowFingerprintForUnlock;
    @XmlElement(name = "allow_game_center", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowGameCenter;
    @XmlElement(name = "allow_host_pairing", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowHostPairing;
    @XmlElement(name = "allow_lock_screen_control_center", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowLockScreenControlCenter;
    @XmlElement(name = "allow_lock_screen_notifications_view", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowLockScreenNotificationsView;
    @XmlElement(name = "allow_lock_screen_today_view", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowLockScreenTodayView;
    @XmlElement(name = "allow_open_from_managed_to_unmanaged", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowOpenFromManagedToUnmanaged;
    @XmlElement(name = "allow_open_from_unmanaged_to_managed", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowOpenFromUnmanagedToManaged;
    @XmlElement(name = "allow_ota_pki_updates", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowOtaPkiUpdates;
    @XmlElement(name = "allow_passbook_while_locked", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowPassbookWhileLocked;
    @XmlElement(name = "allow_photo_stream", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowPhotoStream;
    @XmlElement(name = "allow_safari", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowSafari;
    @XmlElement(name = "allow_screen_shot", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowScreenShot;
    @XmlElement(name = "allow_shared_stream", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowSharedStream;
    @XmlElement(name = "allow_ui_configuration_profile_installation", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowUiConfigurationProfileInstallation;
    @XmlElement(name = "allow_untrusted_tls_prompt", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowUntrustedTlsPrompt;
    @XmlElement(name = "allow_voice_dialing", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowVoiceDialing;
    @XmlElement(name = "allow_youtube", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowYoutube;
    @XmlElement(name = "allow_itunes", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowItunes;
    @XmlElement(name = "autonomous_single_app_mode_permitted_appids", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateStringType autonomousSingleAppModePermittedAppids;
    @XmlElement(name = "force_encrypted_backup", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType forceEncryptedBackup;
    @XmlElement(name = "force_itunes_store_password_entry", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType forceItunesStorePasswordEntry;
    @XmlElement(name = "force_limit_ad_tracking", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType forceLimitAdTracking;
    @XmlElement(name = "safari_allow_auto_fill", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType safariAllowAutoFill;

    /**
     * allowAccountModification 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowAccountModification() {
        return allowAccountModification;
    }

    /**
     * allowAccountModification 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowAccountModification(EntityStateBoolType value) {
        this.allowAccountModification = value;
    }

    /**
     * allowAirdrop 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowAirdrop() {
        return allowAirdrop;
    }

    /**
     * allowAirdrop 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowAirdrop(EntityStateBoolType value) {
        this.allowAirdrop = value;
    }

    /**
     * allowAppCellularDataModification 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowAppCellularDataModification() {
        return allowAppCellularDataModification;
    }

    /**
     * allowAppCellularDataModification 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowAppCellularDataModification(EntityStateBoolType value) {
        this.allowAppCellularDataModification = value;
    }

    /**
     * allowAppInstallation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowAppInstallation() {
        return allowAppInstallation;
    }

    /**
     * allowAppInstallation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowAppInstallation(EntityStateBoolType value) {
        this.allowAppInstallation = value;
    }

    /**
     * allowAssistant 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowAssistant() {
        return allowAssistant;
    }

    /**
     * allowAssistant 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowAssistant(EntityStateBoolType value) {
        this.allowAssistant = value;
    }

    /**
     * allowAssistantUserGeneratedContent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowAssistantUserGeneratedContent() {
        return allowAssistantUserGeneratedContent;
    }

    /**
     * allowAssistantUserGeneratedContent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowAssistantUserGeneratedContent(EntityStateBoolType value) {
        this.allowAssistantUserGeneratedContent = value;
    }

    /**
     * allowAssistantWhileLocked 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowAssistantWhileLocked() {
        return allowAssistantWhileLocked;
    }

    /**
     * allowAssistantWhileLocked 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowAssistantWhileLocked(EntityStateBoolType value) {
        this.allowAssistantWhileLocked = value;
    }

    /**
     * allowBookstore 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowBookstore() {
        return allowBookstore;
    }

    /**
     * allowBookstore 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowBookstore(EntityStateBoolType value) {
        this.allowBookstore = value;
    }

    /**
     * allowBookstoreErotica 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowBookstoreErotica() {
        return allowBookstoreErotica;
    }

    /**
     * allowBookstoreErotica 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowBookstoreErotica(EntityStateBoolType value) {
        this.allowBookstoreErotica = value;
    }

    /**
     * allowCamera 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowCamera() {
        return allowCamera;
    }

    /**
     * allowCamera 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowCamera(EntityStateBoolType value) {
        this.allowCamera = value;
    }

    /**
     * allowCloudBackup 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowCloudBackup() {
        return allowCloudBackup;
    }

    /**
     * allowCloudBackup 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowCloudBackup(EntityStateBoolType value) {
        this.allowCloudBackup = value;
    }

    /**
     * allowCloudDocumentSync 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowCloudDocumentSync() {
        return allowCloudDocumentSync;
    }

    /**
     * allowCloudDocumentSync 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowCloudDocumentSync(EntityStateBoolType value) {
        this.allowCloudDocumentSync = value;
    }

    /**
     * allowCloudKeychainSync 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowCloudKeychainSync() {
        return allowCloudKeychainSync;
    }

    /**
     * allowCloudKeychainSync 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowCloudKeychainSync(EntityStateBoolType value) {
        this.allowCloudKeychainSync = value;
    }

    /**
     * allowDiagnosticSubmission 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowDiagnosticSubmission() {
        return allowDiagnosticSubmission;
    }

    /**
     * allowDiagnosticSubmission 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowDiagnosticSubmission(EntityStateBoolType value) {
        this.allowDiagnosticSubmission = value;
    }

    /**
     * allowExplicitContent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowExplicitContent() {
        return allowExplicitContent;
    }

    /**
     * allowExplicitContent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowExplicitContent(EntityStateBoolType value) {
        this.allowExplicitContent = value;
    }

    /**
     * allowFindMyFriendsModification 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowFindMyFriendsModification() {
        return allowFindMyFriendsModification;
    }

    /**
     * allowFindMyFriendsModification 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowFindMyFriendsModification(EntityStateBoolType value) {
        this.allowFindMyFriendsModification = value;
    }

    /**
     * allowFingerprintForUnlock 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowFingerprintForUnlock() {
        return allowFingerprintForUnlock;
    }

    /**
     * allowFingerprintForUnlock 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowFingerprintForUnlock(EntityStateBoolType value) {
        this.allowFingerprintForUnlock = value;
    }

    /**
     * allowGameCenter 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowGameCenter() {
        return allowGameCenter;
    }

    /**
     * allowGameCenter 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowGameCenter(EntityStateBoolType value) {
        this.allowGameCenter = value;
    }

    /**
     * allowHostPairing 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowHostPairing() {
        return allowHostPairing;
    }

    /**
     * allowHostPairing 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowHostPairing(EntityStateBoolType value) {
        this.allowHostPairing = value;
    }

    /**
     * allowLockScreenControlCenter 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowLockScreenControlCenter() {
        return allowLockScreenControlCenter;
    }

    /**
     * allowLockScreenControlCenter 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowLockScreenControlCenter(EntityStateBoolType value) {
        this.allowLockScreenControlCenter = value;
    }

    /**
     * allowLockScreenNotificationsView 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowLockScreenNotificationsView() {
        return allowLockScreenNotificationsView;
    }

    /**
     * allowLockScreenNotificationsView 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowLockScreenNotificationsView(EntityStateBoolType value) {
        this.allowLockScreenNotificationsView = value;
    }

    /**
     * allowLockScreenTodayView 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowLockScreenTodayView() {
        return allowLockScreenTodayView;
    }

    /**
     * allowLockScreenTodayView 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowLockScreenTodayView(EntityStateBoolType value) {
        this.allowLockScreenTodayView = value;
    }

    /**
     * allowOpenFromManagedToUnmanaged 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowOpenFromManagedToUnmanaged() {
        return allowOpenFromManagedToUnmanaged;
    }

    /**
     * allowOpenFromManagedToUnmanaged 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowOpenFromManagedToUnmanaged(EntityStateBoolType value) {
        this.allowOpenFromManagedToUnmanaged = value;
    }

    /**
     * allowOpenFromUnmanagedToManaged 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowOpenFromUnmanagedToManaged() {
        return allowOpenFromUnmanagedToManaged;
    }

    /**
     * allowOpenFromUnmanagedToManaged 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowOpenFromUnmanagedToManaged(EntityStateBoolType value) {
        this.allowOpenFromUnmanagedToManaged = value;
    }

    /**
     * allowOtaPkiUpdates 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowOtaPkiUpdates() {
        return allowOtaPkiUpdates;
    }

    /**
     * allowOtaPkiUpdates 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowOtaPkiUpdates(EntityStateBoolType value) {
        this.allowOtaPkiUpdates = value;
    }

    /**
     * allowPassbookWhileLocked 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowPassbookWhileLocked() {
        return allowPassbookWhileLocked;
    }

    /**
     * allowPassbookWhileLocked 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowPassbookWhileLocked(EntityStateBoolType value) {
        this.allowPassbookWhileLocked = value;
    }

    /**
     * allowPhotoStream 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowPhotoStream() {
        return allowPhotoStream;
    }

    /**
     * allowPhotoStream 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowPhotoStream(EntityStateBoolType value) {
        this.allowPhotoStream = value;
    }

    /**
     * allowSafari 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowSafari() {
        return allowSafari;
    }

    /**
     * allowSafari 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowSafari(EntityStateBoolType value) {
        this.allowSafari = value;
    }

    /**
     * allowScreenShot 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowScreenShot() {
        return allowScreenShot;
    }

    /**
     * allowScreenShot 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowScreenShot(EntityStateBoolType value) {
        this.allowScreenShot = value;
    }

    /**
     * allowSharedStream 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowSharedStream() {
        return allowSharedStream;
    }

    /**
     * allowSharedStream 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowSharedStream(EntityStateBoolType value) {
        this.allowSharedStream = value;
    }

    /**
     * allowUiConfigurationProfileInstallation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowUiConfigurationProfileInstallation() {
        return allowUiConfigurationProfileInstallation;
    }

    /**
     * allowUiConfigurationProfileInstallation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowUiConfigurationProfileInstallation(EntityStateBoolType value) {
        this.allowUiConfigurationProfileInstallation = value;
    }

    /**
     * allowUntrustedTlsPrompt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowUntrustedTlsPrompt() {
        return allowUntrustedTlsPrompt;
    }

    /**
     * allowUntrustedTlsPrompt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowUntrustedTlsPrompt(EntityStateBoolType value) {
        this.allowUntrustedTlsPrompt = value;
    }

    /**
     * allowVoiceDialing 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowVoiceDialing() {
        return allowVoiceDialing;
    }

    /**
     * allowVoiceDialing 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowVoiceDialing(EntityStateBoolType value) {
        this.allowVoiceDialing = value;
    }

    /**
     * allowYoutube 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowYoutube() {
        return allowYoutube;
    }

    /**
     * allowYoutube 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowYoutube(EntityStateBoolType value) {
        this.allowYoutube = value;
    }

    /**
     * allowItunes 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowItunes() {
        return allowItunes;
    }

    /**
     * allowItunes 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowItunes(EntityStateBoolType value) {
        this.allowItunes = value;
    }

    /**
     * autonomousSingleAppModePermittedAppids 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getAutonomousSingleAppModePermittedAppids() {
        return autonomousSingleAppModePermittedAppids;
    }

    /**
     * autonomousSingleAppModePermittedAppids 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setAutonomousSingleAppModePermittedAppids(EntityStateStringType value) {
        this.autonomousSingleAppModePermittedAppids = value;
    }

    /**
     * forceEncryptedBackup 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getForceEncryptedBackup() {
        return forceEncryptedBackup;
    }

    /**
     * forceEncryptedBackup 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setForceEncryptedBackup(EntityStateBoolType value) {
        this.forceEncryptedBackup = value;
    }

    /**
     * forceItunesStorePasswordEntry 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getForceItunesStorePasswordEntry() {
        return forceItunesStorePasswordEntry;
    }

    /**
     * forceItunesStorePasswordEntry 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setForceItunesStorePasswordEntry(EntityStateBoolType value) {
        this.forceItunesStorePasswordEntry = value;
    }

    /**
     * forceLimitAdTracking 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getForceLimitAdTracking() {
        return forceLimitAdTracking;
    }

    /**
     * forceLimitAdTracking 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setForceLimitAdTracking(EntityStateBoolType value) {
        this.forceLimitAdTracking = value;
    }

    /**
     * safariAllowAutoFill 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSafariAllowAutoFill() {
        return safariAllowAutoFill;
    }

    /**
     * safariAllowAutoFill 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSafariAllowAutoFill(EntityStateBoolType value) {
        this.safariAllowAutoFill = value;
    }

}
