import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Movie myMovie = new Movie("Avatar", "James Cameron", 2001, true, 120, "Animation");
        //System.out.println(myMovie);

        int userInput = 0; // så den går direkte ind i while fra start
        int SENTINEL = 2;

        while (userInput != SENTINEL) {
            System.out.println("Velkommen til filmsamlingen");
            System.out.println("Opret en ny film: tast 1");
            System.out.println("Afslut: tast 2");

            userInput = input.nextInt();

            if (userInput == 1) {
                //MovieCollection yourMovie = new MovieCollection();
                Controller controller = new Controller();

                System.out.println("Skriv titel");
                String userTitle = input.next();
                input.nextLine();
                System.out.println("Skriv director");
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

                //yourMovie.addMovie(userTitle, userDirector, userYearCreated, userIsInColor, userLengthInMinutes,userGenre);
                controller.addMovie(userTitle, userDirector, userYearCreated, userIsInColor, userLengthInMinutes, userGenre);
                //System.out.println("Info om din nye film: " + yourMovie.getMovie());
                //System.out.println(" ");
                System.out.println("Info om din nye film: " + userTitle + ", " + userDirector + ", " + userYearCreated + ", "
                + userIsInColor + ", " + userLengthInMinutes + ", " + userGenre);
                System.out.println(" ");

            } else if (userInput == 2 ){
                System.out.println("Filmsamlingen afsluttes");
            }
        }



        /*
        System.out.println("Velkommen til filmsamlingen");
        System.out.println("Opret en ny film: tast 1");
        System.out.println("Afslut: tast 2");

        userInput = input.nextInt();

        /// Delopgave2A
        if (userInput == 1) {
            MovieCollection yourMovie = new MovieCollection();

            System.out.println("Skriv titel");
            String userTitle = input.next();
            input.nextLine();
            System.out.println("Skriv director");
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

            yourMovie.addMovie(userTitle, userDirector, userYearCreated, userIsInColor, userLengthInMinutes,userGenre);
            System.out.println("Info om din nye film: " + yourMovie.getMovie());

        } else if (userInput == 2 ){
            System.out.println("Filmsamlingen afsluttes");
        } else {
            System.out.println("Ugyldig indtastning");
        }

        */


        //// Delopgave 1
        /*
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
         */
        // scanner bug: efter int, så virker nextLine ikke, brug next()
        // eller indsæt fx input.nextLine() ovenover (linie 23)


        //Movie newMovie = new Movie(userTitle, userDirector, userYearCreated, userIsInColor, userLengthInMinutes,userGenre);
        //MovieCollection yourMovie = new MovieCollection();
        //yourMovie.addMovie(userTitle, userDirector, userYearCreated, userIsInColor, userLengthInMinutes,userGenre);

        //System.out.println("Info om din nye film: " + yourMovie.getMovie());

        // Delopgave 2 (onsdag)
        //Controller controller = new Controller();
        //controller.addMovie(userTitle, userDirector, userYearCreated, userIsInColor, userLengthInMinutes,userGenre);

    }
}
