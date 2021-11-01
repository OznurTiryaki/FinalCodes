package classCodes.f4_Casting;

import org.omg.CORBA.ORB;

public class Casting4 {

    public static void main(String[] args) {

        // comparison/ relation operator

        char c1 = 'A' ;   //ASCI tablosundaki degerlerine gore bakiyoruz

        char c2 = 'B' ;

//        int c1Value=(char) c1;    //65
//        int c2Value=(char) c2;   //66
//        System.out.println(c1Value+"\n"+c2Value);
//        OR
//        System.out.println((int)c1+"\n"+(int)c2);



        System.out.println(c1 == c2);   //false

        System.out.println(c1 != c2);   //true

        System.out.println(c1 >= c2);   //false

        System.out.println(c1 < c2);   //true

        System.out.println(c1 <= c2);  //true

        c1 = 'a' ;

        System.out.println( (int) c1);   //lowerCase bigger than upper case at table   -->97

        System.out.println( (int) c2);  //66

        char c3 = ' ';

        System.out.println( (int) c3);  //space is lowest one  -->32

        //	lowercase> uppercase>number>special character  ( higher  to lower ASCII value )
    }
}
