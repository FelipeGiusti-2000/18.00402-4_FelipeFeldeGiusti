import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String RA,nome,telefone,email,idade;
        

		System.out.println("Informe seu R.A.:");
        RA = scanner.nextLine();
        System.out.println("Informe seu nome completo:");
        nome = scanner.nextLine();
        System.out.println("Informe seu telefone:");
        telefone = scanner.nextLine();
        System.out.println("Informe seu email:");
        email = scanner.nextLine();
        System.out.println("Informe sua idade:");
        idade = scanner.nextLine();
        
        System.out.println("R.A.: " + RA);
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("email: " + email);
        System.out.println("Idade: " + idade);
    }
}