package ContactsManagerCLI;

import util.Input;

import java.util.ArrayList;
import java.util.List;

public class ContactManager {

    private static Input in = new Input();

    private static final String CONTACT_FILE = "src/ContactsManagerCLI/contacts.txt";
    private static List<String> contacts = new ArrayList<>();

    public static String addPhoneNumber() {
        String num = in.getString("Please Enter a 9-Digit Phone Number: ");
        if (num.length() == 9) {
            return num;
        } else {
            return addPhoneNumber();
        }
    }

    public static String addName() {
        return in.getString("Please Enter a Name: ");
    }

    public static void searchContact() {
        String search = in.getString("Type a Name to Search: ");
        for (String c: contacts) {
            if (search.equalsIgnoreCase(c.split(" ")[0])) {
                System.out.println(c);
                return;
            }
        }
        System.out.println("Nothing Found");
        searchContact();
    }

    public static void deleteContact() {

    }




}
