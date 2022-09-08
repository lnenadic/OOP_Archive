package Rok_5_21.ZD2;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        HashMap<Integer, Robot> robots = new HashMap<>();
        System.out.println("///////////////// Robot objekt //////////////////////");
        Robot rb = new Robot(2021, "Robo");
        rb.charge();
        rb.repair();
        System.out.println("///////////////// TV objekt //////////////////////");
        TV tv = new TV("Samsung", 2010);
        tv.operate();
        tv.stopOperate();
        tv.powerSupply();
        tv.repair();
        System.out.println("///////////////// Radio objekt //////////////////////");
        Radio radio = new Radio("Panasonic", 2008);
        radio.operate();
        radio.stopOperate();
        radio.powerSupply();
        radio.repair();
        System.out.println("///////////////// List all robots /////////////////");
        Robot rb1 = new Robot(2020, "Rob");
        Robot rb2 = new Robot(2019, "Robert");
        //rb1.getId();
        robots.put(0, rb);
        robots.put(1, rb1);
        robots.put(2, rb2);
        listAllRobots(robots);
    }

    public static void listAllRobots(HashMap<Integer, Robot> map) {
        for (Integer key: map.keySet()) {
            System.out.print("ID: " + key + " - Robot: ");
            System.out.println(map.get(key).getRobotName());
        }
    }

}

