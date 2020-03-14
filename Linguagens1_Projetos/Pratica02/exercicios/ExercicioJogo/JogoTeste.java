package ExercicioJogo;
import java.util.Scanner;

public class JogoTeste {
    public static void main(String[] args) {
        JogoPPT jogoPPT;
        jogoPPT = new JogoPPT();
        jogoPPT.j1 = new Jogador();
        jogoPPT.j2 = new Jogador();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do primeiro jogador: ");
        jogoPPT.j1.nome = scanner.nextLine();
        System.out.println("Digite a jogada do primeiro jogador: ");
        jogoPPT.j1.jogada = scanner.nextLine();

        System.out.println("Digite o nome do segundo jogador: ");
        jogoPPT.j2.nome = scanner.nextLine();
        System.out.println("Digite a jogada do segundo jogador: ");
        jogoPPT.j2.jogada = scanner.nextLine();

        jogoPPT.jogo(jogoPPT.j1 ,jogoPPT.j2);
    }
}