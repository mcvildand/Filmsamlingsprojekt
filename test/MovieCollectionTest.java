import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieCollectionTest {

    @Test
    void addMovie() {
        // Arrange
        MovieCollection collection = new MovieCollection();
        //Movie newMovie = new Movie("Avatar", "James Cameron", 2001, true, 120, "Animation");
        collection.addMovie("Avatar", "James Cameron", 2001, true, 120, "Animation");

        // Act
        // int actualSize = collection.movieArr.size(); virker
        // måske fordi den ikke er privat
        int actualSize = collection.getMovieArr().size();
        int expectedResult = 1;

        // Assert
        Assertions.assertEquals(expectedResult, actualSize);
    }

    @Test
    void addMovieMore() {
        // Arrange
        MovieCollection collection = new MovieCollection();
        //Movie newMovie = new Movie("Avatar", "James Cameron", 2001, true, 120, "Animation");
        collection.addMovie("Avatar", "James Cameron", 2001, true, 120, "Animation");
        collection.addMovie("Film", "Hans Olesen", 1999, false, 130, "Horror");
        collection.addMovie("AndenFilm", "Mona Hansen", 1956, true, 167, "Drama");

        // Act
        // int actualSize = collection.movieArr.size(); virker
        // måske fordi den ikke er privat
        int actualSize = collection.getMovieArr().size();
        int expectedResult = 3;

        // Assert
        Assertions.assertEquals(expectedResult, actualSize);
    }

    // Hvad skal vi teste her? GetMovieArr-metoden (getter-metode)
    // eller er det mere SearchMovie-metoden vi skal teste
    // Lidt på bar bundt ift hvordan vi skal teste getter-metoden
    // uden bare at gøre som i addMovie
    @Test
    void getMovieArr() {
        // Arrange
        MovieCollection collectionTwo = new MovieCollection();

        // Act

        // Assert
    }
}