package GroceryList;

import java.util.ArrayList;

public class GroceryListApp {

    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryListItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + "items in your list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+=1) + ". " + groceryList.get(i));
        }
    }


}
