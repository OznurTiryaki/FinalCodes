package classCodes.f5_Loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DoWhileLoop1 {


    public static void main(String[] args) {

        // while loop
        // do while
        // for loop  // for each loop

//		    int x = 1 ;
//		    while(x<6) {
//		      System.out.println( x++ );
//		    }
		    /*
		     *do {
		       action to be repeated
		       } while (a condition is true );
		     *
		     * COMPARE TO WHILE LOOP
		     * Do while loop
		     * check the condition after the first iteration
		     *
		     * */

        /*  task 5
         * count from 1 - 100 in same line
         * */
        /*  count from 100 - 1 in same line
         *
         * */


        int x =0 ;

        do {

            x++ ;

            System.out.println(x);

        }while (x < 10);

        System.out.println("-------------------------------------");

        int y = 1 ;
        do {

            System.out.print(y++  + " ");

        }while(y<= 5) ;

        System.out.println();

        System.out.println("y value: " + y);   //6 cunku loop bitti tekrar yukari cikti ve artirdi asagi inip

        do {     //y degeri 6 ama once azaltacak/ en son condition bitmeden tekrar gelip azaltacak , bu sebeple y degeri 1 kalir.
            System.out.print( --y + " ");
        } while ( y > 1);


    }

}


