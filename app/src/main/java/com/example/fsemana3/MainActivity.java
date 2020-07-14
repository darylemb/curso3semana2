package com.example.fsemana3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button next;
    private EditText nombre, telefono, email, descripcion_contacto;
    private DatePicker fecha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.nombre);
        fecha = (DatePicker)findViewById(R.id.date);
        telefono = (EditText)findViewById(R.id.telefono);
        email = (EditText)findViewById(R.id.email);
        descripcion_contacto = (EditText)findViewById(R.id.descripcion_contacto);
        next = (Button)findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent confirmedData = new Intent(MainActivity.this, Confirmation.class);
                confirmedData.putExtra(getString(R.string.mainNombre),nombre.getText().toString());
                confirmedData.putExtra(getString(R.string.mainFecha),fecha.getDayOfMonth()+"/"+fecha.getMonth()+"/"+fecha.getYear());
                confirmedData.putExtra(getString(R.string.mainTelefono),telefono.getText().toString());
                confirmedData.putExtra(getString(R.string.mainEmail),email.getText().toString());
                confirmedData.putExtra(getString(R.string.mainDescripcion),descripcion_contacto.getText().toString());
                startActivity(confirmedData);
            }
        });
    }
}