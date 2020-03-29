package com.company;

public class JogadaLS {
    private String escolha, ganhoDe, percoDe, ganhoDe2, percoDe2;

    public static final String PEDRA = "pedra";
    public static final String TESOURA = "tesoura";
    public static final String PAPEL = "papel";
    public static final String LIZARD = "lizard";
    public static final String SPOCK = "spock";

    //Construtor do jogada

    public JogadaLS(String opcao){
        if(opcao.equals(this.PEDRA)){
            ganhoDe = this.TESOURA;
            ganhoDe2 = this.LIZARD;
            percoDe = this.PAPEL;
            percoDe2 = this.SPOCK;
        } else if(opcao.equals(this.PAPEL)){
            ganhoDe = this.PEDRA;
            ganhoDe2 = this.SPOCK;
            percoDe = this.TESOURA;
            percoDe2 = this.LIZARD;
        } else if(opcao.equals(this.TESOURA)){
            ganhoDe = this.PAPEL;
            ganhoDe2 = this.LIZARD;
            percoDe = this.PEDRA;
            percoDe2 = this.SPOCK;
        } else if(opcao.equals(this.LIZARD)){
            ganhoDe = this.PAPEL;
            ganhoDe2 = this.SPOCK;
            percoDe = this.PEDRA;
            percoDe2 = this.TESOURA;
        } else {
            ganhoDe = this.TESOURA;
            ganhoDe2 = this.PEDRA;
            percoDe = this.LIZARD;
            percoDe2 = this.PAPEL;
        }
        escolha = opcao;
    }

    public String getEscolha(){
        return this.escolha;
    }
    public String avaliar(JogadaLS jogadaLS){
        if(jogadaLS.getEscolha().equals(this.ganhoDe) || jogadaLS.getEscolha().equals(this.ganhoDe2)){
            return "Ganhei!";
        } else if(jogadaLS.getEscolha().equals(this.percoDe) || jogadaLS.getEscolha().equals(this.percoDe2)){
            return "Perdi!";
        }
        else{
            return "Empate!";
        }
    }
}
