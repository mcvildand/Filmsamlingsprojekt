import java.util.ArrayList;
import java.util.Scanner;

public class FilmEmner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isInColor = false; // = en sort/hvid film, false til spm om den er i farve

        // ja/nej svar fra brugeren istedet for true/false
        System.out.println("Er filmen i farve, skriv ja, ellers skriv nej");

        // scanner.next og ikke nextLine pga det kun er ET ord
        // vælg nextLine hvis der er flere ord og mellemrum
        String erIFarve = scanner.next();
        erIFarve = erIFarve.toLowerCase();

        // equals pga det er String
        // den er sensitiv til upper/lower case (dvs den godtager kun lille ja...
        // hvis ikke brug af toLowerCase på linie 16
        // men behøver ikke else, pga isInColer allerede er sat til false
        // alternativt kan man skrive boolean isInColor; øverst og bruge if else og sætte til false
        if (erIFarve.equals("ja")) {
            isInColor = true;
        }


        ArrayList<String> liste = new ArrayList<>();
        liste.add(0,"signe");
        liste.add("signe");



    }
}
