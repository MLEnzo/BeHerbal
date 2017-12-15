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
    public static final String DATABASE_NAME="db_beherbal"; {
}

    public BaseDeDatos(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db2) {
        db2.execSQL(EstructuraDB.CREAR_TABLA_USUARIO);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db2, int i, int i1) {
        db2.execSQL("DROP TABLE IF EXIST usuario");


        onCreate(db2);

    }


}
