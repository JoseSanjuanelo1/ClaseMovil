package com.example.android.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Principal extends AppCompatActivity {

    private TextView cajaNombre;
    private TextView cajaSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        cajaNombre = (TextView)findViewById(R.id.txtNombre);
        cajaSaludo = (TextView)findViewById(R.id.lblsaludo);
    }

    public void Saludar(View v){
        String aux;
        aux = cajaNombre.getText().toString();
        cajaSaludo.setText("Hola "+aux);
    }
}
