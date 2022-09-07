package Rok_4_21.ZD1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ProcessData_CLS {

    public static ArrayList<String> readData4CSV(File csvFile) {
        String line = "";
        String splitBy = ",";
        ArrayList<String> row = new ArrayList<>();
        String[] tempArr;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                tempArr = line.split(splitBy);
                row.add(Arrays.toString(tempArr).replace("[", "").replace("]", ""));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return row;
    }

}
