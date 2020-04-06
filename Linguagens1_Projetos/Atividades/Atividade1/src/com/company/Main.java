//Felipe Felde Giusti , RA:18.00402-4
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome1,nome2,nome3;
        System.out.println("Informe o nome do usuario 1:");
        nome1 = scanner.nextLine();
        System.out.println("Informe o nome do usuario 2:");
        nome2 = scanner.nextLine();
        System.out.println("Informe o nome do usuario 3:");
        nome3 = scanner.nextLine();

        Usuario user1 = new Usuario(nome1,"123","@");
        Usuario user2 = new Usuario(nome2,"123","@");
        Usuario user3 = new Usuario(nome3,"123","@");

        Conta c1 = new Conta(user1, 1000);
        Conta c2 = new Conta(user2, 250);
        Conta c3 = new Conta(user3, 3000);

        Transacao transacao = new Transacao();
        String qrCode;

        System.out.println("Estado Inicial:");
        System.out.println(String.format("Nome Usuario: %s - Saldo: %.2f",c1.getUsuario().getNome(),c1.getSaldo()));
        System.out.println(String.format("Nome Usuario: %s - Saldo: %.2f",c2.getUsuario().getNome(),c2.getSaldo()));
        System.out.println(String.format("Nome Usuario: %s - Saldo: %.2f",c3.getUsuario().getNome(),c3.getSaldo()));

        qrCode = transacao.criarQRCode(c1,250.00);

        transacao.pagar(c2,c1,qrCode);
        transacao.pagar(c3,c1,qrCode);
        transacao.pagar(c2,c1,qrCode);

        qrCode = transacao.criarQRCode(c2,1000.00);
        transacao.pagar(c3,c2,qrCode);

        System.out.println("Estado Final:");
        System.out.println(String.format("Nome Usuario: %s - Saldo: %.2f",c1.getUsuario().getNome(),c1.getSaldo()));
        System.out.println(String.format("Nome Usuario: %s - Saldo: %.2f",c2.getUsuario().getNome(),c2.getSaldo()));
        System.out.println(String.format("Nome Usuario: %s - Saldo: %.2f",c3.getUsuario().getNome(),c3.getSaldo()));


    }
}
