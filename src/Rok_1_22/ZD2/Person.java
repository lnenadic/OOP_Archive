package Rok_1_22.ZD2;

public abstract class Person {

    protected int id;
    private static int cntID;
    protected String name;

    protected Person(String name) {
        this.name = name;
        id = cntID;
        cntID++;
    }

    public abstract void definePerson();

}
