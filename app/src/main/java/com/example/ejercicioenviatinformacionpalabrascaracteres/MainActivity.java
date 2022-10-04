package com.example.ejercicioenviatinformacionpalabrascaracteres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Variables de vista
    private EditText txtEscribir;
    private Button btnPalabras;
    private Button btnCaracteres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InicializarVista();

        //Definir Eventos
        /*
        btnPalabras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PrepararIntent("palabra");
            }
        });
        btnCaracteres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PrepararIntent("caracteres");
            }
        });
         */
    }

    private void InicializarVista() {
        txtEscribir = findViewById(R.id.txtEscribirMain);
        btnPalabras = findViewById(R.id.btnPalabrasMain);
        btnCaracteres = findViewById(R.id.btnCaracteresMain);
    }

    /*
    private void PrepararIntent(String tipo){
        String frase = txtEscribir.getText().toString();

        if (frase.isEmpty()){
            Toast.makeText(this, "Frase NO rellenada", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent intent = new Intent(MainActivity.this, SepararActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("TIPO", tipo);
            bundle.putString("FRASE", frase);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }
     */

    public void clickEficiente(View button){
        String frase = txtEscribir.getText().toString();
        int boton = button.getId();

        if (frase.isEmpty()){
            Toast.makeText(this, "Frase NO rellenada", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent intent = new Intent(MainActivity.this, SepararActivity.class);
            Bundle bundle = new Bundle();
            bundle.putInt("TIPO", boton);
            bundle.putString("FRASE", frase);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }
}