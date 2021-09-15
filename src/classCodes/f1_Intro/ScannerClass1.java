package classCodes.f1_Intro;

import java.util.Scanner;  //to create a scanner object, we need to import scanner class

public class ScannerClass1 {

    public static void main(String[] args) {

        // SCANNER CLASS- STRING

        //Create a Scanner object

        Scanner userInput = new Scanner(System.in);

        //after that it give you attention
        //go there and choose import java.util.Scanner; automatically

        //SHORTCUT FOR IMPORT---COMMAND+SHIFT+O

        // BE CAREFUL DON'T CREATE A CLASSROOM NAME CALL "SCANNER"
        //IT GET CONFUSED YOUR CLASS SCANNER OR SCANNER WHICH YOU TAKE IMPORT

        //ask user question/input

        System.out.println ("Please enter your name: ");

        String name = userInput.nextLine() ; //next give us one word, next.Line more than one word

        //print what user input

        System.out.println ("You have entered : " + name);

        System.out.println ("-------------------------------------------");
        // Scanner-2

        //creating scanner object

        Scanner input = new Scanner(System.in);

        //asking user question

        System.out.println("Enter your first name :" );

        //force user to enter input/data

        String firstName = input.nextLine();

        //and format the display output

        System.out.println("Your first name is :" +firstName);

        System.out.println("Enter your last name :" );

        //force user to enter input/data

        String lastName = input.nextLine();

        //format the display again

        System.out.println("Your last name is :" +lastName);

        System.out.println("Your full name is :" +firstName+ " " + lastName);

         //close scanner

        //input.close();

    }

}
