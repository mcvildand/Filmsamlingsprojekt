import java.util.Scanner;

public class UserInterface {

    ////// CONSTRUCTOR //////
    public UserInterface() {
    }

    Scanner input = new Scanner(System.in);
    Controller controller = new Controller();


    ////////// METODE /////////
    public void startProgram() {

        //Scanner input = new Scanner(System.in);

        int userInput = 0; // så den går direkte ind i while fra start
        int SENTINEL = 4; // kunne også være final int SENTINEL

        //Controller controller = new Controller();

        while (userInput != SENTINEL) {
            // Kan lægges i metode fx showMenu
            System.out.println("Velkommen til filmsamlingen");
            System.out.println("Opret en ny film: tast 1");
            System.out.println("Vis filmliste: tast 2");
            System.out.println("Søg i filmliste: tast 3");
            System.out.println("Afslut: tast 4");

            userInput = input.nextInt();

            if (userInput == 1) {
                addMovie();

            } else if (userInput == 2 ){
                printMovie();

            } else if (userInput == 3) {
                searchFilm();

            } else if (userInput == 4) {
                System.out.println("Filmsamlingen afsluttes");
            }
        }

    }

    /////// METODE OPRET - tast 1 ///////
    public void addMovie() {
        System.out.println("Skriv titel");
        String userTitle = input.next();
        input.nextLine(); // scanner bug fix

        System.out.println("Skriv director");
        String userDirector = input.nextLine();

        System.out.println("Skriv årstal");
        int userYearCreated = input.nextInt();

        boolean userIsInColor = false;
        System.out.println("Er filmen i farve, skriv ja, ellers skriv nej");
        String erIFarve = input.next();
        erIFarve = erIFarve.toLowerCase();
        if (erIFarve.equals("ja")) { //.equals når man arbejder med String
            userIsInColor = true;
        }

        System.out.println("Skriv længde i minutter");
        int userLengthInMinutes = input.nextInt();
        input.nextLine(); // scanner bug fix

        System.out.println("Skriv genre");
        String userGenre = input.nextLine();

        controller.addMovie(userTitle, userDirector, userYearCreated, userIsInColor, userLengthInMinutes, userGenre);

        System.out.println("Filmen blev tilføjet din samling");
        System.out.println(" ");
    }

    /////// METODE UDSKRIV - tast 2 ///////
    public void printMovie() {
        System.out.println(" ");
        System.out.println("Du har oprettet følgende film:");
        System.out.println(controller.showMovie());
    }

    /////// METODE SØG - test 3///////
    public void searchFilm() {
        System.out.println("Skriv navn på film du vil søge efter");
        String userSearchWord = input.next();
        System.out.println(controller.showSearch(userSearchWord));
    }
}








/////////////// NOTES ///////////////////

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