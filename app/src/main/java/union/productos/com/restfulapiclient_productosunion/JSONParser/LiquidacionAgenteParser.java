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
                        jsonObj.getString("NombreAgente"),
                        jsonObj.getString("SerieFactura"),
                        jsonObj.getString("NomUsuario"),
                        jsonObj.getInt("KmInicial"),
                        jsonObj.getString("SerieBoleta"),
                        jsonObj.getInt("IdAgente"),
                        jsonObj.getInt("NroBodegas"),
                        jsonObj.getInt("IdLiquidacion"),
                        jsonObj.getString("PassUsuario"),
                        jsonObj.getString("Ruta"),
                        jsonObj.getString("CorrelativoBoleta"),
                        jsonObj.getInt("KmFinal"),
                        jsonObj.getInt("IdEmpresa"),
                        jsonObj.getString("CorrelativoFactura"),
                        jsonObj.getInt("IdUsuario")));

            }

        } catch (JSONException e) {
            // TODO Auto-generated catch block
            Log.d("JSONParser => parseLiquidacionAgente", e.getMessage());
        }
        return arrayList;
    }
}
