package br.maua.implementacoes.json;

import br.maua.projeto.models.Jogo;
import br.maua.projeto.parsers.JogoParser;
import org.json.JSONObject;

public class TesteJson {
    public static void main(String[] args) {
        Jogo jogo1 = new Jogo("PC","Cyber");
        JSONObject json = JogoParser.toJson(jogo1);
        System.out.println("Formato toString: " + jogo1);
        System.out.println("------------------");
        System.out.println("Formato JSON" + json);
        Jogo jogo2 = JogoParser.fromJson(json);
        System.out.println("Jogo 2: " + jogo2);

    }
}
