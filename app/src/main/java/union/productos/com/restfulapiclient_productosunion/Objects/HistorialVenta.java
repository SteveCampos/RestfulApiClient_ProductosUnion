package union.productos.com.restfulapiclient_productosunion.Objects;

/**
 * Created by Usuario on 06/01/2015.
 */
public class HistorialVenta {

    private int idComprobanteVenta;
    private String comprobante;
    private int numeroDocumento;
    private int idProducto;
    private int idEstablec;
    private int idAgente;
    private String nombreProducto;
    private String descripcionEstablec;

    public HistorialVenta(int idComprobanteVenta, String comprobante, int numeroDocumento, int idProducto, int idEstablec, int idAgente, String nombreProducto, String descripcionEstablec) {
        this.idComprobanteVenta = idComprobanteVenta;
        this.comprobante = comprobante;
        this.numeroDocumento = numeroDocumento;
        this.idProducto = idProducto;
        this.idEstablec = idEstablec;
        this.idAgente = idAgente;
        this.nombreProducto = nombreProducto;
        this.descripcionEstablec = descripcionEstablec;
    }

    public HistorialVenta() {
        this.idComprobanteVenta = 0;
        this.comprobante = null;
        this.numeroDocumento = 0;
        this.idProducto = 0;
        this.idEstablec = 0;
        this.idAgente = 0;
        this.nombreProducto = null;
        this.descripcionEstablec =  null;
    }

    public int getIdComprobanteVenta() {
        return idComprobanteVenta;
    }

    public void setIdComprobanteVenta(int idComprobanteVenta) {
        this.idComprobanteVenta = idComprobanteVenta;
    }

    public String getComprobante() {
        return comprobante;
    }

    public void setComprobante(String comprobante) {
        this.comprobante = comprobante;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdEstablec() {
        return idEstablec;
    }

    public void setIdEstablec(int idEstablec) {
        this.idEstablec = idEstablec;
    }

    public int getIdAgente() {
        return idAgente;
    }

    public void setIdAgente(int idAgente) {
        this.idAgente = idAgente;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionEstablec() {
        return descripcionEstablec;
    }

    public void setDescripcionEstablec(String descripcionEstablec) {
        this.descripcionEstablec = descripcionEstablec;
    }
}
