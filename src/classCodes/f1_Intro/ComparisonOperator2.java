package classCodes.f1_Intro;

import java.util.Scanner;

public class ComparisonOperator2 {

    public static void main(String[] args) {

        // CREATING SCANNER OBJECT AND USE COMPARISON OPERATOR

        Scanner input = new Scanner(System.in);

        // ask user questions

        System.out.println("Enter number 1 : ");

        int num1 = input.nextInt();

        System.out.println("Enter number 2 : ");

        int num2 = input.nextInt();

        boolean isGreater = num1 > num2;

        System.out.println("IS NUMBER 1 GREATER THAN NUMBER 2 : " + isGreater);


        System.out.println("---------------------------------------------");

        System.out.println("Please enter your age");

        int drivingAge = input.nextInt();

        if (drivingAge>17) {

            System.out.println("You can drive car");
        }else{
            System.out.println("You are too young babe");
        }
        input.close();

    }
}
