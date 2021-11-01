package bugBusters;


import java.util.Scanner;

public class RealtorTask {
    public static void main(String[] args) {

        /*
        Please write a real estate program and calculate estimate property price
        Write with scanner class !!!

        price for condo 50000, for townhouse 67000, for single Family Home 100000
        if they want to add extra bedrooms 30000 extra for each bedroom
        condo doesn't have a backyard option, but for townhouse and single family home $5000
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
        String houseType;
        String a = "Single Family Home";

        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");

        System.out.println("Enter your property type:");
        houseType = scan.nextLine();
        if (houseType.equals("Condo")) {
            propertyPrice = 50000;
        }
        if (houseType.equals("Townhouse")) {
            propertyPrice = 67000;
        }
        if (houseType.equals(a)) {
            propertyPrice = 100000;
        }

        System.out.println("How many bedrooms do you have?");
        numberOfBedrooms = scan.nextInt();
        propertyPrice += 30000 * numberOfBedrooms;

        System.out.println("Do you have a backyard?");
        backyard = scan.nextBoolean();
        if (backyard == true) {
            if (houseType.equals("Townhouse")) {
                propertyPrice += 5000;
            }
            if (houseType.equals("a")) {
                propertyPrice += 5000;
            }
            if (houseType.equals("Condo")) {
                System.out.println("Backyard is not available for condo!");
            }

        }

        System.out.println("Do you have garage?");
        garage = scan.nextBoolean();
        if (garage == true) {
            System.out.println("How many spots?");
            garageSpots = scan.nextInt();
            if (garageSpots < 10) {
                propertyPrice = 20000 * garageSpots + propertyPrice;
            } else {
                System.out.println("Pardon, it's not a public parking!");
            }
        }

        System.out.println("How close is metro station?");
        metroAccessibility = scan.nextFloat();
        if (metroAccessibility <= 1) {
            propertyPrice = 10000 + propertyPrice;
        }
        if (metroAccessibility > 1 && metroAccessibility < 3) {
            propertyPrice = 5000 + propertyPrice;
        }

        System.out.println("How close is highway?");
        highwayAccessibility = scan.nextFloat();
        if (highwayAccessibility <= 1) {
            propertyPrice = 15000 + propertyPrice;
        }
        if (highwayAccessibility > 1 && metroAccessibility < 5) {
            propertyPrice = propertyPrice + 8000;
        }
        if (highwayAccessibility > 5 && metroAccessibility < 21) {
            propertyPrice = propertyPrice + 4000;
        }

        System.out.println("What's the rating of nearest school?");
        schoolScore = scan.nextInt();
        if (schoolScore > 8 && schoolScore < 11) {
            propertyPrice = propertyPrice + 45000;
        } else if (schoolScore > 3 && schoolScore < 8) {
            propertyPrice = propertyPrice + 20000;
        } else {
            propertyPrice = propertyPrice + 5000;
        }

        System.out.println("Does any of your family members smoking?");
        smoking = scan.nextBoolean();
        if (smoking == true) {
            propertyPrice = propertyPrice - 5000;
        }

        System.out.println("Market report has been generated.");
        System.out.println("Your estimate market price is: " + propertyPrice + "$");


    }
}
