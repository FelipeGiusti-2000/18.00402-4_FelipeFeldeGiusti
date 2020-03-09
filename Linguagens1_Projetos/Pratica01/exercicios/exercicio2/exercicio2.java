import java.util.Scanner;

public class exercicio2{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String nome1,nome2;
        int idade1,idade2;

        System.out.println("Digite o primeiro nome: ");
        nome1 = scanner.nextLine();
        System.out.println("Digite o segundo nome: ");
        nome2 = scanner.nextLine();
        // ERRO: Quando fiz nome1, idade1, nome2, idade2, o programa pulou o input do nome 2. pq?
        System.out.println("Digite a primeira idade: ");
        idade1 = scanner.nextInt();
        System.out.println("Digite a segunda idade: ");
        idade2 = scanner.nextInt();

        if(idade1 >= idade2){
            System.out.println("A diferença das idades é: " + (idade1-idade2));
        }
        else{
            System.out.println("A diferença das idades é: " + (idade2-idade1));
        }

    }
}