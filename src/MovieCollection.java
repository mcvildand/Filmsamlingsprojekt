import java.util.ArrayList;

public class MovieCollection {

    ////////// ATTRIBUTES //////////
    ArrayList<Movie> movieArr = new ArrayList<Movie>();
    int count = 0;

    ////////// CONSTRUCTOR //////////
    public MovieCollection () {
    }

    ////////// METODE //////////
    public void addMovie(String title, String director, int yearCreated,
                         boolean isInColor, int lengthInMinutes, String genre) {
        Movie movie = new Movie(title, director, yearCreated, isInColor, lengthInMinutes, genre);
        movieArr.add(count, movie);
        count++;
    }









    ////////////////////// NOTES /////////////////

    /*
    public Movie getMovie () {
        return movieArr[0];
    }
    */

    /*
    ////////// ATTRIBUTES //////////
    Movie[] movieArr = new Movie[5];
    int count = 0;

    ////////// CONSTRUCTOR //////////
    public MovieCollection () {

    }

    ////////// METODE //////////
    public void addMovie(String title, String director, int yearCreated,
                         boolean isInColor, int lengthInMinutes, String genre) {
        Movie movie = new Movie(title, director, yearCreated, isInColor, lengthInMinutes, genre);
        movieArr[count] = movie;
        count++;
    }

    /*
    public Movie[] getMovie () {
        return movieArr;
    }


    public Movie getMovie () {
        return movieArr[0];
    }
     */

}
