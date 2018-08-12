package com.example.joseantonio.nuevorepotutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtNombre;
    private Button btnAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = (EditText)findViewById(R.id.txtNombre);
        btnAceptar = (Button)findViewById(R.id.btnAceptar);

        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // se crea intent para direccionar
                Intent intent = new Intent(MainActivity.this,SaludoActivity.class);

                // Se crea bundle para pasar info de una activity a otra
                Bundle b = new Bundle();
                b.putString("NOMBRE",txtNombre.getText().toString());

                // se añade bundle al intent
                intent.putExtras(b);

                // se redirige a nueva activity
                startActivity(intent);
            }
        });
    }
}
