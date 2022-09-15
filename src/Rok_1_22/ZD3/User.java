package Rok_1_22.ZD3;

public class User {

    private String name;
    private int id;
    private int cntID;

    public User(String name) {
        this.name = name;
        id = cntID;
        cntID++;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", cntID=" + cntID +
                '}';
    }
}
