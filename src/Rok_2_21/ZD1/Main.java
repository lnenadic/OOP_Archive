package Rok_2_21.ZD1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Robot r1 = new Robot("Lovre");
        Robot r2 = new Robot("Luka");
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        r1.describeRobot();

         */
        ArrayList<Robot> robotArrayList = new ArrayList<>();
        populateRobotList(robotArrayList);
        for (Robot robot:robotArrayList) {
            System.out.println(robot.toString());
        }
    }

    public static Robot createRobot(String name) {
        return new Robot(name);
    }

    public static void populateRobotList(List<Robot> list) {
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;
        while (true) {
            list.add(createRobot("Robot" + cnt));
            cnt++;
            System.out.println("Y for new Robot, other for exit!");
            String inpt = scanner.next();
            if (!inpt.equals("y".toLowerCase())) {
                break;
            }

        }
    }
}
