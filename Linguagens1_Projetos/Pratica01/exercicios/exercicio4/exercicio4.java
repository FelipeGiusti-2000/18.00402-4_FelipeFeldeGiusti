import java.util.Scanner;

import sun.security.util.Length;

public class exercicio4{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String pal, ipal="";
        int i;

        System.out.println("Informe a palavra:");
        pal = scanner.nextLine();
        
        for(i=0; i < pal.length(); i++){
            char c = pal.charAt(pal.length()-(i+1));
            Character.toString(c);
            ipal += c;
        }
        if(pal.equals(ipal)){
            System.out.println("É um palindromo");
        }
        else{
            System.out.println("Não é um palindromo");
        }
    }
}