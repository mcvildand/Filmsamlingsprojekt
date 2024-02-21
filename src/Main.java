import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Movie myMovie = new Movie("Avatar", "James Cameron", 2001, true, 120, "Animation");
        //System.out.println(myMovie);

        System.out.println("Skriv titel");
        String userTitle = input.nextLine();
        System.out.println("Skriv director");
        //String userDirector = input.next();
        String userDirector = input.nextLine();
        System.out.println("Skriv årstal");
        int userYearCreated = input.nextInt();
        System.out.println("Skriv true/false om der er farve");
        boolean userIsInColor = input.nextBoolean();
        System.out.println("Skriv længde i minutter");
        int userLengthInMinutes = input.nextInt();
        input.nextLine();
        System.out.println("Skriv genre");
        String userGenre = input.nextLine();
        // scanner bug: efter int, så virker nextLine ikke, brug next()
        // eller indsæt fx input.nextLine() ovenover (linie 23)


        //Movie newMovie = new Movie(userTitle, userDirector, userYearCreated, userIsInColor, userLengthInMinutes,userGenre);
        MovieCollection yourMovie = new MovieCollection();
        yourMovie.addMovie(userTitle, userDirector, userYearCreated, userIsInColor, userLengthInMinutes,userGenre);

        System.out.println("Info om din nye film: " + yourMovie.getMovie());

    }
}
