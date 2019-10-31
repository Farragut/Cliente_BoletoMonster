
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
    private final static QName _ClienteById_QNAME = new QName("http://servicio.reaper.com/", "clienteById");
    private final static QName _ClienteByIdResponse_QNAME = new QName("http://servicio.reaper.com/", "clienteByIdResponse");
    private final static QName _Escenario_QNAME = new QName("http://servicio.reaper.com/", "escenario");
    private final static QName _EscenarioById_QNAME = new QName("http://servicio.reaper.com/", "escenarioById");
    private final static QName _EscenarioByIdResponse_QNAME = new QName("http://servicio.reaper.com/", "escenarioByIdResponse");
    private final static QName _EscribirFactura_QNAME = new QName("http://servicio.reaper.com/", "escribirFactura");
    private final static QName _EspProById_QNAME = new QName("http://servicio.reaper.com/", "espProById");
    private final static QName _EspProByIdResponse_QNAME = new QName("http://servicio.reaper.com/", "espProByIdResponse");
    private final static QName _Espectaculo_QNAME = new QName("http://servicio.reaper.com/", "espectaculo");
    private final static QName _EspectaculoById_QNAME = new QName("http://servicio.reaper.com/", "espectaculoById");
    private final static QName _EspectaculoByIdResponse_QNAME = new QName("http://servicio.reaper.com/", "espectaculoByIdResponse");
    private final static QName _EspectaculoCompleto_QNAME = new QName("http://servicio.reaper.com/", "espectaculoCompleto");
    private final static QName _EspectaculoCompletoResponse_QNAME = new QName("http://servicio.reaper.com/", "espectaculoCompletoResponse");
    private final static QName _Espectaculolocalidadescenario_QNAME = new QName("http://servicio.reaper.com/", "espectaculolocalidadescenario");
    private final static QName _Espectaculoprograma_QNAME = new QName("http://servicio.reaper.com/", "espectaculoprograma");
    private final static QName _Factura_QNAME = new QName("http://servicio.reaper.com/", "factura");
    private final static QName _FormaPagoById_QNAME = new QName("http://servicio.reaper.com/", "formaPagoById");
    private final static QName _FormaPagoByIdResponse_QNAME = new QName("http://servicio.reaper.com/", "formaPagoByIdResponse");
    private final static QName _Formapago_QNAME = new QName("http://servicio.reaper.com/", "formapago");
    private final static QName _GetFactura_QNAME = new QName("http://servicio.reaper.com/", "getFactura");
    private final static QName _GetFacturaResponse_QNAME = new QName("http://servicio.reaper.com/", "getFacturaResponse");
    private final static QName _InsertNewDetalle_QNAME = new QName("http://servicio.reaper.com/", "insertNewDetalle");
    private final static QName _ListCliente_QNAME = new QName("http://servicio.reaper.com/", "listCliente");
    private final static QName _ListClienteResponse_QNAME = new QName("http://servicio.reaper.com/", "listClienteResponse");
    private final static QName _ListFormaPago_QNAME = new QName("http://servicio.reaper.com/", "listFormaPago");
    private final static QName _ListFormaPagoResponse_QNAME = new QName("http://servicio.reaper.com/", "listFormaPagoResponse");
    private final static QName _ListVendedor_QNAME = new QName("http://servicio.reaper.com/", "listVendedor");
    private final static QName _ListVendedorResponse_QNAME = new QName("http://servicio.reaper.com/", "listVendedorResponse");
    private final static QName _Localidad_QNAME = new QName("http://servicio.reaper.com/", "localidad");
    private final static QName _LocalidadById_QNAME = new QName("http://servicio.reaper.com/", "localidadById");
    private final static QName _LocalidadByIdResponse_QNAME = new QName("http://servicio.reaper.com/", "localidadByIdResponse");
    private final static QName _LocalidadCompleto_QNAME = new QName("http://servicio.reaper.com/", "localidadCompleto");
    private final static QName _LocalidadCompletoResponse_QNAME = new QName("http://servicio.reaper.com/", "localidadCompletoResponse");
    private final static QName _ModificarLocalidad_QNAME = new QName("http://servicio.reaper.com/", "modificarLocalidad");
    private final static QName _Vendedor_QNAME = new QName("http://servicio.reaper.com/", "vendedor");
    private final static QName _VendedorById_QNAME = new QName("http://servicio.reaper.com/", "vendedorById");
    private final static QName _VendedorByIdResponse_QNAME = new QName("http://servicio.reaper.com/", "vendedorByIdResponse");

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
     * Create an instance of {@link ClienteById }
     * 
     */
    public ClienteById createClienteById() {
        return new ClienteById();
    }

    /**
     * Create an instance of {@link ClienteByIdResponse }
     * 
     */
    public ClienteByIdResponse createClienteByIdResponse() {
        return new ClienteByIdResponse();
    }

    /**
     * Create an instance of {@link Escenario }
     * 
     */
    public Escenario createEscenario() {
        return new Escenario();
    }

    /**
     * Create an instance of {@link EscenarioById }
     * 
     */
    public EscenarioById createEscenarioById() {
        return new EscenarioById();
    }

    /**
     * Create an instance of {@link EscenarioByIdResponse }
     * 
     */
    public EscenarioByIdResponse createEscenarioByIdResponse() {
        return new EscenarioByIdResponse();
    }

    /**
     * Create an instance of {@link EscribirFactura }
     * 
     */
    public EscribirFactura createEscribirFactura() {
        return new EscribirFactura();
    }

    /**
     * Create an instance of {@link EspProById }
     * 
     */
    public EspProById createEspProById() {
        return new EspProById();
    }

    /**
     * Create an instance of {@link EspProByIdResponse }
     * 
     */
    public EspProByIdResponse createEspProByIdResponse() {
        return new EspProByIdResponse();
    }

    /**
     * Create an instance of {@link Espectaculo }
     * 
     */
    public Espectaculo createEspectaculo() {
        return new Espectaculo();
    }

    /**
     * Create an instance of {@link EspectaculoById }
     * 
     */
    public EspectaculoById createEspectaculoById() {
        return new EspectaculoById();
    }

    /**
     * Create an instance of {@link EspectaculoByIdResponse }
     * 
     */
    public EspectaculoByIdResponse createEspectaculoByIdResponse() {
        return new EspectaculoByIdResponse();
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
     * Create an instance of {@link Factura }
     * 
     */
    public Factura createFactura() {
        return new Factura();
    }

    /**
     * Create an instance of {@link FormaPagoById }
     * 
     */
    public FormaPagoById createFormaPagoById() {
        return new FormaPagoById();
    }

    /**
     * Create an instance of {@link FormaPagoByIdResponse }
     * 
     */
    public FormaPagoByIdResponse createFormaPagoByIdResponse() {
        return new FormaPagoByIdResponse();
    }

    /**
     * Create an instance of {@link Formapago }
     * 
     */
    public Formapago createFormapago() {
        return new Formapago();
    }

    /**
     * Create an instance of {@link GetFactura }
     * 
     */
    public GetFactura createGetFactura() {
        return new GetFactura();
    }

    /**
     * Create an instance of {@link GetFacturaResponse }
     * 
     */
    public GetFacturaResponse createGetFacturaResponse() {
        return new GetFacturaResponse();
    }

    /**
     * Create an instance of {@link InsertNewDetalle }
     * 
     */
    public InsertNewDetalle createInsertNewDetalle() {
        return new InsertNewDetalle();
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
     * Create an instance of {@link LocalidadById }
     * 
     */
    public LocalidadById createLocalidadById() {
        return new LocalidadById();
    }

    /**
     * Create an instance of {@link LocalidadByIdResponse }
     * 
     */
    public LocalidadByIdResponse createLocalidadByIdResponse() {
        return new LocalidadByIdResponse();
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
     * Create an instance of {@link ModificarLocalidad }
     * 
     */
    public ModificarLocalidad createModificarLocalidad() {
        return new ModificarLocalidad();
    }

    /**
     * Create an instance of {@link Vendedor }
     * 
     */
    public Vendedor createVendedor() {
        return new Vendedor();
    }

    /**
     * Create an instance of {@link VendedorById }
     * 
     */
    public VendedorById createVendedorById() {
        return new VendedorById();
    }

    /**
     * Create an instance of {@link VendedorByIdResponse }
     * 
     */
    public VendedorByIdResponse createVendedorByIdResponse() {
        return new VendedorByIdResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ClienteById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "clienteById")
    public JAXBElement<ClienteById> createClienteById(ClienteById value) {
        return new JAXBElement<ClienteById>(_ClienteById_QNAME, ClienteById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClienteByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "clienteByIdResponse")
    public JAXBElement<ClienteByIdResponse> createClienteByIdResponse(ClienteByIdResponse value) {
        return new JAXBElement<ClienteByIdResponse>(_ClienteByIdResponse_QNAME, ClienteByIdResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EscenarioById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "escenarioById")
    public JAXBElement<EscenarioById> createEscenarioById(EscenarioById value) {
        return new JAXBElement<EscenarioById>(_EscenarioById_QNAME, EscenarioById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EscenarioByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "escenarioByIdResponse")
    public JAXBElement<EscenarioByIdResponse> createEscenarioByIdResponse(EscenarioByIdResponse value) {
        return new JAXBElement<EscenarioByIdResponse>(_EscenarioByIdResponse_QNAME, EscenarioByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EscribirFactura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "escribirFactura")
    public JAXBElement<EscribirFactura> createEscribirFactura(EscribirFactura value) {
        return new JAXBElement<EscribirFactura>(_EscribirFactura_QNAME, EscribirFactura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EspProById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "espProById")
    public JAXBElement<EspProById> createEspProById(EspProById value) {
        return new JAXBElement<EspProById>(_EspProById_QNAME, EspProById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EspProByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "espProByIdResponse")
    public JAXBElement<EspProByIdResponse> createEspProByIdResponse(EspProByIdResponse value) {
        return new JAXBElement<EspProByIdResponse>(_EspProByIdResponse_QNAME, EspProByIdResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EspectaculoById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "espectaculoById")
    public JAXBElement<EspectaculoById> createEspectaculoById(EspectaculoById value) {
        return new JAXBElement<EspectaculoById>(_EspectaculoById_QNAME, EspectaculoById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EspectaculoByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "espectaculoByIdResponse")
    public JAXBElement<EspectaculoByIdResponse> createEspectaculoByIdResponse(EspectaculoByIdResponse value) {
        return new JAXBElement<EspectaculoByIdResponse>(_EspectaculoByIdResponse_QNAME, EspectaculoByIdResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Factura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "factura")
    public JAXBElement<Factura> createFactura(Factura value) {
        return new JAXBElement<Factura>(_Factura_QNAME, Factura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormaPagoById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "formaPagoById")
    public JAXBElement<FormaPagoById> createFormaPagoById(FormaPagoById value) {
        return new JAXBElement<FormaPagoById>(_FormaPagoById_QNAME, FormaPagoById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormaPagoByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "formaPagoByIdResponse")
    public JAXBElement<FormaPagoByIdResponse> createFormaPagoByIdResponse(FormaPagoByIdResponse value) {
        return new JAXBElement<FormaPagoByIdResponse>(_FormaPagoByIdResponse_QNAME, FormaPagoByIdResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFactura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "getFactura")
    public JAXBElement<GetFactura> createGetFactura(GetFactura value) {
        return new JAXBElement<GetFactura>(_GetFactura_QNAME, GetFactura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFacturaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "getFacturaResponse")
    public JAXBElement<GetFacturaResponse> createGetFacturaResponse(GetFacturaResponse value) {
        return new JAXBElement<GetFacturaResponse>(_GetFacturaResponse_QNAME, GetFacturaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertNewDetalle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "insertNewDetalle")
    public JAXBElement<InsertNewDetalle> createInsertNewDetalle(InsertNewDetalle value) {
        return new JAXBElement<InsertNewDetalle>(_InsertNewDetalle_QNAME, InsertNewDetalle.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalidadById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "localidadById")
    public JAXBElement<LocalidadById> createLocalidadById(LocalidadById value) {
        return new JAXBElement<LocalidadById>(_LocalidadById_QNAME, LocalidadById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalidadByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "localidadByIdResponse")
    public JAXBElement<LocalidadByIdResponse> createLocalidadByIdResponse(LocalidadByIdResponse value) {
        return new JAXBElement<LocalidadByIdResponse>(_LocalidadByIdResponse_QNAME, LocalidadByIdResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarLocalidad }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "modificarLocalidad")
    public JAXBElement<ModificarLocalidad> createModificarLocalidad(ModificarLocalidad value) {
        return new JAXBElement<ModificarLocalidad>(_ModificarLocalidad_QNAME, ModificarLocalidad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Vendedor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "vendedor")
    public JAXBElement<Vendedor> createVendedor(Vendedor value) {
        return new JAXBElement<Vendedor>(_Vendedor_QNAME, Vendedor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VendedorById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "vendedorById")
    public JAXBElement<VendedorById> createVendedorById(VendedorById value) {
        return new JAXBElement<VendedorById>(_VendedorById_QNAME, VendedorById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VendedorByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.reaper.com/", name = "vendedorByIdResponse")
    public JAXBElement<VendedorByIdResponse> createVendedorByIdResponse(VendedorByIdResponse value) {
        return new JAXBElement<VendedorByIdResponse>(_VendedorByIdResponse_QNAME, VendedorByIdResponse.class, null, value);
    }

}
