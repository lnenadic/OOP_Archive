package Rok_1_22.ZD1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AUX_CLS {

    Map<String, List<Float>> sss = new HashMap<>();
    List<Float> results = new ArrayList<>();

    public void readFromFile() {
        String fileName = "src/Rok_1_22/ZD1/rez.csv";
        File file = new File(fileName);

        try {
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                String data = input.next();
                String[] values = data.split(",");
                System.out.println(values[1]);
            }
            input.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
