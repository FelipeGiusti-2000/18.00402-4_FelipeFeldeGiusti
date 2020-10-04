package giusti.felipe.parsers;

import giusti.felipe.models.Anime;
import org.json.JSONObject;

public class AnimeJsonParser {
    public static Anime getAnimeFromJSON(String json) {
        JSONObject animeJson = new JSONObject(json);
        if (animeJson.getBoolean("request_cached")) {
            System.out.println("Anime encontrado!");
            return new Anime(
                animeJson.getJSONArray("results").getJSONObject(0).getString("image_url"),
                animeJson.getJSONArray("results").getJSONObject(0).getString("title"),
                animeJson.getJSONArray("results").getJSONObject(0).getString("synopsis"),
                animeJson.getJSONArray("results").getJSONObject(0).getInt("episodes"),
                animeJson.getJSONArray("results").getJSONObject(0).getFloat("score")
            );
        }
        else {
            System.out.println("Anime não encontrado! Certifique-se que digitou o nome corretamente.");
            return new Anime();
        }
    }

}
