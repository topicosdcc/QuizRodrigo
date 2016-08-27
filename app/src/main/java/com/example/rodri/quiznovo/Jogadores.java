package com.example.rodri.quiznovo;

/**
 * Created by rodri on 28/06/2016.
 */
public class Jogadores {

    String nome = "";
    int  pontuacao = 0;


    public void inicializa(String n, int p){
        this.nome= n;
        this.pontuacao= p;
    }

    public int getPontuacao(){
        return this.pontuacao;
    }

    public String getNome(){
        return this.nome;
    }

    public void setPontuacao(int p){
        this.pontuacao = p;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public void jogadorAcertou(){
        this.pontuacao = this.pontuacao + 1;
    }
}
