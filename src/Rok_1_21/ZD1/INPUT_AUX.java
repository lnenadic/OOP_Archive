package Rok_1_21.ZD1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class INPUT_AUX {

    private static List<String> listStrings = Arrays.asList("sup1", "sup2", "sup3");
    private String input;

    public boolean checkInput(String input) {
        this.input = input;
        try {
            Float.parseFloat(input);
            System.out.println("Unexpected input!");
            return false;
        } catch (NumberFormatException e) {
            inList();
            moreInputs();
            return true;
        }
    }

    private void inList() {
        for (String element : listStrings) {
            if (!element.equals(input)) {
                continue;
            } else {
                System.out.println("Your input is in the list!");
                break;
            }
        }
        System.out.println("Your input is NOT in the list!");
    }

    public void moreInputs() {
        Scanner sc = new Scanner(System.in);
        System.out.println("y for continue, other for exit..");
        String input = sc.nextLine();
        if (input.toLowerCase().equals("y")) {
            System.out.println("Enter something...");
            input = sc.nextLine();
            checkInput(input);
        } else {
            System.out.println("Game finished!");
            System.out.println("List: " + listStrings.toString());
        }
    }


}
