package classCodes.f5_Loops;

public class WhileLoop11 {
    public static void main(String args[]) {


        String app = "app";
        String reversedApp = "";

//	    reversedApp = reversedApp + app.charAt(2) ;
//
//	    System.out.println(reversedApp);
//
//	    reversedApp = reversedApp + app.charAt(1) ;
//	    System.out.println(reversedApp);
//
//	    reversedApp += app.charAt(0) ;
//	    System.out.println(reversedApp);

        int x = 2;   //or app.length-1 bize last index i verir

        while (x >= 0) {

            //  System.out.println( x );
            reversedApp = reversedApp + app.charAt(x);
            System.out.println(reversedApp);
            x--;

        }
        System.out.println("final value of reversed word is " + reversedApp);


    }

}


 /*
   APPLE REVERSE
   String apple= "Apple";
   String reverseApple ="";

   int x=apple.length()-1;
   while (x>=0){
           reverseApple+= apple.charAt(x);
           x--;
           }
           System.out.println(reverseApple);

 */