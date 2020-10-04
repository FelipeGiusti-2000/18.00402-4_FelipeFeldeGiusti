package giusti.felipe.tests;

import giusti.felipe.apiHandler.RequestMangaAPI;
import giusti.felipe.models.Manga;
import giusti.felipe.parsers.MangaJsonParser;

public class TestJson {
    public static void main(String[] args) {
        try{
//            String x = RequestAnimeAPI.getFromApi("Hyouka");
//            Anime resAnime = AnimeJsonParser.getAnimeFromJSON(x);
//            System.out.println(resAnime.toString());
            String y = RequestMangaAPI.getFromApi("kimetsu no yaiba".replace(" ", "%20"));
            Manga resManga = MangaJsonParser.getMangaFromJSON(y);
            System.out.println(resManga.toString());

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }


}
