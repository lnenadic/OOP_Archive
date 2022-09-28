package Rok_4_22.ZD3;

public class MotoBike extends Bike implements Motor{

    public MotoBike(String owner) {
        super(owner);
    }

    @Override
    public void ride() {
        System.out.println("Riding on bike type: " + getClass().getSimpleName());
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
