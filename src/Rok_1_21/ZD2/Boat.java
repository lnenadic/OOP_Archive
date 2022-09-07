package Rok_1_21.ZD2;

public class Boat extends Vehicle{

    private String boatName;

    public Boat(String boatName) {
        this.boatName = boatName;
        cnt+=3;
        this.id = cnt;
    }

    @Override
    public void runEngine() {
        System.out.println("Running engine for the ->" + getClass().getSimpleName());
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop engine for the ->" + getClass().getSimpleName());
    }

    @Override
    public void getEnergy() {
        System.out.println("In the case of an electric boat ensure battery power, otherwise, get the fuel!");
    }

    @Override
    public void description() {
        System.out.println(toString());
    }

    @Override
    public void move(String direction, double speed) {
        System.out.println("Boat is moving: \n\tdirection: " + direction + "\tspeed: " + speed);
    }

    @Override
    public String toString() {
        return "Boat{" +
                "boatName='" + boatName + '\'' +
                ", id=" + id +
                '}';
    }
}
