package classCodes.f5_Loops;

public class WhileLoop20 {

    public static void main(String[] args) {

        String str = "ABCDEFGHIJK";
//        print 2 letter at a time compared to one from previous tasks
//   ABCDEFGHI  --> AB CD EF GH I

        for (int i = 0; i < str.length(); i += 2) {
            if (i != str.length() - 1) {
                System.out.print(str.substring(i, i + 2) + " ");
            } else {
                System.out.print(str.substring(i));
            }
        }
        System.out.println();
//   ABCDEFGHI  --> ABC DEF GHI
        for (int i = 0; i < str.length(); i += 3) {


            if (i != str.length() - 2) {  //out of range olmamak icin azaltiyorsun.
                //3 azaltmadik cunku zaten normalde bir azini yazdiriyoruz
                System.out.print(str.substring(i, i + 3) + " ");

            } else {
                System.out.print(str.substring(i));

            }
        }

    }
}
