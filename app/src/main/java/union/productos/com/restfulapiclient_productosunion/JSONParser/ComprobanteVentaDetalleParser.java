package union.productos.com.restfulapiclient_productosunion.JSONParser;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import union.productos.com.restfulapiclient_productosunion.Objects.ComprobanteVentaDetalle;

/**
 * Created by Usuario on 07/01/2015.
 */
public class ComprobanteVentaDetalleParser {

    public ArrayList<ComprobanteVentaDetalle> parserComprobanteVentaDetalle(JSONObject object)
    {
        ArrayList<ComprobanteVentaDetalle> arrayList=new ArrayList<ComprobanteVentaDetalle>();
        try {
            JSONArray jsonArray=object.getJSONArray("Value");
            JSONObject jsonObj=null;
            for(int i=0;i<jsonArray.length();i++)
            {
                jsonObj=jsonArray.getJSONObject(i);
                arrayList.add(new ComprobanteVentaDetalle(
                        jsonObj.getInt("ComdBIComprobanteVentaId"),
                        jsonObj.getInt("ComdIComprobanteVentaDetalleId"),
                        jsonObj.getInt("ProIProductoId"),
                        jsonObj.getString("ProVNombre"),
                        jsonObj.getInt("ComdICantidad"),
                        jsonObj.getDouble("Importe"),
                        jsonObj.getDouble("CostoVenta"),
                        jsonObj.getDouble("PrecioUnitario"),
                        jsonObj.getInt("UniIValor"),
                        jsonObj.getInt("PromedioVenta"),
                        jsonObj.getInt("CantDevolucion"),
                        jsonObj.getInt("EstIEstablecimientoId"),
                        jsonObj.getInt("ComBIComprobanteVentaId")));


            }

        } catch (JSONException e) {
            // TODO Auto-generated catch block
            Log.d("JSONParser => parseComprobanteVentaDetalle", e.getMessage());
        }
        return arrayList;
    }
}
