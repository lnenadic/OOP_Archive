package Rok_4_21.ZD2;

import java.util.Random;

public class Employee {

    private static int cnt = 10;
    private int id;
    private String name;
    private static final int LWR = 1;
    private static final int UPR = 35;
    private int working;

    public Employee(String name) {
        this.name = name;
        id = cnt;
        cnt++;
        working = new Random().nextInt(UPR-LWR) + LWR;
        switch (genWorking()) {
            case 0:
                profession = Profession.PROFESSION_1;
                break;
            case 1:
                profession = Profession.PROFESSION_2;
                break;
            case 2:
                profession = Profession.PROFESSION_3;
                break;
            case 3:
                profession = Profession.PROFESSION_4;
                break;
            case 4:
                profession = Profession.PROFESSION_5;
                break;
        }

    }

    private int genWorking() {
        return new Random().nextInt(5);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", working=" + working +
                '}';
    }

    Profession profession;

}
