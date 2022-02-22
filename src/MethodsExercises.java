import java.util.Scanner;


public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(AdditionMethod(1, 6));
//        System.out.println(SubtractionMethod(10, 5));
//        System.out.println(MultiplicationMethod(10, 6));
//        System.out.println(DivisionMethod(30, 7));
//        System.out.println(FindModOfTwo(100, 30));
//        System.out.println(getInteger(1, 10));
        getFactor();
        diceRoll();
    }

    //static Scanner in = new Scanner(System.in);

    // <---------------------- 1. ---------------------------> //

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

    // <-------------------- 2. -----------------------------> //
//    public static int getInteger(int min, int max) {
//
//        Scanner in = new Scanner(System.in);
//
//        // do {
//        System.out.print("Enter a number between " + min + " and " + max + ":");
//        int input = in.nextInt();
//        if (input < min || input > max) {
//            System.out.println("Input not Accepted");
//            return getInteger(min, max);
//        }
//        return input;
//    }

    // <----------------------- 3. -------------------------> //
    private static void getFactor() {
        Scanner in = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1-10: ");
        int fact = scanner.nextInt();
        System.out.println("You entered: " + fact);
        System.out.print("Do you want to continue? (y/n): ");
        String userContinue = in.next();
        if (!userContinue.equals("y")) {
            System.out.println("Let's Continue");
        } else {
            if (fact <= 10 & fact >= 1) {
                long factorial = 1;
                for (int i = 1; i <= fact; i++) {
                    factorial = factorial * i;
                }
                System.out.println(fact + "!" + " = " + factorial);
            }
        }
    }

    // <------------------------- 4. -------------------------> //
    private static void diceRoll() {

    }



}

        // do {
       // System.out.print("Enter a number between " + min + " and " + max + ":");
//        int input = in.nextInt();
//        if (input > min || input < max) {
//            System.out.println("You entered: " + input);
//            System.out.print("Do you want to continue? (y/n): ");
//            String userContinue = in.next();
//            if (!userContinue.equals("y")) {
//                System.out.println("Let's Continue");
//            } else {
//                long fact = 1;
//                for (int i = 2; i <= n; i++) {
//                    fact = fact * i;
//                }
//                return fact;
//            }
//        }
//        return 0;
//    }}

