package br.maua.projeto.teste;

import br.maua.projeto.models.Jogo;
import br.maua.projeto.models.ListaDeJogos;

public class TesteLista {
    public static void main(String[] args) {
        ListaDeJogos jogos = new ListaDeJogos();

        System.out.println("Lista Atual: " + jogos);

        Jogo jogo1 = new Jogo("PC", "osu!");
        Jogo jogo2 = new Jogo("PC", "Halo");
        Jogo jogo3 = new Jogo("PC","Campo minado");

        jogos.addJogo(jogo1);
        jogos.addJogo(jogo2);
        jogos.addJogo(jogo3);

        System.out.println("Lista Atual: " + jogos);
    }
}
