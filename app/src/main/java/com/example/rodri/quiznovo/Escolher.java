package com.example.rodri.quiznovo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Escolher extends Activity {


    int pontuacao1;
    String nome1 = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolher);

        String[] atividades = new String[]{"Geografia brasileira","História brasileira", "Política brasileira"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, atividades);

        ListView lv = (ListView) findViewById(R.id.lv);
        TextView tv1 = (TextView) findViewById(R.id.textView4);
        TextView tv2 = (TextView) findViewById(R.id.textView5);

        lv.setAdapter(adapter);
        lv.setOnItemClickListener(chamaAtividades(this));

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            nome1= extras.getString("nome");
            if (nome1!= null) {
                tv1.setText(" "+ nome1);
            }
            pontuacao1 = extras.getInt("pontuacao");
            tv2.setText(" "+ pontuacao1);
        }
    }



    public AdapterView.OnItemClickListener chamaAtividades(final Context context){
        return (new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> av, View v, int position, long id) {
                Intent intent;
                Bundle bundle = new Bundle();
                bundle.putInt("pontuacao", pontuacao1);
                bundle.putString("nome", nome1);

                switch (position){
                    case 0:
                        intent = new Intent(context, GeografiaBrasileira.class);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(context, HistoriaBrasileira.class);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(context, PoliticaBrasileira.class);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}