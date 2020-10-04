package giusti.felipe.models;

public class Anime {
    private String imageUrl, name, synopsis;
    private int episodes;
    private float score;

    public Anime(String imageUrl, String name, String synopsis, int episodes, float score) {
        this.imageUrl = imageUrl;
        this.name = name;
        this.synopsis = synopsis;
        this.episodes = episodes;
        this.score = score;
    }
    public Anime(){

    }

    @Override
    public String toString() {
        return "Anime{" +
                "imageUrl='" + imageUrl + '\'' +
                ", name='" + name + '\'' +
                ", synopsis='" + synopsis + '\'' +
                ", episodes=" + episodes +
                ", score=" + score +
                '}';
    }
}
