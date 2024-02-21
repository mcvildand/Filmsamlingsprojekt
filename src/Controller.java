
public class Controller {

    MovieCollection yourMovie = new MovieCollection();

    // Skal have en addMovie metode... men kalde MovieCollections addMovie metode??

    // private MovieCollection test;
    /*
    public Controller () {
        test = new MovieCollection();
    }

     */

    ////////// METODE //////////
    public void addMovie(String title, String director, int yearCreated,
                         boolean isInColor, int lengthInMinutes, String genre) {
        yourMovie.addMovie(title, director, yearCreated, isInColor, lengthInMinutes, genre);
    }
}


