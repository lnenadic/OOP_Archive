package Rok_4_21.ZD4;

public class Actor extends Person{

    private int cnt = 0;

    public Actor(String name) {
        this.name = name;
        this.id = cnt++;
    }

    @Override
    public void getInterview(String someString) {

    }

    @Override
    public String toString() {
        return "Actor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
