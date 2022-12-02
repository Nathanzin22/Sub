package com.example.provasub.BancoDeDados;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.provasub.Entidades.Abastecimento;



public class AbastecimentoDB {
    private DBHelper dbHelper;
    private SQLiteDatabase sqLiteDatabase;


    public AbastecimentoDB (DBHelper dbHelper){
        this.dbHelper = dbHelper;
    }
    public void inserir (Abastecimento abasteci) {
        sqLiteDatabase = dbHelper.getWritableDatabase();

        ContentValues valores = new ContentValues();
        valores.put("Quilometragem_atual", abasteci.getQuilometragem_atual());
        valores.put("quantidade_abastecida", abasteci.getQuantidade_abastecida());
        valores.put("data", abasteci.getData());
        valores.put("valor", abasteci.getValor_pago());

        sqLiteDatabase.insertOrThrow("Abastecimentos", null, valores);

        sqLiteDatabase.close();

    }

}
