import java.util.Scanner;

class BasicJavaExercises {

    //TODO: 1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
    static class Exercise1 {
        public static void main(String[] args) {
            System.out.println("Hello, \nAlexandra Abramov");
        }
    }

    //TODO: 2. Write a Java program to print the sum of two numbers.
    static class Exercise2 {
        public static void main(String[] args) {
            System.out.println(24 + 26);
        }
    }

    //TODO: 3. Write a Java program to divide two numbers and print on the screen.
    static class Exercise3 {
        public static void main(String[] args) {
            System.out.println(50 / 3);
        }
    }

    //TODO: 4. Write a Java program to print the result of the following operations.
    static class Exercise4 {
        public static void main(String[] args) {
            System.out.println(-5 + 8 * 6);
            System.out.println((55 + 9) % 9);
            System.out.println(20 + -3 * 5 / 8);
            System.out.println(5 + 15 / 3 * 2 - 8 % 3);
        }
    }

    //TODO: 5. Write a Java program that takes two numbers as input and display the product of two numbers.
    static class Exercise5 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.print("Input first number: ");
            int num1 = in.nextInt();

            System.out.print("Input second number: ");
            int num2 = in.nextInt();

            System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
        }
    }

    //TODO: Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
    static class Exercise6 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.print("Input Number: ");
            int num1 = in.nextInt();

            System.out.print("Input 2nd Number: ");
            int num2 = in.nextInt();


            System.out.println(num1 + " + " + num2 + " = " +
                    (num1 + num2));

            System.out.println(num1 + " - " + num2 + " = " +
                    (num1 - num2));

            System.out.println(num1 + " x " + num2 + " = " +
                    (num1 * num2));

            System.out.println(num1 + " / " + num2 + " = " +
                    (num1 / num2));

            System.out.println(num1 + " mod " + num2 + " = " +
                    (num1 % num2));
        }
    }

    //TODO: 7. Write a Java program that takes a number as input and prints its multiplication table upto 10.
    static class Exercise7 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.print("Input a number: ");
            int num1 = in.nextInt();

            for (int i=0; i< 10; i++){
                System.out.println(num1 + " x " + (i+1) + " = " +
                        (num1 * (i+1)));
            }
        }
    }

    //TODO: 8. Write a Java program to display the following pattern.
    static class Exercise8 {
        public static void main(String[] args) {
            System.out.println("    J    a   v      v   a\n" +
                    "    J   a  a   v   v   a a\n" +
                    "J   J  aaaaaa   V V   aaaaaa\n" +
                    " JJJ  a      a   V   a      a");
        }
    }





}
