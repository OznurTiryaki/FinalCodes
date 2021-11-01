package classCodes.f3_StringAndStringMethods;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        Scanner scan = new Scanner (System.in);

        System.out.println("Please enter First Value");
        int x = scan.nextInt();

        System.out.println("Please enter Second Value");
        int y = scan.nextInt();


        love6(x,y);   						      	//parameter


    }

    public static void love6(int n,int s) {   	// argument
        boolean k;

        if(n-s==6 || n-s==-6 ||s-n==6||s-n==-6||n+s==6 || n==6 || s==6) {
             k = true;
            System.out.println(k);
        }else {
             k = false;
            System.out.println(k);

        }}}