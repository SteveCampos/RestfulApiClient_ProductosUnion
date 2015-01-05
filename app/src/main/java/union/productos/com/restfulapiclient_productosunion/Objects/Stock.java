package union.productos.com.restfulapiclient_productosunion.Objects;

/**
 * Created by CCIE on 30/12/2014.
 */
public class Stock {
    int StkagIStock;

    public Stock(int stkagIStock) {
        StkagIStock = stkagIStock;
    }

    public Stock() {
        StkagIStock = 0;
    }

    public int getStkagIStock() {
        return StkagIStock;
    }

    public void setStkagIStock(int stkagIStock) {
        StkagIStock = stkagIStock;
    }
}
