package giusti.felipe.tests;

import giusti.felipe.dao.PokemonCardDAO;
import giusti.felipe.models.PokemonCard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Classe que roda o teste da classe PokemonCardDAO
 * @author Felipe Felde Giusti
 * @since 16/09/2020
 */
public class TestDAO {
    private List<PokemonCard> pokemonCards;
    private PokemonCardDAO pokemonCardDAO;
    private Scanner scanner;

    /**
     * Construtor: inicializa as variaveis usadas
     */
    public TestDAO() {
        pokemonCards = new ArrayList<>();
        pokemonCardDAO = new PokemonCardDAO();
        scanner = new Scanner(System.in);
    }

    /**
     * Inicia a aplicacao teste
     */
    public void run(){
        boolean alive = true;
        do{
            menu();
            int opcao = Integer.parseInt(scanner.next());
            switch (opcao){
                case 0:
                    alive = false;
                    break;
                case 1:
                    printCards();
                    break;
                case 2:
                    deleteCard();
                    break;
                case 3:
                    updateCard();
                    break;
                case 4:
                    registerNewCard();
                    break;
                default:
                    System.out.println("Opcao Invalida!");
            }

        }while(alive);
    }

    /**
     * Atualiza os dados de uma carta na database
     */
    private void updateCard() {
        pokemonCards = pokemonCardDAO.getAll();
        System.out.println("Id da carta para atualizar:");
        String id = scanner.next();
        System.out.println("Cadastre os novos valores:");

        String imageUrl,name, rarity, series, cardSet;

        System.out.println("Informe o url da imagem:");
        imageUrl = scanner.next();
        System.out.println("Informe o nome da carta:");
        name = scanner.next();
        System.out.println("Informe a raridade da carta:");
        rarity = scanner.next();
        System.out.println("Informe a serie da carta:");
        series = scanner.next();
        System.out.println("Informe a colecao da carta:");
        cardSet = scanner.next();
        pokemonCardDAO.update(new PokemonCard(
                id, imageUrl, name, rarity, series, cardSet
        ),id);
    }

    /**
     * Registra uma nova carta na database
     */
    private void registerNewCard() {
        String id, imageUrl,name, rarity, series, cardSet;
        System.out.println("Cadastrando nova carta:");
        System.out.println("Informe o id da carta:");
        id = scanner.next();
        System.out.println("Informe o url da imagem:");
        imageUrl = scanner.next();
        System.out.println("Informe o nome da carta:");
        name = scanner.next();
        System.out.println("Informe a raridade da carta:");
        rarity = scanner.next();
        System.out.println("Informe a serie da carta:");
        series = scanner.next();
        System.out.println("Informe a colecao da carta:");
        cardSet = scanner.next();

        pokemonCardDAO.create(new PokemonCard(
                id, imageUrl, name, rarity, series, cardSet
        ));
    }

    /**
     * Deleta uma carta da database
     */
    private void deleteCard() {
        System.out.println("id da carta:");
        String id = scanner.next();

        pokemonCardDAO.delete(new PokemonCard(id));
    }

    /**
     * imprime as cartas existentes na database
     */
    private void printCards() {
        pokemonCards = pokemonCardDAO.getAll();
        System.out.println("Cartas:");
        pokemonCards.forEach( card -> System.out.println(card));
    }

    /**
     * Exibe um menu para escolha da opcao a ser testada
     */
    private void menu() {
        System.out.println("\nMenu");
        System.out.println("1 - Cartas Cadastradas");
        System.out.println("2 - Deletar Carta");
        System.out.println("3 - Alterar Carta");
        System.out.println("4 - Cadastrar Carta");
        System.out.println("0 - Sair");
    }
}
