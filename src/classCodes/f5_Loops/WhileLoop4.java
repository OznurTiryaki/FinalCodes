package classCodes.f5_Loops;

public class WhileLoop4 {

    public static void main(String[] args) {

        int x = 50;

        while (x < 100) {

            if (x <= 70 && x % 2 == 0) {

                System.out.println("x odd values is: " + x);

            } else if (x % 2 == 1) {

                System.out.println("x even value is: " + x);
            }
            x++;

        }
    }
}
