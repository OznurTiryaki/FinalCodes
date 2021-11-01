package bugBusters;

import java.util.Calendar;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Your Name");
        String name = scan.next();
        System.out.println("Please Enter Birth Year");
        int birthYear = scan.nextInt();
        System.out.println("Please Enter City");
        String city = scan.next();
        System.out.println("Please Enter Best Friend Name");
        String bestFriend = scan.next();
        System.out.println("Please Enter Darling Name");
        String darling = scan.next();
        System.out.println(writeWholeInfo(name, birthYear, city, bestFriend ,darling));

    }

    private static String writeWholeInfo(String ad, int birthYear, String sehir, String bestFriend,String darling) {

        String myString = ad + " " + birthYear + " yılında doğmuştur ve şu anda " + currentAge(birthYear) + " yaşındadır. \n" + sehir + " ilinde ikamet etmektedir ve " + requiredYearsForRetirement(birthYear) + " yıl sonra emekli olabilecektir.\nEn Sevdiği Dostunun ismi "+bestFriend+" Sevgilisinin ismi "+darling+"dur";

        return myString;


    }

    public static int requiredYearsForRetirement(int birthYear) {
        return 65-(currentAge(birthYear));
    }

    public static int currentAge(int birthYear) {
        int currentYear= Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - birthYear;
    }

}

