package br.maua.projeto.teste;

import br.maua.projeto.models.Jogo;

public class TesteJogo {
    public static void main(String[] args) {
        Jogo jogo = new Jogo("PC","dota2");
        // Aqui nao precisa do toString pq ele ja faz sozinho quando soma c/ string
        System.out.println("Jogo:" + jogo.toString());


    }
}
