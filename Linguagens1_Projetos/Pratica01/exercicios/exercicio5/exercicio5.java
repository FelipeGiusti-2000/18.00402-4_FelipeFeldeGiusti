import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int i, n, na, naa, res;
        na = 0;
        naa = 1;
        res = 0;

        System.out.println("n = ");
        n = scanner.nextInt();
        if(n==0){
            res = 0;
        }
        for(i=0;i<n;i++){
            
            res = naa + na;
            naa = na;
            na = res;
            //System.out.println("res " + (i+1) + " = " +res);
        }
        System.out.println("Para n = " + n +", resultado = " + res);
    }
}