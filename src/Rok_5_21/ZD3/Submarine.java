package Rok_5_21.ZD3;

import java.util.Random;

public class Submarine extends Watercraft implements Engine{

    private static int cnt = 1;

    public Submarine(String yrManufactured, String name) {
        super(yrManufactured, name);
        this.id = cnt++;
        this.type = String.valueOf(getFromSubmarineTypes());
    }

    public SubmarineEnums getFromSubmarineTypes() {
        SubmarineEnums[] values = SubmarineEnums.values();
        int length = values.length;
        int randIndex = new Random().nextInt(length);
        return values[randIndex];
    }

    @Override
    public void cruising() {
        System.out.println(getClass().getSimpleName() + " is cruising!");
    }

    @Override
    public void start() {
        System.out.println(this.name + " is starting engine!");
    }

    @Override
    public void stop() {
        System.out.println(this.name + " is shutting down engine!");
    }

    @Override
    public String toString() {
        return "Submarine {" +
                "type='" + type + '\'' +
                ", id=" + id +
                ", yrManufactured='" + yrManufactured + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
