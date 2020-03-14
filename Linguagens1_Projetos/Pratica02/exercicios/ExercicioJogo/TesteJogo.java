package ExercicioJogo;
import java.util.Scanner;

public class TesteJogo {
    public static void main(String[] args) {
        Jogos jogos;
        jogos = new Jogos();
        jogos.j1 = new Jogador();
        jogos.j2 = new Jogador();
        int tipoDeJogo;
        boolean continua = true;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero do tipo de jogo:\n1. RPS \n2. RPSLS");
        tipoDeJogo = scanner.nextInt();
        scanner.nextLine();

        if(tipoDeJogo == 1){
            while(continua){ //jogo continua ate alguem ganhar
                System.out.println("Digite o nome do primeiro jogador: ");
                jogos.j1.nome = scanner.nextLine();
                System.out.println("Digite a jogada do primeiro jogador: ");
                jogos.j1.jogada = scanner.nextLine();
        
                System.out.println("Digite o nome do segundo jogador: ");
                jogos.j2.nome = scanner.nextLine();
                System.out.println("Digite a jogada do segundo jogador: ");
                jogos.j2.jogada = scanner.nextLine();
        
                continua = jogos.jogoRPS(jogos.j1 ,jogos.j2);
                
                
            }
        }
         else if(tipoDeJogo == 2){
            while(continua){ //jogo continua ate alguem ganhar
                System.out.println("Digite o nome do primeiro jogador: ");
                jogos.j1.nome = scanner.nextLine();
                System.out.println("Digite a jogada do primeiro jogador: ");
                jogos.j1.jogada = scanner.nextLine();
        
                System.out.println("Digite o nome do segundo jogador: ");
                jogos.j2.nome = scanner.nextLine();
                System.out.println("Digite a jogada do segundo jogador: ");
                jogos.j2.jogada = scanner.nextLine();
        
               continua = jogos.jogoRPSLS(jogos.j1 ,jogos.j2);
            }
        }
    }
}