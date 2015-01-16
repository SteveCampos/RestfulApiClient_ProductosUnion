package union.productos.com.restfulapiclient_productosunion.AsyncTask;

import android.app.ProgressDialog;
import android.database.Cursor;
import android.os.AsyncTask;

import union.productos.com.restfulapiclient_productosunion.MainActivity;
import union.productos.com.restfulapiclient_productosunion.RestApi.StockAgenteRestApi;
import union.productos.com.restfulapiclient_productosunion.Sqlite.DbAdapter_Stock_Agente;

/**
 * Created by Usuario on 09/01/2015.
 */
public class ExportMain extends AsyncTask<String, Integer, Integer> {


    private MainActivity mainActivity;
    private ProgressDialog prgDialog;
    //Tablas a exportar
    private DbAdapter_Stock_Agente dpDbAdapter_stock_agente;

    public ExportMain(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
        dpDbAdapter_stock_agente = new DbAdapter_Stock_Agente(mainActivity);
        dpDbAdapter_stock_agente.open();
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        createProgressDialog();

    }

    @Override
    protected Integer doInBackground(String... strings) {


        StockAgenteRestApi api = new StockAgenteRestApi();

        // OBTENGO TODAS LAS DATOS DE LAS TABLAS QUE SE HAN CREADO
        Cursor cursor = dpDbAdapter_stock_agente.fetchAllStockAgente();
        //OBTENGO TODOS LOS DATOS DE LAS TABLAS QUE SE HAN ACTUALIZADO
        Cursor cursor1 = dpDbAdapter_stock_agente.fetchAllStockAgenteVentas();

        //RECORRO CADA CURSOR Y EXPORTO LOS DATOS


        for (cursor.isFirst();!cursor.isAfterLast();cursor.moveToNext()){
            //AQUÍ LLAMO A LOS MÉTODOS GENERADOS POR LA API RESTFUL
            //MÉTODOS PARA CREAR
        }

        for (cursor1.isFirst();!cursor1.isAfterLast();cursor1.moveToNext()){
            //AQUÍ LLAMO A LOS MÉTODOS GENERADOS POR LA API RESTFUL
            //MÉTODOS PARA ACTUALIZAR
        }
        publishProgress(100);




        return 1;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        prgDialog.setProgress(values[0]);
    }

    @Override
    protected void onPostExecute(Integer integer) {
        prgDialog.dismiss();
    }

    public void createProgressDialog(){
        prgDialog = new ProgressDialog(mainActivity);
        prgDialog.setMessage("Exportando ...");
        prgDialog.setIndeterminate(false);
        prgDialog.setMax(100);
        prgDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        prgDialog.setCancelable(false);
        prgDialog.show();

    }
}
