package Rok_1_22.ZD2;

public class Professor extends Person{

    private String phdIn;

    protected Professor(String name, String phdIn) {
        super(name);
        this.phdIn = phdIn;
    }

    @Override
    public void definePerson() {

    }

    @Override
    public String toString() {
        return "Professor{" +
                "phdIn='" + phdIn + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
