package Rok_2_21.ZD2;

public abstract class Dog {

    protected float years;
    protected String name;
    protected String breed;

    public Dog(String name, float years) {
        this.name = name;
        this.years = years;
    }

    public abstract void Bark();
    public abstract void training(int commands);

    public String getBreed() {
        return breed;
    }
}
