package giusti.felipe.models;

import giusti.felipe.enums.ProfissoesEnum;
import giusti.felipe.enums.RacasEnum;

public class FichaDePersonagem {
    private static int id;
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
        id++;
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

    public static int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public RacasEnum getRaca() {
        return raca;
    }

    public ProfissoesEnum getProfissao() {
        return profissao;
    }

    public int getMana() {
        return mana;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getAtaqueMagico() {
        return ataqueMagico;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getDefesaMagica() {
        return defesaMagica;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getDestreza() {
        return destreza;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public int getNivelAtual() {
        return nivelAtual;
    }

    @Override
    public String toString() {
        return "FichaDePersonagem{" +
                "nome='" + nome + '\'' +
                ", raca=" + raca +
                ", profissao=" + profissao +
                ", mana=" + mana +
                ", ataque=" + ataque +
                ", ataqueMagico=" + ataqueMagico +
                ", defesa=" + defesa +
                ", defesaMagica=" + defesaMagica +
                ", velocidade=" + velocidade +
                ", destreza=" + destreza +
                ", experiencia=" + experiencia +
                ", nivelAtual=" + nivelAtual +
                '}';
    }
}
