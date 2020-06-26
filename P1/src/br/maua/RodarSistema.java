package br.maua;

import br.maua.models.Usuario;

import java.util.Scanner;

import static java.time.Clock.system;

public class RodarSistema {
    private static Scanner scanner;

    public static void run(){
        //Rodar o menu aqui + opcoes
        scanner = new Scanner(System.in);
        boolean continuar = true;

        Usuario usuario = criarUsuario();

        do{
            exibirMenu();
            int escolha = Integer.parseInt(scanner.nextLine());
            switch(escolha){
                case 1:     //Nova venda


            }
        }while(continuar);

    }

    private static void exibirMenu(){
        System.out.println("Pizzaria o Rato que Ri:" +
                "1 - Nova venda" +
                "2 - Verificar pedidos" +
                "3 - Alterar pedidos" +
                "0 - Sair");
    }
    private static Usuario criarUsuario(){
        String nome, email, senha;
        System.out.println("\nDigite o nome do usuário: ");
        nome = scanner.nextLine();
        System.out.println("\nDigite o email do usuário: ");
        email = scanner.nextLine();
        System.out.println("\nDigite a senha do usuário: ");
        senha = scanner.nextLine();
        return new Usuario(nome, email, senha);
    }
}
