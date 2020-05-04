package br.maua;
import pacote.QualquerCoisa;
import pacote.Dog;
//import pacote.*; //importa td do pacote, mas fica ruim para ler

public class Main {

    public static void main(String[] args) {
//OU fazer assim sem o import pacote. :
        //pacote.QualquerCoisa meuQualquerCoisa = new pacote.QualquerCoisa();

        QualquerCoisa meuQualquerCoisa;// = new QualquerCoisa();
        Dog dog1 = new pacote.Dog(38);
        Dog dog2 = new pacote.Dog(3);

        dog1.bark();
        meuQualquerCoisa.ola();
        dog2.bark();
    }
}
