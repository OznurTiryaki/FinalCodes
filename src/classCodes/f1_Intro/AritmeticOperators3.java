package classCodes.f1_Intro;

public class AritmeticOperators3 {

    public static void main(String args []) {

        //integer type (whole number)
        //   1.byte,
        //   2.short,
        //   3.int,
        //   4.long

        //floating-point
        //   1.float                when we use float we must put the f at the end of value.
        //   2.double

        //single character & boolean
        //   1.char
        //   2.boolean

        //    arithmetic operators- addition, subtraction, multiplication, division, remainder
        // + - * / %

        /* +=   -=   /=  *=  %=
         * there is shorthand operator--- just a shortcut
         *
         * CAREFUL
         * int i= 10;
         * System.out.println("the score is" + i);
         *
         * i= i+5; dedigimizde normal matematik islemi degil re-assignment yapiyoruz.
         * i= i -2; dedigimizde i =13 re-assignment i=i -2 yerine i -= 2 diyebilirsin
         * i-=2;
         */


        System.out.println(1%5);    //interesting-small number cannot divide bigger one
        System.out.println(5%1);
        System.out.println(6%7);    //interesting/ remainder is first one always-bolunemiyor ama ilk rakam hangisiyse direk onu aliyor.
        System.out.println(7%6);  //1


        System.out.println("-------------------------------------------------------");

        // Warm Up

        // declare a variable OfferCount and give initial value of 1 ;

        int offerCount = 1;

        // lets imagine you got five offer today--shorthand assignment

        offerCount += 5;

        System.out.println(offerCount);

        // you have rejected two of them

        offerCount -= 2;

        System.out.println(offerCount);

        // then after a week, your offer multiplied by 4

        offerCount *= 4;

        System.out.println(offerCount);

        // then you decided cut the offer count to half of what you have

        offerCount /= 2;

        System.out.println(offerCount);

        // eventually you want to get remainder by 5;

        offerCount %= 5;

        System.out.println(offerCount);

        System.out.println("-------------------------------------------------------");

        // celcius Note: you have to write celcius = (5.0 / 9) * (fahrenheit – 32)


        double fahrenheit = 80;
        double celcius = (5.0/9) * (fahrenheit - 32);
        //one number need to be write as a double to get double result.
        //thats why we wrote 5.0
        //or put d to say it is double (5d/9)or (5/9d)

        System.out.println("the celcius value is " + celcius);

       // System.out.println(5/0); make me error always, you cannot divide the zero ---ArithmeticException

        System.out.println("-------------------------------------------------------");

        /* TASK
		Multiply i's value by 10 */

        int i= 13;
        // i= i * 10;

        i *= 10;  //i=i*10

        System.out.println("The score is now " + i);

        i /=5;	//i= i /5; it is same meaning, better to use shortcut

        System.out.println("The score is now " + i);

        i %=7; //i= i%7;

        System.out.println("The score is now " + i);


    }
}
