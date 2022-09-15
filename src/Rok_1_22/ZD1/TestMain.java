package Rok_1_22.ZD1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("Reading data from csv file...");
        System.out.println("=============== Collected data ================");
        String line = "";
        int i = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/Rok_1_22/ZD1/rez.csv"));
            br.readLine();


            while ((line = br.readLine()) != null) {
                i++;
                String[] employee = line.split(",");
                System.out.println("Statistics for student -> " + "student-" + i + " " + Arrays.toString(employee));
                float sum = 0;
                float avg = 0;
                int cnt = 0;
                for (String num : employee) {
                    sum += Float.parseFloat(num);
                    avg = sum/4;

                    if (Float.parseFloat(num) < 50){
                        cnt++;
                    }
                }
                System.out.println("Avg points: " + avg);
                System.out.println("Not passed exams: " + cnt);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
