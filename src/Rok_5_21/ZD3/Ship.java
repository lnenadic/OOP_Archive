package Rok_5_21.ZD3;


import java.util.Random;

public class Ship extends Watercraft implements Engine{
    private static int cnt = 1;

    public Ship(String yrManufactured, String name) {
        super(yrManufactured, name);
        this.id = cnt++;
        this.type = String.valueOf(getFromShipTypes());
    }

    public ShipEnums getFromShipTypes() {
        ShipEnums[] values = ShipEnums.values();
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
        return "Ship {" +
                "type='" + type + '\'' +
                ", id=" + id +
                ", yrManufactured='" + yrManufactured + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
