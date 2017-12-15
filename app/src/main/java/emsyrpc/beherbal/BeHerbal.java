package emsyrpc.beherbal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BeHerbal extends AppCompatActivity {


    Button btnNuevo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);

        btnNuevo=(Button)findViewById(R.id.btNuevo);

        btnNuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(BeHerbal.this, nu_1.class);
                startActivity(intent);
            }
        });








    }












}
