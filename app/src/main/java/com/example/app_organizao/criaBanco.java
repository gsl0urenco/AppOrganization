package com.example.app_organizao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class criaBanco extends SQLiteOpenHelper {

    private static final String NOME_BANCO = "banco.db";

    private static final int VERSAO = 5;

    public criaBanco(Context context) { super(context, NOME_BANCO, null, VERSAO);}

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE usuarios ("
                + "codigo integer primary key autoincrement,"
                + "nome text,"
                + "email text,"
                + "senha text)";
        db.execSQL(sql);

        String sql1 = "CREATE TABLE nometarefa ("
                + "nome text)";
        db.execSQL(sql1);

        String sql2 = "CREATE TABLE horariotarefa ("
                + "manha text,"
                + "tarde text,"
                + "noite text,"
                + "madrugada text)";
        db.execSQL(sql2);

        String sql3 = "CREATE TABLE tipotarefa ("
                + "profissional text,"
                + "saude text,"
                + "pessoal text,"
                + "rotina text,"
                + "academico text,"
                + "outros text)";
        db.execSQL(sql3);

        String sql4 = "CREATE TABLE diasemana ("
                + "segunda text,"
                + "terca text,"
                + "quarta text,"
                + "quinta text,"
                + "sexta text,"
                + "sabado text,"
                + "domingo text,"
                + "todosdias text)";
        db.execSQL(sql4);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS usuarios");
        db.execSQL("DROP TABLE IF EXISTS nometarefa");
        db.execSQL("DROP TABLE IF EXISTS horariotarefa");
        db.execSQL("DROP TABLE IF EXISTS tipotarefa");
        db.execSQL("DROP TABLE IF EXISTS diasemana");
        onCreate(db);

    }
}
