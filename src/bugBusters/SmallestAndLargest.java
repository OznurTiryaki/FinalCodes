package bugBusters;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class SmallestAndLargest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter your first number");
        int num1 = scan.nextInt();
        int max = num1;
        int min = num1;
        int num2;

        int askAnother;

        boolean cont = false;

        do {
            System.out.println("enter your next number");
            num2 = scan.nextInt();
            System.out.println();

            if (num2 > max) {
                max = num2;
            }
            if (num2 < min) {
                min = num2;
            }

            System.out.println("Do you want to enter another number 0:Yes, 1:No");
            askAnother = scan.nextInt();
            if (askAnother == 0) {
                cont = true;
            } else if (askAnother == 1) {
                cont = false;
            }



        }
        while (cont == true);

        System.out.println("Min " + min);
        System.out.println("Max " + max);



    }
}


//    public static void findSmallestAndLargest() {
//
//
//        int nums[] = {1, 4, 6, 8, 9, 5, -2};
//        int max = nums[0] ;
//        int min=nums[0];
//
//        for (int i = 1; i < nums.length; i++) {
//     if(nums[i]>max){
//         max=nums[i];
//     } else if(nums[i]<min){
//         min=nums[i];
//     }
//        }
//
//        System.out.println(min);
//        System.out.println(max);
//    }
//
//}



//    public static int findLargestNumber10(int[][] arr) {
//
//        int max = Integer.MIN_VALUE;
//
//        for(int[] each1 : arr) {
//            for(int each2 : each1) {
//
//                if(each2 > max)
//                    max = each2;
//            }
//        }
//
//
//        return max;
//    }
//