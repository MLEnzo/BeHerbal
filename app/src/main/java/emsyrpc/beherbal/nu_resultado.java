package emsyrpc.beherbal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;


import static emsyrpc.beherbal.nu_3.idEst;
import static emsyrpc.beherbal.nu_3.pesoId;

public class nu_resultado extends AppCompatActivity {


    EditText pesoIdeal,pesoPerder,grIdeal,grPerder;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nu_resultado);

        pesoIdeal=(EditText)findViewById(R.id.etPesoIdealR);
        pesoPerder=(EditText)findViewById(R.id.pesoAPerder);
        grIdeal=(EditText)findViewById(R.id.porcjGrasaIdeal);
        grPerder=(EditText)findViewById(R.id.grasacorporal);

        pesoIdeal.setText(" min="+pesoId.getPi_min()+" med="+pesoId.getPi_med()+" gr="+pesoId.getPi_max()+" ");




        pesoPerder.setText("0.0");
        grIdeal.setText("0.0");
        grPerder.setText("0.0");

        ////NOTA//////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////
        // falta obtener los demas items: peso a perder, grasa ideal, grasa a perder...
        //
        //IDEA: Agregar opcion de calcular peso a perder y grasa a perder segun el peso ideal
        //     y grasa ideal que el usuario de la aplicacion eliga(minimo--0--mediano--o--maximo)
        ////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////




    }
}
