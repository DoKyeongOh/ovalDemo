//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.08.18 시간 09:33:12 AM KST 
//


package org.mitre.oval.xmlschema.oval_system_characteristics_5_freebsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mitre.oval.xmlschema.oval_system_characteristics_5_freebsd package. 
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

    private final static QName _PortinfoItem_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#freebsd", "portinfo_item");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mitre.oval.xmlschema.oval_system_characteristics_5_freebsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PortinfoItem }
     * 
     */
    public PortinfoItem createPortinfoItem() {
        return new PortinfoItem();
    }

    /**
     * Create an instance of {@link PortinfoItem.Version }
     * 
     */
    public PortinfoItem.Version createPortinfoItemVersion() {
        return new PortinfoItem.Version();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortinfoItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#freebsd", name = "portinfo_item", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", substitutionHeadName = "item")
    public JAXBElement<PortinfoItem> createPortinfoItem(PortinfoItem value) {
        return new JAXBElement<PortinfoItem>(_PortinfoItem_QNAME, PortinfoItem.class, null, value);
    }

}
