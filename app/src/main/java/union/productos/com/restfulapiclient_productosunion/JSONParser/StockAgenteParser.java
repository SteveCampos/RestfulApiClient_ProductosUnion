package union.productos.com.restfulapiclient_productosunion.JSONParser;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.util.Log;

import union.productos.com.restfulapiclient_productosunion.Objects.Stock;
import union.productos.com.restfulapiclient_productosunion.Objects.StockAgente;

/**
 * Created by CCIE on 30/12/2014.
 */
public class StockAgenteParser {

    public StockAgenteParser() {
        super();
    }

    public ArrayList<StockAgente> parserStockAgente(JSONObject object)
    {
        ArrayList<StockAgente> arrayList=new ArrayList<StockAgente>();
        try {
            JSONArray jsonArray=object.getJSONArray("Value");
            JSONObject jsonObj=null;
            for(int i=0;i<jsonArray.length();i++)
            {
                jsonObj=jsonArray.getJSONObject(i);
                arrayList.add(new StockAgente(jsonObj.getInt("idStockAgente"),
                        jsonObj.getInt("idProducto"),
                        jsonObj.getString("nombre"),
                        jsonObj.getInt("proVCodigo"),
                        jsonObj.getInt("codigoBarras"),
                        jsonObj.getInt("stockInicial"),
                        jsonObj.getInt("stockFinal"),
                        jsonObj.getInt("stockDisponible"),
                        jsonObj.getInt("idAgente")));
            }

        } catch (JSONException e) {
            // TODO Auto-generated catch block
            Log.d("JSONParser => parseStockAgente", e.getMessage());
        }
        return arrayList;
    }
    public ArrayList<Stock> parserStock(JSONObject object)
    {
        ArrayList<Stock> arrayList=new ArrayList<Stock>();
        try {
            JSONArray jsonArray=object.getJSONArray("Value");
            JSONObject jsonObj=null;
            for(int i=0;i<jsonArray.length();i++)
            {
                jsonObj=jsonArray.getJSONObject(i);
                arrayList.add(new Stock(jsonObj.getInt("StkagIStock")));
            }

        } catch (JSONException e) {
            // TODO Auto-generated catch block
            Log.d("JSONParser => parseStockAgente", e.getMessage());
        }
        return arrayList;
    }


}
