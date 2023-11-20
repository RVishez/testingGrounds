public class Artifact {
    private int id;
    private String artCulture;
    private int year;
    public static int count = 0;

    public Artifact () {
        count++;
    }

    public Artifact (int id, String artCulture, int year) {
     this.id = id;
     this.artCulture = artCulture;
     this.year = year;
     count++;
     }

     public  Artifact (int id, String artCulture) {
    this.id = id;
    this.artCulture = artCulture;
    count++;
        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtCulture() {
        return artCulture;
    }

    public void setArtCulture(String artCulture) {
        this.artCulture = artCulture;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

