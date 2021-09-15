package classCodes.f2_ConditionalStatement;

public class TernaryOperator3 {
    public static void main(String[] args) {

        // Task
        double price = 10.5 ;

        String label;

   /*     if (price >100)      tek statement oldugu icin curly braces a gerek yok

        label = "expensive";

        else

        label = "cheap";  */

        label = (price >100) ?  "expensive" : "cheap";

        System.out.println(label);

     /*   or to make char

        char label;

         label = (price >100) ?  'A" : 'B';
        */

        if (price > 100) {

            label = "expensive";

        }else if (price > 90) {

            label = "moderate";
        }else {

            label = "cheap";
        }

        //NESTED TERNARY
                            //if kismi      //else kismi icinde nested var
        label = (price>100) ? "expensive" : ( (price>90) ? "moderate" : "cheap" )  ;

        System.out.println(label);
        //String label2 = (price<=100 && price>90) ? "moderate" : "cheapOrExp" ;

        String label2 = (price <= 100 && price >90) ? "moderate" : "cheapOrExp" ;

    }
}