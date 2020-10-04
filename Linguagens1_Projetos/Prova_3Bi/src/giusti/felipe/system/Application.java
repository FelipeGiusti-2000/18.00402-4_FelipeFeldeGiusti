package giusti.felipe.system;

import giusti.felipe.apiHandler.RequestAnimeAPI;
import giusti.felipe.apiHandler.RequestMangaAPI;
import giusti.felipe.dao.AnimeDAO;
import giusti.felipe.dao.MangaDAO;
import giusti.felipe.models.Anime;
import giusti.felipe.models.Manga;
import giusti.felipe.parsers.AnimeJsonParser;
import giusti.felipe.parsers.MangaJsonParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Classe com aplicacao principal do sistema
 * @author Felipe Felde Giusti
 * @since 03/10/2020
 */
public class Application {
    private List<Anime> animeList;
    private List<Manga> mangaList;
    private AnimeDAO animeDAO;
    private MangaDAO mangaDAO;
    private Scanner scanner;

    /**
     * Inicializacao das variaveis usadas
     */
    public Application(){
        animeList = new ArrayList<>();
        mangaList = new ArrayList<>();
        animeDAO = new AnimeDAO();
        mangaDAO = new MangaDAO();
        scanner = new Scanner(System.in);
    }

    /**
     * roda a aplicacao
     */
    public void run(){

        boolean loop = true;
        do{
            menu();
            int op = -1;
            try{
                op = Integer.parseInt(scanner.next());
            }
            catch (Exception e){
                System.out.println("Digite um numero do menu");
            }

            switch (op){
                case 0:
                    loop = false;
                    break;
                case 1:
                    searchAnime();
                    break;
                case 2:
                    searchManga();
                    break;
                case 3:
                    showAnimes();
                    break;
                case 4:
                    showMangas();
                    break;
            }
        }
        while(loop);
    }

    /**
     *  Procura anime inicialmente na database e depois na api
     *  Para encontrar na database, o nome deve ser parecido.
     *  Na api o nome pode ser similar, sendo adicionado na database caso ja nao esteja adicionado
     */
    public void searchAnime(){
        System.out.println("Digite o nome do anime: ");
        String name = scanner.next();
        name += scanner.nextLine();

        if(searchAnimeDB(name)){
            animeList = animeDAO.get("name LIKE \"" + name + "\"");
            animeList.forEach(anime-> System.out.println(anime.toString()));
        }
        else{     // Não achou na database
            try {
//                System.out.println(name);
                String jsonAnime = RequestAnimeAPI.getFromApi(name);

                Anime anime = AnimeJsonParser.getAnimeFromJSON(jsonAnime);
                if(!anime.getName().equals("null")){
                    if(!searchAnimeDB(anime.getName())){     //Não achou nome no database
                        animeDAO.insert(anime);
                        System.out.println(anime.toString());
                    }
                    else{
                        System.out.println("O Anime ja foi adicionado na database");
                    }
                }
                else{
                    System.out.println("Anime com nome especifico nao encontrado!");
                }

            } catch (Exception exception) {
                System.out.println("Houve um erro ao buscar pelo anime desejado!\n");
//                exception.printStackTrace();
            }
        }

    }

    /**
     * Procura o anime na database
     * @param name nome a ser procurado
     * @return valor boolean true se for encontrado e false se nao for
     */
    public boolean searchAnimeDB(String name){
        animeList = animeDAO.get("name LIKE \"" + name + "\"");

        if(!animeList.isEmpty()){
            System.out.println("Anime encontrado no banco de dados");
            return true;
        }
        else{
            System.out.println("Anime nao encontrado no banco de dados");
            return false;
        }

    }

    /**
     *  Procura manga inicialmente na database e depois na api
     *  Para encontrar na database, o nome deve ser parecido.
     *  Na api o nome é buscado, sendo adicionado na database caso ja nao esteja adicionado
     */
    public void searchManga(){
        System.out.println("Digite o nome do manga: ");
        String name = scanner.next();
        name += scanner.nextLine();

        if(searchMangaDB(name)){
            mangaList = mangaDAO.get("name LIKE \"" + name + "\"");
            mangaList.forEach(manga-> System.out.println(manga.toString()));
        }
        else{     // Não achou na database
            try {
                String jsonManga = RequestMangaAPI.getFromApi(name);

                Manga manga = MangaJsonParser.getMangaFromJSON(jsonManga);
                if(!manga.getName().equals("null")){
                    if(!searchMangaDB(manga.getName())){     //Não achou nome no database
                        mangaDAO.insert(manga);
                        System.out.println("Manga adicionado na database:");
                        System.out.println(manga.toString());
                    }
                    else{
                        System.out.println("Esse manga ja foi adicionado na database");
                    }
                }
                else{
                    System.out.println("Manga com nome especifico nao encontrado!");
                }

            } catch (Exception exception) {
                System.out.println("Houve um erro ao buscar pelo manga desejado!\n");
//                exception.printStackTrace();
            }
        }
    }

    /**
     * Procura um manga na database
     * @param name nome a ser procurado
     * @return valor Boolean, true se for encontrado e false se nao for
     */
    public boolean searchMangaDB(String name) {
        mangaList = mangaDAO.get("name LIKE \"" + name + "\"");

        if (!mangaList.isEmpty()) {
            System.out.println("Manga encontrado no banco de dados");
            return true;
        } else {
            System.out.println("Manga nao encontrado no banco de dados");
            return false;
        }
    }

    /**
     * Exibe todos os animes da database
     */
    public void showAnimes(){
        animeList = animeDAO.getAll();
        animeList.forEach(anime-> System.out.println(anime));
    }

    /**
     * Exibe todos os mangas da database
     */
    public void showMangas(){
        mangaList = mangaDAO.getAll();
        mangaList.forEach(manga-> System.out.println(manga));
    }

    /**
     * Exibe um menu para escolher o desejado
     */
    public void menu(){
        System.out.println("\n=--=--= MENU PRINCIPAL =--=--=");
        System.out.println("1- Procurar Anime");
        System.out.println("2- Procurar Manga");
        System.out.println("3- Exibir Todos os Animes");
        System.out.println("4- Exibir Todos os Mangas");
        System.out.println("0- Sair");
    }

}
