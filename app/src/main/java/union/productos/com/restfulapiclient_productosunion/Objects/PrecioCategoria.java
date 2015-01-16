package union.productos.com.restfulapiclient_productosunion.Objects;

/**
 * Created by Usuario on 06/01/2015.
 */
public class PrecioCategoria {

    private int idProducto;
    private int idCategoriaEstablec;
    private Double costoVenta;
    private Double valorUnidad;
    private int desde;
    private int hasta;
    private Double escalaPrecios;
    private String descripcion;


    public PrecioCategoria(int desde, int hasta, int idCategoriaEstablec, int idProducto, Double costoVenta, Double escalaPrecios, Double valorUnidad, String descripcion) {
        this.desde = desde;
        this.hasta = hasta;
        this.idCategoriaEstablec = idCategoriaEstablec;
        this.idProducto = idProducto;
        this.costoVenta = costoVenta;
        this.escalaPrecios = escalaPrecios;
        this.valorUnidad = valorUnidad;
        this.descripcion = descripcion;
    }

    public PrecioCategoria() {
        this.desde = 0;
        this.hasta = 0;
        this.idCategoriaEstablec = 0;
        this.idProducto = 0;
        this.costoVenta = 0.0;
        this.escalaPrecios = 0.0;
        this.valorUnidad = 0.0;
        this.descripcion = null;
    }

    public int getDesde() {
        return desde;
    }

    public void setDesde(int desde) {
        this.desde = desde;
    }

    public int getHasta() {
        return hasta;
    }

    public void setHasta(int hasta) {
        this.hasta = hasta;
    }

    public int getIdCategoriaEstablec() {
        return idCategoriaEstablec;
    }

    public void setIdCategoriaEstablec(int idCategoriaEstablec) {
        this.idCategoriaEstablec = idCategoriaEstablec;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public Double getCostoVenta() {
        return costoVenta;
    }

    public void setCostoVenta(Double costoVenta) {
        this.costoVenta = costoVenta;
    }

    public Double getEscalaPrecios() {
        return escalaPrecios;
    }

    public void setEscalaPrecios(Double escalaPrecios) {
        this.escalaPrecios = escalaPrecios;
    }

    public Double getValorUnidad() {
        return valorUnidad;
    }

    public void setValorUnidad(Double valorUnidad) {
        this.valorUnidad = valorUnidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
