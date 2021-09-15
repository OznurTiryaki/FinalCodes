package classCodes.f2_ConditionalStatement;

import java.util.Scanner;

public class TernaryOperator6 {

    public static void main(String[] args) {

        //FOR TWO CONDITION

        String weather ;
        String action;

        Scanner scan = new Scanner (System.in);

        System.out.println("how is weather today?");

        weather = scan.next();

        /// ALWAYSE USE  str1.equal(str2) for String equality check

        /// add 2 more condition nice or warm

        // && yaparsak calismaz cunku  ayni anda iki degeri girmiyoruz
        if(weather.equalsIgnoreCase("sunny")  ||  weather.equalsIgnoreCase("nice")     ){

            action = "go out";

        }else{

            action =  "stay home";

        }
        action = (weather.equalsIgnoreCase("sunny")  || weather.equalsIgnoreCase("nice") )
                ? "go out" : "stay home" ;

        System.out.println("THE ACTION according to weather is : " + action);


    }

}
