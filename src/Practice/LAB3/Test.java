package Practice.LAB3;// import Scanner

import java.util.Scanner;

public class Test {
    // define only one Scanner -> final
    static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        // StringManager test
        StringManager.readUserInput(scanner);
        // NumberManager tst
        NumberManager.getUserNumber(scanner);
        // Do not change this
        System.out.println("Closing scanner!!!");
        scanner.close();
    }
}