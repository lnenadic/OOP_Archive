package Practice.LAB4;

public class Professor extends Person{

    private int yearsOfTeaching;

    public Professor(String name) {
        super(name);
    }

    @Override
    protected void provideSomeInfo() {
        toString();
    }

    public void setYearsOfTeaching(int yearsOfTeaching) {
        this.yearsOfTeaching = yearsOfTeaching;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "yearsOfTeaching=" + yearsOfTeaching +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
