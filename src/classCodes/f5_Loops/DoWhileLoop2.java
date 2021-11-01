package classCodes.f5_Loops;

public class DoWhileLoop2 {

    public static void main(String[] args) {

        // How many letter A SHOWED UP IN THIS STRING  --make it do while

        String str = "Jaaaava";

        //GO TO EACH AND EVERY CHARACTER, if I see a, it will increment my counter by 1

        int count = 0;
        int x = 0;  //index str yani kac kelime str ona bakicaz


        do {
            char c = str.charAt(x);    //it show us all character when we increase x

            if (c == 'a') {   //characterlerimizden herhangi birisi a ya esitse kac tanesi esit bunu icin count == yaptik

                System.out.println("BINGO at " + x); // bunu sadece a yi gordugunde biz gostersin diye yazdik. 5 kere bingo yazdi
                //cunku 5 a var +x dedigimixde de nerede oldugunu bulduk

                count++;
            }
            //how we do each character---->char

            x++;  //bunu hala yazdirmaya devam etmesi icin arttirdik/ characterleri yazdirir

        } while (x < str.length());
        System.out.println(count);
    }
}

/*
    String str = "Jaaaava";

    int x =str.length()-1;
    int count=0;

        do{
                if(str.charAt(x)=='a'){
                count++;
                }
                x--;
                }while(x>=0);

                System.out.println("count a in Jaaaava: " +count);


 */