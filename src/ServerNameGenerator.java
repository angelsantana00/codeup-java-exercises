import java.util.Random;

public class ServerNameGenerator {

    public static void main(String[] args) {
        String[] adjectives = {"Ugly", "Beautiful", "Weird", "Nasty", "Delicious", "Smelly", "Cute", "Blue", "Big", "Small"};
        String[] nouns = {"Game", "Computer", "Destiny", "Dog", "Cat", "Car", "Laptop", "Person", "Poop", "Dude"};

        Random r = new Random();
        System.out.println("Here is your government name: ");
        int randomAdj = r.nextInt(adjectives.length);
        System.out.print(adjectives[randomAdj] + "-");
        int randomNoun = r.nextInt(nouns.length);
        System.out.print(nouns[randomNoun + randomAdj]);

    }
}
