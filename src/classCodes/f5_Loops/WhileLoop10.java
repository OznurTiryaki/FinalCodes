package classCodes.f5_Loops;

import java.util.Scanner;

public class WhileLoop10 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String theAnswer = "";

        while (!theAnswer.equalsIgnoreCase("yes")) {

            System.out.println("Do you Love Java ?");
            theAnswer = scan.next();
        }
        System.out.println("Finally, Correct Answer");
    }
}