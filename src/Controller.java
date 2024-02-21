public class Controller {

    MovieCollection yourMovie = new MovieCollection();

    ////////// METODE //////////
    // Metode der kalder MovieCollections addMovie-metode
    public void addMovie(String title, String director, int yearCreated,
                         boolean isInColor, int lengthInMinutes, String genre) {
        yourMovie.addMovie(title, director, yearCreated, isInColor, lengthInMinutes, genre);
    }
}








//////////////// NOTES //////////////////


// private MovieCollection test;
    /*
    public Controller () {
        test = new MovieCollection();
    }

     */


