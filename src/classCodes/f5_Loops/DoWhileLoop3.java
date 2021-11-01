package classCodes.f5_Loops;

public class DoWhileLoop3 {

    public static void main(String[] args) {

        int x = 100;

        do {
            System.out.println("action repeated");  //eger while loop ile yapsaydik hic yazdirmayacakti ilkini
            //cunku condition false

        } while (x > 200); // condition false oldugu an looptan cikar, and while loopta once check ettigi icin
        //direk end e duser
        System.out.println("End");
    }

}