package union.productos.com.restfulapiclient_productosunion.Objects;

/**
 * Created by Usuario on 07/01/2015.
 */
public class ComprobanteVentaEnv {

    private int ComBIComprobanteVentaId;
    private int EstIEstablecimientoId;
    private int ComIComprobanteTipoId;
    private int ComIFormaPagoId;
    private int ComITipoVentaId;
    private String codigo_erp;
    private String ComVSerie;
    private Double ComINumDoc;
    private Double BaseImponible;
    private Double Igv;
    private Double Total;
    private int ComIAgenteVentaId;

    public ComprobanteVentaEnv() {
        ComBIComprobanteVentaId = 0;
        EstIEstablecimientoId = 0;
        ComIComprobanteTipoId = 0;
        ComIFormaPagoId = 0;
        ComITipoVentaId = 0;
        this.codigo_erp = null;
        ComVSerie = null;
        ComINumDoc = 0.0;
        BaseImponible = 0.0;
        Igv = 0.0;
        Total = 0.0;
        ComIAgenteVentaId = 0;
    }

    public ComprobanteVentaEnv(int comBIComprobanteVentaId, int estIEstablecimientoId, int comIComprobanteTipoId, int comIFormaPagoId, int comITipoVentaId, String codigo_erp, String comVSerie, Double comINumDoc, Double baseImponible, Double igv, Double total, int comIAgenteVentaId) {
        ComBIComprobanteVentaId = comBIComprobanteVentaId;
        EstIEstablecimientoId = estIEstablecimientoId;
        ComIComprobanteTipoId = comIComprobanteTipoId;
        ComIFormaPagoId = comIFormaPagoId;
        ComITipoVentaId = comITipoVentaId;
        this.codigo_erp = codigo_erp;
        ComVSerie = comVSerie;
        ComINumDoc = comINumDoc;
        BaseImponible = baseImponible;
        Igv = igv;
        Total = total;
        ComIAgenteVentaId = comIAgenteVentaId;
    }

    public int getComBIComprobanteVentaId() {
        return ComBIComprobanteVentaId;
    }

    public void setComBIComprobanteVentaId(int comBIComprobanteVentaId) {
        ComBIComprobanteVentaId = comBIComprobanteVentaId;
    }

    public int getEstIEstablecimientoId() {
        return EstIEstablecimientoId;
    }

    public void setEstIEstablecimientoId(int estIEstablecimientoId) {
        EstIEstablecimientoId = estIEstablecimientoId;
    }

    public int getComIComprobanteTipoId() {
        return ComIComprobanteTipoId;
    }

    public void setComIComprobanteTipoId(int comIComprobanteTipoId) {
        ComIComprobanteTipoId = comIComprobanteTipoId;
    }

    public int getComIFormaPagoId() {
        return ComIFormaPagoId;
    }

    public void setComIFormaPagoId(int comIFormaPagoId) {
        ComIFormaPagoId = comIFormaPagoId;
    }

    public int getComITipoVentaId() {
        return ComITipoVentaId;
    }

    public void setComITipoVentaId(int comITipoVentaId) {
        ComITipoVentaId = comITipoVentaId;
    }

    public String getCodigo_erp() {
        return codigo_erp;
    }

    public void setCodigo_erp(String codigo_erp) {
        this.codigo_erp = codigo_erp;
    }

    public String getComVSerie() {
        return ComVSerie;
    }

    public void setComVSerie(String comVSerie) {
        ComVSerie = comVSerie;
    }

    public Double getComINumDoc() {
        return ComINumDoc;
    }

    public void setComINumDoc(Double comINumDoc) {
        ComINumDoc = comINumDoc;
    }

    public Double getBaseImponible() {
        return BaseImponible;
    }

    public void setBaseImponible(Double baseImponible) {
        BaseImponible = baseImponible;
    }

    public Double getIgv() {
        return Igv;
    }

    public void setIgv(Double igv) {
        Igv = igv;
    }

    public Double getTotal() {
        return Total;
    }

    public void setTotal(Double total) {
        Total = total;
    }

    public int getComIAgenteVentaId() {
        return ComIAgenteVentaId;
    }

    public void setComIAgenteVentaId(int comIAgenteVentaId) {
        ComIAgenteVentaId = comIAgenteVentaId;
    }
}
