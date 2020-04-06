package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    private static int indexConta;
    public static void main(String[] args) {
        //VisualizarPlataforma.rodarPlataforma();


        Scanner scanner = new Scanner(System.in);
        boolean continuarContas = true, continuarEscolhas = true;
        Plataforma plataforma = new Plataforma();
        int escolha;


        while (continuarContas) {
            while (continuarEscolhas) {
                System.out.println("Menu:\n");
                System.out.println("1- Criar nova conta\n");
                System.out.println("2- Criar novo jogo\n");
                System.out.println("3- Listar todos os jogos\n");
                System.out.println("4- Entrar na conta\n");

                escolha = Integer.parseInt(scanner.nextLine());

                switch (escolha) {
                    case 1:     //criar nova conta
                        System.out.println("Informe nick, a senha e o email:");
                        String nick, senha, email;
                        nick = scanner.nextLine();
                        senha = scanner.nextLine();
                        email = scanner.nextLine();
                        Usuario usuario = new Usuario(nick, senha, email);
                        Conta conta = new Conta(usuario);
                        plataforma.addConta(conta);
                        break;

                    case 2:     //criar novo jogo
                        String nome, genero, descricao;
                        System.out.println("Informe nome, genero, descricao:");
                        nome = scanner.nextLine();
                        genero = scanner.nextLine();
                        descricao = scanner.nextLine();

                        Jogo j1 = new Jogo(nome, genero, descricao);
                        plataforma.addJogo(j1);
                        break;
                    case 3:                 //listar jogos
                        System.out.println("jogos da plataforma: " + plataforma.getInfoJogos());
                        break;

                    case 4:
                        System.out.println("Entrar na conta:");
                        System.out.println("Informe nick");
                        nick = scanner.nextLine();
                        Usuario userTeste = new Usuario(nick, "123", "");
                        Conta contaTeste = new Conta(userTeste);
                        for (int i = 0; i < plataforma.getContas().size(); i++) {
                            if (plataforma.getContas().get(i).getUser().getNickname().equals(nick)) {
                                continuarEscolhas = false;
                                Main.indexConta = i;
                            }
                        }
                        break;

                    default:
                        System.out.println("Digite um numero de 1 a 4");
                        break;
                }
            }
            Conta contaAcessada = new Conta(plataforma.getContas().get(Main.indexConta).getUser());
            System.out.println("Menu da conta:\n");
            System.out.println("1- adicionar jogo\n");
            System.out.println("2- ver info\n");
            System.out.println("3- Sair\n");

            escolha = Integer.parseInt(scanner.nextLine());
            switch (escolha) {
                case 1:     //add jogo na conta
                    System.out.println("Escolha um jogo para adicionar:");
                    String nomeJogo = scanner.nextLine();
                    for (int i = 0; i < plataforma.getJogos().size(); i++){
                        if(plataforma.getJogos().get(i).getNome().equals(nomeJogo)){
                            System.out.println("Jogo adicionado.");
                            contaAcessada.addJogo(plataforma.getJogos().get(i));

                        }
                    }
                    break;

                case 2:         //ver info da conta
                    contaAcessada.getInfo();
                    break;

                case 3:
                    continuarContas = false;
                    break;

                default:
                    System.out.println("Digite um numero entre 1 e 3");break;
            }

        }
        scanner.close();
    }
}
            /*
            System.out.println("Informe nick:");
            String nick;
            nick = scanner.nextLine();

            System.out.println("Dados da conta:" + conta.getInfo());
            conta.addCreditos(50.00);

            System.out.println("Deseja adicionar um jogo? (Y)/(N)");
            aux = scanner.nextLine();
            if(aux.equalsIgnoreCase("Y")){
                continuarJogos = true;
            }
            else continuarJogos = false;
            while(continuarJogos){
                String nome, genero, descricao;
                System.out.println("Informe nome, genero, descricao:");
                nome = scanner.nextLine();
                genero = scanner.nextLine();
                descricao = scanner.nextLine();

                Jogo j1 = new Jogo(nome, genero, descricao);
                System.out.println("J1:" + j1.getInfo());
                conta.addJogo(j1);

                System.out.println("Deseja adicionar outro jogo? (Y)/(N)");
                aux = scanner.nextLine();
                if(aux.equalsIgnoreCase("Y")){
                    continuarJogos = true;
                }
                else continuarJogos = false;
            }

            System.out.println("Dados da conta:" + conta.getInfo());

            plataforma.addConta(conta);
            System.out.println("Dados da plataforma:" + plataforma.getInfo());

            System.out.println("Deseja adicionar uma nova conta? (Y)/(N)");
            aux = scanner.nextLine();
            if(aux.equalsIgnoreCase("Y")){
                continuarContas = true;
            }
            else continuarContas = false;
        }



        /* codigo de aula
        System.out.println("Informe nome, genero, descricao:");
        nome = scanner.nextLine();
        genero = scanner.nextLine();
        descricao = scanner.nextLine();

        Jogo j1 = new Jogo(nome, genero, descricao);
        System.out.println("J1:" + j1.getInfo());

        System.out.println("Informe nick:");
        String nick;
        nick = scanner.nextLine();
        Usuario usuario = new Usuario(nick, "123", "");
        Conta conta = new Conta(usuario);
        System.out.println("Dados da conta:" + conta.getInfo());
        conta.addCreditos(50.00);
        for(int i = 0; i < 5; i++)
            conta.addJogo(j1);
        System.out.println("Dados da conta:" + conta.getInfo());

         */
