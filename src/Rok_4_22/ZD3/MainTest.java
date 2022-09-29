package Rok_4_22.ZD3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

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
        rideAllBikes(bikes);
        HashSet<Bike> hashSet = new HashSet<>(bikes);
        //TreeSet<Bike> treeSet = new TreeSet<>();
        //treeSet.addAll(hashSet);
        saveBikesData(hashSet, "/Users/lovremacbookpro/Documents/OOP/OOP_Archive/src/Rok_4_22/ZD3/bikes.bin");
    }

    private static void rideAllBikes(Collection<Bike> bikes) {
        for (Bike b: bikes) {
            b.ride();
        }
    }

    private static void saveBikesData(Collection<Bike> bikes, String filename) {
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(bikes);
            oos.close();
            fos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
