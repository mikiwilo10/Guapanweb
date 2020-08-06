
package ec.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.soap package. 
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

    private final static QName _Pedido_QNAME = new QName("http://service.AppDis.ups.edu.ec/", "Pedido");
    private final static QName _PedidoResponse_QNAME = new QName("http://service.AppDis.ups.edu.ec/", "PedidoResponse");
    private final static QName _Exception_QNAME = new QName("http://service.AppDis.ups.edu.ec/", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PedidoResponse }
     * 
     */
    public PedidoResponse createPedidoResponse() {
        return new PedidoResponse();
    }

    /**
     * Create an instance of {@link Pedido }
     * 
     */
    public Pedido createPedido() {
        return new Pedido();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.AppDis.ups.edu.ec/", name = "Pedido")
    public JAXBElement<Pedido> createPedido(Pedido value) {
        return new JAXBElement<Pedido>(_Pedido_QNAME, Pedido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PedidoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.AppDis.ups.edu.ec/", name = "PedidoResponse")
    public JAXBElement<PedidoResponse> createPedidoResponse(PedidoResponse value) {
        return new JAXBElement<PedidoResponse>(_PedidoResponse_QNAME, PedidoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.AppDis.ups.edu.ec/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

}
