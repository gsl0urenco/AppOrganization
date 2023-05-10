package com.example.app_organizao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btCadastro;
    Button btAcessar;

    EditText txtLogin;
    EditText txtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        txtLogin = (EditText) findViewById(R.id.txtLogin);
        txtSenha = (EditText) findViewById(R.id.txtSenha);
        btCadastro = (Button) findViewById(R.id.btCadastro);
        btAcessar = (Button) findViewById(R.id.btAcessar);
        btAcessar.setOnClickListener(this);
        btCadastro.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.btCadastro){
            Intent intencao = new Intent(this, cadastro.class);
            startActivity(intencao);
        }
        if (view.getId()==R.id.btAcessar){
            consultaUsuarioLogin();
        }
    }

    private void consultaUsuarioLogin() {
        String login = txtLogin.getText().toString();
        String senha = txtSenha.getText().toString();

        BancoController bd = new BancoController(getBaseContext());

        Cursor dados = bd.carregaDadosLogin(login, senha);

        if (dados.moveToFirst()){
            Intent telaPrincipal = new Intent(this, nomeTarefa.class);
            startActivity(telaPrincipal);
        }else {
            String msg = "Usuário ou Senha incorretos, tente novamente!";
            Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
            limpar();
        }
    }

    private void limpar() {
        txtLogin.setText("");
        txtSenha.setText("");
        txtLogin.requestFocus();
    }
}