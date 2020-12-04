package giusti.felipe.models;

import giusti.felipe.enums.ProfissoesEnum;
import giusti.felipe.enums.RacasEnum;

public class FichaDePersonagem {
    private String nome;
    private RacasEnum raca;
    private ProfissoesEnum profissao;
    private int mana;
    private int ataque;
    private int ataqueMagico;
    private int defesa;
    private int defesaMagica;
    private int velocidade;
    private int destreza;
    private int experiencia;
    private int nivelAtual;

    public FichaDePersonagem(String nome, RacasEnum raca, ProfissoesEnum profissao, int mana, int ataque, int ataqueMagico, int defesa, int defesaMagica, int velocidade, int destreza, int experiencia, int nivelAtual) {
        this.nome = nome;
        this.raca = raca;
        this.profissao = profissao;
        this.mana = mana;
        this.ataque = ataque;
        this.ataqueMagico = ataqueMagico;
        this.defesa = defesa;
        this.defesaMagica = defesaMagica;
        this.velocidade = velocidade;
        this.destreza = destreza;
        this.experiencia = experiencia;
        this.nivelAtual = nivelAtual;
    }
}
