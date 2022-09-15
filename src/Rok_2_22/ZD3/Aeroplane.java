package Rok_2_22.ZD3;

public class Aeroplane implements Fly{

    private static float distance;
    private String name;
    private int id;

    public Aeroplane(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void takeOff() {
        System.out.println("Flying in: North");
    }

    @Override
    public void land() {
        System.out.println("Landing!");
    }

    @Override
    public void fly(float distance, String name, float speed) {
        System.out.println("Flying in " + name);
        System.out.println("Flying at " + speed + " km/h");
    }

    public static float getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Aeroplane{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
