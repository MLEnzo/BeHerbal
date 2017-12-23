package emsyrpc.beherbal;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import emsyrpc.beherbal.DataBase.BaseDeDatos;
import emsyrpc.beherbal.entidades.pesoIdealU;


import static emsyrpc.beherbal.nu_2.buscaListEst;
import static emsyrpc.beherbal.nu_2.selectEst;
import static emsyrpc.beherbal.nu_2.selectMuñeca;

public class nu_3 extends AppCompatActivity {



    //datos para usuario y resultado
    //****************************************
    public static Double imcU=0.0;
    public static Double grasCU=0.0;
    public static pesoIdealU pesoId= new pesoIdealU();
    public static Integer idEst;
    TextView resultadoN2;

    EditText imc,grasa;
    //*****************************************

    BaseDeDatos conn=new BaseDeDatos(this,"db_beherbal", null, 1);
    Button btEvaluar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nu_3);

        ///for pra obtener id de estatura
        for(int i=0; i<buscaListEst.size(); i++){

            if(selectEst.equals(buscaListEst.get(i).toString())){

                idEst=i+1;
            }

        }

        //editTex

        imc= (EditText) findViewById(R.id.etIMC);
        grasa= (EditText) findViewById(R.id.etPGrasa);
        btEvaluar= (Button) findViewById(R.id.btEvaluar);
        imc.setText(""+idEst);


        ///////////////////////////////////////////////////////
        resultadoN2=(TextView)findViewById(R.id.ResultadoN2);
        resultadoN2.setText("muñeca "+selectMuñeca+" edad "+idEst);/////////ferificar obtener la Estatura id
        //////////////////////////////////////////////////////////

        //boton evaluar

        btEvaluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                imcU= Double.parseDouble(imc.getText().toString());
                grasCU= Double.parseDouble(grasa.getText().toString());
                Intent intent= new Intent(nu_3.this, nu_resultado.class);
                startActivity(intent);


                //Obtencion de datos para mostrar en resultados

              //  if(selectSexo.equals("Hombre")){consultaPesoIdealH();}
               // if(selectSexo.equals("Mujer")){consultaPesoIdealM();}






            }

            private void consultaPesoIdealH() {


                SQLiteDatabase db=conn.getReadableDatabase();

                if(selectMuñeca.equals("Pequeña")){

                    Cursor cursor=db.rawQuery("SELECT minimo, medio, maximo  FROM pesoIdealPqH, estaturaH WHERE idPesoIdeal=idEstatura AND idEstatura="+idEst+"",null);

                    pesoId.setIdPesoIdeal(cursor.getInt(0));
                    pesoId.setPi_min(cursor.getDouble(1));
                    pesoId.setPi_med(cursor.getDouble(2));
                    pesoId.setPi_max(cursor.getDouble(3));


                }else if(selectMuñeca.equals("Mediana")){

                    Cursor cursor=db.rawQuery("SELECT minimo, medio, maximo  FROM pesoIdealMdH, estaturaH WHERE idPesoIdeal=idEstatura AND idEstatura="+idEst+"",null);



                    pesoId.setIdPesoIdeal(cursor.getInt(0));
                    pesoId.setPi_min(cursor.getDouble(1));
                    pesoId.setPi_med(cursor.getDouble(2));
                    pesoId.setPi_max(cursor.getDouble(3));

                }else if(selectMuñeca.equals("Grande")){

                    Cursor cursor=db.rawQuery("SELECT minimo, medio, maximo  FROM pesoIdealGrH, estaturaH WHERE idPesoIdeal=idEstatura AND idEstatura="+idEst+"",null);



                    pesoId.setIdPesoIdeal(cursor.getInt(0));
                    pesoId.setPi_min(cursor.getDouble(1));
                    pesoId.setPi_med(cursor.getDouble(2));
                    pesoId.setPi_max(cursor.getDouble(3));

                }




            }

            private void consultaPesoIdealM() {
                SQLiteDatabase db=conn.getReadableDatabase();

                if(selectMuñeca.equals("Pequeña")){

                    Cursor cursor=db.rawQuery("SELECT minimo, medio, maximo  FROM pesoIdealPqM, estaturaM WHERE idPesoIdeal=idEstatura AND idEstatura="+idEst+"",null);




                    pesoId.setIdPesoIdeal(cursor.getInt(0));
                    pesoId.setPi_min(cursor.getDouble(1));
                    pesoId.setPi_med(cursor.getDouble(2));
                    pesoId.setPi_max(cursor.getDouble(3));


                }else if(selectMuñeca.equals("Mediana")){

                    Cursor cursor=db.rawQuery("SELECT minimo, medio, maximo  FROM pesoIdealMdM, estaturaM WHERE idPesoIdeal=idEstatura AND idEstatura="+idEst+"",null);



                    pesoId.setIdPesoIdeal(cursor.getInt(0));
                    pesoId.setPi_min(cursor.getDouble(1));
                    pesoId.setPi_med(cursor.getDouble(2));
                    pesoId.setPi_max(cursor.getDouble(3));

                }else if(selectMuñeca.equals("Grande")){

                    Cursor cursor=db.rawQuery("SELECT minimo, medio, maximo  FROM pesoIdealGrM, estaturaM WHERE idPesoIdeal=idEstatura AND idEstatura="+idEst+"",null);



                    pesoId.setIdPesoIdeal(cursor.getInt(0));
                    pesoId.setPi_min(cursor.getDouble(1));
                    pesoId.setPi_med(cursor.getDouble(2));
                    pesoId.setPi_max(cursor.getDouble(3));

                }

            }


        });


    }
}
