package giusti.felipe.testes;

import giusti.felipe.apiHandler.RequestAnimeAPI;
import giusti.felipe.apiHandler.RequestMangaAPI;
import giusti.felipe.parsers.AnimeJsonParser;

public class testesApi {
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
