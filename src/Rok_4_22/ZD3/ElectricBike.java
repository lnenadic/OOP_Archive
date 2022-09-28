package Rok_4_22.ZD3;

import java.util.Random;

public class ElectricBike extends Bike implements PedalingCapacity, Motor {

    private static final int LRWR = 1;
    private static final int MPWR = 50;
    private int randomPower;

    public ElectricBike(String owner) {
        super(owner);
    }


    @Override
    public void producePedalingPower() {
        randomPower = new Random().nextInt(MPWR-LRWR) + LRWR;
        System.out.println("Random pedaling power: " + randomPower);
    }

    @Override
    public void ride() {
        System.out.println("Riding on bike type: " + getClass().getSimpleName());
    }

    @Override
    public void pedalingCadence() {
        System.out.println("Cadence for + " + getClass().getSimpleName());
    }

    @Override
    public void stop() {
        System.out.println("Stopped for " + getClass().getSimpleName());
    }

    @Override
    public void fill() {
        System.out.println("Filling up: " + getClass().getSimpleName());
    }

    @Override
    public void start() {
        System.out.println("Starting: " + getClass().getSimpleName());
    }
}
