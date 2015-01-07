package union.productos.com.restfulapiclient_productosunion.AsyncTask;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONObject;

import java.util.ArrayList;

import union.productos.com.restfulapiclient_productosunion.JSONParser.ComprobanteVentaEnvParser;
import union.productos.com.restfulapiclient_productosunion.JSONParser.EstablecimientoXRutaParser;
import union.productos.com.restfulapiclient_productosunion.JSONParser.HistorialCobroPendienteParser;
import union.productos.com.restfulapiclient_productosunion.JSONParser.HistorialVentaParser;
import union.productos.com.restfulapiclient_productosunion.JSONParser.LiquidacionAgenteParser;
import union.productos.com.restfulapiclient_productosunion.JSONParser.PrecioCategoriaParser;
import union.productos.com.restfulapiclient_productosunion.JSONParser.StockAgenteParser;
import union.productos.com.restfulapiclient_productosunion.Objects.ComprobanteVentaEnv;
import union.productos.com.restfulapiclient_productosunion.Objects.EstablecimientoXRuta;
import union.productos.com.restfulapiclient_productosunion.Objects.HistorialCobroPendiente;
import union.productos.com.restfulapiclient_productosunion.Objects.HistorialVenta;
import union.productos.com.restfulapiclient_productosunion.Objects.LiquidacionAgente;
import union.productos.com.restfulapiclient_productosunion.Objects.PrecioCategoria;
import union.productos.com.restfulapiclient_productosunion.Objects.StockAgente;
import union.productos.com.restfulapiclient_productosunion.RestApi.StockAgenteRestApi;

/**
 * Created by Usuario on 06/01/2015.
 */
public class AsyncTaskMain extends AsyncTask<String, String, String> {


    //Comentario
    private Context mContext;
    ProgressDialog prgDialog;

    public AsyncTaskMain(Context context){
        this.mContext = context;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        createProgressDialog();
    }

    @Override
    protected String doInBackground(String... strings) {

        StockAgenteRestApi api = new StockAgenteRestApi();

        ArrayList<StockAgente> stockAgenteLista = null;
        ArrayList<PrecioCategoria> precioCategoriaLista = null;
        ArrayList<LiquidacionAgente> liquidacionAgentes = null;
        ArrayList<HistorialVenta> historialVentas = null;
        ArrayList<HistorialCobroPendiente> historialCobroPendientes = null;
        ArrayList<EstablecimientoXRuta> establecimientoXRutas = null;
        ArrayList<ComprobanteVentaEnv> comprobanteVentaEnvs = null;
        try {

            //int idAgente = Integer.parseInt(strings[0]);
            //JSONObject jsonObj = api.GetStockAgente(2);
            JSONObject jsonObjStock = api.GetStock(2);
            publishProgress(""+20);
            JSONObject jsonObjStockAgente = api.GetStockAgente(2);
            publishProgress(""+40);
            JSONObject jsonObjLiquidacionAgente = api.GetLiquidacionAgente(14);
            publishProgress(""+60);
            JSONObject jsonObjPrecioCategoria = api.GetPrecioCategoria(1,14);
            publishProgress(""+80);
            JSONObject jsonObjHistorialVenta = api.GetHistorialVentas(52);
            publishProgress(""+90);
            JSONObject jsonObjHistorialCobroPendiente = api.GetHistorialCobrosPendientes(53);
            publishProgress(""+95);
            JSONObject jsonObjEstablecXRuta = api.GetEstablecimeintoXRuta(1,"01/08/2014");
            publishProgress(""+98);
            JSONObject jsonObjComprobanteVentaEnv = api.GetComprobanteVentaEnv(66);
            publishProgress(""+99);




            StockAgenteParser stockAgenteParser = new StockAgenteParser();
            PrecioCategoriaParser precioCategoriaParser = new PrecioCategoriaParser();
            LiquidacionAgenteParser liquidacionAgenteParser = new LiquidacionAgenteParser();
            HistorialVentaParser historialVentaParser = new HistorialVentaParser();
            HistorialCobroPendienteParser historialCobroPendienteParser = new HistorialCobroPendienteParser();
            EstablecimientoXRutaParser establecimientoXRutaParser = new EstablecimientoXRutaParser();
            ComprobanteVentaEnvParser comprobanteVentaEnvParser = new ComprobanteVentaEnvParser();

            stockAgenteLista = stockAgenteParser.parserStockAgente(jsonObjStockAgente);
            precioCategoriaLista = precioCategoriaParser.parserPrecioCategoria(jsonObjPrecioCategoria);
            liquidacionAgentes = liquidacionAgenteParser.parserLiquidacionAgente(jsonObjLiquidacionAgente);
            historialVentas = historialVentaParser.parserHistorialVenta(jsonObjHistorialVenta);
            historialCobroPendientes = historialCobroPendienteParser.parserHistorialCobroPendiente(jsonObjHistorialCobroPendiente);
            establecimientoXRutas = establecimientoXRutaParser.parserEstablecimientoXRuta(jsonObjEstablecXRuta);
            comprobanteVentaEnvs = comprobanteVentaEnvParser.parserComprobanteVentaEnv(jsonObjComprobanteVentaEnv);




            Log.d("JSON OBJECT", "" + jsonObjStock.toString());
            Log.d("JSON OBJECT AGENTE", ""+jsonObjStockAgente.toString());
            Log.d("JSON OBJECT LIQUIDACION AGENTE", "" + jsonObjLiquidacionAgente.toString());
            Log.d("JSON OBJECT AGENTE PRECIO CATEGORIA", ""+jsonObjPrecioCategoria.toString());
            Log.d("JSON OBJECT HISTORIAL VENTAS", ""+jsonObjHistorialVenta.toString());
            Log.d("JSON OBJECT HISTORIAL COBROS PENDIENTES", ""+jsonObjHistorialCobroPendiente.toString());
            Log.d("JSON OBJECT ESTABLECIMIENTOS X RUTA", ""+jsonObjEstablecXRuta.toString());
            Log.d("JSON OBJECT COMPROBANTE VENTA ENV", ""+jsonObjComprobanteVentaEnv.toString());




            Log.d("PARSER AGENTE STOCK ", "INICIANDO ...");
            for (int i = 0; i < stockAgenteLista.size() ; i++) {
                Log.d("Stock Agente"+i, "Nombre : "+stockAgenteLista.get(i).getNombre());
            }
            for (int i = 0; i < precioCategoriaLista.size() ; i++) {
                Log.d("PRECIO CATEGORÌA : " + i, "Escala Precios : " + precioCategoriaLista.get(i).getEscalaPrecios());
            }

            for (int i = 0; i < liquidacionAgentes.size() ; i++) {
                Log.d("LIQUIDACIÒN AGENTES : " + i, " Nombre : " + liquidacionAgentes.get(i).getNombreAgente());
            }

            for (int i = 0; i < historialVentas.size() ; i++) {
                Log.d("HISTORIAL VENTAS : " + i, " Nombre : " + historialVentas.get(i).getNombreProducto());
            }
            for (int i = 0; i < historialCobroPendientes.size() ; i++) {
                Log.d("HISTORIAL COBROS PENDIENTES : " + i, " Monto a pagar : " + historialCobroPendientes.get(i).getMontoAPagar());
            }
            for (int i = 0; i < establecimientoXRutas.size() ; i++) {
                Log.d("ESTABLECIMIENTOS X RUTAS: " + i, " Nombre Establecimiento : " + establecimientoXRutas.get(i).getNomEstablec());
            }
            for (int i = 0; i < comprobanteVentaEnvs.size() ; i++) {
                Log.d("COMPROBANTE VENTA ENV: " + i, " Total : " + comprobanteVentaEnvs.get(i).getTotal());
            }





            publishProgress("" + 100);

            Log.d("PARSER", "FINALIZADO");


        } catch (Exception e) {
            // TODO Auto-generated catch block
            Log.d("AsyncLoadDeptDetails", e.getMessage());

        }
        return "Completado";
    }

    @Override
    protected void onProgressUpdate(String... values) {

        prgDialog.setProgress(Integer.parseInt(values[0]));
    }
    @Override
    protected void onPostExecute(String s) {
        prgDialog.dismiss();
        Toast.makeText(mContext.getApplicationContext(), s, Toast.LENGTH_SHORT);
    }

    public void createProgressDialog(){
        prgDialog = new ProgressDialog(mContext);
        prgDialog.setMessage("Sincronizando Online");
        prgDialog.setIndeterminate(false);
        prgDialog.setMax(100);
        prgDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        prgDialog.setCancelable(false);
        prgDialog.show();

    }




}
