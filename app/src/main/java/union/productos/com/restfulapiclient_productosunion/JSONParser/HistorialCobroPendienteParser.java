package union.productos.com.restfulapiclient_productosunion.JSONParser;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import union.productos.com.restfulapiclient_productosunion.Objects.HistorialCobroPendiente;

/**
 * Created by Usuario on 07/01/2015.
 */
public class HistorialCobroPendienteParser {

    public ArrayList<HistorialCobroPendiente> parserHistorialCobroPendiente(JSONObject object)
    {
        ArrayList<HistorialCobroPendiente> arrayList=new ArrayList<HistorialCobroPendiente>();
        try {
            JSONArray jsonArray=object.getJSONArray("Value");
            JSONObject jsonObj=null;
            for(int i=0;i<jsonArray.length();i++)
            {
                jsonObj=jsonArray.getJSONObject(i);
                arrayList.add(new HistorialCobroPendiente(jsonObj.getInt("idEstablec"),
                        jsonObj.getInt("idComprobanteVenta"),
                        jsonObj.getInt("idPlanPago"),
                        jsonObj.getInt("idPlanpagoDetalle"),
                        jsonObj.getString("descripcion"),
                        jsonObj.getString("Doc"),
                        jsonObj.getString("FechaCobro"),
                        jsonObj.getDouble("montoaPagar"),
                        jsonObj.getString("estado")));
            }

        } catch (JSONException e) {
            // TODO Auto-generated catch block
            Log.d("JSONParser => parseHistorialCobroPendiente", e.getMessage());
        }
        return arrayList;
    }
}
