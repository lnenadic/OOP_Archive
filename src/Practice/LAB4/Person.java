package Practice.LAB4;

public abstract class Person {

    protected int id;
    protected String name;
    private static int cntID = 1;

    protected Person(String name) {
        this.name = name;
        this.id = cntID;
        cntID++;
    }

    protected abstract void provideSomeInfo();

}
