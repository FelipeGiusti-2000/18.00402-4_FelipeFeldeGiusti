package com.company;

public class Jogador {
    private String nome;
    private Jogada jogada;
    private JogadaLS jogadaLS;
// Para jogo de RPS: cópia do código de Prof. Murilo Zanini
    public Jogador(String nome, String escolha) {
        this.nome = nome;
        jogada = new Jogada(escolha);
        jogadaLS = new JogadaLS(escolha);
    }

    public Jogada getJogada() {
        return jogada;
    }

    public String competicao(Jogador player2) {
        return jogada.avaliar(player2.getJogada());
    }
    //Para jogo de RPSLS:

    public JogadaLS getJogadaLS() {
        return jogadaLS;
    }

    public String competicaoLS(Jogador player2) {
        return jogadaLS.avaliar(player2.getJogadaLS());
    }
}
