package union.productos.com.restfulapiclient_productosunion;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import union.productos.com.restfulapiclient_productosunion.AsyncTask.AsyncTaskMain;
import union.productos.com.restfulapiclient_productosunion.AsyncTask.ExportMain;


public class MainActivity extends Activity {

    private Button buttonAsyncTask;
    private Button buttonExportar;
    private MainActivity mContext;
    private AsyncTaskMain asyncTaskMain;
    private ExportMain asyncExport;
    public ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        buttonAsyncTask = (Button) findViewById(R.id.buttonAsynTask);
        buttonExportar = (Button) findViewById(R.id.buttonExportAsynTask);
        buttonAsyncTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            asyncTaskMain = new AsyncTaskMain(mContext);
            asyncTaskMain.execute();
            }
        });
        buttonExportar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                asyncExport = new ExportMain(mContext);
                asyncExport.execute();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
