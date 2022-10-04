package Rok_2_21.ZD2;

public class ToyDog extends Dog{

    public ToyDog(String name, float years) {
        super(name, years);
    }

    @Override
    public void Bark() {
        System.out.println(getClass().getSimpleName() + " is barking loud...");
    }

    @Override
    public void training(int commands) {
        switch (commands) {
            case 0:
                System.out.println("For zero is stay on the spot.");
                break;
            case 1:
                System.out.println("For one is walk forward.");
                break;
            case 2:
                System.out.println("For two is walk backward.");
                break;
            case 3:
                System.out.println("For three is run.");
                break;
            case 4:
                System.out.println("For four is jump.");
                break;
            case 5:
                System.out.println("For five is sit.");
                break;
            default:
                System.out.println("Unknown command...");
                //break;
        }
    }

    public void charge() {
        System.out.println("Charging...");
    }

}
