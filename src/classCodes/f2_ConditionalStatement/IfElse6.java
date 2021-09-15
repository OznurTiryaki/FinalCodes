package classCodes.f2_ConditionalStatement;

import java.util.Scanner;

public class IfElse6 {

    public static void main(String[] args) {

      //Banking App

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to CybertekBanking App");

        long accountNumber =123456L;

        String password = "abc123";

        System.out.println("Enter account number:");

        long ExpectedAccountNumber =scan.nextLong();

        //scan.nextLine();

        System.out.println("Enter account passport: ");

        String expectedPassword = scan.next();


        if (accountNumber == ExpectedAccountNumber  && password.equals(expectedPassword )) {

            System.out.println("Success");

        } else {
            System.out.println("Login Fails");
        }
    }
}

