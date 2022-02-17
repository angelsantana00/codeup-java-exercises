public class ControlFlowExercises {

    public static void main ( String[] args) {

        // -------------- 1A. ------------------- //
//        int i = 5;
//        while(i <= 15){
//            System.out.println(i);
//            i++;
//        }

        // ------------- 1B. ------------------- //
//        int i = 0;
//        do {
//            System.out.println(i);
//        i+=2;
//        }while (i <= 100);

//        int i = 100;
//        do {
//            System.out.println(i++);
//            i-=6;
//        } while (i>=-10);

//        long i = 2L;
//            do {
//                System.out.println(i);
//                i = (long) Math.pow(i,2);
//            } while (i < 1000000);

            // ----------------- 2. ----------------- //
        String mult3 = "Fizz";
        String mult5 = "Buzz";
        String mult3and5 = "Fizzbuzz";

        for (int i = 1; i <101 ;i++ ) {
            if ((i % 3==0) && (i % 5==0)){
                System.out.println(mult3and5+" ");
            }
            else if (i%5==0){
                System.out.println(mult5+ "");
            }
            else if ((i %3==0)){
                System.out.println(mult3 + "");
            }
            else
                System.out.println(i);
        }


    }
}
