package br.maua;

import br.maua.enums.Estado;
import br.maua.enums.FormaDePagamento;
import br.maua.models.Pedido;
import br.maua.models.Sistema;
import br.maua.models.Usuario;

import java.util.Scanner;


public class RodarSistema {
    private static Scanner scanner;
    private static Sistema sistema;

    public static void run(){
        scanner = new Scanner(System.in);
        sistema = new Sistema();
        boolean continuar = true;

        //Usuario usuario = criarUsuario();
        Usuario usuario = new Usuario("Naruto","naruto@email.com","123456");

        do{
            exibirMenu();
            int escolha = Integer.parseInt(scanner.nextLine());
            switch(escolha){
                case 0:     // Sair
                    continuar = false;
                    break;
                case 1:     // Nova venda
                    if(usuario.verificarSenha(informarSenha())){
                        //Pedido pedido = criarPedido();
                        Pedido pedido = new Pedido("bife",12.38,FormaDePagamento.DINHEIRO);
                        sistema.addPedido(pedido);
                    }
                    else{
                        System.out.println("Senha incorreta.");
                    }
                    break;
                case 2:     // Verificar pedidos
                    for (Pedido pedido: sistema.getPedidos()){
                        System.out.println(pedido.toString());
                    }
                    break;
                case 3:     // Alterar pedidos
                    if(usuario.verificarSenha(informarSenha())){
                        System.out.println("Digite o id do pedido a ser alterado: ");
                        String idAlterar = scanner.nextLine();
                        //* Metodo para pegar estado aqui *
                        sistema.alterarPedido(idAlterar, Estado.SAIU_PARA_ENTREGA);
                    }
                    else{
                        System.out.println("Senha incorreta.");
                    }
                    break;
            }
        }while(continuar);
        scanner.close();

    }

    private static void exibirMenu(){
        System.out.println("Pizzaria o Rato que Ri:\n" +
                "1 - Nova venda\n" +
                "2 - Verificar pedidos\n" +
                "3 - Alterar pedidos\n" +
                "0 - Sair");
    }
    private static Usuario criarUsuario(){
        String nome, email, senha;
        System.out.println("Digite o nome do usuário: ");
        nome = scanner.nextLine();
        System.out.println("Digite o email do usuário: ");
        email = scanner.nextLine();
        System.out.println("Digite a senha do usuário: ");
        senha = scanner.nextLine();
        return new Usuario(nome, email, senha);
    }
    private static Pedido criarPedido(){
        String descricao;
        double valor;

        System.out.println("Digite a discriacao do pedido: ");
        descricao = scanner.nextLine();
        System.out.println("Digite o valor do pedido: ");
        valor = Double.parseDouble(scanner.nextLine());

        return new Pedido(descricao,valor,FormaDePagamento.DINHEIRO);
    }
    private static String informarSenha(){
        String senha;
        System.out.println("Digite sua senha: ");
        return scanner.nextLine();
    }
}
