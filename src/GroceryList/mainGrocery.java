package GroceryList;

import java.util.Scanner;

public class mainGrocery {

    private static Scanner scanner = new Scanner (System.in);
    private static GroceryListApp groceryList = new GroceryListApp();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
        }
    }

}
