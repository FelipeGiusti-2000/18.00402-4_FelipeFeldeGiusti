package giusti.felipe.models;

public class Manga {
    private String imageUrl, name, synopsis,type;
    private int chapters, volumes;
    private float score;

    public Manga(String imageUrl, String name, String synopsis, String type, int chapters, int volumes, float score) {
        this.imageUrl = imageUrl;
        this.name = name;
        this.synopsis = synopsis;
        this.type = type;
        this.chapters = chapters;
        this.volumes = volumes;
        this.score = score;
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
