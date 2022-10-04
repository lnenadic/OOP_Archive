package Rok_2_21.ZD2;

public class PlushElectricDog extends Dog{

    public PlushElectricDog(String name, float years) {
        super(name, years);
    }

    @Override
    public void Bark() {
        System.out.println(getClass().getSimpleName() + " is barking loud...");
    }

    @Override
    public void training(int commands) {
        System.out.println("You can't train a toy!");
    }

    public void charge() {
        System.out.println("Put my batteries into a special charger.");
    }

}
