package com.example.app_organizao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nomeTarefa extends AppCompatActivity implements View.OnClickListener{
    Button btnomeTarefa;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nome_tarefa);
        getSupportActionBar().hide();

        btnomeTarefa = (Button) findViewById(R.id.btnomeTarefa);
        btnomeTarefa.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.btnomeTarefa){
            Intent intencao = new Intent(this, tipodeTarefa.class);
            startActivity(intencao);
        }
    }
}