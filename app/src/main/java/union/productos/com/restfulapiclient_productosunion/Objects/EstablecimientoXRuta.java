package union.productos.com.restfulapiclient_productosunion.Objects;

/**
 * Created by Usuario on 07/01/2015.
 */
public class EstablecimientoXRuta {

    private int idEstablecEvento;
    private int idEstablec;
    private int idEstableCateg;
    private int idTipoDoc;
    private int idAtencionEstablec;
    private String nomEstablec;
    private String nomCliente;
    private String docCliente;
    private int orden;
    private int surtidoVentaAnterior;
    private int surtiddoStockAnterior;
    private int diasCredito;
    private int idAgente;

    //OBTIENE DE MÁS ESTOS CAMPOS
    private int idCajaLiquidacion;
    private String fecha;

    public EstablecimientoXRuta(int idEstablecEvento, int idEstablec, int idEstableCateg, int idTipoDoc, int idAtencionEstablec, String nomEstablec, String nomCliente, String docCliente, int orden, int surtidoVentaAnterior, int surtiddoStockAnterior, int diasCredito, int idAgente, int idCajaLiquidacion, String fecha) {
        this.idEstablecEvento = idEstablecEvento;
        this.idEstablec = idEstablec;
        this.idEstableCateg = idEstableCateg;
        this.idTipoDoc = idTipoDoc;
        this.idAtencionEstablec = idAtencionEstablec;
        this.nomEstablec = nomEstablec;
        this.nomCliente = nomCliente;
        this.docCliente = docCliente;
        this.orden = orden;
        this.surtidoVentaAnterior = surtidoVentaAnterior;
        this.surtiddoStockAnterior = surtiddoStockAnterior;
        this.diasCredito = diasCredito;
        this.idAgente = idAgente;
        this.idCajaLiquidacion = idCajaLiquidacion;
        this.fecha = fecha;
    }

    public EstablecimientoXRuta() {

        this.fecha = null;
        this.idEstablecEvento = 0;
        this.idEstablec = 0;
        this.idEstableCateg = 0;
        this.idTipoDoc = 0;
        this.idAtencionEstablec = 0;
        this.nomEstablec = null;
        this.nomCliente = null;
        this.docCliente = null;
        this.orden = 0;
        this.surtidoVentaAnterior = 0;
        this.surtiddoStockAnterior = 0;
        this.diasCredito = 0;
        this.idAgente = 0;
        this.idCajaLiquidacion = 0;
    }

    public int getIdEstablecEvento() {
        return idEstablecEvento;
    }

    public void setIdEstablecEvento(int idEstablecEvento) {
        this.idEstablecEvento = idEstablecEvento;
    }

    public int getIdEstablec() {
        return idEstablec;
    }

    public void setIdEstablec(int idEstablec) {
        this.idEstablec = idEstablec;
    }

    public int getIdEstableCateg() {
        return idEstableCateg;
    }

    public void setIdEstableCateg(int idEstableCateg) {
        this.idEstableCateg = idEstableCateg;
    }

    public int getIdTipoDoc() {
        return idTipoDoc;
    }

    public void setIdTipoDoc(int idTipoDoc) {
        this.idTipoDoc = idTipoDoc;
    }

    public int getIdAtencionEstablec() {
        return idAtencionEstablec;
    }

    public void setIdAtencionEstablec(int idAtencionEstablec) {
        this.idAtencionEstablec = idAtencionEstablec;
    }

    public String getNomEstablec() {
        return nomEstablec;
    }

    public void setNomEstablec(String nomEstablec) {
        this.nomEstablec = nomEstablec;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public String getDocCliente() {
        return docCliente;
    }

    public void setDocCliente(String docCliente) {
        this.docCliente = docCliente;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public int getSurtidoVentaAnterior() {
        return surtidoVentaAnterior;
    }

    public void setSurtidoVentaAnterior(int surtidoVentaAnterior) {
        this.surtidoVentaAnterior = surtidoVentaAnterior;
    }

    public int getSurtiddoStockAnterior() {
        return surtiddoStockAnterior;
    }

    public void setSurtiddoStockAnterior(int surtiddoStockAnterior) {
        this.surtiddoStockAnterior = surtiddoStockAnterior;
    }

    public int getDiasCredito() {
        return diasCredito;
    }

    public void setDiasCredito(int diasCredito) {
        this.diasCredito = diasCredito;
    }

    public int getIdAgente() {
        return idAgente;
    }

    public void setIdAgente(int idAgente) {
        this.idAgente = idAgente;
    }

    public int getIdCajaLiquidacion() {
        return idCajaLiquidacion;
    }

    public void setIdCajaLiquidacion(int idCajaLiquidacion) {
        this.idCajaLiquidacion = idCajaLiquidacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
