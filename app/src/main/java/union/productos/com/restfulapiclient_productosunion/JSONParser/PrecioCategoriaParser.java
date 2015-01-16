package union.productos.com.restfulapiclient_productosunion.JSONParser;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import union.productos.com.restfulapiclient_productosunion.Objects.PrecioCategoria;

/**
 * Created by Usuario on 06/01/2015.
 */
public class PrecioCategoriaParser {

    public ArrayList<PrecioCategoria> parserPrecioCategoria(JSONObject object)
    {
        ArrayList<PrecioCategoria> arrayList=new ArrayList<PrecioCategoria>();
        try {
            JSONArray jsonArray=object.getJSONArray("Value");
            JSONObject jsonObj=null;
            for(int i=0;i<jsonArray.length();i++)
            {
                jsonObj=jsonArray.getJSONObject(i);
                arrayList.add(new PrecioCategoria(jsonObj.getInt("desde"),
                        jsonObj.getInt("hasta"),
                        jsonObj.getInt("idCateEstablec"),
                        jsonObj.getInt("idProducto"),
                        jsonObj.getDouble("costoVenta"),
                        jsonObj.getDouble("escalaPrecios"),
                        jsonObj.getDouble("valorUnidad"),
                        jsonObj.getString("nombreProducto")));
            }

        } catch (JSONException e) {
            // TODO Auto-generated catch block
            Log.d("JSONParser => parsePrecioCategoria", e.getMessage());
        }
        return arrayList;
    }
}
