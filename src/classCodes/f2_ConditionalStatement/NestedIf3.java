package classCodes.f2_ConditionalStatement;

import java.util.Scanner;

public class NestedIf3 {
    public static void main(String[] args) {

        // FIZBUZZ

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter number for a:");

        int a = scan.nextInt();

        if (a % 5 == 0 && a % 3 == 0) {

            System.out.println("fizz buzz");

        } else if (a % 5 == 0) {

            System.out.println("fizz");

        } else if (a % 3 == 0) {
            System.out.println("buzz");

        } else {
            System.out.println("not valid number");

        }
    }
}

