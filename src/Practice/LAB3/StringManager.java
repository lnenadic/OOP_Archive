package Practice.LAB3;// fill missing code snippets

import java.util.Scanner;

public class StringManager {

       public static void readUserInput(Scanner scanner){
        while (true) {
            System.out.println("Your keyboard input please: \t");
            String inpt = scanner.nextLine();
            System.out.println("You entered: " + inpt);
            System.out.println("----------------------------------------");
            System.out.println("Next input = y or exit = any other key?");
            inpt = scanner.nextLine();
            // strip white spaces and than to lowercase -> 
            if (!inpt.equals("y")){
                System.out.println("Exit input testing!");
                // out from while loop
                break;
                
            } else {
                System.out.println("New input round...");
            }
        }
        System.out.println("Finished using readUserInput method!!!");
    }
}
