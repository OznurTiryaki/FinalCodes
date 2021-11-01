package classCodes.f5_Loops;

import java.util.Scanner;

public class WhileLoop12 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your name");

        String name= scan.next();

        int count= name.length();

        while (count > 0) {

            System.out.print(name.charAt(count-1) + " "); //son harften geriye dogru yazdir
            count --;


        }

    }

}
