package classCodes.f2_ConditionalStatement;

import java.util.Scanner;

public class IfElse1 {

    public static void main(String[] args) {

        // Shoes Size between 6-12


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your shoes number");

        double shoesNumber = scan.nextDouble();


        if (shoesNumber > 12) {  //bununla (shoesNumber >6) 'un yerini degistirseydik logical hata olacakti cunku o zamn 13 den
            //sayilari da hesaplardi.
            System.out.println("Sorry we dont have big size");

        } else if (shoesNumber > 6) {

            System.out.println("We have this size in our stock");

        } else{

            System.out.println("We don't have smaller than 6");

    }

        System.out.println("----------------------------------------------------");

		System.out.println("Welcome to Okta to Slack");
		System.out.println("Enter the length of your username");

        int lengthOfNAme = scan.nextInt();

		if(lengthOfNAme >22) {

        System.out.println("Slack cannot take more than 22 character");

        //lengthOfNAme = 21;
        //System.out.println("user name has been adjusted");
        // System.out.println("Successfully added user"); if we don't write -else- it print everything parantex icinde
    }
}}



