package com.example.rodri.quiznovo;

/**
 * Created by rodri on 28/06/2016.
 */
import android.view.View;

/**
 * Created by rodri on 23/06/2016.
 */
public class Questoes {

    public String questaoAgora(String ass,int cont) {
        String resposta = "";

        switch (ass) {
            case "geografia":
                switch (cont) {
                    case 0:
                        resposta = "Qual é o maior estado do Brasil?";
                        break;

                    case 1:
                        resposta = "Quantos estados tem a região Nordeste?";
                        break;

                    case 2:
                        resposta = "Qual é a capital do brasil ?";
                        break;

                    case 3:
                        resposta = "Em que ano o território de Roraima foi elevado a categoria de estado?";
                        break;
                }
                break;

            case "historia":
                switch (cont) {
                    case 0:
                        resposta = "Quem descobriu o Brasil?";
                        break;

                    case 1:
                        resposta = "Qual é o nome da guerra entre Paraguai, Argentina e Brasil?";
                        break;

                    case 2:
                        resposta = "Em que ano começou o regime militar ?";
                        break;

                    case 3:
                        resposta = "De qual século até qual século ocorreu a era de ouro do islamismo?";
                        break;
                }
                break;
            case "politica":
                switch (cont) {
                    case 0:
                        resposta = "Qual é o nome do presidente interino do Brasil?";
                        break;

                    case 1:
                        resposta = "Qual é o partido com o maior número de filiados atualmente no Brasil?";
                        break;

                    case 2:
                        resposta = "Qual é o nome do presidente do senado brasileiro?";
                        break;

                    case 3:
                        resposta = "Qual é o maior partido do senado?";
                        break;
                }
                break;
        }
        return resposta;
    }

    public String alternativas(String ass, int qut, View v ) {

        String resposta = "";

        switch (ass) {
            case "geografia":

                switch (qut) {
                    case 0:
                        switch (v.getId()) {
                            case R.id.radioButton1:
                                resposta = "Amazonas";
                                break;
                            case R.id.radioButton2:
                                resposta = "Para";
                                break;
                            case R.id.radioButton3:
                                resposta = "Santa Catarina";
                                break;
                            case R.id.radioButton4:
                                resposta = "Roraima";
                                break;
                        }
                        break;

                    case 1:
                        switch (v.getId()) {
                            case R.id.radioButton1:
                                resposta = "10";
                                break;
                            case R.id.radioButton2:
                                resposta = "9";
                                break;
                            case R.id.radioButton3:
                                resposta = "20";
                                break;
                            case R.id.radioButton4:
                                resposta = "16";
                                break;
                        }
                        break;

                    case 2:
                        switch (v.getId()) {
                            case R.id.radioButton1:
                                resposta = "Istambul";
                                break;
                            case R.id.radioButton2:
                                resposta = "Boa Vista";
                                break;
                            case R.id.radioButton3:
                                resposta = "São Paulo";
                                break;
                            case R.id.radioButton4:
                                resposta = "Brasília";
                                break;
                        }
                        break;

                    case 3:
                        switch (v.getId()) {
                            case R.id.radioButton1:
                                resposta = "1500";
                                break;
                            case R.id.radioButton2:
                                resposta = "1977";
                                break;
                            case R.id.radioButton3:
                                resposta = "1988";
                                break;
                            case R.id.radioButton4:
                                resposta = "2016";
                                break;
                        }
                        break;
                }
                break;

            case "historia":

                switch (qut) {
                    case 0:
                        switch (v.getId()) {
                            case R.id.radioButton5:
                                resposta = "José Dirceu";
                                break;
                            case R.id.radioButton6:
                                resposta = "Pedro Alvarez Cabral";
                                break;
                            case R.id.radioButton8:
                                resposta = "Lula";
                                break;
                            case R.id.radioButton9:
                                resposta = "Dilma";
                                break;
                        }
                        break;

                    case 1:
                        switch (v.getId()) {
                            case R.id.radioButton5:
                                resposta = "Guerra do Paraguai";
                                break;
                            case R.id.radioButton6:
                                resposta = "Guerra da secessão";
                                break;
                            case R.id.radioButton7:
                                resposta = "Guerra dos cem dias";
                                break;
                            case R.id.radioButton8:
                                resposta = "Guerra do Iraque";
                                break;
                        }
                        break;

                    case 2:
                        switch (v.getId()) {
                            case R.id.radioButton5:
                                resposta = "1840";
                                break;
                            case R.id.radioButton6:
                                resposta = "1952";
                                break;
                            case R.id.radioButton7:
                                resposta = "1964";
                                break;
                            case R.id.radioButton8:
                                resposta = "1862";
                                break;
                        }
                        break;

                    case 3:
                        switch (v.getId()) {
                            case R.id.radioButton5:
                                resposta = "V a X";
                                break;
                            case R.id.radioButton6:
                                resposta = "VI a XI";
                                break;
                            case R.id.radioButton7:
                                resposta = "VII a XII";
                                break;
                            case R.id.radioButton8:
                                resposta = "VIII a XIII";
                                break;
                        }
                        break;
                }
                break;

            case "politica":

                switch (qut) {
                    case 0:
                        switch (v.getId()) {
                            case R.id.radioButton9:
                                resposta = "José Dirceu";
                                break;
                            case R.id.radioButton10:
                                resposta = "Michel Temer";
                                break;
                            case R.id.radioButton11:
                                resposta = "Lula";
                                break;
                            case R.id.radioButton12:
                                resposta = "Dilma";
                                break;
                        }
                        break;

                    case 1:
                        switch (v.getId()) {
                            case R.id.radioButton9:
                                resposta = "PT";
                                break;
                            case R.id.radioButton10:
                                resposta = "PMDB";
                                break;
                            case R.id.radioButton11:
                                resposta = "DEM";
                                break;
                            case R.id.radioButton12:
                                resposta = "PDT";
                                break;
                        }
                        break;

                    case 2:
                        switch (v.getId()) {
                            case R.id.radioButton9:
                                resposta = "Super homem";
                                break;
                            case R.id.radioButton10:
                                resposta = "Renan Calheiros";
                                break;
                            case R.id.radioButton11:
                                resposta = "Ottomar Pinto";
                                break;
                            case R.id.radioButton12:
                                resposta = "Teresa Surita";
                                break;
                        }
                        break;

                    case 3:
                        switch (v.getId()) {
                            case R.id.radioButton9:
                                resposta = "Partido da Mulher";
                                break;
                            case R.id.radioButton10:
                                resposta = "PHN";
                                break;
                            case R.id.radioButton11:
                                resposta = "PSDB";
                                break;
                            case R.id.radioButton12:
                                resposta = "PMDB";
                                break;
                        }
                        break;
                }
                break;

        }
        return resposta;
    }

    public int acertou(String ass, int cont, View v) {

        int resposta = 0;

        switch (ass) {
            case "geografia":
                switch (cont) {

                    case 0:
                        if (v.getId() == R.id.radioButton1) {
                            resposta =  1;
                        } else {
                            resposta =  0;
                        }
                        break;
                    case 1:
                        if (v.getId() == R.id.radioButton1) {
                            resposta =  1;
                        } else {
                            resposta =  0;
                        }
                        break;
                    case 2:
                        if (v.getId() == R.id.radioButton2) {
                            resposta =  1;
                        } else {
                            resposta =  0;
                        }
                        break;
                    case 3:
                        if (v.getId() == R.id.radioButton4) {
                            resposta =  1;
                        } else {
                            resposta =  0;
                        }
                        break;
                    case 4:
                        if (v.getId() == R.id.radioButton3) {
                            resposta = 1;
                        } else {
                            resposta =  0;
                        }
                        break;
                }

            case "historia":
                switch (cont) {

                    case 0:
                        if (v.getId() == R.id.radioButton8) {
                            resposta = 1;
                        } else {
                            resposta =  0;
                        }
                        break;
                    case 1:
                        if (v.getId() == R.id.radioButton6) {
                            resposta =  1;
                        } else {
                            resposta =  0;
                        }
                        break;
                    case 2:
                        if (v.getId() == R.id.radioButton5) {
                            resposta =  1;
                        } else {
                            resposta =  0;
                        }
                        break;
                    case 3:
                        if (v.getId() == R.id.radioButton7) {
                            resposta =  1;
                        } else {
                            resposta =  0;
                        }
                        break;
                    case 4:
                        if (v.getId() == R.id.radioButton8) {
                            resposta =  1;
                        } else {
                            resposta =  0;
                        }
                        break;
                }

            case "politica":
                switch (cont) {

                    case 0:
                        if (v.getId() == R.id.radioButton11) {
                            resposta = 1;
                        } else {
                            resposta =  0;
                        }
                        break;
                    case 1:
                        if (v.getId() == R.id.radioButton10) {
                            resposta =  1;
                        } else {
                            resposta =  0;
                        }
                        break;
                    case 2:
                        if (v.getId() == R.id.radioButton10) {
                            resposta =  1;
                        } else {
                            resposta =  0;
                        }
                        break;
                    case 3:
                        if (v.getId() == R.id.radioButton10) {
                            resposta =  1;
                        } else {
                            resposta =  0;
                        }
                        break;
                    case 4:
                        if (v.getId() == R.id.radioButton12) {
                            resposta =  1;
                        } else {
                            resposta =  0;
                        }
                        break;
                }
        }
        return resposta;
    }
}