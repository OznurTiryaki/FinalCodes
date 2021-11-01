package classCodes.f5_Loops;

public class DoWhileLoop7 {

    public static void main(String[] args) {

        // java20awesome---->> javaawesome    20

//        String mix = "Aonline132x";
//
//        char c = mix.charAt(0);
//
//        // check whether c is between 0 - 9
//        //if( c>= 32 && c<= 41 ) {
//
//        if( c>= '0' && c<= '9' ) {
//            System.out.println("NUMBER!!");
//        }else {
//            System.out.println("NOT NUMBER!!");
//        }
//
//        if( c>= 'A' && c<= 'Z' ) {
//            System.out.println("UPPERCASE!!");
//        }else {
//            System.out.println("NOT UPPERCASE!!");
//        }
//

        String mix = "Aonline132x";
        int i = 0; // this our starting index
        String numberStr = "";
        String azStr = "";
        while (i < mix.length()) {

            char c = mix.charAt(i);

            if (c >= '0' && c <= '9') { // print 132 because just them in condition 0 ya da 9 yerine harf yazsak onlari
                // yazacakti
                System.out.println(c);
                numberStr = numberStr + c;
            }

            i++;

        }
        System.out.println(numberStr);

        System.out.println("**********************");

        int y = 0;

        do {

            char c = mix.charAt(y);


            if (c >= 'a' && c <= 'z') {
                System.out.println(c);
                azStr = azStr + c;

            }
            y++;

        } while (y < mix.length());


        System.out.println(azStr);

    }
}


 /*
   FINAL MINE
  WITH WHILE LOOP

   String mix = "Aonline132x";
    int x=0;
    String numbers="";
    String letters="";
        mix=mix.toLowerCase();

                while (x<= mix.length()-1) {
                if (mix.charAt(x) >= 'a' && mix.charAt(x) <= 'z') {
                letters += mix.charAt(x);
                }
                if (mix.charAt(x) >= '0' && mix.charAt(x) <= '9') {
                numbers += mix.charAt(x);
                }
                x++;
                }
                System.out.println(letters);
                System.out.println(numbers);

WITH DO WHILE LOOP

  String mix = "Aonline132x";
        int x = 0;
        String numbers = "";
        String letters = "";
        mix = mix.toLowerCase();
        do {
            if (mix.charAt(x) >= 'a' && mix.charAt(x) <= 'z') {
                letters += mix.charAt(x);
            }
            if (mix.charAt(x) >= '0' && mix.charAt(x) <= '9') {
                numbers += mix.charAt(x);
            }
            x++;
        } while (x <= mix.length() - 1);
        System.out.println(letters);
        System.out.println(numbers);
*/