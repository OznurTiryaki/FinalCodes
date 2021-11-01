package classCodes.f3_StringAndStringMethods;

public class StringMethods13 {

    public static void main(String[] args) {

        /*lastIndexOf
        lastIndexOf(String str)
        lastIndexOf(String str, int fromIndex)
        lastIndexOf( int char)
        lastIndexOf( int char,int fromIndex)
        An int value, representing the index of the first occurrence of the character in the string, or -1 if it never occurs */


        String str = "Java is fun !";

        //give me part of string from location 6 till 10

        int index = str.lastIndexOf(" ");

        System.out.println(str.substring(6, 11)); // we use methods and find index to remove hard code

        System.out.println("lastIndexOf : " + index);

        System.out.println("lastIndexOf : " + str.lastIndexOf("a"));

        // index 5 den geriye dogru search ederek ilk e yi buluyor
        String myStr = "Hello planet earth, you are a great planet.";

        System.out.println(myStr.lastIndexOf("e", 5));

    }

}
