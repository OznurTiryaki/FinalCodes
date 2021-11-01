package classCodes.f5_Loops;

import java.util.Scanner;

public class WhileLoop19 {
    public static void main(String args[]) {

    /* Zombi Attact to city/ zombies kills half of them each day

    Day 0 [6]
    Day 1 [3]
    Day 1 [1]
    ----EXTINCT-----

     */
        Scanner scan = new Scanner(System.in);

        int day = 0;
        System.out.println("What is the population of city?");
        int population = scan.nextInt();

        while (population > 0) {
            population/=2;
            System.out.println(" day: " + day + " population: "+population);
            day++;

        }
        System.out.println("----EXTINCT-----");
    }
}