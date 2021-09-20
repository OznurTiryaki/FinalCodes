package classCodes.f4_Casting;

import java.util.Scanner;

public class Casting2 {

    public static void main(String[] args) {

        // Char   to Number
        // (String icinden charAt methodu ile character buluyorsun)


        String first = "Francesqua";
        char last = first.charAt(first.length()-1);

        char fChar =first.charAt(0);

        int lastCharNum = last ;
        System.out.println(lastCharNum);    //97

        int firstCharNum = fChar ;  //F 'in asci table karsiligi bulunuyor
        System.out.println(firstCharNum);   //70

        char character0 = '0' ;       //burada sifiri deger olarak degil char olarak aliyoruz. ASCI table da hangi degere karsilik geliyorsa onu verecek.)
        int zeroAsciiNumber = character0 ;
        System.out.println(zeroAsciiNumber);  //48

        char characterA = 'A' ;
        System.out.println(   (int) characterA    );  //65  //A'nin ASCI table daki degerine gore convert ediyor

        System.out.println( fChar + lastCharNum );   //167

        System.out.println("----------------------------------------------------------");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name:");

        String name = scan.next();

        char firstCharacter = name.charAt(0);
        char lastCharacter = name.charAt(name.length() - 1);

        System.out.println(firstCharacter + " " + lastCharacter);

        int firstCharacterNumber = firstCharacter;

        System.out.println(firstCharacterNumber);   //111

        int lastCharacterNumber = lastCharacter;

        System.out.println(lastCharacterNumber);  //114

    }

}
