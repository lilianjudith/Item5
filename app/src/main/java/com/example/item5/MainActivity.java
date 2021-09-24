package com.example.item5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //declarar paso
    Button boton;
    String valor = "Texto de Prueba";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// casteo
        boton= findViewById(R.id.btn_enviar);
//traer al evento
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
// intenst explicito
                Intent intent_explicito = new Intent(MainActivity.this,segundoActivity2.class);
                intent_explicito.putExtra("dato01",valor);
                intent_explicito.putExtra("dato02","Texto de prueba2");
                startActivity(intent_explicito);
            }
        });
    }
}