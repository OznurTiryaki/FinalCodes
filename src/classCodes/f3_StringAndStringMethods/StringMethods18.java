package classCodes.f3_StringAndStringMethods;

import java.util.Scanner;

public class StringMethods18 {

    public static void main(String[] args) {

        Scanner scan =new Scanner (System.in);

        String str = scan.nextLine();

        //how to check whether a String Start with a-z

        char firstCharacter = str.charAt(0);

        //	System.out.println('a' > 'b');

        if (firstCharacter >= 'a' && firstCharacter <='z') {

            System.out.println("lower case letter");

        }else {

            System.out.println("NOT a-z");
        }

    }

}
