package classCodes.f5_Loops;

public class ForLoop7 {
    public static void main(String[] args) {

        // LOOP CONTROL STATEMENT

        for (int i = 0; i < 10; i++) {

            if (i == 5) { // bunu yaptigimizda 5 i yazdirmadi cunku continue
                // sadece o iterationi skip etmeni sagliyor
                continue;
            }
            // break;   //if we put break here, it doesnt print anything
            	System.out.println("Got Smart Water?" + i);// if we put code never reach after break
            // break; //eger buraya koyarsak ->Got Smart Water?0 yazar ve looptan cikar.
        }
        System.out.println("------------------------------------");

        for (int i = 1; i <= 10; i++) {

            System.out.println("Got Smart Water?" + i);

            continue; // it doing same thing / actually useless
            // System.out.println("End"); if we put something here it never ever get chance
            // to executed
            // unreacheble code

        }

    }
}
