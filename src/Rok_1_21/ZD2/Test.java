package Rok_1_21.ZD2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        Car car = new Car("CAR");
        vehicles.add(car);
        Boat boat = new Boat("BOAT");
        System.out.println("\n\n--------------------------");
        vehicles.add(boat);
        listAll(vehicles);
        System.out.println("--------------------------\n");
        System.out.println("--------------------------");
        callAllMethods(vehicles);
        System.out.println("--------------------------\n");

    }

    private static void listAll(ArrayList<Vehicle> vehicles) {
        System.out.println("List all vehicles: ");
        for (Vehicle v : vehicles) {
            v.description();
        }
    }

    private static void callAllMethods(ArrayList<Vehicle> vehicles) {
        for (Vehicle v : vehicles) {
            RandomDirection randomDirection = new RandomDirection();
            randomDirection.genRandDirectionData();
            v.runEngine();
            v.move(randomDirection.getDirection(), randomDirection.getSpeed());
            v.getEnergy();
            v.stopEngine();
        }
    }
}
