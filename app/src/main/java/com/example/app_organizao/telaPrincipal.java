package com.example.app_organizao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class telaPrincipal extends AppCompatActivity implements View.OnClickListener {
    Button bthorario;
    Button bt_TelaPrincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
        getSupportActionBar().hide();

        bthorario = (Button) findViewById(R.id.bthorario);
        bt_TelaPrincipal = (Button) findViewById(R.id.bt_TelaPrincipal);
        bt_TelaPrincipal.setOnClickListener(this);
        bthorario.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.bthorario){
            Intent intencao = new Intent(this, horarioTarefa.class);
            startActivity(intencao);
        }
        if (view.getId()==R.id.bt_TelaPrincipal){
            Intent tarefaSalva = new Intent(this, tarefaSalva.class);
            startActivity(tarefaSalva);
        }
    }
}