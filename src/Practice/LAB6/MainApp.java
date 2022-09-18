package Practice.LAB6;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {
    // Get data by using getInputData method
        DATA_CLS data_cls = new DATA_CLS();
        data_cls.getInputData();
    // Intentionally define new,empty data structure
        List<String> empty = new ArrayList<>();
    // Write data from getInoutData method into the file "DataFile.txt"
       data_cls.writeData("DataFile.txt");
    // Try to write an empty data into the same file
      data_cls.inputData = empty;
      data_cls.writeData("DataFile.txt");
    // Read data from "DataFile.txt"
       data_cls.readData("DataFile.txt");
    // Try to read data from an empty txt file
       data_cls.readData("blank.txt");


    }
}

