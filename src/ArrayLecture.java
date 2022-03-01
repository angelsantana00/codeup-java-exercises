import java.util.Arrays;
import java.util.Scanner;

public class ArrayLecture {

    public static void main(String[] args) {

        String[] weatherType = new String[3];
        weatherType[0] = "snowy";
        weatherType[1] = "sunny";
        weatherType[2] = "rainy";

        System.out.println(weatherType[2]);

//        long[] dailySteps = {100000, 200000, 300000};


        //To print int arrays
        int[] dailyNum = {1, 2, 3, 4};
        System.out.println(Arrays.toString(dailyNum));

        //TRADITIONAL FOR LOOP
//        String[] names = {"Cody", "Ken", "Jordy", "Laura"};
//        System.out.println(names.length);
//        for (int i = 0; i < names.length; i += 1) {
//            System.out.println(names[i]);
//        }

        //<---------------------------------------------->//

        // ENHANCED FOR LOOP
        String[] names = {"Cody", "Ken", "Jordy", "Laura"};
        System.out.println(names.length);
        for (String name: names) {
            System.out.println(name);
        }

        //<---------------------------------------------->//

        int[] sumAll = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i : sumAll) {
            sum += i;
        }
        System.out.println(sum);

        //<---------------------------------------------->//

                int i = 0;
                int EvenSum = 0, OddSum = 0;
                int[] numbs =  {1, 2, 3, 4, 5, 6, 7, 8};

                for(i = 0; i < 20; i++)
                {
                    if(numbs[i] % 2 == 0)
                    {
                        EvenSum = EvenSum + numbs[i];
                    }
                    else
                    {
                        OddSum = OddSum + numbs[i];
                    }
                }
                System.out.println("\n Sum of Even = " + EvenSum);
                System.out.println(" Sum of Odd = " + OddSum);


    } // public static void main

} //public class ArrayLecture
