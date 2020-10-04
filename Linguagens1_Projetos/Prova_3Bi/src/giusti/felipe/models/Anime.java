package giusti.felipe.models;

/**
 * Representacao de um anime
 * @author Felipe Felde Giusti
 * @since 03/10/2020
 */
public class Anime {
//    private static int id;
    private String imageUrl, name, synopsis;
    private int episodes;
    private float score;

    /**
     * Construtor
     * @param imageUrl String da url da imagem
     * @param name String do nome do anime
     * @param synopsis String da sinopse do anime
     * @param episodes int com numero de episodios do anime
     * @param score float com nota do anime
     */
    public Anime(String imageUrl, String name, String synopsis, int episodes, float score) {
//        id++;
        this.imageUrl = imageUrl;
        this.name = name;
        this.synopsis = synopsis;
        this.episodes = episodes;
        this.score = score;
    }

    /**
     * Construtor do anime sem parametros passados
     */
    public Anime() {
        this.name = "null";
    }

    /**
     * Construtor do anime so com um nome
     * @param name nome do anime
     */
    public Anime(String name){
        this.name = name;
    }

//    public static int getId() {
//        return id;
//    }

    /**
     * Getter para o nome do anime
     * @return String com nome do anime
     */
    public String getName() {
        return name;
    }
    /**
     * Getter para a url do anime
     * @return String com url da imagem do anime
     */
    public String getImageUrl() {
        return imageUrl;
    }
    /**
     * Getter para a sinopse do anime
     * @return String com sinopse do anime
     */
    public String getSynopsis() {
        return synopsis;
    }
    /**
     * Getter para o episodios do anime
     * @return int com numero de episodios do anime
     */
    public int getEpisodes() {
        return episodes;
    }
    /**
     * Getter para o nota do anime
     * @return float com nota do anime
     */
    public float getScore() {
        return score;
    }

    /**
     * Passa o anime para uma string
     * @return string com dados do anime
     */
    @Override
    public String toString() {
        return "Anime{" +
//                "id=" + id +
                "imageUrl='" + imageUrl + '\'' +
                ", name='" + name + '\'' +
                ", synopsis='" + synopsis + '\'' +
                ", episodes=" + episodes +
                ", score=" + score +
                '}';
    }
}
