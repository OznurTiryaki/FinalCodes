package bugBusters;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RealtorTask2 {

    public static void main(String args[]) {

         /*
        Please write a real estate program and calculate estimate property price
        Write with scanner class !!!

        price for condo 50000, for townhouse 67000, for single Family Home 100000
        if they want to add extra bedrooms 30000 extra for each bedroom
        condo doesnt have a backyard option, but for townhouse and single family home $5000
        for parking spot , they will choose max 10 spot for each $20000
        "How close is metro station? "if less than or equal 1 mile $10000 , between 1-3 mile $5000
        "How close is highway?" if less than or equal 1 mile $15000, between 1-5 mile $8000,between 5-21 mile $4000
        "What's the rating of nearest school?"if schoolScore between 8-10 (include 10) $45000,3-8 $20000, else $5000
        "Does any of your family members smoking?" if it it is true - $5000 (5 bin cikar)

        int propertyPrice
        int numberOfBedrooms, garageSpots;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType;
     */


        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType = null;


        System.out.println("Welcome to Real Estate Program");

        Scanner scan = new Scanner(System.in);

        System.out.println("What type of house you are looking: Single Family, Townhouse or Condo");

        houseType = scan.nextLine();

        if (houseType.equalsIgnoreCase("Single Family")) {
            propertyPrice += 100000;
        } else if (houseType.equalsIgnoreCase("Townhouse")) {
            propertyPrice += 67000;
        } else if (houseType.equalsIgnoreCase("Condo")) {
            propertyPrice += 50000;

        }
        System.out.println("Do you want add extra bedroom?How many");
        numberOfBedrooms = scan.nextInt();
        propertyPrice += numberOfBedrooms * 30000;

        System.out.println("Do you want add backyard: true/false");
        backyard = scan.nextBoolean();
        if (backyard == true) {
            if (houseType.equalsIgnoreCase("Single Family") || houseType.equalsIgnoreCase("Townhouse")) {
                propertyPrice += 5000;
            } else {
                System.out.println("Sorry backyard not available for Condo");
            }
        }

        System.out.println("Do you want add parking spot: true/false");
        garage = scan.nextBoolean();
        if (garage == true) {
            System.out.println("How many parking spot you want?");
            garageSpots = scan.nextInt();
            if (garageSpots < 10) {
                propertyPrice += garageSpots * 20000;

            } else {
                System.out.println("Sorry this is not public parking");
            }
        }
        System.out.println("How close is metro station?");
        metroAccessibility = scan.nextInt();

        if (metroAccessibility < 1) {
            propertyPrice += 10000;
        } else if (metroAccessibility > 1 && metroAccessibility < 3) {
            propertyPrice += 5000;
        }
        System.out.println("How close is highway?");
        highwayAccessibility = scan.nextInt();
        if (highwayAccessibility < 1) {
            propertyPrice += 15000;
        } else if (highwayAccessibility > 1 && highwayAccessibility < 5) {
            propertyPrice += 8000;
        } else if (highwayAccessibility > 5 && highwayAccessibility < 21) {
            propertyPrice += 4000;
        }
        System.out.println("What's the rating of nearest school?");
        schoolScore = scan.nextFloat();

        if (schoolScore >= 8 && schoolScore <= 10) {
            propertyPrice += 45000;
        } else if (schoolScore >= 3 && schoolScore < 8) {
            propertyPrice += 20000;
        } else {
            propertyPrice += 5000;
        }
        System.out.println("Does any of your family members smoking? : true/false");
        smoking = scan.nextBoolean();
        if (smoking) {
            propertyPrice -= 5000;
        }

        System.out.println(propertyPrice);

    }
}