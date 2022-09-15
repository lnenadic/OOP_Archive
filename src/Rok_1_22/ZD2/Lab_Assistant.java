package Rok_1_22.ZD2;

public class Lab_Assistant extends Person{

    private String specialization;

    protected Lab_Assistant(String name, String specialization) {
        super(name);
        this.specialization = specialization;
    }

    @Override
    public void definePerson() {

    }

    @Override
    public String toString() {
        return "Lab_Assistant{" +
                "specialization='" + specialization + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
