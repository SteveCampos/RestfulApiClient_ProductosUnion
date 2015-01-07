package union.productos.com.restfulapiclient_productosunion.JSONParser;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import union.productos.com.restfulapiclient_productosunion.Objects.EstablecimientoXRuta;

/**
 * Created by Usuario on 07/01/2015.
 */
public class EstablecimientoXRutaParser {

    public ArrayList<EstablecimientoXRuta> parserEstablecimientoXRuta(JSONObject object)
    {
        ArrayList<EstablecimientoXRuta> arrayList=new ArrayList<EstablecimientoXRuta>();
        try {
            JSONArray jsonArray=object.getJSONArray("Value");
            JSONObject jsonObj=null;
            for(int i=0;i<jsonArray.length();i++)
            {
                jsonObj=jsonArray.getJSONObject(i);
                arrayList.add(new EstablecimientoXRuta(
                        jsonObj.getInt("idEstablecEvento"),
                        jsonObj.getInt("idEstablec"),
                        jsonObj.getInt("idEstableCateg"),
                        jsonObj.getInt("idTipoDoc"),
                        jsonObj.getInt("idAtencionEstablec"),
                        jsonObj.getString("nomEstablec"),
                        jsonObj.getString("nomCliente"),
                        jsonObj.getString("docCliente"),
                        jsonObj.getInt("orden"),
                        jsonObj.getInt("surtidoVentaAnterior"),
                        jsonObj.getInt("surtidoStockAnterior"),
                        jsonObj.getInt("diasCredito"),
                        jsonObj.getInt("idAgente"),
                        jsonObj.getInt("idCajaLiquidacion"),
                        jsonObj.getString("fecha")));
            }

        } catch (JSONException e) {
            // TODO Auto-generated catch block
            Log.d("JSONParser => parseEstablecimientoXRuta", e.getMessage());
        }
        return arrayList;
    }
}
