package giusti.felipe.testes;

import giusti.felipe.apiHandler.RequestAnimeAPI;
import giusti.felipe.models.Anime;
import giusti.felipe.parsers.AnimeJsonParser;

public class testeJson {
    public static void main(String[] args) {
        try{
            String x = RequestAnimeAPI.getFromApi("Hyouka");
            Anime resAnime = AnimeJsonParser.getAnimeFromJSON(x);

            System.out.println(resAnime.toString());
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }


}
