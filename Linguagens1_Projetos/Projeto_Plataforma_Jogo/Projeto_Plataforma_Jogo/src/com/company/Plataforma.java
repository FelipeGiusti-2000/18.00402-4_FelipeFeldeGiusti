package com.company;

import java.util.ArrayList;

public class Plataforma {
    private ArrayList<Conta> contas;
    private ArrayList<Jogo> jogos;

    public Plataforma() {
        contas = new ArrayList<>();
        jogos = new ArrayList<>();
    }

    public void addConta(Conta conta){
        contas.add(conta);
    }
    public ArrayList<Conta> getContas(){
        return contas;
    }
    public boolean addJogo(Jogo jogo){      //retorna falso se n conseguiu add
        if(!ehRepetido(jogo)) {
            jogos.add(jogo);
            return true;
        }
        else return false;
    }

    public ArrayList<Jogo> getJogos() {
        return jogos;
    }

    public boolean ehRepetido(Jogo jogo){       //Retorna true se a lista de jogos ter o jogo.
        if(jogos.contains(jogo)){
            return true;
        }
        else return false;
    }

    public String getInfoContas(){
        String resposta = "";
        resposta = String.format("{contas:[");
        for(Conta conta:contas){
            resposta += conta.getInfo() + ",";
        }
        resposta += "]}";

        return resposta;
    }
    public String getInfoJogos(){
        String resposta2 = "";
        resposta2 = String.format("{jogos:[");
        for(Jogo jogo:jogos){
            resposta2 += jogo.getInfo() + ",";
        }
        resposta2 += "]}";

        return resposta2;
    }
}
