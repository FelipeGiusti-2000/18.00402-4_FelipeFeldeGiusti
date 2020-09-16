package giusti.felipe.models;

public class PokemonCard {
    private String urlImagem;
    private String id;
    private String nome;
    private String raridade;
    private String serie;
    private String colecao;

    public PokemonCard(String urlImagem, String id, String nome, String raridade, String serie, String colecao) {
        this.urlImagem = urlImagem;
        this.id = id;
        this.nome = nome;
        this.raridade = raridade;
        this.serie = serie;
        this.colecao = colecao;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getRaridade() {
        return raridade;
    }

    public String getSerie() {
        return serie;
    }

    public String getColecao() {
        return colecao;
    }

    @Override
    public String toString() {
        return "PokemonCard{" +
                "urlImagem='" + urlImagem + '\'' +
                ", id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", raridade='" + raridade + '\'' +
                ", serie='" + serie + '\'' +
                ", colecao='" + colecao + '\'' +
                '}';
    }
}
