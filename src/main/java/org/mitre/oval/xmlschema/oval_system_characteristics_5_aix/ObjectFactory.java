//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_aix;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mitre.oval.xmlschema.oval_system_characteristics_5_aix package. 
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

    private final static QName _InterimFixItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#aix", "interim_fix_item");
    private final static QName _NoItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#aix", "no_item");
    private final static QName _FilesetItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#aix", "fileset_item");
    private final static QName _FixItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#aix", "fix_item");
    private final static QName _OslevelItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#aix", "oslevel_item");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mitre.oval.xmlschema.oval_system_characteristics_5_aix
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NoItem }
     * 
     */
    public NoItem createNoItem() {
        return new NoItem();
    }

    /**
     * Create an instance of {@link OslevelItem }
     * 
     */
    public OslevelItem createOslevelItem() {
        return new OslevelItem();
    }

    /**
     * Create an instance of {@link FilesetItem }
     * 
     */
    public FilesetItem createFilesetItem() {
        return new FilesetItem();
    }

    /**
     * Create an instance of {@link FixItem }
     * 
     */
    public FixItem createFixItem() {
        return new FixItem();
    }

    /**
     * Create an instance of {@link InterimFixItem }
     * 
     */
    public InterimFixItem createInterimFixItem() {
        return new InterimFixItem();
    }

    /**
     * Create an instance of {@link EntityItemFixInstallationStatusType }
     * 
     */
    public EntityItemFixInstallationStatusType createEntityItemFixInstallationStatusType() {
        return new EntityItemFixInstallationStatusType();
    }

    /**
     * Create an instance of {@link EntityItemInterimFixStateType }
     * 
     */
    public EntityItemInterimFixStateType createEntityItemInterimFixStateType() {
        return new EntityItemInterimFixStateType();
    }

    /**
     * Create an instance of {@link EntityItemFilesetStateType }
     * 
     */
    public EntityItemFilesetStateType createEntityItemFilesetStateType() {
        return new EntityItemFilesetStateType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterimFixItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#aix", name = "interim_fix_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<InterimFixItem> createInterimFixItem(InterimFixItem value) {
        return new JAXBElement<InterimFixItem>(_InterimFixItem_QNAME, InterimFixItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#aix", name = "no_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<NoItem> createNoItem(NoItem value) {
        return new JAXBElement<NoItem>(_NoItem_QNAME, NoItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilesetItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#aix", name = "fileset_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<FilesetItem> createFilesetItem(FilesetItem value) {
        return new JAXBElement<FilesetItem>(_FilesetItem_QNAME, FilesetItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FixItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#aix", name = "fix_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<FixItem> createFixItem(FixItem value) {
        return new JAXBElement<FixItem>(_FixItem_QNAME, FixItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OslevelItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#aix", name = "oslevel_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<OslevelItem> createOslevelItem(OslevelItem value) {
        return new JAXBElement<OslevelItem>(_OslevelItem_QNAME, OslevelItem.class, null, value);
    }

}
