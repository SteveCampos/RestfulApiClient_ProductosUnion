package union.productos.com.restfulapiclient_productosunion.Sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Usuario on 09/01/2015.
 */
public class DBHelper extends SQLiteOpenHelper{


    private static final int DATABASE_VERSION = 4;
    private static final String DATABASE_NAME = "ProdUniondb.sqlite";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL(DbAdapter_Precio.CREATE_TABLE_PRECIO);
        sqLiteDatabase.execSQL(DbAdapter_Stock_Agente.CREATE_TABLE_STOCK_AGENTE);
        sqLiteDatabase.execSQL(DbAdapter_Agente.CREATE_TABLE_AGENTE);
        sqLiteDatabase.execSQL(DbAdapter_Comprob_Cobro.CREATE_TABLE_COMPROB_COBRO);
        sqLiteDatabase.execSQL(DbAdaptert_Evento_Establec.CREATE_TABLE_EVENTO_ESTABLEC);
        sqLiteDatabase.execSQL(DbAdapter_Comprob_Venta.CREATE_TABLE_COMPROB_VENTA);
        sqLiteDatabase.execSQL(DbAdapter_Comprob_Venta_Detalle.CREATE_TABLE_COMPROB_VENTA_DETALLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i2) {
        sqLiteDatabase.execSQL(DbAdapter_Precio.DELETE_TABLE_PRECIO);
        sqLiteDatabase.execSQL(DbAdapter_Stock_Agente.DELETE_TABLE_STOCK_AGENTE);
        sqLiteDatabase.execSQL(DbAdapter_Agente.DELETE_TABLE_AGENTE);
        sqLiteDatabase.execSQL(DbAdapter_Comprob_Cobro.DELETE_TABLE_COMPROB_COBRO);
        sqLiteDatabase.execSQL(DbAdapter_Comprob_Venta.DELETE_TABLE_COMPROB_VENTA);
        sqLiteDatabase.execSQL(DbAdapter_Comprob_Venta_Detalle.DELETE_TABLE_COMPROB_VENTA_DETALLE);
        onCreate(sqLiteDatabase);
    }
}
