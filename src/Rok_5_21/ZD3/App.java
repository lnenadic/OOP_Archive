package Rok_5_21.ZD3;

import java.text.ParseException;

public class App {
    public static void main(String[] args) throws ParseException {
        Ship ship = new Ship("2133", "Enterprised 2");
        System.out.println(ship);
        ship.start();
        ship.cruising();
        ship.stop();
        Submarine submarine = new Submarine("2050", "Neno");
        System.out.println(submarine);
        submarine.start();
        submarine.cruising();
        submarine.stop();
        System.out.println("*********");
        Car car = new Car("Renault", "Clio", "2002");
        System.out.println(car);
        car.start();
        car.stop();
    }
}
