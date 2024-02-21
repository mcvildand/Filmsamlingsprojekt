/*
import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        // ArrayList kan indeholde alle mulige objekter
        // Fx andre arrays, Strings, int osv
        ArrayList fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("banana");

        System.out.println(fruits);

        fruits.clear();

        System.out.println(fruits);

        fruits.add("strawberry");
        fruits.add("mango");

        System.out.println(fruits);

        fruits.remove("mango");

        //////
        String fruitLength = (String) fruits.get(0); // lavet med casting (String)
        System.out.println(fruitLength); // printer ikke længden, men ordet

        // anden løsning
        ArrayList<String> fruitsTWO = new ArrayList<String>();
        fruitsTWO.add("Rasberry");
        fruitsTWO.add("Tomato");
        System.out.println(fruitsTWO);
        int frugtlængde = fruitsTWO.get(0).length(); // længden af ordet (String) på index 0
        System.out.println(frugtlængde);

        for(int i=0; i<fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        for(String ord : fruits) {
            System.out.println(ord.toLowerCase());
        }


        ////
        Movie movie1 = new Movie("Avatar", "James Cameron", 2001, true, 120, "Animation");
        Movie[] movies = new Movie[5];
        movies[0] = movie1;

        ArrayList<Movie> moviesArrayList = new ArrayList<Movie>(); // movie array liste

        moviesArrayList.add(1, movie1);


        // A: if
        // B loop - brug tallet 2 som sentinel (se gammel opgave)
        //Userstory 2 kan laves uden at lave om på det fra tirsdag (alm array)

        //Userstory 3:




    }

}


 */