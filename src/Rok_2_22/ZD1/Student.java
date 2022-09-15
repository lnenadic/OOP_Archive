package Rok_2_22.ZD1;

import java.io.*;
import java.util.*;

public class Student {

    private int student_id;
    private String stud_name;
    private String university;
    private String[] courses;

    public Student(int student_id, String stud_name, String university, String[] courses) {
        this.student_id = student_id;
        this.stud_name = stud_name;
        this.university = university;
        this.courses = courses;
    }

    public static class AUX_CLASS {

        TreeMap<Integer, Student> listStudents = new TreeMap<>();

        public void readDataFromCSV() {
            String line = "";
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a path: ");
            String path = scanner.nextLine();
            String filePath = "src/Rok_2_22/ZD1/data.csv";

            File file = new File(path);
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                bufferedReader.readLine();

                while ((line = bufferedReader.readLine()) != null) {
                    String[] data = line.split(",");
                    int stud = Integer.parseInt(data[0]);
                    System.out.println(Arrays.toString(data));
                    int a = Integer.parseInt(data[0]);
                    String b = data[1];
                    String c = data[2];
                    String[] d = data[3].split(" ");
                    Student student = new Student(a, b, c, d);
                    listStudents.put(a, student);
                }
                bufferedReader.close();

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

        public void listStudents() {
            System.out.println("Listing all students...");
            for (Map.Entry<Integer, Student> entry : listStudents.entrySet()) {
                System.out.println("--------------------------------------------------------");
                System.out.println("Student with id: " + entry.getKey());
                System.out.println(entry.getValue().toString());
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", stud_name='" + stud_name + '\'' +
                ", university='" + university + '\'' +
                ", courses=" + Arrays.toString(courses) +
                '}';
    }
}
