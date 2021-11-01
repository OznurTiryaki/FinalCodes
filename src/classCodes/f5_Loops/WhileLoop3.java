package classCodes.f5_Loops;

public class WhileLoop3 {

    public static void main(String[] args) {

        // ------------TASK 2-------------------//
        // print even number from 0-10

        int y = 0;

        while (y <= 10) {

            System.out.println("the even number: " + y);

            y += 2; // shorthand operator

        }

        System.out.println("----------------------------------------------");

        //OR
        int z = 0;

        while (z <= 10) {
            if (z % 2 == 0) {
                System.out.println(z);
            }
            z++;
        }

    }
}