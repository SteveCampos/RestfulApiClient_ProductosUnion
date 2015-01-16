package union.productos.com.restfulapiclient_productosunion.AsyncTask;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.database.Cursor;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

import org.json.JSONObject;

import java.util.ArrayList;

import union.productos.com.restfulapiclient_productosunion.JSONParser.ComprobanteVentaDetalleParser;
import union.productos.com.restfulapiclient_productosunion.JSONParser.ComprobanteVentaEnvParser;
import union.productos.com.restfulapiclient_productosunion.JSONParser.EstablecimientoXRutaParser;
import union.productos.com.restfulapiclient_productosunion.JSONParser.HistorialCobroPendienteParser;
import union.productos.com.restfulapiclient_productosunion.JSONParser.HistorialVentaParser;
import union.productos.com.restfulapiclient_productosunion.JSONParser.LiquidacionAgenteParser;
import union.productos.com.restfulapiclient_productosunion.JSONParser.PrecioCategoriaParser;
import union.productos.com.restfulapiclient_productosunion.JSONParser.StockAgenteParser;
import union.productos.com.restfulapiclient_productosunion.MainActivity;
import union.productos.com.restfulapiclient_productosunion.Objects.ComprobanteVentaDetalle;
import union.productos.com.restfulapiclient_productosunion.Objects.ComprobanteVentaEnv;
import union.productos.com.restfulapiclient_productosunion.Objects.EstablecimientoXRuta;
import union.productos.com.restfulapiclient_productosunion.Objects.HistorialCobroPendiente;
import union.productos.com.restfulapiclient_productosunion.Objects.HistorialVenta;
import union.productos.com.restfulapiclient_productosunion.Objects.LiquidacionAgente;
import union.productos.com.restfulapiclient_productosunion.Objects.PrecioCategoria;
import union.productos.com.restfulapiclient_productosunion.Objects.StockAgente;
import union.productos.com.restfulapiclient_productosunion.R;
import union.productos.com.restfulapiclient_productosunion.RestApi.StockAgenteRestApi;
import union.productos.com.restfulapiclient_productosunion.Sqlite.Constants;
import union.productos.com.restfulapiclient_productosunion.Sqlite.DbAdapter_Agente;
import union.productos.com.restfulapiclient_productosunion.Sqlite.DbAdapter_Comprob_Cobro;
import union.productos.com.restfulapiclient_productosunion.Sqlite.DbAdapter_Comprob_Venta;
import union.productos.com.restfulapiclient_productosunion.Sqlite.DbAdapter_Comprob_Venta_Detalle;
import union.productos.com.restfulapiclient_productosunion.Sqlite.DbAdapter_Precio;
import union.productos.com.restfulapiclient_productosunion.Sqlite.DbAdapter_Stock_Agente;
import union.productos.com.restfulapiclient_productosunion.Sqlite.DbAdaptert_Evento_Establec;

/**
 * Created by Usuario on 06/01/2015.
 */
public class AsyncTaskMain extends AsyncTask<String, String, String> {


    //Comentario
    private Context mContext;
    ProgressDialog prgDialog;
    private DbAdapter_Precio dbAdapter_precio;
    private DbAdapter_Stock_Agente dbAdapter_stock_agente;
    private DbAdapter_Agente dbAdapter_agente;
    private DbAdapter_Comprob_Cobro dbAdapter_comprob_cobro;
    private DbAdaptert_Evento_Establec dbAdaptert_evento_establec;
    private DbAdapter_Comprob_Venta dbAdapter_comprob_venta;
    private DbAdapter_Comprob_Venta_Detalle dbAdapter_comprob_venta_detalle;


    private MainActivity mainActivity;
    private ListView listView;
    private SimpleCursorAdapter simpleCursorAdapter;

    public AsyncTaskMain(MainActivity mainActivity){
        this.mContext = mainActivity;
        dbAdapter_precio = new DbAdapter_Precio(mainActivity);
        dbAdapter_precio.open();
        dbAdapter_stock_agente = new DbAdapter_Stock_Agente(mainActivity);
        dbAdapter_stock_agente.open();
        dbAdapter_agente = new DbAdapter_Agente(mainActivity);
        dbAdapter_agente.open();
        dbAdapter_comprob_cobro = new DbAdapter_Comprob_Cobro(mainActivity);
        dbAdapter_comprob_cobro.open();
        dbAdaptert_evento_establec = new DbAdaptert_Evento_Establec(mainActivity);
        dbAdaptert_evento_establec.open();
        dbAdapter_comprob_venta = new DbAdapter_Comprob_Venta(mainActivity);
        dbAdapter_comprob_venta.open();
        dbAdapter_comprob_venta_detalle = new DbAdapter_Comprob_Venta_Detalle(mainActivity);
        dbAdapter_comprob_venta_detalle.open();


        this.mainActivity = mainActivity;
        listView = (ListView) mainActivity.findViewById(R.id.listView);

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
        ArrayList<ComprobanteVentaDetalle> comprobanteVentaDetalles = null;

        try {

            //int idAgente = Integer.parseInt(strings[0]);
            //JSONObject jsonObj = api.GetStockAgente(2);
            JSONObject jsonObjStockAgente = api.GetStockAgente(14);
            publishProgress(""+10);
            JSONObject jsonObjLiquidacionAgente = api.GetLiquidacionAgente(14);
            publishProgress(""+20);
            JSONObject jsonObjPrecioCategoria = api.GetPrecioCategoria(1, 14);
            publishProgress(""+30);
            JSONObject jsonObjHistorialVenta = api.GetHistorialVentas(52);
            publishProgress(""+40);
            JSONObject jsonObjHistorialCobroPendiente = api.GetHistorialCobrosPendientes(53);
            publishProgress(""+50);
            JSONObject jsonObjEstablecXRuta = api.GetEstablecimeintoXRuta(1, "01/08/2014");
            publishProgress(""+60);
            JSONObject jsonObjComprobanteVentaEnv = api.GetComprobanteVentaEnv(66);
            publishProgress(""+70);
            JSONObject jsonObjComprobanteVentaDetalleEnv = api.GetComprobanteVentaDetalle_Env(66);






            StockAgenteParser stockAgenteParser = new StockAgenteParser();
            PrecioCategoriaParser precioCategoriaParser = new PrecioCategoriaParser();
            LiquidacionAgenteParser liquidacionAgenteParser = new LiquidacionAgenteParser();
            HistorialVentaParser historialVentaParser = new HistorialVentaParser();
            HistorialCobroPendienteParser historialCobroPendienteParser = new HistorialCobroPendienteParser();
            EstablecimientoXRutaParser establecimientoXRutaParser = new EstablecimientoXRutaParser();
            ComprobanteVentaEnvParser comprobanteVentaEnvParser = new ComprobanteVentaEnvParser();
            ComprobanteVentaDetalleParser comprobanteVentaDetalleParser = new ComprobanteVentaDetalleParser();


            stockAgenteLista = stockAgenteParser.parserStockAgente(jsonObjStockAgente);
            precioCategoriaLista = precioCategoriaParser.parserPrecioCategoria(jsonObjPrecioCategoria);
            liquidacionAgentes = liquidacionAgenteParser.parserLiquidacionAgente(jsonObjLiquidacionAgente);
            historialVentas = historialVentaParser.parserHistorialVenta(jsonObjHistorialVenta);
            historialCobroPendientes = historialCobroPendienteParser.parserHistorialCobroPendiente(jsonObjHistorialCobroPendiente);
            establecimientoXRutas = establecimientoXRutaParser.parserEstablecimientoXRuta(jsonObjEstablecXRuta);
            comprobanteVentaEnvs = comprobanteVentaEnvParser.parserComprobanteVentaEnv(jsonObjComprobanteVentaEnv);
            comprobanteVentaDetalles = comprobanteVentaDetalleParser.parserComprobanteVentaDetalle(jsonObjComprobanteVentaDetalleEnv);


            Log.d("JSON OBJECT AGENTE", ""+jsonObjStockAgente.toString());
            Log.d("JSON OBJECT LIQUIDACION AGENTE", "" + jsonObjLiquidacionAgente.toString());
            Log.d("JSON OBJECT AGENTE PRECIO CATEGORIA", ""+jsonObjPrecioCategoria.toString());
            Log.d("JSON OBJECT HISTORIAL VENTAS", ""+jsonObjHistorialVenta.toString());
            Log.d("JSON OBJECT HISTORIAL COBROS PENDIENTES", ""+jsonObjHistorialCobroPendiente.toString());
            Log.d("JSON OBJECT ESTABLECIMIENTOS X RUTA", ""+jsonObjEstablecXRuta.toString());
            Log.d("JSON OBJECT COMPROBANTE VENTA ENV", ""+jsonObjComprobanteVentaEnv.toString());
            Log.d("JSON OBJECT COMPROBANTE VENTA DETALLE ENV", ""+jsonObjComprobanteVentaEnv.toString());





            Log.d("IMPORTANDO ", "INICIANDO ...");


            for (int i = 0; i < stockAgenteLista.size() ; i++) {
                Log.d("Stock Agente"+i, "Nombre : "+stockAgenteLista.get(i).getNombre());

                boolean existe = dbAdapter_stock_agente.existsStockAgenteByIdProd(""+stockAgenteLista.get(i).getIdProducto());
                Log.d("EXISTE ", ""+existe);
                if (existe){
                    dbAdapter_stock_agente.updateStockAgentes(stockAgenteLista.get(i),1);
                }else {
                    //NO EXISTE ENTONCES CREEMOS UNO NUEVO
                    dbAdapter_stock_agente.createStockAgentes(stockAgenteLista.get(i), 1, Constants._IMPORTADO);
                }
            }
            publishProgress(""+80);
            for (int i = 0; i < precioCategoriaLista.size() ; i++) {
                Log.d("PRECIO CATEGORÌA : " + i, "Escala Precios : " + precioCategoriaLista.get(i).getEscalaPrecios());

                boolean existe = dbAdapter_precio.existePrecio(precioCategoriaLista.get(i).getIdProducto(), precioCategoriaLista.get(i).getIdCategoriaEstablec(),precioCategoriaLista.get(i).getValorUnidad());
                Log.d("EXISTE ", ""+existe);
                if (existe){
                    dbAdapter_precio.updatePrecios(precioCategoriaLista.get(i),1);
                }else {
                    //NO EXISTE ENTONCES CREEMOS UNO NUEVO
                    dbAdapter_precio.createPrecios(precioCategoriaLista.get(i), 1);
                }
                //dbAdapter_precio.createPrecios(precioCategoriaLista.get(i), 1);

            }
            publishProgress(""+90);
            for (int i = 0; i < liquidacionAgentes.size() ; i++) {
                Log.d("LIQUIDACIÒN AGENTES : " + i, " Nombre : " + liquidacionAgentes.get(i).getNombreAgente());

                boolean existe = dbAdapter_agente.existeAgentesById(liquidacionAgentes.get(i).getIdAgente());

                Log.d("EXISTE ", ""+existe);
                if (existe){
                    dbAdapter_agente.updateAgente(liquidacionAgentes.get(i));
                }else {
                    //NO EXISTE ENTONCES CREEMOS UNO NUEVO
                    dbAdapter_agente.createAgente(liquidacionAgentes.get(i));
                }
            }
            publishProgress(""+95);
            for (int i = 0; i < historialVentas.size() ; i++) {
                Log.d("HISTORIAL VENTAS : " + i, " Nombre : " + historialVentas.get(i).getNombreProducto());

            }
            for (int i = 0; i < historialCobroPendientes.size() ; i++) {
                Log.d("HISTORIAL COBROS PENDIENTES : " + i, " Monto a pagar : " + historialCobroPendientes.get(i).getMontoAPagar());
                boolean existe = dbAdapter_comprob_cobro.existeComprobCobroByIdAndFecha(historialCobroPendientes.get(i).getIdEstablec(),historialCobroPendientes.get(i).getFechaCobro());

                Log.d("EXISTE ", ""+existe);
                if (existe){
                    dbAdapter_comprob_cobro.updateComprobCobros(historialCobroPendientes.get(i));
                }else {
                    //NO EXISTE ENTONCES CREEMOS UNO NUEVO
                    dbAdapter_comprob_cobro.createComprobCobro(historialCobroPendientes.get(i));
                }
            }
            publishProgress(""+96);
            for (int i = 0; i < establecimientoXRutas.size() ; i++) {
                Log.d("ESTABLECIMIENTOS X RUTAS: " + i, " Nombre Establecimiento : " + establecimientoXRutas.get(i).getNomEstablec());
                boolean existe = dbAdaptert_evento_establec.existeEstablecsById(establecimientoXRutas.get(i).getIdEstablec());

                Log.d("EXISTE ", ""+existe);
                if (existe){
                    //dbAdapter_comprob_cobro.updateComprobCobros(historialCobroPendientes.get(i));
                    dbAdaptert_evento_establec.updateEstablecimientos(establecimientoXRutas.get(i), 1);
                }else {
                    //NO EXISTE ENTONCES CREEMOS UNO NUEVO
                    dbAdaptert_evento_establec.createEstablecimientos(establecimientoXRutas.get(i), 1);
                }
            }
            publishProgress(""+97);
            for (int i = 0; i < comprobanteVentaEnvs.size() ; i++) {
                Log.d("COMPROBANTE VENTA ENV: " + i, " Total : " + comprobanteVentaEnvs.get(i).getTotal());

                boolean existe = dbAdapter_comprob_venta.existeComprobVentaById(comprobanteVentaEnvs.get(i).getEstIEstablecimientoId());


                Log.d("EXISTE ", ""+existe);
                if (existe){
                    //dbAdapter_comprob_cobro.updateComprobCobros(historialCobroPendientes.get(i));
                    dbAdapter_comprob_venta.updateComprobantes(comprobanteVentaEnvs.get(i), 1);
                }else {
                    //NO EXISTE ENTONCES CREEMOS UNO NUEVO
                    dbAdapter_comprob_venta.createComprobVentas(comprobanteVentaEnvs.get(i), 1);
                }
            }
            publishProgress(""+98);
            for (int i = 0; i < comprobanteVentaDetalles.size() ; i++) {
                Log.d("COMPROBANTE VENTA DETALLE : " + i, " ProVNombre : " + comprobanteVentaDetalles.get(i).getProVNombre());

/*                boolean existe = dbAdapter_comprob_venta_detalle.fetchAllComprobVentaDetalleByIdComp();


                Log.d("EXISTE ", ""+existe);
                if (existe){
                    //dbAdapter_comprob_cobro.updateComprobCobros(historialCobroPendientes.get(i));
                    dbAdapter_comprob_venta.updateComprobantes(comprobanteVentaEnvs.get(i),1);
                }else {
                    //NO EXISTE ENTONCES CREEMOS UNO NUEVO
                    dbAdapter_comprob_venta.createComprobVentas(comprobanteVentaEnvs.get(i),1);
                }
                */
            }


               publishProgress("" + 100);

            Log.d("IMPORTANDO", "FINALIZADO");


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
        Toast.makeText(mContext.getApplicationContext(), "COMPLETADO", Toast.LENGTH_SHORT);

        /*
        Cursor cursor = dbAdapter_stock_agente.fetchAllStockAgente();

        String from[] = {
                DbAdapter_Stock_Agente.ST_nombre
        };
        */
        Cursor cursor = dbAdapter_comprob_venta.fetchAllComprobVenta();

        String from[] = {
                DbAdapter_Comprob_Venta.CV_total
        };

        int to[] = {
            R.id.textViewDetalles
        };
        simpleCursorAdapter = new SimpleCursorAdapter(
                mainActivity,
                R.layout.lista_detalles,
                cursor,
                from,
                to,
                0
        );

        listView.setAdapter(simpleCursorAdapter);

    }

    public void createProgressDialog(){
        prgDialog = new ProgressDialog(mContext);
        prgDialog.setMessage("Importando ...");
        prgDialog.setIndeterminate(false);
        prgDialog.setMax(100);
        prgDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        prgDialog.setCancelable(false);
        prgDialog.show();

    }





}
