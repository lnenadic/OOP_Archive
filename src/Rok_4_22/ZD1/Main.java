package Rok_4_22.ZD1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String path = "/Users/lovremacbookpro/Documents/OOP/OOP_Archive/src/Rok_4_22/ZD1/employers.csv";
        ArrayList<Employer> employerArrayList = AUX_FLS.read(path);
        AUX_FLS.listAllEmplData(employerArrayList);
    }
}
