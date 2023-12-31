//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_ios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemIntType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mitre.oval.xmlschema.oval_system_characteristics_5_ios package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InterfaceItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", "interface_item");
    private final static QName _LineItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", "line_item");
    private final static QName _SnmpItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", "snmp_item");
    private final static QName _SnmpcommunityItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", "snmpcommunity_item");
    private final static QName _SectionItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", "section_item");
    private final static QName _SnmpgroupItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", "snmpgroup_item");
    private final static QName _GlobalItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", "global_item");
    private final static QName _RoutingprotocolauthintfItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", "routingprotocolauthintf_item");
    private final static QName _TclshItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", "tclsh_item");
    private final static QName _SnmphostItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", "snmphost_item");
    private final static QName _SnmpviewItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", "snmpview_item");
    private final static QName _AclItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", "acl_item");
    private final static QName _SnmpuserItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", "snmpuser_item");
    private final static QName _BgpneighborItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", "bgpneighbor_item");
    private final static QName _VersionItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", "version_item");
    private final static QName _RouterItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", "router_item");
    private final static QName _RoutingprotocolauthintfItemProtocol_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", "protocol");
    private final static QName _RoutingprotocolauthintfItemAuthType_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", "auth_type");
    private final static QName _RoutingprotocolauthintfItemKeyChain_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", "key_chain");
    private final static QName _RoutingprotocolauthintfItemOspfArea_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", "ospf_area");
    private final static QName _RoutingprotocolauthintfItemId_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", "id");
    private final static QName _RoutingprotocolauthintfItemInterface_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", "interface");
    private final static QName _RouterItemRouterConfigLines_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", "router_config_lines");
    private final static QName _RouterItemOspfAuthenticationArea_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", "ospf_authentication_area");
    private final static QName _RouterItemBgpNeighbor_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", "bgp_neighbor");
    private final static QName _RouterItemNetwork_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", "network");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mitre.oval.xmlschema.oval_system_characteristics_5_ios
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InterfaceItem }
     * 
     */
    public InterfaceItem createInterfaceItem() {
        return new InterfaceItem();
    }

    /**
     * Create an instance of {@link RoutingprotocolauthintfItem }
     * 
     */
    public RoutingprotocolauthintfItem createRoutingprotocolauthintfItem() {
        return new RoutingprotocolauthintfItem();
    }

    /**
     * Create an instance of {@link RouterItem }
     * 
     */
    public RouterItem createRouterItem() {
        return new RouterItem();
    }

    /**
     * Create an instance of {@link SnmphostItem }
     * 
     */
    public SnmphostItem createSnmphostItem() {
        return new SnmphostItem();
    }

    /**
     * Create an instance of {@link SnmpcommunityItem }
     * 
     */
    public SnmpcommunityItem createSnmpcommunityItem() {
        return new SnmpcommunityItem();
    }

    /**
     * Create an instance of {@link SnmpuserItem }
     * 
     */
    public SnmpuserItem createSnmpuserItem() {
        return new SnmpuserItem();
    }

    /**
     * Create an instance of {@link SnmpviewItem }
     * 
     */
    public SnmpviewItem createSnmpviewItem() {
        return new SnmpviewItem();
    }

    /**
     * Create an instance of {@link SnmpItem }
     * 
     */
    public SnmpItem createSnmpItem() {
        return new SnmpItem();
    }

    /**
     * Create an instance of {@link VersionItem }
     * 
     */
    public VersionItem createVersionItem() {
        return new VersionItem();
    }

    /**
     * Create an instance of {@link SectionItem }
     * 
     */
    public SectionItem createSectionItem() {
        return new SectionItem();
    }

    /**
     * Create an instance of {@link TclshItem }
     * 
     */
    public TclshItem createTclshItem() {
        return new TclshItem();
    }

    /**
     * Create an instance of {@link LineItem }
     * 
     */
    public LineItem createLineItem() {
        return new LineItem();
    }

    /**
     * Create an instance of {@link BgpneighborItem }
     * 
     */
    public BgpneighborItem createBgpneighborItem() {
        return new BgpneighborItem();
    }

    /**
     * Create an instance of {@link AclItem }
     * 
     */
    public AclItem createAclItem() {
        return new AclItem();
    }

    /**
     * Create an instance of {@link GlobalItem }
     * 
     */
    public GlobalItem createGlobalItem() {
        return new GlobalItem();
    }

    /**
     * Create an instance of {@link SnmpgroupItem }
     * 
     */
    public SnmpgroupItem createSnmpgroupItem() {
        return new SnmpgroupItem();
    }

    /**
     * Create an instance of {@link EntityItemAccessListUseType }
     * 
     */
    public EntityItemAccessListUseType createEntityItemAccessListUseType() {
        return new EntityItemAccessListUseType();
    }

    /**
     * Create an instance of {@link EntityItemSNMPPrivStringType }
     * 
     */
    public EntityItemSNMPPrivStringType createEntityItemSNMPPrivStringType() {
        return new EntityItemSNMPPrivStringType();
    }

    /**
     * Create an instance of {@link EntityItemTrunkEncapType }
     * 
     */
    public EntityItemTrunkEncapType createEntityItemTrunkEncapType() {
        return new EntityItemTrunkEncapType();
    }

    /**
     * Create an instance of {@link EntityItemAccessListInterfaceDirectionType }
     * 
     */
    public EntityItemAccessListInterfaceDirectionType createEntityItemAccessListInterfaceDirectionType() {
        return new EntityItemAccessListInterfaceDirectionType();
    }

    /**
     * Create an instance of {@link EntityItemSNMPModeStringType }
     * 
     */
    public EntityItemSNMPModeStringType createEntityItemSNMPModeStringType() {
        return new EntityItemSNMPModeStringType();
    }

    /**
     * Create an instance of {@link EntityItemSNMPVersionStringType }
     * 
     */
    public EntityItemSNMPVersionStringType createEntityItemSNMPVersionStringType() {
        return new EntityItemSNMPVersionStringType();
    }

    /**
     * Create an instance of {@link EntityItemRoutingAuthTypeStringType }
     * 
     */
    public EntityItemRoutingAuthTypeStringType createEntityItemRoutingAuthTypeStringType() {
        return new EntityItemRoutingAuthTypeStringType();
    }

    /**
     * Create an instance of {@link EntityItemAccessListIPVersionType }
     * 
     */
    public EntityItemAccessListIPVersionType createEntityItemAccessListIPVersionType() {
        return new EntityItemAccessListIPVersionType();
    }

    /**
     * Create an instance of {@link EntityItemSNMPSecLevelStringType }
     * 
     */
    public EntityItemSNMPSecLevelStringType createEntityItemSNMPSecLevelStringType() {
        return new EntityItemSNMPSecLevelStringType();
    }

    /**
     * Create an instance of {@link EntityItemSNMPAuthStringType }
     * 
     */
    public EntityItemSNMPAuthStringType createEntityItemSNMPAuthStringType() {
        return new EntityItemSNMPAuthStringType();
    }

    /**
     * Create an instance of {@link EntityItemRoutingProtocolType }
     * 
     */
    public EntityItemRoutingProtocolType createEntityItemRoutingProtocolType() {
        return new EntityItemRoutingProtocolType();
    }

    /**
     * Create an instance of {@link EntityItemSwitchportModeType }
     * 
     */
    public EntityItemSwitchportModeType createEntityItemSwitchportModeType() {
        return new EntityItemSwitchportModeType();
    }

    /**
     * Create an instance of {@link InterfaceItem.IpDirectedBroadcastCommand }
     * 
     */
    public InterfaceItem.IpDirectedBroadcastCommand createInterfaceItemIpDirectedBroadcastCommand() {
        return new InterfaceItem.IpDirectedBroadcastCommand();
    }

    /**
     * Create an instance of {@link InterfaceItem.ProxyArpCommand }
     * 
     */
    public InterfaceItem.ProxyArpCommand createInterfaceItemProxyArpCommand() {
        return new InterfaceItem.ProxyArpCommand();
    }

    /**
     * Create an instance of {@link InterfaceItem.ShutdownCommand }
     * 
     */
    public InterfaceItem.ShutdownCommand createInterfaceItemShutdownCommand() {
        return new InterfaceItem.ShutdownCommand();
    }

    /**
     * Create an instance of {@link InterfaceItem.SwitchportNativeVlan }
     * 
     */
    public InterfaceItem.SwitchportNativeVlan createInterfaceItemSwitchportNativeVlan() {
        return new InterfaceItem.SwitchportNativeVlan();
    }

    /**
     * Create an instance of {@link InterfaceItem.SwitchportAccessVlan }
     * 
     */
    public InterfaceItem.SwitchportAccessVlan createInterfaceItemSwitchportAccessVlan() {
        return new InterfaceItem.SwitchportAccessVlan();
    }

    /**
     * Create an instance of {@link RoutingprotocolauthintfItem.OspfArea }
     * 
     */
    public RoutingprotocolauthintfItem.OspfArea createRoutingprotocolauthintfItemOspfArea() {
        return new RoutingprotocolauthintfItem.OspfArea();
    }

    /**
     * Create an instance of {@link RouterItem.OspfAuthenticationArea }
     * 
     */
    public RouterItem.OspfAuthenticationArea createRouterItemOspfAuthenticationArea() {
        return new RouterItem.OspfAuthenticationArea();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterfaceItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", name = "interface_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<InterfaceItem> createInterfaceItem(InterfaceItem value) {
        return new JAXBElement<InterfaceItem>(_InterfaceItem_QNAME, InterfaceItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", name = "line_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<LineItem> createLineItem(LineItem value) {
        return new JAXBElement<LineItem>(_LineItem_QNAME, LineItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", name = "snmp_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<SnmpItem> createSnmpItem(SnmpItem value) {
        return new JAXBElement<SnmpItem>(_SnmpItem_QNAME, SnmpItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpcommunityItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", name = "snmpcommunity_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<SnmpcommunityItem> createSnmpcommunityItem(SnmpcommunityItem value) {
        return new JAXBElement<SnmpcommunityItem>(_SnmpcommunityItem_QNAME, SnmpcommunityItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SectionItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", name = "section_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<SectionItem> createSectionItem(SectionItem value) {
        return new JAXBElement<SectionItem>(_SectionItem_QNAME, SectionItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpgroupItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", name = "snmpgroup_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<SnmpgroupItem> createSnmpgroupItem(SnmpgroupItem value) {
        return new JAXBElement<SnmpgroupItem>(_SnmpgroupItem_QNAME, SnmpgroupItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlobalItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", name = "global_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<GlobalItem> createGlobalItem(GlobalItem value) {
        return new JAXBElement<GlobalItem>(_GlobalItem_QNAME, GlobalItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutingprotocolauthintfItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", name = "routingprotocolauthintf_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<RoutingprotocolauthintfItem> createRoutingprotocolauthintfItem(RoutingprotocolauthintfItem value) {
        return new JAXBElement<RoutingprotocolauthintfItem>(_RoutingprotocolauthintfItem_QNAME, RoutingprotocolauthintfItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TclshItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", name = "tclsh_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<TclshItem> createTclshItem(TclshItem value) {
        return new JAXBElement<TclshItem>(_TclshItem_QNAME, TclshItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmphostItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", name = "snmphost_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<SnmphostItem> createSnmphostItem(SnmphostItem value) {
        return new JAXBElement<SnmphostItem>(_SnmphostItem_QNAME, SnmphostItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpviewItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", name = "snmpview_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<SnmpviewItem> createSnmpviewItem(SnmpviewItem value) {
        return new JAXBElement<SnmpviewItem>(_SnmpviewItem_QNAME, SnmpviewItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AclItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", name = "acl_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<AclItem> createAclItem(AclItem value) {
        return new JAXBElement<AclItem>(_AclItem_QNAME, AclItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpuserItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", name = "snmpuser_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<SnmpuserItem> createSnmpuserItem(SnmpuserItem value) {
        return new JAXBElement<SnmpuserItem>(_SnmpuserItem_QNAME, SnmpuserItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BgpneighborItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", name = "bgpneighbor_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<BgpneighborItem> createBgpneighborItem(BgpneighborItem value) {
        return new JAXBElement<BgpneighborItem>(_BgpneighborItem_QNAME, BgpneighborItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", name = "version_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<VersionItem> createVersionItem(VersionItem value) {
        return new JAXBElement<VersionItem>(_VersionItem_QNAME, VersionItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouterItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", name = "router_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<RouterItem> createRouterItem(RouterItem value) {
        return new JAXBElement<RouterItem>(_RouterItem_QNAME, RouterItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemRoutingProtocolType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", name = "protocol", scope = RoutingprotocolauthintfItem.class)
    public JAXBElement<EntityItemRoutingProtocolType> createRoutingprotocolauthintfItemProtocol(EntityItemRoutingProtocolType value) {
        return new JAXBElement<EntityItemRoutingProtocolType>(_RoutingprotocolauthintfItemProtocol_QNAME, EntityItemRoutingProtocolType.class, RoutingprotocolauthintfItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemRoutingAuthTypeStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", name = "auth_type", scope = RoutingprotocolauthintfItem.class)
    public JAXBElement<EntityItemRoutingAuthTypeStringType> createRoutingprotocolauthintfItemAuthType(EntityItemRoutingAuthTypeStringType value) {
        return new JAXBElement<EntityItemRoutingAuthTypeStringType>(_RoutingprotocolauthintfItemAuthType_QNAME, EntityItemRoutingAuthTypeStringType.class, RoutingprotocolauthintfItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", name = "key_chain", scope = RoutingprotocolauthintfItem.class)
    public JAXBElement<EntityItemStringType> createRoutingprotocolauthintfItemKeyChain(EntityItemStringType value) {
        return new JAXBElement<EntityItemStringType>(_RoutingprotocolauthintfItemKeyChain_QNAME, EntityItemStringType.class, RoutingprotocolauthintfItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutingprotocolauthintfItem.OspfArea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", name = "ospf_area", scope = RoutingprotocolauthintfItem.class)
    public JAXBElement<RoutingprotocolauthintfItem.OspfArea> createRoutingprotocolauthintfItemOspfArea(RoutingprotocolauthintfItem.OspfArea value) {
        return new JAXBElement<RoutingprotocolauthintfItem.OspfArea>(_RoutingprotocolauthintfItemOspfArea_QNAME, RoutingprotocolauthintfItem.OspfArea.class, RoutingprotocolauthintfItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemIntType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", name = "id", scope = RoutingprotocolauthintfItem.class)
    public JAXBElement<EntityItemIntType> createRoutingprotocolauthintfItemId(EntityItemIntType value) {
        return new JAXBElement<EntityItemIntType>(_RoutingprotocolauthintfItemId_QNAME, EntityItemIntType.class, RoutingprotocolauthintfItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", name = "interface", scope = RoutingprotocolauthintfItem.class)
    public JAXBElement<EntityItemStringType> createRoutingprotocolauthintfItemInterface(EntityItemStringType value) {
        return new JAXBElement<EntityItemStringType>(_RoutingprotocolauthintfItemInterface_QNAME, EntityItemStringType.class, RoutingprotocolauthintfItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", name = "router_config_lines", scope = RouterItem.class)
    public JAXBElement<EntityItemStringType> createRouterItemRouterConfigLines(EntityItemStringType value) {
        return new JAXBElement<EntityItemStringType>(_RouterItemRouterConfigLines_QNAME, EntityItemStringType.class, RouterItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemRoutingProtocolType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", name = "protocol", scope = RouterItem.class)
    public JAXBElement<EntityItemRoutingProtocolType> createRouterItemProtocol(EntityItemRoutingProtocolType value) {
        return new JAXBElement<EntityItemRoutingProtocolType>(_RoutingprotocolauthintfItemProtocol_QNAME, EntityItemRoutingProtocolType.class, RouterItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouterItem.OspfAuthenticationArea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", name = "ospf_authentication_area", scope = RouterItem.class)
    public JAXBElement<RouterItem.OspfAuthenticationArea> createRouterItemOspfAuthenticationArea(RouterItem.OspfAuthenticationArea value) {
        return new JAXBElement<RouterItem.OspfAuthenticationArea>(_RouterItemOspfAuthenticationArea_QNAME, RouterItem.OspfAuthenticationArea.class, RouterItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemIntType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", name = "id", scope = RouterItem.class)
    public JAXBElement<EntityItemIntType> createRouterItemId(EntityItemIntType value) {
        return new JAXBElement<EntityItemIntType>(_RoutingprotocolauthintfItemId_QNAME, EntityItemIntType.class, RouterItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", name = "bgp_neighbor", scope = RouterItem.class)
    public JAXBElement<EntityItemStringType> createRouterItemBgpNeighbor(EntityItemStringType value) {
        return new JAXBElement<EntityItemStringType>(_RouterItemBgpNeighbor_QNAME, EntityItemStringType.class, RouterItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios", name = "network", scope = RouterItem.class)
    public JAXBElement<EntityItemStringType> createRouterItemNetwork(EntityItemStringType value) {
        return new JAXBElement<EntityItemStringType>(_RouterItemNetwork_QNAME, EntityItemStringType.class, RouterItem.class, value);
    }

}
