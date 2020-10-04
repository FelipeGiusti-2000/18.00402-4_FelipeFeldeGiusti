package giusti.felipe.parsers;

import giusti.felipe.models.Manga;
import org.json.JSONObject;

/**
 * Classe que passa um Json para Manga
 * @author Felipe Felde Giusti
 * @since 03/10/2020
 */
public class MangaJsonParser {
    /**
     * A partir de uma string no formato json, cria um objeto do tipo Manga
     * @param json string em formato json
     * @return objeto do tipo Manga com os resultados encontrados ou com dados nulos
     */
    public static Manga getMangaFromJSON(String json) {
        JSONObject mangaJson = new JSONObject(json);
        if (mangaJson.getBoolean("request_cached")) {
            System.out.println("Manga encontrado pelo request!");
            return new Manga(
                    mangaJson.getJSONArray("results").getJSONObject(0).getString("image_url"),
                    mangaJson.getJSONArray("results").getJSONObject(0).getString("title"),
                    mangaJson.getJSONArray("results").getJSONObject(0).getString("synopsis"),
                    mangaJson.getJSONArray("results").getJSONObject(0).getInt("chapters"),
                    mangaJson.getJSONArray("results").getJSONObject(0).getInt("volumes"),
                    mangaJson.getJSONArray("results").getJSONObject(0).getString("type"),
                    mangaJson.getJSONArray("results").getJSONObject(0).getFloat("score")
            );
        }
        else {
            System.out.println("Manga não encontrado pelo request! Certifique-se que digitou o nome corretamente.");
            return new Manga();
        }
    }

}

