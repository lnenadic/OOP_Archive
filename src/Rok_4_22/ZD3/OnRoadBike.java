package Rok_4_22.ZD3;

public class OnRoadBike extends Bike implements PedalingCapacity {

    public OnRoadBike(String owner) {
        super(owner);
    }

    @Override
    public void ride() {
        System.out.println("Riding on bike type: " + getClass().getSimpleName());
    }

    @Override
    public void producePedalingPower() {
        System.out.println("Producing pedaling power for: " + getClass().getSimpleName());
    }

    @Override
    public void pedalingCadence() {
        System.out.println("Cadence for + " + getClass().getSimpleName());
    }
}
