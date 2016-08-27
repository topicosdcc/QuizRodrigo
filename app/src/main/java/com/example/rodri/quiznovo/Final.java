package com.example.rodri.quiznovo;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Final extends AppCompatActivity {

    Jogadores jogador = new Jogadores();
    String nome1 = "";
    String[] resultado1, resultado2;
    int pontuacao1;
    static final int READ_BLOCK_SIZE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            nome1= extras.getString("nome");
            pontuacao1 = extras.getInt("pontuacao");
            jogador.inicializa(nome1,pontuacao1);
            escreverArquivo(nome1,pontuacao1);

            Toast toast = Toast.makeText(this,nome1 + pontuacao1,Toast.LENGTH_LONG);
        }

        String nome = lerArquivo1();
        String pontos = lerArquivo2();

        TextView textView = (TextView) findViewById(R.id.textView6);
        textView.setText("Seu nome:" + nome + ", Sua pontucao: " + pontos);
    }


    public void escreverArquivo(String nome, int pont){
        try {
            FileOutputStream fileout = openFileOutput("Nomes.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriter = new OutputStreamWriter(fileout);
            outputWriter.write(nome);
            outputWriter.close();

            FileOutputStream fileout1 = openFileOutput("Pontuacao.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriter1 =new OutputStreamWriter(fileout1);
            outputWriter1.write(String.valueOf(pont));
            outputWriter1.close();

            //display file saved message
            Toast.makeText(getBaseContext(), "File saved successfully!",
                    Toast.LENGTH_SHORT).show();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public String lerArquivo1(){
        String s="";
        try {
            FileInputStream fileIn = openFileInput("Nomes.txt");
            InputStreamReader InputRead = new InputStreamReader(fileIn);

            char[] inputBuffer= new char[READ_BLOCK_SIZE];
            int charRead;

            while ((charRead=InputRead.read(inputBuffer))>0) {
                // char to string conversion
                String readstring=String.copyValueOf(inputBuffer,0,charRead);
                s +=readstring;
            }
            InputRead.close();
            Toast.makeText(getBaseContext(), s,Toast.LENGTH_SHORT).show();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }


    public String lerArquivo2(){
        String s="";
        try {
            FileInputStream fileIn = openFileInput("Pontuacao.txt");
            InputStreamReader InputRead = new InputStreamReader(fileIn);

            char[] inputBuffer= new char[READ_BLOCK_SIZE];
            int charRead;

            while ((charRead=InputRead.read(inputBuffer))>0) {
                // char to string conversion
                String readstring=String.copyValueOf(inputBuffer,0,charRead);
                s +=readstring;
            }
            InputRead.close();
            Toast.makeText(getBaseContext(), s,Toast.LENGTH_SHORT).show();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }
}
