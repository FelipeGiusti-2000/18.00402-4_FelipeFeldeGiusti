package giusti.felipe.parsers;

import giusti.felipe.models.Anime;
import org.json.JSONObject;

/**
 * Classe que passa um Json para Anime
 * @author Felipe Felde Giusti
 * @since 03/10/2020
 */
public class AnimeJsonParser {
    /**
     * A partir de uma string no formato json, cria um objeto do tipo Anime
     * @param json string em formato json
     * @return objeto do tipo Anime com os resultados encontrados ou null
     */
    public static Anime getAnimeFromJSON(String json) {
        JSONObject animeJson = new JSONObject(json);
        if (animeJson.getBoolean("request_cached")) {
            System.out.println("Anime encontrado pelo request!");
            return new Anime(
                animeJson.getJSONArray("results").getJSONObject(0).getString("image_url"),
                animeJson.getJSONArray("results").getJSONObject(0).getString("title"),
                animeJson.getJSONArray("results").getJSONObject(0).getString("synopsis"),
                animeJson.getJSONArray("results").getJSONObject(0).getInt("episodes"),
                animeJson.getJSONArray("results").getJSONObject(0).getFloat("score")
            );
        }
        else {
            System.out.println("Anime não encontrado pelo request! Certifique-se que digitou o nome corretamente.");
            return new Anime();
        }
    }

}
