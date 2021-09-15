package classCodes.f1_Intro;

public class ComparisonOperator1 {
    public static void main(String[] args) {

        // COMPARISON OPERATOR

        //if you have two number how to compare them? it gives true or false as a result

        int a = 10 , b=10 ;

        //checking for equality ---- ==


        // checking for equality    --  ==
        System.out.println("a and b equal : "  + (a == b)  );

        // checking for inequality    --  !=
        System.out.println("a and b not equal : "  + (a != b)  );

        // checking for greater or equal    --  >=
        System.out.println("a is greater or equal to b : "  + (a >= b)  );

        // checking for greater         --  >
        System.out.println("a is greater than b : "  + (a > b)  );

        // checking for less or equal    --  <=
        System.out.println("a less or equal to b : "  + (a <= b)  );

        // checking for less than         --  <
        System.out.println("a less than b : "  + (a < b)  );


	  /*   Comparison Operator

       ==      equal
       !=      not equal
       <       less than
       <=      less than OR equal
       >       greater than
       >=      greater than OR equal
 */

        a = 10;
        b = 11;
        int d = 10;

       System.out.println(a > b);     //console output false because b is greater than a.
       System.out.println(a < b);     //console output true because b is greater than a.
       System.out.println(a == b);    //console output false because two numbers are not equal.
       System.out.println(a != b);    //console output true because two numbers are not equal.
       System.out.println(a == d);    //console output true because two numbers are equal.

       boolean isAequalToB = (a==b) ;


    }

}
