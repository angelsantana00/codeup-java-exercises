import java.util.Locale;
import java.util.Scanner;


public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(AdditionMethod(1, 6));
//        System.out.println(SubtractionMethod(10, 5));
//        System.out.println(MultiplicationMethod(10, 6));
//        System.out.println(DivisionMethod(30, 7));
//        System.out.println(FindModOfTwo(100, 30));
        System.out.println(getInteger(2, 10));
    }
    //static Scanner in = new Scanner(System.in);

    // <---------------------- 1. ---------------------> //

//    public static int AdditionMethod(int number, int numberTwo) {
//        return (number + numberTwo);
//
//    }
//
//    public static int SubtractionMethod(int number, int numberTwo) {
//        return (number - numberTwo);
//    }
//
//    public static int MultiplicationMethod(int number, int numberTwo) {
//        return (number * numberTwo);
//
//    }
//
//    public static double DivisionMethod(double number, double numberTwo) {
//        return (number / numberTwo);
//    }
//
//    public static int FindModOfTwo(int number, int numberTwo) {
//        return (number % numberTwo);
//    }

    // <-------------------- 2. -------------------> //
    public static int getInteger(int min, int max) {

        Scanner in = new Scanner(System.in);

        // do {
        System.out.print("Enter a number between " + min + " and " + max + ":");
        int input = in.nextInt();
        if (input < min || input > max) {
            System.out.println("Input not Accepted");
            return getInteger(min, max);
        }
        return input;
    }



    }


