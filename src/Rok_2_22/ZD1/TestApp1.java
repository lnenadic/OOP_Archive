package Rok_2_22.ZD1;

public class TestApp1 {
    public static void main(String[] args) {
        Student.AUX_CLASS aux_class = new Student.AUX_CLASS();
        aux_class.readDataFromCSV();
        aux_class.listStudents();
    }
}
