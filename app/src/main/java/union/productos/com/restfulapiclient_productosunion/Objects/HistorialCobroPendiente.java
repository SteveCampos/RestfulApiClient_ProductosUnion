package union.productos.com.restfulapiclient_productosunion.Objects;

/**
 * Created by Usuario on 07/01/2015.
 */
public class HistorialCobroPendiente {

    private int idEstablec;
    private int idComprobanteVenta;
    private int idPlanPago;
    private int idPlanPagoDetalle;
    private String descripcion;
    private String doc;
    private String fechaCobro;
    private Double montoAPagar;
    private String estado;

    public HistorialCobroPendiente(int idEstablec, int idComprobanteVenta, int idPlanPago, int idPlanPagoDetalle, String descripcion, String doc, String fechaCobro, Double montoAPagar, String estado) {
        this.idEstablec = idEstablec;
        this.idComprobanteVenta = idComprobanteVenta;
        this.idPlanPago = idPlanPago;
        this.idPlanPagoDetalle = idPlanPagoDetalle;
        this.descripcion = descripcion;
        this.doc = doc;
        this.fechaCobro = fechaCobro;
        this.montoAPagar = montoAPagar;
        this.estado = estado;
    }

    public HistorialCobroPendiente() {
        this.idEstablec = 0;
        this.idComprobanteVenta = 0;
        this.idPlanPago = 0;
        this.idPlanPagoDetalle = 0;
        this.descripcion = null;
        this.doc = null;
        this.fechaCobro = null;
        this.montoAPagar = 0.0;
        this.estado = null;
    }

    public int getIdEstablec() {
        return idEstablec;
    }

    public void setIdEstablec(int idEstablec) {
        this.idEstablec = idEstablec;
    }

    public int getIdComprobanteVenta() {
        return idComprobanteVenta;
    }

    public void setIdComprobanteVenta(int idComprobanteVenta) {
        this.idComprobanteVenta = idComprobanteVenta;
    }

    public int getIdPlanPago() {
        return idPlanPago;
    }

    public void setIdPlanPago(int idPlanPago) {
        this.idPlanPago = idPlanPago;
    }

    public int getIdPlanPagoDetalle() {
        return idPlanPagoDetalle;
    }

    public void setIdPlanPagoDetalle(int idPlanPagoDetalle) {
        this.idPlanPagoDetalle = idPlanPagoDetalle;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getFechaCobro() {
        return fechaCobro;
    }

    public void setFechaCobro(String fechaCobro) {
        this.fechaCobro = fechaCobro;
    }

    public Double getMontoAPagar() {
        return montoAPagar;
    }

    public void setMontoAPagar(Double montoAPagar) {
        this.montoAPagar = montoAPagar;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
