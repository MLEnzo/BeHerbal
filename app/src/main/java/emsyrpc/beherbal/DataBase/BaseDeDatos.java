package emsyrpc.beherbal.DataBase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Pablo on 28/07/2017.
 */

public class BaseDeDatos extends SQLiteOpenHelper {

    //declaracion de la bd
    public static final int DATABASE_VERSION=1;
    public static final String DATABASE_NAME="db_beherbal";

    public BaseDeDatos(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(EstructuraDB.CREAR_TABLA_USUARIO);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

        db.execSQL("DROP TABLE IF EXISTS usuario");
        onCreate(db);
    }







}
