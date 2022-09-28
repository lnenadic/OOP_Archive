package Rok_4_22.ZD3;

public abstract class Bike {

    protected String owner;

    public Bike(String owner) {
        this.owner = owner;
    }

    public abstract void ride();

    public void setOwner(String owner) {
        this.owner = owner;
    }

}
