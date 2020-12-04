package giusti.felipe.system;

import giusti.felipe.dao.FichaDAO;
import giusti.felipe.enums.ProfissoesEnum;
import giusti.felipe.enums.RacasEnum;
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
            mostrarMenu();
            int opicao = -1;
            try{
                opicao = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                System.out.println("Digite um numero do menu");
            }

            switch (opicao){
                case 0:
                    loop = false;
                    break;
                case 1:
                    criarPersonagem();
                    break;
                case 2:
                    alterarPersonagem();
                case 3:
                    exibirPersonagens();
                case 4:
                    DeletarPersonagem();
            }

        }while (loop);
    }

    private void criarPersonagem() {

        System.out.println("Indique o nome do seu personagem: ");
        String nome = scanner.next();
        mostrarRacas();
        RacasEnum raca = escolherRaca();
        mostrarProfissoes();
        ProfissoesEnum profissao = escolherProfissao();

        System.out.println("Indique a mana: ");
        int mana = Integer.parseInt(scanner.next());

        System.out.println("Indique o ataque: ");
        int ataque = Integer.parseInt(scanner.next());

        System.out.println("Indique o ataque magico: ");
        int ataqueMagico = Integer.parseInt(scanner.next());

        System.out.println("Indique a defesa: ");
        int defesa = Integer.parseInt(scanner.next());

        System.out.println("Indique a defesa magica: ");
        int defesaMagica = Integer.parseInt(scanner.next());

        System.out.println("Indique a velocidade: ");
        int velocidade = Integer.parseInt(scanner.next());

        System.out.println("Indique a destreza: ");
        int destreza = Integer.parseInt(scanner.next());

        System.out.println("Indique a experiencia: ");
        int experiencia = Integer.parseInt(scanner.next());

        System.out.println("Indique o nivel atual: ");
        int nivelAtual = Integer.parseInt(scanner.next());

        FichaDePersonagem ficha = new FichaDePersonagem(
                nome, raca, profissao, mana, ataque, ataqueMagico, defesa, defesaMagica, velocidade, destreza, experiencia, nivelAtual);
        fichaDAO.insert(ficha);

    }

    private void alterarPersonagem() {
        System.out.println("Indique o nome do seu personagem: ");
        String nome = scanner.next();
        mostrarRacas();
        RacasEnum raca = escolherRaca();
        mostrarProfissoes();
        ProfissoesEnum profissao = escolherProfissao();

        System.out.println("Indique a mana: ");
        int mana = Integer.parseInt(scanner.next());

        System.out.println("Indique o ataque: ");
        int ataque = Integer.parseInt(scanner.next());

        System.out.println("Indique o ataque magico: ");
        int ataqueMagico = Integer.parseInt(scanner.next());

        System.out.println("Indique a defesa: ");
        int defesa = Integer.parseInt(scanner.next());

        System.out.println("Indique a defesa magica: ");
        int defesaMagica = Integer.parseInt(scanner.next());

        System.out.println("Indique a velocidade: ");
        int velocidade = Integer.parseInt(scanner.next());

        System.out.println("Indique a destreza: ");
        int destreza = Integer.parseInt(scanner.next());

        System.out.println("Indique a experiencia: ");
        int experiencia = Integer.parseInt(scanner.next());

        System.out.println("Indique o nivel atual: ");
        int nivelAtual = Integer.parseInt(scanner.next());
        
    }


    private void exibirPersonagens() {
        listaFichas = fichaDAO.getAll();
        listaFichas.forEach(ficha -> System.out.println(ficha));
    }

    private void DeletarPersonagem() {

    }

    private void mostrarMenu() {
        System.out.println("\n=--=--= MENU PRINCIPAL =--=--=");
        System.out.println("1- Criar novo personagem");
        System.out.println("2- Alterar personagem existente");
        System.out.println("3- Consultar personagens existentes");
        System.out.println("4- Deletar personagem");
        System.out.println("0- Sair");
    }

    public void mostrarRacas(){
        System.out.println("\n =--=--= ESCOLHA SUA RACA =--=--=");
        System.out.println("1 - Anao");
        System.out.println("2 - Orc");
        System.out.println("3 - Centauro");
        System.out.println("4 - Elfo");
        System.out.println("5 - Humano");
        System.out.println("6 - Furry");
        System.out.println("7 - Lizardman");
        System.out.println("8 - Halfling");
    }

    public void mostrarProfissoes(){
        System.out.println("\n =--=--= ESCOLHA SUA PROFISSAO =--=--=");
        System.out.println("1 - ALQUIMISTA");
        System.out.println("2 - ARQUEIRO");
        System.out.println("3 - FERREIRO");
        System.out.println("4 - MINERADOR");
        System.out.println("5 - VENDEDOR");
        System.out.println("6 - ESPADACHIM");
        System.out.println("7 - MAGO");
        System.out.println("8 - SACERDOTE");
        System.out.println("9 - CAVALEIRO");
        System.out.println("10 - LADRAO");

    }
    public RacasEnum escolherRaca(){
        int escolha = 0;
        boolean internalLoop = true;
        RacasEnum raca = RacasEnum.NAO_DEFINIDO;

        do {
            try {
                escolha = Integer.parseInt(scanner.next());
                raca = RacasEnum.valueOf(escolha).get();
                internalLoop = false;
            } catch (Exception e) {
                System.out.println("Escolha um numero da lista!");
            }
        }while(internalLoop);
        return raca;
    }

    public ProfissoesEnum escolherProfissao(){
        int escolha = 0;
        boolean internalLoop = true;
        ProfissoesEnum profissao = ProfissoesEnum.NAO_DEFINIDO;

        do {
            try {
                escolha = Integer.parseInt(scanner.next());
                profissao = ProfissoesEnum.valueOf(escolha).get();
                internalLoop = false;
            } catch (Exception e) {
                System.out.println("Escolha um numero da lista!");
            }
        }while(internalLoop);
        return profissao;
    }
}
