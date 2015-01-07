package union.productos.com.restfulapiclient_productosunion.JSONParser;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import union.productos.com.restfulapiclient_productosunion.Objects.ComprobanteVentaEnv;

/**
 * Created by Usuario on 07/01/2015.
 */
public class ComprobanteVentaEnvParser {
    public ArrayList<ComprobanteVentaEnv> parserComprobanteVentaEnv(JSONObject object)
    {
        ArrayList<ComprobanteVentaEnv> arrayList=new ArrayList<ComprobanteVentaEnv>();
        try {
            JSONArray jsonArray=object.getJSONArray("Value");
            JSONObject jsonObj=null;
            for(int i=0;i<jsonArray.length();i++)
            {
                jsonObj=jsonArray.getJSONObject(i);
                arrayList.add(new ComprobanteVentaEnv(
                        jsonObj.getInt("ComBIComprobanteVentaId"),
                        jsonObj.getInt("EstIEstablecimientoId"),
                        jsonObj.getInt("ComIComprobanteTipoId"),
                        jsonObj.getInt("ComIFormaPagoId"),
                        jsonObj.getInt("ComITipoVentaId"),
                        jsonObj.getString("codigo_erp"),
                        jsonObj.getString("ComVSerie"),
                        jsonObj.getDouble("ComINumDoc"),
                        jsonObj.getDouble("BaseImponible"),
                        jsonObj.getDouble("Igv"),
                        jsonObj.getDouble("Total"),
                        jsonObj.getInt("ComIAgenteVentaId")));


            }

        } catch (JSONException e) {
            // TODO Auto-generated catch block
            Log.d("JSONParser => parseComprobanteVentaEnv", e.getMessage());
        }
        return arrayList;
    }
}
