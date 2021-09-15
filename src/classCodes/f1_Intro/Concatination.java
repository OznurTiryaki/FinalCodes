package classCodes.f1_Intro;

public class Concatination {

    public static void main (String args []){

        String name = "Cybertek";
        String state = "Virginia";
        System.out.println("I study coding at" + " " + name + " "+ "in " + state + ".");


        int result = 1+2;  //3
        int previousResult = result;  //3
        result = result-1;  //2
        System.out.println(previousResult + "-1=" + result);
        //previousResult still 3 it is not change with result value

        System.out.println("-----------------------------------------");

        int a = 10;
        int b = 20;
        int c = a + b;

        // the result of concatenating a string with Any Data type -----String

        System.out.println("The result of a + b is --- " + c); //string ile concatination yapiyor

        String sentence = "The result of a + b is ---";

        String finaloutput = sentence + c;

        System.out.println(finaloutput);

        // String yazmasak tanimlayamayiz

        System.out.println("-----------------------------------------");

        String firstName = "Oznur";
        String lastName = "Tiryaki Karakus";
        String city = "Austin";
        String nationality = "Turkish";

        System.out.println("My name is " + firstName + " " + lastName + "." + "I live in" + " " + city + "." + "I'm "
                + nationality + ".");

        System.out.println("My name is " + firstName + " " + lastName + "." + "\n" + "I live in" + " " + city + "."
                + "I'm " + nationality + ".");

        // "\n" new line -print ettiginde alta gecmeni sagliyor

        //"\t" new tab -space degil tab. baya bir space birakiyor.
        //bosluk veya noktali harf koymak istersen ayni yazidaki gibi cift tirnak icine aliyorsun

        System.out.println("-----------------------------------------");


    }
}
