package Rok_3_21.ZD1;

import java.util.ArrayList;
import java.util.Scanner;

public class AppClient {

    public static ArrayList<USER> arr;

    public static void main(String[] args) {
        arr = createUseres();
        containsName("Lovre");
    }

    public static ArrayList<USER> createUseres() {
        ArrayList<USER> arr = new ArrayList<>();
        boolean valid = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a name for an user: ");
        arr.add(new USER(sc.next()));
        while (valid) {
            System.out.println("For more users press Y, and any other key to EXIT!");
            if (sc.next().toLowerCase().equals("y")) {
                System.out.println("Please enter a name for an user: ");
                arr.add(new USER(sc.next()));
            } else {
                valid = false;
            }
        }
        System.out.println(arr);
        return arr;
    }

    public static boolean containsName(String lookUpName) {
        int cnt = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getName().equals(lookUpName)) {
                cnt++;
            }
        }
        if (cnt != 0) {
            System.out.println("Contains name: " + lookUpName + " -> num of times: " + cnt);
            return true;
        } else {
            System.out.println("This List does not contain the name You are searching for!");
            return false;
        }
    }

}
