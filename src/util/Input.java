package util;
import java.util.Scanner;

public class Input {

    private static Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString(String s) {
        return scanner.next();
    }

    public boolean yesNo(String s) {
        String userAnswer = scanner.next();
        return userAnswer.equals("y");
    }

//    public int getInt(String s, int min, int max) {
//        System.out.println("Enter Interger: ");
//        int userInt;
//        try {
//            userInt = Integer.parseInt(scanner.nextLine());
//        } catch (NumberFormatException e) {
//            System.out.println("Out of Range");
//            return getInt("Enter an option, 1-5: ", min, max);
//        }
//        if (userInt < min || userInt > max) {
//            System.out.println("Out of Range Again");
//            return getInt("Enter an option, 1-5: ", min, max);
//        } else {
//            System.out.println("In Range");
//            return userInt;
//        }
//    }

//    public double getDouble(double min, double max) {
//        double userDouble;
//        System.out.println("Give me an decimal: ");
//        try {
//            userDouble = Double.parseDouble(scanner.nextLine());
//        } catch (NumberFormatException e) {
//            System.out.println("Not a Decimal");
//            return getDouble(min, max);
//        }
//        if (userDouble < min || userDouble > max) {
//            System.out.println("Try again!");
//            return getDouble(min, max);
//        } else {
//            System.out.println("There we go!");
//            return userDouble;
//        }
//    }
//
//    public double getDouble() {
//        System.out.println("Give me a decimal: ");
//
//        try {
//            return Double.parseDouble(scanner.nextLine());
//        } catch (NumberFormatException e) {
//            return getDouble();
//        }
    }
