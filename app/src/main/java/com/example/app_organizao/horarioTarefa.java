package com.example.app_organizao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class horarioTarefa extends AppCompatActivity implements View.OnClickListener {
    Button btescolhatime;
    Button btVoltartipo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horario_tarefa);
        getSupportActionBar().hide();

        btescolhatime = (Button) findViewById(R.id.btescolhatime);
        btVoltartipo = (Button) findViewById(R.id.btVoltartipo);
        btescolhatime.setOnClickListener(this);
        btVoltartipo.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.btescolhatime){
            Intent intencao = new Intent(this, telaPrincipal.class);
            startActivity(intencao);
        }
        if (view.getId()==R.id.btVoltartipo){
            Intent intencao = new Intent(this, tipodeTarefa.class);
            startActivity(intencao);
        }
    }
}