package Rok_2_21.ZD2;

public class Main {
    public static void main(String[] args) {
        System.out.println("/// GoldRetriever ///");
        GoldenRetriever goldenRetriever = new GoldenRetriever("Bucko", 2);
        goldenRetriever.Bark();
        goldenRetriever.training(7);

        System.out.println("******************");

        System.out.println("/// PlushElectricDog ///");
        PlushElectricDog plushElectricDog = new PlushElectricDog("Misko", 3);
        plushElectricDog.Bark();
        plushElectricDog.training(1);
        plushElectricDog.charge();
    }
}
