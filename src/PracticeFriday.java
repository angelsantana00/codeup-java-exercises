import java.util.Scanner;

//public class PracticeFriday {
//
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print(" Enter your name: ");
//        String userInput = scanner.next();
//        System.out.println("Hello, \""+ userInput +"\"");
//    }
//}

class addNum {

    public static void main(String[] args) {

        Scanner readme = new Scanner(System.in);
        System.out.println("Enter Two Numbers to add (Press Enter after each):");
        //two variables to hold numbers
        int n1, n2, n3;
        n1 = readme.nextInt();
        n2 = readme.nextInt();
        n3 = n1 + n2;
        System.out.println("Total = " + n3);

    }
}
