package giusti.felipe.parsers;

import giusti.felipe.models.Manga;
import org.json.JSONObject;

public class MangaJsonParser {
    public static Manga getMangaFromJSON(String json) {
        JSONObject mangaJson = new JSONObject(json);
        if (mangaJson.getBoolean("request_cached")) {
            System.out.println("Manga encontrado!");
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
            System.out.println("Manga não encontrado! Certifique-se que digitou o nome corretamente.");
            return new Manga();
        }
    }

}

