package classCodes.f3_StringAndStringMethods;

import java.util.Scanner;

public class StringEquality1 {

    public static void main(String[] args) {

        String name = "Lachyn" ;

        // boolean b = (name ==  "Lachyn"); //it is not for equality this time

        // we use method from String class called equals

        boolean b = name.equals("Lachyn");

        System.out.println(b);

        System.out.println("------------------------------------");

        // first create a scanner
        //ask question for scanner
        //later write your expected name

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name");

        String name1 = scan.next();

        boolean expextedName = name1.equals("Oznur");

        System.out.println(expextedName);

        //if (expextedName){ seklinde de yazabilirsin
        if(name1.equals("Oznur")){

            System.out.println("That's my name!");

        }else {

            System.out.println("That's not  my name!");

        }




    }

}
