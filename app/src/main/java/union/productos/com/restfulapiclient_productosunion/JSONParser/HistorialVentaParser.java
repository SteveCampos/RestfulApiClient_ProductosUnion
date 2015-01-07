package union.productos.com.restfulapiclient_productosunion.JSONParser;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import union.productos.com.restfulapiclient_productosunion.Objects.HistorialVenta;

/**
 * Created by Usuario on 06/01/2015.
 */
public class HistorialVentaParser {

    public ArrayList<HistorialVenta> parserHistorialVenta(JSONObject object)
    {
        ArrayList<HistorialVenta> arrayList=new ArrayList<HistorialVenta>();
        try {
            JSONArray jsonArray=object.getJSONArray("Value");
            JSONObject jsonObj=null;
            for(int i=0;i<jsonArray.length();i++)
            {
                jsonObj=jsonArray.getJSONObject(i);
                arrayList.add(new HistorialVenta(
                        jsonObj.getInt("idComprobanteVenta"),
                        jsonObj.getString("Comprobante"),
                        jsonObj.getInt("numeroDocumento"),
                        jsonObj.getInt("idProducto"),
                        jsonObj.getInt("idEstablec"),
                        jsonObj.getInt("idAgente"),
                        jsonObj.getString("nombreProducto"),
                        jsonObj.getString("descripcionEstablec")));
            }

        } catch (JSONException e) {
            // TODO Auto-generated catch block
            Log.d("JSONParser => parseHistorialVenta", e.getMessage());
        }
        return arrayList;
    }
}
