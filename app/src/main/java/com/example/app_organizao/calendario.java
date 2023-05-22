package com.example.app_organizao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.Toast;

public class calendario extends AppCompatActivity implements View.OnClickListener {
    Button bt_salvar_calendario;
    Spinner txtHora;
    DatePicker calendario;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);


        calendario = (DatePicker) findViewById(R.id.calendario);
        bt_salvar_calendario = (Button) findViewById(R.id.bt_salvar_calendario);
        txtHora = (Spinner) findViewById( R.id.txtHora) ;

        bt_salvar_calendario.setOnClickListener(this);

        String[] horarios = new String[] {"01:00", "02:00", "03:00", "04:00", "05:00",
                "06:00", "07:00","08:00", "09:00", "10:00", "11:00", "12:00", "13:00",
                "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00",
                "22:00", "23:00", "00:00"};

        ArrayAdapter<String> aad = new ArrayAdapter<String>( this , android.R.layout.simple_gallery_item , horarios ) ;
        txtHora.setAdapter( aad );
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.bt_salvar_calendario){
            Intent intencao = new Intent(this, tarefaSalva.class);
            startActivity(intencao);
        }

    }
}