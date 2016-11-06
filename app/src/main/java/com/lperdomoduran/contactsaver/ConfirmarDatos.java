package com.lperdomoduran.contactsaver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.lperdomoduran.contactsaver.R.id.tvDay;
import static com.lperdomoduran.contactsaver.R.id.tvName;

public class ConfirmarDatos extends AppCompatActivity {

    TextView textvName, textvPhone, textvMail, textvDescription, textvDate;
    Bundle parametros;
    String nombre, telefono, mail, descripcion, day, month, year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        parametros = getIntent().getExtras();
        nombre = parametros.getString("NOMBRE");
        telefono = parametros.getString("TELEFONO");
        mail = parametros.getString("MAIL");
        descripcion = parametros.getString("DESCRIPCION");
        day = parametros.getString("DIA");
        month = parametros.getString("MES");
        year = parametros.getString("AÑO");

        //Inicializando los TextViews
        textvName = (TextView) findViewById(tvName);
        textvPhone = (TextView) findViewById(R.id.tvPhone);
        textvMail = (TextView) findViewById(R.id.tvEmail);
        textvDescription = (TextView) findViewById(R.id.tvDescription);
        textvDate = (TextView) findViewById(R.id.tvBirthday);
        //TextView tvDay = (TextView) findViewById(R.id.tvDay);

        //String day = tvDay.getText().toString();

        textvName.setText(getResources().getString(R.string.form_username) + ": "  + nombre);
        textvPhone.setText(getResources().getString(R.string.form_phone) + ": " + telefono);
        textvMail.setText(getResources().getString(R.string.form_email) + ": "+ mail);
        textvDescription.setText(getResources().getString(R.string.form_description) + ": " + descripcion);
        textvDate.setText(getResources().getString(R.string.string_date) + ": "+ day + "/" + month + "/" + year);

        Button btnEditarDatos = (Button) findViewById(R.id.btnEditarDatos);
        // Para cuando presionan el boton de siguiente
        btnEditarDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: //hago un case por si en un futuro agrego mas opciones
                Log.i("ActionBar", "Atrás!");
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }
}
