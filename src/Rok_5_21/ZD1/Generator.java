package Rok_5_21.ZD1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Generator {

    public static ArrayList<Integer> generateList() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int validLength;
        boolean valid = true;

        while (valid) {
            try {
                System.out.println("Unesite broj elemenata liste --> 7 do maksimalno 20 elemenata...");
                System.out.println("================");
                String input = scanner.next();
                validLength = Integer.parseInt(input);
                if ((validLength >= 7) && (validLength <= 20)){
                    for (int i = 0; i < validLength; i++) {
                        valid = false;
                        int generatedNum = ThreadLocalRandom.current().nextInt(99) + 1;
                        while (arrayList.contains(generatedNum)) {
                            generatedNum = ThreadLocalRandom.current().nextInt(99) + 1;
                        }
                        arrayList.add(generatedNum);
                    }
                } else {
                    System.out.println("Niste unijeli cjelobrojnu vrijednost u rasponu od 7 do 20");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Niste unijeli cjelobrojnu vrijednost u rasponu od 7 do 20");
            }
        }
        return arrayList;

    }

}
