package com.example.app_organizao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class BancoController {

    private SQLiteDatabase db;

    private criaBanco banco;

    public BancoController(Context context){
        banco = new criaBanco(context);
    }


    public Cursor carregaDadosLogin(String login, String senha) {
        Cursor cursor;
        String[] campos = {"codigo", "nome", "email", "senha"};
        String where = "email = '" + login + "'and senha ='" + senha + "'";
        db = banco.getReadableDatabase();

        cursor = db.query("usuarios", campos, where, null, null, null, null);
        if (cursor != null){
            cursor.moveToFirst();
        }

        db.close();
        return cursor;
    }

    public String insereDadosUsuario(String nome, String email, String senha) {
        ContentValues valores;
        long resultado;
        db = banco.getWritableDatabase();

        valores = new ContentValues();
        valores.put("nome", nome);
        valores.put("email", email);
        valores.put("senha", senha);

        resultado = db.insert("usuarios", null, valores);
        db.close();

        if(resultado == -1){
            return "Erro ao inserir dados, tente novamente!";
        }else {
            return "Dados Cadastrados com sucesso!";
        }
    }
}
