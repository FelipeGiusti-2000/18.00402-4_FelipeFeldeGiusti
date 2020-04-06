/*package com.company;
import java.util.Scanner;

public class VisualizarPlataforma {

//    private static boolean continuar = true;
//    private static Usuario usuario;
//    private static Plataforma plataforma;
//    private static Conta conta;
//    private static Jogo jogo;
//    // eh mt ruim eu fazer tds esses statics?

    public static void rodarPlataforma() {
        boolean continuar = true;
        Plataforma plataforma = new Plataforma();


        do{
            int escolha;
            menuInicio();
            Scanner scanner = new Scanner(System.in);
            escolha = Integer.parseInt(scanner.nextLine());

            switch(escolha){
                case 1:     //criar nova conta
                    Usuario user = criarUsuario();
                    Conta conta = new Conta(user);
                    plataforma.addConta(conta);
                    break;
                case 2:     //criar novo jogo
                    criarJogo();
                    break;
                case 3:     //entrar na conta
                    entrarConta();
                    break;

                case 4:     //listar todos jogos

                    break;
                case 5:     //sair
                    break;
                default:
                    break;
            }



        }while(continuar);

    }
    public static void menuInicio(){
        System.out.println("Menu:\n");
        System.out.println("1- Criar nova conta\n");
        System.out.println("2- Criar novo jogo\n");
        System.out.println("3- Entrar na sua conta\n");
        System.out.println("4- Ver jogos ja criados\n");
        System.out.println("5- Sair\n");
    }
    public static void menuConta(){
        System.out.println("Menu:\n");
        System.out.println("1- Adicionar jogo existente:\n");
        System.out.println("2- Adicionar creditos:\n");
        System.out.println("3- Ver jogos:\n");
        System.out.println("4- Sair da sua conta:\n");

    }

    public static Usuario criarUsuario(){
        System.out.println("Informe nick, a senha e o email:");
        Scanner scanner = new Scanner(System.in);
        String nick,senha,email;
        nick = scanner.nextLine();
        senha = scanner.nextLine();
        email = scanner.nextLine();
        Usuario usuario = new Usuario(nick, senha, email);
        return usuario;

    }
    public static void criarJogo(){
        Scanner scanner = new Scanner(System.in);
        String nome, genero, descricao;
        System.out.println("Informe nome, genero, descricao:");
        nome = scanner.nextLine();
        genero = scanner.nextLine();
        descricao = scanner.nextLine();

        Jogo j1 = new Jogo(nome, genero, descricao);
        Plataforma plat = new Plataforma();
        plat.addJogo(j1);


    }
    public static void entrarConta(){
        Scanner scanner = new Scanner(System.in);
        boolean teste = true;
        while(teste) {
            System.out.println("Digite seu nick e senha: ");
            String nick, senha;
            nick = scanner.nextLine();
            senha = scanner.nextLine();
            if(plataforma.getContas().contains(.getNickname().equals(nick))) {
                System.out.println("Deu certo");
//            }
//                    if (usuario.validarSenha(senha)) {
//                        teste = false;
//                }
//            }

            }
            else System.out.println("Senha ou usuario incorretos.");
        }
        scanner.close();
    }

}
//
///
///
///
///
///
/*
Scanner scanner = new Scanner(System.in);
        String aux;
        boolean continuarContas =true, continuarJogos= true;
        Plataforma plataforma = new Plataforma();
// Pq tenho criar a plataforma fora do while? Se crio dentro n ta adicionando as contas

        while(continuarContas){

            System.out.println("Informe nick:");
            String nick;
            nick = scanner.nextLine();
            Usuario usuario = new Usuario(nick, "123", "");
            Conta conta = new Conta(usuario);

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
 */
