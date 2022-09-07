package Rok_1_21.ZD2;

import java.util.PrimitiveIterator;
import java.util.Random;

public class RandomDirection {

    private static final String[] DIRECTIONS = {"North", "East", "West", "South"};
    private static final double MIN = 1;
    private static final double MAX = 100;
    private final Random random = new Random();

    private String direction;
    private double speed;

    public RandomDirection() {

    }

    public void genRandDirectionData() {
        direction = DIRECTIONS[random.nextInt(3)];
        speed = MIN + (MAX - MIN) * random.nextDouble();
        System.out.println("Direction and speed have been generated!");
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
