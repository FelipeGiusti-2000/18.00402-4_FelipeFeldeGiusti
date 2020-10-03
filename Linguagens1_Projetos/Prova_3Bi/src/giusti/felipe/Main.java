package giusti.felipe;

import giusti.felipe.ApiHandler.RequestMangaAPI;

public class Main {

    public static void main(String[] args) {
        try {
            //AnimeAPI.getFromApi("naruto");
            RequestMangaAPI.getFromApi("Haikyuu!!");
        }
        catch(Exception e){
            System.out.println("\n\n\nErro\n\n\n");
            e.printStackTrace();
        }
    }
}
