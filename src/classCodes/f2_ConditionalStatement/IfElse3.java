package classCodes.f2_ConditionalStatement;

import java.util.Scanner;

public class IfElse3 {
    public static void main(String[] args) {

        // Simple without Curly Braces

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers ");

        int x = scanner.nextInt();
        /*
         * boolean b = false ; () inside here , you can put boolean literal :
         * true false boolean variable : b boolean expression : any operation
         * that result in boolean
         *
         */
        // Curly braces for if and else blocks are optional
        // ONLY WHEN WE HAVE SINGLE STATEMENT !   sadece tek satir yazdiracaksak if else de parantez koymaya gerek yok.
        //ama birden fazla yazdigimizsa console a print etmez

         if(x != 10 )
         System.out.println("NOT 10 !"); //bunun altina bir statement daha yazarsak error verir
         else
         System.out.println("YES IT IS 10");

        // COMMAND SHIFT F
        // CTR SHIFT F

        if (x != 10) {
            System.out.println("NOT 10 !");
        } else {
            System.out.println("YES IT IS 10");
            System.out.println("YES IT IS 10 as i said");

        }

        System.out.println("------------------------------------");

        if (x != 10)
            System.out.println("NOT 10 !");
         else
            System.out.println("YES IT IS 10");
            System.out.println("YES IT IS 10 as i said"); //burada error vermiyor cunku if statement bitmis kabul edip normal print ediyor

    }


}
