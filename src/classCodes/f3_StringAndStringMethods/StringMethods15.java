package classCodes.f3_StringAndStringMethods;

public class StringMethods15 {

    public static void main(String[] args) {

        // startsWith(String str)

        String str = "Busra" ;

        System.out.println(str.startsWith("B") );  //true
        System.out.println(str.startsWith("ABC")  );   //false

        boolean  b = str.startsWith("Bu");  //true

        if (b) {

            System.out.println("successful");

        }else {

            System.out.println("Not a Bu");
        }
    }

}