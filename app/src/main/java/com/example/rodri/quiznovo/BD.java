package com.example.rodri.quiznovo;

/**
 * Created by rodri on 28/06/2016.
 */
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rodri on 25/06/2016.
 */
public class BD {
    private SQLiteDatabase bd;
    BDCore auxbd;
    public BD(Context context){
        auxbd = new BDCore(context);
        bd = auxbd.getWritableDatabase();
    }

    public void inserir(Jogadores usuario){
        ContentValues valor = new ContentValues();
        valor.put("Nome", usuario.getNome());
        valor.put("pontuacao", usuario.getPontuacao());

        bd.insert("usuario",null, valor);
    }

    public void atualizarPont(Jogadores usuario){
        ContentValues valor = new ContentValues();
        String nome = usuario.getNome();
        int p = usuario.getPontuacao();

        valor.put("Nome", nome);
        valor.put("pontuacao", p);

        bd.update("usuario", valor ,"_id = ?", new String[]{""+usuario.getNome()});
    }

    public void deletar(Jogadores jogador){
        bd.delete("usuario","_id = "+ jogador.getNome(), null);
    }

    public String  buscar(Jogadores jogador){

        SQLiteDatabase db = auxbd.getWritableDatabase();
        String[] colunas = new String[]{"nome","pontuacao"};
        Cursor cursor = bd.query("usuario", colunas, "nome"+" = " + jogador.nome, null, null,null,null);
        StringBuffer buffer = new StringBuffer();


        String p = new String();
        p = String.valueOf(jogador.pontuacao);
        do{
            int index1 = cursor.getColumnIndex(jogador.nome);
            int index2 = cursor.getColumnIndex(p);
            String pessoaNome = cursor.getString(index1);
            int pontos = cursor.getInt(index2);
            buffer.append(pessoaNome + " " + pontos + "\n");

        }while(cursor.moveToNext());
        return buffer.toString();
    }
}
