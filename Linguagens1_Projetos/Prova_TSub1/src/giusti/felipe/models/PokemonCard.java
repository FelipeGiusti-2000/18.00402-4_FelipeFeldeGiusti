package giusti.felipe.models;

public class PokemonCard {
    private String id;
    private String imageUrl;
    private String name;
    private String rarity;
    private String series;
    private String cardSet;

    public PokemonCard(String id, String imageUrl, String name, String rarity, String series, String set) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.name = name;
        this.rarity = rarity;
        this.series = series;
        this.cardSet = set;
    }

    public String getId() {
        return id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getRarity() {
        return rarity;
    }

    public String getSeries() {
        return series;
    }

    public String getCardSet() {
        return cardSet;
    }

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
