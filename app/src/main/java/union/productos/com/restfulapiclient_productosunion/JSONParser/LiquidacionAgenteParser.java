package union.productos.com.restfulapiclient_productosunion.JSONParser;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import union.productos.com.restfulapiclient_productosunion.Objects.LiquidacionAgente;

/**
 * Created by Usuario on 06/01/2015.
 */
public class LiquidacionAgenteParser {

    public ArrayList<LiquidacionAgente> parserLiquidacionAgente(JSONObject object)
    {
        ArrayList<LiquidacionAgente> arrayList=new ArrayList<LiquidacionAgente>();
        try {
            JSONArray jsonArray=object.getJSONArray("Value");
            JSONObject jsonObj=null;
            for(int i=0;i<jsonArray.length();i++)
            {
                jsonObj=jsonArray.getJSONObject(i);
                arrayList.add(new LiquidacionAgente(
                        jsonObj.getString("nombreAgente"),
                        jsonObj.getString("serieFactura"),
                        jsonObj.getString("nomUsuario"),
                        jsonObj.getInt("kmInicial"),
                        jsonObj.getString("serieBoleta"),
                        jsonObj.getInt("idAgente"),
                        jsonObj.getInt("nroBodegas"),
                        jsonObj.getInt("idLiquidacion"),
                        jsonObj.getString("passUsuario"),
                        jsonObj.getString("ruta"),
                        jsonObj.getString("correlativoBoleta"),
                        jsonObj.getInt("kmFinal"),
                        jsonObj.getInt("idEmpresa"),
                        jsonObj.getString("correlativoFactura"),
                        jsonObj.getInt("idUsuario")));

            }

        } catch (JSONException e) {
            // TODO Auto-generated catch block
            Log.d("JSONParser => parseLiquidacionAgente", e.getMessage());
        }
        return arrayList;
    }
}
