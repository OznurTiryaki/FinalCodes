package classCodes.f5_Loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DoWhileLoop8 {

    public static void main(String[] args) {

//		ASK USER TWO NUMBER
//		KEEP ASKING UNTIL THE SUM OF
//		TWO NUMBERS ARE MORE THAN 100
//		PRINT THE END AFTER THE LOOP
//		OPTIONAL : 3 ATTEMPS ONLY

        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        do {
            System.out.println("enter two numbers");

            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            sum = num1 + num2;
            count++;

            if (count == 3) {
                System.out.println("you cannot try more than 3");
                break;

            }
        } while (sum <= 100);

        System.out.println("Loop Done");


    }

}

/*
 MINE FINAL (asking many numbers in 3 attempt)
    Scanner scan = new Scanner(System.in);
    int sum = 0;
    int count = 0;
        do {
                System.out.println("Please enter a number");
                int num = scan.nextInt();
                sum += num;
                count++;
                if (count == 3) {
                System.out.println("You have only 3 attempt");
                break;
                }
                } while (sum <= 100);

                System.out.println("Sum is: " + sum);


 */