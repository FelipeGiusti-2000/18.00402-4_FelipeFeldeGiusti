package com.company;
// cópia do código de Prof. Murilo Zanini
import java.util.Scanner;

public class Jogo {
    private Jogador j1,j2;

    public void jogar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do Jogador 1:");
        String nome = scanner.nextLine();
        System.out.println("Informe a jogada do Jogador 1:");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");
        int escolha = Integer.parseInt(scanner.nextLine());
        switch(escolha){
            case 1:
                j1 = new Jogador(nome, Jogada.PEDRA); break;
            case 2:
                j1 = new Jogador(nome, Jogada.PAPEL); break;
            case 3:
                j1 = new Jogador(nome, Jogada.TESOURA); break;
        }

        System.out.println("Informe o nome do Jogador 2:");
        nome = scanner.nextLine();
        System.out.println("Informe a jogada do Jogador 2:");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");
        escolha = Integer.parseInt(scanner.nextLine());
        switch(escolha){
            case 1:
                j2 = new Jogador(nome, Jogada.PEDRA); break;
            case 2:
                j2 = new Jogador(nome, Jogada.PAPEL);break;
            case 3:
                j2 = new Jogador(nome, Jogada.TESOURA); break;
        }
        System.out.println("J1 - " + j1.competicao(j2) +"- J2");
    }
}
