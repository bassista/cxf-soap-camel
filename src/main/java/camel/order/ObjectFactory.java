
package camel.order;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the camel.order package. 
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

    private final static QName _PartName_QNAME = new QName("http://order.camel", "partName");
    private final static QName _Amount_QNAME = new QName("http://order.camel", "amount");
    private final static QName _CustomerName_QNAME = new QName("http://order.camel", "customerName");
    private final static QName _ResultCode_QNAME = new QName("http://order.camel", "resultCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: camel.order
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://order.camel", name = "partName")
    public JAXBElement<String> createPartName(String value) {
        return new JAXBElement<String>(_PartName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://order.camel", name = "amount")
    public JAXBElement<Integer> createAmount(Integer value) {
        return new JAXBElement<Integer>(_Amount_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://order.camel", name = "customerName")
    public JAXBElement<String> createCustomerName(String value) {
        return new JAXBElement<String>(_CustomerName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://order.camel", name = "resultCode")
    public JAXBElement<String> createResultCode(String value) {
        return new JAXBElement<String>(_ResultCode_QNAME, String.class, null, value);
    }

}
