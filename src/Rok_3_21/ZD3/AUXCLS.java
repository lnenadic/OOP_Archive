package Rok_3_21.ZD3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AUXCLS {

    private static final String[] cityNames = {"Zagreb", "Vukovar", "Šibenik", "Split", "Zadar", "Rijeka", "Pula",
            "Dubrovnik", "Osijek", "Varaždin"};

    public static void main(String[] args) {
       checkCity(6);
       WriteToFile();
    }

    public static int checkCity(int n) {
        int matchCount = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Please enter one city in CRO...");
            if (sc.hasNext()) {
                String inpt = sc.next();
                for (int cityIdx = 0; cityIdx < cityNames.length; cityIdx++) {
                    if (cityNames[cityIdx].equals(inpt)) {
                        matchCount++;
                        System.out.println(cityNames[cityIdx] + " is in the targeted array names!");
                    }
                }
            }
        }
        if (matchCount != 0) {
            System.out.println("Checked cities: " + matchCount);
            return matchCount;
        } else {
            System.out.println("Wrong user input in check operation or none desired in the targeted array!");
            return matchCount;
        }
    }

    public static void WriteToFile() {
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
