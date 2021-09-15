package classCodes.f1_Intro;

public class AritmeticOperators1 {

    public static void main(String[] args) {

        //ARITMETIC OPERATORS

        /*task

         * Create 2 double variable num1, num2   assign value to the variable
         * create 2 more double variable additionResult , substractionResult
         *
         * print two statement in your console
         * 	the result of addition is --> your result
         *  the result of subtraction  is -- you result

         *
         * */

        int n1 = 4 + 3 * 2;

        System.out.println(n1);

        n1 = (4 + 3) * 2;

        System.out.println(n1);

        /* Order of operator precedence
         * multiplication/division/modulus
         * addition/subtraction
         * sirayla carpma,bolme,kesir alma sonra toplama ve cikarma islemleri yapilir.
         * ancak parantes varsa her zaman ilk parantez alinir
         */
        n1 = (4+3) * 2 + 4 / 2 ;

        System.out.println(n1);

        System.out.println("-------------------------------------------");

        double num1 = 12.5;

        double num2 = 22.4;

        double addition = num1 + num2;

        double subtraction = num1 - num2;

        double division = num1 / num2;

        double multiplication = num1 * num2;

        double remainder = num1 % num2;



        System.out.println("the result of addition is " + addition);

        System.out.println("the result of subtraction is " + subtraction);

        System.out.println("the result of division is " + division);

        System.out.println("the result of  multiplication is " + multiplication);

        System.out.println("the result of  remainder is " + remainder);

        System.out.println(addition + "," + subtraction+ "," + division+ "\n" + multiplication + "," + remainder);

        //\n alt satira gecmesini sagliyor printin


		/*
		System.out.println("the result of addition is " + num1 + num2); seklinde yazarsak num1 ve num2
		degerlerini toplamak yerine sadece yan yana yazar (String ile primitive type i concat edersen stringe donusur)
		like ---the result of addition is 12.522.4


		System.out.println("the result of addition is " + (num1 + num2)); parantez icinde yazarsak
		degeri toplayip oyle verir

		like---the result of addition is 34.9

		*/

        System.out.println("the result of addition is " + num1 + num2);

        System.out.println("the result of addition is " + (num1 + num2));

        System.out.println("---------------------------------------------------------");

        int i = 13;
        int j = 5;

        System.out.println("The result of multiplication is ---" + (i + j) + ".The result of subtraction is ---"
                + (j - i) + ".The result of divison is ---" + (i / j));

        // sonuc kalanli ise ve tam sonuc cikasini istiyorsan double ile yazman lazim

        /*
         * biri int biri double yazarsan sonucu buyuk olana gore alir ve tum sayilari
         * kalanli yazar. tam sayilari da ex:12.0 gibi yazar
         */

        System.out.println("---------------------------------------------------------");

        int a = 12;
        double b = 5;

        System.out.println("The result of multiplication is:" + (a + b) + ".The result of subtraction is:"
                + (a - b) + ".The result of divison is:" + (a / b) + "." + " The remainder of division is:" + (a%b));

        // "\n" ile sonuclari alt alta new line a gecerek sonuclari alt alta yazdirdim

        System.out.println("The result of multiplication is:" + (a + b) + "\n" + "The result of subtraction is:"
                + (a - b)+ "\n" + "The result of divison is:" + (a / b) + "."+ "\n" + "The remainder of division is:" + (a%b));


        System.out.println((5*6+3-2)-3*3);  //22

        System.out.println(6-3*2+7-1); //6


    }

}
