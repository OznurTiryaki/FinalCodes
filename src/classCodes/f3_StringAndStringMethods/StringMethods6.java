package classCodes.f3_StringAndStringMethods;

public class StringMethods6 {

    public static void main(String[] args) {

//		 Task 1
//
//		Store your name into String
//		find your name lenght
//		find first character
//		find last character
//		find first and second character

        String name = "Oznur";

        int count= name.length(); // if we dont know name

        System.out.println(name.toUpperCase());  //cover to all letter uppercase

        System.out.println(name.toLowerCase()); //cover to all letter lowercase

        System.out.println(name.substring(count-1, count)); //count last character -1

        //because count = length is how many number starting at one, -1 to get index of last character
        //so if you start at last and end at length you will only get the last character.

        System.out.println(name.length());

        System.out.println (name.charAt(0));

        System.out.println (name.charAt(4));

        System.out.println (name.substring(0,2)); // 2 because not include end one, it print one before
        System.out.println("--------------------------------------");

//		first character index is always 0
//		last character index is always one less than actual count of character
//		word.length()-1  -----but if we take a input for word
//		System.out.println(word.charAt(word.length()-1));
//		length () no taking external data and returning a number
//		charAt(1) one external data/argument and returning data
    }
}
