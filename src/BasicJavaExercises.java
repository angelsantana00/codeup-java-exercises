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

        public static void main(String[] args)
        {
            System.out.println("* * * * * * ==================================");
            System.out.println(" * * * * *  ==================================");
            System.out.println("* * * * * * ==================================");
            System.out.println(" * * * * *  ==================================");
            System.out.println("* * * * * * ==================================");
            System.out.println(" * * * * *  ==================================");
            System.out.println("* * * * * * ==================================");
            System.out.println(" * * * * *  ==================================");
            System.out.println("* * * * * * ==================================");
            System.out.println("==============================================");
            System.out.println("==============================================");
            System.out.println("==============================================");
            System.out.println("==============================================");
            System.out.println("==============================================");
            System.out.println("==============================================");
        }
    }

    //TODO: Write a Java program to swap two variables.

    static class Exercise15 {

        public static void main(String[] args) {

            int a, b, temp;
            a = 15;
            b = 27;
            System.out.println("Before swapping : a, b = "+a+", "+ + b);
            temp = a;
            a = b;
            b = temp;
            System.out.println("After swapping : a, b = "+a+", "+ + b);
        }
    }

    //TODO: Write a Java program to print a face.

    static class Exercise16 {

        public static void main(String[] args)
        {
            System.out.println(" +\"\"\"\"\"+ ");
            System.out.println("[| o o |]");
            System.out.println(" |  ^  | ");
            System.out.println(" | '-' | ");
            System.out.println(" +-----+ ");
        }
    }

    //TODO:  Write a Java program to add two binary numbers.

    static class Exercise17 {

        public static void main(String[] args)
        {
            long binary1, binary2;
            int i = 0, remainder = 0;
            int[] sum = new int[20];
            Scanner in = new Scanner(System.in);

            System.out.print("Input first binary number: ");
            binary1 = in.nextLong();
            System.out.print("Input second binary number: ");
            binary2 = in.nextLong();

            while (binary1 != 0 || binary2 != 0)
            {
                sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
                remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
                binary1 = binary1 / 10;
                binary2 = binary2 / 10;
            }
            if (remainder != 0) {
                sum[i++] = remainder;
            }
            --i;
            System.out.print("Sum of two binary numbers: ");
            while (i >= 0) {
                System.out.print(sum[i--]);
            }
            System.out.print("\n");
        }

    }

    //TODO:  Write a java program to multiply two binary numbers

    static class Exercise18 {

        public static void main(String[] args)
        {
            long binary1, binary2, multiply = 0;
            int digit, factor = 1;
            Scanner in = new Scanner(System.in);
            System.out.print("Input the first binary number: ");
            binary1 = in.nextLong();
            System.out.print("Input the second binary number: ");
            binary2 = in.nextLong();
            while (binary2 != 0)
            {
                digit = (int)(binary2 % 10);
                if (digit == 1)
                {
                    binary1 = binary1 * factor;
                    multiply = binaryproduct((int) binary1, (int) multiply);
                }
                else
                {
                    binary1 = binary1 * factor;
                }
                binary2 = binary2 / 10;
                factor = 10;
            }
            System.out.print("Product of two binary numbers: " + multiply+"\n");
        }
        static int binaryproduct(int binary1, int binary2)
        {
            int i = 0, remainder = 0;
            int[] sum = new int[20];
            int binary_prod_result = 0;

            while (binary1 != 0 || binary2 != 0)
            {
                sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2;
                remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2;
                binary1 = binary1 / 10;
                binary2 = binary2 / 10;
            }
            if (remainder != 0)
            {
                sum[i++] = remainder;
            }
            --i;
            while (i >= 0)
            {
                binary_prod_result = binary_prod_result * 10 + sum[i--];
            }
            return binary_prod_result;
        }
    }

    //TODO:Write a Java program to convert a decimal number to binary number.
    static class Exercise19 {
        public static void main(String args[])
        {
            int dec_num, quot, i=1, j;
            int bin_num[] = new int[100];
            Scanner scan = new Scanner(System.in);

            System.out.print("Input a Decimal Number : ");
            dec_num = scan.nextInt();

            quot = dec_num;

            while(quot != 0)
            {
                bin_num[i++] = quot%2;
                quot = quot/2;
            }

            System.out.print("Binary number is: ");
            for(j=i-1; j>0; j--)
            {
                System.out.print(bin_num[j]);
            }
            System.out.print("\n");
        }
    }

    //TODO: Write a Java program to reverse a string.

    static class Exercise27{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input a string: ");
            char[] letters = scanner.nextLine().toCharArray();
            System.out.print("Reverse string: ");
            for (int i = letters.length - 1; i >= 0; i--) {
                System.out.print(letters[i]);
            }
            System.out.print("\n");
        }
    }

    //TODO: Write a Java program.......










    }
