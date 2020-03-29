package com.company;

import java.util.Scanner;

public class JogoLS {
    private Jogador j1,j2;

    public void jogar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do Jogador 1:");
        String nome = scanner.nextLine();
        System.out.println("Informe a jogada do Jogador 1:");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");
        System.out.println("4 - Lizard");
        System.out.println("5 - Spock");
        int escolha = Integer.parseInt(scanner.nextLine());
        switch(escolha){
            case 1:
                j1 = new Jogador(nome, JogadaLS.PEDRA); break;
            case 2:
                j1 = new Jogador(nome, JogadaLS.PAPEL); break;
            case 3:
                j1 = new Jogador(nome, JogadaLS.TESOURA); break;
            case 4:
                j1 = new Jogador(nome, JogadaLS.LIZARD); break;
            case 5:
                j1 = new Jogador(nome, JogadaLS.SPOCK); break;
        }

        System.out.println("Informe o nome do Jogador 2:");
        nome = scanner.nextLine();
        System.out.println("Informe a jogada do Jogador 2:");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");
        System.out.println("4 - Lizard");
        System.out.println("5 - Spock");
        escolha = Integer.parseInt(scanner.nextLine());
        switch(escolha){
            case 1:
                j2 = new Jogador(nome, JogadaLS.PEDRA); break;
            case 2:
                j2 = new Jogador(nome, JogadaLS.PAPEL);break;
            case 3:
                j2 = new Jogador(nome, JogadaLS.TESOURA); break;
            case 4:
                j2 = new Jogador(nome, JogadaLS.LIZARD); break;
            case 5:
                j2 = new Jogador(nome, JogadaLS.SPOCK); break;
        }
        System.out.println("J1 - " + j1.competicaoLS(j2) +"- J2");
    }
}
