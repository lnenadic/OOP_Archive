package Rok_4_22.ZD3;

import java.io.Serializable;

public abstract class Bike implements Serializable {

    protected String owner;

    public Bike(String owner) {
        this.owner = owner;
    }

    public abstract void ride();

    public void setOwner(String owner) {
        this.owner = owner;
    }

}
