package classCodes.f5_Loops;

public class WhileLoop1 {

    public static void main(String[] args) {

         // int x = 0;

//		 () ---> boolean litteral true or false
//
//		 boolean variables boolean b= true----->b
//
//		 boolean expression : x<5;

        //	boolean b =true;

        //       while (b) {   bu sekilde dersen nerede duracagini soylemedigin icin surekli yazacak

        //iteration 1 : 1
        //iteration 2 : 2
        //iteration 3 : 3
        //iteration 4 : 4
        //iteration 5 : 5 ve looptan cikti
        int x = 0;

        while (x < 5) {

            System.out.println("Happy Birthday Nurilla! " + x); //x koydugumuzda yazinin yanina sifirdan 4 e kadar yaziyor.
            // eger 5 olmasini da isteseydik <= koymak isterdik

            x++;
        }

        //Dry Principle
        //Dot Repeat yourself

        int z =10 ;

        if (z>5) {
            System.out.println("Do This");
        }else {
            System.out.println("Do That");
        }

        int y = 10;  //9 dan basliyor yazdirmaya

        //	while (y > 5) { // with ++ it will go forever, we need to put good condition

        while (y > 5) {

            System.out.println("Print This " + y--); //y -- yukarida yazmak yerine parantez icin
            //--y de yazabilirsin eger saga koyarsan 9dan yazar geriye
            //y-- yazarsan 10 dan geriye yazar
        }

    }
}