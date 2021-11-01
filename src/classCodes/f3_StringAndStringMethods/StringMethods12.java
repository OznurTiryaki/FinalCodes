package classCodes.f3_StringAndStringMethods;

public class StringMethods12 {

    public static void main(String[] args) {

        //isEmpty() help to check String has anything inside

        String str = "";

        System.out.println(  str.isEmpty()  );  //true because we did not put anything inside

        String str2= "xx";

        System.out.println(  str2.isEmpty()  );  //false

        String str3= " ";

        System.out.println(  str3.isEmpty()  ); //false cunku space is a character at table

    }

}
