public class Movie {

    ////////// ATTRIBUTES  //////////
    private String title;
    private String director;
    private int yearCreated;
    private boolean isInColor;
    private int lengthInMinutes;
    private String genre;

    ////////// CONSTRUCTOR  //////////
    public Movie (String title, String director, int yearCreated,
                            boolean isInColor, int lengthInMinutes, String genre) {
        this.title = title;
        this.director = director;
        this.yearCreated = yearCreated;
        this.isInColor = isInColor;
        this.lengthInMinutes = lengthInMinutes;
        this.genre = genre;
    }

    ////////// METODE //////////
    public String getTitle () {
        return title;
    }

    ////////// METODE //////////
    public String getDirector () {
        return director;
    }

    ////////// METODE //////////
    public int getyearCreated () {
        return yearCreated;
    }

    ////////// METODE //////////
    public boolean getisInColor () {
        return isInColor;
    }

    ////////// METODE //////////
    public int getlengthInMinutes () {
        return lengthInMinutes;
    }

    ////////// METODE //////////
    public String getgenre () {
        return genre;
    }

    @Override
    public String toString() {
        return title + ", " + director + ", " + yearCreated + ", " + isInColor + ", " + lengthInMinutes + ", " + genre;
    }
}
