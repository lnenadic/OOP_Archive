package Rok_4_22.ZD3;

import java.util.ArrayList;
import java.util.Collection;

public class MainTest {
    public static void main(String[] args) {
        OnRoadBike onRoadBike = new OnRoadBike("Lovre");
        ElectricBike electricBike = new ElectricBike("Luka");
        MotoBike motoBike = new MotoBike("Lucija");
        ArrayList<Bike> bikes = new ArrayList<>();
        bikes.add(onRoadBike);
        bikes.add(onRoadBike);
        bikes.add(electricBike);
        bikes.add(electricBike);
        bikes.add(motoBike);
        bikes.add(motoBike);

    }

    private void rideAllBikes(Collection<Bike> bikes) {

    }

    private void saveBikesData(Collection<Bike> bikes, String s) {

    }

}
