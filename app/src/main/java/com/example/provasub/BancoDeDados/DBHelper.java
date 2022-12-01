package com.example.provasub.BancoDeDados;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(@Nullable Context context) {
        super(context, "Prova", null, 1);
}

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
            sqLiteDatabase.execSQL(
                    "CREATE TABLE Abastecimentos(" +
                            "ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                            "Quilometragem_atual real," +
                            "quantidade_abastecida real," +
                            "data varchar (256)," +
                            "valor REAL);"
            );

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
