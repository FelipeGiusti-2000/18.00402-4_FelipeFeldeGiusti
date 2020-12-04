package giusti.felipe.system;

import giusti.felipe.dao.FichaDAO;
import giusti.felipe.models.FichaDePersonagem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {

    private List<FichaDePersonagem> listaFichas;
    private FichaDAO fichaDAO;
    private Scanner scanner;

    public Aplicacao(){
        listaFichas = new ArrayList<>();
        fichaDAO = new FichaDAO();
        scanner = new Scanner(System.in);
    }

    public void run(){
        boolean loop = true;
        do{
            displayMenu();

        }while (loop);
    }

    private void displayMenu() {
        System.out.println("\n=--=--= MENU PRINCIPAL =--=--=");
        System.out.println("1- Criar novo personagem");
        System.out.println("2- Alterar personagem existente");
        System.out.println("3- ");
        System.out.println("4- Exibir Todos os Mangas");
        System.out.println("0- Sair");
    }

}
