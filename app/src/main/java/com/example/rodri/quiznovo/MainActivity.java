package com.example.rodri.quiznovo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    Jogadores jogador = new Jogadores();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void passarEscolher(View view){
        EditText editText = (EditText) findViewById(R.id.editText2);

        String nomeAtual = editText.getText().toString();

        if(nomeAtual != "" || nomeAtual != null){
            jogador.inicializa(nomeAtual, 0);


            Toast toast = Toast.makeText(this, "Olá " + nomeAtual + ", boa sorte.",Toast.LENGTH_SHORT);
            toast.show();



            Bundle bundle = new Bundle();
            bundle.putInt("pontuacao", jogador.getPontuacao());
            bundle.putString("nome", jogador.getNome());
            Intent intent = new Intent(this, Escolher.class);
            intent.putExtras(bundle);
            startActivity(intent);
        }

        if(nomeAtual == "" || nomeAtual == null){
            Toast toast = Toast.makeText(this, "Você não entrou com o nome.",Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
