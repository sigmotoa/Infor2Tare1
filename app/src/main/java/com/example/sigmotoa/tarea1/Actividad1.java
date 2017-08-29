package com.example.sigmotoa.tarea1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class Actividad1 extends AppCompatActivity {

    private EditText nombre;
    private EditText apellido;
    private RadioButton hombre;
    private RadioButton mujer;
    private Button aceptar;
    private ImageView foto;
    private TextView textosalida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);

        nombre = (EditText)findViewById(R.id.nombre);
        apellido=(EditText)findViewById(R.id.apellido);
        hombre=(RadioButton)findViewById(R.id.radioH);
        mujer=(RadioButton)findViewById(R.id.radioM);
        foto=(ImageView)findViewById(R.id.imageView);
        aceptar=(Button)findViewById(R.id.button);
        textosalida=(TextView)findViewById(R.id.salida);




    }
}
