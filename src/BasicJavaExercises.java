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

    //TODO: 9. Write a Java program to compute the specified expressions and print the output.
    static class Exercise9 {
        public static void main(String[] args) {

            System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        }
    }

    //TODO: 10. Write a Java program to compute a specified formula.
    static class Exercise10 {
        public static void main(String[] args) {

            double result = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
            System.out.println(result);
        }
    }

    //TODO: 11. Write a Java program to print the area and perimeter of a circle.
    static class Exercise11 {

        private static final double radius = 10;
        public static void main(String[] args) {

            double perimeter = 2 * Math.PI * radius;
            double area = Math.PI * radius * radius;

            System.out.println("::::::::: Circle Stats ::::::::::");
            System.out.println("Perimeter is = " + perimeter);
            System.out.println("Area is = " + area);
            System.out.println(":::::::::::::::::::::::::::::::::");
        }
    }

    //TODO: BONUS . Write a java program to print input from user to Lower and Uppercase
    static class ExerciseBonus {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Type something: ");
            String line = in.nextLine();
            line = line.toLowerCase();

            System.out.println(line);
        }
    }

    //TODO: Write a java program to print out the average of 5 numbers inputted by the user
    static class Exercise12 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.print("Input first number: ");
            int num1 = in.nextInt();

            System.out.print("Input second number: ");
            int num2 = in.nextInt();

            System.out.print("Input third number: ");
            int num3 = in.nextInt();

            System.out.print("Input fourth number: ");
            int num4 = in.nextInt();

            System.out.print("Enter fifth number: ");
            int num5 = in.nextInt();


            System.out.println("Average of five numbers is: " +
                    (num1 + num2 + num3 + num4 + num5) / 5);
        }
    }

    //TODO:  Write a Java program to print the area and perimeter of a rectangle.
    static class Exercise13 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println("Input Width: ");
            int num1 = in.nextInt();
            System.out.println("Input Length: ");
            int num2 = in.nextInt();

            System.out.println("The Area is: " + (num1 * num2));
            System.out.println("The Perimeter is: " + ((num1 * 2) + (num2 * 2)));
        }
    }

    //TODO: Write a Java program to print an American flag on the screen.

    static class Exercise14 {

    }










    }
