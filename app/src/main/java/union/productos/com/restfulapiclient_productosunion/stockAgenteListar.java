package union.productos.com.restfulapiclient_productosunion;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONObject;

import java.util.ArrayList;

import union.productos.com.restfulapiclient_productosunion.JSONParser.StockAgenteParser;
import union.productos.com.restfulapiclient_productosunion.Objects.Stock;
import union.productos.com.restfulapiclient_productosunion.Objects.StockAgente;
import union.productos.com.restfulapiclient_productosunion.RestApi.StockAgenteRestApi;


public class stockAgenteListar extends Activity {

    Context context;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock_agente_listar);

        context = this;
        textView = (TextView) findViewById(R.id.textView);

        String idAgente  = getIntent().getExtras().getString("idAgente");
        Log.d("idAgente obtenido", idAgente);
        new AsyncLoadStockAgente().execute(idAgente);

    }

    protected class AsyncLoadStockAgente extends AsyncTask<String, JSONObject, ArrayList<Stock>>{

        ArrayList<Stock> stockAgenteTable = null;

        @Override
        protected ArrayList<Stock> doInBackground(String... params) {

            StockAgenteRestApi api = new StockAgenteRestApi();
            try {

                int idAgente = Integer.parseInt(params[0]);
                //JSONObject jsonObj = api.GetStockAgente(2);
                JSONObject jsonObj = api.GetStock(2);
                Log.d("JSON OBJECT", ""+jsonObj.toString());
                StockAgenteParser parser = new StockAgenteParser();
                //stockAgenteTable = parser.parserStockAgente(jsonObj);
                stockAgenteTable = parser.parserStock(jsonObj);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                Log.d("AsyncLoadDeptDetails", e.getMessage());

            }

            return stockAgenteTable;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Toast.makeText(context, "Please Wait...",Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onPostExecute(ArrayList<Stock> stockAgentes) {

            textView.setText("Nombre :"+stockAgentes.get(0).getStkagIStock());
            Toast.makeText(context,"Loading Completed",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.stock_agente_listar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
