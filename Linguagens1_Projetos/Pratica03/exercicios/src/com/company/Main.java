package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        JogoLS jogoLS = new JogoLS();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tipo de jogo que deseja jogar: ");
        System.out.println("1- Pedra, Papel, Tesoura");
        System.out.println("2- Pedra, Papel, Tesoura, Lizard, Spock");
        int tipo = Integer.parseInt(scanner.nextLine());

        if(tipo == 1){
            jogo.jogar();
        }
        else if(tipo == 2){
            jogoLS.jogar();
        }
        else
            System.out.println("Para escolher o tipo de jogo digite 1 ou 2");
    }
}