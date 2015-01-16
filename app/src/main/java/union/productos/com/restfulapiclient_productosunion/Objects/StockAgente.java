package union.productos.com.restfulapiclient_productosunion.Objects;

/**
 * Created by CCIE on 30/12/2014.
 */
public class StockAgente {

    private int idProducto;
    private String nombre;
    private int proVCodigo;
    private int codigoBarras;
    private int stockInicial;
    private int stockFinal;
    private int stockDisponible;
    private int idAgente;

    public StockAgente(int idProducto, String nombre, int proVCodigo, int codigoBarras, int stockInicial, int stockFinal, int stockDisponible, int idAgente) {
        super();
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.proVCodigo = proVCodigo;
        this.codigoBarras = codigoBarras;
        this.stockInicial = stockInicial;
        this.stockFinal = stockFinal;
        this.stockDisponible = stockDisponible;
        this.idAgente = idAgente;
    }

    public StockAgente() {
        super();
        this.idProducto = 0;
        this.nombre = null;
        this.proVCodigo = 0;
        this.codigoBarras = 0;
        this.stockInicial = 0;
        this.stockFinal = 0;
        this.stockDisponible = 0;
        this.idAgente = 0;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getProVCodigo() {
        return proVCodigo;
    }

    public void setProVCodigo(int proVCodigo) {
        this.proVCodigo = proVCodigo;
    }

    public int getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(int codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public int getStockInicial() {
        return stockInicial;
    }

    public void setStockInicial(int stockInicial) {
        this.stockInicial = stockInicial;
    }

    public int getStockFinal() {
        return stockFinal;
    }

    public void setStockFinal(int stockFinal) {
        this.stockFinal = stockFinal;
    }

    public int getStockDisponible() {
        return stockDisponible;
    }

    public void setStockDisponible(int stockDisponible) {
        this.stockDisponible = stockDisponible;
    }

    public int getIdAgente() {
        return idAgente;
    }

    public void setIdAgente(int idAgente) {
        this.idAgente = idAgente;
    }
}
