import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

//        ----------------------------------------------------
// 1. Write some Java code that uses the variable pi to output the following:
        // [The value of pi is approximately 3.14.]
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately, %s. %n", pi);

//         ----------------------------------------------------

//        Explore the Scanner Class.
//        Prompt a user to enter an integer and store that value in an int variable using the nextInt method.
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter integer: ");
//        int userInt = scanner.nextInt();

//        What happens if you input something that is not an integer?


//        Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
//        Scanner scanner = new Scanner(System.in);
//        System.out.print(" Enter 3 words: ");
//        String userInput = scanner.next();
//        System.out.println("You entered: -->\" " +userInput + "\" <--");
//
//        String first_word;
//        first_word = userInput;
//
//        String secondWord;
//        secondWord = scanner.next();
//
//        String thirdWord;
//        thirdWord = scanner.next();
//
//        System.out.println(first_word);
//        System.out.println(secondWord);
//        System.out.println(thirdWord);
//
//


//                Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.

//           Scanner scanner = new Scanner(System.in);
//           System.out.print(" Enter A Sentence ");
//           String userInput = scanner.nextLine();
////
////
//           System.out.println(userInput);

//
//        do you capture all the words?
//                Rewrite the above example using the nextLine method.


        //      -------------------------------------------------

//        Calculate the perimeter and area of Codeup's classrooms.
//        Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
//

        Scanner scanner = new Scanner(System.in);

         System.out.print(" Enter the length  of the Codeup Classroom:");

            String userInput = scanner.nextLine();
            double UserNumbers = Integer.parseInt(userInput);
            System.out.println("You entered Length: -->\" " +UserNumbers + "\" <--");


            System.out.println("Enter the Width of the Classroom");
            String UserInputWidth = scanner.nextLine();
            double  UserWidth = Integer.parseInt(UserInputWidth);
            System.out.println("You entered Width: -->\" " +UserInputWidth + "\" <--");

            double area = UserNumbers * UserWidth;
            double perimeter = area * 2;
            System.out.printf("The area of the classroom is %s \n",area );
            System.out.printf("The perimeter of the classroom is %s \n",perimeter);
            System.out.println("You entered Width) \" " +area+ "\" \""+perimeter+"\"");

            System.out.println("What is the height of the Codeup Classroom?:");
            String userInputHeight = scanner.nextLine();
            double UserHeight = Integer.parseInt(userInputHeight);
            System.out.println("You entered Height: -->\" " +userInputHeight + "\" <--");
            double volume = UserNumbers * UserWidth * UserHeight;
            System.out.printf("The volume of the Codeup Classroom is: %s \n",volume);



//        -----------------------------------------------------
    }
}
