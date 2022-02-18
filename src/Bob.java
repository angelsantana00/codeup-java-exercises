import java.util.Scanner;

public class Bob {

    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);

        String name = "Bob";
        String Response1 = "Sure";
        String Response2 = "Whoa,chill out";
        String Response3 = "Fine. Be That Way!";
        String Response4 = "Whatever";
        String input;

        input = in.nextLine();

        do {
            if (input.endsWith("?")) {
                System.out.print(Response1);
                break;

            } else if (input.endsWith("!")) {
                System.out.print(Response2);
                break;

            } else if (input.equals("")) {
                System.out.print(Response3);

            } else {
                System.out.print(Response4);
            }
            break;
        } while (true);
    }
}
