import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int i,soma;
        String n;
        soma = 0;
        i = 0;

        System.out.println("Digite um número: ");
        n = scanner.nextLine();

        while(i < n.length()){
            soma += Character.getNumericValue(n.charAt(i));
            
            i++;   
        }
        System.out.println("A soma dos algarismos é: " + soma);

    }
}