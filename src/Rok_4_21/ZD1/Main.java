package Rok_4_21.ZD1;

import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        File csvFile = new File("src/Rok_4_21/prodaja_1_snd.csv");
        ArrayList<String> rowArr = ProcessData_CLS.readData4CSV(csvFile);
    }
}
