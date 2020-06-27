package br.maua;

import br.maua.enums.Estado;
import br.maua.enums.FormaDePagamento;
import br.maua.models.Pedido;
import br.maua.models.Sistema;
import br.maua.models.Usuario;

import java.util.Scanner;

/**
 * Classe para rodar o sistema principal, onde o usuário pode interagir com o sistema
 * @author Felipe Felde Giusti
 * @since 21/06/2020
 * @version 1.0
 */
public class RodarSistema {
    private static Scanner scanner;
    private static Sistema sistema;

    /**
     * Método que roda o sistema principal
     */
    public static void run(){
        scanner = new Scanner(System.in);
        sistema = new Sistema();
        boolean continuar = true;
        int escolha = -1;

        //Usuario usuario = criarUsuario();
        Usuario usuario = new Usuario("Usuario","usuario@email.com","123456");

        do{
            exibirMenu();
            try {
                escolha = Integer.parseInt(scanner.nextLine());
            }catch(Exception NumberFormatException){
                // mando mensagem sobre ela usando o default
            }
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
                    System.out.println("Lista de pedidos:");
                    for (Pedido pedido: sistema.getPedidos()){
                        System.out.println(pedido.toString());
                    }
                    System.out.println("");     //dá um espaço
                    break;
                case 3:     // Alterar pedidos
                    if(usuario.verificarSenha(informarSenha())) {
                        System.out.println("Digite o id do pedido a ser alterado: ");
                        String idAlterar = scanner.nextLine();
                        if(!verificarId(idAlterar)){
                            System.out.println("Id inválido!");
                            break;
                        }
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

    /**
     * Método que exibe um menu no console
     */
    private static void exibirMenu(){
        System.out.println("Pizzaria o Rato que Ri:\n" +
                "1 - Nova venda\n" +
                "2 - Verificar pedidos\n" +
                "3 - Alterar pedidos\n" +
                "0 - Sair");
    }

    /**
     * Método para inputar informações de um novo usuário
     * @return novo usuário do tipo Usuario
     */
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

    /**
     * Método que cria um novo pedido baseado nos inputs de um usuário
     * @return novo pedido do tipo Pedido
     */
    private static Pedido criarPedido(){
        String descricao;
        double valor = 0;   // Inicializando variavel

        System.out.println("Digite a descriacao do pedido: ");
        descricao = scanner.nextLine();
        boolean loop = true;
        while(loop){
            try {
                System.out.println("Digite o valor do pedido no formato X.XX:");
                valor = Double.parseDouble(scanner.nextLine());
                loop = false;

            }catch (Exception NumberFormatException) {
                System.out.println("Digite um número no formato X.XX");
            }
        }

        FormaDePagamento formaDePagamento = informarFormaDePagamento();

        return new Pedido(descricao,valor,formaDePagamento);
    }

    /**
     * Método para inputar uma senha
     * @return String que se refere a uma senha
     */
    private static String informarSenha(){
        System.out.println("Digite sua senha: ");
        return scanner.nextLine();
    }

    /**
     * Método para escolher a forma de pagamento
     * @return Enumeração do tipo FormaDePagamento que informa a forma de pagamento
     */
    private static FormaDePagamento informarFormaDePagamento(){
        // inicialização das variáveis:
        int opcao = -1;
        FormaDePagamento formaDePagamento = null;
        boolean loop = true;
        //loop:
        while(loop){
            System.out.println("Forma de pagamento:\n" +
                    "1 - Dinheiro\n" +
                    "2 - Debito\n" +
                    "3 - Credito\n" +
                    "4 - Vale alimentacao\n" +
                    "5 - Vale refeicao");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
                formaDePagamento = FormaDePagamento.values()[opcao - 1];
                loop = false;
            }catch (NumberFormatException | ArrayIndexOutOfBoundsException exception){
                System.out.println("Digite um número presente no menu");
            }
        }

        return formaDePagamento;
    }

    /**
     * Método para escolher o estado do pedido
     * @return Enumeração do tipo Estado que informa o estado do pedido
     */
    private static Estado informaEstado(){
        //inicialização das variáveis:
        int opcao = -1;
        Estado estado = null;
        boolean loop = true;
        //loop:
        while(loop){
            System.out.println("Estado:\n" +
                    "1 - Realizado\n" +
                    "2 - Preparacao\n" +
                    "3 - Saiu para entrega\n" +
                    "4 - Devolvido");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
                estado = Estado.values()[opcao - 1];
                loop = false;
            }catch (NumberFormatException | ArrayIndexOutOfBoundsException exception){
                System.out.println("Digite um número presente no menu");
            }
        }
        return estado;
    }

    /**
     * Método para verificar se um id está na lista de pedidos
     * @param id id a ser testado
     * @return true se o id é um id válido (é um pedido na lista)
     */
    private static boolean verificarId(String id){
        boolean cond = false;
        for (Pedido pedido:sistema.getPedidos()) {
            if(pedido.getId().equals(id)){
                cond = true;
                break;
            }
        }
        return cond;
    }
}