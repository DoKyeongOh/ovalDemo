//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_apple_ios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemBoolType;
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
 *         &lt;element name="allow_account_modification" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allow_airdrop" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allow_app_cellular_data_modification" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allow_app_installation" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allow_assistant" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allow_assistant_user_generated_content" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allow_assistant_while_locked" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allow_bookstore" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allow_bookstore_erotica" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allow_camera" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allow_cloud_backup" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allow_cloud_document_sync" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allow_cloud_keychain_sync" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allow_diagnostic_submission" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allow_explicit_content" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allow_find_my_friends_modification" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allow_fingerprint_for_unlock" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allow_game_center" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allow_host_pairing" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allow_lock_screen_control_center" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allow_lock_screen_notifications_view" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allow_lock_screen_today_view" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allow_open_from_managed_to_unmanaged" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allow_open_from_unmanaged_to_managed" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allow_ota_pki_updates" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allow_passbook_while_locked" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allow_photo_stream" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allow_safari" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allow_screen_shot" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allow_shared_stream" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allow_ui_configuration_profile_installation" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allow_untrusted_tls_prompt" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allow_voice_dialing" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allow_youtube" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allow_itunes" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="autonomous_single_app_mode_permitted_appids" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="force_encrypted_backup" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="force_itunes_store_password_entry" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="force_limit_ad_tracking" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="safari_allow_auto_fill" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
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
public class GlobalrestrictionsItem
    extends ItemType
{

    @XmlElement(name = "allow_account_modification", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType allowAccountModification;
    @XmlElement(name = "allow_airdrop", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType allowAirdrop;
    @XmlElement(name = "allow_app_cellular_data_modification", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType allowAppCellularDataModification;
    @XmlElement(name = "allow_app_installation", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType allowAppInstallation;
    @XmlElement(name = "allow_assistant", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType allowAssistant;
    @XmlElement(name = "allow_assistant_user_generated_content", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType allowAssistantUserGeneratedContent;
    @XmlElement(name = "allow_assistant_while_locked", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType allowAssistantWhileLocked;
    @XmlElement(name = "allow_bookstore", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType allowBookstore;
    @XmlElement(name = "allow_bookstore_erotica", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType allowBookstoreErotica;
    @XmlElement(name = "allow_camera", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType allowCamera;
    @XmlElement(name = "allow_cloud_backup", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType allowCloudBackup;
    @XmlElement(name = "allow_cloud_document_sync", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType allowCloudDocumentSync;
    @XmlElement(name = "allow_cloud_keychain_sync", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType allowCloudKeychainSync;
    @XmlElement(name = "allow_diagnostic_submission", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType allowDiagnosticSubmission;
    @XmlElement(name = "allow_explicit_content", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType allowExplicitContent;
    @XmlElement(name = "allow_find_my_friends_modification", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType allowFindMyFriendsModification;
    @XmlElement(name = "allow_fingerprint_for_unlock", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType allowFingerprintForUnlock;
    @XmlElement(name = "allow_game_center", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType allowGameCenter;
    @XmlElement(name = "allow_host_pairing", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType allowHostPairing;
    @XmlElement(name = "allow_lock_screen_control_center", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType allowLockScreenControlCenter;
    @XmlElement(name = "allow_lock_screen_notifications_view", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType allowLockScreenNotificationsView;
    @XmlElement(name = "allow_lock_screen_today_view", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType allowLockScreenTodayView;
    @XmlElement(name = "allow_open_from_managed_to_unmanaged", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType allowOpenFromManagedToUnmanaged;
    @XmlElement(name = "allow_open_from_unmanaged_to_managed", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType allowOpenFromUnmanagedToManaged;
    @XmlElement(name = "allow_ota_pki_updates", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType allowOtaPkiUpdates;
    @XmlElement(name = "allow_passbook_while_locked", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType allowPassbookWhileLocked;
    @XmlElement(name = "allow_photo_stream", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType allowPhotoStream;
    @XmlElement(name = "allow_safari", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType allowSafari;
    @XmlElement(name = "allow_screen_shot", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType allowScreenShot;
    @XmlElement(name = "allow_shared_stream", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType allowSharedStream;
    @XmlElement(name = "allow_ui_configuration_profile_installation", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType allowUiConfigurationProfileInstallation;
    @XmlElement(name = "allow_untrusted_tls_prompt", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType allowUntrustedTlsPrompt;
    @XmlElement(name = "allow_voice_dialing", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType allowVoiceDialing;
    @XmlElement(name = "allow_youtube", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType allowYoutube;
    @XmlElement(name = "allow_itunes", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType allowItunes;
    @XmlElement(name = "autonomous_single_app_mode_permitted_appids", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected List<EntityItemStringType> autonomousSingleAppModePermittedAppids;
    @XmlElement(name = "force_encrypted_backup", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType forceEncryptedBackup;
    @XmlElement(name = "force_itunes_store_password_entry", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType forceItunesStorePasswordEntry;
    @XmlElement(name = "force_limit_ad_tracking", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType forceLimitAdTracking;
    @XmlElement(name = "safari_allow_auto_fill", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType safariAllowAutoFill;

    /**
     * allowAccountModification 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowAccountModification() {
        return allowAccountModification;
    }

    /**
     * allowAccountModification 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowAccountModification(EntityItemBoolType value) {
        this.allowAccountModification = value;
    }

    /**
     * allowAirdrop 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowAirdrop() {
        return allowAirdrop;
    }

    /**
     * allowAirdrop 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowAirdrop(EntityItemBoolType value) {
        this.allowAirdrop = value;
    }

    /**
     * allowAppCellularDataModification 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowAppCellularDataModification() {
        return allowAppCellularDataModification;
    }

    /**
     * allowAppCellularDataModification 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowAppCellularDataModification(EntityItemBoolType value) {
        this.allowAppCellularDataModification = value;
    }

    /**
     * allowAppInstallation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowAppInstallation() {
        return allowAppInstallation;
    }

    /**
     * allowAppInstallation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowAppInstallation(EntityItemBoolType value) {
        this.allowAppInstallation = value;
    }

    /**
     * allowAssistant 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowAssistant() {
        return allowAssistant;
    }

    /**
     * allowAssistant 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowAssistant(EntityItemBoolType value) {
        this.allowAssistant = value;
    }

    /**
     * allowAssistantUserGeneratedContent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowAssistantUserGeneratedContent() {
        return allowAssistantUserGeneratedContent;
    }

    /**
     * allowAssistantUserGeneratedContent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowAssistantUserGeneratedContent(EntityItemBoolType value) {
        this.allowAssistantUserGeneratedContent = value;
    }

    /**
     * allowAssistantWhileLocked 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowAssistantWhileLocked() {
        return allowAssistantWhileLocked;
    }

    /**
     * allowAssistantWhileLocked 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowAssistantWhileLocked(EntityItemBoolType value) {
        this.allowAssistantWhileLocked = value;
    }

    /**
     * allowBookstore 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowBookstore() {
        return allowBookstore;
    }

    /**
     * allowBookstore 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowBookstore(EntityItemBoolType value) {
        this.allowBookstore = value;
    }

    /**
     * allowBookstoreErotica 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowBookstoreErotica() {
        return allowBookstoreErotica;
    }

    /**
     * allowBookstoreErotica 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowBookstoreErotica(EntityItemBoolType value) {
        this.allowBookstoreErotica = value;
    }

    /**
     * allowCamera 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowCamera() {
        return allowCamera;
    }

    /**
     * allowCamera 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowCamera(EntityItemBoolType value) {
        this.allowCamera = value;
    }

    /**
     * allowCloudBackup 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowCloudBackup() {
        return allowCloudBackup;
    }

    /**
     * allowCloudBackup 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowCloudBackup(EntityItemBoolType value) {
        this.allowCloudBackup = value;
    }

    /**
     * allowCloudDocumentSync 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowCloudDocumentSync() {
        return allowCloudDocumentSync;
    }

    /**
     * allowCloudDocumentSync 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowCloudDocumentSync(EntityItemBoolType value) {
        this.allowCloudDocumentSync = value;
    }

    /**
     * allowCloudKeychainSync 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowCloudKeychainSync() {
        return allowCloudKeychainSync;
    }

    /**
     * allowCloudKeychainSync 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowCloudKeychainSync(EntityItemBoolType value) {
        this.allowCloudKeychainSync = value;
    }

    /**
     * allowDiagnosticSubmission 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowDiagnosticSubmission() {
        return allowDiagnosticSubmission;
    }

    /**
     * allowDiagnosticSubmission 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowDiagnosticSubmission(EntityItemBoolType value) {
        this.allowDiagnosticSubmission = value;
    }

    /**
     * allowExplicitContent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowExplicitContent() {
        return allowExplicitContent;
    }

    /**
     * allowExplicitContent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowExplicitContent(EntityItemBoolType value) {
        this.allowExplicitContent = value;
    }

    /**
     * allowFindMyFriendsModification 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowFindMyFriendsModification() {
        return allowFindMyFriendsModification;
    }

    /**
     * allowFindMyFriendsModification 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowFindMyFriendsModification(EntityItemBoolType value) {
        this.allowFindMyFriendsModification = value;
    }

    /**
     * allowFingerprintForUnlock 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowFingerprintForUnlock() {
        return allowFingerprintForUnlock;
    }

    /**
     * allowFingerprintForUnlock 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowFingerprintForUnlock(EntityItemBoolType value) {
        this.allowFingerprintForUnlock = value;
    }

    /**
     * allowGameCenter 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowGameCenter() {
        return allowGameCenter;
    }

    /**
     * allowGameCenter 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowGameCenter(EntityItemBoolType value) {
        this.allowGameCenter = value;
    }

    /**
     * allowHostPairing 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowHostPairing() {
        return allowHostPairing;
    }

    /**
     * allowHostPairing 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowHostPairing(EntityItemBoolType value) {
        this.allowHostPairing = value;
    }

    /**
     * allowLockScreenControlCenter 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowLockScreenControlCenter() {
        return allowLockScreenControlCenter;
    }

    /**
     * allowLockScreenControlCenter 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowLockScreenControlCenter(EntityItemBoolType value) {
        this.allowLockScreenControlCenter = value;
    }

    /**
     * allowLockScreenNotificationsView 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowLockScreenNotificationsView() {
        return allowLockScreenNotificationsView;
    }

    /**
     * allowLockScreenNotificationsView 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowLockScreenNotificationsView(EntityItemBoolType value) {
        this.allowLockScreenNotificationsView = value;
    }

    /**
     * allowLockScreenTodayView 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowLockScreenTodayView() {
        return allowLockScreenTodayView;
    }

    /**
     * allowLockScreenTodayView 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowLockScreenTodayView(EntityItemBoolType value) {
        this.allowLockScreenTodayView = value;
    }

    /**
     * allowOpenFromManagedToUnmanaged 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowOpenFromManagedToUnmanaged() {
        return allowOpenFromManagedToUnmanaged;
    }

    /**
     * allowOpenFromManagedToUnmanaged 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowOpenFromManagedToUnmanaged(EntityItemBoolType value) {
        this.allowOpenFromManagedToUnmanaged = value;
    }

    /**
     * allowOpenFromUnmanagedToManaged 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowOpenFromUnmanagedToManaged() {
        return allowOpenFromUnmanagedToManaged;
    }

    /**
     * allowOpenFromUnmanagedToManaged 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowOpenFromUnmanagedToManaged(EntityItemBoolType value) {
        this.allowOpenFromUnmanagedToManaged = value;
    }

    /**
     * allowOtaPkiUpdates 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowOtaPkiUpdates() {
        return allowOtaPkiUpdates;
    }

    /**
     * allowOtaPkiUpdates 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowOtaPkiUpdates(EntityItemBoolType value) {
        this.allowOtaPkiUpdates = value;
    }

    /**
     * allowPassbookWhileLocked 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowPassbookWhileLocked() {
        return allowPassbookWhileLocked;
    }

    /**
     * allowPassbookWhileLocked 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowPassbookWhileLocked(EntityItemBoolType value) {
        this.allowPassbookWhileLocked = value;
    }

    /**
     * allowPhotoStream 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowPhotoStream() {
        return allowPhotoStream;
    }

    /**
     * allowPhotoStream 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowPhotoStream(EntityItemBoolType value) {
        this.allowPhotoStream = value;
    }

    /**
     * allowSafari 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowSafari() {
        return allowSafari;
    }

    /**
     * allowSafari 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowSafari(EntityItemBoolType value) {
        this.allowSafari = value;
    }

    /**
     * allowScreenShot 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowScreenShot() {
        return allowScreenShot;
    }

    /**
     * allowScreenShot 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowScreenShot(EntityItemBoolType value) {
        this.allowScreenShot = value;
    }

    /**
     * allowSharedStream 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowSharedStream() {
        return allowSharedStream;
    }

    /**
     * allowSharedStream 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowSharedStream(EntityItemBoolType value) {
        this.allowSharedStream = value;
    }

    /**
     * allowUiConfigurationProfileInstallation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowUiConfigurationProfileInstallation() {
        return allowUiConfigurationProfileInstallation;
    }

    /**
     * allowUiConfigurationProfileInstallation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowUiConfigurationProfileInstallation(EntityItemBoolType value) {
        this.allowUiConfigurationProfileInstallation = value;
    }

    /**
     * allowUntrustedTlsPrompt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowUntrustedTlsPrompt() {
        return allowUntrustedTlsPrompt;
    }

    /**
     * allowUntrustedTlsPrompt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowUntrustedTlsPrompt(EntityItemBoolType value) {
        this.allowUntrustedTlsPrompt = value;
    }

    /**
     * allowVoiceDialing 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowVoiceDialing() {
        return allowVoiceDialing;
    }

    /**
     * allowVoiceDialing 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowVoiceDialing(EntityItemBoolType value) {
        this.allowVoiceDialing = value;
    }

    /**
     * allowYoutube 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowYoutube() {
        return allowYoutube;
    }

    /**
     * allowYoutube 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowYoutube(EntityItemBoolType value) {
        this.allowYoutube = value;
    }

    /**
     * allowItunes 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowItunes() {
        return allowItunes;
    }

    /**
     * allowItunes 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowItunes(EntityItemBoolType value) {
        this.allowItunes = value;
    }

    /**
     * Gets the value of the autonomousSingleAppModePermittedAppids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autonomousSingleAppModePermittedAppids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutonomousSingleAppModePermittedAppids().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemStringType }
     * 
     * 
     */
    public List<EntityItemStringType> getAutonomousSingleAppModePermittedAppids() {
        if (autonomousSingleAppModePermittedAppids == null) {
            autonomousSingleAppModePermittedAppids = new ArrayList<EntityItemStringType>();
        }
        return this.autonomousSingleAppModePermittedAppids;
    }

    /**
     * forceEncryptedBackup 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getForceEncryptedBackup() {
        return forceEncryptedBackup;
    }

    /**
     * forceEncryptedBackup 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setForceEncryptedBackup(EntityItemBoolType value) {
        this.forceEncryptedBackup = value;
    }

    /**
     * forceItunesStorePasswordEntry 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getForceItunesStorePasswordEntry() {
        return forceItunesStorePasswordEntry;
    }

    /**
     * forceItunesStorePasswordEntry 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setForceItunesStorePasswordEntry(EntityItemBoolType value) {
        this.forceItunesStorePasswordEntry = value;
    }

    /**
     * forceLimitAdTracking 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getForceLimitAdTracking() {
        return forceLimitAdTracking;
    }

    /**
     * forceLimitAdTracking 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setForceLimitAdTracking(EntityItemBoolType value) {
        this.forceLimitAdTracking = value;
    }

    /**
     * safariAllowAutoFill 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSafariAllowAutoFill() {
        return safariAllowAutoFill;
    }

    /**
     * safariAllowAutoFill 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSafariAllowAutoFill(EntityItemBoolType value) {
        this.safariAllowAutoFill = value;
    }

}
