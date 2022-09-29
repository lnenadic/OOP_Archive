package Rok_4_22.ZD1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class AUX_FLS {

    public static ArrayList<Employer> read(String csvFile) {
        ArrayList<Employer> emp = new ArrayList<>();
        try {
            File file = new File(csvFile);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = " ";
            String[] tempArr;
            while ((line = br.readLine()) != null) {
                System.out.println("Reading data from csv file - creating object of the class Employer...");
                tempArr = line.split(",");
                DateFormat format = new SimpleDateFormat("yyyy");
                Date date = format.parse(tempArr[1]);
                Date date2 = format.parse(tempArr[2]);
                emp.add(new Employer(tempArr[0], date, date2, tempArr[3], tempArr[4]));
                System.out.println("Adding object in the data structure...");
                System.out.println();
            }
            br.close();
        }
        catch(IOException ioe) {
            ioe.printStackTrace();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return emp;
    }

    public static void listAllEmplData(ArrayList<Employer> emp) {
        System.out.println("All objects data:");
        for (Employer e : emp) {
            System.out.println(e.toString());
        }
    }
}
