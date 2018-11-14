package com.example.christianfranco.podometro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    Button siguiente;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        siguiente = (Button) findViewById(R.id.siguiente);
        //Intent intentservice = new Intent(this, MyIntentService.class);//inicio el servicio
        //startService(intentservice);



        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sigu = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(sigu);

            }


        });


    }

}
