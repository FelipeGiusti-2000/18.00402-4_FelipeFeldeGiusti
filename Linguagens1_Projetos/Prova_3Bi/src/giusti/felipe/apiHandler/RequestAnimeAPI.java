package giusti.felipe.apiHandler;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * Classe que faz a requisicao de um anime pela api
 * @author Felipe Felde Giusti
 * @since 03/10/2020
 */
public class RequestAnimeAPI {
    /**
     * Faz o request de um anime para a api e retorna o json obtido
     * @param name nome do anime a ser pesquisado
     * @return json da api
     * @throws Exception ocorreu um erro, joga o erro para ser tratado futuramente
     */
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
