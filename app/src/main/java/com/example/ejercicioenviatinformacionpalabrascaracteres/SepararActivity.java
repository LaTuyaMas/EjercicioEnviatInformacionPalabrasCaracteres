package com.example.ejercicioenviatinformacionpalabrascaracteres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.StringTokenizer;

public class SepararActivity extends AppCompatActivity {

    //Variables de vista
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_separar);

        Intent intentSeparar = getIntent();
        Bundle bundle = intentSeparar.getExtras();
        if (bundle != null){
            int tipo = bundle.getInt("TIPO");
            String frase = bundle.getString("FRASE");

            txtResultado = findViewById(R.id.txtResultadoSeparar);

            if (tipo == R.id.btnPalabrasMain){
                ContarPalabras(frase);
            }
            if (tipo == R.id.btnCaracteresMain){
                ContarCaracteres(frase);
            }
        }
    }

    private void ContarPalabras(String frase) {
        StringTokenizer stringTokenizer = new StringTokenizer(frase);
        int palabras = stringTokenizer.countTokens();
        String anuncio = "Tiene "+palabras+" palabras";
        txtResultado.setText(anuncio);
        /*
        String[] palabras = frase.split(" ");
        String anuncio = "Tiene "+palabras.length+" palabras";
        txtResultado.setText(anuncio);
         */
    }

    private void ContarCaracteres(String frase) {
        String anuncio = "Tiene "+frase.length()+" carácteres";
        txtResultado.setText(anuncio);
        /*
        char[] c = frase.toCharArray();
        String anuncio = "Tiene "+c.length+" carácteres";
        txtResultado.setText(anuncio);
         */
    }
}