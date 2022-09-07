package Rok_4_21.ZD2;

import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        Department dp1 = new Department("IT");
        Department dp2 = new Department("Sales");
        ArrayList<Employee> arrDP1 = employees2Dep(3);
        ArrayList<Employee> arrDP2 = employees2Dep(2);
        HashMap<Department, ArrayList<Employee>> allDepartments = new HashMap<>();
        allDepartments.put(dp2, arrDP2);
        allDepartments.put(dp1, arrDP1);
        listALL(allDepartments);
    }

    private static ArrayList<Employee> employees2Dep(int num) {
        ArrayList<Employee> arr = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String name = "Emp-" + i;
            arr.add(new Employee(name));
        }
        return arr;
    }

    private static void listALL(HashMap<Department, ArrayList<Employee>> allDepartments) {
        System.out.println("****************");
        allDepartments.forEach((dp, arr) -> {
            System.out.println(dp.toString());
            for (Employee emp: arr) {
                System.out.println(emp.toString());
            }
            System.out.println("****************");
        });

    }

}
