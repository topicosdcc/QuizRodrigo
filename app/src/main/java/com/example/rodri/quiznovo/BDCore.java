package com.example.rodri.quiznovo;

/**
 * Created by rodri on 28/06/2016.
 */
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BDCore extends SQLiteOpenHelper {
    private static final String NOME_BD = "teste";
    private static final int VERSAO_BD = 6;


    public BDCore(Context ctx){
        super(ctx, NOME_BD, null, VERSAO_BD);
    }
    @Override
    public void onCreate(SQLiteDatabase bd) {
        bd.execSQL("create table usuario(_id integer primary key autoincrement, nome text not null, email text not null, senha text not null);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase bd, int i, int i1) {
        bd.execSQL("drop table usuario;");
        onCreate(bd);

    }
}

