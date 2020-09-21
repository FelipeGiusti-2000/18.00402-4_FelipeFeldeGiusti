package giusti.felipe.models;

/**
 * Representação de uma carta de pokemon
 * @author Felipe Felde Giusti
 * @since 16/09/2020
 */
public class PokemonCard {
    private String id;
    private String imageUrl;
    private String name;
    private String rarity;
    private String series;
    private String cardSet;

    /**
     *
     * @param id Id da carta
     * @param imageUrl Endereço url para localizar a imagem
     * @param name Nome da carta
     * @param rarity Raridade da carta
     * @param series Série da carta
     * @param set Coleção da carta
     */
    public PokemonCard(String id, String imageUrl, String name, String rarity, String series, String set) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.name = name;
        this.rarity = rarity;
        this.series = series;
        this.cardSet = set;
    }

    /**
     *
     * @param id Id da carta
     */
    public PokemonCard(String id){
        this(id, null,null,null,null,null);
    }

    /**
     *
     * @return String com o Id da carta
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @return String com a url da imagem
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     *
     * @return String com o nome da carta
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return String com a raridade da carta
     */
    public String getRarity() {
        return rarity;
    }

    /**
     *
     * @return String com a série da carta
     */
    public String getSeries() {
        return series;
    }

    /**
     *
     * @return String com a coleção da carta
     */
    public String getCardSet() {
        return cardSet;
    }

    /**
     *
     * @return String contendo informações da carta
     */
    @Override
    public String toString() {
        return "PokemonCard{" +
                "id='" + id + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", name='" + name + '\'' +
                ", rarity='" + rarity + '\'' +
                ", series='" + series + '\'' +
                ", set='" + cardSet + '\'' +
                '}';
    }
}
