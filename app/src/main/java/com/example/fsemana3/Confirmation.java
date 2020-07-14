package com.example.fsemana3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Confirmation extends AppCompatActivity {
    private TextView confName, confDate, confTelephone, confEmail, confDescription;
    private Button confEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);

        Bundle parameters = getIntent().getExtras();
        String name = parameters.getString(getString(R.string.mainNombre));
        String date = parameters.getString(getString(R.string.mainFecha));
        String telephone = parameters.getString(getString(R.string.mainTelefono));
        String email = parameters.getString(getResources().getString(R.string.mainEmail));
        String description = parameters.getString(getString(R.string.mainDescripcion));

        confName = (TextView) findViewById(R.id.confirm_nombre);
        confDate = (TextView) findViewById(R.id.confirm_fecha);
        confTelephone = (TextView) findViewById(R.id.confirm_telefono);
        confEmail = (TextView) findViewById(R.id.confirm_email);
        confDescription = (TextView) findViewById(R.id.confirm_descripcion);
        confEdit = (Button) findViewById(R.id.editar_datos);

        confName.setText(getResources().getString(R.string.nombre_completo) + ": " + name);
        confDate.setText(getResources().getString(R.string.fecha_de_nacimiento) + ": "  + date);
        confTelephone.setText(getResources().getString(R.string.telefono) + ": "  + telephone);
        confEmail.setText( getResources().getString(R.string.email) + ": "  + email);
        confDescription.setText(getResources().getString(R.string.descripcion_del_contacto) + ": "  + description);

        confEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}