package Rok_3_22.ZD2;

import java.util.Scanner;

public class MainTest2 {
    public void userInput(User2 user1) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter one number");
        boolean isInt = false;

        if (sc.hasNextFloat()) {
            float number = sc.nextFloat();
            if (number == (int) number) {
                isInt = true;
            }
            if (isInt) {
                int intNumber = (int) number;
                System.out.print(intNumber + " is an integer");
                user1.setIntegerList(intNumber);
            } else
                System.out.print(number + " is a floating number");
            user1.setFloatList(number);

        } else {
            throw new IllegalArgumentException("ERROR");
        }
    }

    public static void main(String[] args) {
        User2 user1 = new User2();
        MainTest2 main = new MainTest2();
        boolean playStatus = true;
        Scanner sc = new Scanner(System.in);
        while (playStatus) {
            try {
                main.userInput(user1);
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println("Only floats and integers are acceptable!!!");
            }
            System.out.println();
            System.out.println("For next round enter 'y' or any other to quit...");
            if(sc.next().equals("y")) {
                continue;
            }else {
                playStatus = false;
                System.out.println();
                System.out.println("This is your last input for now!");
                System.out.println("------------------------------------------------");
                System.out.println("Your inputs are: ");
                System.out.println(user1.getFloatList());
                System.out.println(user1.getIntegerList());
            }
        }

    }
}
