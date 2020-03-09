import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n1,n2,produto,soma,i;
        soma = 0; produto = 1;
        
        System.out.println("Digite o valor inicial: ");
        n1 = scanner.nextInt();
        System.out.println("Digite o valor final: ");
        n2 = scanner.nextInt();

        for(i=0;i<=(n2-n1);i++){ //faz o somatorio e o produto entre os valores do intervalo
            soma += (n1+i);
            produto = produto * (n1+i);
        }
        System.out.println("Somatório: "+soma);
        System.out.println("Produto: "+produto);
    }
}