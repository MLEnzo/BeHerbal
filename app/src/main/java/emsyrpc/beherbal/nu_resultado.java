package emsyrpc.beherbal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import static emsyrpc.beherbal.nu_2.idEst;
import static emsyrpc.beherbal.nu_3.pesoId;

public class nu_resultado extends AppCompatActivity {


    EditText pesoIdeal;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nu_resultado);

        pesoIdeal=(EditText)findViewById(R.id.etPesoIdealR);

      //  pesoIdeal.setText(" min="+pesoId.getPi_min()+" med="+pesoId.getPi_med()+" gr="+pesoId.getPi_max()+" ");

        pesoIdeal.setText(" "+idEst);





    }
}
