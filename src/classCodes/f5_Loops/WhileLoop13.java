package classCodes.f5_Loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class WhileLoop13 {

    public static void main (String args []) {

        // best way reverse the word and compare with the other word, is it same or different
        //ex:palindrome---> ana reversed ana

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your name");

        String name= scan.next();

        int count= name.length();

        String reserved= "";

 /*       in order to reverse a String
        we can start getting the chars in reversed order
        by using charAt method
        since the order is decrementing, we use --
        in order to save the reversed word, we need a container
        before we reverse the word, just put empty value in container
         while we looping through each chars,
        while we looping through each chars,
        concatinate this character to variable value
        after the loop we will have the word stored in reversed order    */


        while (count > 0) {

            //System.out.print(name.charAt(count-1) + " "); //son harften geriye dogru yazdir

            reserved = reserved + name.charAt(count-1);
            count--;
            System.out.println( reserved ); //println show us step by step

        }
        System.out.println("Palindrome " +name.equals(reserved));
    }
}



/*    Scanner scan= new Scanner (System.in);

    String word= scan.next();
    String reverseWord="";
    int x=word.length()-1;
        while (x>=0){
                reverseWord+= word.charAt(x);

                x--;
                }

                System.out.println(word + "\n"+reverseWord);
                if(word.equals(reverseWord)){
                System.out.println("palindrome");
                }else{
                System.out.println("NOT palindrome");
                }

*/
