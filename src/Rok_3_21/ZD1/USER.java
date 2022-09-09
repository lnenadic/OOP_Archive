package Rok_3_21.ZD1;

public class USER {

    private String name;
    public int id;
    private int cnt = 1;

    public USER(String name) {
        this.name = name;
        id = cnt;
        cnt++;
    }

    @Override
    public String toString() {
        return "USER{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
