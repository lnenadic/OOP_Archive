package Practice.LAB6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DATA_CLS {

    List<String> inputData = new ArrayList<>();

    public void getInputData() {
        String answer;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter some string...");
            String input = scanner.nextLine();
            inputData.add(input);
            System.out.println("For more data press 'y' and any other for exit!");
            answer = scanner.nextLine();
            if (!answer.equals("y")) {
                break;
            }
            System.out.println("Moving to the next input data round!");
        }
        scanner.close();
        //System.out.println(inputData);
        System.out.println("Finished data input!!!");
    }

    public void writeData(String name){
        try {
            if (inputData.isEmpty() != true) {
                System.out.println("There is some data to write into the file...");
                System.out.println("Writing data ....");
                BufferedWriter writer = new BufferedWriter(new FileWriter(name));
                for (int i = 0; i < inputData.size(); i++) {
                    System.out.println("Writing: " + inputData.get(i));
                    writer.write(inputData.get(i) + "\n");
                }
                writer.close();
            }else{
                System.out.println("Nothing to write in the file - input data structure is empty!");
                BufferedWriter writer1 = new BufferedWriter(new FileWriter("blank.txt"));
            }
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Nothing to write in the file - input data structure is empty!");
        }
    }

    public void readData(String name) {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(name));
            if(reader1.readLine() == null){
                System.out.println("File is empty - nothing to read!");
            }else {
                BufferedReader reader = new BufferedReader(new FileReader(name));
                System.out.println("Reading from file: " + name);
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println("Data -->  " + line);
                }
                reader.close();
                System.out.println("Finished reading data!!!");
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File is empty - nothing to read!");
        }
    }
    
}