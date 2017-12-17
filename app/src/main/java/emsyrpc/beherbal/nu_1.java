package emsyrpc.beherbal;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import java.io.File;
import java.sql.Blob;
import java.util.ArrayList;

import emsyrpc.beherbal.DataBase.BaseDeDatos;
import emsyrpc.beherbal.DataBase.EstructuraDB;
import emsyrpc.beherbal.entidades.EdadU;
import emsyrpc.beherbal.entidades.sexoU;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class nu_1 extends AppCompatActivity {


    Button btnSgte;

    //usar en otros activitis


    private String APP_DIRECTORY = "myPictureApp/";
    private String MEDIA_DIRECTORY = APP_DIRECTORY + "media";
    private String TEMPORAL_PICTURE_NAME ="temporal.jpg";

    private final int PHOTO_CODE = 100;
    private final int SELECT_PICTURE = 200;

    private ImageView  imageView;

    //datos para Usuario y resultado final
    //**********************************************
    public static Blob fotoU;//ver como guardar
    public static String nameU;
    public static String apellU;
    public static  String selectSexo="";
    public static Integer selectEdad=0;
    EditText nombre, apellido;
    Spinner sexo, edad;



    //******************************************

    //spinners


    ArrayList<Integer> listaEdad;
    ArrayList<EdadU> edades;
    ArrayList<String> listasexo;
    ArrayList<sexoU> sexos;
    //base de datos

    BaseDeDatos conn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nu_1);


        //conexion a base de datos
       conn=new BaseDeDatos(this,"db_beherbal", null, 1);

        //spinner Edad

        edad= (Spinner) findViewById(R.id.spEdadU);

        ConsultarListaEdad();
        ArrayAdapter<CharSequence> adaptadorEdad =new ArrayAdapter(this, android.R.layout.simple_spinner_item, listaEdad);
       edad.setAdapter(adaptadorEdad);



        //spinner Sexo



        sexo= (Spinner) findViewById(R.id.spSexoU);
        ConsultarListaSexo();
        ArrayAdapter<CharSequence> adaptadorSexo =new ArrayAdapter(this, android.R.layout.simple_spinner_item, listasexo);
        sexo.setAdapter(adaptadorSexo);

       //edittex nombre y apellido
         nombre= (EditText)findViewById(R.id.nombreUsuario);
         apellido= (EditText) findViewById(R.id.apellidoUsuario);


        //Boton siguiente
        btnSgte=(Button)findViewById(R.id.btSiguiente1);

        btnSgte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(nu_1.this, nu_2.class);
                startActivity(intent);
                selectSexo=sexo.getSelectedItem().toString();
                selectEdad= Integer.parseInt(edad.getSelectedItem().toString());
                nameU=nombre.getText().toString();
                apellU=apellido.getText().toString();

            }
        });

        //Foto Usuario

        imageView = (ImageView) findViewById(R.id.ImgAvatar);
        Button button = (Button) findViewById(R.id.btFotoU);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final CharSequence[] options = {"Tomar Foto", "Elegir de Galeria", "Cancelar"};
                final AlertDialog.Builder builder = new AlertDialog.Builder(nu_1.this);


                builder.setTitle("Elige una Opcion");
                builder.setItems(options, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int seleccion) {
                        if(options[seleccion]=="Tomar Foto"){
                            openCamera();
                         }else if(options[seleccion]=="Elegir de Galeria"){
                            Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                            intent.setType("image/*");
                            startActivityForResult(intent.createChooser(intent, "Selecciona App de Imagen"), SELECT_PICTURE);
                        }else if(options[seleccion]=="Cancelar"){
                            dialog.dismiss();
                        }
                    }
                });
                builder.show();
            }
        });


    }

    //metodo Cunsultar edad de base de datos
    private void ConsultarListaEdad() {

        SQLiteDatabase db=conn.getReadableDatabase();

        EdadU ed=null;
        edades=new ArrayList<EdadU>();

        Cursor cursor;
        cursor = db.rawQuery("SELECT * FROM "+ EstructuraDB.TABLA_EDAD,null);

        while (cursor.moveToNext()){

            ed= new EdadU();

            ed.setIdEdad(cursor.getInt(0));
            ed.setEdad(cursor.getInt(1));

            edades.add(ed);

        }

        obtenerListaEd();
    }


    //metodo guardar en arrayList datos edad de la bd
    private void obtenerListaEd() {

        listaEdad=new ArrayList<Integer>();

        for(int i=0; i<edades.size(); i++){

            listaEdad.add(edades.get(i).getEdad());
        }

    }


    //metodo Cunsultar sexo de base de datos
    private void ConsultarListaSexo() {


        SQLiteDatabase db=conn.getReadableDatabase();

        sexoU sx=null;
        sexos=new ArrayList<sexoU>();

        Cursor cursor=db.rawQuery("SELECT * FROM sexo",null);

        while (cursor.moveToNext()){

            sx= new sexoU();

            sx.setIdSexo(cursor.getInt(0));
            sx.setSexo(cursor.getString(1));

            sexos.add(sx);

        }

        obtenerListaSex();
    }

    //metodo guardar en arrayList datos sexo de la bd
    private void obtenerListaSex() {

        listasexo=new ArrayList<String>();

        for(int i=0; i<sexos.size(); i++){

            listasexo.add(sexos.get(i).getSexo());
        }
    }



//metodo abrir camara Foto Usuario
    private void openCamera() {
        File file = new File(Environment.getExternalStorageDirectory(), MEDIA_DIRECTORY);
        file.mkdirs();

        String path = Environment.getExternalStorageDirectory() + File.separator
                + MEDIA_DIRECTORY + File.separator + TEMPORAL_PICTURE_NAME;

        File newFile = new File(path);

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(newFile));
        startActivityForResult(intent, PHOTO_CODE);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode){
            case PHOTO_CODE:
                if (resultCode== RESULT_OK){
                    String dir = Environment.getExternalStorageDirectory() + File.separator
                            + MEDIA_DIRECTORY + File.separator + TEMPORAL_PICTURE_NAME;
                    decodeBitmap(dir);
                }break;
            case SELECT_PICTURE:
                if (resultCode== RESULT_OK){
                    Uri path = data.getData();
                    imageView.setImageURI(path);
                }break;
        }
    }
//metodo decodificar imagen para guardar
    private void decodeBitmap(String dir) {
        Bitmap bitmap;
        bitmap = BitmapFactory.decodeFile(dir);

        imageView.setImageBitmap(bitmap);
    }
}
