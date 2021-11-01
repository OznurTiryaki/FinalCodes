package bugBusters;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {


//			W B W B W B W B
//			B W B W B W B W
//			W B W B W B W B
//			B W B W B W B W
//			W B W B W B W B
//			B W B W B W B W
//			W B W B W B W B
//			B W B W B W B W
//
//			NOTE:
//			1. Total 8 rows and 8 columns.
//			2. "W" and "B" are in alternate positions (row-wise or column-wise),
//			you will not find consecutive W or B.


//        for (int i = 0; i < 1; ++i) {
//            for (int j = 0; j < 8; j++) {
//                if (j % 2 == 0) {
//                    System.out.println("W B W B W B W B");
//
//                } else {
//                    System.out.println("B W B W B W B W ");
//
//                }
//            }
//        }
//
//        for (int i = 1; i <= 7; i++) {
//            for (int j = 1; j <= i; j++) {
//                if(j%2==0){
//                 System.out.println(0);
//                }else{
//                 System.out.println(1);
//             }
//                System.out.println();
//        }

//            for(int i=1; i<=7; i++){
//                for(int j=1; j<=i; j++){
//                    if(j%2==1){
//                        System.out.print(1);
//                    }
//                    else{
//                        System.out.print(0);
//                    }
//
//                }
//                System.out.println();
//            }
//        }
//    }


        for (int x = 6; x >= 1; x--) {
            for (int y = 1; y <= x; y++) {
                System.out.print(y+ " ");
            }
            System.out.println();
        }

        for (int x = 7; x >= 2; x--) {
            for (int y = 1; y <= x; y++) {
                System.out.print(y+ " ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


        for (int i = 1; i <= 7; i++){
            for (int j = 1; j <= 7-i ; j++) {
                System.out.print(1);
            }

            for(int j=1; j<=i ;j++){
                System.out.print(i);

            }
            System.out.println();

        }


//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15


//        for (int i = 1; i <= 5; i++) {
//            int k=i;
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(k+" ");
//             k+=5-j;
//
//            }
//            System.out.println();
//        }




    }}





