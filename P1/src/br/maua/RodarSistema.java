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
        Usuario usuario = new Usuario("Usuario","usuario@email.com","123456");

        do{
            exibirMenu();
            int escolha = Integer.parseInt(scanner.nextLine());
            switch(escolha){
                case 0:     // Sair
                    continuar = false;
                    break;
                case 1:     // Nova venda
                    if(usuario.verificarSenha(informarSenha())){
                        Pedido pedido = criarPedido();
                        //Pedido pedido = new Pedido("bife",12.38,FormaDePagamento.DINHEIRO);
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
                        Estado estado = informaEstado();
                        sistema.alterarPedido(idAlterar, estado);
                    }
                    else{
                        System.out.println("Senha incorreta.");
                    }
                    break;
                default:
                    System.out.println("Digite um dos números do menu!");
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
        FormaDePagamento formaDePagamento = informarFormaDePagamento();

        return new Pedido(descricao,valor,formaDePagamento);
    }
    private static String informarSenha(){
        System.out.println("Digite sua senha: ");
        return scanner.nextLine();
    }
    private static FormaDePagamento informarFormaDePagamento(){
        System.out.println("Forma de pagamento:\n" +
                "1 - Dinheiro\n" +
                "2 - Debito\n" +
                "3 - Credito\n" +
                "4 - Vale alimentacao\n" +
                "5 - Vale refeicao");

        FormaDePagamento formaPag = null;   // inicializacao da formaPag
        int opcao = Integer.parseInt(scanner.nextLine());
        switch(opcao){
            case 1:
                formaPag = FormaDePagamento.DINHEIRO; break;
            case 2:
                formaPag = FormaDePagamento.DEBITO; break;
            case 3:
                formaPag = FormaDePagamento.CREDITO; break;
            case 4:
                formaPag = FormaDePagamento.VALE_ALIMENTACAO; break;
            case 5:
                formaPag = FormaDePagamento.VALE_REFEICAO; break;
        }
        return formaPag;
    }
    private static Estado informaEstado(){
        System.out.println("Estado:\n" +
                "1 - Realizado\n" +
                "2 - Preparacao\n" +
                "3 - Saiu para entrega\n" +
                "4 - Devolvido");

        Estado estado = null;       // inicializando variavel
        int opcao = Integer.parseInt(scanner.nextLine());
        switch (opcao){
            case 1:
                estado = Estado.REALIZADO; break;
            case 2:
                estado = Estado.PREPARACAO; break;
            case 3:
                estado = Estado.SAIU_PARA_ENTREGA; break;
            case 4:
                estado = Estado.DEVOLVIDO; break;
            default:
                System.out.println("Numero invalido");
        }
        return estado;
    }
}
