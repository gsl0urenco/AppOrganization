package com.example.app_organizao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class criarTarefa_Escolher extends AppCompatActivity implements View.OnClickListener {
    Button criar_tarefa, visualizar_tarefas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_tarefa_escolher);

        criar_tarefa = (Button) findViewById(R.id.criar_tarefa);
        criar_tarefa.setOnClickListener(this);
        visualizar_tarefas = (Button) findViewById(R.id.visualizar_tarefas);
        visualizar_tarefas.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.criar_tarefa){
            Intent criar_tarefas = new Intent(this, nomeTarefa.class);
            startActivity(criar_tarefas);
        }
        if (view.getId()==R.id.visualizar_tarefas){
            Intent visualizar_tarefas = new Intent(this, tarefaSalva.class);
            startActivity(visualizar_tarefas);
        }

    }
}