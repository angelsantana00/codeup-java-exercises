package util;

import java.util.Scanner;

public class Input {

    public Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);


    }

//    public String getString() {
////        System.out.println("String here: ");
//        String userString = scanner.nextLine();
//        return userString;
//    }
//
//    public boolean yesNo() {
////        System.out.println("Select (y/n):");
//        String userAnswer = scanner.next();
//        return userAnswer.equals("y");
//    }

    public int getInt(int min, int max) {
        System.out.println("Enter Interger: ");
        int userInt;
        try {
            userInt = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Out of Range");
            return getInt(min, max);
        }
        if (userInt < min || userInt > max) {
            System.out.println("Out of Range");
            return getInt(min, max);
        } else {
            System.out.println("In Range");
            return userInt;
        }
    }

}