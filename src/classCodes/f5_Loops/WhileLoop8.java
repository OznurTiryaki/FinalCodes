package classCodes.f5_Loops;

import java.util.Scanner;

public class WhileLoop8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x = 0;

        while (x != 5) {   //yani diyoruz ki eger z 5 e esit degilse 5 verene kadar deger ver

            System.out.println("Give me 5");

            x = scan.nextInt();
        }
        System.out.println("Yay Good Job ");

    }
}
