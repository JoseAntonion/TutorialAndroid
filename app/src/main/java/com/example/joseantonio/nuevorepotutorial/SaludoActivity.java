package com.example.joseantonio.nuevorepotutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SaludoActivity extends AppCompatActivity {


    private TextView txtSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);

        txtSaludo = (TextView)findViewById(R.id.txtSaludo);

        // Se obtiene bundle con datos pasados desde otra activity
        Bundle bundle = getIntent().getExtras();

        txtSaludo.setText("Hola "+bundle.getString("NOMBRE"));

    }
}