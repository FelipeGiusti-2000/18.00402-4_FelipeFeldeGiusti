package com.company;

public class Personagem {
    public static final String URL_PERSONAGEM = "www.pokeapi.com/api/v1/";
    //vantagem --agr quando precisar usar o URL base n precisa digitar td na mao
    //final é para que nao mexam
    private String nomeDoPersonagem;

    public Personagem(String url_personagem){
        this.nomeDoPersonagem = url_personagem;
    }
    public String getURL(){
        return URL_PERSONAGEM + this.nomeDoPersonagem;
    }
}
