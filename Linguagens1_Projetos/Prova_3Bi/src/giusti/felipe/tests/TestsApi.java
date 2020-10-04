package giusti.felipe.tests;

import giusti.felipe.apiHandler.RequestMangaAPI;

/**
 * Classe de teste para as operacoes da api
 */
public class TestsApi {
    public static void main(String[] args) {
        try {
            //RequestAnimeAPI.getFromApi("dungeon");

            RequestMangaAPI.getFromApi("Haikyuu!!");
        }
        catch(Exception e){
            System.out.println("\n\n\nErro\n\n\n");
            e.printStackTrace();
        }
    }
}
