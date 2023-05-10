package com.example.app_organizao;

import static com.example.app_organizao.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tipodeTarefa extends AppCompatActivity implements View.OnClickListener {
    Button bt_proximo;
    Button btVoltarNome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_tipode_tarefa);
        getSupportActionBar().hide();

        bt_proximo = (Button) findViewById(R.id.bt_proximo);
        btVoltarNome = (Button) findViewById(R.id.btVoltarNome);
        bt_proximo.setOnClickListener(this);
        btVoltarNome.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()== id.bt_proximo){
            Intent intencao = new Intent(this, horarioTarefa.class);
            startActivity(intencao);
        }
        if (view.getId()== id.btVoltarNome){
            Intent intencao = new Intent(this, nomeTarefa.class);
            startActivity(intencao);
        }
    }
}