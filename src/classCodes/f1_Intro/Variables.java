package classCodes.f1_Intro;

public class Variables {

    public static void main (String args []){

        System.out.println("Hello World");

        System.out.println("Hello Again");

        System.out.println("Hello at last");

        // line command
        /* it is for block command

         */

        int a = 10; //it name declare variable
        int b = 20;

        System.out.println ( a );

        System.out.println ( b) ;

        System.out.println(a+b);


        // ink k;
        //int m; valueleri yan yana yazabiliriz

        int k,m ;

        k = 100 ; //assignment
        m = 200 ;

        System.out.println(k+m);

        k = 300; //we did re-assign //boylece ilk verdigimiz deger iptal oldu

        System.out.println(k+m); //500

        k = m; //this means, copy the value of m into k

        System.out.println(k);

        System.out.println(k+m); //k, m degerini aldi ve toplamlari 200+200=400 etti

    }
}
