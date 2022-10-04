package Rok_2_21.ZD1;

import java.util.Scanner;

public class Robot {

    private String name;
    private int id;
    private String description;
    private static int cnt = 1;

    public Robot(String name) {
        this.name = name;
        this.id = cnt++;
        describeRobot();
    }

    public void describeRobot() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Describe robot!");
        String input = sc.nextLine();
        System.out.println("Description: " + input);
        this.description = input;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void getInfo() {
        this.toString();
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", description='" + description + '\'' +
                '}';
    }

}
