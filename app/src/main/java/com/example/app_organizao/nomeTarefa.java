package com.example.app_organizao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class nomeTarefa extends AppCompatActivity implements View.OnClickListener{
    Button btnomeTarefa;
    EditText nomeTarefa;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nome_tarefa);
        getSupportActionBar().hide();

        btnomeTarefa = (Button) findViewById(R.id.btnomeTarefa);
        nomeTarefa = (EditText) findViewById(R.id.nomeTarefa);
        btnomeTarefa.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String nome = nomeTarefa.getText().toString();

        BancoController bd = new BancoController(getBaseContext());
        String resultado;

        if (view.getId()==R.id.btnomeTarefa){
            Intent intencao = new Intent(this, tipodeTarefa.class);
            resultado = bd.insereDadosnometarefa(nome);
            Toast.makeText(getApplicationContext(), resultado, Toast.LENGTH_LONG).show();
            startActivity(intencao);
        }
    }
}