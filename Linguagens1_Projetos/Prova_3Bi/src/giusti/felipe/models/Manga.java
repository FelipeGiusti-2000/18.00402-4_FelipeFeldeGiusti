package giusti.felipe.models;

public class Manga {
    private String imageUrl, name, synopsis,type;
    private int chapters, volumes;
    private float score;

    public Manga(String imageUrl, String name, String synopsis, int chapters, int volumes, String type, float score) {
        this.imageUrl = imageUrl;
        this.name = name;
        this.synopsis = synopsis;
        this.type = type;
        this.chapters = chapters;
        this.volumes = volumes;
        this.score = score;
    }
    public Manga(){

    }

    @Override
    public String toString() {
        return "Manga{" +
                "imageUrl='" + imageUrl + '\'' +
                ", name='" + name + '\'' +
                ", synopsis='" + synopsis + '\'' +
                ", type='" + type + '\'' +
                ", chapters=" + chapters +
                ", volumes=" + volumes +
                ", score=" + score +
                '}';
    }
}
