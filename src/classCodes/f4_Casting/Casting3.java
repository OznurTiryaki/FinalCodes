package classCodes.f4_Casting;

public class Casting3 {

    public static void main(String[] args) {

        //NUMBER TO CHAR
        int x = 100;

        char myChar = (char) x; //you need to convert, int bigger than char

        System.out.println(myChar);

        double y = 100.99;

        char myChar2 = (char) y;

        System.out.println(myChar2); //lost information int olarak alir cunku ASCI table da decimal number yok
    }

}
