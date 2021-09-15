package classCodes.f2_ConditionalStatement;

import java.util.Scanner;

public class TernaryOperator2 {

    public static void main(String[] args) {

        //FIZ BUZ TERNARY
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");

        int a = scan.nextInt();

        String result;

//        if (a % 5 == 0 && a % 3 == 0) {
//            result = "fizzBuzz";
//        } else {
//            result = "notfizzBuzz";
//        }

        result = (a % 5 == 0 && a % 3 == 0) ? "fizzBuzz" : "notfizzBuzz";
        System.out.println(result);
    }
}
