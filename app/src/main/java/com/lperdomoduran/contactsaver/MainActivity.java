package com.lperdomoduran.contactsaver;


import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    TextInputEditText editName, editPhone, editMail, editDescription, editDate;
    TextView textvDay, textvMonth, textvYear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Inicializando los TextFields
        editName = (TextInputEditText) findViewById(R.id.tInUserName);
        editPhone = (TextInputEditText) findViewById(R.id.tInPhone);
        editMail = (TextInputEditText) findViewById(R.id.tInEmail);
        editDescription = (TextInputEditText) findViewById(R.id.tInDescription);

        //Inicializando los TextView Para Setear la fecha en la otra actividad
        textvDay = (TextView) findViewById(R.id.tvDay);
        textvMonth = (TextView) findViewById(R.id.tvMonth);
        textvYear = (TextView) findViewById(R.id.tvYear);


        //Inicializo el Boton de Siguiente
        Button btnNext = (Button) findViewById(R.id.btn_next);
        // Para cuando presionan el boton de siguiente
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Obtengo el texto introducido en los TextFields
                String nombre = editName.getText().toString();
                String telefono = editPhone.getText().toString();
                String mail = editMail.getText().toString();
                String descripcion = editDescription.getText().toString();
                String day = textvDay.getText().toString();
                String month = textvMonth.getText().toString();
                String year = textvYear.getText().toString();

                //Se crea el intent para iniciar la otra actividad
                Intent intento = new Intent(MainActivity.this, ConfirmarDatos.class);

                //Se envia la informacion del contacto a la otra actividad
                intento.putExtra("NOMBRE", nombre);
                intento.putExtra("TELEFONO", telefono);
                intento.putExtra("MAIL", mail);
                intento.putExtra("DESCRIPCION", descripcion);
                intento.putExtra("DIA", day);
                intento.putExtra("MES", month);
                intento.putExtra("AÑO", year);

                //Se inicia la otra actividad
                startActivity(intento);
            }
        });
    }


    public void showDatePickerDialog(View v) {
        DatePickerFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }


}
