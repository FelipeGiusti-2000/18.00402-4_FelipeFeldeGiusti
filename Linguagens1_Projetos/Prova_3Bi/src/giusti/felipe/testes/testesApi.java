package giusti.felipe.testes;

import giusti.felipe.apiHandler.RequestAnimeAPI;
import giusti.felipe.apiHandler.RequestMangaAPI;

public class testesApi {
    public static void main(String[] args) {
        try {
            RequestAnimeAPI.getFromApi("naruto");
            //RequestMangaAPI.getFromApi("Haikyuu!!");
        }
        catch(Exception e){
            System.out.println("\n\n\nErro\n\n\n");
            e.printStackTrace();
        }
    }
}
