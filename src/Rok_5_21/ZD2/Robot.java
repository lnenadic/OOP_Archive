package Rok_5_21.ZD2;

public class Robot implements Service{

    private String name;
    private int id;

    public Robot(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void repair() {
        System.out.println("Send me to the nearest university Laboratory ...");
    }

    public void charge() {
        System.out.println("Please charge my bateries ...");
    }

    public String getRobotName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
