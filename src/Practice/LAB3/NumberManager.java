package Practice.LAB3;// look at StringManager method

import java.util.Scanner;

public class NumberManager {

   public static void getUserNumber(Scanner scanner) {

        while (true) {
            System.out.println("Your keyboard input please - we are looking for at least one number: \t");
            System.out.println("Your keyboard input please - we are looking for at least one number: \t");
            String inpt = scanner.nextLine();
            System.out.println("You entered: " + inpt.replace(".", ","));
            checkForNumber(inpt, scanner);
            System.out.println("----------------------------------------");
            System.out.println("Next input = y or exit = any other key?");
            inpt = scanner.nextLine();
            // strip white spaces and than to lowercase ->
            inpt = inpt.replace(" ", "").toLowerCase();

            if (!inpt.equals("y")){
                System.out.println("Exit input testing!");
                // out from while loop
                break;
            } else {
                System.out.println("New input round...");
            }
        }
        System.out.println("Finished using getUserNumber!!!");
        System.out.println("Finished using getUserNumber!!!");
    }

    private static boolean checkForNumber(String keyboardInput, Scanner scanner) {
        boolean hasNumber = false;
        // scanner constructor with the keyboardInput string
        scanner = new Scanner(keyboardInput);

        while (scanner.hasNext()){
            // look if has float OR integer
            if (scanner.hasNextFloat()) {
                float num = scanner.nextFloat();
                // change state hasNumber
                hasNumber = true;

                if (num % 1 == 0.0) {
                    // this is integer -Y cast to integer
                    int number = (int) num;
                    System.out.println("Integer in the input: " + number);
                    System.out.println("There is a number in the user input!");
                } else {
                    System.out.println("Float in the input: " + num);
                    System.out.println("There is a number in the user input!");
                }
                break;
            } else {
                System.out.println("Scanning next token in the input...");
            }
            // go to next token -> see Scanner API
            scanner.next();
        }
        if (!hasNumber) {
            System.out.println("No numbers in user input!");
        }
        return hasNumber;
    }

}
