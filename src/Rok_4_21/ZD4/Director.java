package Rok_4_21.ZD4;

public class Director extends Person{

    private int cnt = 0;

    public Director(String name) {
        this.name = name;
        this.id = cnt++;
    }

    @Override
    public void getInterview(String someString) {

    }

    @Override
    public String toString() {
        return "Director{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
