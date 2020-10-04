package giusti.felipe.tests;

import giusti.felipe.apiHandler.RequestMangaAPI;
import giusti.felipe.models.Manga;
import giusti.felipe.parsers.MangaJsonParser;

/**
 * Classe de teste para as operacoes de json
 * @author Felipe Felde Giusti
 * @since 03/10/2020
 */
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
