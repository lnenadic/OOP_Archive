package Practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    public static void main(String[] args) throws IOException {
        String file = "src/Practice/prodaja_1_snd.csv";
        BufferedReader reader = null;
        String line = "";

        try {
            reader = new BufferedReader(new FileReader(file));

            while ((line = reader.readLine()) != null) {
                 String[] row = line.split(",");

                 for (String index : row) {
                     System.out.printf("%-10s", index);
                 }
                System.out.println();

            }

        }
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }
    }
}
