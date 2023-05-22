package com.example.app_organizao;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.LinkedList;
import java.util.List;

public class tarefaSalva extends AppCompatActivity implements View.OnClickListener {
    Button bt_voltar_escolhas_tarefas;

    String dataselecionada;

    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarefa_salva);

            bt_voltar_escolhas_tarefas = (Button) findViewById(R.id.bt_voltar_escolhas_tarefas);
            bt_voltar_escolhas_tarefas.setOnClickListener(this);

        }


   

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.bt_voltar_escolhas_tarefas){
            Intent voltar_escolhas_tarefas = new Intent(this, criarTarefa_Escolher.class);
            startActivity(voltar_escolhas_tarefas);
        }

    }




}