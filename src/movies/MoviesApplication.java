package movies;
import movies.Movie;
import java.util.Scanner;

public class MoviesApplication extends Movie {

    public MoviesApplication(String name, String category) {
        super(name, category);
    }

    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.println("What would you like to do?"  +
                "\n 0 - Exit"
                + "\n 1 - View all movies"
                + "\n 2 - View movies in the animated category"
                + "\n 3 - View movies in the drama category"
                + "\n 4 - View movies in the horror category"
                + "\n 5 - View movies in the scifi category");
        System.out.println("Enter your choice:");
        String userName = userIn.nextLine();

    }


} //public class MoviesApplication extends Movie
