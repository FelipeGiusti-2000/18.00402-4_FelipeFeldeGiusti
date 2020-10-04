package giusti.felipe.models;

/**
 * Representacao de um manga
 * @author Felipe Felde Giusti
 * @since 03/10/2020
 */
public class Manga {
//    private static int id;
    private String imageUrl, name, synopsis,type;
    private int chapters, volumes;
    private float score;

    /**
     * Construtor
     * @param imageUrl String com url da imagem
     * @param name String com nome do manga
     * @param synopsis String com sinopse do manga
     * @param chapters int com numero de capitulos do manga
     * @param volumes int com numero de volumes do manga
     * @param type String com tipo do manga
     * @param score float com nota do manga
     */
    public Manga(String imageUrl, String name, String synopsis, int chapters, int volumes, String type, float score) {
//        id++;
        this.imageUrl = imageUrl;
        this.name = name;
        this.synopsis = synopsis;
        this.type = type;
        this.chapters = chapters;
        this.volumes = volumes;
        this.score = score;
    }

    /**
     * Construtor sem parametros
     */
    public Manga(){
        this.name = "null";
    }

//    public static int getId() {
//        return id;
//    }

    /**
     * Getter para o nome do manga
     * @return String com nome do manga
     */
    public String getName() {
        return name;
    }
    /**
     * Getter para a url do manga
     * @return String com url da imagem do manga
     */
    public String getImageUrl() {
        return imageUrl;
    }
    /**
     * Getter para a sinopse do manga
     * @return String com sinopse do manga
     */
    public String getSynopsis() {
        return synopsis;
    }
    /**
     * Getter para a tipo do manga
     * @return String com tipo do manga
     */
    public String getType() {
        return type;
    }
    /**
     * Getter para o numero de capitulos do manga
     * @return int com numero de capitulos do manga
     */
    public int getChapters() {
        return chapters;
    }
    /**
     * Getter para o numero de volumes do manga
     * @return int com numero de volumes do manga
     */
    public int getVolumes() {
        return volumes;
    }
    /**
     * Getter para a nota do manga
     * @return float com nota do manga
     */
    public float getScore() {
        return score;
    }

    /**
     * Transforma um manga em string
     * @return String com dados do manga
     */
    @Override
    public String toString() {
        return "Manga{" +
//                "id=" + id +
                "imageUrl='" +imageUrl + '\'' +
                ", name='" + name + '\'' +
                ", synopsis='" + synopsis + '\'' +
                ", type='" + type + '\'' +
                ", chapters=" + chapters +
                ", volumes=" + volumes +
                ", score=" + score +
                '}';
    }
}
