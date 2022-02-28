import java.util.Arrays;

class ArraysExercises {

    public static void main(String[] args) {

        //TODO<------------------------ 1. Array Basics ---------------------->//
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        //TODO<------------------------ 1.A ---------------------->//
        Person [] people = new Person[3];
        people[0]= new Person("Master Chief");
        people[1]= new Person("Elden Ring");
        people[2]= new Person("Savathun");

        for (Person person : people) {
            System.out.println(person.getName());
            }

        //TODO<------------------------ 1.B ---------------------->//



    }//public static void main
} //public class ArraysExercises
