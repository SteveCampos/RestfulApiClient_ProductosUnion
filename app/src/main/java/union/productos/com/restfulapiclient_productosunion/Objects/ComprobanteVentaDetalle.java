package union.productos.com.restfulapiclient_productosunion.Objects;

/**
 * Created by Usuario on 07/01/2015.
 */
public class ComprobanteVentaDetalle {

    private int ComdBIComprobanteVentaId;
    private int ComdIComprobanteVentaDetalleId;
    private int ProIProductoId;
    private String ProVNombre;
    private int ComdICantidad;
    private Double Importe;
    private Double CostoVenta;
    private Double PrecioUnitario;
    private int UniIValor;
    private int PromedioVenta;
    private int CantDevolucion;
    private int EstIEstablecimientoId;
    private int ComBIComprobanteVentaId;

    public ComprobanteVentaDetalle(int comdBIComprobanteVentaId, int comdIComprobanteVentaDetalleId, int proIProductoId, String proVNombre, int comdICantidad, Double importe, Double costoVenta, Double precioUnitario, int uniIValor, int promedioVenta, int cantDevolucion, int estIEstablecimientoId, int comBIComprobanteVentaId) {
        ComdBIComprobanteVentaId = comdBIComprobanteVentaId;
        ComdIComprobanteVentaDetalleId = comdIComprobanteVentaDetalleId;
        ProIProductoId = proIProductoId;
        ProVNombre = proVNombre;
        ComdICantidad = comdICantidad;
        Importe = importe;
        CostoVenta = costoVenta;
        PrecioUnitario = precioUnitario;
        UniIValor = uniIValor;
        PromedioVenta = promedioVenta;
        CantDevolucion = cantDevolucion;
        EstIEstablecimientoId = estIEstablecimientoId;
        ComBIComprobanteVentaId = comBIComprobanteVentaId;
    }

    public ComprobanteVentaDetalle() {
        ComdBIComprobanteVentaId = 0;
        ComdIComprobanteVentaDetalleId = 0;
        ProIProductoId = 0;
        ProVNombre = null;
        ComdICantidad = 0;
        Importe = 0.0;
        CostoVenta = 0.0;
        PrecioUnitario = 0.0;
        UniIValor = 0;
        PromedioVenta = 0;
        CantDevolucion = 0;
        EstIEstablecimientoId = 0;
        ComBIComprobanteVentaId = 0;
    }

    public int getComdBIComprobanteVentaId() {
        return ComdBIComprobanteVentaId;
    }

    public void setComdBIComprobanteVentaId(int comdBIComprobanteVentaId) {
        ComdBIComprobanteVentaId = comdBIComprobanteVentaId;
    }

    public int getComdIComprobanteVentaDetalleId() {
        return ComdIComprobanteVentaDetalleId;
    }

    public void setComdIComprobanteVentaDetalleId(int comdIComprobanteVentaDetalleId) {
        ComdIComprobanteVentaDetalleId = comdIComprobanteVentaDetalleId;
    }

    public int getProIProductoId() {
        return ProIProductoId;
    }

    public void setProIProductoId(int proIProductoId) {
        ProIProductoId = proIProductoId;
    }

    public String getProVNombre() {
        return ProVNombre;
    }

    public void setProVNombre(String proVNombre) {
        ProVNombre = proVNombre;
    }

    public int getComdICantidad() {
        return ComdICantidad;
    }

    public void setComdICantidad(int comdICantidad) {
        ComdICantidad = comdICantidad;
    }

    public Double getImporte() {
        return Importe;
    }

    public void setImporte(Double importe) {
        Importe = importe;
    }

    public Double getCostoVenta() {
        return CostoVenta;
    }

    public void setCostoVenta(Double costoVenta) {
        CostoVenta = costoVenta;
    }

    public Double getPrecioUnitario() {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        PrecioUnitario = precioUnitario;
    }

    public int getUniIValor() {
        return UniIValor;
    }

    public void setUniIValor(int uniIValor) {
        UniIValor = uniIValor;
    }

    public int getPromedioVenta() {
        return PromedioVenta;
    }

    public void setPromedioVenta(int promedioVenta) {
        PromedioVenta = promedioVenta;
    }

    public int getCantDevolucion() {
        return CantDevolucion;
    }

    public void setCantDevolucion(int cantDevolucion) {
        CantDevolucion = cantDevolucion;
    }

    public int getEstIEstablecimientoId() {
        return EstIEstablecimientoId;
    }

    public void setEstIEstablecimientoId(int estIEstablecimientoId) {
        EstIEstablecimientoId = estIEstablecimientoId;
    }

    public int getComBIComprobanteVentaId() {
        return ComBIComprobanteVentaId;
    }

    public void setComBIComprobanteVentaId(int comBIComprobanteVentaId) {
        ComBIComprobanteVentaId = comBIComprobanteVentaId;
    }
}
