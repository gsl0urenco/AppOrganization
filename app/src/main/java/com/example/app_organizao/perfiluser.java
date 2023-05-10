package com.example.app_organizao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class perfiluser extends AppCompatActivity implements View.OnClickListener {
    EditText cadNome, cadEmail, cadSenha;
    Button btCadastrar, btLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfiluser);
        getSupportActionBar().hide();


        cadNome = (EditText) findViewById(R.id.cadNome);
        cadEmail = (EditText) findViewById(R.id.cadEmail);
        cadSenha = (EditText) findViewById(R.id.cadSenha);
        btCadastrar = (Button) findViewById(R.id.btCadastrar);
        btLogin = (Button) findViewById(R.id.btLogin);
        btLogin.setOnClickListener(this);
        btCadastrar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String nome = cadNome.getText().toString();
        String email = cadEmail.getText().toString();
        String senha = cadSenha.getText().toString();

        BancoController bd = new BancoController(getBaseContext());
        String resultado;

        if (v.getId()==R.id.btLogin){
            Intent intencao = new Intent(this, MainActivity.class);
            startActivity(intencao);
        }else {
            if (nome.length() == 0) {
                String msg1 = "Campo nome vazio, digite um nome para cadastro";
                Toast.makeText(getApplicationContext(), msg1, Toast.LENGTH_LONG).show();
            }
            if (email.length() == 0) {
                String msg2 = "Campo email vazio, digite um email para cadastro";
                Toast.makeText(getApplicationContext(), msg2, Toast.LENGTH_LONG).show();
            }
            if (senha.length() == 0) {
                String msg3 = "Campo senha vazio, digite uma senha para cadastro";
                Toast.makeText(getApplicationContext(), msg3, Toast.LENGTH_LONG).show();
            } else {
                resultado = bd.insereDadosUsuario(nome, email, senha);
                Toast.makeText(getApplicationContext(), resultado, Toast.LENGTH_LONG).show();
                limpar();
            }
        }

    }







    private void limpar() {
        cadSenha.setText("");
        cadEmail.setText("");
        cadNome.setText("");
        cadNome.requestFocus();
    }
}