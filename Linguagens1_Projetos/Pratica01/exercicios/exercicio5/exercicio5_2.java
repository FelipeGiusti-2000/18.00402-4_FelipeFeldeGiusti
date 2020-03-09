import java.util.Scanner;

public class exercicio5_2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int i, n, a, b, c, d, aux1,aux2, res;
        a = 1; b= 0;c=0;d=1;aux1=0;aux2=0;res = 0;

        System.out.println("n = ");
        n = scanner.nextInt();

        if(n <= 0){
            res = 0;
        }
        i = (n-1);
        while(i > 0){
            if( i%2 != 0){
                aux1 = d*b + c * a;
                aux2 = d*(b+a) + c * b;
                a = aux1;
                b = aux2;
            }
            aux1 = c^2 + d^2;
            aux2 = d*(2*c+d);
            c = aux1;
            d=aux2;
            i = i/2;
            res = a+b;
        }
        System.out.println("Para n = " + n +", resultado = " + res);
    }
} // Nao deu certo *rever depois*
