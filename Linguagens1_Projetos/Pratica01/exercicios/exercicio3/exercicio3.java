import java.util.Scanner;

public class exercicio3{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String user,senha,tSenha,tUser;
        
        System.out.println("Informe o usuário: ");
        user = scanner.nextLine();
        System.out.println("Informe a senha: ");
        senha = scanner.nextLine();

        do {
            System.out.println("Teste:");
            System.out.println("Informe o usuário: ");
            tUser = scanner.nextLine();
            System.out.println("Informe a senha: ");
            tSenha = scanner.nextLine();
            if(!tSenha.equals(senha) || !tUser.equals(user)){
                System.out.println("Senha e/ou usuário inválidos");
            }

        } while (!tSenha.equals(senha) || !tUser.equals(user));
        
    }
}