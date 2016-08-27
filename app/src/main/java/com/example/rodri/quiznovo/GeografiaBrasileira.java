package com.example.rodri.quiznovo;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class GeografiaBrasileira extends AppCompatActivity {

    Jogadores jogador = new Jogadores();
    private static RadioGroup radio_g;
    private static RadioButton radio_b;
    private static Button button_sbm;
    int cont = 0, contNada = 0;
    CountDownTimer aCounter;
    int pontuacao1;
    String nome1 = "";

    Questoes questoes = new Questoes();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geografia_brasileira);
        onClickListenerButton();
        contaTempo(1);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            nome1= extras.getString("nome");
            pontuacao1 = extras.getInt("pontuacao");
            jogador.inicializa(nome1,pontuacao1);
        }
    }

    public void onClickListenerButton(){
        radio_g = (RadioGroup) findViewById(R.id.radio_g1);
        button_sbm = (Button) findViewById(R.id.button);

        button_sbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view){
                        chamaPergunta();
                    }
                }
        );
    }

    public void mudarFinal(){
        pontuacao1 = jogador.getPontuacao();
        nome1 = jogador.getNome();
        Bundle bundle = new Bundle();
        bundle.putInt("pontuacao", pontuacao1);
        bundle.putString("nome", nome1);
        Intent intent = new Intent(this, Final.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void contaTempo(int v) {
        if (v == 1) {
            aCounter = new CountDownTimer(20000, 1000) {
                TextView textView2 = (TextView) findViewById(R.id.textView2);

                public void onTick(long millisUntilFinished) {
                    textView2.setText("seconds remaining: " + millisUntilFinished / 1000);
                }

                public void onFinish() {
                    acerta();
                    chamaPergunta();
                }
            };
            aCounter.start();
        }
        if (v == 0) {
            if (aCounter != null) {
                aCounter.cancel();
            }
        }
    }

    public void chamaPergunta() {

        if (cont == 4) {
            contaTempo(0);
            mudarFinal();
        }

        String alternativa;
        String questaoAtual = questoes.questaoAgora("geografia",cont);

        TextView textView2 = (TextView) findViewById(R.id.textView7);
        textView2.setText("Seu nome: " + jogador.getNome() + ", sua pontuação: " + jogador.getPontuacao());

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(questaoAtual);

        RadioButton radio_b1 = (RadioButton) findViewById(R.id.radioButton1);
        RadioButton radio_b2 = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton radio_b3 = (RadioButton) findViewById(R.id.radioButton3);
        RadioButton radio_b4 = (RadioButton) findViewById(R.id.radioButton4);

        alternativa = questoes.alternativas("geografia", cont, radio_b1);
        radio_b1.setText(alternativa);

        alternativa = questoes.alternativas("geografia", cont, radio_b2);
        radio_b2.setText(alternativa);

        alternativa = questoes.alternativas("geografia", cont, radio_b3);
        radio_b3.setText(alternativa);

        alternativa = questoes.alternativas("geografia", cont, radio_b4);
        radio_b4.setText(alternativa);

        int resp = acerta();



        contaTempo(0);
        contaTempo(1);
        contNada = 1;
        cont++;
    }


    public int acerta(){

        final Toast toast1 = Toast.makeText(GeografiaBrasileira.this, "Acertou", Toast.LENGTH_SHORT);
        final Toast toast2 = Toast.makeText(GeografiaBrasileira.this, "Errou", Toast.LENGTH_SHORT);
        final Toast toast3 = Toast.makeText(GeografiaBrasileira.this, "Não marcou ponto", Toast.LENGTH_SHORT);

        if (radio_g.getCheckedRadioButtonId() != -1) {
            int selectedId = radio_g.getCheckedRadioButtonId();
            radio_b = (RadioButton) findViewById(selectedId);
            int acertoOuNao = questoes.acertou("geografia", cont, radio_b);


            if (cont < 4) {
                if (acertoOuNao == 1) {
                    toast1.show();
                    jogador.jogadorAcertou();
                    radio_b.setChecked(false);
                    return 1;

                } else {
                    radio_b.setChecked(false);
                    return 0;
                }
            }
        }
        else {
            if(contNada == 1) {
                toast3.show();
                contNada = 0;
                return 0;
            }
        }
        return 0;
    }
}
