package union.productos.com.restfulapiclient_productosunion.Objects;

/**
 * Created by Usuario on 06/01/2015.
 */
public class LiquidacionAgente {

    private  int idAgente;
    private int idEmpresa;
    private int idUsuario;
    private String nombreAgente;
    private String nomUsuario;
    private String passUsuario;
    private int idLiquidacion;
    private int kmInicial;
    private int kmFinal;
    private String ruta;
    private int nroBodegas;
    private String serieBoleta;
    private String serieFactura;
    private String correlativoBoleta;
    private String correlativoFactura;




    public LiquidacionAgente(String nombreAgente, String serieFactura, String nomUsuario, int kmInicial, String serieBoleta, int idAgente, int nroBodegas, int idLiquidacion, String passUsuario, String ruta, String correlativoBoleta, int kmFinal, int idEmpresa, String correlativoFactura, int idUsuario) {

        this.nombreAgente = nombreAgente;
        this.serieFactura = serieFactura;
        this.nomUsuario = nomUsuario;
        this.kmInicial = kmInicial;
        this.serieBoleta = serieBoleta;
        this.idAgente = idAgente;
        this.nroBodegas = nroBodegas;
        this.idLiquidacion = idLiquidacion;
        this.passUsuario = passUsuario;
        this.ruta = ruta;
        this.correlativoBoleta = correlativoBoleta;
        this.kmFinal = kmFinal;
        this.idEmpresa = idEmpresa;
        this.correlativoFactura = correlativoFactura;
        this.idUsuario = idUsuario;
    }

    public LiquidacionAgente() {
        this.nombreAgente = null;
        this.serieFactura = null;
        this.nomUsuario = null;
        this.kmInicial = 0;
        this.serieBoleta = null;
        this.idAgente = 0;
        this.nroBodegas = 0;
        this.idLiquidacion = 0;
        this.passUsuario = null;
        this.ruta = null;
        this.correlativoBoleta = null;
        this.kmFinal = 0;
        this.idEmpresa = 0;
        this.correlativoFactura = null;
        this.idUsuario = 0;
    }

    public String getNombreAgente() {
        return nombreAgente;
    }

    public void setNombreAgente(String nombreAgente) {
        this.nombreAgente = nombreAgente;
    }

    public String getSerieFactura() {
        return serieFactura;
    }

    public void setSerieFactura(String serieFactura) {
        this.serieFactura = serieFactura;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public int getKmInicial() {
        return kmInicial;
    }

    public void setKmInicial(int kmInicial) {
        this.kmInicial = kmInicial;
    }

    public String getSerieBoleta() {
        return serieBoleta;
    }

    public void setSerieBoleta(String serieBoleta) {
        this.serieBoleta = serieBoleta;
    }

    public int getIdAgente() {
        return idAgente;
    }

    public void setIdAgente(int idAgente) {
        this.idAgente = idAgente;
    }

    public int getNroBodegas() {
        return nroBodegas;
    }

    public void setNroBodegas(int nroBodegas) {
        this.nroBodegas = nroBodegas;
    }

    public int getIdLiquidacion() {
        return idLiquidacion;
    }

    public void setIdLiquidacion(int idLiquidacion) {
        this.idLiquidacion = idLiquidacion;
    }

    public String getPassUsuario() {
        return passUsuario;
    }

    public void setPassUsuario(String passUsuario) {
        this.passUsuario = passUsuario;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getCorrelativoBoleta() {
        return correlativoBoleta;
    }

    public void setCorrelativoBoleta(String correlativoBoleta) {
        this.correlativoBoleta = correlativoBoleta;
    }

    public int getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(int kmFinal) {
        this.kmFinal = kmFinal;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getCorrelativoFactura() {
        return correlativoFactura;
    }

    public void setCorrelativoFactura(String correlativoFactura) {
        this.correlativoFactura = correlativoFactura;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}
