package giusti.felipe.apiHandler;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Dictionary;

public class RequestAnimeAPI {

    public static String getFromApi(String name) throws Exception{
        System.out.println("Fazendo request.");
        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder().GET()
                .uri(URI.create("https://api.jikan.moe/v3/search/anime?q="+name.replace(" ","%20"))).build();
        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());
//        System.out.println("Status Code:" + response.statusCode());
//        System.out.println("Recebidos:");
//        System.out.println(response.body());
        return response.body();
    }
}
