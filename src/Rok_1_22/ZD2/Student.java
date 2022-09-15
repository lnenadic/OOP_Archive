package Rok_1_22.ZD2;

public class Student extends Person{

    private String study;

    protected Student(String name, String study) {
        super(name);
        this.study = study;
    }

    @Override
    public void definePerson() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "study='" + study + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
