package Rok_1_21.ZD3;

public class Author {

    private int id;
    private static int cnt = 0;
    private String name;

    public Author(String name) {
        this.name = name;
        cnt+=1;
        this.id = cnt;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
