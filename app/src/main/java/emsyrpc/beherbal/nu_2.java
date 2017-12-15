package emsyrpc.beherbal;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import emsyrpc.beherbal.DataBase.BaseDeDatos;
import emsyrpc.beherbal.entidades.EdadU;
import emsyrpc.beherbal.entidades.estaturaU;
import emsyrpc.beherbal.entidades.muñecaU;
import emsyrpc.beherbal.entidades.sexoU;

import static emsyrpc.beherbal.nu_1.selectSexo;

public class nu_2 extends AppCompatActivity {


    //datos para usuario y resultado
    //**********************************************
    public static String selectMuñeca="";
    public static Integer idEst=0;
    public static Double pesoAU=0.0;
    public  static Spinner muñeca, estatura;
    EditText pesoActual;




    //************************************************

    //spiner
    ArrayList<String> listaMuñca;
    ArrayList<muñecaU> tamaño;
    ArrayList<Double> listaEstatura;
    ArrayList<estaturaU> estaturaL;
   //base de datos
    BaseDeDatos conn;
    //boton siguiente
    Button btnSgte2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nu_2);

        //conexion a base de datos
        conn=new BaseDeDatos(this,"db_beherbal", null, 1);

        //spinner muñeca

        muñeca= (Spinner) findViewById(R.id.spMedidaMU);



        ConsultarListaMuñeca();
        ArrayAdapter<CharSequence> adaptadorMuñeca =new ArrayAdapter(this, android.R.layout.simple_spinner_item, listaMuñca);
        muñeca.setAdapter(adaptadorMuñeca);



         //spinner estatura


        estatura= (Spinner) findViewById(R.id.spEstaturaU);
        if(selectSexo.equals("Hombre")){ConsultarListaEstatura();}
        if(selectSexo.equals("Mujer")){ConsultarListaEstatura2();}
        ArrayAdapter<CharSequence> adaptadorEst =new ArrayAdapter(this, android.R.layout.simple_spinner_item, listaEstatura);
        estatura.setAdapter(adaptadorEst);

        //editTex peso actual

        pesoActual= (EditText) findViewById(R.id.etPesoActU);



        //boton siguiente
        estaturaU estU;

        btnSgte2=(Button)findViewById(R.id.btSiguiente2);

        btnSgte2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(nu_2.this, nu_3.class);
                startActivity(intent);

                //carga de datos
                selectMuñeca=muñeca.getSelectedItem().toString();
                idEst=(estatura.getSelectedItemPosition());

                pesoAU= Double.parseDouble(pesoActual.getText().toString());

            }
        });
    }

    private void ConsultarListaEstatura2() {
        Cursor cursor;
        estaturaU est;
        estaturaL=new ArrayList<estaturaU>();

        SQLiteDatabase db3=conn.getReadableDatabase();
        cursor=db3.rawQuery("SELECT * FROM estaturaM",null);
        while (cursor.moveToNext()){

            est= new estaturaU();

            est.setIdEstatura(cursor.getInt(0));
            est.setEstatura(cursor.getDouble(1));

            estaturaL.add(est);


        }
        obtenerListaEst();

    }


    private void ConsultarListaMuñeca() {

        SQLiteDatabase db2=conn.getReadableDatabase();

        muñecaU muñ=null;
        tamaño=new ArrayList<muñecaU>();

        Cursor cursor=db2.rawQuery("SELECT * FROM muñeca",null);

        while (cursor.moveToNext()){

            muñ= new muñecaU();

            muñ.setIdMuñeca(cursor.getInt(0));
            muñ.setTamaño(cursor.getString(1));

            tamaño.add(muñ);

        }

        obtenerListaMuñ();

    }

    private void obtenerListaMuñ() {

        listaMuñca=new ArrayList<String>();

        for(int i=0; i<tamaño.size(); i++){

            listaMuñca.add(tamaño.get(i).getTamaño());
        }
    }


    private void ConsultarListaEstatura() {

        SQLiteDatabase db3=conn.getReadableDatabase();
        //obtener resultado de spinner sexo

            Cursor cursor;


            estaturaU est;
            estaturaL=new ArrayList<estaturaU>();

             cursor=db3.rawQuery("SELECT * FROM estaturaH",null);
              while (cursor.moveToNext()) {

                  est = new estaturaU();

                  est.setIdEstatura(cursor.getInt(0));
                  est.setEstatura(cursor.getDouble(1));


                  estaturaL.add(est);
              }

            obtenerListaEst();

        }









    private void obtenerListaEst() {

        listaEstatura=new ArrayList<Double>();

        for(int i=0; i<estaturaL.size(); i++){

            listaEstatura.add(estaturaL.get(i).getEstatura());
        }

    }





}



