package giusti.felipe.models;

public class Anime {
//    private static int id;
    private String imageUrl, name, synopsis;
    private int episodes;
    private float score;

    public Anime(String imageUrl, String name, String synopsis, int episodes, float score) {
//        id++;
        this.imageUrl = imageUrl;
        this.name = name;
        this.synopsis = synopsis;
        this.episodes = episodes;
        this.score = score;
    }

    public Anime() {
        this.name = "null";
    }
    public Anime(String name){
        this.name = name;
    }

//    public static int getId() {
//        return id;
//    }


    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public int getEpisodes() {
        return episodes;
    }

    public float getScore() {
        return score;
    }

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