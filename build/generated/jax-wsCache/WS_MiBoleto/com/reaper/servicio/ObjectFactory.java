
package com.reaper.servicio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.reaper.servicio package. 
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

    private final static QName _Cliente_QNAME = new QName("http://servicio.reaper.com/", "cliente");
    private final static QName _Escenario_QNAME = new QName("http://servicio.reaper.com/", "escenario");
    private final static QName _Espectaculo_QNAME = new QName("http://servicio.reaper.com/", "espectaculo");
    private final static QName _EspectaculoCompleto_QNAME = new QName("http://servicio.reaper.com/", "espectaculoCompleto");
    private final static QName _EspectaculoCompletoResponse_QNAME = new QName("http://servicio.reaper.com/", "espectaculoCompletoResponse");
    private final static QName _Espectaculolocalidadescenario_QNAME = new QName("http://servicio.reaper.com/", "espectaculolocalidadescenario");
    private final static QName _Espectaculoprograma_QNAME = new QName("http://servicio.reaper.com/", "espectaculoprograma");
    private final static QName _Formapago_QNAME = new QName("http://servicio.reaper.com/", "formapago");
    private final static QName _ListCliente_QNAME = new QName("http://servicio.reaper.com/", "listCliente");
    private final static QName _ListClienteResponse_QNAME = new QName("http://servicio.reaper.com/", "listClienteResponse");
    private final static QName _ListFormaPago_QNAME = new QName("http://servicio.reaper.com/", "listFormaPago");
    private final static QName _ListFormaPagoResponse_QNAME = new QName("http://servicio.reaper.com/", "listFormaPagoResponse");
    private final static QName _ListVendedor_QNAME = new QName("http://servicio.reaper.com/", "listVendedor");
    private final static QName _ListVendedorResponse_QNAME = new QName("http://servicio.reaper.com/", "listVendedorResponse");
    private final static QName _Localidad_QNAME = new QName("http://servicio.reaper.com/", "localidad");
    private final static QName _LocalidadCompleto_QNAME = new QName("http://servicio.reaper.com/", "localidadCompleto");
    private final static QName _LocalidadCompletoResponse_QNAME = new QName("http://servicio.reaper.com/", "localidadCompletoResponse");
    private final static QName _Vendedor_QNAME = new QName("http://servicio.reaper.com/", "vendedor");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.reaper.servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link Escenario }
     * 
     */
    public Escenario createEscenario() {
        return new Escenario();
    }

    /**
     * Create an instance of {@link Espectaculo }
     * 
     */
    public Espectaculo createEspectaculo() {
        return new Espectaculo();
    }

    /**
     * Create an instance of {@link EspectaculoCompleto }
     * 
     */
    public EspectaculoCompleto createEspectaculoCompleto() {
        return new EspectaculoCompleto();
    }

    /**
     * Create an instance of {@link EspectaculoCompletoResponse }
     * 
     */
    public EspectaculoCompletoResponse createEspectaculoCompletoResponse() {
        return new EspectaculoCompletoResponse();
    }

    /**
     * Create an instance of {@link Espectaculolocalidadescenario }
     * 
     */
    public Espectaculolocalidadescenario createEspectaculolocalidadescenario() {
        return new Espectaculolocalidadescenario();
    }

    /**
     * Create an instance of {@link Espectaculoprograma }
     * 
     */
    public Espectaculoprograma createEspectaculoprograma() {
        return new Espectaculoprograma();
    }

    /**
     * Create an instance of {@link Formapago }
     * 
     */
    public Formapago createFormapago() {
        return new Formapago();
    }

    /**
     * Create an instance of {@link ListCliente }
     * 
     */
    public ListCliente createListCliente() {
        return new ListCliente();
    }

    /**
     * Create an instance of {@link ListClienteResponse }
     * 
     */
    public ListClienteResponse createListClienteResponse() {
        return new ListClienteResponse();
    }

    /**
     * Create an instance of {@link ListFormaPago }
     * 
     */
    public ListFormaPago createListFormaPago() {
        return new ListFormaPago();
    }

    /**
     * Create an instance of {@link ListFormaPagoResponse }
     * 
     */
    public ListFormaPagoResponse createListFormaPagoResponse() {
        return new ListFormaPagoResponse();
    }

    /**
     * Create an instance of {@link ListVendedor }
     * 
     */
    public ListVendedor createListVendedor() {
        return new ListVendedor();
    }

    /**
     * Create an instance of {@link ListVendedorResponse }
     * 
     */
    public ListVendedorResponse createListVendedorResponse() {
        return new ListVendedorResponse();
    }

    /**
     * Create an instance of {@link Localidad }
     * 
     */
    public Localidad createLocalidad() {
        return new Localidad();
    }

    /**
     * Create an instance of {@link LocalidadCompleto }
     * 
     */
    public LocalidadCompleto createLocalidadCompleto() {
        return new LocalidadCompleto();
    }

    /**
     * Create an instance of {@link LocalidadCompletoResponse }
     * 
     */
    public LocalidadCompletoResponse createLocalidadCompletoResponse() {
        return new LocalidadCompletoResponse();
    }

    /**
     * Create an instance of {@link Vendedor }
     * 
     */
    public Vendedor createVendedor() {
        return new Vendedor();
    }

    /**
     * Create an instance of {@link EspectaculolocalidadescenarioPK }
     * 
     */
    public EspectaculolocalidadescenarioPK createEspectaculolocalidadescenarioPK() {
        return new EspectaculolocalidadescenarioPK();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "cliente")
    public JAXBElement<Cliente> createCliente(Cliente value) {
        return new JAXBElement<Cliente>(_Cliente_QNAME, Cliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Escenario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "escenario")
    public JAXBElement<Escenario> createEscenario(Escenario value) {
        return new JAXBElement<Escenario>(_Escenario_QNAME, Escenario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Espectaculo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "espectaculo")
    public JAXBElement<Espectaculo> createEspectaculo(Espectaculo value) {
        return new JAXBElement<Espectaculo>(_Espectaculo_QNAME, Espectaculo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EspectaculoCompleto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "espectaculoCompleto")
    public JAXBElement<EspectaculoCompleto> createEspectaculoCompleto(EspectaculoCompleto value) {
        return new JAXBElement<EspectaculoCompleto>(_EspectaculoCompleto_QNAME, EspectaculoCompleto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EspectaculoCompletoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "espectaculoCompletoResponse")
    public JAXBElement<EspectaculoCompletoResponse> createEspectaculoCompletoResponse(EspectaculoCompletoResponse value) {
        return new JAXBElement<EspectaculoCompletoResponse>(_EspectaculoCompletoResponse_QNAME, EspectaculoCompletoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Espectaculolocalidadescenario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "espectaculolocalidadescenario")
    public JAXBElement<Espectaculolocalidadescenario> createEspectaculolocalidadescenario(Espectaculolocalidadescenario value) {
        return new JAXBElement<Espectaculolocalidadescenario>(_Espectaculolocalidadescenario_QNAME, Espectaculolocalidadescenario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Espectaculoprograma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "espectaculoprograma")
    public JAXBElement<Espectaculoprograma> createEspectaculoprograma(Espectaculoprograma value) {
        return new JAXBElement<Espectaculoprograma>(_Espectaculoprograma_QNAME, Espectaculoprograma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Formapago }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "formapago")
    public JAXBElement<Formapago> createFormapago(Formapago value) {
        return new JAXBElement<Formapago>(_Formapago_QNAME, Formapago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "listCliente")
    public JAXBElement<ListCliente> createListCliente(ListCliente value) {
        return new JAXBElement<ListCliente>(_ListCliente_QNAME, ListCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "listClienteResponse")
    public JAXBElement<ListClienteResponse> createListClienteResponse(ListClienteResponse value) {
        return new JAXBElement<ListClienteResponse>(_ListClienteResponse_QNAME, ListClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListFormaPago }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "listFormaPago")
    public JAXBElement<ListFormaPago> createListFormaPago(ListFormaPago value) {
        return new JAXBElement<ListFormaPago>(_ListFormaPago_QNAME, ListFormaPago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListFormaPagoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "listFormaPagoResponse")
    public JAXBElement<ListFormaPagoResponse> createListFormaPagoResponse(ListFormaPagoResponse value) {
        return new JAXBElement<ListFormaPagoResponse>(_ListFormaPagoResponse_QNAME, ListFormaPagoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListVendedor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "listVendedor")
    public JAXBElement<ListVendedor> createListVendedor(ListVendedor value) {
        return new JAXBElement<ListVendedor>(_ListVendedor_QNAME, ListVendedor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListVendedorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "listVendedorResponse")
    public JAXBElement<ListVendedorResponse> createListVendedorResponse(ListVendedorResponse value) {
        return new JAXBElement<ListVendedorResponse>(_ListVendedorResponse_QNAME, ListVendedorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Localidad }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "localidad")
    public JAXBElement<Localidad> createLocalidad(Localidad value) {
        return new JAXBElement<Localidad>(_Localidad_QNAME, Localidad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalidadCompleto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "localidadCompleto")
    public JAXBElement<LocalidadCompleto> createLocalidadCompleto(LocalidadCompleto value) {
        return new JAXBElement<LocalidadCompleto>(_LocalidadCompleto_QNAME, LocalidadCompleto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalidadCompletoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "localidadCompletoResponse")
    public JAXBElement<LocalidadCompletoResponse> createLocalidadCompletoResponse(LocalidadCompletoResponse value) {
        return new JAXBElement<LocalidadCompletoResponse>(_LocalidadCompletoResponse_QNAME, LocalidadCompletoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Vendedor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "vendedor")
    public JAXBElement<Vendedor> createVendedor(Vendedor value) {
        return new JAXBElement<Vendedor>(_Vendedor_QNAME, Vendedor.class, null, value);
    }

}
