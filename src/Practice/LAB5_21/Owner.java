package Practice.LAB5_21;

public class Owner {

    private String name;

    public Owner(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                '}';
    }

    // only add getters for the name att.
    public String getName() {
        return name;
    }
}