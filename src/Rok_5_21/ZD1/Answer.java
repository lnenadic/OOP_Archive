package Rok_5_21.ZD1;

import java.util.ArrayList;
import java.util.Collections;

public class Answer {

    public static ArrayList<Integer> sortListAsc(ArrayList<Integer> arr) {
        Collections.sort(arr);
        return (arr);
    }

    public static ArrayList<Integer> sortListDsc(ArrayList<Integer> arr) {
        Collections.sort(arr, Collections.reverseOrder());
        return (arr);
    }

    public static float calcAvgList(ArrayList<Integer> arr) {
        float avg = 0;
        for (int i = 0; i < arr.size(); i++) {
            avg += arr.get(i);
        }
        avg = avg / arr.size();
        return avg;
    }

    public static void allMethods(ArrayList<Integer> arr) {
        System.out.println("Originalna lista - nesortirana:\n" + arr);
        System.out.println("Uzlazno sortirana:\n" + sortListAsc(arr));
        System.out.println("Silazno Sortirana:\n" + sortListDsc(arr));
        System.out.println("AVG:\n" + calcAvgList(arr));
    }

}
