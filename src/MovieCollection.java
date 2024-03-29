import java.util.ArrayList;

// information expert
// Creator

public class MovieCollection {

    ////////// ATTRIBUTES //////////
    ArrayList<Movie> movieArr;


    ////////// CONSTRUCTOR //////////
    public MovieCollection () {
        movieArr = new ArrayList<Movie>();
    }

    ////////// METODE //////////
    public void addMovie(String title, String director, int yearCreated,
                         boolean isInColor, int lengthInMinutes, String genre) {
        Movie movie = new Movie(title, director, yearCreated, isInColor, lengthInMinutes, genre);
        movieArr.add(movie);
    }

    ////////// METODE //////////
    // Svarende til undervisers getMovieCollectionList
    public ArrayList<Movie> getMovieArr() {
        return movieArr;
    }

    ////////// METODE //////////
    public String searchMovie(String word) {

        String film = "";
        for (Movie movie : movieArr) {
            if (movie.getTitle().toLowerCase().contains(word.toLowerCase())) {
                film += movie.toString();
            //} else {
                //return "Søgningen gav intet resultat\n";
            }
        }

        if (!(film.length() > 0)) {
            return "Søgningen gav intet resultat\\n";
        }

        return film;
    }


    /*
    ///// Metoden fra userstory 5
    //// Hvor kun første match vises
    public String searchMovie(String word) {

        for (Movie movie : movieArr) {
            boolean result = movie.getTitle().contains(word);

            if (result) {
                return movie.toString();
            }
        }

        return "Søgningen gav intet resultat\n";
    }

    Underviserens version:
     public String searchMovie(String word) {
        for (Movie movie : movieArr) {
            if (movie.getTitle().contains(word)) {
                return movie.toString();
            }
        }
        return "Søgningen gav intet resultat\n";
    }

     */

    // loop over film
    @Override
    public String toString() {
        //movieArr.forEach(movie -> System.out.println(movie));
        String result = "";
        for (Movie movie : movieArr) {
            //System.out.print(movie + " ");
            System.out.print(movie);
        }
        return result;
    }

    /*
    Eksempel fra underviser
    @Override
    public String toString() {
        String allFilms = "";
        for (Movie m : movieArr) {
            //System.out.print(movie + " ");
            allFilms += m.toString() + "\n";
            System.out.print(movie);
        }
        return allFilm;
    }

     */










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
